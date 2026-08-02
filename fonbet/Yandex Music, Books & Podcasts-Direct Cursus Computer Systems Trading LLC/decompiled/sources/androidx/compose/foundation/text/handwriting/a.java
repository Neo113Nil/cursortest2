package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.input.pointer.StylusHoverIconModifierElement;
import defpackage.gma;
import defpackage.qmr;
import defpackage.vci;
import defpackage.yci;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class a {
    public static final gma a;

    static {
        float f = 40;
        float f2 = 10;
        a = new gma(f2, f, f2, f);
    }

    public static final yci a(boolean z, boolean z2, Function0 function0) {
        yci yciVar = vci.a;
        if (!z || !qmr.a) {
            return yciVar;
        }
        if (z2) {
            yciVar = new StylusHoverIconModifierElement(a);
        }
        return yciVar.f(new StylusHandwritingElement(function0));
    }
}
