package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.gamericefishpro.space.bb.a;
import com.gamericefishpro.space.d9.d;
import com.gamericefishpro.space.h4.b;
import com.gamericefishpro.space.k4.c;
import com.gamericefishpro.space.n9.a0;
import com.gamericefishpro.space.n9.r0;
import com.gamericefishpro.space.r5.b0;
import com.gamericefishpro.space.r5.c0;
import com.gamericefishpro.space.r5.d0;
import com.gamericefishpro.space.r5.e0;
import com.gamericefishpro.space.r5.f0;
import com.gamericefishpro.space.r5.g;
import com.gamericefishpro.space.r5.g0;
import com.gamericefishpro.space.r5.h0;
import com.gamericefishpro.space.r5.i0;
import com.gamericefishpro.space.r5.j;
import com.gamericefishpro.space.r5.j0;
import com.gamericefishpro.space.r5.k0;
import com.gamericefishpro.space.r5.l;
import com.gamericefishpro.space.r5.l0;
import com.gamericefishpro.space.r5.m0;
import com.gamericefishpro.space.r5.o0;
import com.gamericefishpro.space.r5.u;
import com.gamericefishpro.space.r5.u0;
import com.gamericefishpro.space.r5.v;
import com.gamericefishpro.space.r5.w;
import com.gamericefishpro.space.r5.x;
import com.gamericefishpro.space.r5.y;
import com.gamericefishpro.space.r5.z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] D0 = {R.attr.nestedScrollingEnabled};
    public static final Class[] E0;
    public static final c F0;
    public final Rect A;
    public final int[] A0;
    public final RectF B;
    public final ArrayList B0;
    public b0 C;
    public final b C0;
    public final ArrayList D;
    public final ArrayList E;
    public final ArrayList F;
    public j G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;
    public int N;
    public final AccessibilityManager O;
    public boolean P;
    public boolean Q;
    public int R;
    public final int S;
    public x T;
    public EdgeEffect U;
    public EdgeEffect V;
    public EdgeEffect W;
    public EdgeEffect a0;
    public y b0;
    public int c0;
    public final a d;
    public int d0;
    public i0 e;
    public VelocityTracker e0;
    public int f0;
    public int g0;
    public int h0;
    public final com.gamericefishpro.space.a8.c i;
    public int i0;
    public int j0;
    public final int k0;
    public final int l0;
    public final float m0;
    public final float n0;
    public boolean o0;
    public final l0 p0;
    public l q0;
    public final d r0;
    public final j0 s0;
    public e0 t0;
    public ArrayList u0;
    public final com.gamericefishpro.space.r5.b v;
    public final u v0;
    public final com.gamericefishpro.space.u6.l w;
    public o0 w0;
    public com.gamericefishpro.space.d4.l x0;
    public boolean y;
    public final int[] y0;
    public final Rect z;
    public final int[] z0;

    static {
        Class cls = Integer.TYPE;
        E0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        F0 = new c(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.gamericefishpro.space.R.attr.recyclerViewStyle);
    }

    public static void e(m0 m0Var) {
        WeakReference weakReference = m0Var.a;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            m0Var.a = null;
        }
    }

    private com.gamericefishpro.space.d4.l getScrollingChildHelper() {
        if (this.x0 == null) {
            this.x0 = new com.gamericefishpro.space.d4.l(this);
        }
        return this.x0;
    }

    public static m0 s(View view) {
        if (view == null) {
            return null;
        }
        ((c0) view.getLayoutParams()).getClass();
        return null;
    }

    public final void A(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.z;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof c0) {
            c0 c0Var = (c0) layoutParams;
            if (!c0Var.b) {
                Rect rect2 = c0Var.a;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.C.V(this, view, this.z, !this.J, view2 == null);
    }

    public final void B() {
        VelocityTracker velocityTracker = this.e0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        H(0);
        EdgeEffect edgeEffect = this.U;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.U.isFinished();
        }
        EdgeEffect edgeEffect2 = this.V;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.V.isFinished();
        }
        EdgeEffect edgeEffect3 = this.W;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        EdgeEffect edgeEffect4 = this.a0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.a0.isFinished();
        }
        if (zIsFinished) {
            Field field = com.gamericefishpro.space.d4.l0.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00db A[DONT_INVERT, PHI: r14
      0x00db: PHI (r14v6 boolean) = (r14v4 boolean), (r14v10 boolean) binds: [B:30:0x00c2, B:28:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e5  */
    public final boolean C(int i, int i2, MotionEvent motionEvent, int i3) {
        boolean z;
        g();
        if (!this.E.isEmpty()) {
            invalidate();
        }
        int[] iArr = this.A0;
        iArr[0] = 0;
        iArr[1] = 0;
        k(0, 0, 0, 0, this.y0, i3, iArr);
        int i4 = iArr[0];
        int i5 = 0 - i4;
        int i6 = iArr[1];
        int i7 = 0 - i6;
        boolean z2 = (i4 == 0 && i6 == 0) ? false : true;
        int i8 = this.h0;
        int[] iArr2 = this.y0;
        int i9 = iArr2[0];
        this.h0 = i8 - i9;
        int i10 = this.i0;
        int i11 = iArr2[1];
        this.i0 = i10 - i11;
        int[] iArr3 = this.z0;
        iArr3[0] = iArr3[0] + i9;
        iArr3[1] = iArr3[1] + i11;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x = motionEvent.getX();
                float f = i5;
                float y = motionEvent.getY();
                float f2 = i7;
                if (f < 0.0f) {
                    m();
                    com.gamericefishpro.space.h4.c.a(this.U, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    if (f > 0.0f) {
                        n();
                        com.gamericefishpro.space.h4.c.a(this.W, f / getWidth(), y / getHeight());
                    } else {
                        z = false;
                    }
                    if (f2 < 0.0f) {
                        o();
                        com.gamericefishpro.space.h4.c.a(this.V, (-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        l();
                        com.gamericefishpro.space.h4.c.a(this.a0, f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else if (z || f != 0.0f || f2 != 0.0f) {
                        Field field = com.gamericefishpro.space.d4.l0.a;
                        postInvalidateOnAnimation();
                    }
                    z = true;
                    if (z) {
                        Field field2 = com.gamericefishpro.space.d4.l0.a;
                        postInvalidateOnAnimation();
                    } else {
                        Field field3 = com.gamericefishpro.space.d4.l0.a;
                        postInvalidateOnAnimation();
                    }
                }
                z = true;
                if (f2 < 0.0f) {
                    o();
                    com.gamericefishpro.space.h4.c.a(this.V, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    l();
                    com.gamericefishpro.space.h4.c.a(this.a0, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else if (z) {
                    Field field4 = com.gamericefishpro.space.d4.l0.a;
                    postInvalidateOnAnimation();
                } else {
                    Field field5 = com.gamericefishpro.space.d4.l0.a;
                    postInvalidateOnAnimation();
                }
                z = true;
                if (z) {
                    Field field6 = com.gamericefishpro.space.d4.l0.a;
                    postInvalidateOnAnimation();
                } else {
                    Field field7 = com.gamericefishpro.space.d4.l0.a;
                    postInvalidateOnAnimation();
                }
            }
            f(i, i2);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return z2;
    }

    public final void D(int i, int i2, int[] iArr) {
        F();
        w();
        int i3 = com.gamericefishpro.space.y3.d.a;
        Trace.beginSection("RV Scroll");
        int scrollState = getScrollState();
        j0 j0Var = this.s0;
        if (scrollState == 2) {
            OverScroller overScroller = this.p0.i;
            overScroller.getFinalX();
            overScroller.getCurrX();
            j0Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
        } else {
            j0Var.getClass();
        }
        a aVar = this.d;
        int iX = i != 0 ? this.C.X(i, aVar, j0Var) : 0;
        int iY = i2 != 0 ? this.C.Y(i2, aVar, j0Var) : 0;
        Trace.endSection();
        com.gamericefishpro.space.r5.b bVar = this.v;
        int iF = bVar.f();
        for (int i4 = 0; i4 < iF; i4++) {
            View viewE = bVar.e(i4);
            ViewParent parent = viewE.getParent();
            if (parent != null && parent != this) {
                throw new IllegalArgumentException("View " + viewE + " is not a direct child of " + this);
            }
            s(viewE);
        }
        x(true);
        G(false);
        if (iArr != null) {
            iArr[0] = iX;
            iArr[1] = iY;
        }
    }

    public final void E(int i, int i2, boolean z) {
        b0 b0Var = this.C;
        if (b0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.L) {
            return;
        }
        int i3 = !b0Var.c() ? 0 : i;
        int i4 = !this.C.d() ? 0 : i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        if (z) {
            int i5 = i3 != 0 ? 1 : 0;
            if (i4 != 0) {
                i5 |= 2;
            }
            getScrollingChildHelper().g(i5, 1);
        }
        l0 l0Var = this.p0;
        RecyclerView recyclerView = l0Var.z;
        int iAbs = Math.abs(i3);
        int iAbs2 = Math.abs(i4);
        boolean z2 = iAbs > iAbs2;
        int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
        if (!z2) {
            iAbs = iAbs2;
        }
        int iMin = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        c cVar = F0;
        if (l0Var.v != cVar) {
            l0Var.v = cVar;
            l0Var.i = new OverScroller(recyclerView.getContext(), cVar);
        }
        l0Var.e = 0;
        l0Var.d = 0;
        recyclerView.setScrollState(2);
        l0Var.i.startScroll(0, 0, i3, i4, iMin);
        l0Var.a();
    }

    public final void F() {
        this.K++;
    }

    public final void G(boolean z) {
        if (this.K < 1) {
            this.K = 1;
        }
        this.K--;
    }

    public final void H(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        b0 b0Var = this.C;
        if (b0Var != null) {
            b0Var.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof c0) && this.C.e((c0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        b0 b0Var = this.C;
        if (b0Var != null && b0Var.c()) {
            return this.C.g(this.s0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        b0 b0Var = this.C;
        if (b0Var != null && b0Var.c()) {
            return this.C.h(this.s0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        b0 b0Var = this.C;
        if (b0Var != null && b0Var.c()) {
            return this.C.i(this.s0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        b0 b0Var = this.C;
        if (b0Var != null && b0Var.d()) {
            return this.C.j(this.s0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        b0 b0Var = this.C;
        if (b0Var != null && b0Var.d()) {
            return this.C.k(this.s0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        b0 b0Var = this.C;
        if (b0Var != null && b0Var.d()) {
            return this.C.l(this.s0);
        }
        return 0;
    }

    public final void d(String str) {
        if (this.R > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + p());
        }
        if (this.S > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + p()));
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((z) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.U;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.y ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.U;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.V;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.y) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.V;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.W;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.y ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.W;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.a0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.y) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.a0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.b0 == null || arrayList.size() <= 0 || !this.b0.d()) ? z : true) {
            Field field = com.gamericefishpro.space.d4.l0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void f(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.U;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.U.onRelease();
            zIsFinished = this.U.isFinished();
        }
        EdgeEffect edgeEffect2 = this.W;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.W.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        EdgeEffect edgeEffect3 = this.V;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.V.onRelease();
            zIsFinished |= this.V.isFinished();
        }
        EdgeEffect edgeEffect4 = this.a0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.a0.onRelease();
            zIsFinished |= this.a0.isFinished();
        }
        if (zIsFinished) {
            Field field = com.gamericefishpro.space.d4.l0.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c4, code lost:
    
        if (r4 > 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e2, code lost:
    
        if (r7 > 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        if (r4 < 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e8, code lost:
    
        if (r7 < 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f0, code lost:
    
        if ((r7 * r1) <= 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f8, code lost:
    
        if ((r7 * r1) >= 0) goto L84;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        int i2;
        this.C.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (viewFindNextFocus != null && !viewFindNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            A(viewFindNextFocus, null);
            return view;
        }
        if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus != view && q(viewFindNextFocus) != null) {
            if (view != null && q(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.z;
                byte b = 0;
                rect.set(0, 0, width, height);
                int width2 = viewFindNextFocus.getWidth();
                int height2 = viewFindNextFocus.getHeight();
                Rect rect2 = this.A;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(viewFindNextFocus, rect2);
                RecyclerView recyclerView = this.C.b;
                Field field = com.gamericefishpro.space.d4.l0.a;
                int i3 = recyclerView.getLayoutDirection() == 1 ? -1 : 1;
                int i4 = rect.left;
                int i5 = rect2.left;
                if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                    i2 = 1;
                } else {
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
                }
                int i8 = rect.top;
                int i9 = rect2.top;
                if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                    b = 1;
                } else {
                    int i10 = rect.bottom;
                    int i11 = rect2.bottom;
                    if ((i10 > i11 || i8 >= i11) && i8 > i9) {
                        b = -1;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i != 130) {
                                        throw new IllegalArgumentException("Invalid direction: " + i + p());
                                    }
                                }
                            }
                        }
                    } else if (b <= 0) {
                        if (b == 0) {
                        }
                    }
                } else if (b >= 0) {
                    if (b == 0) {
                    }
                }
            }
            return viewFindNextFocus;
        }
        return super.focusSearch(view, i);
    }

    public final void g() {
        if (!this.J || this.P) {
            int i = com.gamericefishpro.space.y3.d.a;
            Trace.beginSection("RV FullInvalidate");
            i();
            Trace.endSection();
            return;
        }
        com.gamericefishpro.space.a8.c cVar = this.i;
        if (cVar.p()) {
            cVar.getClass();
            if (cVar.p()) {
                int i2 = com.gamericefishpro.space.y3.d.a;
                Trace.beginSection("RV FullInvalidate");
                i();
                Trace.endSection();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        b0 b0Var = this.C;
        if (b0Var != null) {
            return b0Var.m();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        b0 b0Var = this.C;
        if (b0Var != null) {
            return b0Var.n(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public v getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        b0 b0Var = this.C;
        if (b0Var == null) {
            return super.getBaseline();
        }
        b0Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.y;
    }

    public o0 getCompatAccessibilityDelegate() {
        return this.w0;
    }

    public x getEdgeEffectFactory() {
        return this.T;
    }

    public y getItemAnimator() {
        return this.b0;
    }

    public int getItemDecorationCount() {
        return this.E.size();
    }

    public b0 getLayoutManager() {
        return this.C;
    }

    public int getMaxFlingVelocity() {
        return this.l0;
    }

    public int getMinFlingVelocity() {
        return this.k0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public d0 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.o0;
    }

    public g0 getRecycledViewPool() {
        return this.d.e();
    }

    public int getScrollState() {
        return this.c0;
    }

    public final void h(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = com.gamericefishpro.space.d4.l0.a;
        setMeasuredDimension(b0.f(i, paddingRight, getMinimumWidth()), b0.f(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i() {
        Log.w("RecyclerView", "No adapter attached; skipping layout");
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.H;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.L;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final boolean j(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void k(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void l() {
        if (this.a0 != null) {
            return;
        }
        this.T.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.a0 = edgeEffect;
        if (this.y) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void m() {
        if (this.U != null) {
            return;
        }
        this.T.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.U = edgeEffect;
        if (this.y) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void n() {
        if (this.W != null) {
            return;
        }
        this.T.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.W = edgeEffect;
        if (this.y) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void o() {
        if (this.V != null) {
            return;
        }
        this.T.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.V = edgeEffect;
        if (this.y) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        boolean z = false;
        this.R = 0;
        this.H = true;
        if (this.J && !isLayoutRequested()) {
            z = true;
        }
        this.J = z;
        b0 b0Var = this.C;
        if (b0Var != null) {
            b0Var.e = true;
            b0Var.K(this);
        }
        ThreadLocal threadLocal = l.w;
        l lVar = (l) threadLocal.get();
        this.q0 = lVar;
        if (lVar == null) {
            l lVar2 = new l();
            lVar2.d = new ArrayList();
            lVar2.v = new ArrayList();
            this.q0 = lVar2;
            Field field = com.gamericefishpro.space.d4.l0.a;
            Display display = getDisplay();
            if (isInEditMode() || display == null) {
                refreshRate = 60.0f;
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                    refreshRate = 60.0f;
                }
            }
            l lVar3 = this.q0;
            lVar3.i = (long) (1.0E9f / refreshRate);
            threadLocal.set(lVar3);
        }
        this.q0.d.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y yVar = this.b0;
        if (yVar != null) {
            yVar.c();
        }
        setScrollState(0);
        l0 l0Var = this.p0;
        l0Var.z.removeCallbacks(l0Var);
        l0Var.i.abortAnimation();
        this.H = false;
        b0 b0Var = this.C;
        if (b0Var != null) {
            b0Var.e = false;
            b0Var.L(this);
        }
        this.B0.clear();
        removeCallbacks(this.C0);
        this.w.getClass();
        while (u0.b.a() != null) {
        }
        l lVar = this.q0;
        if (lVar != null) {
            lVar.d.remove(this);
            this.q0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((z) arrayList.get(i)).getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.C != null && !this.L && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.C.d() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.C.c() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.C.d()) {
                    f = -axisValue2;
                } else if (this.C.c()) {
                    axisValue = axisValue2;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f = 0.0f;
                axisValue = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                int i = (int) (axisValue * this.m0);
                int i2 = (int) (f * this.n0);
                b0 b0Var = this.C;
                if (b0Var == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    return false;
                }
                if (!this.L) {
                    int[] iArr = this.A0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zC = b0Var.c();
                    boolean zD = this.C.d();
                    getScrollingChildHelper().g(zD ? (zC ? 1 : 0) | 2 : zC ? 1 : 0, 1);
                    if (j(zC ? i : 0, zD ? i2 : 0, 1, this.A0, this.y0)) {
                        i -= iArr[0];
                        i2 -= iArr[1];
                    }
                    C(zC ? i : 0, zD ? i2 : 0, motionEvent, 1);
                    l lVar = this.q0;
                    if (lVar != null && (i != 0 || i2 != 0)) {
                        lVar.a(this, i, i2);
                    }
                    H(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.L) {
            this.G = null;
            if (r(motionEvent)) {
                B();
                setScrollState(0);
                return true;
            }
            b0 b0Var = this.C;
            if (b0Var != null) {
                boolean zC = b0Var.c();
                boolean zD = this.C.d();
                if (this.e0 == null) {
                    this.e0 = VelocityTracker.obtain();
                }
                this.e0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.M) {
                        this.M = false;
                    }
                    this.d0 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.h0 = x;
                    this.f0 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.i0 = y;
                    this.g0 = y;
                    if (this.c0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        H(1);
                    }
                    int[] iArr = this.z0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = zC;
                    if (zD) {
                        i = (zC ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else if (actionMasked == 1) {
                    this.e0.clear();
                    H(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.d0);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.d0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.c0 != 1) {
                        int i2 = x2 - this.f0;
                        int i3 = y2 - this.g0;
                        if (!zC || Math.abs(i2) <= this.j0) {
                            z = false;
                        } else {
                            this.h0 = x2;
                            z = true;
                        }
                        if (zD && Math.abs(i3) > this.j0) {
                            this.i0 = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    B();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.d0 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.h0 = x3;
                    this.f0 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.i0 = y3;
                    this.g0 = y3;
                } else if (actionMasked == 6) {
                    y(motionEvent);
                }
                if (this.c0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = com.gamericefishpro.space.y3.d.a;
        Trace.beginSection("RV OnLayout");
        i();
        Trace.endSection();
        this.J = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        b0 b0Var = this.C;
        if (b0Var == null) {
            h(i, i2);
            return;
        }
        if (b0Var.E()) {
            View.MeasureSpec.getMode(i);
            View.MeasureSpec.getMode(i2);
            this.C.b.h(i, i2);
        } else {
            if (this.I) {
                this.C.b.h(i, i2);
                return;
            }
            j0 j0Var = this.s0;
            if (j0Var.i) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            j0Var.c = 0;
            F();
            this.C.b.h(i, i2);
            G(false);
            j0Var.e = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (this.R > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i0 i0Var = (i0) parcelable;
        this.e = i0Var;
        super.onRestoreInstanceState(i0Var.d);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i0 i0Var = new i0(super.onSaveInstanceState());
        i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var.i = i0Var2.i;
            return i0Var;
        }
        b0 b0Var = this.C;
        if (b0Var != null) {
            i0Var.i = b0Var.P();
            return i0Var;
        }
        i0Var.i = null;
        return i0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.a0 = null;
        this.V = null;
        this.W = null;
        this.U = null;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x01f5 A[PHI: r1
      0x01f5: PHI (r1v54 int) = (r1v39 int), (r1v58 int) binds: [B:90:0x01de, B:94:0x01f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zR;
        int i;
        boolean z;
        if (!this.L && !this.M) {
            j jVar = this.G;
            if (jVar == null) {
                zR = motionEvent.getAction() == 0 ? false : r(motionEvent);
            } else {
                int i2 = jVar.a;
                if (jVar.q != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean zD = jVar.d(motionEvent.getX(), motionEvent.getY());
                        boolean zC = jVar.c(motionEvent.getX(), motionEvent.getY());
                        if (zD || zC) {
                            if (zC) {
                                jVar.r = 1;
                                jVar.k = (int) motionEvent.getX();
                            } else if (zD) {
                                jVar.r = 2;
                                jVar.j = (int) motionEvent.getY();
                            }
                            jVar.f(2);
                        }
                    } else if (motionEvent.getAction() == 1 && jVar.q == 2) {
                        jVar.j = 0.0f;
                        jVar.k = 0.0f;
                        jVar.f(1);
                        jVar.r = 0;
                    } else if (motionEvent.getAction() == 2 && jVar.q == 2) {
                        jVar.g();
                        if (jVar.r == 1) {
                            float x = motionEvent.getX();
                            int[] iArr = jVar.t;
                            iArr[0] = i2;
                            int i3 = jVar.l - i2;
                            iArr[1] = i3;
                            float fMax = Math.max(i2, Math.min(i3, x));
                            if (Math.abs(0 - fMax) >= 2.0f) {
                                int iE = j.e(jVar.k, fMax, iArr, jVar.n.computeHorizontalScrollRange(), jVar.n.computeHorizontalScrollOffset(), jVar.l);
                                if (iE != 0) {
                                    jVar.n.scrollBy(iE, 0);
                                }
                                jVar.k = fMax;
                            }
                        }
                        if (jVar.r == 2) {
                            float y = motionEvent.getY();
                            int[] iArr2 = jVar.s;
                            iArr2[0] = i2;
                            int i4 = jVar.m - i2;
                            iArr2[1] = i4;
                            float fMax2 = Math.max(i2, Math.min(i4, y));
                            if (Math.abs(0 - fMax2) >= 2.0f) {
                                int iE2 = j.e(jVar.j, fMax2, iArr2, jVar.n.computeVerticalScrollRange(), jVar.n.computeVerticalScrollOffset(), jVar.m);
                                if (iE2 != 0) {
                                    jVar.n.scrollBy(0, iE2);
                                }
                                jVar.j = fMax2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.G = null;
                }
                zR = true;
            }
            if (zR) {
                B();
                setScrollState(0);
                return true;
            }
            b0 b0Var = this.C;
            if (b0Var != null) {
                boolean zC2 = b0Var.c();
                boolean zD2 = this.C.d();
                if (this.e0 == null) {
                    this.e0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.z0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.e0.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker = this.e0;
                        int i5 = this.l0;
                        velocityTracker.computeCurrentVelocity(1000, i5);
                        float f = zC2 ? -this.e0.getXVelocity(this.d0) : 0.0f;
                        float f2 = zD2 ? -this.e0.getYVelocity(this.d0) : 0.0f;
                        if (f == 0.0f && f2 == 0.0f) {
                            setScrollState(0);
                        } else {
                            int i6 = (int) f;
                            int i7 = (int) f2;
                            b0 b0Var2 = this.C;
                            if (b0Var2 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.L) {
                                boolean zC3 = b0Var2.c();
                                boolean zD3 = this.C.d();
                                int i8 = this.k0;
                                if (!zC3 || Math.abs(i6) < i8) {
                                    i6 = 0;
                                }
                                if (!zD3 || Math.abs(i7) < i8) {
                                    i7 = 0;
                                }
                                if (i6 != 0 || i7 != 0) {
                                    float f3 = i6;
                                    float f4 = i7;
                                    if (!dispatchNestedPreFling(f3, f4)) {
                                        boolean z2 = zC3 || zD3;
                                        dispatchNestedFling(f3, f4, z2);
                                        int i9 = zC3;
                                        if (z2) {
                                            if (zD3) {
                                                i9 = (zC3 ? 1 : 0) | 2;
                                            }
                                            getScrollingChildHelper().g(i9, 1);
                                            int i10 = -i5;
                                            int iMax = Math.max(i10, Math.min(i6, i5));
                                            int iMax2 = Math.max(i10, Math.min(i7, i5));
                                            l0 l0Var = this.p0;
                                            RecyclerView recyclerView = l0Var.z;
                                            recyclerView.setScrollState(2);
                                            l0Var.e = 0;
                                            l0Var.d = 0;
                                            Interpolator interpolator = l0Var.v;
                                            c cVar = F0;
                                            if (interpolator != cVar) {
                                                l0Var.v = cVar;
                                                l0Var.i = new OverScroller(recyclerView.getContext(), cVar);
                                            }
                                            l0Var.i.fling(0, 0, iMax, iMax2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                            l0Var.a();
                                        }
                                    }
                                }
                            }
                            setScrollState(0);
                        }
                        B();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.d0);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.d0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax3 = this.h0 - x2;
                        int iMax4 = this.i0 - y2;
                        if (this.c0 != 1) {
                            if (zC2) {
                                iMax3 = iMax3 > 0 ? Math.max(0, iMax3 - this.j0) : Math.min(0, iMax3 + this.j0);
                                if (iMax3 != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (zD2) {
                                iMax4 = iMax4 > 0 ? Math.max(0, iMax4 - this.j0) : Math.min(0, iMax4 + this.j0);
                                if (iMax4 != 0) {
                                    z = true;
                                }
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                        int i11 = iMax3;
                        int i12 = iMax4;
                        if (this.c0 == 1) {
                            int[] iArr4 = this.A0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            boolean zJ = j(zC2 ? i11 : 0, zD2 ? i12 : 0, 0, iArr4, this.y0);
                            int[] iArr5 = this.y0;
                            if (zJ) {
                                i11 -= iArr4[0];
                                i12 -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i13 = i12;
                            this.h0 = x2 - iArr5[0];
                            this.i0 = y2 - iArr5[1];
                            if (C(zC2 ? i11 : 0, zD2 ? i13 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            l lVar = this.q0;
                            if (lVar != null && (i11 != 0 || i13 != 0)) {
                                lVar.a(this, i11, i13);
                            }
                        }
                    } else if (actionMasked == 3) {
                        B();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.d0 = motionEvent.getPointerId(actionIndex);
                        int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.h0 = x3;
                        this.f0 = x3;
                        int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.i0 = y3;
                        this.g0 = y3;
                    } else if (actionMasked == 6) {
                        y(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.d0 = motionEvent.getPointerId(0);
                int x4 = (int) (motionEvent.getX() + 0.5f);
                this.h0 = x4;
                this.f0 = x4;
                int y4 = (int) (motionEvent.getY() + 0.5f);
                this.i0 = y4;
                this.g0 = y4;
                if (zD2) {
                    i = zC2;
                    i = (zC2 ? 1 : 0) | 2;
                }
                i = zC2;
                getScrollingChildHelper().g(i, 0);
                this.e0.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final String p() {
        return " " + super.toString() + ", adapter:" + ((Object) null) + ", layout:" + this.C + ", context:" + getContext();
    }

    public final View q(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[SYNTHETIC] */
    public final boolean r(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j jVar = (j) arrayList.get(i);
            int i2 = jVar.q;
            if (i2 == 1) {
                boolean zD = jVar.d(motionEvent.getX(), motionEvent.getY());
                boolean zC = jVar.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zD || zC)) {
                    if (zC) {
                        jVar.r = 1;
                        jVar.k = (int) motionEvent.getX();
                    } else if (zD) {
                        jVar.r = 2;
                        jVar.j = (int) motionEvent.getY();
                    }
                    jVar.f(2);
                    if (action != 3) {
                        this.G = jVar;
                        return true;
                    }
                }
            } else if (i2 != 2) {
                continue;
            } else if (action != 3) {
                this.G = jVar;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        s(view);
        view.clearAnimation();
        s(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.C.getClass();
        if (this.R <= 0 && view2 != null) {
            A(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.C.V(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((j) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.K != 0 || this.L) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        b0 b0Var = this.C;
        if (b0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.L) {
            return;
        }
        boolean zC = b0Var.c();
        boolean zD = this.C.d();
        if (zC || zD) {
            if (!zC) {
                i = 0;
            }
            if (!zD) {
                i2 = 0;
            }
            C(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.R <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.N |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(o0 o0Var) {
        this.w0 = o0Var;
        com.gamericefishpro.space.d4.l0.l(this, o0Var);
    }

    public void setAdapter(v vVar) {
        setLayoutFrozen(false);
        y yVar = this.b0;
        if (yVar != null) {
            yVar.c();
        }
        b0 b0Var = this.C;
        a aVar = this.d;
        if (b0Var != null) {
            b0Var.R(aVar);
            this.C.S(aVar);
        }
        ((ArrayList) aVar.c).clear();
        aVar.g();
        com.gamericefishpro.space.a8.c cVar = this.i;
        cVar.v((ArrayList) cVar.i);
        cVar.v((ArrayList) cVar.v);
        b0 b0Var2 = this.C;
        if (b0Var2 != null) {
            b0Var2.J();
        }
        ((ArrayList) aVar.c).clear();
        aVar.g();
        g0 g0VarE = aVar.e();
        if (g0VarE.b == 0) {
            SparseArray sparseArray = g0VarE.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((f0) sparseArray.valueAt(i)).a.clear();
            }
        }
        this.s0.d = true;
        this.Q = false | this.Q;
        this.P = true;
        int i2 = this.v.i();
        for (int i3 = 0; i3 < i2; i3++) {
            s(this.v.h(i3));
        }
        v();
        a aVar2 = this.d;
        ArrayList arrayList = (ArrayList) aVar2.e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
        }
        aVar2.g();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(w wVar) {
        if (wVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.y) {
            this.a0 = null;
            this.V = null;
            this.W = null;
            this.U = null;
        }
        this.y = z;
        super.setClipToPadding(z);
        if (this.J) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(x xVar) {
        xVar.getClass();
        this.T = xVar;
        this.a0 = null;
        this.V = null;
        this.W = null;
        this.U = null;
    }

    public void setHasFixedSize(boolean z) {
        this.I = z;
    }

    public void setItemAnimator(y yVar) {
        y yVar2 = this.b0;
        if (yVar2 != null) {
            yVar2.c();
            this.b0.a = null;
        }
        this.b0 = yVar;
        if (yVar != null) {
            yVar.a = this.v0;
        }
    }

    public void setItemViewCacheSize(int i) {
        a aVar = this.d;
        aVar.a = i;
        aVar.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(b0 b0Var) {
        if (b0Var == this.C) {
            return;
        }
        setScrollState(0);
        l0 l0Var = this.p0;
        l0Var.z.removeCallbacks(l0Var);
        l0Var.i.abortAnimation();
        b0 b0Var2 = this.C;
        a aVar = this.d;
        if (b0Var2 != null) {
            y yVar = this.b0;
            if (yVar != null) {
                yVar.c();
            }
            this.C.R(aVar);
            this.C.S(aVar);
            ((ArrayList) aVar.c).clear();
            aVar.g();
            if (this.H) {
                b0 b0Var3 = this.C;
                b0Var3.e = false;
                b0Var3.L(this);
            }
            this.C.Z(null);
            this.C = null;
        } else {
            ((ArrayList) aVar.c).clear();
            aVar.g();
        }
        com.gamericefishpro.space.r5.b bVar = this.v;
        RecyclerView recyclerView = ((u) bVar.e).a;
        ((r0) bVar.i).j();
        ArrayList arrayList = (ArrayList) bVar.v;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s((View) arrayList.get(size));
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.C = b0Var;
        if (b0Var != null) {
            if (b0Var.b != null) {
                throw new IllegalArgumentException("LayoutManager " + b0Var + " is already attached to a RecyclerView:" + b0Var.b.p());
            }
            b0Var.Z(this);
            if (this.H) {
                b0 b0Var4 = this.C;
                b0Var4.e = true;
                b0Var4.K(this);
            }
        }
        aVar.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        com.gamericefishpro.space.d4.l scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            Field field = com.gamericefishpro.space.d4.l0.a;
            com.gamericefishpro.space.d4.d0.j(viewGroup);
        }
        scrollingChildHelper.d = z;
    }

    @Deprecated
    public void setOnScrollListener(e0 e0Var) {
        this.t0 = e0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.o0 = z;
    }

    public void setRecycledViewPool(g0 g0Var) {
        a aVar = this.d;
        g0 g0Var2 = (g0) aVar.f;
        if (g0Var2 != null) {
            g0Var2.b--;
        }
        aVar.f = g0Var;
        if (g0Var != null) {
            ((RecyclerView) aVar.g).getAdapter();
        }
    }

    public void setScrollState(int i) {
        if (i == this.c0) {
            return;
        }
        this.c0 = i;
        if (i != 2) {
            l0 l0Var = this.p0;
            l0Var.z.removeCallbacks(l0Var);
            l0Var.i.abortAnimation();
        }
        b0 b0Var = this.C;
        if (b0Var != null) {
            b0Var.Q(i);
        }
        e0 e0Var = this.t0;
        if (e0Var != null) {
            e0Var.a(i);
        }
        ArrayList arrayList = this.u0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((e0) this.u0.get(size)).a(i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.j0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.j0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(k0 k0Var) {
        this.d.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.L) {
            d("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.L = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.L = true;
            this.M = true;
            setScrollState(0);
            l0 l0Var = this.p0;
            l0Var.z.removeCallbacks(l0Var);
            l0Var.i.abortAnimation();
        }
    }

    public final Rect t(View view) {
        c0 c0Var = (c0) view.getLayoutParams();
        boolean z = c0Var.b;
        Rect rect = c0Var.a;
        if (!z) {
            return rect;
        }
        if (this.s0.e) {
            throw null;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.E;
        if (arrayList.size() <= 0) {
            c0Var.b = false;
            return rect;
        }
        this.z.set(0, 0, 0, 0);
        ((z) arrayList.get(0)).getClass();
        ((c0) view.getLayoutParams()).getClass();
        throw null;
    }

    public final boolean u() {
        return !this.J || this.P || this.i.p();
    }

    public final void v() {
        int i = this.v.i();
        for (int i2 = 0; i2 < i; i2++) {
            ((c0) this.v.h(i2).getLayoutParams()).b = true;
        }
        ArrayList arrayList = (ArrayList) this.d.e;
        if (arrayList.size() <= 0) {
            return;
        }
        ((m0) arrayList.get(0)).getClass();
        throw null;
    }

    public final void w() {
        this.R++;
    }

    public final void x(boolean z) {
        AccessibilityManager accessibilityManager;
        int i = this.R - 1;
        this.R = i;
        if (i < 1) {
            this.R = 0;
            if (z) {
                int i2 = this.N;
                this.N = 0;
                if (i2 != 0 && (accessibilityManager = this.O) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i2);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.B0;
                int size = arrayList.size() - 1;
                if (size < 0) {
                    arrayList.clear();
                } else {
                    ((m0) arrayList.get(size)).getClass();
                    throw null;
                }
            }
        }
    }

    public final void y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.d0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.d0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.h0 = x;
            this.f0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.i0 = y;
            this.g0 = y;
        }
    }

    public final void z(m0 m0Var, com.gamericefishpro.space.n9.y yVar) {
        m0Var.b &= -8193;
        if (this.s0.f && m0Var.k() && !m0Var.h() && !m0Var.n()) {
            throw null;
        }
        com.gamericefishpro.space.t.r0 r0Var = (com.gamericefishpro.space.t.r0) this.w.d;
        u0 u0VarA = (u0) r0Var.get(m0Var);
        if (u0VarA == null) {
            u0VarA = u0.a();
            r0Var.put(m0Var, u0VarA);
        }
        u0VarA.getClass();
        u0VarA.a |= 4;
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        Constructor constructor;
        super(context, attributeSet, i);
        new com.gamericefishpro.space.n9.z(this, 23);
        this.d = new a(this);
        this.w = new com.gamericefishpro.space.u6.l(10);
        this.z = new Rect();
        this.A = new Rect();
        this.B = new RectF();
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.K = 0;
        this.P = false;
        this.Q = false;
        this.R = 0;
        this.S = 0;
        this.T = new x();
        g gVar = new g();
        Object[] objArr = null;
        gVar.a = null;
        gVar.b = new ArrayList();
        gVar.c = 120L;
        gVar.d = 120L;
        gVar.e = 250L;
        gVar.f = 250L;
        gVar.g = true;
        gVar.h = new ArrayList();
        gVar.i = new ArrayList();
        gVar.j = new ArrayList();
        gVar.k = new ArrayList();
        gVar.l = new ArrayList();
        gVar.m = new ArrayList();
        gVar.n = new ArrayList();
        gVar.o = new ArrayList();
        gVar.p = new ArrayList();
        gVar.q = new ArrayList();
        gVar.r = new ArrayList();
        this.b0 = gVar;
        this.c0 = 0;
        this.d0 = -1;
        this.m0 = Float.MIN_VALUE;
        this.n0 = Float.MIN_VALUE;
        this.o0 = true;
        this.p0 = new l0(this);
        this.r0 = new d();
        j0 j0Var = new j0();
        j0Var.a = 0;
        j0Var.b = 0;
        j0Var.c = 0;
        j0Var.d = false;
        j0Var.e = false;
        j0Var.f = false;
        j0Var.g = false;
        j0Var.h = false;
        j0Var.i = false;
        this.s0 = j0Var;
        u uVar = new u(this);
        this.v0 = uVar;
        this.y0 = new int[2];
        this.z0 = new int[2];
        this.A0 = new int[2];
        this.B0 = new ArrayList();
        this.C0 = new b(17, this);
        new com.gamericefishpro.space.n9.z(this, 22);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.j0 = viewConfiguration.getScaledTouchSlop();
        this.m0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.n0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.k0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.l0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.b0.a = uVar;
        this.i = new com.gamericefishpro.space.a8.c(new a0(this));
        this.v = new com.gamericefishpro.space.r5.b(new u(this));
        Field field = com.gamericefishpro.space.d4.l0.a;
        if (com.gamericefishpro.space.d4.f0.a(this) == 0) {
            com.gamericefishpro.space.d4.f0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.O = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new o0(this));
        int[] iArr = com.gamericefishpro.space.q5.a.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        com.gamericefishpro.space.d4.l0.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.y = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + p());
            }
            Resources resources = getContext().getResources();
            i2 = 4;
            new j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.gamericefishpro.space.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.gamericefishpro.space.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.gamericefishpro.space.R.dimen.fastscroll_margin));
        } else {
            i2 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(b0.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(E0);
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = context;
                        objArr2[r11] = attributeSet;
                        objArr2[2] = Integer.valueOf(i);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((b0) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                }
            }
        }
        int[] iArr2 = D0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        com.gamericefishpro.space.d4.l0.k(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        b0 b0Var = this.C;
        if (b0Var != null) {
            return b0Var.o(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
    }

    public void setOnFlingListener(d0 d0Var) {
    }

    @Deprecated
    public void setRecyclerListener(h0 h0Var) {
    }
}
