package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c2a extends q5w implements f29, mr8 {
    public final /* synthetic */ g29 A;
    public final /* synthetic */ nr8 B;

    public c2a(@NotNull Context context) {
        super(context);
        this.A = new g29();
        this.B = new nr8();
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

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != null && view.getVisibility() == 0) {
            bg3.z(view, canvas);
        }
        return super.drawChild(canvas, view, j);
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
    public cb8 getDiv() {
        return (cb8) this.A.c;
    }

    @Override // defpackage.yp8
    public tp8 getDivBorderDrawer() {
        return this.A.a.a;
    }

    @Override // defpackage.mr8
    public List<k79> getItems() {
        return this.B.a;
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

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.A.b(i, i2);
    }

    @Override // defpackage.f29
    public void setBindingContext(e23 e23Var) {
        this.A.d = e23Var;
    }

    @Override // defpackage.mr8
    public void setItems(List<k79> list) {
        this.B.a = list;
    }

    @Override // defpackage.yp8
    public void setNeedClipping(boolean z) {
        this.A.setNeedClipping(z);
    }

    @Override // defpackage.f29
    public void setDiv(cb8 cb8Var) {
        this.A.c = cb8Var;
    }
}
