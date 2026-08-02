package defpackage;

/* loaded from: classes.dex */
public final class x4k extends xci implements epf, ipa {
    public w4k o;
    public boolean p;
    public g40 q;
    public jd6 r;
    public float s;
    public m85 t;

    public static boolean T0(long j) {
        return !nmq.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean U0(long j) {
        return !nmq.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.epf
    public final int E(twg twgVar, ffh ffhVar, int i) {
        if (!S0()) {
            return ffhVar.a(i);
        }
        long V0 = V0(ia6.b(i, 0, 13));
        return Math.max(ga6.j(V0), ffhVar.a(i));
    }

    @Override // defpackage.xci
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.epf
    public final int M(twg twgVar, ffh ffhVar, int i) {
        if (!S0()) {
            return ffhVar.G(i);
        }
        long V0 = V0(ia6.b(0, i, 7));
        return Math.max(ga6.k(V0), ffhVar.G(i));
    }

    public final boolean S0() {
        return this.p && this.o.i() != 9205357640488583168L;
    }

    public final long V0(long j) {
        boolean z = false;
        boolean z2 = ga6.e(j) && ga6.d(j);
        if (ga6.g(j) && ga6.f(j)) {
            z = true;
        }
        if ((!S0() && z2) || z) {
            return ga6.b(j, ga6.i(j), 0, ga6.h(j), 0, 10);
        }
        long i = this.o.i();
        int round = U0(i) ? Math.round(Float.intBitsToFloat((int) (i >> 32))) : ga6.k(j);
        int round2 = T0(i) ? Math.round(Float.intBitsToFloat((int) (i & 4294967295L))) : ga6.j(j);
        int g = ia6.g(round, j);
        long floatToRawIntBits = (Float.floatToRawIntBits(ia6.f(round2, j)) & 4294967295L) | (Float.floatToRawIntBits(g) << 32);
        if (S0()) {
            long floatToRawIntBits2 = (Float.floatToRawIntBits(!U0(this.o.i()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.o.i() >> 32))) << 32) | (Float.floatToRawIntBits(!T0(this.o.i()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.o.i() & 4294967295L))) & 4294967295L);
            floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : pcg.O(floatToRawIntBits2, this.r.f(floatToRawIntBits2, floatToRawIntBits));
        }
        return ga6.b(j, ia6.g(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), 0, ia6.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // defpackage.epf
    public final int b(twg twgVar, ffh ffhVar, int i) {
        if (!S0()) {
            return ffhVar.J(i);
        }
        long V0 = V0(ia6.b(0, i, 7));
        return Math.max(ga6.k(V0), ffhVar.J(i));
    }

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        ksk M = ffhVar.M(V0(j));
        return mfh.m0(mfhVar, M.a, M.b, new ai0(M, 12));
    }

    @Override // defpackage.epf
    public final int p0(twg twgVar, ffh ffhVar, int i) {
        if (!S0()) {
            return ffhVar.z(i);
        }
        long V0 = V0(ia6.b(i, 0, 13));
        return Math.max(ga6.j(V0), ffhVar.z(i));
    }

    @Override // defpackage.ipa
    public final void t0(opf opfVar) {
        ou3 ou3Var = opfVar.a;
        long i = this.o.i();
        long floatToRawIntBits = (Float.floatToRawIntBits(U0(i) ? Float.intBitsToFloat((int) (i >> 32)) : Float.intBitsToFloat((int) (ou3Var.e() >> 32))) << 32) | (Float.floatToRawIntBits(T0(i) ? Float.intBitsToFloat((int) (i & 4294967295L)) : Float.intBitsToFloat((int) (ou3Var.e() & 4294967295L))) & 4294967295L);
        long O = (Float.intBitsToFloat((int) (ou3Var.e() >> 32)) == 0.0f || Float.intBitsToFloat((int) (ou3Var.e() & 4294967295L)) == 0.0f) ? 0L : pcg.O(floatToRawIntBits, this.r.f(floatToRawIntBits, ou3Var.e()));
        long a = this.q.a((Math.round(Float.intBitsToFloat((int) (O >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (O & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (ou3Var.e() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (ou3Var.e() & 4294967295L))) & 4294967295L), opfVar.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & 4294967295L);
        ((xzi) ou3Var.b.b).m0(f, f2);
        try {
            this.o.g(opfVar, O, this.s, this.t);
            ((xzi) ou3Var.b.b).m0(-f, -f2);
            opfVar.a();
        } catch (Throwable th) {
            ((xzi) ou3Var.b.b).m0(-f, -f2);
            throw th;
        }
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.o + ", sizeToIntrinsics=" + this.p + ", alignment=" + this.q + ", alpha=" + this.s + ", colorFilter=" + this.t + ')';
    }
}
