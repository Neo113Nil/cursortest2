package defpackage;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class toa extends xci implements epf {
    public ka0 o;
    public y5 p;
    public bxj q;
    public boolean r;

    @Override // defpackage.xci
    public final void L0() {
        this.r = false;
    }

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        ksk M = ffhVar.M(j);
        if (!mfhVar.F() || !this.r) {
            Pair pair = (Pair) this.p.invoke(new hqe(nt0.p(M.a, M.b)), new ga6(j));
            ka0 ka0Var = this.o;
            j9h j9hVar = (j9h) pair.a;
            Object obj = pair.b;
            if (!Intrinsics.d(ka0Var.e(), j9hVar)) {
                ka0Var.m.setValue(j9hVar);
                if (!ka0Var.k(obj)) {
                    ka0Var.i(obj);
                }
            }
        }
        this.r = mfhVar.F() || this.r;
        return mfh.m0(mfhVar, M.a, M.b, new lma(3, mfhVar, this, M));
    }
}
