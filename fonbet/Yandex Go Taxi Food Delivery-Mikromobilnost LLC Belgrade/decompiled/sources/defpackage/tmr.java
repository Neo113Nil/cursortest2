package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class tmr extends h55 {
    public final boolean D;
    public ylr E;

    public tmr(boolean z) {
        super(null);
        this.D = z;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        ylr ylrVar = this.E;
        if (ylrVar != null) {
            P(obj, ylrVar);
        } else {
            ny61.g("Required value was null.");
        }
    }

    @Override // defpackage.h55
    public void H(Object obj) {
        ylr ylrVar = this.E;
        if (ylrVar != null) {
            ylrVar.onStop();
        }
        ylr ylrVar2 = this.E;
        View asView = ylrVar2 != null ? ylrVar2.asView() : null;
        ViewParent parent = asView != null ? asView.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(asView);
        }
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        ylr ylrVar = this.E;
        if (ylrVar != null) {
            ylrVar.onDestroy(this.D);
        }
        this.E = null;
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        this.E = Q(obj);
    }

    @Override // defpackage.h55
    public final void K(Object obj) {
        ylr ylrVar = this.E;
        if (ylrVar != null) {
            ylrVar.onResume();
        }
    }

    @Override // defpackage.h55
    public final void L(Object obj) {
        ylr ylrVar = this.E;
        if (ylrVar != null) {
            ylrVar.onPause();
        }
    }

    public abstract void P(Object obj, ylr ylrVar);

    public abstract ylr Q(Object obj);

    public tmr() {
        this(true);
    }
}
