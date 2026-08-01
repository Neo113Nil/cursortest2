package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import l.ViewTreeObserverOnGlobalLayoutListenerC0220d;

/* loaded from: classes.dex */
public final class M implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0220d f3853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f3854b;

    public M(N n2, ViewTreeObserverOnGlobalLayoutListenerC0220d viewTreeObserverOnGlobalLayoutListenerC0220d) {
        this.f3854b = n2;
        this.f3853a = viewTreeObserverOnGlobalLayoutListenerC0220d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f3854b.f3859G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f3853a);
        }
    }
}
