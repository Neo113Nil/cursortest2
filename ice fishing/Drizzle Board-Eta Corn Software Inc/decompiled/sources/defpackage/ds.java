package defpackage;

import android.view.ActionProvider;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ds implements ActionProvider.VisibilityListener {
    public final ActionProvider NCTxEWno;
    public tg0 qoPGr6Ce;

    public ds(gs gsVar, ActionProvider actionProvider) {
        this.NCTxEWno = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        tg0 tg0Var = this.qoPGr6Ce;
        if (tg0Var != null) {
            yr yrVar = ((cs) tg0Var.MdtA4re8).ygLcUYwZ;
            yrVar.Qr9iLBAD = true;
            yrVar.sjUBp5pO(true);
        }
    }
}
