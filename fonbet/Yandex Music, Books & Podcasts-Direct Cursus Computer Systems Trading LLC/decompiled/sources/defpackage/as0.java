package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class as0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ vr0 a;
    public final /* synthetic */ bs0 b;

    public as0(bs0 bs0Var, vr0 vr0Var) {
        this.b = bs0Var;
        this.a = vr0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
