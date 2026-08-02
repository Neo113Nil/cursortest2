package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lb9 extends n2k implements f29 {
    public final /* synthetic */ g29 e;

    public /* synthetic */ lb9(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // defpackage.f29, defpackage.a0c, defpackage.ptn
    public final void a() {
        this.e.a();
    }

    @Override // defpackage.p7t
    public final void d(View view) {
        this.e.d(view);
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
        return this.e.b.e();
    }

    @Override // defpackage.yp8
    public final void g(e23 e23Var, op8 op8Var, View view) {
        this.e.g(e23Var, op8Var, view);
    }

    @Override // defpackage.f29
    public e23 getBindingContext() {
        return this.e.d;
    }

    @Override // defpackage.f29
    public ib8 getDiv() {
        return (ib8) this.e.c;
    }

    @Override // defpackage.yp8
    public tp8 getDivBorderDrawer() {
        return this.e.a.a;
    }

    @Override // defpackage.yp8
    public boolean getNeedClipping() {
        return this.e.a.b;
    }

    @Override // defpackage.a0c
    @NotNull
    public List<ja8> getSubscriptions() {
        return this.e.e;
    }

    @Override // defpackage.p7t
    public final void h(View view) {
        this.e.h(view);
    }

    @Override // defpackage.a0c
    public final void i(ja8 ja8Var) {
        this.e.i(ja8Var);
    }

    @Override // defpackage.yp8
    public final void k() {
        this.e.k();
    }

    @Override // defpackage.a0c
    public final void l() {
        this.e.l();
    }

    @Override // defpackage.yp8
    public final void m() {
        this.e.m();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.e.b(i, i2);
    }

    @Override // defpackage.f29
    public void setBindingContext(e23 e23Var) {
        this.e.d = e23Var;
    }

    @Override // defpackage.yp8
    public void setNeedClipping(boolean z) {
        this.e.setNeedClipping(z);
    }

    @Override // defpackage.f29
    public void setDiv(ib8 ib8Var) {
        this.e.c = ib8Var;
    }

    public lb9(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public lb9(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public lb9(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new g29();
    }
}
