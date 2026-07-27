package g;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: g.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0144d implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1925b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0144d(l lVar, int i2) {
        this.f1924a = i2;
        this.f1925b = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i2 = this.f1924a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1924a) {
            case 0:
                ViewOnKeyListenerC0147g viewOnKeyListenerC0147g = (ViewOnKeyListenerC0147g) this.f1925b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0147g.f1935C;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0147g.f1935C = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0147g.f1935C.removeGlobalOnLayoutListener(viewOnKeyListenerC0147g.f1945n);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                s sVar = (s) this.f1925b;
                ViewTreeObserver viewTreeObserver2 = sVar.f2035t;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.f2035t = view.getViewTreeObserver();
                    }
                    sVar.f2035t.removeGlobalOnLayoutListener(sVar.f2030n);
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
