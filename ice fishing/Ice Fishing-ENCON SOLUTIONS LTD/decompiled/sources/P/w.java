package P;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public I0.b f1372a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f1373b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.e f1374c;

    /* renamed from: d, reason: collision with root package name */
    public final x0.e f1375d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1376e;

    /* renamed from: f, reason: collision with root package name */
    public int f1377f;

    /* renamed from: g, reason: collision with root package name */
    public int f1378g;

    public w() {
        v vVar = new v(this, 0);
        v vVar2 = new v(this, 1);
        this.f1374c = new x0.e(vVar);
        this.f1375d = new x0.e(vVar2);
        this.f1376e = false;
    }

    public static int e(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
    }

    public static void v(View view) {
        ((x) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0065n w(Context context, AttributeSet attributeSet, int i2, int i3) {
        C0065n c0065n = new C0065n(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O.a.f1232a, i2, i3);
        c0065n.f1358b = obtainStyledAttributes.getInt(0, 1);
        c0065n.f1359c = obtainStyledAttributes.getInt(9, 1);
        c0065n.f1360d = obtainStyledAttributes.getBoolean(8, false);
        c0065n.f1361e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return c0065n;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f1373b;
        C c2 = recyclerView.f2549a;
        F f2 = recyclerView.f2554c0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f1373b.canScrollVertically(-1) && !this.f1373b.canScrollHorizontally(-1) && !this.f1373b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        this.f1373b.getClass();
    }

    public abstract void B(Parcelable parcelable);

    public abstract Parcelable C();

    public final void E() {
        int p2 = p() - 1;
        if (p2 < 0) {
            return;
        }
        RecyclerView.j(o(p2));
        throw null;
    }

    public final void F(C c2) {
        int size = c2.f1253a.size();
        int i2 = size - 1;
        ArrayList arrayList = c2.f1253a;
        if (i2 >= 0) {
            C1.a.n(arrayList.get(i2));
            throw null;
        }
        arrayList.clear();
        if (size > 0) {
            this.f1373b.invalidate();
        }
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int s2 = s();
        int u2 = u();
        int t = this.f1377f - t();
        int r2 = this.f1378g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i2 = left - s2;
        int min = Math.min(0, i2);
        int i3 = top - u2;
        int min2 = Math.min(0, i3);
        int i4 = width - t;
        int max = Math.max(0, i4);
        int max2 = Math.max(0, height - r2);
        RecyclerView recyclerView2 = this.f1373b;
        Field field = y.x.f8596a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i2, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i4);
        }
        if (min2 == 0) {
            min2 = Math.min(i3, max2);
        }
        int[] iArr = {max, min2};
        int i5 = iArr[0];
        int i6 = iArr[1];
        if (z3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int s3 = s();
            int u3 = u();
            int t2 = this.f1377f - t();
            int r3 = this.f1378g - r();
            Rect rect2 = this.f1373b.f2559g;
            int[] iArr2 = RecyclerView.f2528m0;
            x xVar = (x) focusedChild.getLayoutParams();
            Rect rect3 = xVar.f1379a;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) xVar).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) xVar).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) xVar).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) xVar).bottomMargin);
            if (rect2.left - i5 >= t2 || rect2.right - i5 <= s3 || rect2.top - i6 >= r3 || rect2.bottom - i6 <= u3) {
                return false;
            }
        }
        if (i5 == 0 && i6 == 0) {
            return false;
        }
        if (z2) {
            recyclerView.scrollBy(i5, i6);
            return true;
        }
        recyclerView.r(i5, i6);
        return true;
    }

    public final void H() {
        RecyclerView recyclerView = this.f1373b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f1373b = null;
            this.f1372a = null;
            this.f1377f = 0;
            this.f1378g = 0;
            return;
        }
        this.f1373b = recyclerView;
        this.f1372a = recyclerView.f2555d;
        this.f1377f = recyclerView.getWidth();
        this.f1378g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(x xVar) {
        return xVar != null;
    }

    public abstract int f(F f2);

    public abstract void g(F f2);

    public abstract int h(F f2);

    public abstract int i(F f2);

    public abstract void j(F f2);

    public abstract int k(F f2);

    public abstract x l();

    public x m(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    public x n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof x ? new x((x) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new x((ViewGroup.MarginLayoutParams) layoutParams) : new x(layoutParams);
    }

    public final View o(int i2) {
        I0.b bVar = this.f1372a;
        if (bVar == null) {
            return null;
        }
        int i3 = -1;
        if (i2 >= 0) {
            int childCount = ((RecyclerView) ((C.j) bVar.f721b).f124b).getChildCount();
            int i4 = i2;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                C0053b c0053b = (C0053b) bVar.f722c;
                int a2 = i2 - (i4 - c0053b.a(i4));
                if (a2 == 0) {
                    i3 = i4;
                    while (c0053b.b(i3)) {
                        i3++;
                    }
                } else {
                    i4 += a2;
                }
            }
        }
        return ((RecyclerView) ((C.j) bVar.f721b).f124b).getChildAt(i3);
    }

    public final int p() {
        I0.b bVar = this.f1372a;
        if (bVar != null) {
            return ((RecyclerView) ((C.j) bVar.f721b).f124b).getChildCount() - ((ArrayList) bVar.f723d).size();
        }
        return 0;
    }

    public int q(C c2, F f2) {
        RecyclerView recyclerView = this.f1373b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f1373b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f1373b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f1373b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f1373b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(C c2, F f2) {
        RecyclerView recyclerView = this.f1373b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public abstract boolean y();

    public abstract void z(RecyclerView recyclerView);

    public void D(int i2) {
    }
}
