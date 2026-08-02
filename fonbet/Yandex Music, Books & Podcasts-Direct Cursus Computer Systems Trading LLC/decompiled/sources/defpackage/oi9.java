package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class oi9 extends ddp implements f29 {
    public final /* synthetic */ g29 A;
    public Function1 B;

    public oi9(@NotNull Context context) {
        super(context);
        this.A = new g29();
    }

    @Override // defpackage.f29, defpackage.a0c, defpackage.ptn
    public final void a() {
        this.A.a();
    }

    @Override // defpackage.p7t
    public final void d(View view) {
        this.A.d(view);
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
        return this.A.b.e();
    }

    @Override // defpackage.yp8
    public final void g(e23 e23Var, op8 op8Var, View view) {
        this.A.g(e23Var, op8Var, view);
    }

    @Override // defpackage.f29
    public e23 getBindingContext() {
        return this.A.d;
    }

    @Override // defpackage.f29
    public lb8 getDiv() {
        return (lb8) this.A.c;
    }

    @Override // defpackage.yp8
    public tp8 getDivBorderDrawer() {
        return this.A.a.a;
    }

    @Override // defpackage.yp8
    public boolean getNeedClipping() {
        return this.A.a.b;
    }

    @Override // defpackage.a0c
    @NotNull
    public List<ja8> getSubscriptions() {
        return this.A.e;
    }

    public Function1<String, Unit> getValueUpdater() {
        return this.B;
    }

    @Override // defpackage.p7t
    public final void h(View view) {
        this.A.h(view);
    }

    @Override // defpackage.a0c
    public final void i(ja8 ja8Var) {
        this.A.i(ja8Var);
    }

    @Override // defpackage.yp8
    public final void k() {
        this.A.k();
    }

    @Override // defpackage.a0c
    public final void l() {
        this.A.l();
    }

    @Override // defpackage.yp8
    public final void m() {
        this.A.m();
    }

    @Override // defpackage.x2b, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.A.b(i, i2);
    }

    @Override // defpackage.f29
    public void setBindingContext(e23 e23Var) {
        this.A.d = e23Var;
    }

    @Override // defpackage.yp8
    public void setNeedClipping(boolean z) {
        this.A.setNeedClipping(z);
    }

    public void setValueUpdater(Function1<? super String, Unit> function1) {
        this.B = function1;
    }

    @Override // defpackage.f29
    public void setDiv(lb8 lb8Var) {
        this.A.c = lb8Var;
    }
}
