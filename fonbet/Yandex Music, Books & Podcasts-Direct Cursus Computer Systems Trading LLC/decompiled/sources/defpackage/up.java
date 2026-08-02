package defpackage;

import android.content.res.Configuration;
import android.webkit.WebView;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final /* synthetic */ class up implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ up(sw swVar, jwm jwmVar, iwm iwmVar, pu0 pu0Var) {
        this.a = 3;
        this.b = swVar;
        this.c = jwmVar;
        this.d = iwmVar;
        this.e = pu0Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        String str = (String) this.b;
        su5 su5Var = (su5) this.c;
        Integer num = (Integer) this.d;
        aqi aqiVar = (aqi) this.e;
        c cVar = (c) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        cVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        boolean z = str != null;
        oq5 oq5Var2 = (oq5) hq5Var;
        boolean f = oq5Var2.f(str);
        Object K = oq5Var2.K();
        if (f || K == gq5.a) {
            K = new wq(str, 10);
            oq5Var2.k0(K);
        }
        pn0 s = vut.s(cVar, (Function1) K);
        yci a = a.a(vci.a, "concert_item_event_type");
        mn0 mn0Var = new mn0(6, j66.d0(su5Var, oq5Var2), (ArrayList) null);
        pn0 pn0Var = z ? s : null;
        xv7.i(mn0Var, a, ((dq0) oq5Var2.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, (((Boolean) aqiVar.getValue()).booleanValue() || num != null) ? 1 : 2, 0, null, null, nu0.j(), pn0Var, null, oq5Var2, 48, 134217776, 645112);
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        boolean z;
        tz5 tz5Var = (tz5) this.b;
        wv5 wv5Var = (wv5) this.c;
        ges gesVar = (ges) this.d;
        ges gesVar2 = (ges) this.e;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((oho) obj).getClass();
        if ((intValue & 17) == 16) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        if (!tz5Var.j) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(-1065373507);
            xv.i(wv5Var, oq5Var2, 8);
            oq5Var2.p(false);
            return Unit.a;
        }
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.Z(-1083005749);
        oq5Var3.p(false);
        lx0 lx0Var = qx0.e;
        gz2 gz2Var = b2c.o;
        float p = w1g.p(gesVar2, 0, oq5Var3, 0, 2) + w1g.p(gesVar, 0, oq5Var3, 0, 2) + 10;
        vci vciVar = vci.a;
        yci e = d.e(vciVar, p);
        ta5 a = sa5.a(lx0Var, gz2Var, oq5Var3, 54);
        int i = oq5Var3.P;
        androidx.compose.runtime.internal.a l = oq5Var3.l();
        yci H = vnj.H(oq5Var3, e);
        xp5.T.getClass();
        grb grbVar = wp5.b;
        oq5Var3.d0();
        if (oq5Var3.O) {
            oq5Var3.k(grbVar);
        } else {
            oq5Var3.n0();
        }
        g0g.U(oq5Var3, a, wp5.f);
        g0g.U(oq5Var3, l, wp5.e);
        kb5 kb5Var = wp5.g;
        if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i))) {
            ouj.x(i, oq5Var3, i, kb5Var);
        }
        g0g.U(oq5Var3, H, wp5.d);
        oq5Var3.Z(1315908603);
        StringBuilder sb = new StringBuilder();
        sb.append(rvf.M(R.string.concert_tab_ticket_price_button_text, oq5Var3));
        String str = wv5Var.h;
        if (str != null) {
            sb.append(StringUtil.SPACE.concat(str));
        }
        String sb2 = sb.toString();
        oq5Var3.p(false);
        agr agrVar = eq0.a;
        xcs.b(sb2, null, ((dq0) oq5Var3.j(agrVar)).b.e, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, gesVar, oq5Var3, 0, 3120, 55290);
        oq5 oq5Var4 = oq5Var3;
        Integer num = wv5Var.f.l;
        if (num != null) {
            oq5Var4.Z(2139103599);
            u1g.l(oq5Var4, d.e(vciVar, mu0.a));
            xcs.b(rvf.N(R.string.concert_tab_price_button_cashback_text, new Object[]{num}, oq5Var4), null, d85.b(((dq0) oq5Var4.j(agrVar)).b.e, 0.5f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, gesVar2, oq5Var4, 0, 3120, 55290);
            oq5Var4 = oq5Var4;
            z = false;
        } else {
            z = false;
            oq5Var4.Z(2120130421);
        }
        oq5Var4.p(z);
        oq5Var4.p(true);
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        wv5 wv5Var = (wv5) this.b;
        yci yciVar = (yci) this.c;
        tz5 tz5Var = (tz5) this.d;
        Function0 function0 = (Function0) this.e;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((uvd) obj).getClass();
        if ((intValue & 17) == 16) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        xv.r(tz5Var.j, wv5Var, wv5Var.d, function0, d.d(yciVar, 1.0f), hq5Var, 64);
        return Unit.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        boolean z;
        c26 c26Var = (c26) this.b;
        ges gesVar = (ges) this.c;
        ges gesVar2 = (ges) this.d;
        pud pudVar = (pud) this.e;
        String str = pudVar.e;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((oho) obj).getClass();
        if ((intValue & 17) == 16) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        if (!c26Var.b()) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(-291250010);
            oq5Var2.Z(1791720891);
            StringBuilder sb = new StringBuilder();
            sb.append(rvf.M(R.string.concert_tab_price_button_text, oq5Var2));
            if (str != null) {
                sb.append(StringUtil.SPACE.concat(str));
            }
            String sb2 = sb.toString();
            oq5Var2.p(false);
            xcs.b(sb2, null, ((dq0) oq5Var2.j(eq0.a)).b.e, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var2, 0, 3120, 55290);
            oq5Var2.p(false);
            return Unit.a;
        }
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.Z(-316549978);
        oq5Var3.p(false);
        lx0 lx0Var = qx0.e;
        gz2 gz2Var = b2c.o;
        float p = w1g.p(gesVar2, 0, oq5Var3, 0, 2) + w1g.p(gesVar, 0, oq5Var3, 0, 2) + 10;
        vci vciVar = vci.a;
        yci d = d.d(d.e(vciVar, p), 1.0f);
        ta5 a = sa5.a(lx0Var, gz2Var, oq5Var3, 54);
        int i = oq5Var3.P;
        androidx.compose.runtime.internal.a l = oq5Var3.l();
        yci H = vnj.H(oq5Var3, d);
        xp5.T.getClass();
        grb grbVar = wp5.b;
        oq5Var3.d0();
        if (oq5Var3.O) {
            oq5Var3.k(grbVar);
        } else {
            oq5Var3.n0();
        }
        g0g.U(oq5Var3, a, wp5.f);
        g0g.U(oq5Var3, l, wp5.e);
        kb5 kb5Var = wp5.g;
        if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i))) {
            ouj.x(i, oq5Var3, i, kb5Var);
        }
        g0g.U(oq5Var3, H, wp5.d);
        oq5Var3.Z(827514028);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(rvf.M(R.string.concert_tab_ticket_price_button_text, oq5Var3));
        if (str != null) {
            sb3.append(StringUtil.SPACE.concat(str));
        }
        String sb4 = sb3.toString();
        oq5Var3.p(false);
        agr agrVar = eq0.a;
        xcs.b(sb4, null, ((dq0) oq5Var3.j(agrVar)).b.e, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, gesVar, oq5Var3, 0, 3120, 55290);
        oq5 oq5Var4 = oq5Var3;
        Integer num = pudVar.d.l;
        if (num != null) {
            oq5Var4.Z(-116274450);
            u1g.l(oq5Var4, d.e(vciVar, mu0.a));
            xcs.b(rvf.N(R.string.concert_tab_price_button_cashback_text, new Object[]{num}, oq5Var4), null, d85.b(((dq0) oq5Var4.j(agrVar)).b.e, 0.5f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, gesVar2, oq5Var4, 0, 3120, 55290);
            oq5Var4 = oq5Var4;
            z = false;
        } else {
            z = false;
            oq5Var4.Z(-143271792);
        }
        oq5Var4.p(z);
        oq5Var4.p(true);
        return Unit.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        nla nlaVar = (nla) this.b;
        hla hlaVar = (hla) this.c;
        qnq qnqVar = (qnq) this.d;
        fvf fvfVar = (fvf) this.e;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            tla tlaVar = (tla) gld.O(nlaVar.d, oq5Var).getValue();
            if (tlaVar instanceof sla) {
                oq5Var.Z(-750411461);
                pm0.a(null, ild.C(-1221870286, new pr((sla) tlaVar, hlaVar, qnqVar, fvfVar, o0kVar, nlaVar, 11), oq5Var), oq5Var, 48, 1);
                oq5Var.p(false);
            } else if (Intrinsics.d(tlaVar, rla.a)) {
                oq5Var.Z(-749612653);
                c3x.m(0, 2, 0L, oq5Var, d.x(d.c(androidx.compose.foundation.layout.a.l(vci.a, o0kVar), 1.0f), b2c.f, 2));
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(tlaVar, qla.a)) {
                    throw vz1.i(oq5Var, 391431798, false);
                }
                oq5Var.Z(-749308481);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        iab iabVar = (iab) this.b;
        ges gesVar = (ges) this.c;
        yci yciVar = (yci) this.d;
        Function0 function0 = (Function0) this.e;
        uvd uvdVar = (uvd) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        uvdVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? ((oq5) hq5Var).f(uvdVar) : ((oq5) hq5Var).h(uvdVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            bkp.R(uvdVar, iabVar.a, function0, a.a(yciVar, "title"), ges.a(gesVar, zsd.l0(oq5Var)), oq5Var, intValue & 14, 0);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        a9i a9iVar = (a9i) this.b;
        tsf tsfVar = (tsf) this.c;
        w8i w8iVar = (w8i) this.d;
        tmb tmbVar = (tmb) this.e;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (!oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            oq5Var.S();
        } else if (Intrinsics.d(a9iVar, y8i.a)) {
            oq5Var.Z(171584110);
            rvf.h(o0kVar, tsfVar, oq5Var, intValue & 14);
            oq5Var.p(false);
        } else if (a9iVar instanceof z8i) {
            oq5Var.Z(171587136);
            rvf.i(((z8i) a9iVar).a, w8iVar, o0kVar, tsfVar, oq5Var, (intValue << 6) & 896);
            oq5Var.p(false);
        } else {
            if (!Intrinsics.d(a9iVar, x8i.a)) {
                throw vz1.i(oq5Var, 171582558, false);
            }
            oq5Var.Z(171590546);
            rvf.g(w8iVar, tmbVar, o0kVar, oq5Var, ((intValue << 6) & 896) | 64);
            oq5Var.p(false);
        }
        return Unit.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        Object suiVar;
        dvi dviVar;
        jvi jviVar = (jvi) this.b;
        dvi dviVar2 = (dvi) this.c;
        tmb tmbVar = (tmb) this.d;
        fvf fvfVar = (fvf) this.e;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        int i = 2;
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        int i2 = intValue;
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            boolean d = Intrinsics.d(jviVar, fvi.a);
            vci vciVar = vci.a;
            kjn kjnVar = gq5.a;
            if (d) {
                oq5Var.Z(235293562);
                yci x = d.x(bfg.Q(d.c(androidx.compose.foundation.layout.a.l(vciVar, o0kVar), 1.0f), bfg.C(oq5Var), false, 14), b2c.f, 2);
                boolean h = oq5Var.h(dviVar2);
                Object K = oq5Var.K();
                if (h || K == kjnVar) {
                    K = new s8i(i, dviVar2);
                    oq5Var.k0(K);
                }
                rvf.j((Function1) K, tmbVar, x, 0, true, null, oq5Var, 24640, 40);
                oq5Var.p(false);
            } else if (Intrinsics.d(jviVar, gvi.a)) {
                oq5Var.Z(235797653);
                dag.c(o0kVar, null, oq5Var, i2 & 14);
                oq5Var.p(false);
            } else if (Intrinsics.d(jviVar, evi.a)) {
                oq5Var.Z(235926086);
                hag.c(0, oq5Var, androidx.compose.foundation.layout.a.l(vciVar, o0kVar), rvf.M(R.string.my_shelf_placeholder_title, oq5Var));
                oq5Var.p(false);
            } else if (jviVar instanceof ivi) {
                oq5Var.Z(236202017);
                lvi lviVar = ((ivi) jviVar).a;
                boolean booleanValue = ((Boolean) szf.Q(dviVar2.d, oq5Var).getValue()).booleanValue();
                boolean h2 = oq5Var.h(dviVar2);
                Object K2 = oq5Var.K();
                if (h2 || K2 == kjnVar) {
                    dviVar = dviVar2;
                    suiVar = new sui(0, dviVar, dvi.class, "onRefresh", "onRefresh()V", 0, 1);
                    oq5Var.k0(suiVar);
                } else {
                    suiVar = K2;
                    dviVar = dviVar2;
                }
                gdg.j(lviVar, fvfVar, o0kVar, booleanValue, (Function0) ((h9f) suiVar), dviVar, oq5Var, (i2 << 6) & 896);
                oq5Var.p(false);
            } else {
                if (!(jviVar instanceof hvi)) {
                    throw vz1.i(oq5Var, 1254514972, false);
                }
                oq5Var.Z(236698699);
                ocg.b(((hvi) jviVar).a, dviVar2, fvfVar, o0kVar, rvf.M(R.string.my_shelf_placeholder_title, oq5Var), oq5Var, (i2 << 9) & 7168);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        fvf fvfVar = (fvf) this.b;
        o0k o0kVar = (o0k) this.c;
        lvf lvfVar = (lvf) this.d;
        wn5 wn5Var = (wn5) this.e;
        o0k o0kVar2 = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar2.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar2) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            vm C = ghh.C(ghh.C(o0kVar, o0kVar2), androidx.compose.foundation.layout.a.a(0.0f, 8, 1));
            boolean h = oq5Var.h(lvfVar) | oq5Var.f(wn5Var);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new avi(8, lvfVar, wn5Var);
                oq5Var.k0(K);
            }
            weo.f(null, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, 0, 505);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        q0k q0kVar;
        o0k o0kVar = (o0k) this.b;
        tsf tsfVar = (tsf) this.c;
        Object obj4 = (lvf) this.d;
        Object obj5 = (wn5) this.e;
        o0k o0kVar2 = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar2.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar2) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            if (c3x.L(oq5Var)) {
                q0kVar = androidx.compose.foundation.layout.a.a(0.0f, 16, 1);
            } else {
                float f = 16;
                q0kVar = new q0k(f, f, f, f);
            }
            iic iicVar = new iic(160);
            vm C = ghh.C(ghh.C(o0kVar, o0kVar2), q0kVar);
            nx0 g = qx0.g(16);
            nx0 g2 = qx0.g(20);
            yci a = a.a(d.c(vci.a, 1.0f), "lazy_vert_grid");
            boolean h = oq5Var.h(obj4) | oq5Var.f(obj5) | oq5Var.f(q0kVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new p3e(12, obj4, obj5, q0kVar);
                oq5Var.k0(K);
            }
            wdp.U(iicVar, a, tsfVar, C, g2, g, null, false, null, (Function1) K, oq5Var, 1769520, 0, 912);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        fvf fvfVar = (fvf) this.b;
        yxl yxlVar = (yxl) this.c;
        qzl qzlVar = (qzl) this.d;
        sdr sdrVar = (sdr) this.e;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((androidx.compose.foundation.lazy.a) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            ndc ndcVar = ((vxl) yxlVar).b;
            boolean h = oq5Var.h(qzlVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                bml bmlVar = new bml(1, qzlVar, qzl.class, "onFilterClick", "onFilterClick(Ljava/lang/String;)V", 0, 3);
                oq5Var.k0(bmlVar);
                K = bmlVar;
            }
            Function1 function1 = (Function1) ((h9f) K);
            yci q = androidx.compose.foundation.layout.a.q(a.a(vci.a, "playlist_filters_row"), 0.0f, 0.0f, 0.0f, 24, 7);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new xtb(sdrVar, 20);
                oq5Var.k0(K2);
            }
            zyl.b(fvfVar, ndcVar, function1, androidx.compose.ui.layout.a.b(q, new f0g(3, (Function0) K2)), false, false, oq5Var, 0, 48);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        dvl dvlVar = (dvl) this.b;
        qzl qzlVar = (qzl) this.c;
        fvf fvfVar = (fvf) this.d;
        sdr sdrVar = (sdr) this.e;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((dh3) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            yci q = androidx.compose.foundation.layout.a.q(androidx.compose.foundation.a.b(vci.a, svd.a(oq5Var), vnj.i), 0.0f, 24, 0.0f, 12, 5);
            ndc ndcVar = dvlVar.b;
            boolean z = !((Boolean) sdrVar.getValue()).booleanValue();
            boolean booleanValue = ((Boolean) sdrVar.getValue()).booleanValue();
            boolean h = oq5Var.h(qzlVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                bml bmlVar = new bml(1, qzlVar, qzl.class, "onFilterClick", "onFilterClick(Ljava/lang/String;)V", 0, 4);
                oq5Var.k0(bmlVar);
                K = bmlVar;
            }
            zyl.b(fvfVar, ndcVar, (Function1) ((h9f) K), q, z, booleanValue, oq5Var, 0, 0);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        aqi aqiVar = (aqi) this.b;
        a3m a3mVar = (a3m) this.c;
        fvf fvfVar = (fvf) this.d;
        lf5 lf5Var = (lf5) this.e;
        o0k o0kVar = (o0k) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        o0kVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        vm C = ghh.C(ghh.C(o0kVar, zs4.g(hq5Var)), ogp.A(hq5Var));
        tt0.g(Boolean.valueOf(((k3m) aqiVar.getValue()) instanceof i3m), d.c(vci.a, 1.0f), null, "playlistEditorLoadingCrossfade", ild.C(-1555841190, new lc(a3mVar, C, fvfVar, lf5Var, aqiVar, 12), hq5Var), hq5Var, 27696, 4);
        return Unit.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        mxs mxsVar = (mxs) this.b;
        rbm rbmVar = (rbm) this.c;
        jab jabVar = (jab) this.d;
        u0s u0sVar = (u0s) this.e;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((androidx.compose.foundation.lazy.a) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            yys yysVar = mxsVar.e;
            String str = yysVar.a;
            String str2 = yysVar.b;
            boolean h = oq5Var.h(rbmVar) | oq5Var.h(mxsVar) | oq5Var.h(jabVar) | oq5Var.h(u0sVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                h0l h0lVar = new h0l(rbmVar, mxsVar, jabVar, u0sVar, 2);
                oq5Var.k0(h0lVar);
                K = h0lVar;
            }
            qgg.q(str, str2, (Function0) K, null, oq5Var, 0);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        abm abmVar = (abm) this.b;
        final rbm rbmVar = (rbm) this.c;
        final u0s u0sVar = (u0s) this.d;
        final nab nabVar = (nab) this.e;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((androidx.compose.foundation.lazy.a) obj).getClass();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
            tx txVar = abmVar.a;
            boolean h = oq5Var.h(rbmVar) | oq5Var.h(u0sVar) | oq5Var.h(nabVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                final int i = 0;
                K = new Function2() { // from class: kbm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        int i2 = i;
                        int intValue2 = ((Integer) obj4).intValue();
                        oq oqVar = (oq) obj5;
                        switch (i2) {
                            case 0:
                                oqVar.getClass();
                                thj x = c3x.x(oqVar, intValue2);
                                rbm rbmVar2 = rbmVar;
                                rbmVar2.getClass();
                                rbmVar2.a.l(u0sVar, nabVar, oqVar, x);
                                break;
                            default:
                                oqVar.getClass();
                                thj x2 = c3x.x(oqVar, intValue2);
                                rbm rbmVar3 = rbmVar;
                                rbmVar3.getClass();
                                rbmVar3.a.m(u0sVar, nabVar, oqVar, x2);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K);
            }
            Function2 function2 = (Function2) K;
            boolean h2 = oq5Var.h(rbmVar) | oq5Var.h(u0sVar) | oq5Var.h(nabVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                final int i2 = 1;
                K2 = new Function2() { // from class: kbm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        int i22 = i2;
                        int intValue2 = ((Integer) obj4).intValue();
                        oq oqVar = (oq) obj5;
                        switch (i22) {
                            case 0:
                                oqVar.getClass();
                                thj x = c3x.x(oqVar, intValue2);
                                rbm rbmVar2 = rbmVar;
                                rbmVar2.getClass();
                                rbmVar2.a.l(u0sVar, nabVar, oqVar, x);
                                break;
                            default:
                                oqVar.getClass();
                                thj x2 = c3x.x(oqVar, intValue2);
                                rbm rbmVar3 = rbmVar;
                                rbmVar3.getClass();
                                rbmVar3.a.m(u0sVar, nabVar, oqVar, x2);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K2);
            }
            Function2 function22 = (Function2) K2;
            boolean h3 = oq5Var.h(rbmVar) | oq5Var.h(nabVar) | oq5Var.h(u0sVar);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                K3 = new fb1(11, rbmVar, nabVar, u0sVar);
                oq5Var.k0(K3);
            }
            s7g.b(txVar, function2, function22, (ryc) K3, oq5Var, 8);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0439  */
    @Override // defpackage.pyc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        yci c;
        oq5 oq5Var;
        int i;
        int i2;
        pn0 pn0Var;
        final int i3 = 0;
        switch (this.a) {
            case 0:
                vci vciVar = vci.a;
                jx7 jx7Var = (jx7) this.b;
                dzg dzgVar = (dzg) this.c;
                jyg jygVar = (jyg) this.d;
                poi poiVar = (poi) this.e;
                c cVar = (c) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                kjn kjnVar = gq5.a;
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                int i4 = ga6.i(cVar.b);
                Integer valueOf = Integer.valueOf(i4);
                if (i4 == Integer.MAX_VALUE) {
                    valueOf = null;
                }
                Float valueOf2 = valueOf != null ? Float.valueOf(valueOf.intValue()) : null;
                if (valueOf2 != null) {
                    oq5 oq5Var3 = (oq5) hq5Var;
                    oq5Var3.Z(916738015);
                    float c2 = yhn.c(valueOf2.floatValue() * 0.7f, 340.0f, 480.0f);
                    float floatValue = valueOf2.floatValue() / c2;
                    yci i5 = d.i(vciVar, jx7Var.d0(c2));
                    boolean c3 = oq5Var3.c(floatValue);
                    Object K = oq5Var3.K();
                    if (c3 || K == kjnVar) {
                        K = new vp(i3, floatValue);
                        oq5Var3.k0(K);
                    }
                    c = androidx.compose.ui.graphics.a.a(i5, (Function1) K);
                    oq5Var3.p(false);
                } else {
                    oq5 oq5Var4 = (oq5) hq5Var;
                    oq5Var4.Z(917416419);
                    oq5Var4.p(false);
                    c = d.c(vciVar, 1.0f);
                }
                kfh d = ug3.d(b2c.b, false);
                oq5 oq5Var5 = (oq5) hq5Var;
                int i6 = oq5Var5.P;
                androidx.compose.runtime.internal.a l = oq5Var5.l();
                yci H = vnj.H(hq5Var, c);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var5.d0();
                if (oq5Var5.O) {
                    oq5Var5.k(grbVar);
                } else {
                    oq5Var5.n0();
                }
                g0g.U(hq5Var, d, wp5.f);
                g0g.U(hq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var5, i6, kb5Var);
                }
                g0g.U(hq5Var, H, wp5.d);
                if (jygVar.getValue() != null) {
                    oq5Var5.Z(-140403039);
                    ayg value = jygVar.getValue();
                    yci c4 = d.c(vciVar, 1.0f);
                    e88 e88Var = hd6.d;
                    wwn wwnVar = wwn.b;
                    Object K2 = oq5Var5.K();
                    if (K2 == kjnVar) {
                        K2 = new wp(poiVar, 0);
                        oq5Var5.k0(K2);
                    }
                    u1g.d(value, (Function0) K2, c4, true, wwnVar, dzgVar, null, e88Var, false, hq5Var, 1087898032, 48, 128312);
                } else {
                    oq5Var5.Z(-152786113);
                }
                oq5Var5.p(false);
                oq5Var5.p(true);
                return Unit.a;
            case 1:
                uy uyVar = (uy) this.b;
                c cVar2 = (c) this.c;
                j00 j00Var = (j00) this.d;
                jab jabVar = (jab) this.e;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var6 = (oq5) hq5Var2;
                if (oq5Var6.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    List list = ((ny) uyVar).a.a;
                    irf.h(rvf.M(R.string.album_donate_carousel_title, oq5Var6), a.a(vci.a, "show_more"), null, null, null, false, null, false, null, oq5Var6, 48, 508);
                    ghh.e(cVar2, list, null, ild.C(1154347614, new av(i3, j00Var, jabVar), oq5Var6), oq5Var6, 3072, 2);
                } else {
                    oq5Var6.S();
                }
                return Unit.a;
            case 2:
                uy uyVar2 = (uy) this.b;
                gvd gvdVar = (gvd) this.c;
                j00 j00Var2 = (j00) this.d;
                jab jabVar2 = (jab) this.e;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var7 = (oq5) hq5Var3;
                if (oq5Var7.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                    ty tyVar = (ty) uyVar2;
                    StationId stationId = tyVar.a;
                    stationId.getClass();
                    thj k = bfg.k(stationId, 0);
                    lnu a = tyVar.b.a(gvdVar.b());
                    StationId stationId2 = tyVar.a;
                    stationId2.getClass();
                    Object K3 = oq5Var7.K();
                    Object obj4 = gq5.a;
                    if (K3 == obj4) {
                        K3 = gld.R(g.a, oq5Var7);
                        oq5Var7.k0(K3);
                    }
                    mm6 mm6Var = (mm6) K3;
                    boolean f = oq5Var7.f(stationId2);
                    Object K4 = oq5Var7.K();
                    if (f || K4 == obj4) {
                        mm6Var.getClass();
                        kxi kxiVar = j00Var2.b;
                        rr rrVar = new rr(j00Var2, jabVar2, k, 12);
                        l18 l18Var = l18.b;
                        bdt I = hag.I(k6l.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        k6l k6lVar = (k6l) qdcVar.C(I);
                        bdt I2 = hag.I(uwu.class);
                        qdc qdcVar2 = l18Var.a;
                        qdcVar2.getClass();
                        uwu uwuVar = (uwu) qdcVar2.C(I2);
                        bdt I3 = hag.I(qwu.class);
                        qdc qdcVar3 = l18Var.a;
                        qdcVar3.getClass();
                        K4 = wyf.T(stationId2, mm6Var, kxiVar, rrVar, k6lVar, uwuVar, (qwu) qdcVar3.C(I3), null, 896);
                        oq5Var7.k0(K4);
                    }
                    owu owuVar = (owu) K4;
                    vci vciVar2 = vci.a;
                    boolean h = oq5Var7.h(j00Var2) | oq5Var7.h(jabVar2) | oq5Var7.h(k);
                    Object K5 = oq5Var7.K();
                    if (h || K5 == obj4) {
                        K5 = new bv(j00Var2, jabVar2, k, 1);
                        oq5Var7.k0(K5);
                    }
                    ldg.f(owuVar, a, null, com.yandex.music.core.ui.compose.a.b(vciVar2, null, 0L, 0.0f, null, (Function2) K5, 15), oq5Var7, 384);
                } else {
                    oq5Var7.S();
                }
                return Unit.a;
            case 3:
                sw swVar = (sw) this.b;
                jwm jwmVar = (jwm) this.c;
                vci vciVar3 = vci.a;
                iwm iwmVar = (iwm) this.d;
                pu0 pu0Var = (pu0) this.e;
                c cVar3 = (c) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                cVar3.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((oq5) hq5Var4).f(cVar3) ? 4 : 2;
                }
                if ((intValue4 & 19) == 18) {
                    oq5 oq5Var8 = (oq5) hq5Var4;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        return Unit.a;
                    }
                }
                float e = cVar3.e();
                float f2 = 0;
                float s = o5g.s(e, f2, f2, vt0.e, 1, 1, 0.0f, f2, hq5Var4, 64);
                if (Intrinsics.d(swVar, rw.a) || (swVar instanceof pw)) {
                    oq5 oq5Var9 = (oq5) hq5Var4;
                    oq5Var9.Z(-1882893069);
                    int ordinal = jwmVar.ordinal();
                    if (ordinal == 0) {
                        oq5Var9.Z(-1882843283);
                        etn.p(s, swVar instanceof rw, oq5Var9, 0);
                        oq5Var9.p(false);
                    } else {
                        if (ordinal != 1) {
                            throw vz1.i(oq5Var9, 1186187503, false);
                        }
                        oq5Var9.Z(-1882489170);
                        fxf.m(s, swVar instanceof rw, oq5Var9, 0);
                        oq5Var9.p(false);
                    }
                    oq5Var9.p(false);
                } else {
                    if (!(swVar instanceof qw)) {
                        throw vz1.i((oq5) hq5Var4, 1186184342, false);
                    }
                    oq5 oq5Var10 = (oq5) hq5Var4;
                    oq5Var10.Z(-1882056038);
                    int ordinal2 = jwmVar.ordinal();
                    if (ordinal2 == 0) {
                        oq5Var = oq5Var10;
                        oq5Var.Z(-1882008639);
                        etn.o(iwmVar, (qw) swVar, s, vciVar3, oq5Var, 0);
                        oq5Var.p(false);
                    } else {
                        if (ordinal2 != 1) {
                            throw vz1.i(oq5Var10, 1186214504, false);
                        }
                        oq5Var10.Z(-1881640607);
                        fxf.l(iwmVar, (qw) swVar, pu0Var, s, oq5Var10, 0);
                        oq5Var = oq5Var10;
                        oq5Var.p(false);
                    }
                    oq5Var.p(false);
                }
                return Unit.a;
            case 4:
                ybf ybfVar = (ybf) this.b;
                m91 m91Var = (m91) this.c;
                fvf fvfVar = (fvf) this.d;
                oa1 oa1Var = (oa1) this.e;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                oq5 oq5Var11 = (oq5) hq5Var5;
                if (oq5Var11.P(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Object K6 = oq5Var11.K();
                    kjn kjnVar2 = gq5.a;
                    if (K6 == kjnVar2) {
                        K6 = new qa1(ybfVar, oa1Var);
                        oq5Var11.k0(K6);
                    }
                    qa1 qa1Var = (qa1) K6;
                    dn9 dn9Var = ((nb1) ybfVar.getValue()).k;
                    WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
                    dn9Var.getClass();
                    webPath$Storage.getClass();
                    osh oshVar = new osh();
                    oshVar.a = dn9Var;
                    oshVar.b = m91Var;
                    oshVar.c = webPath$Storage;
                    e0d e0dVar = new e0d(new b0d(1), false, false);
                    Object K7 = oq5Var11.K();
                    if (K7 == kjnVar2) {
                        K7 = new zb0(29);
                        oq5Var11.k0(K7);
                    }
                    jyr b = btf.b((Function0) K7);
                    l18 l18Var2 = l18.b;
                    bdt I4 = hag.I(he1.class);
                    qdc qdcVar4 = l18Var2.a;
                    qdcVar4.getClass();
                    r0d a2 = h1d.a(oshVar, e0dVar, (arf) ((he1) qdcVar4.C(I4)).d.getValue(), qa1Var, new v4b(), b, oq5Var11, 3144);
                    Object K8 = oq5Var11.K();
                    if (K8 == kjnVar2) {
                        K8 = new hb1(ybfVar, oa1Var, a2);
                        oq5Var11.k0(K8);
                    }
                    c3x.b((hb1) K8, null, fvfVar, oq5Var11, 0, 2);
                } else {
                    oq5Var11.S();
                }
                return Unit.a;
            case 5:
                ybf ybfVar2 = (ybf) this.b;
                m91 m91Var2 = (m91) this.c;
                h1d h1dVar = (h1d) this.d;
                oa1 oa1Var2 = (oa1) this.e;
                bci bciVar = (bci) obj;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                bciVar.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= (intValue6 & 8) == 0 ? ((oq5) hq5Var6).f(bciVar) : ((oq5) hq5Var6).h(bciVar) ? 4 : 2;
                }
                oq5 oq5Var12 = (oq5) hq5Var6;
                if (oq5Var12.P(intValue6 & 1, (intValue6 & 19) != 18)) {
                    jf0.a(new qzm[0], pd.t(ypg.a), false, ild.C(-1493232832, new bj(bciVar, ybfVar2, m91Var2, h1dVar, oa1Var2, 3), oq5Var12), oq5Var12, 0, 4);
                } else {
                    oq5Var12.S();
                }
                return Unit.a;
            case 6:
                wn5 wn5Var = (wn5) this.b;
                con conVar = (con) this.c;
                plv plvVar = (plv) this.d;
                xnv xnvVar = (xnv) this.e;
                hq5 hq5Var7 = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((va5) obj).getClass();
                wn5Var.invoke(hq5Var7, 0);
                ff7.j(conVar.s, 0, hq5Var7, null, plvVar);
                skd skdVar = skd.a;
                float f3 = conVar.c;
                ukd A = o5g.A(ngg.z(skdVar, f3));
                oq5 oq5Var13 = (oq5) hq5Var7;
                Object K9 = oq5Var13.K();
                if (K9 == gq5.a) {
                    K9 = new mz2(i3);
                    oq5Var13.k0(K9);
                }
                vwb.j(xnvVar, conVar, conVar.v, fma.c(conVar.b) - (f3 * 2), zdg.E(A, (Function1) K9), plvVar, oq5Var13, 0);
                return Unit.a;
            case 7:
                o93 o93Var = (o93) this.b;
                final va3 va3Var = (va3) this.c;
                final u0s u0sVar = (u0s) this.d;
                final nab nabVar = (nab) this.e;
                hq5 hq5Var8 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                kjn kjnVar3 = gq5.a;
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var14 = (oq5) hq5Var8;
                if (oq5Var14.P(intValue7 & 1, (intValue7 & 17) != 16)) {
                    tx txVar = o93Var.a;
                    boolean h2 = oq5Var14.h(va3Var) | oq5Var14.h(u0sVar) | oq5Var14.h(nabVar);
                    Object K10 = oq5Var14.K();
                    if (h2 || K10 == kjnVar3) {
                        K10 = new Function2() { // from class: z93
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                int i7 = i3;
                                int intValue8 = ((Integer) obj5).intValue();
                                oq oqVar = (oq) obj6;
                                oqVar.getClass();
                                switch (i7) {
                                    case 0:
                                        thj x = c3x.x(oqVar, intValue8);
                                        va3 va3Var2 = va3Var;
                                        va3Var2.getClass();
                                        va3Var2.a.l(u0sVar, nabVar, oqVar, x);
                                        break;
                                    default:
                                        thj x2 = c3x.x(oqVar, intValue8);
                                        va3 va3Var3 = va3Var;
                                        va3Var3.getClass();
                                        va3Var3.a.m(u0sVar, nabVar, oqVar, x2);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var14.k0(K10);
                    }
                    Function2 function2 = (Function2) K10;
                    boolean h3 = oq5Var14.h(va3Var) | oq5Var14.h(u0sVar) | oq5Var14.h(nabVar);
                    Object K11 = oq5Var14.K();
                    if (h3 || K11 == kjnVar3) {
                        final int i7 = 1;
                        K11 = new Function2() { // from class: z93
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                int i72 = i7;
                                int intValue8 = ((Integer) obj5).intValue();
                                oq oqVar = (oq) obj6;
                                oqVar.getClass();
                                switch (i72) {
                                    case 0:
                                        thj x = c3x.x(oqVar, intValue8);
                                        va3 va3Var2 = va3Var;
                                        va3Var2.getClass();
                                        va3Var2.a.l(u0sVar, nabVar, oqVar, x);
                                        break;
                                    default:
                                        thj x2 = c3x.x(oqVar, intValue8);
                                        va3 va3Var3 = va3Var;
                                        va3Var3.getClass();
                                        va3Var3.a.m(u0sVar, nabVar, oqVar, x2);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var14.k0(K11);
                    }
                    Function2 function22 = (Function2) K11;
                    boolean h4 = oq5Var14.h(va3Var) | oq5Var14.h(nabVar) | oq5Var14.h(u0sVar);
                    Object K12 = oq5Var14.K();
                    if (h4 || K12 == kjnVar3) {
                        K12 = new fb1(4, va3Var, nabVar, u0sVar);
                        oq5Var14.k0(K12);
                    }
                    s7g.b(txVar, function2, function22, (ryc) K12, oq5Var14, 8);
                } else {
                    oq5Var14.S();
                }
                return Unit.a;
            case 8:
                vci vciVar4 = vci.a;
                tvd tvdVar = (tvd) this.b;
                c93 c93Var = (c93) this.c;
                va3 va3Var2 = (va3) this.d;
                List list2 = (List) this.e;
                hq5 hq5Var9 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var15 = (oq5) hq5Var9;
                if (oq5Var15.P(intValue8 & 1, (intValue8 & 17) != 16)) {
                    ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var15, 0);
                    int i8 = oq5Var15.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var15.l();
                    yci H2 = vnj.H(oq5Var15, vciVar4);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var15.d0();
                    if (oq5Var15.O) {
                        oq5Var15.k(grbVar2);
                    } else {
                        oq5Var15.n0();
                    }
                    g0g.U(oq5Var15, a3, wp5.f);
                    g0g.U(oq5Var15, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var15.O || !Intrinsics.d(oq5Var15.K(), Integer.valueOf(i8))) {
                        ouj.x(i8, oq5Var15, i8, kb5Var2);
                    }
                    g0g.U(oq5Var15, H2, wp5.d);
                    fgq.g(tvdVar, c93Var, va3Var2, oq5Var15, 0);
                    List list3 = list2;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            if (((q93) it.next()) instanceof k93) {
                                oq5Var15.Z(1235691294);
                                oq5Var15.p(false);
                                oq5Var15.p(true);
                            }
                        }
                    }
                    oq5Var15.Z(1243637772);
                    eta.p(vciVar4, 16, oq5Var15, false);
                    oq5Var15.p(true);
                } else {
                    oq5Var15.S();
                }
                return Unit.a;
            case 9:
                vci vciVar5 = vci.a;
                yci yciVar = (yci) this.b;
                o8w o8wVar = (o8w) this.c;
                iab iabVar = (iab) this.d;
                Function0 function0 = (Function0) this.e;
                uvd uvdVar = (uvd) obj;
                hq5 hq5Var10 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                uvdVar.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= (intValue9 & 8) == 0 ? ((oq5) hq5Var10).f(uvdVar) : ((oq5) hq5Var10).h(uvdVar) ? 4 : 2;
                }
                oq5 oq5Var16 = (oq5) hq5Var10;
                if (oq5Var16.P(intValue9 & 1, (intValue9 & 19) != 18)) {
                    ta5 a4 = sa5.a(qx0.c, b2c.o, oq5Var16, 48);
                    int i9 = oq5Var16.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var16.l();
                    yci H3 = vnj.H(oq5Var16, yciVar);
                    xp5.T.getClass();
                    grb grbVar3 = wp5.b;
                    oq5Var16.d0();
                    if (oq5Var16.O) {
                        oq5Var16.k(grbVar3);
                    } else {
                        oq5Var16.n0();
                    }
                    g0g.U(oq5Var16, a4, wp5.f);
                    g0g.U(oq5Var16, l3, wp5.e);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var16.O || !Intrinsics.d(oq5Var16.K(), Integer.valueOf(i9))) {
                        ouj.x(i9, oq5Var16, i9, kb5Var3);
                    }
                    g0g.U(oq5Var16, H3, wp5.d);
                    qs5 qs5Var = AndroidCompositionLocals_androidKt.a;
                    qs5Var.getClass();
                    if (asq.J((Configuration) oq5Var16.j(qs5Var)) && o8wVar.b) {
                        oq5Var16.Z(-563934530);
                        u1g.l(oq5Var16, d.e(vciVar5, 4));
                        gae.b(a0g.E(R.drawable.ic_logo_yandex_books, 0, oq5Var16), null, a.a(d.e(vciVar5, 16), "logo_bookmate"), 0L, oq5Var16, 432, 8);
                        eta.p(vciVar5, 8, oq5Var16, false);
                    } else {
                        oq5Var16.Z(-570863402);
                        oq5Var16.p(false);
                    }
                    bkp.R(uvdVar, iabVar.a, function0, a.a(vciVar5, "title"), ges.a(nu0.d(), zsd.l0(oq5Var16)), oq5Var16, 3072 | (intValue9 & 14), 0);
                    oq5Var16.p(true);
                } else {
                    oq5Var16.S();
                }
                return Unit.a;
            case 10:
                vci vciVar6 = vci.a;
                List list4 = (List) this.b;
                um0 um0Var = (um0) this.c;
                Locale locale = (Locale) this.d;
                d85 d85Var = (d85) this.e;
                c cVar4 = (c) obj;
                hq5 hq5Var11 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                cVar4.getClass();
                long j = cVar4.b;
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((oq5) hq5Var11).f(cVar4) ? 4 : 2;
                }
                if ((intValue10 & 19) == 18) {
                    oq5 oq5Var17 = (oq5) hq5Var11;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var18 = (oq5) hq5Var11;
                float c0 = ((jx7) oq5Var18.j(es5.h)).c0(ga6.h(j));
                int i10 = ga6.i(j);
                int size = list4.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.add(1);
                }
                oq5Var18.Z(-65783707);
                int size2 = list4.size();
                int i12 = 0;
                for (int i13 = 0; i13 < size2; i13++) {
                    ve4 ve4Var = (ve4) list4.get(i13);
                    if (ve4Var.a != null) {
                        oq5Var18.Z(-2039211804);
                        c0 -= w1g.p(qwp.Z(ve4Var, oq5Var18), 0, oq5Var18, 0, 2);
                    } else {
                        oq5Var18.Z(-2041906944);
                    }
                    oq5Var18.p(false);
                    String str = ve4Var.c;
                    if (str != null) {
                        oq5Var18.Z(-2039028501);
                        arrayList.set(i13, Integer.valueOf(ndr.b(str, nu0.j(), i10, oq5Var18)));
                        c0 -= w1g.p(nu0.j(), 0, oq5Var18, 0, 2) * ((Number) arrayList.get(i13)).intValue();
                    } else {
                        oq5Var18.Z(-2041906944);
                    }
                    oq5Var18.p(false);
                    c0 -= 16;
                    if (Float.compare(c0, 0) <= 0) {
                        oq5Var18.p(false);
                        ta5 a5 = sa5.a(qx0.c, b2c.n, oq5Var18, 48);
                        i = oq5Var18.P;
                        androidx.compose.runtime.internal.a l4 = oq5Var18.l();
                        yci H4 = vnj.H(oq5Var18, vciVar6);
                        xp5.T.getClass();
                        grb grbVar4 = wp5.b;
                        oq5Var18.d0();
                        if (oq5Var18.O) {
                            oq5Var18.n0();
                        } else {
                            oq5Var18.k(grbVar4);
                        }
                        g0g.U(oq5Var18, a5, wp5.f);
                        g0g.U(oq5Var18, l4, wp5.e);
                        kb5 kb5Var4 = wp5.g;
                        if (!oq5Var18.O || !Intrinsics.d(oq5Var18.K(), Integer.valueOf(i))) {
                            ouj.x(i, oq5Var18, i, kb5Var4);
                        }
                        g0g.U(oq5Var18, H4, wp5.d);
                        oq5Var18.Z(19481466);
                        i2 = 0;
                        while (i2 < i12) {
                            oq5 oq5Var19 = oq5Var18;
                            int i14 = i12;
                            qwp.e((ve4) list4.get(i2), i2, ((Number) arrayList.get(i2)).intValue(), um0Var, locale, d85Var, oq5Var19, 0);
                            oq5Var18 = oq5Var19;
                            if (i2 < i14 - 1) {
                                oq5Var18.Z(604349776);
                                eta.p(vciVar6, 16, oq5Var18, false);
                            } else {
                                oq5Var18.Z(600517494);
                                oq5Var18.p(false);
                            }
                            i2++;
                            i12 = i14;
                        }
                        oq5Var18.p(false);
                        oq5Var18.p(true);
                        return Unit.a;
                    }
                    i12++;
                }
                oq5Var18.p(false);
                ta5 a52 = sa5.a(qx0.c, b2c.n, oq5Var18, 48);
                i = oq5Var18.P;
                androidx.compose.runtime.internal.a l42 = oq5Var18.l();
                yci H42 = vnj.H(oq5Var18, vciVar6);
                xp5.T.getClass();
                grb grbVar42 = wp5.b;
                oq5Var18.d0();
                if (oq5Var18.O) {
                }
                g0g.U(oq5Var18, a52, wp5.f);
                g0g.U(oq5Var18, l42, wp5.e);
                kb5 kb5Var42 = wp5.g;
                if (!oq5Var18.O) {
                }
                ouj.x(i, oq5Var18, i, kb5Var42);
                g0g.U(oq5Var18, H42, wp5.d);
                oq5Var18.Z(19481466);
                i2 = 0;
                while (i2 < i12) {
                }
                oq5Var18.p(false);
                oq5Var18.p(true);
                return Unit.a;
            case 11:
                WebView webView = (WebView) this.b;
                Function1 function1 = (Function1) this.c;
                kev kevVar = (kev) this.d;
                lev levVar = (lev) this.e;
                c cVar5 = (c) obj;
                hq5 hq5Var12 = (hq5) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                cVar5.getClass();
                long j2 = cVar5.b;
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((oq5) hq5Var12).f(cVar5) ? 4 : 2;
                }
                if ((intValue11 & 19) == 18) {
                    oq5 oq5Var20 = (oq5) hq5Var12;
                    if (oq5Var20.z()) {
                        oq5Var20.S();
                        return Unit.a;
                    }
                }
                int i15 = ga6.g(j2) ? -1 : -2;
                int i16 = ga6.f(j2) ? -1 : -2;
                oq5 oq5Var21 = (oq5) hq5Var12;
                boolean h5 = oq5Var21.h(webView) | oq5Var21.f(function1) | oq5Var21.d(i15) | oq5Var21.d(i16) | oq5Var21.h(kevVar) | oq5Var21.h(levVar);
                Object K13 = oq5Var21.K();
                if (h5 || K13 == gq5.a) {
                    cq5 cq5Var = new cq5(webView, i15, i16, function1, kevVar, levVar);
                    oq5Var21.k0(cq5Var);
                    K13 = cq5Var;
                }
                androidx.compose.ui.viewinterop.a.a(0, 6, oq5Var21, null, (Function1) K13, null);
                return Unit.a;
            case 12:
                String str2 = (String) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                aqi aqiVar = (aqi) this.e;
                c cVar6 = (c) obj;
                hq5 hq5Var13 = (hq5) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                cVar6.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((oq5) hq5Var13).f(cVar6) ? 4 : 2;
                }
                if ((intValue12 & 19) == 18) {
                    oq5 oq5Var22 = (oq5) hq5Var13;
                    if (oq5Var22.z()) {
                        oq5Var22.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var23 = (oq5) hq5Var13;
                boolean f4 = oq5Var23.f(str2);
                Object K14 = oq5Var23.K();
                if (f4 || K14 == gq5.a) {
                    K14 = new wq(str2, 11);
                    oq5Var23.k0(K14);
                }
                pn0 s2 = vut.s(cVar6, (Function1) K14);
                xv7.i(new mn0(6, str3, (ArrayList) null), a.a(vci.a, "concert_item_long_place"), ((dq0) oq5Var23.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 0, false, (((Boolean) aqiVar.getValue()).booleanValue() || str4 != null) ? 1 : 2, 0, null, null, nu0.j(), s2, null, oq5Var23, 48, 134217728, 647160);
                return Unit.a;
            case 13:
                String str5 = (String) this.b;
                ru5 ru5Var = (ru5) this.c;
                Integer num = (Integer) this.d;
                aqi aqiVar2 = (aqi) this.e;
                c cVar7 = (c) obj;
                hq5 hq5Var14 = (hq5) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                cVar7.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((oq5) hq5Var14).f(cVar7) ? 4 : 2;
                }
                if ((intValue13 & 19) == 18) {
                    oq5 oq5Var24 = (oq5) hq5Var14;
                    if (oq5Var24.z()) {
                        oq5Var24.S();
                        return Unit.a;
                    }
                }
                if (str5 != null) {
                    oq5 oq5Var25 = (oq5) hq5Var14;
                    oq5Var25.Z(1527112070);
                    boolean f5 = oq5Var25.f(str5);
                    Object K15 = oq5Var25.K();
                    if (f5 || K15 == gq5.a) {
                        K15 = new wq(str5, 9);
                        oq5Var25.k0(K15);
                    }
                    pn0 s3 = vut.s(cVar7, (Function1) K15);
                    oq5Var25.p(false);
                    pn0Var = s3;
                } else {
                    oq5 oq5Var26 = (oq5) hq5Var14;
                    oq5Var26.Z(1527277703);
                    oq5Var26.p(false);
                    pn0Var = null;
                }
                xv7.i(new mn0(6, j66.d0(ru5Var.d(), hq5Var14), (ArrayList) null), a.a(vci.a, "concert_item_long_type"), ((dq0) ((oq5) hq5Var14).j(eq0.a)).b.b, 0L, 0L, 0, 0L, 0, false, (((Boolean) aqiVar2.getValue()).booleanValue() || num != null) ? 1 : 2, 0, null, null, nu0.j(), pn0Var, null, hq5Var14, 48, 134217728, 647160);
                return Unit.a;
            case 14:
                return a(obj, obj2, obj3);
            case 15:
                return d(obj, obj2, obj3);
            case 16:
                return g(obj, obj2, obj3);
            case 17:
                return h(obj, obj2, obj3);
            case 18:
                return j(obj, obj2, obj3);
            case 19:
                return k(obj, obj2, obj3);
            case 20:
                return l(obj, obj2, obj3);
            case 21:
                return m(obj, obj2, obj3);
            case 22:
                return n(obj, obj2, obj3);
            case 23:
                return o(obj, obj2, obj3);
            case 24:
                return p(obj, obj2, obj3);
            case 25:
                return q(obj, obj2, obj3);
            case 26:
                return r(obj, obj2, obj3);
            case 27:
                return s(obj, obj2, obj3);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return t(obj, obj2, obj3);
            default:
                tvd tvdVar2 = (tvd) this.b;
                dam damVar = (dam) this.c;
                rbm rbmVar = (rbm) this.d;
                List list5 = (List) this.e;
                hq5 hq5Var15 = (hq5) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var27 = (oq5) hq5Var15;
                if (oq5Var27.P(intValue14 & 1, (intValue14 & 17) != 16)) {
                    hag.e(tvdVar2, damVar, rbmVar, oq5Var27, 0);
                    List list6 = list5;
                    if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                        Iterator it2 = list6.iterator();
                        while (it2.hasNext()) {
                            if (((cbm) it2.next()) instanceof uam) {
                                oq5Var27.Z(-377507730);
                                oq5Var27.p(false);
                            }
                        }
                    }
                    oq5Var27.Z(-369565840);
                    eta.p(vci.a, 16, oq5Var27, false);
                } else {
                    oq5Var27.S();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ up(ybf ybfVar, m91 m91Var, h1d h1dVar, fvf fvfVar, oa1 oa1Var) {
        this.a = 4;
        this.b = ybfVar;
        this.c = m91Var;
        this.d = fvfVar;
        this.e = oa1Var;
    }

    public /* synthetic */ up(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
