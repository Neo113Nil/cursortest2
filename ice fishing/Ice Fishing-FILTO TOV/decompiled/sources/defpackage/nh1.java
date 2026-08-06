package defpackage;

import android.view.View;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class nh1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ gt0 EljAMC1QTz;
    public final /* synthetic */ View OOA6hdeuvCS;

    public nh1(View view, gt0 gt0Var) {
        this.OOA6hdeuvCS = view;
        this.EljAMC1QTz = gt0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.OOA6hdeuvCS.removeOnAttachStateChangeListener(this);
        this.EljAMC1QTz.WdrkLMV3xh();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
