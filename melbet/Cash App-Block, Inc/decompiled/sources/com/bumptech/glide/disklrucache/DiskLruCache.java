package com.bumptech.glide.disklrucache;

import android.os.StrictMode;
import androidx.loader.content.ModernAsyncTask$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Response;
import com.google.android.gms.tasks.zzb;
import com.jakewharton.disklrucache.StrictLineReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class DiskLruCache implements Closeable {
    public final File directory;
    public final File journalFile;
    public final File journalFileBackup;
    public final File journalFileTmp;
    public BufferedWriter journalWriter;
    public final long maxSize;
    public int redundantOpCount;
    public long size = 0;
    public final LinkedHashMap lruEntries = new LinkedHashMap(0, 0.75f, true);
    public long nextSequenceNumber = 0;
    public final ThreadPoolExecutor executorService = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DiskLruCacheThreadFactory());
    public final ModernAsyncTask$1 cleanupCallable = new ModernAsyncTask$1(this, 2);
    public final int appVersion = 1;
    public final int valueCount = 1;

    public final class DiskLruCacheThreadFactory implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class Entry {
        public final File[] cleanFiles;
        public Response currentEditor;
        public final File[] dirtyFiles;
        public final String key;
        public final long[] lengths;
        public boolean readable;

        public Entry(String str) {
            this.key = str;
            int i = DiskLruCache.this.valueCount;
            File file = DiskLruCache.this.directory;
            this.lengths = new long[i];
            this.cleanFiles = new File[i];
            this.dirtyFiles = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.cleanFiles[i2] = new File(file, sb.toString());
                sb.append(".tmp");
                this.dirtyFiles[i2] = new File(file, sb.toString());
                sb.setLength(length);
            }
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

    public DiskLruCache(File file, long j) {
        this.directory = file;
        this.journalFile = new File(file, "journal");
        this.journalFileTmp = new File(file, "journal.tmp");
        this.journalFileBackup = new File(file, "journal.bkp");
        this.maxSize = j;
    }

    public static void access$2100(DiskLruCache diskLruCache, Response response, boolean z) {
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
                    if (!entry.dirtyFiles[i].exists()) {
                        response.abort();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < diskLruCache.valueCount; i2++) {
                File file = entry.dirtyFiles[i2];
                if (!z) {
                    deleteIfExists(file);
                } else if (file.exists()) {
                    File file2 = entry.cleanFiles[i2];
                    file.renameTo(file2);
                    long j = entry.lengths[i2];
                    long length = file2.length();
                    entry.lengths[i2] = length;
                    diskLruCache.size = (diskLruCache.size - j) + length;
                }
            }
            diskLruCache.redundantOpCount++;
            entry.currentEditor = null;
            if (entry.readable || z) {
                entry.readable = true;
                diskLruCache.journalWriter.append((CharSequence) "CLEAN");
                diskLruCache.journalWriter.append(' ');
                diskLruCache.journalWriter.append((CharSequence) entry.key);
                diskLruCache.journalWriter.append((CharSequence) entry.getLengths());
                diskLruCache.journalWriter.append('\n');
                if (z) {
                    diskLruCache.nextSequenceNumber++;
                }
            } else {
                diskLruCache.lruEntries.remove(entry.key);
                diskLruCache.journalWriter.append((CharSequence) "REMOVE");
                diskLruCache.journalWriter.append(' ');
                diskLruCache.journalWriter.append((CharSequence) entry.key);
                diskLruCache.journalWriter.append('\n');
            }
            flushWriter(diskLruCache.journalWriter);
            if (diskLruCache.size > diskLruCache.maxSize || diskLruCache.journalRebuildRequired()) {
                diskLruCache.executorService.submit(diskLruCache.cleanupCallable);
            }
        }
    }

    public static void closeWriter(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void deleteIfExists(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void flushWriter(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static DiskLruCache open(File file, long j) {
        if (j <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("maxSize <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                renameTo(file2, file3, false);
            }
        }
        DiskLruCache diskLruCache = new DiskLruCache(file, j);
        if (diskLruCache.journalFile.exists()) {
            try {
                diskLruCache.readJournal();
                diskLruCache.processJournal();
                return diskLruCache;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                diskLruCache.close();
                Util.deleteContents(diskLruCache.directory);
            }
        }
        file.mkdirs();
        DiskLruCache diskLruCache2 = new DiskLruCache(file, j);
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
            closeWriter(this.journalWriter);
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
                Entry entry = (Entry) this.lruEntries.get(str);
                if (entry == null) {
                    entry = new Entry(str);
                    this.lruEntries.put(str, entry);
                } else if (entry.currentEditor != null) {
                    return null;
                }
                Response response = new Response(this, entry);
                entry.currentEditor = response;
                this.journalWriter.append((CharSequence) "DIRTY");
                this.journalWriter.append(' ');
                this.journalWriter.append((CharSequence) str);
                this.journalWriter.append('\n');
                flushWriter(this.journalWriter);
                return response;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized zzb get(String str) {
        if (this.journalWriter == null) {
            throw new IllegalStateException("cache is closed");
        }
        Entry entry = (Entry) this.lruEntries.get(str);
        if (entry == null) {
            return null;
        }
        if (!entry.readable) {
            return null;
        }
        for (File file : entry.cleanFiles) {
            if (!file.exists()) {
                return null;
            }
        }
        this.redundantOpCount++;
        this.journalWriter.append((CharSequence) "READ");
        this.journalWriter.append(' ');
        this.journalWriter.append((CharSequence) str);
        this.journalWriter.append('\n');
        if (journalRebuildRequired()) {
            this.executorService.submit(this.cleanupCallable);
        }
        return new zzb(entry.cleanFiles, 2);
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
                    deleteIfExists(entry.cleanFiles[i2]);
                    deleteIfExists(entry.dirtyFiles[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void readJournal() {
        File file = this.journalFile;
        StrictLineReader strictLineReader = new StrictLineReader(new FileInputStream(file), Util.US_ASCII, 1);
        try {
            String readLine = strictLineReader.readLine();
            String readLine2 = strictLineReader.readLine();
            String readLine3 = strictLineReader.readLine();
            String readLine4 = strictLineReader.readLine();
            String readLine5 = strictLineReader.readLine();
            if (!"libcore.io.DiskLruCache".equals(readLine) || !"1".equals(readLine2) || !Integer.toString(this.appVersion).equals(readLine3) || !Integer.toString(this.valueCount).equals(readLine4) || !"".equals(readLine5)) {
                throw new IOException("unexpected journal header: [" + readLine + ", " + readLine2 + ", " + readLine4 + ", " + readLine5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    readJournalLine(strictLineReader.readLine());
                    i++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i - this.lruEntries.size();
                    if (strictLineReader.end == -1) {
                        rebuildJournal();
                    } else {
                        this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), Util.US_ASCII));
                    }
                    try {
                        strictLineReader.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                strictLineReader.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
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
                closeWriter(bufferedWriter);
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
                closeWriter(bufferedWriter2);
                if (this.journalFile.exists()) {
                    renameTo(this.journalFile, this.journalFileBackup, true);
                }
                renameTo(this.journalFileTmp, this.journalFile, false);
                this.journalFileBackup.delete();
                this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), Util.US_ASCII));
            } catch (Throwable th) {
                closeWriter(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void trimToSize() {
        while (this.size > this.maxSize) {
            String str = (String) ((Map.Entry) this.lruEntries.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.journalWriter == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    Entry entry = (Entry) this.lruEntries.get(str);
                    if (entry != null && entry.currentEditor == null) {
                        for (int i = 0; i < this.valueCount; i++) {
                            File file = entry.cleanFiles[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.size;
                            long[] jArr = entry.lengths;
                            this.size = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.redundantOpCount++;
                        this.journalWriter.append((CharSequence) "REMOVE");
                        this.journalWriter.append(' ');
                        this.journalWriter.append((CharSequence) str);
                        this.journalWriter.append('\n');
                        this.lruEntries.remove(str);
                        if (journalRebuildRequired()) {
                            this.executorService.submit(this.cleanupCallable);
                        }
                    }
                } finally {
                }
            }
        }
    }
}
