package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class uua {
    public static final float a = 56;
    public static final float b = 32;
    public static final float c = 14;

    public static final void a(wua wuaVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        long j;
        long j2;
        oq5 oq5Var;
        wuaVar.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-298034665);
        int i2 = (oq5Var2.f(wuaVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            String str = wuaVar.c;
            d85 T = str != null ? pd.T(str) : null;
            if (T == null) {
                oq5Var2.Z(1351502782);
                j = ((dq0) oq5Var2.j(eq0.a)).d.a;
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(1351500643);
                oq5Var2.p(false);
                j = T.a;
            }
            long b2 = d85.b(j, 0.2f, 0.0f, 0.0f, 0.0f, 14);
            String str2 = wuaVar.d;
            d85 T2 = str2 != null ? pd.T(str2) : null;
            if (T2 == null) {
                oq5Var2.Z(1351506974);
                j2 = ((dq0) oq5Var2.j(eq0.a)).b.a;
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(1351504773);
                oq5Var2.p(false);
                j2 = T2.a;
            }
            long b3 = d85.b(j2, 0.9f, 0.0f, 0.0f, 0.0f, 14);
            yci g = d.g(xp3.u(d.d(yciVar, 1.0f), ugo.a), a, 0.0f, 2);
            boolean z = (i2 & 112) == 32;
            Object K = oq5Var2.K();
            if (z || K == gq5.a) {
                K = new or(19, function0);
                oq5Var2.k0(K);
            }
            yci b4 = a.b(a.e(g, false, null, null, (Function0) K, 7), b2, vnj.i);
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, b4);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            xcs.b(wuaVar.a, androidx.compose.foundation.layout.a.n(b.a.a(vci.a, b2c.f), b, c), b3, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, gdg.F(oq5Var2).d, oq5Var2, 0, 0, 65016);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(wuaVar, function0, yciVar, i, 2);
        }
    }
}
