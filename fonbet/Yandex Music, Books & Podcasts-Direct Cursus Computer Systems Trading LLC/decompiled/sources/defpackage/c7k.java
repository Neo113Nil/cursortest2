package defpackage;

/* loaded from: classes.dex */
public final class c7k extends xci implements epf {
    public float o;
    public sdr p;
    public sdr q;

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        sdr sdrVar = this.p;
        int round = (sdrVar == null || ((Number) sdrVar.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) sdrVar.getValue()).floatValue() * this.o);
        sdr sdrVar2 = this.q;
        int round2 = (sdrVar2 == null || ((Number) sdrVar2.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) sdrVar2.getValue()).floatValue() * this.o);
        int k = round != Integer.MAX_VALUE ? round : ga6.k(j);
        int j2 = round2 != Integer.MAX_VALUE ? round2 : ga6.j(j);
        if (round == Integer.MAX_VALUE) {
            round = ga6.i(j);
        }
        if (round2 == Integer.MAX_VALUE) {
            round2 = ga6.h(j);
        }
        ksk M = ffhVar.M(ia6.a(k, round, j2, round2));
        return mfh.m0(mfhVar, M.a, M.b, new ai0(M, 13));
    }
}
