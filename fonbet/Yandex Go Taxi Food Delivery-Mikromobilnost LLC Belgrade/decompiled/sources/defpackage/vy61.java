package defpackage;

/* loaded from: classes7.dex */
public final class vy61 implements w481 {
    public final on61 a;
    public final dl81 b = new dl81(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public vy61(on61 on61Var) {
        this.a = on61Var;
    }

    @Override // defpackage.w481
    public final void a(int i, dl81 dl81Var) {
        boolean z = (i & 1) != 0;
        int s = z ? dl81Var.b + dl81Var.s() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            dl81Var.m(s);
            this.d = 0;
        }
        while (true) {
            int i2 = dl81Var.c - dl81Var.b;
            if (i2 <= 0) {
                return;
            }
            int i3 = this.d;
            dl81 dl81Var2 = this.b;
            if (i3 < 3) {
                if (i3 == 0) {
                    int s2 = dl81Var.s();
                    dl81Var.m(dl81Var.b - 1);
                    if (s2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(dl81Var.c - dl81Var.b, 3 - this.d);
                dl81Var.d(this.d, min, dl81Var2.a);
                int i4 = this.d + min;
                this.d = i4;
                if (i4 == 3) {
                    dl81Var2.m(0);
                    dl81Var2.k(3);
                    dl81Var2.m(dl81Var2.b + 1);
                    int s3 = dl81Var2.s();
                    int s4 = dl81Var2.s();
                    this.e = (s3 & 128) != 0;
                    int i5 = (((s3 & 15) << 8) | s4) + 3;
                    this.c = i5;
                    byte[] bArr = dl81Var2.a;
                    if (bArr.length < i5) {
                        dl81Var2.c(Math.min(4098, Math.max(i5, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(i2, this.c - i3);
                dl81Var.d(this.d, min2, dl81Var2.a);
                int i6 = this.d + min2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.e) {
                        byte[] bArr2 = dl81Var2.a;
                        int i8 = -1;
                        for (int i9 = 0; i9 < i7; i9++) {
                            i8 = rf71.n[((i8 >>> 24) ^ (bArr2[i9] & 255)) & 255] ^ (i8 << 8);
                        }
                        int i10 = rf71.a;
                        if (i8 != 0) {
                            this.f = true;
                            return;
                        }
                        dl81Var2.k(this.c - 4);
                    } else {
                        dl81Var2.k(i7);
                    }
                    dl81Var2.m(0);
                    this.a.f(dl81Var2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.w481
    public final void g(lo61 lo61Var, yg71 yg71Var, xi11 xi11Var) {
        this.a.g(lo61Var, yg71Var, xi11Var);
        this.f = true;
    }

    @Override // defpackage.w481
    public final void a() {
        this.f = true;
    }
}
