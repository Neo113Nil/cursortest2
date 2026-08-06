package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class x1 implements Choreographer.FrameCallback {
    public final /* synthetic */ hv EljAMC1QTz;
    public final /* synthetic */ n9 OOA6hdeuvCS;

    public x1(n9 n9Var, y1 y1Var, hv hvVar) {
        this.OOA6hdeuvCS = n9Var;
        this.EljAMC1QTz = hvVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object su0Var;
        try {
            su0Var = this.EljAMC1QTz.mOu10nynGul(Long.valueOf(j));
        } catch (Throwable th) {
            su0Var = new su0(th);
        }
        this.OOA6hdeuvCS.AvO7iQsrTN(su0Var);
    }
}
