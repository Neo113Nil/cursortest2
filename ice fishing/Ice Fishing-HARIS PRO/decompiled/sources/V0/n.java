package V0;

import O.AbstractC0049z;
import O.K;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import l.ViewOnKeyListenerC0215D;
import l.ViewOnKeyListenerC0223g;

/* loaded from: classes.dex */
public final class n implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1294b;

    public /* synthetic */ n(int i, Object obj) {
        this.f1293a = i;
        this.f1294b = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f1294b;
        switch (this.f1293a) {
            case 0:
                p pVar = (p) obj;
                if (pVar.f1316u != null && (accessibilityManager = pVar.f1315t) != null) {
                    WeakHashMap weakHashMap = K.f747a;
                    if (pVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new P.b(pVar.f1316u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = K.f747a;
                AbstractC0049z.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f1293a) {
            case 0:
                p pVar = (p) this.f1294b;
                Q.a aVar = pVar.f1316u;
                if (aVar != null && (accessibilityManager = pVar.f1315t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new P.b(aVar));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0223g viewOnKeyListenerC0223g = (ViewOnKeyListenerC0223g) this.f1294b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0223g.f3693x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0223g.f3693x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0223g.f3693x.removeGlobalOnLayoutListener(viewOnKeyListenerC0223g.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0215D viewOnKeyListenerC0215D = (ViewOnKeyListenerC0215D) this.f1294b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0215D.f3643o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0215D.f3643o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0215D.f3643o.removeGlobalOnLayoutListener(viewOnKeyListenerC0215D.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
