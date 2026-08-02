package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import java.util.Iterator;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public interface y09 {
    /* renamed from: a */
    HashSet getO();

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    default void b(View view, int i, int i2, int i3, int i4, boolean z) {
        xzb xzbVar;
        int i5;
        int i6;
        Object a;
        o09 o09Var;
        Object a2;
        jc8 jc8Var;
        int s = s();
        int measuredWidth = (getM().getMeasuredWidth() - getM().getPaddingLeft()) - getM().getPaddingRight();
        int measuredHeight = (getM().getMeasuredHeight() - getM().getPaddingTop()) - getM().getPaddingBottom();
        if (s == 0 ? getM().getMeasuredHeight() == 0 || measuredHeight == 0 || view.getMeasuredHeight() == 0 : s == 1 && (getM().getMeasuredWidth() == 0 || measuredWidth == 0 || view.getMeasuredWidth() == 0)) {
            e(view, i, i2, i3, i4);
            if (z) {
                return;
            }
            getO().add(view);
            return;
        }
        Integer num = (Integer) view.getTag(R.id.div_gallery_item_index);
        k79 j = num != null ? j(num.intValue()) : null;
        dp8 d = (j == null || (jc8Var = j.a) == null) ? null : jc8Var.d();
        if (j == null || (xzbVar = j.b) == null) {
            xzbVar = getL().b;
        }
        szb szbVar = getN().j;
        o09 o09Var2 = o09.CENTER;
        o09 o09Var3 = o09.START;
        o09 o09Var4 = o09.END;
        if (s == 1) {
            szb u = d != null ? d.u() : null;
            if (u == null || (a2 = u.a(xzbVar)) == null) {
                o09Var = (o09) szbVar.a(xzbVar);
            } else {
                int ordinal = ((om8) a2).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    b6e.s();
                                    return;
                                }
                            }
                        }
                        o09Var = o09Var4;
                    } else {
                        o09Var = o09Var2;
                    }
                }
                o09Var = o09Var3;
            }
            i5 = measuredWidth - (i3 - i);
            int ordinal2 = o09Var.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    i5 /= 2;
                } else if (ordinal2 != 2) {
                    b6e.s();
                    return;
                }
                if (s == 0) {
                    szb o = d != null ? d.o() : null;
                    if (o == null || (a = o.a(xzbVar)) == null) {
                        o09Var2 = (o09) szbVar.a(xzbVar);
                    } else {
                        int ordinal3 = ((pm8) a).ordinal();
                        if (ordinal3 != 0) {
                            if (ordinal3 != 1) {
                                if (ordinal3 == 2) {
                                    o09Var2 = o09Var4;
                                } else if (ordinal3 != 3) {
                                    b6e.s();
                                    return;
                                }
                            }
                        }
                        o09Var2 = o09Var3;
                    }
                    i6 = measuredHeight - (i4 - i2);
                    int ordinal4 = o09Var2.ordinal();
                    if (ordinal4 != 0) {
                        if (ordinal4 == 1) {
                            i6 /= 2;
                        } else if (ordinal4 != 2) {
                            b6e.s();
                            return;
                        }
                        e(view, i + i5, i2 + i6, i3 + i5, i4 + i6);
                        h(view, false);
                        if (z) {
                            return;
                        }
                        getO().remove(view);
                        return;
                    }
                }
                i6 = 0;
                e(view, i + i5, i2 + i6, i3 + i5, i4 + i6);
                h(view, false);
                if (z) {
                }
            }
        }
        i5 = 0;
        if (s == 0) {
        }
        i6 = 0;
        e(view, i + i5, i2 + i6, i3 + i5, i4 + i6);
        h(view, false);
        if (z) {
        }
    }

    default int d(View view) {
        int i;
        int paddingTop;
        if (s() == 0) {
            int width = wyf.N(view) ? getM().getWidth() - view.getRight() : view.getLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            i = width - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            paddingTop = getM().getPaddingStart();
        } else {
            int top = view.getTop();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            i = top - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            paddingTop = getM().getPaddingTop();
        }
        return i - paddingTop;
    }

    void e(View view, int i, int i2, int i3, int i4);

    int f();

    void g(int i, int i2, int i3);

    /* renamed from: getBindingContext */
    e23 getL();

    /* renamed from: getDiv */
    s09 getN();

    /* renamed from: getView */
    RecyclerView getM();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.WeakHashMap] */
    /* JADX WARN: Type inference failed for: r1v6, types: [gc8] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    default void h(View view, boolean z) {
        f29 f29Var;
        jc8 jc8Var;
        e23 bindingContext;
        int n = n(view);
        if (n == -1) {
            return;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        if (viewGroup.getChildCount() > 0) {
            View childAt = viewGroup.getChildAt(0);
            f29Var = childAt;
            if (childAt == null) {
                rj7.m();
                return;
            }
        } else {
            f29Var = 0;
        }
        if (f29Var == 0) {
            return;
        }
        ?? r1 = getL().a;
        if (!z) {
            k79 j = j(n);
            if (j == null) {
                return;
            }
            jc8 jc8Var2 = j.a;
            w1a A = r1.getDiv2Component$div_release().A();
            e23 a = getL().a(j.b);
            A.getClass();
            w1a.f(a, f29Var, jc8Var2, new r1a(A, a, 1));
            r1.u(f29Var, jc8Var2);
            return;
        }
        synchronized (r1.t) {
            jc8Var = (jc8) r1.t.get(f29Var);
        }
        if (jc8Var == null) {
            return;
        }
        f29 f29Var2 = f29Var instanceof f29 ? f29Var : null;
        if (f29Var2 == null || (bindingContext = f29Var2.getBindingContext()) == null) {
            return;
        }
        w1a A2 = r1.getDiv2Component$div_release().A();
        A2.getClass();
        w1a.f(bindingContext, f29Var, jc8Var, new r1a(A2, bindingContext, 0));
        r1.Y(f29Var);
    }

    yon i();

    k79 j(int i);

    void k(int i, int i2);

    int l();

    default void m() {
        Iterator it = getO().iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            b(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), true);
        }
        getO().clear();
    }

    int n(View view);

    int o();

    int p();

    int q();

    default void r(int i, int i2, int i3) {
        RecyclerView m = getM();
        if (!wyf.K(m) || m.isLayoutRequested()) {
            m.addOnLayoutChangeListener(new x09(i, this, i3, i2));
            return;
        }
        if (i == 0) {
            if (s() != 0 || !wyf.N(getM())) {
                i3 = -i3;
            }
            getM().scrollBy(i3, i3);
            return;
        }
        getM().scrollBy(-getM().getScrollX(), -getM().getScrollY());
        yon layoutManager = getM().getLayoutManager();
        View L = layoutManager != null ? layoutManager.L(i) : null;
        while (L == null && (getM().canScrollVertically(1) || getM().canScrollHorizontally(1))) {
            yon layoutManager2 = getM().getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.R0();
            }
            yon layoutManager3 = getM().getLayoutManager();
            L = layoutManager3 != null ? layoutManager3.L(i) : null;
            if (L != null) {
                break;
            } else {
                getM().scrollBy(getM().getWidth(), getM().getHeight());
            }
        }
        if (L != null) {
            int D = ouj.D(i2);
            if (D == 0) {
                int d = d(L) - i3;
                if (wyf.N(getM())) {
                    d = -d;
                }
                getM().scrollBy(d, d);
                return;
            }
            if (D != 1) {
                return;
            }
            int[] iArr = {0, 0};
            int[] iArr2 = {0, 0};
            getM().getLocationOnScreen(iArr2);
            L.getLocationOnScreen(iArr);
            getM().scrollBy(((L.getWidth() - getM().getWidth()) / 2) + (iArr[0] - iArr2[0]), ((L.getHeight() - getM().getHeight()) / 2) + (iArr[1] - iArr2[1]));
        }
    }

    int s();
}
