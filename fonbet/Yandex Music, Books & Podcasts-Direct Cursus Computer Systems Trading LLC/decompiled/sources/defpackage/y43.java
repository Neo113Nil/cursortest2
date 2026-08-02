package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class y43 extends xci implements epf {
    public Function1 o;

    public y43(Function1 function1) {
        this.o = function1;
    }

    @Override // defpackage.xci
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        ksk M = ffhVar.M(j);
        return mfh.m0(mfhVar, M.a, M.b, new al(22, M, this));
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.o + ')';
    }
}
