package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ll0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final vf1 AvO7iQsrTN;
    public ViewTreeObserver EljAMC1QTz;
    public final View OOA6hdeuvCS;

    public ll0(View view, vf1 vf1Var) {
        this.OOA6hdeuvCS = view;
        this.EljAMC1QTz = view.getViewTreeObserver();
        this.AvO7iQsrTN = vf1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.EljAMC1QTz.isAlive();
        View view = this.OOA6hdeuvCS;
        if (isAlive) {
            this.EljAMC1QTz.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.AvO7iQsrTN.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.EljAMC1QTz = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.EljAMC1QTz.isAlive();
        View view2 = this.OOA6hdeuvCS;
        if (isAlive) {
            this.EljAMC1QTz.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
