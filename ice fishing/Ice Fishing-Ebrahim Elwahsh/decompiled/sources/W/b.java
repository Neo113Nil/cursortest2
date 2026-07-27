package W;

import L2.i;
import O.C0336b;
import O.X;
import P.k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bumptech.glide.h;
import com.google.android.material.chip.Chip;
import g1.C4524d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import r3.C4961d;
import r3.C4963f;
import s.l;

/* loaded from: classes.dex */
public abstract class b extends C0336b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f3374n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final C3.e f3375o = new C3.e();

    /* renamed from: p, reason: collision with root package name */
    public static final i f3376p = new i(8);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f3381h;
    public final Chip i;

    /* renamed from: j, reason: collision with root package name */
    public a f3382j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f3377d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f3378e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f3379f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3380g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f3383k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f3384l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f3385m = Integer.MIN_VALUE;

    public b(Chip chip) {
        this.i = chip;
        this.f3381h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = X.f2240a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // O.C0336b
    public final C4524d b(View view) {
        if (this.f3382j == null) {
            this.f3382j = new a(this);
        }
        return this.f3382j;
    }

    @Override // O.C0336b
    public final void d(View view, k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2248a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2675a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C4961d) this).f40285q;
        C4963f c4963f = chip.f36092x;
        accessibilityNodeInfo.setCheckable(c4963f != null && c4963f.f40342w0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        kVar.i(chip.getAccessibilityClassName());
        kVar.l(chip.getText());
    }

    public final boolean j(int i) {
        if (this.f3384l != i) {
            return false;
        }
        this.f3384l = Integer.MIN_VALUE;
        C4961d c4961d = (C4961d) this;
        if (i == 1) {
            Chip chip = c4961d.f40285q;
            chip.f36083F = false;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final k k(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        k kVar = new k(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        kVar.i("android.view.View");
        Rect rect = f3374n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        obtain.setParent(chip);
        o(i, kVar);
        if (kVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f3378e;
        kVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(chip.getContext().getPackageName());
        kVar.f2676b = i;
        obtain.setSource(chip, i);
        if (this.f3383k == i) {
            obtain.setAccessibilityFocused(true);
            kVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            kVar.a(64);
        }
        boolean z8 = this.f3384l == i;
        if (z8) {
            kVar.a(2);
        } else if (obtain.isFocusable()) {
            kVar.a(1);
        }
        obtain.setFocused(z8);
        int[] iArr = this.f3380g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f3377d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            kVar.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f3379f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                obtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            kVar.f2675a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return kVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(int i, Rect rect) {
        int i4;
        int i9;
        Object obj;
        k kVar;
        Object obj2;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        l lVar = new l();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            lVar.c(((Integer) arrayList.get(i13)).intValue(), k(((Integer) arrayList.get(i13)).intValue()));
        }
        int i14 = this.f3384l;
        int i15 = Integer.MIN_VALUE;
        k kVar2 = i14 == Integer.MIN_VALUE ? null : (k) lVar.b(i14, null);
        C3.e eVar = f3375o;
        i iVar = f3376p;
        Chip chip = this.i;
        if (i == 1 || i == 2) {
            i4 = 0;
            i9 = -1;
            WeakHashMap weakHashMap = X.f2240a;
            boolean z8 = chip.getLayoutDirection() == 1;
            iVar.getClass();
            int i16 = lVar.f40413v;
            ArrayList arrayList2 = new ArrayList(i16);
            for (int i17 = 0; i17 < i16; i17++) {
                arrayList2.add((k) lVar.f40412u[i17]);
            }
            Collections.sort(arrayList2, new c(z8, eVar));
            if (i == 1) {
                int size = arrayList2.size();
                if (kVar2 != null) {
                    size = arrayList2.indexOf(kVar2);
                }
                int i18 = size - 1;
                if (i18 >= 0) {
                    obj2 = arrayList2.get(i18);
                    obj = obj2;
                }
                obj = null;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (kVar2 == null ? -1 : arrayList2.lastIndexOf(kVar2)) + 1;
                if (lastIndexOf < size2) {
                    obj2 = arrayList2.get(lastIndexOf);
                    obj = obj2;
                }
                obj = null;
            }
            kVar = (k) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i19 = this.f3384l;
            if (i19 != Integer.MIN_VALUE) {
                n(i19).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    i9 = -1;
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    i9 = -1;
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                    i9 = -1;
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                    i9 = -1;
                }
                Rect rect3 = new Rect(rect2);
                if (i != 17) {
                    i4 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i == 33) {
                    i4 = 0;
                    rect3.offset(0, rect2.height() + 1);
                } else if (i == 66) {
                    i4 = 0;
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i4 = 0;
                    rect3.offset(0, -(rect2.height() + 1));
                }
                iVar.getClass();
                i11 = lVar.f40413v;
                Rect rect4 = new Rect();
                kVar = null;
                for (i12 = i4; i12 < i11; i12++) {
                    k kVar3 = (k) lVar.f40412u[i12];
                    if (kVar3 != kVar2) {
                        eVar.getClass();
                        kVar3.f(rect4);
                        if (h.q(i, rect2, rect4)) {
                            if (h.q(i, rect2, rect3) && !h.b(i, rect2, rect4, rect3)) {
                                if (!h.b(i, rect2, rect3, rect4)) {
                                    int v6 = h.v(i, rect2, rect4);
                                    int w9 = h.w(i, rect2, rect4);
                                    int i20 = (w9 * w9) + (v6 * 13 * v6);
                                    int v9 = h.v(i, rect2, rect3);
                                    int w10 = h.w(i, rect2, rect3);
                                    if (i20 >= (w10 * w10) + (v9 * 13 * v9)) {
                                    }
                                }
                            }
                            rect3.set(rect4);
                            kVar = kVar3;
                        }
                    }
                }
            }
            i9 = -1;
            Rect rect32 = new Rect(rect2);
            if (i != 17) {
            }
            iVar.getClass();
            i11 = lVar.f40413v;
            Rect rect42 = new Rect();
            kVar = null;
            while (i12 < i11) {
            }
        }
        k kVar4 = kVar;
        if (kVar4 != null) {
            int i21 = i4;
            while (true) {
                if (i21 >= lVar.f40413v) {
                    i10 = i9;
                    break;
                }
                if (lVar.f40412u[i21] == kVar4) {
                    i10 = i21;
                    break;
                }
                i21++;
            }
            i15 = lVar.f40411n[i10];
        }
        return p(i15);
    }

    public final k n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        k kVar = new k(obtain);
        WeakHashMap weakHashMap = X.f2240a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            kVar.f2675a.addChild(chip, ((Integer) arrayList.get(i4)).intValue());
        }
        return kVar;
    }

    public abstract void o(int i, k kVar);

    public final boolean p(int i) {
        int i4;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i4 = this.f3384l) == i) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            j(i4);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f3384l = i;
        C4961d c4961d = (C4961d) this;
        if (i == 1) {
            Chip chip2 = c4961d.f40285q;
            chip2.f36083F = true;
            chip2.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final void q(int i, int i4) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.f3381h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i4);
            k n9 = n(i);
            obtain.getText().add(n9.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n9.f2675a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i4);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
