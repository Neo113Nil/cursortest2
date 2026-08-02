package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class lws {
    public static final float a = 32;
    public static final float b = 29;
    public static final float c = 20;
    public static final float d = 4;
    public static final float e = 2;
    public static final rxk f = new rxk();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void a(List list, sdr sdrVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        vci vciVar;
        Object obj;
        ?? r8;
        oq5 oq5Var;
        oq5 oq5Var2;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(2057980558);
        if ((i & 6) == 0) {
            i2 = (oq5Var3.f(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var3.f(sdrVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var3.h(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var3.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var3.z()) {
            oq5Var3.S();
            oq5Var2 = oq5Var3;
        } else {
            Context context = (Context) oq5Var3.j(AndroidCompositionLocals_androidKt.b);
            cce cceVar = (cce) oq5Var3.j(tkg.a);
            Object K = oq5Var3.K();
            Object obj2 = gq5.a;
            if (K == obj2) {
                K = tlm.f(gld.R(g.a, oq5Var3), oq5Var3);
            }
            mm6 mm6Var = ((fs5) K).a;
            boolean f2 = ((i2 & 14) == 4) | oq5Var3.f(context) | oq5Var3.f(cceVar) | oq5Var3.f(mm6Var);
            Object K2 = oq5Var3.K();
            if (f2 || K2 == obj2) {
                K2 = new c51(list, context, cceVar, mm6Var);
                oq5Var3.k0(K2);
            }
            a51 a51Var = (a51) ((c51) K2).f.getValue();
            if (a51Var instanceof z41) {
                oq5Var3.Z(-1358637213);
                z41 z41Var = (z41) a51Var;
                int i3 = z41Var.b;
                boolean z = z41Var.a.size() > 1;
                float f3 = l86.a;
                if (z) {
                    f3 += a;
                }
                yci r = d.r(yciVar, d + f3);
                kfh d2 = ug3.d(b2c.b, false);
                int i4 = oq5Var3.P;
                a l = oq5Var3.l();
                yci H = vnj.H(oq5Var3, r);
                xp5.T.getClass();
                Function0 function02 = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(function02);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(oq5Var3, d2, wp5.f);
                g0g.U(oq5Var3, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var3, i4, kb5Var);
                }
                g0g.U(oq5Var3, H, wp5.d);
                float f4 = f3;
                xee.b(z41Var.a, l86.a, a, null, 0.0f, null, vq1.g, oq5Var3, 1573296, 56);
                vci vciVar2 = vci.a;
                if (i3 > 0) {
                    oq5Var3.Z(-155521024);
                    String str = "+" + i3;
                    ges b2 = ges.b(nu0.j(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 0, 0, 16744447);
                    boolean z2 = (i2 & 112) == 32;
                    Object K3 = oq5Var3.K();
                    if (z2 || K3 == obj2) {
                        K3 = new pw7(4, sdrVar);
                        oq5Var3.k0(K3);
                    }
                    a95 a95Var = (a95) K3;
                    vciVar = vciVar2;
                    obj = obj2;
                    j66.h(str, androidx.compose.foundation.a.b(xp3.u(d.q(b.a.a(androidx.compose.foundation.layout.a.k(vciVar2, 0.0f, e, 1), b2c.j), b, c, 0.0f, 0.0f, 12), ugo.a), kg5.r(R.color.bg_primary_day, oq5Var3), vnj.i), b2, null, 0, false, 0, 0, a95Var, oq5Var3, 0, 248);
                    oq5Var = oq5Var3;
                    r8 = 0;
                } else {
                    vciVar = vciVar2;
                    obj = obj2;
                    r8 = 0;
                    oq5Var3.Z(-160318026);
                    oq5Var = oq5Var3;
                }
                oq5Var.p(r8);
                oq5Var.p(true);
                yci u = xp3.u(d.b(d.r(vciVar, f4), 1.0f), z ? f : ugo.a);
                boolean z3 = (i2 & 896) != 256 ? r8 : true;
                Object K4 = oq5Var.K();
                if (z3 || K4 == obj) {
                    K4 = new g1j(28, function0);
                    oq5Var.k0(K4);
                }
                ug3.a(androidx.compose.foundation.a.e(u, false, null, null, (Function0) K4, 7), oq5Var, r8);
                oq5Var.p(r8);
                oq5Var2 = oq5Var;
            } else {
                oq5Var3.Z(a51Var instanceof y41 ? 2034437490 : -1362725772);
                oq5Var3.p(false);
                oq5Var2 = oq5Var3;
            }
        }
        xmn r2 = oq5Var2.r();
        if (r2 != null) {
            r2.d = new zkl(i, 12, list, sdrVar, function0, yciVar);
        }
    }

    public static final void b(jws jwsVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1281852069);
        int i2 = i | (oq5Var.f(jwsVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            float f2 = l86.a;
            yci e2 = d.e(yciVar, f2);
            kfh d2 = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, e2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean z = jwsVar instanceof gws;
            vci vciVar = vci.a;
            if (z) {
                oq5Var.Z(891433929);
                gws gwsVar = (gws) jwsVar;
                a(gwsVar.a, gwsVar.b, function0, androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, l86.b, 0.0f, 11), oq5Var, ((i2 << 3) & 896) | 3072);
                oq5Var.p(false);
            } else if (jwsVar instanceof hws) {
                oq5Var.Z(891811323);
                h4a.g(((hws) jwsVar).a, xp3.u(d.m(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, l86.b, 0.0f, 11), f2), o5g.E(oq5Var)), null, null, oq5Var, 0, 12);
                oq5Var.p(false);
            } else {
                if (!jwsVar.equals(iws.a)) {
                    throw vz1.i(oq5Var, -109793183, false);
                }
                oq5Var.Z(-109768145);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kws(jwsVar, function0, yciVar, i, 0);
        }
    }
}
