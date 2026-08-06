package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class xc implements r90 {
    public final /* synthetic */ fd EljAMC1QTz;
    public final /* synthetic */ hl0 OOA6hdeuvCS;

    public /* synthetic */ xc(hl0 hl0Var, fd fdVar) {
        this.OOA6hdeuvCS = hl0Var;
        this.EljAMC1QTz = fdVar;
    }

    @Override // defpackage.r90
    public final void OOA6hdeuvCS(t90 t90Var, l90 l90Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (l90Var == l90.ON_CREATE) {
            onBackInvokedDispatcher = this.EljAMC1QTz.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            this.OOA6hdeuvCS.Yi7zF1RB1(onBackInvokedDispatcher);
        }
    }
}
