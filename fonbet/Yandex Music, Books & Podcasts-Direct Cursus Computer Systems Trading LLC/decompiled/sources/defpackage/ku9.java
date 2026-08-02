package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class ku9 extends kvc implements p7t {
    public final /* synthetic */ q7t l;
    public Function1 m;
    public boolean n;
    public boolean o;

    public ku9(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = new q7t();
        setClipChildren(false);
        setClipToPadding(false);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setImportantForAccessibility(2);
        this.m = vq9.v0;
    }

    public static Unit f(View view, int i, int i2, int i3, int i4) {
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            jj4.j("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            return null;
        }
        u79 u79Var = (u79) layoutParams;
        ((ViewGroup.MarginLayoutParams) u79Var).leftMargin = i;
        ((ViewGroup.MarginLayoutParams) u79Var).topMargin = i2;
        ((ViewGroup.MarginLayoutParams) u79Var).width = i3;
        ((ViewGroup.MarginLayoutParams) u79Var).height = i4;
        view.setLayoutParams(u79Var);
        return Unit.a;
    }

    @Override // defpackage.p7t
    public final void d(View view) {
        this.l.d(view);
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
        return this.l.e();
    }

    public View getBringToTopView() {
        if (this.o && this.n && getChildCount() > 1) {
            return getChildAt(1);
        }
        return null;
    }

    @NotNull
    public Function1<MotionEvent, Unit> getDismissAction() {
        return this.m;
    }

    public View getSubstrateView() {
        if (!this.n || getChildCount() == 0) {
            return null;
        }
        return getChildAt(0);
    }

    public View getTooltipView() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(getChildCount() - 1);
    }

    @Override // defpackage.p7t
    public final void h(View view) {
        this.l.h(view);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!onTouchEvent && motionEvent.getAction() == 0) {
            getDismissAction().invoke(motionEvent);
        }
        return onTouchEvent;
    }

    public void setDismissAction(@NotNull Function1<? super MotionEvent, Unit> function1) {
        this.m = function1;
    }

    public ku9(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ku9(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ku9(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
