package defpackage;

/* loaded from: classes.dex */
public final class x8p implements gbt {
    public final w8p a;
    public final d7k b = new d7k(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public x8p(w8p w8pVar) {
        this.a = w8pVar;
    }

    @Override // defpackage.gbt
    public final void a(int i, d7k d7kVar) {
        boolean z = (i & 1) != 0;
        int v = z ? d7kVar.b + d7kVar.v() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            d7kVar.H(v);
            this.d = 0;
        }
        while (d7kVar.a() > 0) {
            int i2 = this.d;
            d7k d7kVar2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int v2 = d7kVar.v();
                    d7kVar.H(d7kVar.b - 1);
                    if (v2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(d7kVar.a(), 3 - this.d);
                d7kVar.f(d7kVar2.a, this.d, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    d7kVar2.H(0);
                    d7kVar2.G(3);
                    d7kVar2.I(1);
                    int v3 = d7kVar2.v();
                    int v4 = d7kVar2.v();
                    this.e = (v3 & 128) != 0;
                    int i4 = (((v3 & 15) << 8) | v4) + 3;
                    this.c = i4;
                    byte[] bArr = d7kVar2.a;
                    if (bArr.length < i4) {
                        d7kVar2.b(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(d7kVar.a(), this.c - this.d);
                d7kVar.f(d7kVar2.a, this.d, min2);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        d7kVar2.G(i6);
                    } else {
                        if (dvt.o(0, i6, -1, d7kVar2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        d7kVar2.G(this.c - 4);
                    }
                    d7kVar2.H(0);
                    this.a.b(d7kVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.gbt
    public final void c() {
        this.f = true;
    }

    @Override // defpackage.gbt
    public final void e(ojs ojsVar, t2c t2cVar, cp2 cp2Var) {
        this.a.e(ojsVar, t2cVar, cp2Var);
        this.f = true;
    }
}
