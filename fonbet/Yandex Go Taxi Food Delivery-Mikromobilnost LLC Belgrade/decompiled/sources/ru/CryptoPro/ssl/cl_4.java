package ru.CryptoPro.ssl;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
class cl_4 extends OutputStream {
    public final SSLSocketImpl a;
    public final byte[] c = new byte[1];
    public final cl_82 b = new cl_82((byte) 23);

    public cl_4(SSLSocketImpl sSLSocketImpl) {
        this.a = sSLSocketImpl;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (bArr == null) {
                throw new NullPointerException();
            }
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            if (i2 == 0) {
                return;
            }
            this.a.W();
            boolean z = true;
            do {
                if (z) {
                    try {
                        this.a.R();
                    } catch (Exception e) {
                        this.a.k(e, true);
                        throw null;
                    }
                }
                int min = Math.min(i2, this.b.B());
                if (z && min != 0) {
                    z = false;
                }
                if (min > 0) {
                    this.b.write(bArr, i, min);
                    i += min;
                    i2 -= min;
                }
                this.a.w(this.b);
                this.a.W();
            } while (i2 > 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) throws IOException {
        byte[] bArr = this.c;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }
}
