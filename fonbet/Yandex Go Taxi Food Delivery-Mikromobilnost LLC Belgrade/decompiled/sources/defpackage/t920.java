package defpackage;

import android.graphics.PointF;
import android.util.Rational;

/* loaded from: classes10.dex */
public abstract class t920 {
    public Rational a = null;

    public abstract PointF a(float f, float f2);

    public final s920 b(float f, float f2, float f3) {
        PointF a = a(f, f2);
        float f4 = a.x;
        float f5 = a.y;
        Rational rational = this.a;
        s920 s920Var = new s920();
        s920Var.a = f4;
        s920Var.b = f5;
        s920Var.c = f3;
        s920Var.d = rational;
        return s920Var;
    }
}
