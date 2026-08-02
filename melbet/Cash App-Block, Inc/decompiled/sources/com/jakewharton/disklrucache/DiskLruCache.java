package com.jakewharton.disklrucache;

import androidx.loader.content.ModernAsyncTask$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Response;
import com.google.common.io.ByteStreams;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class DiskLruCache implements Closeable {
    public static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,64}");
    public static final ByteStreams.AnonymousClass1 NULL_OUTPUT_STREAM = new ByteStreams.AnonymousClass1(1);
    public final File directory;
    public final File journalFile;
    public final File journalFileBackup;
    public final File journalFileTmp;
    public BufferedWriter journalWriter;
    public int redundantOpCount;
    public long size = 0;
    public final LinkedHashMap lruEntries = new LinkedHashMap(0, 0.75f, true);
    public long nextSequenceNumber = 0;
    public final ThreadPoolExecutor executorService = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final ModernAsyncTask$1 cleanupCallable = new ModernAsyncTask$1(this, 10);
    public final int appVersion = 2;
    public final int valueCount = 2;
    public final long maxSize = 10485760;

    public final class Entry {
        public Response currentEditor;
        public final String key;
        public final long[] lengths;
        public boolean readable;

        public Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
        }

        public final File getCleanFile(int i) {
            return new File(DiskLruCache.this.directory, this.key + "." + i);
        }

        public final File getDirtyFile(int i) {
            return new File(DiskLruCache.this.directory, this.key + "." + i + ".tmp");
        }

        public final String getLengths() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.lengths) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    public final class Snapshot implements Closeable {
        public final InputStream[] ins;

        public Snapshot(InputStream[] inputStreamArr) {
            this.ins = inputStreamArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.ins) {
                Util.closeQuietly(inputStream);
            }
        }

        public final String getString() {
            InputStreamReader inputStreamReader = new InputStreamReader(this.ins[1], Util.UTF_8);
            try {
                StringWriter stringWriter = new StringWriter();
                char[] cArr = new char[1024];
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read == -1) {
                        String stringWriter2 = stringWriter.toString();
                        inputStreamReader.close();
                        return stringWriter2;
                    }
                    stringWriter.write(cArr, 0, read);
                }
            } catch (Throwable th) {
                inputStreamReader.close();
                throw th;
            }
        }
    }

    public DiskLruCache(File file) {
        this.directory = file;
        this.journalFile = new File(file, "journal");
        this.journalFileTmp = new File(file, "journal.tmp");
        this.journalFileBackup = new File(file, "journal.bkp");
    }

    public static void access$2200(DiskLruCache diskLruCache, Response response, boolean z) {
        synchronized (diskLruCache) {
            Entry entry = (Entry) response.result;
            if (entry.currentEditor != response) {
                throw new IllegalStateException();
            }
            if (z && !entry.readable) {
                for (int i = 0; i < diskLruCache.valueCount; i++) {
                    if (!((boolean[]) response.cacheEntry)[i]) {
                        response.abort();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!entry.getDirtyFile(i).exists()) {
                        response.abort();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < diskLruCache.valueCount; i2++) {
                File dirtyFile = entry.getDirtyFile(i2);
                if (!z) {
                    deleteIfExists(dirtyFile);
                } else if (dirtyFile.exists()) {
                    File cleanFile = entry.getCleanFile(i2);
                    dirtyFile.renameTo(cleanFile);
                    long j = entry.lengths[i2];
                    long length = cleanFile.length();
                    entry.lengths[i2] = length;
                    diskLruCache.size = (diskLruCache.size - j) + length;
                }
            }
            diskLruCache.redundantOpCount++;
            entry.currentEditor = null;
            if (entry.readable || z) {
                entry.readable = true;
                diskLruCache.journalWriter.write("CLEAN " + entry.key + entry.getLengths() + '\n');
                if (z) {
                    diskLruCache.nextSequenceNumber++;
                }
            } else {
                diskLruCache.lruEntries.remove(entry.key);
                diskLruCache.journalWriter.write("REMOVE " + entry.key + '\n');
            }
            diskLruCache.journalWriter.flush();
            if (diskLruCache.size > diskLruCache.maxSize || diskLruCache.journalRebuildRequired()) {
                diskLruCache.executorService.submit(diskLruCache.cleanupCallable);
            }
        }
    }

    public static void deleteIfExists(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static DiskLruCache open(File file) {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                renameTo(file2, file3, false);
            }
        }
        DiskLruCache diskLruCache = new DiskLruCache(file);
        File file4 = diskLruCache.journalFile;
        if (file4.exists()) {
            try {
                diskLruCache.readJournal();
                diskLruCache.processJournal();
                diskLruCache.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file4, true), Util.US_ASCII));
                return diskLruCache;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                diskLruCache.close();
                Util.deleteContents(diskLruCache.directory);
            }
        }
        file.mkdirs();
        DiskLruCache diskLruCache2 = new DiskLruCache(file);
        diskLruCache2.rebuildJournal();
        return diskLruCache2;
    }

    public static void renameTo(File file, File file2, boolean z) {
        if (z) {
            deleteIfExists(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.matcher(str).matches()) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("keys must match regex [a-z0-9_-]{1,64}: \"", str, "\""));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.journalWriter == null) {
                return;
            }
            Iterator it = new ArrayList(this.lruEntries.values()).iterator();
            while (it.hasNext()) {
                Response response = ((Entry) it.next()).currentEditor;
                if (response != null) {
                    response.abort();
                }
            }
            trimToSize();
            this.journalWriter.close();
            this.journalWriter = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Response edit(String str) {
        synchronized (this) {
            try {
                if (this.journalWriter == null) {
                    throw new IllegalStateException("cache is closed");
                }
                validateKey(str);
                Entry entry = (Entry) this.lruEntries.get(str);
                if (entry == null) {
                    entry = new Entry(str);
                    this.lruEntries.put(str, entry);
                } else if (entry.currentEditor != null) {
                    return null;
                }
                Response response = new Response(this, entry);
                entry.currentEditor = response;
                this.journalWriter.write("DIRTY " + str + '\n');
                this.journalWriter.flush();
                return response;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Snapshot get(String str) {
        InputStream inputStream;
        if (this.journalWriter == null) {
            throw new IllegalStateException("cache is closed");
        }
        validateKey(str);
        Entry entry = (Entry) this.lruEntries.get(str);
        if (entry == null) {
            return null;
        }
        if (!entry.readable) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.valueCount];
        for (int i = 0; i < this.valueCount; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(entry.getCleanFile(i));
            } catch (FileNotFoundException unused) {
                for (int i2 = 0; i2 < this.valueCount && (inputStream = inputStreamArr[i2]) != null; i2++) {
                    Util.closeQuietly(inputStream);
                }
                return null;
            }
        }
        this.redundantOpCount++;
        this.journalWriter.append((CharSequence) ("READ " + str + '\n'));
        if (journalRebuildRequired()) {
            this.executorService.submit(this.cleanupCallable);
        }
        return new Snapshot(inputStreamArr);
    }

    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    public final void processJournal() {
        deleteIfExists(this.journalFileTmp);
        Iterator it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            Response response = entry.currentEditor;
            int i = this.valueCount;
            int i2 = 0;
            if (response == null) {
                while (i2 < i) {
                    this.size += entry.lengths[i2];
                    i2++;
                }
            } else {
                entry.currentEditor = null;
                while (i2 < i) {
                    deleteIfExists(entry.getCleanFile(i2));
                    deleteIfExists(entry.getDirtyFile(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void readJournal() {
        int i = 0;
        StrictLineReader strictLineReader = new StrictLineReader(new FileInputStream(this.journalFile), Util.US_ASCII, 0);
        try {
            String readLine = strictLineReader.readLine();
            String readLine2 = strictLineReader.readLine();
            String readLine3 = strictLineReader.readLine();
            String readLine4 = strictLineReader.readLine();
            String readLine5 = strictLineReader.readLine();
            if (!"libcore.io.DiskLruCache".equals(readLine) || !"1".equals(readLine2) || !Integer.toString(this.appVersion).equals(readLine3) || !Integer.toString(this.valueCount).equals(readLine4) || !"".equals(readLine5)) {
                throw new IOException("unexpected journal header: [" + readLine + ", " + readLine2 + ", " + readLine4 + ", " + readLine5 + "]");
            }
            while (true) {
                try {
                    readJournalLine(strictLineReader.readLine());
                    i++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i - this.lruEntries.size();
                    Util.closeQuietly(strictLineReader);
                    return;
                }
            }
        } catch (Throwable th) {
            Util.closeQuietly(strictLineReader);
            throw th;
        }
    }

    public final void readJournalLine(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            a$$ExternalSyntheticBUOutline0.m$4("unexpected journal line: ".concat(str));
            return;
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.lruEntries;
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        Entry entry = (Entry) linkedHashMap.get(substring);
        if (entry == null) {
            entry = new Entry(substring);
            linkedHashMap.put(substring, entry);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                entry.currentEditor = new Response(this, entry);
                return;
            } else {
                if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$4("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        entry.readable = true;
        entry.currentEditor = null;
        if (split.length != DiskLruCache.this.valueCount) {
            a$$ExternalSyntheticBUOutline0.m$4(Arrays.toString(split), "unexpected journal line: ");
            return;
        }
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                entry.lengths[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException unused) {
                a$$ExternalSyntheticBUOutline0.m$4(Arrays.toString(split), "unexpected journal line: ");
                return;
            }
        }
    }

    public final synchronized void rebuildJournal() {
        try {
            BufferedWriter bufferedWriter = this.journalWriter;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFileTmp), Util.US_ASCII));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.appVersion));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.valueCount));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (Entry entry : this.lruEntries.values()) {
                    if (entry.currentEditor != null) {
                        bufferedWriter2.write("DIRTY " + entry.key + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + entry.key + entry.getLengths() + '\n');
                    }
                }
                bufferedWriter2.close();
                if (this.journalFile.exists()) {
                    renameTo(this.journalFile, this.journalFileBackup, true);
                }
                renameTo(this.journalFileTmp, this.journalFile, false);
                this.journalFileBackup.delete();
                this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), Util.US_ASCII));
            } catch (Throwable th) {
                bufferedWriter2.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void remove(String str) {
        try {
            if (this.journalWriter == null) {
                throw new IllegalStateException("cache is closed");
            }
            validateKey(str);
            Entry entry = (Entry) this.lruEntries.get(str);
            if (entry != null && entry.currentEditor == null) {
                for (int i = 0; i < this.valueCount; i++) {
                    File cleanFile = entry.getCleanFile(i);
                    if (cleanFile.exists() && !cleanFile.delete()) {
                        throw new IOException("failed to delete " + cleanFile);
                    }
                    long j = this.size;
                    long[] jArr = entry.lengths;
                    this.size = j - jArr[i];
                    jArr[i] = 0;
                }
                this.redundantOpCount++;
                this.journalWriter.append((CharSequence) ("REMOVE " + str + '\n'));
                this.lruEntries.remove(str);
                if (journalRebuildRequired()) {
                    this.executorService.submit(this.cleanupCallable);
                }
            }
        } finally {
        }
    }

    public final void trimToSize() {
        while (this.size > this.maxSize) {
            remove((String) ((Map.Entry) this.lruEntries.entrySet().iterator().next()).getKey());
        }
    }
}
