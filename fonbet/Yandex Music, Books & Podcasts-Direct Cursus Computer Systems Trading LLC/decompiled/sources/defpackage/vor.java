package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class vor {
    public static final float a = 8;
    public static final float b = 12;

    public static final void a(oor oorVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oorVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-700202468);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(oorVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 >> 3;
            y7g.d(function0, yciVar, false, 0.0f, ild.C(886868601, new uor(oorVar, 0), oq5Var), oq5Var, (i3 & 14) | 24576 | (i3 & 112), 12);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(oorVar, function0, yciVar, i, 16);
        }
    }
}
