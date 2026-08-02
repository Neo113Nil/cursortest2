package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class rls extends nn4 {
    public boolean H;
    public Function1 I;
    public final ncs J;

    public rls(boolean z, uoi uoiVar, cje cjeVar, boolean z2, meo meoVar, Function1 function1) {
        super(uoiVar, cjeVar, z2, null, meoVar, new si2(function1, z, 4));
        this.H = z;
        this.I = function1;
        this.J = new ncs(5, this);
    }

    @Override // defpackage.s5
    public final void V0(jfp jfpVar) {
        wfp.v(jfpVar, this.H ? sls.a : sls.b);
    }
}
