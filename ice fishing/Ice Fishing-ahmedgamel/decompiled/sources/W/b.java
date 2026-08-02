package W;

import N3.C;
import O.C0328b;
import O.X;
import O2.i;
import P.k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import i1.C4585b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import s.l;

/* loaded from: classes.dex */
public abstract class b extends C0328b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f3492n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final G3.e f3493o = new G3.e(10);

    /* renamed from: p, reason: collision with root package name */
    public static final i f3494p = new i(10);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f3499h;
    public final Chip i;

    /* renamed from: j, reason: collision with root package name */
    public a f3500j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f3495d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f3496e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f3497f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3498g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f3501k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f3502l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f3503m = Integer.MIN_VALUE;

    public b(Chip chip) {
        this.i = chip;
        this.f3499h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = X.f2142a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // O.C0328b
    public final C4585b b(View view) {
        if (this.f3500j == null) {
            this.f3500j = new a(this);
        }
        return this.f3500j;
    }

    @Override // O.C0328b
    public final void d(View view, k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2150a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2340a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((v3.c) this).f41149q;
        v3.e eVar = chip.f36697x;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.f41200r0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        kVar.i(chip.getAccessibilityClassName());
        kVar.l(chip.getText());
    }

    public final boolean j(int i) {
        if (this.f3502l != i) {
            return false;
        }
        this.f3502l = Integer.MIN_VALUE;
        v3.c cVar = (v3.c) this;
        if (i == 1) {
            Chip chip = cVar.f41149q;
            chip.f36688F = false;
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
        Rect rect = f3492n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        obtain.setParent(chip);
        o(i, kVar);
        if (kVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f3496e;
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
        kVar.f2341b = i;
        obtain.setSource(chip, i);
        if (this.f3501k == i) {
            obtain.setAccessibilityFocused(true);
            kVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            kVar.a(64);
        }
        boolean z6 = this.f3502l == i;
        if (z6) {
            kVar.a(2);
        } else if (obtain.isFocusable()) {
            kVar.a(1);
        }
        obtain.setFocused(z6);
        int[] iArr = this.f3498g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f3495d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            kVar.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f3497f;
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
                            kVar.f2340a.setVisibleToUser(true);
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
        int i6;
        Object obj;
        k kVar;
        Object obj2;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        l lVar = new l();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            lVar.c(((Integer) arrayList.get(i12)).intValue(), k(((Integer) arrayList.get(i12)).intValue()));
        }
        int i13 = this.f3502l;
        int i14 = Integer.MIN_VALUE;
        k kVar2 = i13 == Integer.MIN_VALUE ? null : (k) lVar.b(i13, null);
        G3.e eVar = f3493o;
        i iVar = f3494p;
        Chip chip = this.i;
        if (i == 1 || i == 2) {
            i4 = 0;
            i6 = -1;
            WeakHashMap weakHashMap = X.f2142a;
            boolean z6 = chip.getLayoutDirection() == 1;
            iVar.getClass();
            int i15 = lVar.f40280v;
            ArrayList arrayList2 = new ArrayList(i15);
            for (int i16 = 0; i16 < i15; i16++) {
                arrayList2.add((k) lVar.f40279u[i16]);
            }
            Collections.sort(arrayList2, new c(z6, eVar));
            if (i == 1) {
                int size = arrayList2.size();
                if (kVar2 != null) {
                    size = arrayList2.indexOf(kVar2);
                }
                int i17 = size - 1;
                if (i17 >= 0) {
                    obj2 = arrayList2.get(i17);
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
            int i18 = this.f3502l;
            if (i18 != Integer.MIN_VALUE) {
                n(i18).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    i6 = -1;
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    i6 = -1;
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                    i6 = -1;
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                    i6 = -1;
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
                i10 = lVar.f40280v;
                Rect rect4 = new Rect();
                kVar = null;
                for (i11 = i4; i11 < i10; i11++) {
                    k kVar3 = (k) lVar.f40279u[i11];
                    if (kVar3 != kVar2) {
                        eVar.getClass();
                        kVar3.f(rect4);
                        if (C.L(i, rect2, rect4)) {
                            if (C.L(i, rect2, rect3) && !C.A(i, rect2, rect4, rect3)) {
                                if (!C.A(i, rect2, rect3, rect4)) {
                                    int P8 = C.P(i, rect2, rect4);
                                    int Q8 = C.Q(i, rect2, rect4);
                                    int i19 = (Q8 * Q8) + (P8 * 13 * P8);
                                    int P9 = C.P(i, rect2, rect3);
                                    int Q9 = C.Q(i, rect2, rect3);
                                    if (i19 >= (Q9 * Q9) + (P9 * 13 * P9)) {
                                    }
                                }
                            }
                            rect3.set(rect4);
                            kVar = kVar3;
                        }
                    }
                }
            }
            i6 = -1;
            Rect rect32 = new Rect(rect2);
            if (i != 17) {
            }
            iVar.getClass();
            i10 = lVar.f40280v;
            Rect rect42 = new Rect();
            kVar = null;
            while (i11 < i10) {
            }
        }
        k kVar4 = kVar;
        if (kVar4 != null) {
            int i20 = i4;
            while (true) {
                if (i20 >= lVar.f40280v) {
                    i9 = i6;
                    break;
                }
                if (lVar.f40279u[i20] == kVar4) {
                    i9 = i20;
                    break;
                }
                i20++;
            }
            i14 = lVar.f40278n[i9];
        }
        return p(i14);
    }

    public final k n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        k kVar = new k(obtain);
        WeakHashMap weakHashMap = X.f2142a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            kVar.f2340a.addChild(chip, ((Integer) arrayList.get(i4)).intValue());
        }
        return kVar;
    }

    public abstract void o(int i, k kVar);

    public final boolean p(int i) {
        int i4;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i4 = this.f3502l) == i) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            j(i4);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f3502l = i;
        v3.c cVar = (v3.c) this;
        if (i == 1) {
            Chip chip2 = cVar.f41149q;
            chip2.f36688F = true;
            chip2.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final void q(int i, int i4) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.f3499h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i4);
            k n9 = n(i);
            obtain.getText().add(n9.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n9.f2340a;
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
