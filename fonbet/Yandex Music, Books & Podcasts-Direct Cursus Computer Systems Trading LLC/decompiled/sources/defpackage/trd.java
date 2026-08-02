package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public final class trd implements q2b {
    public final sfm a;
    public String b;
    public azs c;
    public srd d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final csb g = new csb(32);
    public final csb h = new csb(33);
    public final csb i = new csb(34);
    public final csb j = new csb(39);
    public final csb k = new csb(40);
    public long m = -9223372036854775807L;
    public final d7k n = new d7k();

    public trd(sfm sfmVar) {
        this.a = sfmVar;
    }

    public final void a(long j, long j2, int i, int i2) {
        sj sjVar = (sj) this.a.c;
        srd srdVar = this.d;
        boolean z = this.e;
        if (srdVar.j && srdVar.g) {
            srdVar.m = srdVar.c;
            srdVar.j = false;
        } else if (srdVar.h || srdVar.g) {
            if (z && srdVar.i) {
                srdVar.a(i + ((int) (j - srdVar.b)));
            }
            srdVar.k = srdVar.b;
            srdVar.l = srdVar.e;
            srdVar.m = srdVar.c;
            srdVar.i = true;
        }
        if (!this.e) {
            csb csbVar = this.g;
            csbVar.d(i2);
            csb csbVar2 = this.h;
            csbVar2.d(i2);
            csb csbVar3 = this.i;
            csbVar3.d(i2);
            if (csbVar.e && csbVar2.e && csbVar3.e) {
                String str = this.b;
                int i3 = csbVar.c;
                byte[] bArr = new byte[csbVar2.c + i3 + csbVar3.c];
                System.arraycopy((byte[]) csbVar.f, 0, bArr, 0, i3);
                System.arraycopy((byte[]) csbVar2.f, 0, bArr, csbVar.c, csbVar2.c);
                System.arraycopy((byte[]) csbVar3.f, 0, bArr, csbVar.c + csbVar2.c, csbVar3.c);
                hwi S = zc4.S((byte[]) csbVar2.f, 3, csbVar2.c, null);
                fwi fwiVar = S.b;
                String b = fwiVar != null ? ir4.b(fwiVar.a, fwiVar.b, fwiVar.c, fwiVar.d, fwiVar.e, fwiVar.f) : null;
                bsc bscVar = new bsc();
                bscVar.a = str;
                bscVar.l = l5i.p("video/mp2t");
                bscVar.m = l5i.p("video/hevc");
                bscVar.j = b;
                bscVar.t = S.e;
                bscVar.u = S.f;
                bscVar.A = new q85(S.i, S.j, S.k, S.c + 8, S.d + 8, null);
                bscVar.x = S.g;
                bscVar.o = S.h;
                bscVar.B = S.a + 1;
                bscVar.p = Collections.singletonList(bArr);
                dsc dscVar = new dsc(bscVar);
                this.c.d(dscVar);
                int i4 = dscVar.p;
                o2g.V(i4 != -1);
                sjVar.getClass();
                vq1.A(i4 >= 0);
                sjVar.a = i4;
                sjVar.h(i4);
                this.e = true;
            }
        }
        csb csbVar4 = this.j;
        boolean d = csbVar4.d(i2);
        d7k d7kVar = this.n;
        if (d) {
            d7kVar.F(zc4.d0(csbVar4.c, (byte[]) csbVar4.f), (byte[]) csbVar4.f);
            d7kVar.I(5);
            sjVar.a(j2, d7kVar);
        }
        csb csbVar5 = this.k;
        if (csbVar5.d(i2)) {
            d7kVar.F(zc4.d0(csbVar5.c, (byte[]) csbVar5.f), (byte[]) csbVar5.f);
            d7kVar.I(5);
            sjVar.a(j2, d7kVar);
        }
    }

    @Override // defpackage.q2b
    public final void b(d7k d7kVar) {
        int i;
        trd trdVar = this;
        vq1.B(trdVar.c);
        int i2 = dvt.a;
        while (d7kVar.a() > 0) {
            int i3 = d7kVar.b;
            int i4 = d7kVar.c;
            byte[] bArr = d7kVar.a;
            trdVar.l += d7kVar.a();
            trdVar.c.b(d7kVar, d7kVar.a(), 0);
            while (i3 < i4) {
                int z = zc4.z(bArr, i3, i4, trdVar.f);
                if (z == i4) {
                    trdVar.g(bArr, i3, i4);
                    return;
                }
                int i5 = (bArr[z + 3] & 126) >> 1;
                if (z <= 0 || bArr[z - 1] != 0) {
                    i = 3;
                } else {
                    z--;
                    i = 4;
                }
                int i6 = z;
                int i7 = i;
                int i8 = i6 - i3;
                if (i8 > 0) {
                    trdVar.g(bArr, i3, i6);
                }
                int i9 = i4 - i6;
                long j = trdVar.l - i9;
                trdVar.a(j, trdVar.m, i9, i8 < 0 ? -i8 : 0);
                trdVar.h(j, trdVar.m, i9, i5);
                i3 = i6 + i7;
                trdVar = this;
            }
            trdVar = this;
        }
    }

    @Override // defpackage.q2b
    public final void c() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        zc4.t(this.f);
        this.g.f();
        this.h.f();
        this.i.f();
        this.j.f();
        this.k.f();
        ((sj) this.a.c).h(0);
        srd srdVar = this.d;
        if (srdVar != null) {
            srdVar.f = false;
            srdVar.g = false;
            srdVar.h = false;
            srdVar.i = false;
            srdVar.j = false;
        }
    }

    @Override // defpackage.q2b
    public final void d(boolean z) {
        vq1.B(this.c);
        int i = dvt.a;
        if (z) {
            ((sj) this.a.c).h(0);
            a(this.l, this.m, 0, 0);
            h(this.l, this.m, 0, 48);
        }
    }

    @Override // defpackage.q2b
    public final void e(t2c t2cVar, cp2 cp2Var) {
        cp2Var.g();
        cp2Var.i();
        this.b = (String) cp2Var.e;
        cp2Var.i();
        azs M = t2cVar.M(cp2Var.c, 2);
        this.c = M;
        this.d = new srd(M);
        this.a.n(t2cVar, cp2Var);
    }

    @Override // defpackage.q2b
    public final void f(int i, long j) {
        this.m = j;
    }

    public final void g(byte[] bArr, int i, int i2) {
        srd srdVar = this.d;
        if (srdVar.f) {
            int i3 = srdVar.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                srdVar.g = (bArr[i4] & 128) != 0;
                srdVar.f = false;
            } else {
                srdVar.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    public final void h(long j, long j2, int i, int i2) {
        srd srdVar = this.d;
        boolean z = this.e;
        srdVar.g = false;
        srdVar.h = false;
        srdVar.e = j2;
        srdVar.d = 0;
        srdVar.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (srdVar.i && !srdVar.j) {
                if (z) {
                    srdVar.a(i);
                }
                srdVar.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                srdVar.h = !srdVar.j;
                srdVar.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        srdVar.c = z2;
        srdVar.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.g(i2);
            this.h.g(i2);
            this.i.g(i2);
        }
        this.j.g(i2);
        this.k.g(i2);
    }
}
