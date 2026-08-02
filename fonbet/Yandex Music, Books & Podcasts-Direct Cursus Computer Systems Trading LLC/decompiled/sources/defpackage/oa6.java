package defpackage;

import java.io.InputStream;

/* loaded from: classes5.dex */
public final class oa6 extends InputStream {
    public final x0 a;
    public boolean b = true;
    public int c = 0;
    public a0 d;
    public InputStream e;

    public oa6(x0 x0Var) {
        this.a = x0Var;
    }

    public final a0 a() {
        x0 x0Var = this.a;
        int read = ((r5g) x0Var.c).read();
        d0 H = read < 0 ? null : x0Var.H(read);
        if (H == null) {
            return null;
        }
        if (!(H instanceof a0)) {
            xla.h(H.getClass(), "unknown object encountered: ");
            return null;
        }
        if (this.c == 0) {
            return (a0) H;
        }
        kac.f("only the last nested bitstring can have padding");
        return null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (this.e == null) {
            if (!this.b) {
                return -1;
            }
            a0 a = a();
            this.d = a;
            if (a == null) {
                return -1;
            }
            this.b = false;
            this.e = a.q();
        }
        while (true) {
            int read = this.e.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this.c = this.d.g();
                a0 a2 = a();
                this.d = a2;
                if (a2 == null) {
                    this.e = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.e = a2.q();
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.e == null) {
            if (this.b) {
                a0 a = a();
                this.d = a;
                if (a != null) {
                    this.b = false;
                    this.e = a.q();
                }
            }
            return -1;
        }
        while (true) {
            int read = this.e.read();
            if (read >= 0) {
                return read;
            }
            this.c = this.d.g();
            a0 a2 = a();
            this.d = a2;
            if (a2 == null) {
                this.e = null;
                return -1;
            }
            this.e = a2.q();
        }
    }
}
