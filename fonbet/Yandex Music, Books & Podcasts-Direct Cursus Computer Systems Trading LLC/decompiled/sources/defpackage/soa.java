package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class soa extends xci implements epf {
    public ja0 o;
    public Function2 p;
    public bxj q;
    public boolean r;

    @Override // defpackage.xci
    public final void L0() {
        this.r = false;
    }

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        ffhVar.getClass();
        ksk M = ffhVar.M(j);
        if (!mfhVar.F() || !this.r) {
            Pair pair = (Pair) this.p.invoke(new hqe(nt0.p(M.a, M.b)), new ga6(j));
            this.o.j((ml7) pair.a, pair.b);
        }
        this.r = mfhVar.F() || this.r;
        return mfh.m0(mfhVar, M.a, M.b, new g3(28, mfhVar, this, M));
    }
}
