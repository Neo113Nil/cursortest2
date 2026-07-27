package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import l.ViewTreeObserverOnGlobalLayoutListenerC4676d;

/* loaded from: classes.dex */
public final class K implements PopupWindow.OnDismissListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC4676d f39289n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ L f39290u;

    public K(L l9, ViewTreeObserverOnGlobalLayoutListenerC4676d viewTreeObserverOnGlobalLayoutListenerC4676d) {
        this.f39290u = l9;
        this.f39289n = viewTreeObserverOnGlobalLayoutListenerC4676d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f39290u.f39302Z.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f39289n);
        }
    }
}
