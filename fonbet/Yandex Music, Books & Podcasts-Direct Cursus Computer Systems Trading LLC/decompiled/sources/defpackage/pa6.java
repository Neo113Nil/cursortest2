package defpackage;

import java.io.InputStream;

/* loaded from: classes5.dex */
public final class pa6 extends InputStream {
    public final x0 a;
    public boolean b = true;
    public InputStream c;

    public pa6(x0 x0Var) {
        this.a = x0Var;
    }

    public final p0 a() {
        x0 x0Var = this.a;
        int read = ((r5g) x0Var.c).read();
        d0 H = read < 0 ? null : x0Var.H(read);
        if (H == null) {
            return null;
        }
        if (H instanceof p0) {
            return (p0) H;
        }
        xla.h(H.getClass(), "unknown object encountered: ");
        return null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        p0 a;
        int i3 = 0;
        if (this.c == null) {
            if (!this.b || (a = a()) == null) {
                return -1;
            }
            this.b = false;
            this.c = a.a();
        }
        while (true) {
            int read = this.c.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                p0 a2 = a();
                if (a2 == null) {
                    this.c = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.c = a2.a();
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        p0 a;
        if (this.c == null) {
            if (!this.b || (a = a()) == null) {
                return -1;
            }
            this.b = false;
            this.c = a.a();
        }
        while (true) {
            int read = this.c.read();
            if (read >= 0) {
                return read;
            }
            p0 a2 = a();
            if (a2 == null) {
                this.c = null;
                return -1;
            }
            this.c = a2.a();
        }
    }
}
