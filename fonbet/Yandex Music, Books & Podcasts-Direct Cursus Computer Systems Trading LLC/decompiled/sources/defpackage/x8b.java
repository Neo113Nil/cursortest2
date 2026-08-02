package defpackage;

import androidx.compose.animation.b;

/* loaded from: classes.dex */
public final class x8b extends ixe {
    public d8t p;
    public t7t q;
    public t7t r;
    public t7t s;
    public e9b t;
    public vpb u;
    public s8b v;
    public long w;
    public g40 x;
    public final w8b y;
    public final w8b z;

    public x8b(d8t d8tVar, t7t t7tVar, t7t t7tVar2, t7t t7tVar3, e9b e9bVar, vpb vpbVar, s8b s8bVar) {
        super(1);
        this.p = d8tVar;
        this.q = t7tVar;
        this.r = t7tVar2;
        this.s = t7tVar3;
        this.t = e9bVar;
        this.u = vpbVar;
        this.v = s8bVar;
        this.w = b.a;
        ia6.b(0, 0, 15);
        this.y = new w8b(this, 0);
        this.z = new w8b(this, 1);
    }

    @Override // defpackage.xci
    public final void K0() {
        this.w = b.a;
    }

    public final g40 U0() {
        if (this.p.f().c(r8b.a, r8b.b)) {
            bc4 bc4Var = this.t.a.c;
            if (bc4Var != null) {
                return bc4Var.a;
            }
            bc4 bc4Var2 = this.u.a.c;
            if (bc4Var2 != null) {
                return bc4Var2.a;
            }
            return null;
        }
        bc4 bc4Var3 = this.u.a.c;
        if (bc4Var3 != null) {
            return bc4Var3.a;
        }
        bc4 bc4Var4 = this.t.a.c;
        if (bc4Var4 != null) {
            return bc4Var4.a;
        }
        return null;
    }

    @Override // defpackage.ixe, defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        char c;
        long j2;
        if (this.p.c() == this.p.d.getValue()) {
            this.x = null;
        } else if (this.x == null) {
            g40 U0 = U0();
            if (U0 == null) {
                U0 = b2c.b;
            }
            this.x = U0;
        }
        if (mfhVar.F()) {
            ksk M = ffhVar.M(j);
            long j3 = (M.a << 32) | (M.b & 4294967295L);
            this.w = j3;
            return mfh.m0(mfhVar, (int) (j3 >> 32), (int) (j3 & 4294967295L), new ai0(M, 6));
        }
        if (!Boolean.TRUE.booleanValue()) {
            ksk M2 = ffhVar.M(j);
            return mfh.m0(mfhVar, M2.a, M2.b, new ai0(M2, 7));
        }
        s8b s8bVar = this.v;
        t7t t7tVar = s8bVar.a;
        t7t t7tVar2 = s8bVar.b;
        d8t d8tVar = s8bVar.c;
        e9b e9bVar = s8bVar.d;
        vpb vpbVar = s8bVar.e;
        t7t t7tVar3 = s8bVar.f;
        s7t a = t7tVar != null ? t7tVar.a(new t8b(e9bVar, vpbVar, 0), new t8b(e9bVar, vpbVar, 1)) : null;
        s7t a2 = t7tVar2 != null ? t7tVar2.a(new t8b(e9bVar, vpbVar, 2), new t8b(e9bVar, vpbVar, 3)) : null;
        if (d8tVar.c() == r8b.a) {
            g8t g8tVar = vpbVar.a;
        } else {
            g8t g8tVar2 = vpbVar.a;
        }
        lma lmaVar = new lma(4, a, a2, t7tVar3 != null ? t7tVar3.a(jx9.v0, new lma(5, r4, e9bVar, vpbVar)) : null);
        ksk M3 = ffhVar.M(j);
        long j4 = (M3.b & 4294967295L) | (M3.a << 32);
        long j5 = !hqe.a(this.w, b.a) ? this.w : j4;
        t7t t7tVar4 = this.q;
        r4 = t7tVar4 != null ? t7tVar4.a(this.y, new v8b(this, j5, 0)) : null;
        if (r4 != null) {
            j4 = ((hqe) r4.getValue()).a;
        }
        long d = ia6.d(j, j4);
        t7t t7tVar5 = this.r;
        long j6 = t7tVar5 != null ? ((wpe) t7tVar5.a(jx9.A0, new v8b(this, j5, 1)).getValue()).a : 0L;
        t7t t7tVar6 = this.s;
        if (t7tVar6 != null) {
            c = ' ';
            j2 = ((wpe) t7tVar6.a(this.z, new v8b(this, j5, 2)).getValue()).a;
        } else {
            c = ' ';
            j2 = 0;
        }
        g40 g40Var = this.x;
        return mfh.m0(mfhVar, (int) (d >> c), (int) (d & 4294967295L), new zc3(1, wpe.d(g40Var != null ? g40Var.a(j5, d, xof.a) : 0L, j2), j6, M3, lmaVar));
    }
}
