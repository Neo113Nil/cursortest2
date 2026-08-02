package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p89 extends k6g implements f29, mr8 {
    public final /* synthetic */ g29 G;
    public final /* synthetic */ nr8 H;

    public p89(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.G = new g29();
        this.H = new nr8();
    }

    @Override // defpackage.f29, defpackage.a0c, defpackage.ptn
    public final void a() {
        this.G.a();
    }

    @Override // defpackage.p7t
    public final void d(View view) {
        this.G.d(view);
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
        return this.G.b.e();
    }

    @Override // defpackage.yp8
    public final void g(e23 e23Var, op8 op8Var, View view) {
        this.G.g(e23Var, op8Var, view);
    }

    @Override // defpackage.f29
    public e23 getBindingContext() {
        return this.G.d;
    }

    @Override // defpackage.f29
    public cb8 getDiv() {
        return (cb8) this.G.c;
    }

    @Override // defpackage.yp8
    public tp8 getDivBorderDrawer() {
        return this.G.a.a;
    }

    @Override // defpackage.mr8
    public List<k79> getItems() {
        return this.H.a;
    }

    @Override // defpackage.yp8
    public boolean getNeedClipping() {
        return this.G.a.b;
    }

    @Override // defpackage.a0c
    @NotNull
    public List<ja8> getSubscriptions() {
        return this.G.e;
    }

    @Override // defpackage.p7t
    public final void h(View view) {
        this.G.h(view);
    }

    @Override // defpackage.a0c
    public final void i(ja8 ja8Var) {
        this.G.i(ja8Var);
    }

    @Override // defpackage.yp8
    public final void k() {
        this.G.k();
    }

    @Override // defpackage.a0c
    public final void l() {
        this.G.l();
    }

    @Override // defpackage.yp8
    public final void m() {
        this.G.m();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.G.b(i, i2);
    }

    @Override // defpackage.f29
    public void setBindingContext(e23 e23Var) {
        this.G.d = e23Var;
    }

    @Override // defpackage.mr8
    public void setItems(List<k79> list) {
        this.H.a = list;
    }

    @Override // defpackage.yp8
    public void setNeedClipping(boolean z) {
        this.G.setNeedClipping(z);
    }

    @Override // defpackage.f29
    public void setDiv(cb8 cb8Var) {
        this.G.c = cb8Var;
    }

    public p89(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ p89(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public p89(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
