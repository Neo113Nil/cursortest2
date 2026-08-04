package com.gamericefishpro.space.r5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public b a;
    public RecyclerView b;
    public final com.gamericefishpro.space.u6.e c;
    public final com.gamericefishpro.space.u6.e d;
    public boolean e;
    public final boolean f;
    public int g;
    public int h;
    public int i;
    public int j;

    public b0() {
        a0 a0Var = new a0(this, 0);
        a0 a0Var2 = new a0(this, 1);
        this.c = new com.gamericefishpro.space.u6.e(a0Var);
        this.d = new com.gamericefishpro.space.u6.e(a0Var2);
        this.e = false;
        this.f = true;
    }

    public static int A(View view) {
        ((c0) view.getLayoutParams()).getClass();
        throw null;
    }

    public static o B(Context context, AttributeSet attributeSet, int i, int i2) {
        o oVar = new o(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.gamericefishpro.space.q5.a.a, i, i2);
        oVar.b = typedArrayObtainStyledAttributes.getInt(0, 1);
        oVar.c = typedArrayObtainStyledAttributes.getInt(10, 1);
        oVar.d = typedArrayObtainStyledAttributes.getBoolean(9, false);
        oVar.e = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return oVar;
    }

    public static boolean F(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void G(View view, int i, int i2, int i3, int i4) {
        c0 c0Var = (c0) view.getLayoutParams();
        Rect rect = c0Var.a;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c0Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0Var).bottomMargin);
    }

    public static int f(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int r(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int u(View view) {
        Rect rect = ((c0) view.getLayoutParams()).a;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int v(View view) {
        Rect rect = ((c0) view.getLayoutParams()).a;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int C(com.gamericefishpro.space.bb.a aVar, j0 j0Var) {
        return -1;
    }

    public final void D(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((c0) view.getLayoutParams()).a;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.B;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean E();

    public void H(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iF = recyclerView.v.f();
            for (int i2 = 0; i2 < iF; i2++) {
                recyclerView.v.e(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void I(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iF = recyclerView.v.f();
            for (int i2 = 0; i2 < iF; i2++) {
                recyclerView.v.e(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void L(RecyclerView recyclerView);

    public void M(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        com.gamericefishpro.space.bb.a aVar = recyclerView.d;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        this.b.getClass();
    }

    public final void N(View view, com.gamericefishpro.space.e4.h hVar) {
        RecyclerView.s(view);
    }

    public Parcelable P() {
        return null;
    }

    public final void R(com.gamericefishpro.space.bb.a aVar) {
        for (int iQ = q() - 1; iQ >= 0; iQ--) {
            if (!RecyclerView.s(p(iQ)).n()) {
                View viewP = p(iQ);
                U(iQ);
                aVar.i(viewP);
            }
        }
    }

    public final void S(com.gamericefishpro.space.bb.a aVar) {
        ArrayList arrayList = (ArrayList) aVar.c;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            ((m0) arrayList.get(i)).getClass();
            m0 m0VarS = RecyclerView.s(null);
            if (!m0VarS.n()) {
                m0VarS.m(false);
                if (m0VarS.j()) {
                    this.b.removeDetachedView(null, false);
                }
                y yVar = this.b.b0;
                if (yVar != null) {
                    yVar.b(m0VarS);
                }
                m0VarS.m(true);
                m0 m0VarS2 = RecyclerView.s(null);
                m0VarS2.c = null;
                m0VarS2.d = false;
                m0VarS2.b &= -33;
                aVar.j(m0VarS2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) aVar.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public final void T(View view, com.gamericefishpro.space.bb.a aVar) {
        b bVar = this.a;
        u uVar = (u) bVar.e;
        int iIndexOfChild = uVar.a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((com.gamericefishpro.space.n9.r0) bVar.i).i(iIndexOfChild)) {
                bVar.p(view);
            }
            uVar.a(iIndexOfChild);
        }
        aVar.i(view);
    }

    public final void U(int i) {
        if (p(i) != null) {
            b bVar = this.a;
            int iG = bVar.g(i);
            u uVar = (u) bVar.e;
            View childAt = uVar.a.getChildAt(iG);
            if (childAt == null) {
                return;
            }
            if (((com.gamericefishpro.space.n9.r0) bVar.i).i(iG)) {
                bVar.p(childAt);
            }
            uVar.a(iG);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    public boolean V(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iX = x();
        int iZ = z();
        int iY = this.i - y();
        int iW = this.j - w();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iX;
        int iMin = Math.min(0, i);
        int i2 = top - iZ;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - iY;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - iW);
        RecyclerView recyclerView2 = this.b;
        Field field = com.gamericefishpro.space.d4.l0.a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iX2 = x();
                int iZ2 = z();
                int iY2 = this.i - y();
                int iW2 = this.j - w();
                Rect rect2 = this.b.z;
                t(focusedChild, rect2);
                if (rect2.left - i4 < iY2 && rect2.right - i4 > iX2 && rect2.top - i5 < iW2 && rect2.bottom - i5 > iZ2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                        return true;
                    }
                    recyclerView.E(i4, i5, false);
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.E(i4, i5, false);
            return true;
        }
        return false;
    }

    public final void W() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int X(int i, com.gamericefishpro.space.bb.a aVar, j0 j0Var);

    public abstract int Y(int i, com.gamericefishpro.space.bb.a aVar, j0 j0Var);

    public final void Z(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.i = 0;
            this.j = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.v;
            this.i = recyclerView.getWidth();
            this.j = recyclerView.getHeight();
        }
        this.g = 1073741824;
        this.h = 1073741824;
    }

    public final void a(View view, int i, boolean z) {
        m0 m0VarS = RecyclerView.s(view);
        if (z || m0VarS.h()) {
            com.gamericefishpro.space.t.r0 r0Var = (com.gamericefishpro.space.t.r0) this.b.w.d;
            u0 u0VarA = (u0) r0Var.get(m0VarS);
            if (u0VarA == null) {
                u0VarA = u0.a();
                r0Var.put(m0VarS, u0VarA);
            }
            u0VarA.a |= 1;
        } else {
            this.b.w.n(m0VarS);
        }
        c0 c0Var = (c0) view.getLayoutParams();
        if (m0VarS.o() || m0VarS.i()) {
            if (m0VarS.i()) {
                m0VarS.c.l(m0VarS);
            } else {
                m0VarS.b &= -33;
            }
            this.a.b(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.b) {
            b bVar = this.a;
            com.gamericefishpro.space.n9.r0 r0Var2 = (com.gamericefishpro.space.n9.r0) bVar.i;
            int iIndexOfChild = ((u) bVar.e).a.indexOfChild(view);
            int iC = (iIndexOfChild == -1 || r0Var2.f(iIndexOfChild)) ? -1 : iIndexOfChild - r0Var2.c(iIndexOfChild);
            if (i == -1) {
                i = this.a.f();
            }
            if (iC == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.p());
            }
            if (iC != i) {
                b0 b0Var = this.b.C;
                View viewP = b0Var.p(iC);
                if (viewP == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iC + b0Var.b.toString());
                }
                b0Var.p(iC);
                b0Var.a.d(iC);
                c0 c0Var2 = (c0) viewP.getLayoutParams();
                m0 m0VarS2 = RecyclerView.s(viewP);
                if (m0VarS2.h()) {
                    com.gamericefishpro.space.t.r0 r0Var3 = (com.gamericefishpro.space.t.r0) b0Var.b.w.d;
                    u0 u0VarA2 = (u0) r0Var3.get(m0VarS2);
                    if (u0VarA2 == null) {
                        u0VarA2 = u0.a();
                        r0Var3.put(m0VarS2, u0VarA2);
                    }
                    u0VarA2.a = 1 | u0VarA2.a;
                } else {
                    b0Var.b.w.n(m0VarS2);
                }
                b0Var.a.b(viewP, i, c0Var2, m0VarS2.h());
            }
        } else {
            b bVar2 = this.a;
            RecyclerView recyclerView = ((u) bVar2.e).a;
            int childCount = i < 0 ? recyclerView.getChildCount() : bVar2.g(i);
            ((com.gamericefishpro.space.n9.r0) bVar2.i).g(childCount, false);
            recyclerView.addView(view, childCount);
            RecyclerView.s(view);
            c0Var.b = true;
        }
        if (c0Var.c) {
            throw null;
        }
    }

    public final boolean a0(View view, int i, int i2, c0 c0Var) {
        return (!view.isLayoutRequested() && this.f && F(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0Var).width) && F(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c0Var).height)) ? false : true;
    }

    public void b(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.d(str);
        }
    }

    public final boolean b0(View view, int i, int i2, c0 c0Var) {
        return (this.f && F(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0Var).width) && F(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c0Var).height)) ? false : true;
    }

    public abstract boolean c();

    public abstract boolean d();

    public boolean e(c0 c0Var) {
        return c0Var != null;
    }

    public abstract int g(j0 j0Var);

    public abstract int h(j0 j0Var);

    public abstract int i(j0 j0Var);

    public abstract int j(j0 j0Var);

    public abstract int k(j0 j0Var);

    public abstract int l(j0 j0Var);

    public abstract c0 m();

    public c0 n(Context context, AttributeSet attributeSet) {
        return new c0(context, attributeSet);
    }

    public c0 o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof c0) {
            return new c0((c0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c0((ViewGroup.MarginLayoutParams) layoutParams) : new c0(layoutParams);
    }

    public final View p(int i) {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.e(i);
        }
        return null;
    }

    public final int q() {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.f();
        }
        return 0;
    }

    public int s(com.gamericefishpro.space.bb.a aVar, j0 j0Var) {
        return -1;
    }

    public void t(View view, Rect rect) {
        int[] iArr = RecyclerView.D0;
        c0 c0Var = (c0) view.getLayoutParams();
        Rect rect2 = c0Var.a;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0Var).bottomMargin);
    }

    public final int w() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int x() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int y() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int z() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public void J() {
    }

    public void K(RecyclerView recyclerView) {
    }

    public void Q(int i) {
    }

    public void O(com.gamericefishpro.space.bb.a aVar, j0 j0Var, View view, com.gamericefishpro.space.e4.h hVar) {
    }
}
