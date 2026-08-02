package D6;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public final class a extends InputStream {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f626v = 0;

    /* renamed from: n, reason: collision with root package name */
    public final RandomAccessFile f627n;

    /* renamed from: u, reason: collision with root package name */
    public final FileChannel f628u;

    public a(RandomAccessFile randomAccessFile, FileChannel fileChannel) {
        this.f627n = randomAccessFile;
        this.f628u = fileChannel;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f628u.close();
        this.f627n.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f627n.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.f627n.read(bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        return this.f627n.read(bArr, i, i4);
    }
}
