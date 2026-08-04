package com.gamericefishpro.space.k4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.e4.h;
import com.gamericefishpro.space.i2.u;
import com.gamericefishpro.space.ka.f;
import com.gamericefishpro.space.t.r;
import com.gamericefishpro.space.t.s0;
import com.gamericefishpro.space.v8.l;
import com.google.android.material.chip.Chip;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends com.gamericefishpro.space.d4.b {
    public static final Rect G = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final l H = new l(6);
    public static final f I = new f(7);
    public final AccessibilityManager A;
    public final Chip B;
    public u C;
    public final Rect v = new Rect();
    public final Rect w = new Rect();
    public final Rect y = new Rect();
    public final int[] z = new int[2];
    public int D = Integer.MIN_VALUE;
    public int E = Integer.MIN_VALUE;
    public int F = Integer.MIN_VALUE;

    public a(Chip chip) {
        this.B = chip;
        this.A = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        Field field = l0.a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // com.gamericefishpro.space.d4.b
    public final com.gamericefishpro.space.vb.c b(View view) {
        if (this.C == null) {
            this.C = new u(this, 1);
        }
        return this.C;
    }

    @Override // com.gamericefishpro.space.d4.b
    public final void d(View view, h hVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.a;
        this.d.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((com.gamericefishpro.space.aa.d) this).J;
        com.gamericefishpro.space.aa.f fVar = chip.w;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.s0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        hVar.i(chip.getAccessibilityClassName());
        hVar.k(chip.getText());
    }

    public final boolean j(int i) {
        if (this.E != i) {
            return false;
        }
        this.E = Integer.MIN_VALUE;
        p(i, false);
        r(i, 8);
        return true;
    }

    public final h k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        h hVar = new h(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        hVar.i("android.view.View");
        Rect rect = G;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        hVar.b = -1;
        Chip chip = this.B;
        accessibilityNodeInfoObtain.setParent(chip);
        o(i, hVar);
        if (hVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.w;
        hVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        hVar.c = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.D == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            hVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            hVar.a(64);
        }
        boolean z = this.E == i;
        if (z) {
            hVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            hVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.z;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.v;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            hVar.f(rect3);
            if (hVar.b != -1) {
                h hVar2 = new h(AccessibilityNodeInfo.obtain());
                for (int i2 = hVar.b; i2 != -1; i2 = hVar2.b) {
                    hVar2.b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = hVar2.a;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i2, hVar2);
                    hVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.y;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = hVar.a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfo2.setVisibleToUser(true);
                    }
                }
            }
        }
        return hVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Code duplicated, block: B:118:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0131  */
    /* JADX WARN: Code duplicated, block: B:68:0x014f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a9  */
    public final boolean m(int i, Rect rect) {
        int i2;
        int i3;
        Object obj;
        h hVar;
        int i4;
        int iD;
        int i5;
        Rect rect2;
        int iF;
        Rect rect3;
        int i6;
        h hVar2;
        int i7;
        int iA;
        int iB;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        s0 s0Var = new s0(0);
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            s0Var.e(((Integer) arrayList.get(i8)).intValue(), k(((Integer) arrayList.get(i8)).intValue()));
        }
        int i9 = this.E;
        h hVar3 = i9 == Integer.MIN_VALUE ? null : (h) s0Var.c(i9);
        l lVar = H;
        f fVar = I;
        Chip chip = this.B;
        if (i == 1 || i == 2) {
            i2 = 0;
            i3 = -1;
            Field field = l0.a;
            boolean z = chip.getLayoutDirection() == 1;
            fVar.getClass();
            int iF2 = s0Var.f();
            ArrayList arrayList2 = new ArrayList(iF2);
            for (int i10 = 0; i10 < iF2; i10++) {
                arrayList2.add((h) s0Var.g(i10));
            }
            Collections.sort(arrayList2, new b(z, lVar));
            if (i == 1) {
                int size = arrayList2.size();
                if (hVar3 != null) {
                    size = arrayList2.indexOf(hVar3);
                }
                int i11 = size - 1;
                if (i11 >= 0) {
                    obj = arrayList2.get(i11);
                } else {
                    obj = null;
                }
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (hVar3 == null ? -1 : arrayList2.lastIndexOf(hVar3)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            hVar = (h) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i12 = this.E;
            if (i12 != Integer.MIN_VALUE) {
                n(i12).f(rect4);
            } else {
                if (rect != null) {
                    rect4.set(rect);
                } else {
                    int width = chip.getWidth();
                    int height = chip.getHeight();
                    if (i == 17) {
                        i5 = -1;
                        rect4.set(width, 0, width, height);
                    } else if (i == 33) {
                        i5 = -1;
                        rect4.set(0, height, width, height);
                    } else if (i == 66) {
                        i5 = -1;
                        rect4.set(-1, 0, -1, height);
                    } else {
                        if (i != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i5 = -1;
                        rect4.set(0, -1, width, -1);
                    }
                }
                rect2 = new Rect(rect4);
                if (i != 17) {
                    i2 = 0;
                    rect2.offset(rect4.width() + 1, 0);
                } else if (i != 33) {
                    i2 = 0;
                    rect2.offset(0, rect4.height() + 1);
                } else if (i != 66) {
                    i2 = 0;
                    rect2.offset(-(rect4.width() + 1), 0);
                } else {
                    if (i == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i2 = 0;
                    rect2.offset(0, -(rect4.height() + 1));
                }
                fVar.getClass();
                iF = s0Var.f();
                rect3 = new Rect();
                hVar = null;
                for (i6 = i2; i6 < iF; i6++) {
                    hVar2 = (h) s0Var.g(i6);
                    if (hVar2 == hVar3) {
                        lVar.getClass();
                        hVar2.f(rect3);
                        if (com.gamericefishpro.space.b9.a.x(i, rect4, rect3)) {
                            if (com.gamericefishpro.space.b9.a.x(i, rect4, rect2) || com.gamericefishpro.space.b9.a.f(i, rect4, rect3, rect2)) {
                                rect2.set(rect3);
                                hVar = hVar2;
                            } else if (com.gamericefishpro.space.b9.a.f(i, rect4, rect2, rect3)) {
                                int iA2 = com.gamericefishpro.space.b9.a.A(i, rect4, rect3);
                                int iB2 = com.gamericefishpro.space.b9.a.B(i, rect4, rect3);
                                i7 = (iB2 * iB2) + (iA2 * 13 * iA2);
                                iA = com.gamericefishpro.space.b9.a.A(i, rect4, rect2);
                                iB = com.gamericefishpro.space.b9.a.B(i, rect4, rect2);
                                if (i7 < (iB * iB) + (iA * 13 * iA)) {
                                    rect2.set(rect3);
                                    hVar = hVar2;
                                }
                            }
                        }
                    }
                }
                i3 = i5;
            }
            i5 = -1;
            rect2 = new Rect(rect4);
            if (i != 17) {
                i2 = 0;
                rect2.offset(rect4.width() + 1, 0);
            } else if (i != 33) {
                i2 = 0;
                rect2.offset(0, rect4.height() + 1);
            } else if (i != 66) {
                i2 = 0;
                rect2.offset(-(rect4.width() + 1), 0);
            } else {
                if (i == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                i2 = 0;
                rect2.offset(0, -(rect4.height() + 1));
            }
            fVar.getClass();
            iF = s0Var.f();
            rect3 = new Rect();
            hVar = null;
            while (i6 < iF) {
                hVar2 = (h) s0Var.g(i6);
                if (hVar2 == hVar3) {
                    lVar.getClass();
                    hVar2.f(rect3);
                    if (com.gamericefishpro.space.b9.a.x(i, rect4, rect3)) {
                        if (com.gamericefishpro.space.b9.a.x(i, rect4, rect2)) {
                            rect2.set(rect3);
                            hVar = hVar2;
                        } else if (com.gamericefishpro.space.b9.a.f(i, rect4, rect2, rect3)) {
                            int iA3 = com.gamericefishpro.space.b9.a.A(i, rect4, rect3);
                            int iB3 = com.gamericefishpro.space.b9.a.B(i, rect4, rect3);
                            i7 = (iB3 * iB3) + (iA3 * 13 * iA3);
                            iA = com.gamericefishpro.space.b9.a.A(i, rect4, rect2);
                            iB = com.gamericefishpro.space.b9.a.B(i, rect4, rect2);
                            if (i7 < (iB * iB) + (iA * 13 * iA)) {
                                rect2.set(rect3);
                                hVar = hVar2;
                            }
                        }
                    }
                }
            }
            i3 = i5;
        }
        h hVar4 = hVar;
        if (hVar4 == null) {
            iD = Integer.MIN_VALUE;
        } else {
            if (s0Var.d) {
                r.a(s0Var);
            }
            int i13 = s0Var.v;
            int i14 = i2;
            while (true) {
                if (i14 >= i13) {
                    i4 = i3;
                    break;
                }
                if (s0Var.i[i14] == hVar4) {
                    i4 = i14;
                    break;
                }
                i14++;
            }
            iD = s0Var.d(i4);
        }
        return q(iD);
    }

    public final h n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.B;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        h hVar = new h(accessibilityNodeInfoObtain);
        Field field = l0.a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            hVar.a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return hVar;
    }

    public abstract void o(int i, h hVar);

    public abstract void p(int i, boolean z);

    public final boolean q(int i) {
        int i2;
        Chip chip = this.B;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.E) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.E = i;
        p(i, true);
        r(i, 8);
        return true;
    }

    public final void r(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.A.isEnabled() || (parent = (view = this.B).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            h hVarN = n(i);
            accessibilityEventObtain.getText().add(hVarN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = hVarN.a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
