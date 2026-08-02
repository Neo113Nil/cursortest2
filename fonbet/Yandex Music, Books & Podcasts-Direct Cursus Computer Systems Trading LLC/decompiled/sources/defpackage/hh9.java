package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class hh9 extends vi2 implements f29 {
    public i3k A1;
    public boolean B1;
    public int C1;
    public int D1;
    public int E1;
    public boolean F1;
    public final /* synthetic */ g29 t1;
    public int u1;
    public int v1;
    public int w1;
    public float x1;
    public bqj y1;
    public q09 z1;

    public hh9(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(new uf6(context, R.style.Div_Gallery), attributeSet, i);
        this.t1 = new g29();
        this.u1 = -1;
        this.z1 = q09.DEFAULT;
        this.C1 = -1;
    }

    public static int J0(float f) {
        return (int) Math.ceil(f);
    }

    public final ArrayList H0(int i) {
        if (View.MeasureSpec.getMode(i) == 0) {
            qon adapter = getAdapter();
            u09 u09Var = adapter instanceof u09 ? (u09) adapter : null;
            if (u09Var != null) {
                ArrayList u = u09Var.u();
                if (!u.isEmpty()) {
                    return u;
                }
            }
        }
        return null;
    }

    public final int I0(boolean z, int i, int i2, Function1 function1) {
        if (!z) {
            return i;
        }
        if (!(getChildCount() > 0)) {
            wvs.n();
            return 0;
        }
        int i3 = 0 + 1;
        View childAt = getChildAt(0);
        if (childAt == null) {
            rj7.m();
            return 0;
        }
        int intValue = ((Number) function1.invoke(childAt)).intValue();
        while (true) {
            if (!(i3 < getChildCount())) {
                yon layoutManager = getLayoutManager();
                DivGridLayoutManager divGridLayoutManager = layoutManager instanceof DivGridLayoutManager ? (DivGridLayoutManager) layoutManager : null;
                if (divGridLayoutManager == null) {
                    return View.MeasureSpec.makeMeasureSpec(intValue + i2, 1073741824);
                }
                return View.MeasureSpec.makeMeasureSpec(divGridLayoutManager.I1() + (intValue * 2) + i2, 1073741824);
            }
            int i4 = i3 + 1;
            View childAt2 = getChildAt(i3);
            if (childAt2 == null) {
                rj7.m();
                return 0;
            }
            int intValue2 = ((Number) function1.invoke(childAt2)).intValue();
            if (intValue < intValue2) {
                intValue = intValue2;
            }
            i3 = i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean U(int i, int i2) {
        boolean U = super.U(i, i2);
        if (getScrollMode() == q09.PAGING) {
            this.B1 = !U;
        }
        return U;
    }

    @Override // defpackage.f29, defpackage.a0c, defpackage.ptn
    public final void a() {
        super.a();
        Object adapter = getAdapter();
        if (adapter instanceof ptn) {
            ((ptn) adapter).a();
        }
    }

    @Override // defpackage.p7t
    public final void d(View view) {
        this.t1.d(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        tp8 divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            divBorderDrawer.c(canvas);
            super.draw(canvas);
            divBorderDrawer.d(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != null && view.getVisibility() == 0) {
            bg3.z(view, canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // defpackage.p7t
    public final boolean e() {
        return this.t1.b.e();
    }

    @Override // defpackage.yp8
    public final void g(e23 e23Var, op8 op8Var, View view) {
        this.t1.g(e23Var, op8Var, view);
    }

    @Override // defpackage.f29
    public e23 getBindingContext() {
        return this.t1.d;
    }

    public boolean getConsiderMatchParent() {
        return this.F1;
    }

    @Override // defpackage.f29
    public eb8 getDiv() {
        return (eb8) this.t1.c;
    }

    @Override // defpackage.yp8
    public tp8 getDivBorderDrawer() {
        return this.t1.a.a;
    }

    public int getHeightMeasureSpec() {
        return this.E1;
    }

    @Override // defpackage.yp8
    public boolean getNeedClipping() {
        return this.t1.a.b;
    }

    public bqj getOnInterceptTouchEventListener() {
        return this.y1;
    }

    public i3k getPagerSnapStartHelper() {
        return this.A1;
    }

    public float getScrollInterceptionAngle() {
        return this.x1;
    }

    @NotNull
    public q09 getScrollMode() {
        return this.z1;
    }

    @Override // defpackage.a0c
    @NotNull
    public List<ja8> getSubscriptions() {
        return this.t1.e;
    }

    public int getWidthMeasureSpec() {
        return this.D1;
    }

    @Override // defpackage.p7t
    public final void h(View view) {
        this.t1.h(view);
    }

    @Override // defpackage.a0c
    public final void i(ja8 ja8Var) {
        this.t1.i(ja8Var);
    }

    @Override // defpackage.yp8
    public final void k() {
        this.t1.k();
    }

    @Override // defpackage.a0c
    public final void l() {
        this.t1.l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i) {
        if (i == 2) {
            View focusedChild = getFocusedChild();
            if (focusedChild == null) {
                this.C1 = -1;
            } else {
                this.C1 = RecyclerView.Y(focusedChild);
            }
        }
    }

    @Override // defpackage.yp8
    public final void m() {
        this.t1.m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i, int i2) {
        int i3;
        View child;
        if (this.C1 == -1) {
            return;
        }
        yon layoutManager = getLayoutManager();
        int i4 = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).p : layoutManager instanceof DivGridLayoutManager ? ((DivGridLayoutManager) layoutManager).t : 0;
        if (i4 == 1 && i2 > 0) {
            i3 = this.C1 + 1;
        } else if (i4 != 1 || i2 > 0) {
            int i5 = this.C1;
            i3 = i > 0 ? i5 + 1 : i5 - 1;
        } else {
            i3 = this.C1 - 1;
        }
        opn S = S(i3);
        KeyEvent.Callback callback = S != null ? S.a : null;
        j1a j1aVar = callback instanceof j1a ? (j1a) callback : null;
        if (j1aVar == null || (child = j1aVar.getChild()) == null) {
            return;
        }
        child.requestFocus();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        bqj onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        if (onInterceptTouchEventListener != null) {
            ((o6c) onInterceptTouchEventListener).E(this, motionEvent);
        }
        if (getScrollInterceptionAngle() == 0.0f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.u1 = motionEvent.getPointerId(0);
            this.v1 = J0(motionEvent.getX());
            this.w1 = J0(motionEvent.getY());
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked != 2) {
            if (actionMasked != 5) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.u1 = motionEvent.getPointerId(actionIndex);
            this.v1 = J0(motionEvent.getX(actionIndex));
            this.w1 = J0(motionEvent.getY(actionIndex));
            return super.onInterceptTouchEvent(motionEvent);
        }
        yon layoutManager = getLayoutManager();
        if (layoutManager != null && (findPointerIndex = motionEvent.findPointerIndex(this.u1)) >= 0) {
            int J0 = J0(motionEvent.getX(findPointerIndex));
            int J02 = J0(motionEvent.getY(findPointerIndex));
            if (getScrollState() == 1) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int abs = Math.abs(J0 - this.v1);
            int abs2 = Math.abs(J02 - this.w1);
            if (abs != 0 || abs2 != 0) {
                double atan = abs != 0 ? (Math.atan(abs2 / abs) * 180) / 3.141592653589793d : 90.0d;
                if ((layoutManager.x() && atan <= getScrollInterceptionAngle()) || (layoutManager.y() && atan > getScrollInterceptionAngle())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        jc8 div;
        setWidthMeasureSpec(i);
        setHeightMeasureSpec(i2);
        yon layoutManager = getLayoutManager();
        int i3 = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).p : layoutManager instanceof DivGridLayoutManager ? ((DivGridLayoutManager) layoutManager).t : 0;
        if (i3 != 0) {
            ArrayList H0 = H0(getWidthMeasureSpec());
            if (H0 != null) {
                if (!H0.isEmpty()) {
                    Iterator it = H0.iterator();
                    while (it.hasNext()) {
                        if (!(((k79) it.next()).a.d().c() instanceof zj9)) {
                        }
                    }
                }
                z = true;
            }
            z = false;
            break;
        }
        ArrayList H02 = H0(getHeightMeasureSpec());
        if (H02 != null) {
            if (!H02.isEmpty()) {
                Iterator it2 = H02.iterator();
                while (it2.hasNext()) {
                    if (!(((k79) it2.next()).a.d().a() instanceof zj9)) {
                    }
                }
            }
            z = true;
        }
        z = false;
        break;
        setConsiderMatchParent(z);
        super.onMeasure(i, i2);
        if (i3 == 0) {
            ArrayList H03 = H0(getHeightMeasureSpec());
            if (H03 != null && !H03.isEmpty()) {
                Iterator it3 = H03.iterator();
                while (it3.hasNext()) {
                    if (((k79) it3.next()).a.d().a() instanceof zj9) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
        } else {
            ArrayList H04 = H0(getWidthMeasureSpec());
            if (H04 != null && !H04.isEmpty()) {
                Iterator it4 = H04.iterator();
                while (it4.hasNext()) {
                    if (((k79) it4.next()).a.d().c() instanceof zj9) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
        }
        if (!z2) {
            return;
        }
        setConsiderMatchParent(false);
        setWidthMeasureSpec(I0(i3 == 1, i, getPaddingRight() + getPaddingLeft(), gd9.B));
        setHeightMeasureSpec(I0(i3 == 0, i2, getPaddingBottom() + getPaddingTop(), gd9.C));
        int i4 = 0;
        while (true) {
            if (!(i4 < getChildCount())) {
                return;
            }
            int i5 = i4 + 1;
            View childAt = getChildAt(i4);
            if (childAt == null) {
                rj7.m();
                return;
            }
            f29 D = bg3.D(childAt);
            if (D != null && (div = D.getDiv()) != null && (new re0(i3, 2).invoke(div.d()) instanceof zj9)) {
                childAt.measure(getWidthMeasureSpec(), getHeightMeasureSpec());
            }
            i4 = i5;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.t1.b(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yon layoutManager;
        i3k pagerSnapStartHelper;
        View e;
        int[] b;
        int i;
        q09 scrollMode = getScrollMode();
        q09 q09Var = q09.PAGING;
        if (scrollMode == q09Var) {
            this.B1 = true;
        }
        boolean z = super.onTouchEvent(motionEvent) && (canScrollHorizontally(-1) || canScrollHorizontally(1) || canScrollVertically(-1) || canScrollVertically(1));
        if (motionEvent != null && motionEvent.getActionMasked() == 1 && getScrollMode() == q09Var && this.B1 && (layoutManager = getLayoutManager()) != null && (pagerSnapStartHelper = getPagerSnapStartHelper()) != null && (e = pagerSnapStartHelper.e(layoutManager)) != null && ((i = (b = pagerSnapStartHelper.b(layoutManager, e))[0]) != 0 || b[1] != 0)) {
            B0(i, b[1], false);
        }
        return z;
    }

    @Override // defpackage.f29
    public void setBindingContext(e23 e23Var) {
        this.t1.d = e23Var;
    }

    public void setConsiderMatchParent(boolean z) {
        this.F1 = z;
    }

    public void setHeightMeasureSpec(int i) {
        this.E1 = i;
    }

    @Override // defpackage.yp8
    public void setNeedClipping(boolean z) {
        this.t1.setNeedClipping(z);
    }

    public void setOnInterceptTouchEventListener(bqj bqjVar) {
        this.y1 = bqjVar;
    }

    public void setPagerSnapStartHelper(i3k i3kVar) {
        this.A1 = i3kVar;
    }

    public void setScrollInterceptionAngle(float f) {
        this.x1 = f != 0.0f ? Math.abs(f) % 90 : 0.0f;
    }

    public void setScrollMode(@NotNull q09 q09Var) {
        this.z1 = q09Var;
    }

    public void setWidthMeasureSpec(int i) {
        this.D1 = i;
    }

    @Override // defpackage.f29
    public void setDiv(eb8 eb8Var) {
        this.t1.c = eb8Var;
    }

    public hh9(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ hh9(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public hh9(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
