package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class gl6 extends xci implements ofp {
    public boolean o;
    public final boolean p;
    public Function1 q;

    public gl6(boolean z, boolean z2, Function1 function1) {
        this.o = z;
        this.p = z2;
        this.q = function1;
    }

    @Override // defpackage.ofp
    public final boolean E0() {
        return this.o;
    }

    @Override // defpackage.ofp
    public final void X(jfp jfpVar) {
        this.q.invoke(jfpVar);
    }

    @Override // defpackage.ofp
    public final boolean v() {
        return this.p;
    }
}
