package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.dag.Provider;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class FileStore {
    public final Provider delegate;
    public final Logger logger;
    public final int maxStoreCount;
    public final File storageDir;
    public final ReentrantLock lock = new ReentrantLock();
    public final ConcurrentSkipListSet queuedFiles = new ConcurrentSkipListSet();

    /* loaded from: classes4.dex */
    public final class FileWithTimestamp implements Comparable {
        public final File file;
        public final long timestamp;

        public FileWithTimestamp(File file, long j) {
            this.file = file;
            this.timestamp = j;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return Intrinsics.compare(this.timestamp, ((FileWithTimestamp) obj).timestamp);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileWithTimestamp)) {
                return false;
            }
            FileWithTimestamp fileWithTimestamp = (FileWithTimestamp) obj;
            return this.file.equals(fileWithTimestamp.file) && this.timestamp == fileWithTimestamp.timestamp;
        }

        public final File getFile() {
            return this.file;
        }

        public final int hashCode() {
            return Long.hashCode(this.timestamp) + (this.file.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FileWithTimestamp(file=");
            sb.append(this.file);
            sb.append(", timestamp=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.timestamp, ')');
        }
    }

    public FileStore(File file, int i, Logger logger, Provider provider) {
        this.storageDir = file;
        this.maxStoreCount = i;
        this.logger = logger;
        this.delegate = provider;
    }

    public final void cancelQueuedFiles(Collection collection) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        if (collection != null) {
            try {
                this.queuedFiles.removeAll(collection);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void deleteStoredFiles(Collection collection) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        if (collection != null) {
            try {
                this.queuedFiles.removeAll(collection);
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    File file = (File) it.next();
                    if (!file.delete()) {
                        file.deleteOnExit();
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void discardOldestFileIfNeeded() {
        File[] listFiles;
        File file = this.storageDir;
        if (isStorageDirValid(file) && (listFiles = file.listFiles()) != null) {
            int length = listFiles.length;
            int i = this.maxStoreCount;
            if (length < i) {
                return;
            }
            ArrayList arrayList = new ArrayList(listFiles.length);
            int i2 = 0;
            for (File file2 : listFiles) {
                arrayList.add(new FileWithTimestamp(file2, file2.lastModified()));
            }
            CollectionsKt__MutableCollectionsJVMKt.sort(arrayList);
            int length2 = (listFiles.length - i) + 1;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file3 = ((FileWithTimestamp) it.next()).getFile();
                if (i2 == length2) {
                    return;
                }
                if (!this.queuedFiles.contains(file3)) {
                    getLogger().w("Discarding oldest error as stored error limit reached: '" + file3.getPath() + '\'');
                    deleteStoredFiles(SetsKt__SetsJVMKt.setOf(file3));
                    i2++;
                }
            }
        }
    }

    public final ArrayList findStoredFiles() {
        File[] listFiles;
        File file = this.storageDir;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            boolean isStorageDirValid = isStorageDirValid(file);
            ConcurrentSkipListSet concurrentSkipListSet = this.queuedFiles;
            if (isStorageDirValid && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.length() == 0) {
                        if (!file2.delete()) {
                            file2.deleteOnExit();
                        }
                    } else if (file2.isFile() && !concurrentSkipListSet.contains(file2)) {
                        arrayList.add(file2);
                    }
                }
            }
            concurrentSkipListSet.addAll(arrayList);
            reentrantLock.unlock();
            return arrayList;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public abstract String getFilename(JsonStream.Streamable streamable);

    public Logger getLogger() {
        return this.logger;
    }

    public final boolean isStorageDirValid(File file) {
        try {
            file.mkdirs();
            return true;
        } catch (Exception e) {
            getLogger().e("Could not prepare file storage directory", e);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final String write(JsonStream.Streamable streamable) {
        JsonStream jsonStream;
        InternalReportDelegate internalReportDelegate;
        File file = this.storageDir;
        ?? r3 = 0;
        if (isStorageDirValid(file) && this.maxStoreCount != 0) {
            discardOldestFileIfNeeded();
            String filename = getFilename(streamable);
            String absolutePath = new File(file, filename).getAbsolutePath();
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                try {
                    jsonStream = new JsonStream(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePath), "UTF-8")));
                    try {
                        jsonStream.value(streamable);
                        getLogger().i("Saved unsent payload to disk: '" + absolutePath + '\'');
                        IOUtils.closeQuietly(jsonStream);
                        reentrantLock.unlock();
                        return absolutePath;
                    } catch (FileNotFoundException e) {
                        e = e;
                        getLogger().w("Ignoring FileNotFoundException - unable to create file", e);
                        IOUtils.closeQuietly(jsonStream);
                        reentrantLock.unlock();
                        return null;
                    } catch (Exception e2) {
                        e = e2;
                        File file2 = new File(absolutePath);
                        Provider provider = this.delegate;
                        if (provider != null && (internalReportDelegate = (InternalReportDelegate) provider.getOrNull()) != null) {
                            internalReportDelegate.onErrorIOFailure(e, file2, "Crash report serialization");
                        }
                        IOUtils.deleteFile(file2, getLogger());
                        IOUtils.closeQuietly(jsonStream);
                        reentrantLock.unlock();
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    r3 = filename;
                    IOUtils.closeQuietly(r3);
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (FileNotFoundException e3) {
                e = e3;
                jsonStream = null;
            } catch (Exception e4) {
                e = e4;
                jsonStream = null;
            } catch (Throwable th2) {
                th = th2;
                IOUtils.closeQuietly(r3);
                reentrantLock.unlock();
                throw th;
            }
        }
        return null;
    }
}
