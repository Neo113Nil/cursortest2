package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* loaded from: classes.dex */
public final class qnc implements oho {
    public static final qnc a = new qnc();

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
}
