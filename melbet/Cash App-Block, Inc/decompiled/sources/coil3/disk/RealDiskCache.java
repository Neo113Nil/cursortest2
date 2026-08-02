package coil3.disk;

import coil3.disk.DiskLruCache;
import kotlin.coroutines.EmptyCoroutineContext;
import okio.FileSystem;
import okio.Path;

/* loaded from: classes3.dex */
public final class RealDiskCache {
    public final DiskLruCache cache;
    public final FileSystem fileSystem;

    public final class RealSnapshot implements AutoCloseable {
        public final DiskLruCache.Snapshot snapshot;

        public RealSnapshot(DiskLruCache.Snapshot snapshot) {
            this.snapshot = snapshot;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.snapshot.close();
        }
    }

    public RealDiskCache(long j, Path path, FileSystem fileSystem, EmptyCoroutineContext emptyCoroutineContext) {
        this.fileSystem = fileSystem;
        this.cache = new DiskLruCache(fileSystem, path, emptyCoroutineContext, j);
    }
}
