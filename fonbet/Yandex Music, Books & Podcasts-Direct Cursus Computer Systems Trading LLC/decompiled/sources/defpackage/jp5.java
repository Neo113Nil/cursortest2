package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class jp5 extends View.DragShadowBuilder {
    public final kx7 a;
    public final long b;
    public final Function1 c;

    public jp5(kx7 kx7Var, long j, Function1 function1) {
        this.a = kx7Var;
        this.b = j;
        this.c = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        ou3 ou3Var = new ou3();
        xof xofVar = xof.a;
        Canvas canvas2 = vd0.a;
        ud0 ud0Var = new ud0();
        ud0Var.a = canvas;
        nu3 nu3Var = ou3Var.a;
        jx7 jx7Var = nu3Var.a;
        xof xofVar2 = nu3Var.b;
        mu3 mu3Var = nu3Var.c;
        long j = nu3Var.d;
        nu3Var.a = this.a;
        nu3Var.b = xofVar;
        nu3Var.c = ud0Var;
        nu3Var.d = this.b;
        ud0Var.r();
        this.c.invoke(ou3Var);
        ud0Var.k();
        nu3Var.a = jx7Var;
        nu3Var.b = xofVar2;
        nu3Var.c = mu3Var;
        nu3Var.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        kx7 kx7Var = this.a;
        point.set(kx7Var.L(intBitsToFloat / kx7Var.getDensity()), kx7Var.L(Float.intBitsToFloat((int) (j & 4294967295L)) / kx7Var.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
