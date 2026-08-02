package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;

/* loaded from: classes.dex */
public final class wa5 implements ua5 {
    public static final wa5 a = new wa5();

    public final yci a(yci yciVar, gz2 gz2Var) {
        return yciVar.f(new HorizontalAlignElement(gz2Var));
    }

    public final yci b(float f, yci yciVar, boolean z) {
        if (f <= 0.0d) {
            qme.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return yciVar.f(new LayoutWeightElement(z, f));
    }
}
