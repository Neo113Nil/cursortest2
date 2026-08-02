package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class xua {
    public static final float a = 32;

    public static final void a(iwa iwaVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1693443115);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(iwaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            d85 T = pd.T(iwaVar.j);
            long j = T != null ? T.a : d85.f;
            ozm ozmVar = ywa.a;
            lwa lwaVar = ((xwa) oq5Var.j(ozmVar)).c;
            String M = rvf.M(R.string.close_content_description, oq5Var);
            iz2 iz2Var = b2c.f;
            yci b = a.b(xp3.u(d.m(yciVar, a), ugo.a), d85.b(j, 0.08f, 0.0f, 0.0f, 0.0f, 14), vnj.i);
            boolean z = (i2 & 112) == 32;
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (z || K == obj) {
                K = new or(20, function0);
                oq5Var.k0(K);
            }
            yci e = a.e(b, false, null, null, (Function0) K, 7);
            boolean f = oq5Var.f(M);
            Object K2 = oq5Var.K();
            if (f || K2 == obj) {
                K2 = new wq(M, 25);
                oq5Var.k0(K2);
            }
            yci a2 = nfp.a(e, (Function1) K2);
            kfh d = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            Function0 function02 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(function02);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            rva rvaVar = ((xwa) oq5Var.j(ozmVar)).b;
            gae.b(a0g.E(R.drawable.ic_close_small_24, 0, oq5Var), null, null, d85.b(j, 0.9f, 0.0f, 0.0f, 0.0f, 14), oq5Var, 48, 4);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(iwaVar, function0, yciVar, i, 3);
        }
    }
}
