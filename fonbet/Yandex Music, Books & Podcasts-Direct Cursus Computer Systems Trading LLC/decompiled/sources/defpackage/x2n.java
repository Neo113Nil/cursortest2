package defpackage;

import android.content.Context;
import androidx.compose.foundation.a;
import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.music.core.ui.compose.b;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class x2n {
    public static final float a = 56;

    public static final void a(m mVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1640290922);
        int i2 = i | (oq5Var.f(mVar) ? 4 : 2);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            iz2 iz2Var = b2c.e;
            float f = 12;
            yci u = xp3.u(d.d(d.g(yciVar, 124, 0.0f, 2), 1.0f), ugo.a(f));
            agr agrVar = eq0.a;
            long j = ((dq0) oq5Var.j(agrVar)).c.c;
            jzk jzkVar = vnj.i;
            yci b = a.b(u, j, jzkVar);
            float f2 = 16;
            yci q = androidx.compose.foundation.layout.a.q(c3x.y(1, ((dq0) oq5Var.j(agrVar)).c.c, b, ugo.a(f)), 14, 0.0f, f2, 0.0f, 10);
            boolean z = (i2 & 14) == 4;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = new mjm(4, mVar);
                oq5Var.k0(K);
            }
            yci b2 = nfp.b(q, false, (Function1) K);
            kfh d = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
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
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            vci vciVar = vci.a;
            yci H2 = vnj.H(oq5Var, vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            iz2 iz2Var2 = b2c.f;
            yci b3 = a.b(xp3.u(d.m(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, f, 0.0f, 11), 48), ugo.a), ((dq0) oq5Var.j(agrVar)).d.f, jzkVar);
            kfh d2 = ug3.d(iz2Var2, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, b3);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            gae.b(a0g.E(R.drawable.ic_plus_12, 0, oq5Var), null, d.m(vciVar, f2), ((dq0) oq5Var.j(agrVar)).a.a, oq5Var, 432, 0);
            oq5Var.p(true);
            String str = mVar.a;
            ges i6 = nu0.i();
            long j2 = ((dq0) oq5Var.j(agrVar)).b.a;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new gkm(9);
                oq5Var.k0(K2);
            }
            xcs.b(str, androidx.compose.ui.platform.a.a(nfp.b(vciVar, false, (Function1) K2), "purchase_block_empty"), j2, 0L, null, 0L, null, new o9s(1), 0L, 0, false, 0, 0, null, i6, oq5Var, 0, 0, 65016);
            oq5Var = oq5Var;
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wcj(mVar, yciVar, i, 26);
        }
    }

    public static final void b(int i, hq5 hq5Var, yci yciVar, String str, String str2) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1849740373);
        int i2 = i | (oq5Var2.f(str) ? 4 : 2) | (oq5Var2.f(str2) ? 32 : 16) | (oq5Var2.f(yciVar) ? 256 : 128);
        if (oq5Var2.P(i2 & 1, (i2 & 147) != 146)) {
            oq5Var2.Z(-515957390);
            kn0 kn0Var = new kn0();
            agr agrVar = eq0.a;
            int g = kn0Var.g(new c4r(((dq0) oq5Var2.j(agrVar)).b.a, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65534));
            try {
                kn0Var.d(str);
                if (str2 == null) {
                    oq5Var2.Z(-1717095143);
                } else {
                    oq5Var2.Z(-1717095142);
                    g = kn0Var.g(new c4r(((dq0) oq5Var2.j(agrVar)).b.d, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65534));
                    try {
                        kn0Var.d(StringUtil.SPACE.concat(str2));
                    } finally {
                    }
                }
                oq5Var2.p(false);
                mn0 h = kn0Var.h();
                oq5Var2.p(false);
                oq5Var = oq5Var2;
                xcs.c(h, yciVar, 0L, 0L, null, 0L, new o9s(3), 0L, 0, false, 0, 0, null, null, nu0.j(), oq5Var, (i2 >> 3) & 112, 0, 130556);
            } finally {
            }
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cw5(str, str2, yciVar, i, 2);
        }
    }

    public static final void c(p7s p7sVar, l3n l3nVar, hq5 hq5Var, int i) {
        l3n l3nVar2;
        oq5 oq5Var;
        oq5 oq5Var2;
        boolean z;
        int i2;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(1030464220);
        int i3 = (oq5Var3.f(p7sVar) ? 4 : 2) | i | (oq5Var3.f(l3nVar) ? 32 : 16);
        if (oq5Var3.P(i3 & 1, (i3 & 19) != 18)) {
            jx7 jx7Var = (jx7) oq5Var3.j(es5.h);
            Object K = oq5Var3.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(new cma(a));
                oq5Var3.k0(K);
            }
            aqi aqiVar = (aqi) K;
            Object K2 = oq5Var3.K();
            if (K2 == kjnVar) {
                K2 = k5r.h(2, oq5Var3);
            }
            u6k u6kVar = (u6k) K2;
            fkn fknVar = p7sVar.h;
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object K3 = oq5Var3.K();
            if (z2 || K3 == kjnVar) {
                K3 = new s1n(p7sVar, (Continuation) null, 3);
                oq5Var3.k0(K3);
            }
            j3n j3nVar = j3n.a;
            k3n k3nVar = (k3n) szf.l0(j3nVar, fknVar, (Function2) K3, oq5Var3).getValue();
            boolean z3 = k3nVar instanceof f3n;
            vci vciVar = vci.a;
            if (z3) {
                oq5Var3.Z(-1865297195);
                ArrayList arrayList = ((f3n) k3nVar).d;
                u6kVar.i(arrayList.size() > 1 ? arrayList.size() : 1);
                boolean f = oq5Var3.f(jx7Var);
                Object K4 = oq5Var3.K();
                if (f || K4 == kjnVar) {
                    K4 = new xum(jx7Var, aqiVar, 2);
                    oq5Var3.k0(K4);
                }
                yci q = androidx.compose.foundation.layout.a.q(androidx.compose.ui.layout.a.d(vciVar, (Function1) K4), 0.0f, 8, 0.0f, 0.0f, 13);
                z = i4 == 4;
                Object K5 = oq5Var3.K();
                if (z || K5 == kjnVar) {
                    K5 = new mjm(5, p7sVar);
                    oq5Var3.k0(K5);
                }
                f(arrayList, (Function1) K5, q, l3nVar, oq5Var3, (i3 << 6) & 7168);
                l3nVar2 = l3nVar;
                oq5Var2 = oq5Var3;
                oq5Var2.p(false);
            } else {
                l3nVar2 = l3nVar;
                oq5Var2 = oq5Var3;
                if (Intrinsics.d(k3nVar, j3nVar)) {
                    oq5Var2.Z(-1861259443);
                    szf.k(u6kVar.h(), 48, 0, oq5Var2, androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 8, 0.0f, 0.0f, 13));
                    oq5Var2.p(false);
                } else if (k3nVar instanceof e3n) {
                    oq5Var2.Z(-1861253281);
                    a(((e3n) k3nVar).b, androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 8, 0.0f, 0.0f, 13), oq5Var2, 48);
                    oq5Var2.p(false);
                } else {
                    if (!(k3nVar instanceof g3n)) {
                        throw vz1.i(oq5Var2, -1861288463, false);
                    }
                    oq5Var2.Z(-1861247177);
                    g3n g3nVar = (g3n) k3nVar;
                    z = i4 == 4;
                    Object K6 = oq5Var2.K();
                    if (z || K6 == kjnVar) {
                        i2 = 8;
                        oq5Var = oq5Var2;
                        bml bmlVar = new bml(1, p7sVar, d3n.class, "startPayment", "startPayment(Lcom/yandex/music/payment/paywalls/common/api/purchase_block/data/PurchaseBlockButtonState;)V", 0, 17);
                        oq5Var.k0(bmlVar);
                        K6 = bmlVar;
                    } else {
                        oq5Var = oq5Var2;
                        i2 = 8;
                    }
                    h(g3nVar, (Function1) ((h9f) K6), androidx.compose.foundation.layout.a.q(vciVar, 0.0f, i2, 0.0f, 0.0f, 13), oq5Var, 384);
                    oq5Var.p(false);
                }
            }
            oq5Var = oq5Var2;
        } else {
            l3nVar2 = l3nVar;
            oq5Var = oq5Var3;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v2n(p7sVar, l3nVar2, i, 1);
        }
    }

    public static final void d(p7s p7sVar, l3n l3nVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-15490184);
        int i2 = (oq5Var.f(p7sVar) ? 4 : 2) | i | (oq5Var.f(l3nVar) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            k3n k3nVar = (k3n) gld.M(p7sVar.h, oq5Var).getValue();
            if (k3nVar instanceof h3n) {
                oq5Var.Z(-1906325350);
                h3n h3nVar = (h3n) k3nVar;
                q2n b = h3nVar.b();
                boolean f = oq5Var.f(k3nVar) | ((i2 & 14) == 4);
                Object K = oq5Var.K();
                if (f || K == gq5.a) {
                    K = new iik(22, h3nVar, p7sVar);
                    oq5Var.k0(K);
                }
                e(b, l3nVar, (Function0) K, null, oq5Var, i2 & 112);
                oq5Var.p(false);
            } else if (Intrinsics.d(k3nVar, j3n.a)) {
                oq5Var.Z(-1905929914);
                szf.k(1, 6, 2, oq5Var, null);
                oq5Var.p(false);
            } else {
                if (!(k3nVar instanceof e3n)) {
                    throw vz1.i(oq5Var, -2001160384, false);
                }
                oq5Var.Z(-2001140612);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v2n(p7sVar, l3nVar, i, 0);
        }
    }

    public static final void e(q2n q2nVar, l3n l3nVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        vci vciVar;
        boolean z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-984177906);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(q2nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(l3nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function0) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            vci vciVar2 = vci.a;
            if (q2nVar != null) {
                r2n r2nVar = q2nVar.f;
                oq5Var.Z(2097974351);
                yci c = b.c(androidx.compose.ui.platform.a.a(vciVar2, "paywall_bottom_button"), "button_type", r2nVar);
                boolean z2 = (i3 & 14) == 4;
                Object K = oq5Var.K();
                if (z2 || K == gq5.a) {
                    K = new w2n(q2nVar, 0);
                    oq5Var.k0(K);
                }
                yci b = com.yandex.music.core.ui.compose.a.b(c, null, 0L, 0.0f, null, (Function2) K, 15);
                vciVar = vciVar2;
                int i4 = (i3 << 3) & 7168;
                z = false;
                p2n.a(q2nVar.a, q2nVar.b, q2nVar.c, function0, r2nVar, b, pd.T(l3nVar != null ? l3nVar.a : null), pd.T(l3nVar != null ? l3nVar.b : null), oq5Var, i4, 0);
            } else {
                vciVar = vciVar2;
                z = false;
                oq5Var.Z(2082492052);
            }
            oq5Var.p(z);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(i, 3, q2nVar, l3nVar, function0, yciVar2);
        }
    }

    public static final void f(ArrayList arrayList, Function1 function1, yci yciVar, l3n l3nVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1546583159);
        int i2 = (i & 6) == 0 ? (oq5Var.f(arrayList) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(l3nVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            gz2 gz2Var = b2c.o;
            nx0 g = qx0.g(12);
            yci a2 = androidx.compose.ui.platform.a.a(d.d(yciVar, 1.0f), "purchase_buttons");
            ta5 a3 = sa5.a(g, gz2Var, oq5Var, 54);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            Function0 function0 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(function0);
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
            oq5Var.Z(-458397160);
            int i4 = 0;
            for (Object obj : arrayList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    u75.n();
                    throw null;
                }
                q2n q2nVar = (q2n) obj;
                d85 T = i4 == 0 ? pd.T(l3nVar != null ? l3nVar.a : null) : pd.T(l3nVar != null ? l3nVar.c : null);
                d85 T2 = i4 == 0 ? pd.T(l3nVar != null ? l3nVar.b : null) : pd.T(l3nVar != null ? l3nVar.d : null);
                String str = q2nVar.a;
                r2n r2nVar = q2nVar.f;
                String str2 = q2nVar.b;
                String str3 = q2nVar.c;
                int i6 = i2;
                yci c = b.c(b.b(androidx.compose.ui.platform.a.a(vci.a, "paywall_block_button"), i4), "button_type", r2nVar);
                boolean f = oq5Var.f(q2nVar);
                Object K = oq5Var.K();
                Object obj2 = gq5.a;
                if (f || K == obj2) {
                    K = new w2n(q2nVar, 1);
                    oq5Var.k0(K);
                }
                yci b = com.yandex.music.core.ui.compose.a.b(c, null, 0L, 0.0f, null, (Function2) K, 15);
                boolean f2 = ((i6 & 112) == 32) | oq5Var.f(q2nVar);
                Object K2 = oq5Var.K();
                if (f2 || K2 == obj2) {
                    K2 = new iik(23, function1, q2nVar);
                    oq5Var.k0(K2);
                }
                p2n.a(str, str2, str3, (Function0) K2, r2nVar, b, T, T2, oq5Var, 0, 0);
                i4 = i5;
                i2 = i6;
            }
            oq5Var.p(false);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(arrayList, function1, false, yciVar, l3nVar, i, 4);
        }
    }

    public static final void g(y3n y3nVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        uoi uoiVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(446493946);
        int i2 = i | (oq5Var.f(y3nVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((yie) oq5Var.j(e.a)) instanceof cje;
            kjn kjnVar = gq5.a;
            if (z) {
                oq5Var.Z(-12327756);
                oq5Var.p(false);
                uoiVar = null;
            } else {
                oq5Var.Z(-12300879);
                Object K = oq5Var.K();
                if (K == kjnVar) {
                    K = vz1.h(oq5Var);
                }
                oq5Var.p(false);
                uoiVar = (uoi) K;
            }
            iz2 iz2Var = b2c.f;
            yci D = ksw.D(a.d(d.g(androidx.compose.foundation.layout.a.m(yciVar, 2), 36, 0.0f, 2), uoiVar, null, false, null, null, function0, 28), y3nVar.c, null);
            kfh d = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, D);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
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
            String str = y3nVar.a;
            String str2 = y3nVar.b;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new gkm(10);
                oq5Var.k0(K2);
            }
            b(0, oq5Var, androidx.compose.foundation.layout.b.a.a(androidx.compose.foundation.layout.a.o(nfp.a(vci.a, (Function1) K2), 12, 0.0f, 2), iz2Var), str, str2);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t2n(y3nVar, function0, yciVar, i, 1);
        }
    }

    public static final void h(final g3n g3nVar, final Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        boolean z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1164108113);
        int i2 = i | (oq5Var.f(g3nVar) ? 4 : 2) | (oq5Var.h(function1) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            Object[] objArr = new Object[0];
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new p1n(1);
                oq5Var.k0(K);
            }
            u6k u6kVar = (u6k) o2g.g0(objArr, null, (Function0) K, oq5Var, 0, 6);
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            yci a2 = androidx.compose.ui.platform.a.a(d.d(yciVar, 1.0f), "purchase_slider");
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
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
            int h = u6kVar.h();
            hz2 hz2Var = b2c.l;
            vci vciVar = vci.a;
            yd5.j(h, ksw.D(a.b(xp3.u(d.g(d.d(vciVar, 1.0f), 40, 0.0f, 2), ugo.a), ((dq0) oq5Var.j(eq0.a)).c.c, vnj.i), rvf.M(R.string.purchase_block_slider_description, oq5Var), null), hz2Var, 0L, 0L, ild.C(-1314036913, new tik(8, u6kVar), oq5Var), saf.d, ild.C(-1123314353, new q6h(29, g3nVar, u6kVar, context), oq5Var), oq5Var, 14352768);
            oq5Var = oq5Var;
            u1g.l(oq5Var, d.e(vciVar, 20));
            if (u6kVar.h() == 0) {
                oq5Var.Z(716192794);
                q2n q2nVar = g3nVar.e;
                r2n r2nVar = q2nVar.f;
                String str = q2nVar.a;
                String str2 = q2nVar.b;
                String str3 = q2nVar.c;
                boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object K2 = oq5Var.K();
                if (z2 || K2 == kjnVar) {
                    final int i4 = 0;
                    K2 = new Function0() { // from class: s2n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    function1.invoke(g3nVar.e);
                                    break;
                                default:
                                    function1.invoke(g3nVar.g);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K2);
                }
                p2n.a(str, str2, str3, (Function0) K2, r2nVar, b.c(androidx.compose.ui.platform.a.a(vciVar, "purchase_slider_left_button"), "button_type", r2nVar), null, null, oq5Var, 0, 192);
                oq5Var.p(false);
                z = true;
            } else {
                oq5Var.Z(716773331);
                q2n q2nVar2 = g3nVar.g;
                r2n r2nVar2 = q2nVar2.f;
                String str4 = q2nVar2.a;
                String str5 = q2nVar2.b;
                String str6 = q2nVar2.c;
                boolean z3 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object K3 = oq5Var.K();
                if (z3 || K3 == kjnVar) {
                    z = true;
                    final char c = 1 == true ? 1 : 0;
                    K3 = new Function0() { // from class: s2n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (c) {
                                case 0:
                                    function1.invoke(g3nVar.e);
                                    break;
                                default:
                                    function1.invoke(g3nVar.g);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K3);
                } else {
                    z = true;
                }
                p2n.a(str4, str5, str6, (Function0) K3, r2nVar2, b.c(androidx.compose.ui.platform.a.a(vciVar, "purchase_slider_right_button"), "button_type", r2nVar2), null, null, oq5Var, 0, 192);
                oq5Var.p(false);
            }
            oq5Var.p(z);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t2n(g3nVar, function1, yciVar, i, 0);
        }
    }
}
