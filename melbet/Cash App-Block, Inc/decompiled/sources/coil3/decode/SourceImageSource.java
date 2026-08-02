package coil3.decode;

import coil3.decode.ImageSource;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;

/* loaded from: classes3.dex */
public final class SourceImageSource implements ImageSource {
    public final FileSystem fileSystem;
    public boolean isClosed;
    public final Object lock = new Object();
    public final ImageSource.Metadata metadata;
    public final BufferedSource source;

    public SourceImageSource(BufferedSource bufferedSource, FileSystem fileSystem, ImageSource.Metadata metadata) {
        this.fileSystem = fileSystem;
        this.metadata = metadata;
        this.source = bufferedSource;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.lock) {
            this.isClosed = true;
            BufferedSource bufferedSource = this.source;
            if (bufferedSource != null) {
                try {
                    bufferedSource.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // coil3.decode.ImageSource
    public final Path fileOrNull() {
        synchronized (this.lock) {
            if (this.isClosed) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // coil3.decode.ImageSource
    public final FileSystem getFileSystem() {
        return this.fileSystem;
    }

    @Override // coil3.decode.ImageSource
    public final ImageSource.Metadata getMetadata() {
        return this.metadata;
    }

    @Override // coil3.decode.ImageSource
    public final BufferedSource source() {
        BufferedSource bufferedSource;
        synchronized (this.lock) {
            try {
                if (this.isClosed) {
                    throw new IllegalStateException("closed");
                }
                bufferedSource = this.source;
                if (bufferedSource == null) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bufferedSource;
    }
}
