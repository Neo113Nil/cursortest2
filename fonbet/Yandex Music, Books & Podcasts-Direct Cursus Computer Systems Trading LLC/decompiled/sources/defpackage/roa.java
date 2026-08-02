package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class roa extends xci implements epf {
    public ia0 o;
    public Function2 p;
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
            ia0 ia0Var = this.o;
            i9h i9hVar = (i9h) pair.a;
            Object obj = pair.b;
            if (!Intrinsics.d(ia0Var.g(), i9hVar)) {
                ((x6k) ia0Var.i).setValue(i9hVar);
                zue zueVar = (zue) ia0Var.e;
                ha0 ha0Var = new ha0(0, ia0Var, obj);
                qqi qqiVar = zueVar.b;
                boolean g = qqiVar.g();
                if (g) {
                    try {
                        ha0Var.invoke();
                    } finally {
                        qqiVar.b(null);
                    }
                }
                if (!g) {
                    ia0Var.m(obj);
                }
            }
        }
        this.r = mfhVar.F() || this.r;
        return mfh.m0(mfhVar, M.a, M.b, new lma(2, mfhVar, this, M));
    }
}
