package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.f;

/* loaded from: classes10.dex */
public final class yny0 {
    public static final tig0 g = zeb1.c(new pjv0(24), new uiy0(11));
    public final tx40 a;
    public final tx40 b;
    public final yx40 c;
    public zii0 d;
    public long e;
    public final oz40 f;

    public yny0(Orientation orientation, float f) {
        this.a = f.f(f);
        this.b = f.f(0.0f);
        this.c = f.g(0);
        this.d = zii0.e;
        this.e = asy0.b;
        this.f = f.i(orientation, ngd0.F);
    }

    public final void a(Orientation orientation, zii0 zii0Var, int i, int i2) {
        float f = i2 - i;
        this.b.setFloatValue(f);
        float f2 = zii0Var.a;
        float f3 = zii0Var.b;
        zii0 zii0Var2 = this.d;
        float f4 = zii0Var2.a;
        tx40 tx40Var = this.a;
        if (f2 != f4 || f3 != zii0Var2.b) {
            boolean z = orientation == Orientation.Vertical;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? zii0Var.d : zii0Var.c;
            float floatValue = tx40Var.getFloatValue();
            float f6 = i;
            float f7 = floatValue + f6;
            tx40Var.setFloatValue(tx40Var.getFloatValue() + ((f5 <= f7 && (f2 >= floatValue || f5 - f2 <= f6)) ? (f2 >= floatValue || f5 - f2 > f6) ? 0.0f : f2 - floatValue : f5 - f7));
            this.d = zii0Var;
        }
        tx40Var.setFloatValue(y6i0.c(tx40Var.getFloatValue(), 0.0f, f));
        this.c.setIntValue(i);
    }

    public /* synthetic */ yny0(Orientation orientation) {
        this(orientation, 0.0f);
    }

    public yny0() {
        this(Orientation.Vertical);
    }
}
