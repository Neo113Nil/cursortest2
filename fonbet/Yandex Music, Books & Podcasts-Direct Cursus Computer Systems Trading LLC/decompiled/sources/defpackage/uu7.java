package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class uu7 extends r5g {
    public static final byte[] e = new byte[0];
    public final int c;
    public int d;

    public uu7(InputStream inputStream, int i, int i2) {
        super(i2, inputStream);
        if (i <= 0) {
            if (i < 0) {
                xq0.x("negative lengths not allowed");
                throw null;
            }
            a();
        }
        this.c = i;
        this.d = i;
    }

    public final byte[] b() {
        int i = this.d;
        if (i == 0) {
            return e;
        }
        int i2 = this.b;
        if (i >= i2) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.d + " >= " + i2);
        }
        byte[] bArr = new byte[i];
        int C = i - zdg.C(this.a, bArr, i);
        this.d = C;
        if (C == 0) {
            a();
            return bArr;
        }
        wb8.g(this.c, this.d);
        return null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, Math.min(i2, i3));
        if (read < 0) {
            wb8.g(this.c, this.d);
            return 0;
        }
        int i4 = this.d - read;
        this.d = i4;
        if (i4 == 0) {
            a();
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.d == 0) {
            return -1;
        }
        int read = this.a.read();
        if (read >= 0) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                a();
            }
            return read;
        }
        wb8.g(this.c, this.d);
        return 0;
    }
}
