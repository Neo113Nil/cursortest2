package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class lp9 extends t2s implements f29 {
    public final /* synthetic */ g29 f;

    public lp9(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new g29();
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
    public qb8 getDiv() {
        return (qb8) this.f.c;
    }

    @Override // defpackage.yp8
    public tp8 getDivBorderDrawer() {
        return this.f.a.a;
    }

    @Override // defpackage.yp8
    public boolean getNeedClipping() {
        return this.f.a.b;
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

    @Override // defpackage.f29
    public void setBindingContext(e23 e23Var) {
        this.f.d = e23Var;
    }

    @Override // defpackage.yp8
    public void setNeedClipping(boolean z) {
        this.f.setNeedClipping(z);
    }

    @Override // defpackage.f29
    public void setDiv(qb8 qb8Var) {
        this.f.c = qb8Var;
    }

    public /* synthetic */ lp9(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lp9(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
