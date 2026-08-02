package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class u2k extends vut {
    public final Function1 k;
    public final x0 l;

    public u2k(ryc rycVar, Function1 function1, int i) {
        this.k = function1;
        x0 x0Var = new x0(20, (byte) 0);
        x0Var.n(i, new o2k(function1, rycVar));
        this.l = x0Var;
    }

    @Override // defpackage.vut
    public final x0 G() {
        return this.l;
    }
}
