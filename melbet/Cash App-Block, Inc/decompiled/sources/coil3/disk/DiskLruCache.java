package coil3.disk;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.xg$$ExternalSyntheticLambda9;
import coil3.util.FileSystemsKt;
import com.android.volley.Response;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.RealBufferedSink;
import okio.RealBufferedSource;

/* loaded from: classes3.dex */
public final class DiskLruCache implements AutoCloseable {
    public static final Regex LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");
    public final ContextScope cleanupScope;
    public boolean closed;
    public final Path directory;
    public final DiskLruCache$fileSystem$1 fileSystem;
    public boolean hasJournalErrors;
    public boolean initialized;
    public final Path journalFile;
    public final Path journalFileBackup;
    public final Path journalFileTmp;
    public RealBufferedSink journalWriter;
    public final Object lock;
    public final LinkedHashMap lruEntries;
    public final long maxSize;
    public boolean mostRecentRebuildFailed;
    public boolean mostRecentTrimFailed;
    public int operationsSinceRewrite;
    public long size;

    public final class Entry {
        public Response currentEditor;
        public final String key;
        public int lockingSnapshotCount;
        public boolean readable;
        public boolean zombie;
        public final long[] lengths = new long[2];
        public final ArrayList cleanFiles = new ArrayList(2);
        public final ArrayList dirtyFiles = new ArrayList(2);

