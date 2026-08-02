package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class nbh extends xci implements epf, ipa, moc {
    public int o;
    public float p;
    public final float q;
    public final fk0 r;
    public rar v;
    public final x6k w;
    public final zx7 y;
    public final u6k s = new u6k(0);
    public final u6k t = new u6k(0);
    public final x6k u = szf.g0(Boolean.FALSE);
    public final x6k x = szf.g0(new fbh());

    public nbh(int i, pbh pbhVar, float f, float f2, fk0 fk0Var) {
        this.o = i;
        this.p = f;
        this.q = f2;
        this.r = fk0Var;
        this.w = szf.g0(pbhVar);
        this.y = szf.U(new y6g(5, pbhVar, this));
    }

    @Override // defpackage.epf
    public final int E(twg twgVar, ffh ffhVar, int i) {
        ffhVar.getClass();
        return ffhVar.a(Integer.MAX_VALUE);
    }

    @Override // defpackage.xci
    public final void K0() {
        U0();
    }

    @Override // defpackage.xci
    public final void L0() {
        rar rarVar = this.v;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.v = null;
    }

    @Override // defpackage.epf
    public final int M(twg twgVar, ffh ffhVar, int i) {
        ffhVar.getClass();
        return 0;
    }

    public final float S0() {
        float signum = Math.signum(this.p);
        int ordinal = bcx.F(this).z.ordinal();
        int i = 1;
        if (ordinal != 0) {
            if (ordinal != 1) {
                b6e.s();
                return 0.0f;
            }
            i = -1;
        }
        return signum * i;
    }

    public final int T0() {
        return ((Number) this.y.getValue()).intValue();
    }

    public final void U0() {
        rar rarVar = this.v;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        if (this.n) {
            this.v = x97.y(G0(), null, null, new zig(rarVar, this, continuation, 11), 3);
        }
    }

    @Override // defpackage.epf
    public final int b(twg twgVar, ffh ffhVar, int i) {
        ffhVar.getClass();
        return ffhVar.J(i);
    }

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        ffhVar.getClass();
        ksk M = ffhVar.M(ga6.b(j, 0, Integer.MAX_VALUE, 0, 0, 13));
        int g = ia6.g(M.a, j);
        u6k u6kVar = this.t;
        u6kVar.i(g);
        this.s.i(M.a);
        return mfh.m0(mfhVar, u6kVar.h(), M.b, new dae(20, M, this));
    }

    @Override // defpackage.epf
    public final int p0(twg twgVar, ffh ffhVar, int i) {
        ffhVar.getClass();
        return ffhVar.z(Integer.MAX_VALUE);
    }

    @Override // defpackage.moc
    public final void t(bpc bpcVar) {
        this.u.setValue(Boolean.valueOf(bpcVar.a()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0074, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        if (((java.lang.Number) r0.e()).floatValue() > T0()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0072, code lost:
    
        if (((java.lang.Number) r0.e()).floatValue() > ((T0() + r6.h()) - r4.h())) goto L15;
     */
    @Override // defpackage.ipa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0(opf opfVar) {
        boolean z;
        ou3 ou3Var = opfVar.a;
        fk0 fk0Var = this.r;
        float S0 = S0() * ((Number) fk0Var.e()).floatValue();
        float S02 = S0();
        u6k u6kVar = this.t;
        u6k u6kVar2 = this.s;
        boolean z2 = S02 != 1.0f ? ((Number) fk0Var.e()).floatValue() < ((float) u6kVar.h()) : ((Number) fk0Var.e()).floatValue() < ((float) u6kVar2.h());
        if (S0() == 1.0f) {
        }
        float T0 = S0() == 1.0f ? T0() + u6kVar2.h() : (-u6kVar2.h()) - T0();
        float h = S0 + u6kVar.h();
        float b = nmq.b(ou3Var.e());
        nsh nshVar = ou3Var.b;
        long B = nshVar.B();
        nshVar.s().r();
        try {
            ((xzi) nshVar.b).W(S0, 0.0f, h, b, 1);
            if (z2) {
                opfVar.a();
            }
            if (z) {
                ((xzi) ou3Var.b.b).m0(T0, 0.0f);
                try {
                    opfVar.a();
                    ((xzi) ou3Var.b.b).m0(-T0, -0.0f);
                } catch (Throwable th) {
                    ((xzi) ou3Var.b.b).m0(-T0, -0.0f);
                    throw th;
                }
            }
            vz1.A(nshVar, B);
        } catch (Throwable th2) {
            vz1.A(nshVar, B);
            throw th2;
        }
    }
}
