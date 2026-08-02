package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import l.ViewTreeObserverOnGlobalLayoutListenerC4658d;

/* loaded from: classes.dex */
public final class K implements PopupWindow.OnDismissListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC4658d f39090n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ L f39091u;

    public K(L l9, ViewTreeObserverOnGlobalLayoutListenerC4658d viewTreeObserverOnGlobalLayoutListenerC4658d) {
        this.f39091u = l9;
        this.f39090n = viewTreeObserverOnGlobalLayoutListenerC4658d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f39091u.f39103Z.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f39090n);
        }
    }
}