        public Entry(String str) {
            this.key = str;
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < 2; i++) {
                sb.append(i);
                this.cleanFiles.add(DiskLruCache.this.directory.resolve(sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(DiskLruCache.this.directory.resolve(sb.toString()));
                sb.setLength(length);
            }
        }

        public final Snapshot snapshot() {
            if (!this.readable || this.currentEditor != null || this.zombie) {
                return null;
            }
            ArrayList arrayList = this.cleanFiles;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (i >= size) {
                    this.lockingSnapshotCount++;
                    return diskLruCache.new Snapshot(this);
                }
                if (!diskLruCache.fileSystem.exists((Path) arrayList.get(i))) {
                    try {
                        diskLruCache.removeEntry(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i++;
            }
        }
    }

    public final class Snapshot implements AutoCloseable {
        public boolean closed;
        public final Entry entry;

        public Snapshot(Entry entry) {
            this.entry = entry;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache.lock) {
                Entry entry = this.entry;
                int i = entry.lockingSnapshotCount - 1;
                entry.lockingSnapshotCount = i;
                if (i == 0 && entry.zombie) {
                    diskLruCache.removeEntry(entry);
                }
            }
        }
    }

    public DiskLruCache(FileSystem fileSystem, Path path, CoroutineContext coroutineContext, long j) {
        this.directory = path;
        this.maxSize = j;
        if (j <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("maxSize <= 0");
            throw null;
        }
        this.journalFile = path.resolve("journal");
        this.journalFileTmp = path.resolve("journal.tmp");
        this.journalFileBackup = path.resolve("journal.bkp");
        this.lruEntries = new LinkedHashMap(0, 0.75f, true);
        CoroutineContext plus = coroutineContext.plus(JobKt.SupervisorJob$default());
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) coroutineContext.get(CoroutineDispatcher.Key);
        if (coroutineDispatcher == null) {
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            coroutineDispatcher = DefaultIoScheduler.INSTANCE;
        }
        this.cleanupScope = JobKt.CoroutineScope(plus.plus(coroutineDispatcher.limitedParallelism(1)));
        this.lock = new Object();
        this.fileSystem = new DiskLruCache$fileSystem$1(fileSystem);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x010f, code lost:
    
        if ((r10.operationsSinceRewrite >= 2000) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108 A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:17:0x0032, B:27:0x0040, B:30:0x005a, B:31:0x0069, B:33:0x0079, B:35:0x0080, B:38:0x005e, B:40:0x00a0, B:42:0x00a7, B:45:0x00ac, B:47:0x00bd, B:50:0x00c2, B:51:0x00fd, B:53:0x0108, B:59:0x0111, B:60:0x00da, B:62:0x00ef, B:64:0x00fa, B:67:0x0090, B:69:0x0116, B:70:0x011d), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$completeEdit(DiskLruCache diskLruCache, Response response, boolean z) {
        synchronized (diskLruCache.lock) {
            Entry entry = (Entry) response.result;
            if (!Intrinsics.areEqual(entry.currentEditor, response)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || entry.zombie) {
                for (int i = 0; i < 2; i++) {
                    diskLruCache.fileSystem.delete((Path) entry.dirtyFiles.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((boolean[]) response.cacheEntry)[i2] && !diskLruCache.fileSystem.exists((Path) entry.dirtyFiles.get(i2))) {
                        response.complete(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    Path path = (Path) entry.dirtyFiles.get(i3);
                    Path path2 = (Path) entry.cleanFiles.get(i3);
                    boolean exists = diskLruCache.fileSystem.exists(path);
                    DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = diskLruCache.fileSystem;
                    if (exists) {
                        diskLruCache$fileSystem$1.atomicMove(path, path2);
                    } else {
                        FileSystemsKt.createFile$default(diskLruCache$fileSystem$1, (Path) entry.cleanFiles.get(i3));
                    }
                    long j = entry.lengths[i3];
                    Long l = (Long) diskLruCache.fileSystem.metadata(path2).size;
                    long longValue = l != null ? l.longValue() : 0L;
                    entry.lengths[i3] = longValue;
                    diskLruCache.size = (diskLruCache.size - j) + longValue;
                }
            }
            entry.currentEditor = null;
            if (entry.zombie) {
                diskLruCache.removeEntry(entry);
                return;
            }
            diskLruCache.operationsSinceRewrite++;
            RealBufferedSink realBufferedSink = diskLruCache.journalWriter;
            realBufferedSink.getClass();
            if (!z && !entry.readable) {
                diskLruCache.lruEntries.remove(entry.key);
                realBufferedSink.writeUtf8("REMOVE");
                realBufferedSink.writeByte(32);
                realBufferedSink.writeUtf8(entry.key);
                realBufferedSink.writeByte(10);
                realBufferedSink.flush();
                if (diskLruCache.size <= diskLruCache.maxSize) {
                }
                diskLruCache.launchCleanup();
            }
            entry.readable = true;
            realBufferedSink.writeUtf8("CLEAN");
            realBufferedSink.writeByte(32);
            realBufferedSink.writeUtf8(entry.key);
            for (long j2 : entry.lengths) {
                realBufferedSink.writeByte(32);
                realBufferedSink.writeDecimalLong(j2);
            }
            realBufferedSink.writeByte(10);
            realBufferedSink.flush();
            if (diskLruCache.size <= diskLruCache.maxSize) {
            }
            diskLruCache.launchCleanup();
        }
    }

    public static void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.matches(str)) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.lock) {
            try {
                if (this.initialized && !this.closed) {
                    for (Entry entry : (Entry[]) this.lruEntries.values().toArray(new Entry[0])) {
                        Response response = entry.currentEditor;
                        if (response != null) {
                            Entry entry2 = (Entry) response.result;
                            if (Intrinsics.areEqual(entry2.currentEditor, response)) {
                                entry2.zombie = true;
                            }
                        }
                    }
                    trimToSize();
                    JobKt.cancel(this.cleanupScope, (CancellationException) null);
                    RealBufferedSink realBufferedSink = this.journalWriter;
                    realBufferedSink.getClass();
                    realBufferedSink.close();
                    this.journalWriter = null;
                    this.closed = true;
                    return;
                }
                this.closed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Response edit(String str) {
        synchronized (this.lock) {
            if (this.closed) {
                throw new IllegalStateException("cache is closed");
            }
            validateKey(str);
            initialize();
            Entry entry = (Entry) this.lruEntries.get(str);
            if ((entry != null ? entry.currentEditor : null) != null) {
                return null;
            }
            if (entry != null && entry.lockingSnapshotCount != 0) {
                return null;
            }
            if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
                RealBufferedSink realBufferedSink = this.journalWriter;
                realBufferedSink.getClass();
                realBufferedSink.writeUtf8("DIRTY");
                realBufferedSink.writeByte(32);
                realBufferedSink.writeUtf8(str);
                realBufferedSink.writeByte(10);
                realBufferedSink.flush();
                if (this.hasJournalErrors) {
                    return null;
                }
                if (entry == null) {
                    entry = new Entry(str);
                    this.lruEntries.put(str, entry);
                }
                Response response = new Response(this, entry);
                entry.currentEditor = response;
                return response;
            }
            launchCleanup();
            return null;
        }
    }

    public final Snapshot get(String str) {
        Snapshot snapshot;
        synchronized (this.lock) {
            if (this.closed) {
                throw new IllegalStateException("cache is closed");
            }
            validateKey(str);
            initialize();
            Entry entry = (Entry) this.lruEntries.get(str);
            if (entry != null && (snapshot = entry.snapshot()) != null) {
                boolean z = true;
                this.operationsSinceRewrite++;
                RealBufferedSink realBufferedSink = this.journalWriter;
                realBufferedSink.getClass();
                realBufferedSink.writeUtf8("READ");
                realBufferedSink.writeByte(32);
                realBufferedSink.writeUtf8(str);
                realBufferedSink.writeByte(10);
                realBufferedSink.flush();
                if (this.operationsSinceRewrite < 2000) {
                    z = false;
                }
                if (z) {
                    launchCleanup();
                }
                return snapshot;
            }
            return null;
        }
    }

    public final void initialize() {
        synchronized (this.lock) {
            try {
                if (this.initialized) {
                    return;
                }
                this.fileSystem.delete(this.journalFileTmp);
                if (this.fileSystem.exists(this.journalFileBackup)) {
                    boolean exists = this.fileSystem.exists(this.journalFile);
                    DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.fileSystem;
                    Path path = this.journalFileBackup;
                    if (exists) {
                        diskLruCache$fileSystem$1.delete(path);
                    } else {
                        diskLruCache$fileSystem$1.atomicMove(path, this.journalFile);
                    }
                }
                if (this.fileSystem.exists(this.journalFile)) {
                    try {
                        readJournal();
                        processJournal();
                        this.initialized = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            FileSystemsKt.deleteContents(this.fileSystem, this.directory);
                            this.closed = false;
                        } catch (Throwable th) {
                            this.closed = false;
                            throw th;
                        }
                    }
                }
                writeJournal();
                this.initialized = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void launchCleanup() {
        JobKt.launch$default(this.cleanupScope, null, null, new DiskLruCache$launchCleanup$1(this, (Continuation) null, 0), 3);
    }

    public final void processJournal() {
        Iterator it = this.lruEntries.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            int i = 0;
            if (entry.currentEditor == null) {
                while (i < 2) {
                    j += entry.lengths[i];
                    i++;
                }
            } else {
                entry.currentEditor = null;
                while (i < 2) {
                    Path path = (Path) entry.cleanFiles.get(i);
                    DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.fileSystem;
                    diskLruCache$fileSystem$1.delete(path);
                    diskLruCache$fileSystem$1.delete((Path) entry.dirtyFiles.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.size = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void readJournal() {
        DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.fileSystem;
        Path path = this.journalFile;
        RealBufferedSource buffer = Okio.buffer(diskLruCache$fileSystem$1.source(path));
        try {
            String readUtf8LineStrict = buffer.readUtf8LineStrict(Long.MAX_VALUE);
            String readUtf8LineStrict2 = buffer.readUtf8LineStrict(Long.MAX_VALUE);
            String readUtf8LineStrict3 = buffer.readUtf8LineStrict(Long.MAX_VALUE);
            String readUtf8LineStrict4 = buffer.readUtf8LineStrict(Long.MAX_VALUE);
            String readUtf8LineStrict5 = buffer.readUtf8LineStrict(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(readUtf8LineStrict) || !"1".equals(readUtf8LineStrict2) || !Intrinsics.areEqual(String.valueOf(3), readUtf8LineStrict3) || !Intrinsics.areEqual(String.valueOf(2), readUtf8LineStrict4) || readUtf8LineStrict5.length() > 0) {
                throw new IOException("unexpected journal header: [" + readUtf8LineStrict + ", " + readUtf8LineStrict2 + ", " + readUtf8LineStrict3 + ", " + readUtf8LineStrict4 + ", " + readUtf8LineStrict5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    readJournalLine(buffer.readUtf8LineStrict(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.operationsSinceRewrite = i - this.lruEntries.size();
                    if (buffer.exhausted()) {
                        diskLruCache$fileSystem$1.getClass();
                        path.getClass();
                        this.journalWriter = new RealBufferedSink(new FaultHidingSink(diskLruCache$fileSystem$1.appendingSink(path), new xg$$ExternalSyntheticLambda9(this, 12)));
                    } else {
                        writeJournal();
                    }
                    try {
                        buffer.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th == null) {
                        throw th;
                    }
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                buffer.close();
            } catch (Throwable th3) {
                ExceptionsKt__ExceptionsKt.addSuppressed(th, th3);
            }
            if (th == null) {
            }
        }
    }

    public final void readJournalLine(String str) {
        String substring;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6);
        if (indexOf$default == -1) {
            a$$ExternalSyntheticBUOutline0.m$4("unexpected journal line: ".concat(str));
            return;
        }
        int i = indexOf$default + 1;
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ' ', i, false, 4);
        LinkedHashMap linkedHashMap = this.lruEntries;
        if (indexOf$default2 == -1) {
            substring = str.substring(i);
            if (indexOf$default == 6 && StringsKt__StringsJVMKt.startsWith(str, "REMOVE", false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf$default2);
        }
        Object obj = linkedHashMap.get(substring);
        if (obj == null) {
            obj = new Entry(substring);
            linkedHashMap.put(substring, obj);
        }
        Entry entry = (Entry) obj;
        if (indexOf$default2 == -1 || indexOf$default != 5 || !StringsKt__StringsJVMKt.startsWith(str, "CLEAN", false)) {
            if (indexOf$default2 == -1 && indexOf$default == 5 && StringsKt__StringsJVMKt.startsWith(str, "DIRTY", false)) {
                entry.currentEditor = new Response(this, entry);
                return;
            } else {
                if (indexOf$default2 == -1 && indexOf$default == 4 && StringsKt__StringsJVMKt.startsWith(str, "READ", false)) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$4("unexpected journal line: ".concat(str));
                return;
            }
        }
        List split$default = StringsKt.split$default(str.substring(indexOf$default2 + 1), new char[]{' '}, 6);
        entry.readable = true;
        entry.currentEditor = null;
        if (split$default.size() != 2) {
            a$$ExternalSyntheticBUOutline0.m$3(split$default, "unexpected journal line: ");
            return;
        }
        try {
            int size = split$default.size();
            for (int i2 = 0; i2 < size; i2++) {
                entry.lengths[i2] = Long.parseLong((String) split$default.get(i2));
            }
        } catch (NumberFormatException unused) {
            a$$ExternalSyntheticBUOutline0.m$3(split$default, "unexpected journal line: ");
        }
    }

    public final void removeEntry(Entry entry) {
        RealBufferedSink realBufferedSink;
        int i = entry.lockingSnapshotCount;
        String str = entry.key;
        if (i > 0 && (realBufferedSink = this.journalWriter) != null) {
            realBufferedSink.writeUtf8("DIRTY");
            realBufferedSink.writeByte(32);
            realBufferedSink.writeUtf8(str);
            realBufferedSink.writeByte(10);
            realBufferedSink.flush();
        }
        if (entry.lockingSnapshotCount > 0 || entry.currentEditor != null) {
            entry.zombie = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.fileSystem.delete((Path) entry.cleanFiles.get(i2));
            long j = this.size;
            long[] jArr = entry.lengths;
            this.size = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.operationsSinceRewrite++;
        RealBufferedSink realBufferedSink2 = this.journalWriter;
        if (realBufferedSink2 != null) {
            realBufferedSink2.writeUtf8("REMOVE");
            realBufferedSink2.writeByte(32);
            realBufferedSink2.writeUtf8(str);
            realBufferedSink2.writeByte(10);
            realBufferedSink2.flush();
        }
        this.lruEntries.remove(str);
        if (this.operationsSinceRewrite >= 2000) {
            launchCleanup();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        removeEntry(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void trimToSize() {
        while (this.size > this.maxSize) {
            for (Entry entry : this.lruEntries.values()) {
                if (!entry.zombie) {
                    break;
                }
            }
            return;
        }
        this.mostRecentTrimFailed = false;
    }

    public final void writeJournal() {
        Throwable th;
        synchronized (this.lock) {
            try {
                RealBufferedSink realBufferedSink = this.journalWriter;
                if (realBufferedSink != null) {
                    realBufferedSink.close();
                }
                RealBufferedSink buffer = Okio.buffer(this.fileSystem.sink(this.journalFileTmp, false));
                try {
                    buffer.writeUtf8("libcore.io.DiskLruCache");
                    buffer.writeByte(10);
                    buffer.writeUtf8("1");
                    buffer.writeByte(10);
                    buffer.writeDecimalLong(3L);
                    buffer.writeByte(10);
                    buffer.writeDecimalLong(2L);
                    buffer.writeByte(10);
                    buffer.writeByte(10);
                    for (Entry entry : this.lruEntries.values()) {
                        if (entry.currentEditor != null) {
                            buffer.writeUtf8("DIRTY");
                            buffer.writeByte(32);
                            buffer.writeUtf8(entry.key);
                            buffer.writeByte(10);
                        } else {
                            buffer.writeUtf8("CLEAN");
                            buffer.writeByte(32);
                            buffer.writeUtf8(entry.key);
                            for (long j : entry.lengths) {
                                buffer.writeByte(32);
                                buffer.writeDecimalLong(j);
                            }
                            buffer.writeByte(10);
                        }
                    }
                    try {
                        buffer.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        buffer.close();
                    } catch (Throwable th4) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(th3, th4);
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                boolean exists = this.fileSystem.exists(this.journalFile);
                DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.fileSystem;
                if (exists) {
                    diskLruCache$fileSystem$1.atomicMove(this.journalFile, this.journalFileBackup);
                    this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    diskLruCache$fileSystem$1.atomicMove(this.journalFileTmp, this.journalFile);
                }
                DiskLruCache$fileSystem$1 diskLruCache$fileSystem$12 = this.fileSystem;
                Path path = this.journalFile;
                diskLruCache$fileSystem$12.getClass();
                path.getClass();
                this.journalWriter = new RealBufferedSink(new FaultHidingSink(diskLruCache$fileSystem$12.appendingSink(path), new xg$$ExternalSyntheticLambda9(this, 12)));
                this.operationsSinceRewrite = 0;
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }
}
