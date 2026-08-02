package J3;

import O.J;
import O.X;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import l.ViewOnKeyListenerC4653D;
import l.ViewOnKeyListenerC4661g;

/* loaded from: classes2.dex */
public final class p implements View.OnAttachStateChangeListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1500n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1501u;

    public /* synthetic */ p(int i, Object obj) {
        this.f1500n = i;
        this.f1501u = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f1501u;
        switch (this.f1500n) {
            case 0:
                r rVar = (r) obj;
                if (rVar.f1518N != null && (accessibilityManager = rVar.f1517M) != null) {
                    WeakHashMap weakHashMap = X.f2142a;
                    if (rVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new P.b(rVar.f1518N));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = X.f2142a;
                J.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f1500n) {
            case 0:
                r rVar = (r) this.f1501u;
                l lVar = rVar.f1518N;
                if (lVar != null && (accessibilityManager = rVar.f1517M) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new P.b(lVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC4661g viewOnKeyListenerC4661g = (ViewOnKeyListenerC4661g) this.f1501u;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC4661g.f38707Q;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC4661g.f38707Q = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC4661g.f38707Q.removeGlobalOnLayoutListener(viewOnKeyListenerC4661g.f38693B);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC4653D viewOnKeyListenerC4653D = (ViewOnKeyListenerC4653D) this.f1501u;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC4653D.f38654H;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC4653D.f38654H = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC4653D.f38654H.removeGlobalOnLayoutListener(viewOnKeyListenerC4653D.f38648B);
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
