package defpackage;

/* loaded from: classes.dex */
public final class yuf implements wtf, q2b {
    public final int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public long f;
    public int g;
    public long h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public Object m;
    public Object n;

    public yuf(long j, boolean z, wuf wufVar, utf utfVar, int i, int i2, gz2 gz2Var, hz2 hz2Var, boolean z2, int i3, int i4, long j2, fvf fvfVar) {
        this.d = z;
        this.k = utfVar;
        this.a = i;
        this.b = i2;
        this.l = gz2Var;
        this.m = hz2Var;
        this.e = z2;
        this.c = i3;
        this.g = i4;
        this.h = j2;
        this.n = fvfVar;
        this.i = wufVar;
        this.j = utfVar;
        this.f = ia6.b(z ? ga6.i(j) : Integer.MAX_VALUE, z ? Integer.MAX_VALUE : ga6.h(j), 5);
    }

    @Override // defpackage.wtf
    public vtf a(int i, int i2, long j, int i3) {
        return g(i, j);
    }

    @Override // defpackage.q2b
    public void b(d7k d7kVar) {
        d7k d7kVar2 = (d7k) this.i;
        vq1.B((azs) this.m);
        while (d7kVar.a() > 0) {
            int i = this.b;
            if (i == 0) {
                byte[] bArr = d7kVar.a;
                int i2 = d7kVar.b;
                int i3 = d7kVar.c;
                while (true) {
                    if (i2 >= i3) {
                        d7kVar.H(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.e && (b & 224) == 224;
                    this.e = z;
                    if (z2) {
                        d7kVar.H(i2 + 1);
                        this.e = false;
                        d7kVar2.a[1] = bArr[i2];
                        this.c = 2;
                        this.b = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                bgi bgiVar = (bgi) this.j;
                int min = Math.min(d7kVar.a(), 4 - this.c);
                d7kVar.f(d7kVar2.a, this.c, min);
                int i4 = this.c + min;
                this.c = i4;
                if (i4 >= 4) {
                    d7kVar2.H(0);
                    if (bgiVar.a(d7kVar2.h())) {
                        this.g = bgiVar.b;
                        if (!this.d) {
                            this.f = (bgiVar.f * 1000000) / bgiVar.c;
                            bsc bscVar = new bsc();
                            bscVar.a = (String) this.n;
                            bscVar.l = l5i.p((String) this.l);
                            bscVar.m = l5i.p((String) bgiVar.g);
                            bscVar.n = 4096;
                            bscVar.C = bgiVar.d;
                            bscVar.D = bgiVar.c;
                            bscVar.d = (String) this.k;
                            bscVar.f = this.a;
                            ((azs) this.m).d(new dsc(bscVar));
                            this.d = true;
                        }
                        d7kVar2.H(0);
                        ((azs) this.m).b(d7kVar2, 4, 0);
                        this.b = 2;
                    } else {
                        this.c = 0;
                        this.b = 1;
                    }
                }
            } else {
                if (i != 2) {
                    e7o.n();
                    return;
                }
                int min2 = Math.min(d7kVar.a(), this.g - this.c);
                ((azs) this.m).b(d7kVar, min2, 0);
                int i5 = this.c + min2;
                this.c = i5;
                if (i5 >= this.g) {
                    vq1.A(this.h != -9223372036854775807L);
                    ((azs) this.m).a(this.h, 1, this.g, 0, null);
                    this.h += this.f;
                    this.c = 0;
                    this.b = 0;
                }
            }
        }
    }

    @Override // defpackage.q2b
    public void c() {
        this.b = 0;
        this.c = 0;
        this.e = false;
        this.h = -9223372036854775807L;
    }

    @Override // defpackage.q2b
    public void e(t2c t2cVar, cp2 cp2Var) {
        cp2Var.g();
        cp2Var.i();
        this.n = (String) cp2Var.e;
        cp2Var.i();
        this.m = t2cVar.M(cp2Var.c, 1);
    }

    @Override // defpackage.q2b
    public void f(int i, long j) {
        this.h = j;
    }

    public cvf g(int i, long j) {
        wuf wufVar = (wuf) this.i;
        return new cvf(i, ((utf) this.j).a(i, j), this.d, (gz2) this.l, (hz2) this.m, ((utf) this.k).b.getLayoutDirection(), this.e, this.c, this.g, i == this.a + (-1) ? 0 : this.b, this.h, wufVar.e(i), wufVar.b.F(i), ((fvf) this.n).m, j);
    }

    @Override // defpackage.q2b
    public void d(boolean z) {
    }

    public yuf(String str, int i, String str2) {
        this.b = 0;
        d7k d7kVar = new d7k(4);
        this.i = d7kVar;
        d7kVar.a[0] = -1;
        this.j = new bgi();
        this.h = -9223372036854775807L;
        this.k = str;
        this.a = i;
        this.l = str2;
    }
}
