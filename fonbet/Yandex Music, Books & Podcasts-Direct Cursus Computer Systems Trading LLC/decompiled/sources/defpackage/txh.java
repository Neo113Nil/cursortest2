package defpackage;

import android.view.ActionProvider;

/* loaded from: classes.dex */
public final class txh implements ActionProvider.VisibilityListener {
    public cib a;
    public final ActionProvider b;

    public txh(wxh wxhVar, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        cib cibVar = this.a;
        if (cibVar != null) {
            hxh hxhVar = ((rxh) cibVar.b).n;
            hxhVar.h = true;
            hxhVar.p(true);
        }
    }
}
