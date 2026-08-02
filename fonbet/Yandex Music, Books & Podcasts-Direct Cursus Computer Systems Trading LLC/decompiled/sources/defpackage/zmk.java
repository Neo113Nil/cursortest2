package defpackage;

/* loaded from: classes.dex */
public final class zmk implements gbt {
    public final q2b a;
    public final v94 b = new v94(new byte[10], 10);
    public int c = 0;
    public int d;
    public ojs e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public zmk(q2b q2bVar) {
        this.a = q2bVar;
    }

    @Override // defpackage.gbt
    public final void a(int i, d7k d7kVar) {
        vq1.B(this.e);
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        q2b q2bVar = this.a;
        if (i2 != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    vq1.n0("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        e7o.n();
                        return;
                    }
                    if (this.j != -1) {
                        vq1.n0("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    q2bVar.d(d7kVar.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i6 = i;
        while (d7kVar.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                v94 v94Var = this.b;
                if (i7 != 1) {
                    if (i7 == i4) {
                        if (b(d7kVar, v94Var.b, Math.min(10, this.i)) && b(d7kVar, null, this.i)) {
                            v94Var.q(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                v94Var.t(4);
                                v94Var.t(1);
                                v94Var.t(1);
                                long i8 = (v94Var.i(15) << 15) | (v94Var.i(3) << 30) | v94Var.i(15);
                                v94Var.t(1);
                                if (!this.h && this.g) {
                                    v94Var.t(4);
                                    v94Var.t(1);
                                    v94Var.t(1);
                                    v94Var.t(1);
                                    this.e.b((v94Var.i(3) << 30) | (v94Var.i(15) << 15) | v94Var.i(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(i8);
                            }
                            i6 |= this.k ? 4 : 0;
                            q2bVar.f(i6, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i7 != 3) {
                            e7o.n();
                            return;
                        }
                        int a = d7kVar.a();
                        int i9 = this.j;
                        int i10 = i9 == i3 ? 0 : a - i9;
                        if (i10 > 0) {
                            a -= i10;
                            d7kVar.G(d7kVar.b + a);
                        }
                        q2bVar.b(d7kVar);
                        int i11 = this.j;
                        if (i11 != i3) {
                            int i12 = i11 - a;
                            this.j = i12;
                            if (i12 == 0) {
                                q2bVar.d(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (b(d7kVar, v94Var.b, 9)) {
                    this.c = d() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                d7kVar.I(d7kVar.a());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    public final boolean b(d7k d7kVar, byte[] bArr, int i) {
        int min = Math.min(d7kVar.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            d7kVar.I(min);
        } else {
            d7kVar.f(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    @Override // defpackage.gbt
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }

    public final boolean d() {
        v94 v94Var = this.b;
        v94Var.q(0);
        int i = v94Var.i(24);
        if (i != 1) {
            dfi.o(i, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        v94Var.t(8);
        int i2 = v94Var.i(16);
        v94Var.t(5);
        this.k = v94Var.h();
        v94Var.t(2);
        this.f = v94Var.h();
        this.g = v94Var.h();
        v94Var.t(6);
        int i3 = v94Var.i(8);
        this.i = i3;
        if (i2 == 0) {
            this.j = -1;
            return true;
        }
        int i4 = (i2 - 3) - i3;
        this.j = i4;
        if (i4 < 0) {
            vq1.n0("PesReader", "Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }

    @Override // defpackage.gbt
    public final void e(ojs ojsVar, t2c t2cVar, cp2 cp2Var) {
        this.e = ojsVar;
        this.a.e(t2cVar, cp2Var);
    }
}
