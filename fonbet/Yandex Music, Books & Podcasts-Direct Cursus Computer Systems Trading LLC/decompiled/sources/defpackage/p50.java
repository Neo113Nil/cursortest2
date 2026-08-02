package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class p50 {
    public static final float a = 56;

    public static final void a(List list, a60 a60Var, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        fvf fvfVar;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(751121933);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(a60Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        if (oq5Var2.P(i2 & 1, (i2 & 147) != 146)) {
            fvf a2 = hvf.a(0, 0, oq5Var2, 0, 3);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = gld.R(g.a, oq5Var2);
                oq5Var2.k0(K);
            }
            mm6 mm6Var = (mm6) K;
            yci b = a.b(d.e(d.d(yciVar, 1.0f), a), svd.a(oq5Var2), vnj.i);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object K2 = oq5Var2.K();
            if (z || K2 == kjnVar) {
                K2 = new h50(list, 0);
                oq5Var2.k0(K2);
            }
            yci b2 = nfp.b(b, false, (Function1) K2);
            q0k a3 = androidx.compose.foundation.layout.a.a(16, 0.0f, 2);
            nx0 g = qx0.g(8);
            hz2 hz2Var = b2c.l;
            boolean h = oq5Var2.h(a60Var) | (i3 == 4) | oq5Var2.h(mm6Var) | oq5Var2.f(a2);
            Object K3 = oq5Var2.K();
            if (h || K3 == kjnVar) {
                fvfVar = a2;
                i50 i50Var = new i50(list, a60Var, mm6Var, fvfVar, 0);
                oq5Var2.k0(i50Var);
                K3 = i50Var;
            } else {
                fvfVar = a2;
            }
            oq5Var = oq5Var2;
            weo.i(b2, fvfVar, a3, false, g, hz2Var, null, false, null, (Function1) K3, oq5Var, 221568, 456);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(list, a60Var, yciVar, i, 3);
        }
    }

    public static final void b(a60 a60Var, hq5 hq5Var, int i) {
        boolean z;
        ek ekVar;
        boolean z2;
        a60 a60Var2 = a60Var;
        a60Var2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-919386787);
        int i2 = i | (oq5Var.h(a60Var2) ? 4 : 2);
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            k60 k60Var = (k60) szf.Q(a60Var2.i, oq5Var).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            ek C = yd5.C(a2, oq5Var);
            wxi L = zc4.L(C, false, oq5Var, 2);
            vci vciVar = vci.a;
            yci a3 = androidx.compose.ui.input.nestedscroll.a.a(vciVar, L, null);
            Unit unit = Unit.a;
            boolean h = oq5Var.h(a60Var2) | oq5Var.f(a2);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new l5(a60Var2, a2, null, 14);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, unit, (Function2) K);
            iz2 iz2Var = b2c.b;
            kfh d = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a3);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            WeakHashMap weakHashMap = rqv.w;
            vm C2 = ghh.C(ghh.C(ghh.C(p6g.n(z7l.h(oq5Var).f, oq5Var), zs4.g(oq5Var)), ogp.A(oq5Var)), androidx.compose.foundation.layout.a.c(0.0f, C.a ? kct.a : ((cma) C.b.d.getValue()).a, 0.0f, 0.0f, 13));
            if (Intrinsics.d(k60Var, i60.b)) {
                oq5Var.Z(1186083547);
                oq5Var.p(false);
                z = true;
                a60Var2 = a60Var;
                ekVar = C;
            } else if (k60Var instanceof j60) {
                oq5Var.Z(-1886042824);
                j60 j60Var = (j60) k60Var;
                List list = j60Var.a;
                boolean isEmpty = list.isEmpty();
                float f = !isEmpty ? a + 16 : 24;
                kfh d2 = ug3.d(iz2Var, false);
                int i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                ekVar = C;
                yci H2 = vnj.H(oq5Var, vciVar);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d2, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                int i5 = (i2 << 3) & 112;
                a60Var2 = a60Var;
                zsd.a(j60Var.b, a60Var2, a2, ghh.C(C2, androidx.compose.foundation.layout.a.c(0.0f, f, 0.0f, 16, 5)), oq5Var, i5);
                if (isEmpty) {
                    z2 = false;
                    oq5Var.Z(-396667822);
                } else {
                    oq5Var.Z(-392299364);
                    a(list, a60Var2, androidx.compose.foundation.layout.a.l(vciVar, C2), oq5Var, i5);
                    z2 = false;
                }
                oq5Var.p(z2);
                z = true;
                oq5Var.p(true);
                oq5Var.p(z2);
            } else {
                z = true;
                a60Var2 = a60Var;
                ekVar = C;
                if (!Intrinsics.d(k60Var, i60.a)) {
                    throw vz1.i(oq5Var, 1186082957, false);
                }
                oq5Var.Z(-1885174266);
                fgq.n(0, oq5Var, d.c(androidx.compose.foundation.layout.a.l(vciVar, C2), 1.0f), rvf.M(R.string.downloaded_tracks_empty, oq5Var));
                oq5Var.p(false);
            }
            String M = rvf.M(R.string.downloaded_tracks, oq5Var);
            n5g a4 = mp0.a(oq5Var);
            yci a5 = androidx.compose.ui.platform.a.a(a.b(vciVar, svd.a(oq5Var), vnj.i), "collection_downloaded_toolbar");
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new u10(2);
                oq5Var.k0(K2);
            }
            yd5.b(ekVar, M, a4, nfp.b(a5, false, (Function1) K2), ild.C(1668196138, new u2(8, a60Var2), oq5Var), ild.C(666944049, new g50(a60Var2), oq5Var), 0L, oq5Var, 221184, 64);
            oq5Var.p(z);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new g50(a60Var2, i);
        }
    }
}
