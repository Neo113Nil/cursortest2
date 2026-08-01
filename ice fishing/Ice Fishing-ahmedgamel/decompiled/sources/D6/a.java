package D6;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public final class a extends InputStream {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f646v = 0;

    /* renamed from: n, reason: collision with root package name */
    public final RandomAccessFile f647n;

    /* renamed from: u, reason: collision with root package name */
    public final FileChannel f648u;

    public a(RandomAccessFile randomAccessFile, FileChannel fileChannel) {
        this.f647n = randomAccessFile;
        this.f648u = fileChannel;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f648u.close();
        this.f647n.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f647n.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.f647n.read(bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i6) {
        return this.f647n.read(bArr, i, i6);
    }
}
