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
import androidx.core.view.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class kzb extends a {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final rwd o;
    public static final kjn p;
    public final AccessibilityManager h;
    public final View i;
    public ue0 j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    static {
        int i = 22;
        o = new rwd(i);
        p = new kjn(i);
    }

    public kzb(View view) {
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = wdu.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // androidx.core.view.a
    public final jzi b(View view) {
        if (this.j == null) {
            this.j = new ue0(this, 1);
        }
        return this.j;
    }

    @Override // androidx.core.view.a
    public void d(View view, vb vbVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
        v(vbVar);
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        x(i, false);
        z(i, 8);
        return true;
    }

    public final AccessibilityEvent k(int i, int i2) {
        View view = this.i;
        if (i == -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i2);
        vb s = s(i);
        obtain2.getText().add(s.g());
        AccessibilityNodeInfo accessibilityNodeInfo = s.a;
        obtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        obtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        obtain2.setPassword(accessibilityNodeInfo.isPassword());
        obtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        obtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            wvs.p("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            return null;
        }
        obtain2.setClassName(accessibilityNodeInfo.getClassName());
        obtain2.setSource(view, i);
        obtain2.setPackageName(view.getContext().getPackageName());
        return obtain2;
    }

    public final vb l(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        vb vbVar = new vb(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        vbVar.n("android.view.View");
        Rect rect = n;
        vbVar.k(rect);
        obtain.setBoundsInScreen(rect);
        vbVar.b = -1;
        View view = this.i;
        obtain.setParent(view);
        w(i, vbVar);
        if (vbVar.g() == null && obtain.getContentDescription() == null) {
            wvs.p("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.e;
        vbVar.f(rect2);
        if (rect2.equals(rect)) {
            wvs.p("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            wvs.p("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            wvs.p("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        obtain.setPackageName(view.getContext().getPackageName());
        vbVar.c = i;
        obtain.setSource(view, i);
        if (this.k == i) {
            obtain.setAccessibilityFocused(true);
            vbVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            vbVar.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            vbVar.a(2);
        } else if (obtain.isFocusable()) {
            vbVar.a(1);
        }
        obtain.setFocused(z);
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            vbVar.f(rect3);
            if (vbVar.b != -1) {
                vb vbVar2 = new vb(AccessibilityNodeInfo.obtain());
                for (int i2 = vbVar.b; i2 != -1; i2 = vbVar2.b) {
                    vbVar2.b = -1;
                    vbVar2.a.setParent(view, -1);
                    vbVar2.k(rect);
                    w(i2, vbVar2);
                    vbVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo = vbVar.a;
                accessibilityNodeInfo.setBoundsInScreen(rect3);
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
                            accessibilityNodeInfo.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return vbVar;
    }

    public final boolean m(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int o2 = o(motionEvent.getX(), motionEvent.getY());
            int i2 = this.m;
            if (i2 != o2) {
                this.m = o2;
                z(o2, 128);
                z(i2, 256);
            }
            if (o2 == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.m = Integer.MIN_VALUE;
                z(Integer.MIN_VALUE, 128);
                z(i, 256);
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean n(KeyEvent keyEvent) {
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
                                while (i < repeatCount && r(i2, null)) {
                                    i++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = this.l;
                    if (i3 != Integer.MIN_VALUE) {
                        u(i3, 16, null);
                    }
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return r(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return r(1, null);
                }
            }
        }
        return false;
    }

    public abstract int o(float f, float f2);

    public abstract void p(ArrayList arrayList);

    public final void q(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        AccessibilityEvent k = k(i, 2048);
        k.setContentChangeTypes(i2);
        parent.requestSendAccessibilityEvent(view, k);
    }

    public final boolean r(int i, Rect rect) {
        int i2;
        Object obj;
        vb vbVar;
        ArrayList arrayList = new ArrayList();
        p(arrayList);
        q4r q4rVar = new q4r(0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            q4rVar.e(((Integer) arrayList.get(i3)).intValue(), l(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.l;
        int i5 = Integer.MIN_VALUE;
        vb vbVar2 = i4 == Integer.MIN_VALUE ? null : (vb) q4rVar.c(i4);
        rwd rwdVar = o;
        kjn kjnVar = p;
        View view = this.i;
        int i6 = -1;
        if (i == 1 || i == 2) {
            WeakHashMap weakHashMap = wdu.a;
            boolean z = view.getLayoutDirection() == 1;
            kjnVar.getClass();
            int i7 = q4rVar.c;
            ArrayList arrayList2 = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                arrayList2.add((vb) q4rVar.f(i8));
            }
            Collections.sort(arrayList2, new cpc(z, rwdVar));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (vbVar2 != null) {
                    size = arrayList2.indexOf(vbVar2);
                }
                int i9 = size - 1;
                obj = i9 >= 0 ? arrayList2.get(i9) : null;
            } else {
                if (i != 2) {
                    xq0.x("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (vbVar2 == null ? -1 : arrayList2.lastIndexOf(vbVar2)) + 1;
                i2 = 0;
                obj = lastIndexOf < size2 ? arrayList2.get(lastIndexOf) : null;
            }
            vbVar = (vb) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                xq0.x("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i10 = this.l;
            if (i10 != Integer.MIN_VALUE) {
                s(i10).f(rect2);
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
                        xq0.x("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    xq0.x("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            kjnVar.getClass();
            int i11 = q4rVar.c;
            Rect rect4 = new Rect();
            vbVar = null;
            for (int i12 = 0; i12 < i11; i12++) {
                vb vbVar3 = (vb) q4rVar.f(i12);
                if (vbVar3 != vbVar2) {
                    rwdVar.getClass();
                    vbVar3.f(rect4);
                    if (j66.f0(i, rect2, rect4)) {
                        if (j66.f0(i, rect2, rect3) && !j66.K(i, rect2, rect4, rect3)) {
                            if (!j66.K(i, rect2, rect3, rect4)) {
                                int g0 = j66.g0(i, rect2, rect4);
                                int i0 = j66.i0(i, rect2, rect4);
                                int i13 = (i0 * i0) + (g0 * 13 * g0);
                                int g02 = j66.g0(i, rect2, rect3);
                                int i02 = j66.i0(i, rect2, rect3);
                                if (i13 >= (i02 * i02) + (g02 * 13 * g02)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        vbVar = vbVar3;
                    }
                }
            }
            i2 = 0;
        }
        vb vbVar4 = vbVar;
        if (vbVar4 != null) {
            int i14 = q4rVar.c;
            int i15 = i2;
            while (true) {
                if (i15 >= i14) {
                    break;
                }
                if (q4rVar.b[i15] == vbVar4) {
                    i6 = i15;
                    break;
                }
                i15++;
            }
            i5 = q4rVar.d(i6);
        }
        return y(i5);
    }

    public final vb s(int i) {
        if (i != -1) {
            return l(i);
        }
        View view = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
        vb vbVar = new vb(obtain);
        WeakHashMap weakHashMap = wdu.a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        p(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            wvs.p("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            vbVar.a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return vbVar;
    }

    public final void t(boolean z, int i, Rect rect) {
        int i2 = this.l;
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (z) {
            r(i, rect);
        }
    }

    public abstract boolean u(int i, int i2, Bundle bundle);

    public abstract void w(int i, vb vbVar);

    public final boolean y(int i) {
        int i2;
        View view = this.i;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        x(i, true);
        z(i, 8);
        return true;
    }

    public final void z(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i, i2));
    }

    public void v(vb vbVar) {
    }

    public void x(int i, boolean z) {
    }
}
