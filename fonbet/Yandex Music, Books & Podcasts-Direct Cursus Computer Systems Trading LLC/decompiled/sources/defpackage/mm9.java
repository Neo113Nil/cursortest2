package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mm9 extends kvc implements f29 {
    public final /* synthetic */ g29 l;
    public pm9 m;
    public final bf3 n;
    public final e6d o;
    public Function0 p;
    public jc8 q;

    public mm9(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = new g29();
        bf3 bf3Var = new bf3(3, this);
        this.n = bf3Var;
        this.o = new e6d(context, bf3Var, new Handler(Looper.getMainLooper()));
    }

    @Override // defpackage.f29, defpackage.a0c, defpackage.ptn
    public final void a() {
        this.l.a();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (super.canScrollHorizontally(i)) {
            return true;
        }
        if (getChildCount() < 1 || this.p == null) {
            return super.canScrollHorizontally(i);
        }
        View childAt = getChildAt(0);
        return i < 0 ? childAt.getTranslationX() <= ((float) childAt.getWidth()) : (-childAt.getTranslationX()) <= ((float) childAt.getWidth());
    }

    @Override // defpackage.p7t
    public final void d(View view) {
        this.l.d(view);
    }

    @Override // android.view.View
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

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != null && view.getVisibility() == 0) {
            bg3.z(view, canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // defpackage.p7t
    public final boolean e() {
        return this.l.b.e();
    }

    @Override // defpackage.yp8
    public final void g(e23 e23Var, op8 op8Var, View view) {
        this.l.g(e23Var, op8Var, view);
    }

    public final jc8 getActiveStateDiv$div_release() {
        return this.q;
    }

    @Override // defpackage.f29
    public e23 getBindingContext() {
        return this.l.d;
    }

    @Override // defpackage.f29
    public ob8 getDiv() {
        return (ob8) this.l.c;
    }

    @Override // defpackage.yp8
    public tp8 getDivBorderDrawer() {
        return this.l.a.a;
    }

    @Override // defpackage.yp8
    public boolean getNeedClipping() {
        return this.l.a.b;
    }

    public final pm9 getPath() {
        return this.m;
    }

    public final String getStateId() {
        pm9 pm9Var = this.m;
        if (pm9Var != null) {
            return pm9Var.d();
        }
        return null;
    }

    @Override // defpackage.a0c
    @NotNull
    public List<ja8> getSubscriptions() {
        return this.l.e;
    }

    public final Function0<Unit> getSwipeOutCallback() {
        return this.p;
    }

    @Override // defpackage.p7t
    public final void h(View view) {
        this.l.h(view);
    }

    @Override // defpackage.a0c
    public final void i(ja8 ja8Var) {
        this.l.i(ja8Var);
    }

    @Override // defpackage.yp8
    public final void k() {
        this.l.k();
    }

    @Override // defpackage.a0c
    public final void l() {
        this.l.l();
    }

    @Override // defpackage.yp8
    public final void m() {
        this.l.m();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.p == null) {
            requestDisallowInterceptTouchEvent(false);
            return false;
        }
        this.o.a.onTouchEvent(motionEvent);
        bf3 bf3Var = this.n;
        mm9 mm9Var = (mm9) bf3Var.b;
        View childAt = mm9Var.getChildCount() > 0 ? mm9Var.getChildAt(0) : null;
        requestDisallowInterceptTouchEvent(!((childAt != null ? childAt.getTranslationX() : 0.0f) == 0.0f));
        mm9 mm9Var2 = (mm9) bf3Var.b;
        View childAt2 = mm9Var2.getChildCount() > 0 ? mm9Var2.getChildAt(0) : null;
        if ((childAt2 != null ? childAt2.getTranslationX() : 0.0f) == 0.0f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.l.b(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float abs;
        le leVar;
        float f;
        if (this.p == null) {
            requestDisallowInterceptTouchEvent(false);
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            bf3 bf3Var = this.n;
            mm9 mm9Var = (mm9) bf3Var.b;
            View childAt = mm9Var.getChildCount() > 0 ? mm9Var.getChildAt(0) : null;
            if (childAt != null) {
                if (Math.abs(childAt.getTranslationX()) > childAt.getWidth() / 2) {
                    abs = (Math.abs(childAt.getWidth() - childAt.getTranslationX()) * 300.0f) / childAt.getWidth();
                    f = Math.signum(childAt.getTranslationX()) * childAt.getWidth();
                    leVar = new le(2, (mm9) bf3Var.b);
                } else {
                    abs = (Math.abs(childAt.getTranslationX()) * 300.0f) / childAt.getWidth();
                    leVar = null;
                    f = 0.0f;
                }
                childAt.animate().cancel();
                childAt.animate().setDuration((long) hyf.x(abs, 0.0f, 300.0f)).translationX(f).setListener(leVar).start();
            }
        }
        if (this.o.a.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setActiveStateDiv$div_release(jc8 jc8Var) {
        this.q = jc8Var;
    }

    @Override // defpackage.f29
    public void setBindingContext(e23 e23Var) {
        this.l.d = e23Var;
    }

    @Override // defpackage.yp8
    public void setNeedClipping(boolean z) {
        this.l.setNeedClipping(z);
    }

    public final void setPath(pm9 pm9Var) {
        this.m = pm9Var;
    }

    public final void setSwipeOutCallback(Function0<Unit> function0) {
        this.p = function0;
    }

    @Override // defpackage.f29
    public void setDiv(ob8 ob8Var) {
        this.l.c = ob8Var;
    }

    public mm9(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ mm9(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public mm9(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
