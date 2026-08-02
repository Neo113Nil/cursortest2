package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.WithAlignmentLineBlockElement;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class qho implements oho {
    public static final qho a = new qho();

    @Override // defpackage.oho
    public final yci a(float f, yci yciVar, boolean z) {
        if (f <= 0.0d) {
            qme.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return yciVar.f(new LayoutWeightElement(z, f));
    }

    public final yci b(yci yciVar, hz2 hz2Var) {
        return yciVar.f(new VerticalAlignElement(hz2Var));
    }

    public final yci c(yci yciVar, Function1 function1) {
        return yciVar.f(new WithAlignmentLineBlockElement(function1));
    }
}
