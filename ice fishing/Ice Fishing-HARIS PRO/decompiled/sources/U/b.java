package U;

import O.C0026b;
import O.K;
import P.f;
import R.j;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import r.AbstractC0341i;
import r.C0343k;

/* loaded from: classes.dex */
public abstract class b extends C0026b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f1158n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final S0.e f1159o = new S0.e(6);

    /* renamed from: p, reason: collision with root package name */
    public static final S0.e f1160p = new S0.e(7);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f1164h;
    public final Chip i;
    public a j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f1161d = new Rect();
    public final Rect e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f1162f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1163g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f1165k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f1166l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f1167m = Integer.MIN_VALUE;

    public b(Chip chip) {
        if (chip == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = chip;
        this.f1164h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = K.f747a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // O.C0026b
    public final B.b b(View view) {
        if (this.j == null) {
            this.j = new a(this);
        }
        return this.j;
    }

    @Override // O.C0026b
    public final void d(View view, f fVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f785a;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f891a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((G0.d) this).f282q;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        fVar.h(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    public final boolean j(int i) {
        if (this.f1166l != i) {
            return false;
        }
        this.f1166l = Integer.MIN_VALUE;
        G0.d dVar = (G0.d) this;
        if (i == 1) {
            Chip chip = dVar.f282q;
            chip.f2456m = false;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final f k(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        f fVar = new f(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        fVar.h("android.view.View");
        Rect rect = f1158n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        obtain.setParent(chip);
        o(i, fVar);
        if (fVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        fVar.f(rect2);
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
        fVar.f892b = i;
        obtain.setSource(chip, i);
        if (this.f1165k == i) {
            obtain.setAccessibilityFocused(true);
            fVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            fVar.a(64);
        }
        boolean z2 = this.f1166l == i;
        if (z2) {
            fVar.a(2);
        } else if (obtain.isFocusable()) {
            fVar.a(1);
        }
        obtain.setFocused(z2);
        int[] iArr = this.f1163g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f1161d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            fVar.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f1162f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                obtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= RecyclerView.f2111C0 || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            fVar.f891a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return fVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(int i, Rect rect) {
        int i2;
        int i3;
        Object obj;
        f fVar;
        int i4;
        int e;
        int i5;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        C0343k c0343k = new C0343k(0);
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            c0343k.d(((Integer) arrayList.get(i6)).intValue(), k(((Integer) arrayList.get(i6)).intValue()));
        }
        int i7 = this.f1166l;
        int i8 = Integer.MIN_VALUE;
        f fVar2 = i7 == Integer.MIN_VALUE ? null : (f) c0343k.b(i7);
        S0.e eVar = f1159o;
        S0.e eVar2 = f1160p;
        Chip chip = this.i;
        if (i == 1 || i == 2) {
            i2 = 0;
            i3 = -1;
            WeakHashMap weakHashMap = K.f747a;
            boolean z2 = chip.getLayoutDirection() == 1;
            eVar2.getClass();
            int e2 = c0343k.e();
            ArrayList arrayList2 = new ArrayList(e2);
            for (int i9 = 0; i9 < e2; i9++) {
                arrayList2.add((f) c0343k.f(i9));
            }
            Collections.sort(arrayList2, new c(z2, eVar));
            if (i == 1) {
                int size = arrayList2.size();
                if (fVar2 != null) {
                    size = arrayList2.indexOf(fVar2);
                }
                int i10 = size - 1;
                if (i10 >= 0) {
                    obj = arrayList2.get(i10);
                    fVar = (f) obj;
                }
                obj = null;
                fVar = (f) obj;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (fVar2 == null ? -1 : arrayList2.lastIndexOf(fVar2)) + 1;
                if (lastIndexOf < size2) {
                    obj = arrayList2.get(lastIndexOf);
                    fVar = (f) obj;
                }
                obj = null;
                fVar = (f) obj;
            }
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i11 = this.f1166l;
            if (i11 != Integer.MIN_VALUE) {
                n(i11).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    i3 = -1;
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    i3 = -1;
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                    i3 = -1;
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                    i3 = -1;
                }
                Rect rect3 = new Rect(rect2);
                if (i != 17) {
                    i2 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i == 33) {
                    i2 = 0;
                    rect3.offset(0, rect2.height() + 1);
                } else if (i == 66) {
                    i2 = 0;
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i2 = 0;
                    rect3.offset(0, -(rect2.height() + 1));
                }
                eVar2.getClass();
                e = c0343k.e();
                Rect rect4 = new Rect();
                fVar = null;
                for (i5 = i2; i5 < e; i5++) {
                    f fVar3 = (f) c0343k.f(i5);
                    if (fVar3 != fVar2) {
                        eVar.getClass();
                        fVar3.f(rect4);
                        if (j.L(i, rect2, rect4)) {
                            if (j.L(i, rect2, rect3) && !j.g(i, rect2, rect4, rect3)) {
                                if (!j.g(i, rect2, rect3, rect4)) {
                                    int Q2 = j.Q(i, rect2, rect4);
                                    int R2 = j.R(i, rect2, rect4);
                                    int i12 = (R2 * R2) + (Q2 * 13 * Q2);
                                    int Q3 = j.Q(i, rect2, rect3);
                                    int R3 = j.R(i, rect2, rect3);
                                    if (i12 >= (R3 * R3) + (Q3 * 13 * Q3)) {
                                    }
                                }
                            }
                            rect3.set(rect4);
                            fVar = fVar3;
                        }
                    }
                }
            }
            i3 = -1;
            Rect rect32 = new Rect(rect2);
            if (i != 17) {
            }
            eVar2.getClass();
            e = c0343k.e();
            Rect rect42 = new Rect();
            fVar = null;
            while (i5 < e) {
            }
        }
        f fVar4 = fVar;
        if (fVar4 != null) {
            if (c0343k.f4323a) {
                AbstractC0341i.a(c0343k);
            }
            int i13 = c0343k.f4326d;
            int i14 = i2;
            while (true) {
                if (i14 >= i13) {
                    i4 = i3;
                    break;
                }
                if (c0343k.f4325c[i14] == fVar4) {
                    i4 = i14;
                    break;
                }
                i14++;
            }
            i8 = c0343k.c(i4);
        }
        return p(i8);
    }

    public final f n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        f fVar = new f(obtain);
        WeakHashMap weakHashMap = K.f747a;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            fVar.f891a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return fVar;
    }

    public abstract void o(int i, f fVar);

    public final boolean p(int i) {
        int i2;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.f1166l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f1166l = i;
        G0.d dVar = (G0.d) this;
        if (i == 1) {
            Chip chip2 = dVar.f282q;
            chip2.f2456m = true;
            chip2.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final void q(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.f1164h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            f n2 = n(i);
            obtain.getText().add(n2.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n2.f891a;
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
            obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
