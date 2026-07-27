package g;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: g.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0144d implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1933b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0144d(l lVar, int i2) {
        this.f1932a = i2;
        this.f1933b = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i2 = this.f1932a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1932a) {
            case 0:
                ViewOnKeyListenerC0147g viewOnKeyListenerC0147g = (ViewOnKeyListenerC0147g) this.f1933b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0147g.f1942B;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0147g.f1942B = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0147g.f1942B.removeGlobalOnLayoutListener(viewOnKeyListenerC0147g.f1952m);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                s sVar = (s) this.f1933b;
                ViewTreeObserver viewTreeObserver2 = sVar.f2043s;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.f2043s = view.getViewTreeObserver();
                    }
                    sVar.f2043s.removeGlobalOnLayoutListener(sVar.f2038m);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
