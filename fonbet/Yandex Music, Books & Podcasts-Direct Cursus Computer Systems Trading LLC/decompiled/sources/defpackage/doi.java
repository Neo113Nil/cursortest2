package defpackage;

import androidx.compose.animation.c;
import androidx.compose.ui.platform.a;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class doi {
    public static final float a = 12;

    public static final void a(Function0 function0, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        int i4;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1149744210);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (oq5Var.f(yciVar) ? 32 : 16);
        }
        if (oq5Var.P(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                yciVar = vci.a;
            }
            o0k A = ogp.A(oq5Var);
            WeakHashMap weakHashMap = rqv.w;
            float a2 = p6g.n(z7l.h(oq5Var).e, oq5Var).a();
            oq5Var.Z(-1097582232);
            float c0 = ((jx7) oq5Var.j(es5.h)).c0(z7l.h(oq5Var).c.e().d);
            oq5Var.p(false);
            float f = (c0 - 56) - a2;
            float a3 = zs4.g(oq5Var).d + A.a();
            float f2 = 16;
            cma cmaVar = new cma(f);
            cma cmaVar2 = new cma(a3);
            if (cmaVar.compareTo(cmaVar2) < 0) {
                cmaVar = cmaVar2;
            }
            pd.b(new qzm[0], true, ild.C(2021488343, new eh6(f2 + cmaVar.a, 3, function0, yciVar), oq5Var), oq5Var, 432, 0);
        } else {
            oq5Var.S();
        }
        yci yciVar2 = yciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qtb(function0, yciVar2, i, i2, 1);
        }
    }

    public static final void b(Function0 function0, yci yciVar, eoi eoiVar, hq5 hq5Var, int i) {
        yci yciVar2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(240341232);
        int i2 = i | 48;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            String M = rvf.M(R.string.shortcut_short_label_music_recognition_redesign, oq5Var);
            tgo tgoVar = ugo.a;
            vci vciVar = vci.a;
            yci u = xp3.u(vciVar, tgoVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new p1i(29);
                oq5Var.k0(K);
            }
            yci a2 = a.a(androidx.compose.ui.draw.a.b(u, (Function1) K), "music_recognition_button");
            boolean f = oq5Var.f(M);
            Object K2 = oq5Var.K();
            if (f || K2 == kjnVar) {
                K2 = new q1h(M, 6);
                oq5Var.k0(K2);
            }
            yci e = androidx.compose.foundation.a.e(nfp.b(a2, true, (Function1) K2), false, M, new meo(0), function0, 1);
            nho a3 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, e);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            gae.b(a0g.E(R.drawable.ic_voice_search_multicolor_24, 0, oq5Var), null, androidx.compose.foundation.layout.a.m(vciVar, 16), d85.f, oq5Var, 3504, 0);
            cqi cqiVar = eoiVar.a;
            e9b b = c.b(b2c.n, 13);
            vpb g = c.g(weo.S(200, 0, nya.c, 2), 12);
            yci k = androidx.compose.foundation.layout.a.k(vciVar, -8, 0.0f, 2);
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = new coi(0);
                oq5Var.k0(K3);
            }
            etn.g(cqiVar, androidx.compose.ui.draw.a.c(k, (Function1) K3), b, g, null, ild.C(1755561260, new mf3(M, 4), oq5Var), oq5Var, 1575942);
            oq5Var = oq5Var;
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(function0, yciVar2, eoiVar, i, 5);
        }
    }
}
