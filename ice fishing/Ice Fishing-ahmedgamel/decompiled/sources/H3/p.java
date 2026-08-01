package H3;

import O.J;
import O.X;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import l.ViewOnKeyListenerC4642D;
import l.ViewOnKeyListenerC4650g;

/* loaded from: classes2.dex */
public final class p implements View.OnAttachStateChangeListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1144n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1145u;

    public /* synthetic */ p(int i, Object obj) {
        this.f1144n = i;
        this.f1145u = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f1145u;
        switch (this.f1144n) {
            case 0:
                r rVar = (r) obj;
                if (rVar.f1162N != null && (accessibilityManager = rVar.f1161M) != null) {
                    WeakHashMap weakHashMap = X.f2054a;
                    if (rVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new P.b(rVar.f1162N));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = X.f2054a;
                J.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f1144n) {
            case 0:
                r rVar = (r) this.f1145u;
                l lVar = rVar.f1162N;
                if (lVar != null && (accessibilityManager = rVar.f1161M) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new P.b(lVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC4650g viewOnKeyListenerC4650g = (ViewOnKeyListenerC4650g) this.f1145u;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC4650g.f38780Q;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC4650g.f38780Q = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC4650g.f38780Q.removeGlobalOnLayoutListener(viewOnKeyListenerC4650g.f38766B);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC4642D viewOnKeyListenerC4642D = (ViewOnKeyListenerC4642D) this.f1145u;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC4642D.f38727H;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC4642D.f38727H = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC4642D.f38727H.removeGlobalOnLayoutListener(viewOnKeyListenerC4642D.f38721B);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
