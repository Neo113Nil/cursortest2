package ru.CryptoPro.ssl;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
class cl_3 extends InputStream {
    public static final byte[] w = new byte[1024];
    public final SSLSocketImpl a;
    public final byte[] c = new byte[1];
    public final cl_69 b = new cl_69();

    public cl_3(SSLSocketImpl sSLSocketImpl) {
        this.a = sSLSocketImpl;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.a.U()) {
            return 0;
        }
        cl_69 cl_69Var = this.b;
        if (cl_69Var.x) {
            return cl_69Var.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.a.U()) {
            return -1;
        }
        while (this.b.available() == 0) {
            try {
                SSLSocketImpl sSLSocketImpl = this.a;
                cl_69 cl_69Var = this.b;
                if (sSLSocketImpl.a0() == 1) {
                    sSLSocketImpl.e0();
                }
                sSLSocketImpl.o(cl_69Var, true);
                if (this.a.U()) {
                    return -1;
                }
            } catch (Exception e) {
                this.a.k(e, true);
                throw null;
            }
        }
        return this.b.read(bArr, i, Math.min(i2, this.b.available()));
    }

    @Override // java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        long j2;
        j2 = 0;
        while (j > 0) {
            int read = read(w, 0, (int) Math.min(j, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
            if (read <= 0) {
                break;
            }
            long j3 = read;
            j -= j3;
            j2 += j3;
        }
        return j2;
    }

    @Override // java.io.InputStream
    public synchronized int read() throws IOException {
        if (read(this.c, 0, 1) <= 0) {
            return -1;
        }
        return this.c[0] & 255;
    }
}
