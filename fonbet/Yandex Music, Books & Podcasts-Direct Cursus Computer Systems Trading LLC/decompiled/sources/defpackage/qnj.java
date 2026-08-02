package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class qnj implements r2c {
    public t2c a;
    public rjr b;
    public boolean c;

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        rjr rjrVar = this.b;
        if (rjrVar != null) {
            snj snjVar = rjrVar.a;
            tnj tnjVar = snjVar.a;
            tnjVar.a = 0;
            tnjVar.b = 0L;
            tnjVar.c = 0;
            tnjVar.d = 0;
            tnjVar.e = 0;
            snjVar.b.E(0);
            snjVar.c = -1;
            snjVar.e = false;
            if (j == 0) {
                rjrVar.d(!rjrVar.l);
                return;
            }
            if (rjrVar.h != 0) {
                long j3 = (rjrVar.i * j2) / 1000000;
                rjrVar.e = j3;
                unj unjVar = rjrVar.d;
                int i = dvt.a;
                unjVar.g(j3);
                rjrVar.h = 2;
            }
        }
    }

    public final boolean c(s2c s2cVar) {
        boolean z;
        tnj tnjVar = new tnj();
        if (tnjVar.a(s2cVar, true) && (tnjVar.a & 2) == 2) {
            int min = Math.min(tnjVar.e, 8);
            d7k d7kVar = new d7k(min);
            s2cVar.A(d7kVar.a, 0, min);
            d7kVar.H(0);
            if (d7kVar.a() >= 5 && d7kVar.v() == 127 && d7kVar.x() == 1179402563) {
                this.b = new ugc();
                return true;
            }
            d7kVar.H(0);
            try {
                z = szf.w0(1, d7kVar, true);
            } catch (r7k unused) {
                z = false;
            }
            if (z) {
                this.b = new lju();
            } else {
                d7kVar.H(0);
                if (twj.e(d7kVar, twj.o)) {
                    this.b = new twj();
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        try {
            return c(s2cVar);
        } catch (r7k unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0172  */
    @Override // defpackage.r2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(s2c s2cVar, ci0 ci0Var) {
        int i;
        d7k d7kVar;
        byte[] bArr;
        vq1.B(this.a);
        if (this.b == null) {
            if (!c(s2cVar)) {
                throw r7k.a(null, "Failed to determine bitstream type");
            }
            s2cVar.n();
        }
        if (!this.c) {
            azs M = this.a.M(0, 1);
            this.a.K();
            rjr rjrVar = this.b;
            rjrVar.c = this.a;
            rjrVar.b = M;
            rjrVar.d(true);
            this.c = true;
        }
        rjr rjrVar2 = this.b;
        snj snjVar = rjrVar2.a;
        vq1.B(rjrVar2.b);
        int i2 = dvt.a;
        int i3 = rjrVar2.h;
        long j = -1;
        if (i3 != 0) {
            if (i3 == 1) {
                s2cVar.y((int) rjrVar2.f);
                rjrVar2.h = 2;
                return 0;
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    return -1;
                }
                e7o.n();
                return 0;
            }
            long c = rjrVar2.d.c(s2cVar);
            if (c >= 0) {
                ci0Var.a = c;
                return 1;
            }
            if (c < -1) {
                rjrVar2.a(-(c + 2));
            }
            if (!rjrVar2.l) {
                fap e = rjrVar2.d.e();
                vq1.B(e);
                rjrVar2.c.E(e);
                azs azsVar = rjrVar2.b;
                e.k();
                azsVar.getClass();
                rjrVar2.l = true;
            }
            if (rjrVar2.k <= 0 && !snjVar.b(s2cVar)) {
                rjrVar2.h = 3;
                return -1;
            }
            rjrVar2.k = 0L;
            d7k d7kVar2 = snjVar.b;
            long b = rjrVar2.b(d7kVar2);
            if (b >= 0) {
                long j2 = rjrVar2.g;
                if (j2 + b >= rjrVar2.e) {
                    rjrVar2.b.b(d7kVar2, d7kVar2.c, 0);
                    rjrVar2.b.a((j2 * 1000000) / rjrVar2.i, 1, d7kVar2.c, 0, null);
                    rjrVar2.e = -1L;
                }
            }
            rjrVar2.g += b;
            return 0;
        }
        while (true) {
            boolean b2 = snjVar.b(s2cVar);
            d7k d7kVar3 = snjVar.b;
            if (!b2) {
                rjrVar2.h = 3;
                return -1;
            }
            long position = s2cVar.getPosition();
            long j3 = j;
            long j4 = rjrVar2.f;
            rjrVar2.k = position - j4;
            if (rjrVar2.c(d7kVar3, j4, rjrVar2.j)) {
                rjrVar2.f = s2cVar.getPosition();
                j = j3;
            } else {
                dsc dscVar = (dsc) rjrVar2.j.b;
                rjrVar2.i = dscVar.E;
                if (!rjrVar2.m) {
                    rjrVar2.b.d(dscVar);
                    rjrVar2.m = true;
                }
                yg3 yg3Var = (yg3) rjrVar2.j.c;
                if (yg3Var != null) {
                    rjrVar2.d = yg3Var;
                } else {
                    if (s2cVar.getLength() != j3) {
                        tnj tnjVar = snjVar.a;
                        boolean z = (tnjVar.a & 4) != 0;
                        long j5 = rjrVar2.f;
                        long length = s2cVar.getLength();
                        long j6 = tnjVar.d + tnjVar.e;
                        long j7 = tnjVar.b;
                        i = 2;
                        d7kVar = d7kVar3;
                        rjrVar2.d = new ap7(rjrVar2, j5, length, j6, j7, z);
                        rjrVar2.h = i;
                        bArr = d7kVar.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        d7kVar.F(d7kVar.c, Arrays.copyOf(bArr, Math.max(65025, d7kVar.c)));
                        return 0;
                    }
                    rjrVar2.d = new tjl();
                }
                i = 2;
                d7kVar = d7kVar3;
                rjrVar2.h = i;
                bArr = d7kVar.a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        this.a = t2cVar;
    }

    @Override // defpackage.r2c
    public final void a() {
    }
}
