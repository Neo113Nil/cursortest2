package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d29 extends rpd implements f29 {
    public final /* synthetic */ g29 f;
    public ttn g;

    public /* synthetic */ d29(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // defpackage.f29, defpackage.a0c, defpackage.ptn
    public final void a() {
        this.f.a();
    }

    @Override // defpackage.p7t
    public final void d(View view) {
        this.f.d(view);
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
        return this.f.b.e();
    }

    @Override // defpackage.yp8
    public final void g(e23 e23Var, op8 op8Var, View view) {
        this.f.g(e23Var, op8Var, view);
    }

    @Override // defpackage.f29
    public e23 getBindingContext() {
        return this.f.d;
    }

    @Override // defpackage.f29
    public gb8 getDiv() {
        return (gb8) this.f.c;
    }

    @Override // defpackage.yp8
    public tp8 getDivBorderDrawer() {
        return this.f.a.a;
    }

    @Override // defpackage.yp8
    public boolean getNeedClipping() {
        return this.f.a.b;
    }

    public final ttn getReleaseViewVisitor$div_release() {
        return this.g;
    }

    @Override // defpackage.a0c
    @NotNull
    public List<ja8> getSubscriptions() {
        return this.f.e;
    }

    @Override // defpackage.p7t
    public final void h(View view) {
        this.f.h(view);
    }

    @Override // defpackage.a0c
    public final void i(ja8 ja8Var) {
        this.f.i(ja8Var);
    }

    @Override // defpackage.yp8
    public final void k() {
        this.f.k();
    }

    @Override // defpackage.a0c
    public final void l() {
        this.f.l();
    }

    @Override // defpackage.yp8
    public final void m() {
        this.f.m();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f.b(i, i2);
    }

    @Override // defpackage.rpd, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ttn ttnVar = this.g;
        if (ttnVar != null) {
            yd5.R(ttnVar, view);
        }
    }

    @Override // defpackage.f29
    public void setBindingContext(e23 e23Var) {
        this.f.d = e23Var;
    }

    @Override // defpackage.yp8
    public void setNeedClipping(boolean z) {
        this.f.setNeedClipping(z);
    }

    public final void setReleaseViewVisitor$div_release(ttn ttnVar) {
        this.g = ttnVar;
    }

    @Override // defpackage.f29
    public void setDiv(gb8 gb8Var) {
        this.f.c = gb8Var;
    }

    public d29(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public d29(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public d29(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new g29();
    }
}
