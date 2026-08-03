package y1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: f, reason: collision with root package name */
    public static final sc.b f8498f = new sc.b(2);

    /* renamed from: a, reason: collision with root package name */
    public final Rect f8499a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f8500b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final Rect f8501c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public final c1 f8502d = new c1(new x7.f());

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f8503e = new ArrayList();

    public static void d(ViewGroup viewGroup, Rect rect) {
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        int width = viewGroup.getWidth() + viewGroup.getScrollX();
        rect.set(width, height, width, height);
    }

    public final View a(int i10, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        int indexOf;
        int lastIndexOf;
        int i11;
        Rect rect2 = this.f8499a;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 17 || i10 == 33) {
                    d(viewGroup, rect2);
                } else if (i10 == 66 || i10 == 130) {
                    int scrollY = viewGroup.getScrollY();
                    int scrollX = viewGroup.getScrollX();
                    rect2.set(scrollX, scrollY, scrollX, scrollY);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                d(viewGroup, rect2);
            } else {
                int scrollY2 = viewGroup.getScrollY();
                int scrollX2 = viewGroup.getScrollX();
                rect2.set(scrollX2, scrollY2, scrollX2, scrollY2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            int scrollY3 = viewGroup.getScrollY();
            int scrollX3 = viewGroup.getScrollX();
            rect2.set(scrollX3, scrollY3, scrollX3, scrollY3);
        } else {
            d(viewGroup, rect2);
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 == 17 || i10 == 33 || i10 == 66 || i10 == 130) {
                return c(i10, rect2, view, viewGroup, arrayList);
            }
            throw new IllegalArgumentException(a4.d.g("Unknown direction: ", i10));
        }
        c1 c1Var = this.f8502d;
        try {
            c1Var.a(arrayList, viewGroup);
            Collections.sort(arrayList, c1Var);
            c1Var.f8490c.a();
            c1Var.f8489b.b();
            c1Var.f8491d.a();
            c1Var.f8488a.a();
            int size = arrayList.size();
            View view2 = null;
            if (size < 2) {
                return null;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 17 || i10 == 33 || i10 == 66 || i10 == 130) {
                        view2 = c(i10, this.f8499a, view, viewGroup, arrayList);
                    }
                } else if (size >= 2) {
                    view2 = (view == null || (lastIndexOf = arrayList.lastIndexOf(view)) < 0 || (i11 = lastIndexOf + 1) >= size) ? (View) arrayList.get(0) : (View) arrayList.get(i11);
                }
            } else if (size >= 2) {
                view2 = (view == null || (indexOf = arrayList.indexOf(view)) <= 0) ? (View) arrayList.get(size - 1) : (View) arrayList.get(indexOf - 1);
            }
            return view2 == null ? (View) arrayList.get(size - 1) : view2;
        } catch (Throwable th) {
            c1Var.f8490c.a();
            c1Var.f8489b.b();
            c1Var.f8491d.a();
            c1Var.f8488a.a();
            throw th;
        }
    }

    public final View b(int i10, View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View view2 = null;
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent != viewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                } else if (viewGroup3 != null) {
                    viewGroup2 = viewGroup3;
                }
            }
        }
        viewGroup2 = viewGroup;
        View g8 = e0.g(view, viewGroup2, i10);
        boolean z10 = true;
        View view3 = g8;
        while (g8 != null) {
            if (g8.isFocusable() && g8.getVisibility() == 0 && (!g8.isInTouchMode() || g8.isFocusableInTouchMode())) {
                view2 = g8;
                break;
            }
            g8 = e0.g(g8, viewGroup2, i10);
            boolean z11 = !z10;
            if (!z10) {
                view3 = view3 != null ? e0.g(view3, viewGroup2, i10) : null;
                if (view3 == g8) {
                    break;
                }
            }
            z10 = z11;
        }
        if (view2 != null) {
            return view2;
        }
        ArrayList<View> arrayList = this.f8503e;
        try {
            arrayList.clear();
            viewGroup2.addFocusables(arrayList, i10, viewGroup2.isInTouchMode() ? 1 : 0);
            if (!arrayList.isEmpty()) {
                view2 = a(i10, null, view, viewGroup2, arrayList);
            }
            arrayList.clear();
            return view2;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final View c(int i10, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        Rect rect2 = this.f8500b;
        rect2.set(rect);
        if (i10 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i10 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i10 == 66) {
            rect2.offset((-rect.width()) - 1, 0);
        } else if (i10 == 130) {
            rect2.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = (View) arrayList.get(i11);
            if (!pc.j.a(view3, view) && !pc.j.a(view3, viewGroup)) {
                Rect rect3 = this.f8501c;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                e1.c u10 = f1.d0.u(rect3);
                e1.c u11 = f1.d0.u(rect2);
                e1.c u12 = f1.d0.u(rect);
                d1.b B = d1.e.B(i10);
                if (d1.e.o(u10, u11, u12, B != null ? B.f1568a : 1)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }
}
