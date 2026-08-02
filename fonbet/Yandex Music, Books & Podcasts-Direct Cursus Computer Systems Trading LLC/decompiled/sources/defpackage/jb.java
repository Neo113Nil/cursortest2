package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class jb implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ jb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ob obVar = (ob) obj;
                obVar.f.getViewTreeObserver().addOnGlobalLayoutListener(obVar.h);
                break;
            case 1:
                wj wjVar = (wj) obj;
                if (wjVar.d == null) {
                    gzj gzjVar = new gzj(new oqj(new k5(2, wjVar)), wjVar.b);
                    wjVar.a.getViewTreeObserver().addOnPreDrawListener(gzjVar);
                    wjVar.d = gzjVar;
                    break;
                }
                break;
            case 2:
                ye0 ye0Var = (ye0) obj;
                AccessibilityManager accessibilityManager = ye0Var.g;
                accessibilityManager.addAccessibilityStateChangeListener(ye0Var.i);
                accessibilityManager.addTouchExplorationStateChangeListener(ye0Var.j);
                break;
            case 5:
                a7b a7bVar = (a7b) obj;
                AccessibilityManager accessibilityManager2 = a7bVar.t;
                if (a7bVar.u != null && accessibilityManager2 != null && a7bVar.isAttachedToWindow()) {
                    accessibilityManager2.addTouchExplorationStateChangeListener(a7bVar.u);
                    break;
                }
                break;
            case 6:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = wdu.a;
                ldu.c(view2);
                break;
            case 9:
                ((c1t) obj).s();
                break;
            case 12:
                tqv tqvVar = (tqv) obj;
                WeakHashMap weakHashMap2 = wdu.a;
                tqv.a(tqvVar, odu.a(view));
                ndu.n(view, new tot(5, tqvVar));
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener2;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener3;
        AccessibilityManager accessibilityManager4;
        AccessibilityManager accessibilityManager5;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener4;
        switch (this.a) {
            case 0:
                ob obVar = (ob) this.b;
                obVar.f.getViewTreeObserver().removeOnGlobalLayoutListener(obVar.h);
                obVar.k();
                break;
            case 1:
                ((wj) this.b).a();
                break;
            case 2:
                ye0 ye0Var = (ye0) this.b;
                ye0Var.l.removeCallbacks(ye0Var.M);
                AccessibilityManager accessibilityManager6 = ye0Var.g;
                accessibilityManager6.removeAccessibilityStateChangeListener(ye0Var.i);
                accessibilityManager6.removeTouchExplorationStateChangeListener(ye0Var.j);
                break;
            case 3:
                q54 q54Var = (q54) this.b;
                ViewTreeObserver viewTreeObserver = q54Var.x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        q54Var.x = view.getViewTreeObserver();
                    }
                    q54Var.x.removeGlobalOnLayoutListener(q54Var.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 4:
                pc9 pc9Var = (pc9) this.b;
                e23 e23Var = pc9Var.z;
                jc8 jc8Var = pc9Var.y;
                if (jc8Var != null) {
                    w1a A = e23Var.a.getDiv2Component$div_release().A();
                    A.getClass();
                    w1a.f(e23Var, view, jc8Var, new r1a(A, e23Var, 1));
                    break;
                }
                break;
            case 5:
                a7b a7bVar = (a7b) this.b;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener5 = a7bVar.u;
                if (touchExplorationStateChangeListener5 != null && (accessibilityManager = a7bVar.t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener5);
                    break;
                }
                break;
            case 6:
                break;
            case 7:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.b;
                touchExplorationStateChangeListener = hideBottomViewOnScrollBehavior.touchExplorationListener;
                if (touchExplorationStateChangeListener != null) {
                    accessibilityManager2 = hideBottomViewOnScrollBehavior.accessibilityManager;
                    if (accessibilityManager2 != null) {
                        accessibilityManager3 = hideBottomViewOnScrollBehavior.accessibilityManager;
                        touchExplorationStateChangeListener2 = hideBottomViewOnScrollBehavior.touchExplorationListener;
                        accessibilityManager3.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener2);
                        hideBottomViewOnScrollBehavior.touchExplorationListener = null;
                        break;
                    }
                }
                break;
            case 8:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.b;
                touchExplorationStateChangeListener3 = hideViewOnScrollBehavior.touchExplorationListener;
                if (touchExplorationStateChangeListener3 != null) {
                    accessibilityManager4 = hideViewOnScrollBehavior.accessibilityManager;
                    if (accessibilityManager4 != null) {
                        accessibilityManager5 = hideViewOnScrollBehavior.accessibilityManager;
                        touchExplorationStateChangeListener4 = hideViewOnScrollBehavior.touchExplorationListener;
                        accessibilityManager5.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener4);
                        hideViewOnScrollBehavior.touchExplorationListener = null;
                        break;
                    }
                }
                break;
            case 9:
                break;
            case 10:
                ViewGroup viewGroup = (ViewGroup) this.b;
                viewGroup.removeOnAttachStateChangeListener(this);
                l8t.b(viewGroup);
                break;
            case 11:
                ebr ebrVar = (ebr) this.b;
                ViewTreeObserver viewTreeObserver2 = ebrVar.o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        ebrVar.o = view.getViewTreeObserver();
                    }
                    ebrVar.o.removeGlobalOnLayoutListener(ebrVar.i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 12:
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((rar) this.b).g(null);
                break;
        }
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }

    private final void h(View view) {
    }

    private final void i(View view) {
    }

    private final void j(View view) {
    }

    private final void k(View view) {
    }

    private final void l(View view) {
    }
}
