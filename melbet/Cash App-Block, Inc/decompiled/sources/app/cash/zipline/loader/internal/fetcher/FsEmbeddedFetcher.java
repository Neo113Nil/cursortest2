package app.cash.zipline.loader.internal.fetcher;

import app.cash.zipline.EventListener;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSource;

/* loaded from: classes3.dex */
public final class FsEmbeddedFetcher implements Fetcher {
    public final Path embeddedDir;
    public final FileSystem embeddedFileSystem;

    public FsEmbeddedFetcher(FileSystem fileSystem, Path path) {
        fileSystem.getClass();
        path.getClass();
        this.embeddedFileSystem = fileSystem;
        this.embeddedDir = path;
    }

    @Override // app.cash.zipline.loader.internal.fetcher.Fetcher
    public final Object fetch(String str, EventListener eventListener, String str2, ByteString byteString, long j, String str3, String str4, ContinuationImpl continuationImpl) {
        return fetchByteString(this.embeddedDir.resolve(byteString.hex()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final ByteString fetchByteString(Path path) {
        ?? r4;
        FileSystem fileSystem = this.embeddedFileSystem;
        ByteString th = null;
        if (!fileSystem.exists(path)) {
            return null;
        }
        RealBufferedSource buffer = Okio.buffer(fileSystem.source(path));
        try {
            ByteString readByteString = buffer.readByteString();
            try {
                buffer.close();
            } catch (Throwable th2) {
                th = th2;
            }
            ByteString byteString = th;
            th = readByteString;
            r4 = byteString;
        } catch (Throwable th3) {
            try {
                buffer.close();
                r4 = th3;
            } catch (Throwable th4) {
                ExceptionsKt__ExceptionsKt.addSuppressed(th3, th4);
                r4 = th3;
            }
        }
        if (r4 == 0) {
            return th;
        }
        throw r4;
    }
}
