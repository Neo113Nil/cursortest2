package L;

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
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public C0051b f678a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f679b;

    /* renamed from: c, reason: collision with root package name */
    public final Q f680c;

    /* renamed from: d, reason: collision with root package name */
    public final Q f681d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f682e;

    /* renamed from: f, reason: collision with root package name */
    public int f683f;

    /* renamed from: g, reason: collision with root package name */
    public int f684g;

    public x() {
        w wVar = new w(this, 0);
        w wVar2 = new w(this, 1);
        this.f680c = new Q(wVar);
        this.f681d = new Q(wVar2);
        this.f682e = false;
    }

    public static int e(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
    }

    public static void v(View view) {
        ((y) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0064o w(Context context, AttributeSet attributeSet, int i2, int i3) {
        C0064o c0064o = new C0064o(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K.a.f460a, i2, i3);
        c0064o.f663b = obtainStyledAttributes.getInt(0, 1);
        c0064o.f664c = obtainStyledAttributes.getInt(9, 1);
        c0064o.f665d = obtainStyledAttributes.getBoolean(8, false);
        c0064o.f666e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return c0064o;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f679b;
        D d2 = recyclerView.f1585f;
        G g2 = recyclerView.f1582c0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f679b.canScrollVertically(-1) && !this.f679b.canScrollHorizontally(-1) && !this.f679b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        this.f679b.getClass();
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

    public final void F(D d2) {
        int size = d2.f549a.size();
        int i2 = size - 1;
        ArrayList arrayList = d2.f549a;
        if (i2 >= 0) {
            E0.h.i(arrayList.get(i2));
            throw null;
        }
        arrayList.clear();
        if (size > 0) {
            this.f679b.invalidate();
        }
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int s2 = s();
        int u2 = u();
        int t2 = this.f683f - t();
        int r = this.f684g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i2 = left - s2;
        int min = Math.min(0, i2);
        int i3 = top - u2;
        int min2 = Math.min(0, i3);
        int i4 = width - t2;
        int max = Math.max(0, i4);
        int max2 = Math.max(0, height - r);
        RecyclerView recyclerView2 = this.f679b;
        Field field = w.x.f3069a;
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
            int t3 = this.f683f - t();
            int r2 = this.f684g - r();
            Rect rect2 = this.f679b.f1595l;
            int[] iArr2 = RecyclerView.f1555m0;
            y yVar = (y) focusedChild.getLayoutParams();
            Rect rect3 = yVar.f685a;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) yVar).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) yVar).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) yVar).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) yVar).bottomMargin);
            if (rect2.left - i5 >= t3 || rect2.right - i5 <= s3 || rect2.top - i6 >= r2 || rect2.bottom - i6 <= u3) {
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
        RecyclerView recyclerView = this.f679b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f679b = null;
            this.f678a = null;
            this.f683f = 0;
            this.f684g = 0;
            return;
        }
        this.f679b = recyclerView;
        this.f678a = recyclerView.f1591i;
        this.f683f = recyclerView.getWidth();
        this.f684g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(y yVar) {
        return yVar != null;
    }

    public abstract int f(G g2);

    public abstract void g(G g2);

    public abstract int h(G g2);

    public abstract int i(G g2);

    public abstract void j(G g2);

    public abstract int k(G g2);

    public abstract y l();

    public y m(Context context, AttributeSet attributeSet) {
        return new y(context, attributeSet);
    }

    public y n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof y ? new y((y) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new y((ViewGroup.MarginLayoutParams) layoutParams) : new y(layoutParams);
    }

    public final View o(int i2) {
        C0051b c0051b = this.f678a;
        if (c0051b == null) {
            return null;
        }
        int i3 = -1;
        if (i2 >= 0) {
            int childCount = ((RecyclerView) ((A.j) c0051b.f603h).f30g).getChildCount();
            int i4 = i2;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                C0052c c0052c = (C0052c) c0051b.f604i;
                int a2 = i2 - (i4 - c0052c.a(i4));
                if (a2 == 0) {
                    i3 = i4;
                    while (c0052c.b(i3)) {
                        i3++;
                    }
                } else {
                    i4 += a2;
                }
            }
        }
        return ((RecyclerView) ((A.j) c0051b.f603h).f30g).getChildAt(i3);
    }

    public final int p() {
        C0051b c0051b = this.f678a;
        if (c0051b != null) {
            return ((RecyclerView) ((A.j) c0051b.f603h).f30g).getChildCount() - ((ArrayList) c0051b.f602g).size();
        }
        return 0;
    }

    public int q(D d2, G g2) {
        RecyclerView recyclerView = this.f679b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f679b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f679b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f679b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f679b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(D d2, G g2) {
        RecyclerView recyclerView = this.f679b;
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
