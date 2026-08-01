package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import l.ViewTreeObserverOnGlobalLayoutListenerC4647d;

/* loaded from: classes.dex */
public final class K implements PopupWindow.OnDismissListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC4647d f39022n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ L f39023u;

    public K(L l9, ViewTreeObserverOnGlobalLayoutListenerC4647d viewTreeObserverOnGlobalLayoutListenerC4647d) {
        this.f39023u = l9;
        this.f39022n = viewTreeObserverOnGlobalLayoutListenerC4647d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f39023u.f39035Z.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f39022n);
        }
    }
}
