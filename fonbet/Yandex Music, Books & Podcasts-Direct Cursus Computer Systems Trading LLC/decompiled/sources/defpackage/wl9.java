package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wl9 extends quq implements f29 {
    public final /* synthetic */ g29 J;

    public /* synthetic */ wl9(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // defpackage.f29, defpackage.a0c, defpackage.ptn
    public final void a() {
        this.J.a();
    }

    @Override // defpackage.p7t
    public final void d(View view) {
        this.J.d(view);
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

    @Override // defpackage.p7t
    public final boolean e() {
        return this.J.b.e();
    }

    @Override // defpackage.yp8
    public final void g(e23 e23Var, op8 op8Var, View view) {
        this.J.g(e23Var, op8Var, view);
    }

    @Override // defpackage.f29
    public e23 getBindingContext() {
        return this.J.d;
    }

    @Override // defpackage.f29
    public nb8 getDiv() {
        return (nb8) this.J.c;
    }

    @Override // defpackage.yp8
    public tp8 getDivBorderDrawer() {
        return this.J.a.a;
    }

    @Override // defpackage.yp8
    public boolean getNeedClipping() {
        return this.J.a.b;
    }

    @Override // defpackage.a0c
    @NotNull
    public List<ja8> getSubscriptions() {
        return this.J.e;
    }

    @Override // defpackage.p7t
    public final void h(View view) {
        this.J.h(view);
    }

    @Override // defpackage.a0c
    public final void i(ja8 ja8Var) {
        this.J.i(ja8Var);
    }

    @Override // defpackage.yp8
    public final void k() {
        this.J.k();
    }

    @Override // defpackage.a0c
    public final void l() {
        this.J.l();
    }

    @Override // defpackage.yp8
    public final void m() {
        this.J.m();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.J.b(i, i2);
    }

    @Override // defpackage.f29
    public void setBindingContext(e23 e23Var) {
        this.J.d = e23Var;
    }

    @Override // defpackage.yp8
    public void setNeedClipping(boolean z) {
        this.J.setNeedClipping(z);
    }

    @Override // defpackage.f29
    public void setDiv(nb8 nb8Var) {
        this.J.c = nb8Var;
    }

    public wl9(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.J = new g29();
    }
}
