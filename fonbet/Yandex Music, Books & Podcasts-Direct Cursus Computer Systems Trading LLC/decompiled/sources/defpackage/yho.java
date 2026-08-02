package defpackage;

import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class yho implements nio {
    public final mio a;
    public azs c;
    public int d;
    public long f;
    public long g;
    public final v94 b = new v94();
    public long e = -9223372036854775807L;

    public yho(mio mioVar) {
        this.a = mioVar;
    }

    @Override // defpackage.nio
    public final void b(long j, long j2) {
        this.e = j;
        this.g = j2;
    }

    @Override // defpackage.nio
    public final void c(t2c t2cVar, int i) {
        azs M = t2cVar.M(i, 1);
        this.c = M;
        M.d(this.a.c);
    }

    @Override // defpackage.nio
    public final void d(long j) {
        vq1.A(this.e == -9223372036854775807L);
        this.e = j;
    }

    @Override // defpackage.nio
    public final void e(d7k d7kVar, long j, int i, boolean z) {
        int v = d7kVar.v() & 3;
        int v2 = d7kVar.v() & KotlinVersion.MAX_COMPONENT_VALUE;
        long l0 = o2g.l0(this.g, j, this.a.b, this.e);
        if (v != 0) {
            if (v == 1 || v == 2) {
                int i2 = this.d;
                if (i2 > 0) {
                    azs azsVar = this.c;
                    int i3 = dvt.a;
                    azsVar.a(this.f, 1, i2, 0, null);
                    this.d = 0;
                }
            } else if (v != 3) {
                xq0.x(String.valueOf(v));
                return;
            }
            int a = d7kVar.a();
            azs azsVar2 = this.c;
            azsVar2.getClass();
            azsVar2.b(d7kVar, a, 0);
            int i4 = this.d + a;
            this.d = i4;
            this.f = l0;
            if (z && v == 3) {
                azs azsVar3 = this.c;
                int i5 = dvt.a;
                azsVar3.a(l0, 1, i4, 0, null);
                this.d = 0;
                return;
            }
            return;
        }
        int i6 = this.d;
        if (i6 > 0) {
            azs azsVar4 = this.c;
            int i7 = dvt.a;
            azsVar4.a(this.f, 1, i6, 0, null);
            this.d = 0;
        }
        if (v2 == 1) {
            int a2 = d7kVar.a();
            azs azsVar5 = this.c;
            azsVar5.getClass();
            azsVar5.b(d7kVar, a2, 0);
            azs azsVar6 = this.c;
            int i8 = dvt.a;
            azsVar6.a(l0, 1, a2, 0, null);
            return;
        }
        byte[] bArr = d7kVar.a;
        v94 v94Var = this.b;
        v94Var.getClass();
        v94Var.o(bArr.length, bArr);
        v94Var.u(2);
        long j2 = l0;
        for (int i9 = 0; i9 < v2; i9++) {
            x9 G = nt0.G(v94Var);
            int i10 = G.c;
            azs azsVar7 = this.c;
            azsVar7.getClass();
            azsVar7.b(d7kVar, i10, 0);
            azs azsVar8 = this.c;
            int i11 = dvt.a;
            azsVar8.a(j2, 1, G.c, 0, null);
            j2 = ((G.d / G.a) * 1000000) + j2;
            v94Var.u(i10);
        }
    }
}
