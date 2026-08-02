package coil3.decode;

import coil3.decode.ImageSource;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSource;

/* loaded from: classes3.dex */
public final class FileImageSource implements ImageSource {
    public final AutoCloseable closeable;
    public final String diskCacheKey;
    public final Path file;
    public final FileSystem fileSystem;
    public boolean isClosed;
    public final Object lock = new Object();
    public RealBufferedSource source;

    public FileImageSource(Path path, FileSystem fileSystem, String str, AutoCloseable autoCloseable) {
        this.file = path;
        this.fileSystem = fileSystem;
        this.diskCacheKey = str;
        this.closeable = autoCloseable;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.lock) {
            this.isClosed = true;
            RealBufferedSource realBufferedSource = this.source;
            if (realBufferedSource != null) {
                try {
                    realBufferedSource.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
            AutoCloseable autoCloseable = this.closeable;
            if (autoCloseable != null) {
                try {
                    JsonLogicResult$Success$$ExternalSyntheticOutline0.m(autoCloseable);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused2) {
                }
            }
        }
    }

    @Override // coil3.decode.ImageSource
    public final Path fileOrNull() {
        Path path;
        synchronized (this.lock) {
            if (this.isClosed) {
                throw new IllegalStateException("closed");
            }
            path = this.file;
        }
        return path;
    }

    public final String getDiskCacheKey$coil_core() {
        return this.diskCacheKey;
    }

    @Override // coil3.decode.ImageSource
    public final FileSystem getFileSystem() {
        return this.fileSystem;
    }

    @Override // coil3.decode.ImageSource
    public final ImageSource.Metadata getMetadata() {
        return null;
    }

    @Override // coil3.decode.ImageSource
    public final BufferedSource source() {
        synchronized (this.lock) {
            if (this.isClosed) {
                throw new IllegalStateException("closed");
            }
            RealBufferedSource realBufferedSource = this.source;
            if (realBufferedSource != null) {
                return realBufferedSource;
            }
            RealBufferedSource buffer = Okio.buffer(this.fileSystem.source(this.file));
            this.source = buffer;
            return buffer;
        }
    }
}
