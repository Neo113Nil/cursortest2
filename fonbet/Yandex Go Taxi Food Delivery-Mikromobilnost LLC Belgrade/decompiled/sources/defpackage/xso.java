package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.b;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class xso extends AccessibilityDelegateCompat {
    public static final Rect D = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final kl40 E;
    public static final xw91 F;
    public final AccessibilityManager x;
    public final View y;
    public wso z;
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final int[] w = new int[2];
    public int A = Integer.MIN_VALUE;
    public int B = Integer.MIN_VALUE;
    public int C = Integer.MIN_VALUE;

    static {
        int i = 23;
        E = new kl40(i);
        F = new xw91(i);
    }

    public xso(View view) {
        this.y = view;
        this.x = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public final boolean a(int i) {
        if (this.B != i) {
            return false;
        }
        this.B = Integer.MIN_VALUE;
        n(i, false);
        p(i, 8);
        return true;
    }

    public final wh b(int i) {
        wh h = wh.h();
        AccessibilityNodeInfo accessibilityNodeInfo = h.a;
        h.v(true);
        h.w(true);
        h.p(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        Rect rect = D;
        h.k(rect);
        h.l(rect);
        View view = this.y;
        h.A(view);
        m(i, h);
        if (h.g() == null && accessibilityNodeInfo.getContentDescription() == null) {
            kbs.g("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.b;
        accessibilityNodeInfo.getBoundsInParent(rect2);
        Rect rect3 = this.a;
        h.f(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            kbs.g("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfo.getActions();
        if ((actions & 64) != 0) {
            kbs.g("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            kbs.g("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        h.z(view.getContext().getPackageName());
        h.c = i;
        accessibilityNodeInfo.setSource(view, i);
        if (this.A == i) {
            h.j(true);
            h.a(128);
        } else {
            h.j(false);
            h.a(64);
        }
        boolean z = this.B == i;
        if (z) {
            h.a(2);
        } else if (accessibilityNodeInfo.isFocusable()) {
            h.a(1);
        }
        accessibilityNodeInfo.setFocused(z);
        int[] iArr = this.w;
        view.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            h.k(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            if (h.b != -1) {
                wh h2 = wh.h();
                AccessibilityNodeInfo accessibilityNodeInfo2 = h2.a;
                Rect rect5 = new Rect();
                for (int i2 = h.b; i2 != -1; i2 = h2.b) {
                    h2.b = -1;
                    accessibilityNodeInfo2.setParent(view, -1);
                    h2.k(rect);
                    m(i2, h2);
                    accessibilityNodeInfo2.getBoundsInParent(rect5);
                    rect4.offset(rect5.left, rect5.top);
                }
            }
            view.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            h.l(rect4);
            h.f(rect3);
        }
        Rect rect6 = this.c;
        if (view.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect6)) {
                h.l(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            h.G(true);
                        }
                    }
                }
            }
        }
        return h;
    }

    public final boolean c(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.x;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int e = e(motionEvent.getX(), motionEvent.getY());
            int i2 = this.C;
            if (i2 != e) {
                this.C = e;
                p(e, 128);
                p(i2, 256);
            }
            if (e == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.C) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.C = Integer.MIN_VALUE;
                p(Integer.MIN_VALUE, 128);
                p(i, 256);
                return true;
            }
        }
        return true;
    }

    public final AccessibilityEvent createEvent(int i, int i2) {
        View view = this.y;
        if (i == -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i2);
        wh i3 = i(i);
        obtain2.getText().add(i3.g());
        AccessibilityNodeInfo accessibilityNodeInfo = i3.a;
        obtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        obtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        obtain2.setPassword(accessibilityNodeInfo.isPassword());
        obtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        obtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            kbs.g("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            return null;
        }
        obtain2.setClassName(accessibilityNodeInfo.getClassName());
        mja1.i(obtain2, view, i);
        obtain2.setPackageName(view.getContext().getPackageName());
        return obtain2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean d(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i < repeatCount && h(i2, null)) {
                                    i++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = this.B;
                    if (i3 != Integer.MIN_VALUE) {
                        k(i3, 16, null);
                    }
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return h(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return h(1, null);
                }
            }
        }
        return false;
    }

    public abstract int e(float f, float f2);

    public abstract void f(ArrayList arrayList);

    public final void g(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.x.isEnabled() || (parent = (view = this.y).getParent()) == null) {
            return;
        }
        AccessibilityEvent createEvent = createEvent(i, 2048);
        createEvent.setContentChangeTypes(i2);
        parent.requestSendAccessibilityEvent(view, createEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        if (this.z == null) {
            this.z = new wso(this);
        }
        return this.z;
    }

    public final boolean h(int i, Rect rect) {
        wh whVar;
        ArrayList arrayList = new ArrayList();
        f(arrayList);
        pnt0 pnt0Var = new pnt0();
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            pnt0Var.d(((Integer) arrayList.get(i3)).intValue(), b(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.B;
        int i5 = Integer.MIN_VALUE;
        wh whVar2 = i4 == Integer.MIN_VALUE ? null : (wh) pnt0Var.b(i4);
        int i6 = -1;
        View view = this.y;
        if (i == 1 || i == 2) {
            whVar = (wh) ira1.e(pnt0Var, F, E, whVar2, i, view.getLayoutDirection() == 1);
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                ny61.g("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i7 = this.B;
            if (i7 != Integer.MIN_VALUE) {
                i(i7).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        ny61.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            whVar = ira1.d(pnt0Var, F, E, whVar2, rect2, i);
        }
        if (whVar != null) {
            if (pnt0Var.a) {
                kp50.a(pnt0Var);
            }
            int i8 = pnt0Var.w;
            while (true) {
                if (i2 >= i8) {
                    break;
                }
                if (pnt0Var.c[i2] == whVar) {
                    i6 = i2;
                    break;
                }
                i2++;
            }
            i5 = pnt0Var.c(i6);
        }
        return o(i5);
    }

    public final wh i(int i) {
        if (i != -1) {
            return b(i);
        }
        View view = this.y;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
        wh whVar = new wh(obtain);
        WeakHashMap weakHashMap = b.a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        f(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            kbs.g("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            whVar.a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return whVar;
    }

    public final void j(boolean z, int i, Rect rect) {
        int i2 = this.B;
        if (i2 != Integer.MIN_VALUE) {
            a(i2);
        }
        if (z) {
            h(i, rect);
        }
    }

    public abstract boolean k(int i, int i2, Bundle bundle);

    public void l(wh whVar) {
    }

    public abstract void m(int i, wh whVar);

    public void n(int i, boolean z) {
    }

    public final boolean o(int i) {
        int i2;
        View view = this.y;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.B) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            a(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.B = i;
        n(i, true);
        p(i, 8);
        return true;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        l(whVar);
    }

    public final void p(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.x.isEnabled() || (parent = (view = this.y).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, createEvent(i, i2));
    }
}
