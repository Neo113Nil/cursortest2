package defpackage;

/* loaded from: classes9.dex */
public final class t7q0 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public t7q0 f;
    public t7q0 g;

    public t7q0() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final t7q0 a() {
        t7q0 t7q0Var = this.f;
        t7q0 t7q0Var2 = t7q0Var != this ? t7q0Var : null;
        t7q0 t7q0Var3 = this.g;
        t7q0Var3.f = t7q0Var;
        this.f.g = t7q0Var3;
        this.f = null;
        this.g = null;
        return t7q0Var2;
    }

    public final void b(t7q0 t7q0Var) {
        t7q0Var.g = this;
        t7q0Var.f = this.f;
        this.f.g = t7q0Var;
        this.f = t7q0Var;
    }

    public final t7q0 c() {
        this.d = true;
        return new t7q0(this.a, this.b, this.c, true, false);
    }

    public final void d(t7q0 t7q0Var, int i) {
        byte[] bArr = t7q0Var.a;
        if (!t7q0Var.e) {
            ny61.r("only owner can write");
            return;
        }
        int i2 = t7q0Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (t7q0Var.d) {
                w511.q();
                return;
            }
            int i4 = t7q0Var.b;
            if (i3 - i4 > 8192) {
                w511.q();
                return;
            } else {
                f73.i(bArr, bArr, i4, i2);
                t7q0Var.c -= t7q0Var.b;
                t7q0Var.b = 0;
            }
        }
        int i5 = t7q0Var.c;
        int i6 = this.b;
        f73.e(this.a, i5, i6, bArr, i6 + i);
        t7q0Var.c += i;
        this.b += i;
    }

    public t7q0(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
