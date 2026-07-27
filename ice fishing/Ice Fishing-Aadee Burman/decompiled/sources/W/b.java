package W;

import O.C0323b;
import O.X;
import P.k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import g1.C4522b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import s.l;
import t3.f;

/* loaded from: classes.dex */
public abstract class b extends C0323b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f3362n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final a4.e f3363o = new a4.e();

    /* renamed from: p, reason: collision with root package name */
    public static final E3.e f3364p = new E3.e();

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f3369h;
    public final Chip i;

    /* renamed from: j, reason: collision with root package name */
    public a f3370j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f3365d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f3366e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f3367f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3368g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f3371k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f3372l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f3373m = Integer.MIN_VALUE;

    public b(Chip chip) {
        this.i = chip;
        this.f3369h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = X.f2054a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // O.C0323b
    public final C4522b b(View view) {
        if (this.f3370j == null) {
            this.f3370j = new a(this);
        }
        return this.f3370j;
    }

    @Override // O.C0323b
    public final void d(View view, k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2062a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2409a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((t3.d) this).f40861q;
        f fVar = chip.f35929x;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.f40918w0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        kVar.i(chip.getAccessibilityClassName());
        kVar.l(chip.getText());
    }

    public final boolean j(int i) {
        if (this.f3372l != i) {
            return false;
        }
        this.f3372l = Integer.MIN_VALUE;
        t3.d dVar = (t3.d) this;
        if (i == 1) {
            Chip chip = dVar.f40861q;
            chip.f35920F = false;
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
        Rect rect = f3362n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        obtain.setParent(chip);
        o(i, kVar);
        if (kVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f3366e;
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
        kVar.f2410b = i;
        obtain.setSource(chip, i);
        if (this.f3371k == i) {
            obtain.setAccessibilityFocused(true);
            kVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            kVar.a(64);
        }
        boolean z3 = this.f3372l == i;
        if (z3) {
            kVar.a(2);
        } else if (obtain.isFocusable()) {
            kVar.a(1);
        }
        obtain.setFocused(z3);
        int[] iArr = this.f3368g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f3365d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            kVar.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f3367f;
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
                            kVar.f2409a.setVisibleToUser(true);
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
        int i6;
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
        int i14 = this.f3372l;
        int i15 = Integer.MIN_VALUE;
        k kVar2 = i14 == Integer.MIN_VALUE ? null : (k) lVar.b(i14, null);
        a4.e eVar = f3363o;
        E3.e eVar2 = f3364p;
        Chip chip = this.i;
        if (i == 1 || i == 2) {
            i6 = 0;
            i9 = -1;
            WeakHashMap weakHashMap = X.f2054a;
            boolean z3 = chip.getLayoutDirection() == 1;
            eVar2.getClass();
            int i16 = lVar.f40441v;
            ArrayList arrayList2 = new ArrayList(i16);
            for (int i17 = 0; i17 < i16; i17++) {
                arrayList2.add((k) lVar.f40440u[i17]);
            }
            Collections.sort(arrayList2, new c(z3, eVar));
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
            int i19 = this.f3372l;
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
                    i6 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i == 33) {
                    i6 = 0;
                    rect3.offset(0, rect2.height() + 1);
                } else if (i == 66) {
                    i6 = 0;
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i6 = 0;
                    rect3.offset(0, -(rect2.height() + 1));
                }
                eVar2.getClass();
                i11 = lVar.f40441v;
                Rect rect4 = new Rect();
                kVar = null;
                for (i12 = i6; i12 < i11; i12++) {
                    k kVar3 = (k) lVar.f40440u[i12];
                    if (kVar3 != kVar2) {
                        eVar.getClass();
                        kVar3.f(rect4);
                        if (A8.b.m(i, rect2, rect4)) {
                            if (A8.b.m(i, rect2, rect3) && !A8.b.a(i, rect2, rect4, rect3)) {
                                if (!A8.b.a(i, rect2, rect3, rect4)) {
                                    int n9 = A8.b.n(i, rect2, rect4);
                                    int o6 = A8.b.o(i, rect2, rect4);
                                    int i20 = (o6 * o6) + (n9 * 13 * n9);
                                    int n10 = A8.b.n(i, rect2, rect3);
                                    int o9 = A8.b.o(i, rect2, rect3);
                                    if (i20 >= (o9 * o9) + (n10 * 13 * n10)) {
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
            eVar2.getClass();
            i11 = lVar.f40441v;
            Rect rect42 = new Rect();
            kVar = null;
            while (i12 < i11) {
            }
        }
        k kVar4 = kVar;
        if (kVar4 != null) {
            int i21 = i6;
            while (true) {
                if (i21 >= lVar.f40441v) {
                    i10 = i9;
                    break;
                }
                if (lVar.f40440u[i21] == kVar4) {
                    i10 = i21;
                    break;
                }
                i21++;
            }
            i15 = lVar.f40439n[i10];
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
        WeakHashMap weakHashMap = X.f2054a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            kVar.f2409a.addChild(chip, ((Integer) arrayList.get(i6)).intValue());
        }
        return kVar;
    }

    public abstract void o(int i, k kVar);

    public final boolean p(int i) {
        int i6;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i6 = this.f3372l) == i) {
            return false;
        }
        if (i6 != Integer.MIN_VALUE) {
            j(i6);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f3372l = i;
        t3.d dVar = (t3.d) this;
        if (i == 1) {
            Chip chip2 = dVar.f40861q;
            chip2.f35920F = true;
            chip2.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final void q(int i, int i6) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.f3369h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i6);
            k n9 = n(i);
            obtain.getText().add(n9.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n9.f2409a;
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
            obtain = AccessibilityEvent.obtain(i6);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
