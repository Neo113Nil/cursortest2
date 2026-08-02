package defpackage;

import androidx.compose.foundation.layout.d;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class bg0 {
    public static final float a;
    public static final float b;

    static {
        float f = 25;
        a = f;
        b = (f * 2.0f) / 2.4142137f;
    }

    public static final void a(onj onjVar, yci yciVar, long j, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1776202187);
        int i3 = (oq5Var.f(onjVar) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16) | 128;
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                oq5Var.S();
                i2 = i3 & (-897);
            }
            oq5Var.q();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new m40(2, onjVar);
                oq5Var.k0(K);
            }
            qld.o(onjVar, b2c.c, ild.C(-1653527038, new ok2(j, nfp.b(yciVar, false, (Function1) K)), oq5Var), oq5Var, i4 | 432);
        } else {
            oq5Var.S();
        }
        long j2 = j;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wf0(onjVar, yciVar, j2, i);
        }
    }

    public static final void b(int i, int i2, hq5 hq5Var, yci yciVar) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                yciVar = vci.a;
            }
            u1g.l(oq5Var, vnj.q(d.o(yciVar, b, a), ag0.s));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xf0(yciVar, i, i2);
        }
    }
}
