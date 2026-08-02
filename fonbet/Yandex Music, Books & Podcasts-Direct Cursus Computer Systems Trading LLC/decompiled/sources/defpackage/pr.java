package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.passport.common.ui.progress.g;
import com.yandex.passport.sloth.ui.c1;
import com.yandex.passport.sloth.ui.error.e;
import com.yandex.passport.sloth.ui.string.b;
import com.yandex.plus.bdui.m;
import com.yandex.plus.bdui.plus.checkout.content.controller.z;
import com.yandex.plus.bdui.s;
import com.yandex.plus.home.internal.di.y;
import com.yandex.pulse.metrics.o;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class pr implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ pr(iab iabVar, gvd gvdVar, pbu pbuVar, Function0 function0, tvd tvdVar, dib dibVar) {
        this.a = 5;
        qo6 qo6Var = qo6.a;
        this.c = iabVar;
        this.b = gvdVar;
        this.d = pbuVar;
        this.e = function0;
        this.f = tvdVar;
        this.g = dibVar;
    }

    private final Object a(Object obj, Object obj2) {
        a3p a3pVar = (a3p) this.b;
        c0p c0pVar = (c0p) this.c;
        s2p s2pVar = (s2p) this.d;
        tmb tmbVar = (tmb) this.e;
        Function0 function0 = (Function0) this.f;
        Function0 function02 = (Function0) this.g;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
            boolean d = Intrinsics.d(a3pVar, y2p.a);
            vci vciVar = vci.a;
            if (d) {
                oq5Var.Z(327997892);
                a4g.b(c0pVar, d.c(a.q(vciVar, 0.0f, 0.0f, 0.0f, zs4.e(oq5Var), 7), 1.0f), oq5Var, 0);
                oq5Var.p(false);
            } else if (Intrinsics.d(a3pVar, w2p.a)) {
                oq5Var.Z(328370233);
                a4g.a(c0pVar, bfg.Q(d.c(a.q(vciVar, 0.0f, 0.0f, 0.0f, zs4.e(oq5Var), 7), 1.0f), bfg.C(oq5Var), false, 14), oq5Var, 0);
                oq5Var.p(false);
            } else if (Intrinsics.d(a3pVar, x2p.a)) {
                oq5Var.Z(328808604);
                boolean h = oq5Var.h(s2pVar);
                Object K = oq5Var.K();
                if (h || K == gq5.a) {
                    r9n r9nVar = new r9n(0, s2pVar, s2p.class, "onRefresh", "onRefresh()V", 0, 23);
                    oq5Var.k0(r9nVar);
                    K = r9nVar;
                }
                irf.q((Function0) ((h9f) K), tmbVar, null, oq5Var, 64);
                oq5Var.p(false);
            } else {
                if (!(a3pVar instanceof z2p)) {
                    throw vz1.i(oq5Var, 980410880, false);
                }
                oq5Var.Z(329096067);
                q5g.h(c0pVar, ((z2p) a3pVar).a, s2pVar, function0, d.c(vciVar, 1.0f), function02, oq5Var, 24576);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        q5g.h((c0p) this.b, (List) this.c, (s2p) this.d, (Function0) this.e, (yci) this.g, (Function0) this.f, (hq5) obj, rvf.R(24577));
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2) {
        cpq cpqVar;
        r6p r6pVar = (r6p) this.b;
        tmb tmbVar = (tmb) this.c;
        nnq nnqVar = (nnq) this.d;
        qnq qnqVar = (qnq) this.e;
        Function0 function0 = (Function0) this.f;
        Function0 function02 = (Function0) this.g;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
            kfh d = ug3.d(b2c.b, false);
            int i = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, vci.a);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                ouj.x(i, oq5Var, i, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            cpq cpqVar2 = (cpq) gld.M(r6pVar.c, oq5Var).getValue();
            ogp.g.e(cpqVar2 instanceof zoq, cpqVar2 instanceof apq, null, oq5Var, 4096, 4);
            boolean booleanValue = ((Boolean) gld.M(r6pVar.d, oq5Var).getValue()).booleanValue();
            boolean h = oq5Var.h(r6pVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                cpqVar = cpqVar2;
                r9n r9nVar = new r9n(0, r6pVar, r6p.class, "onRefresh", "onRefresh()V", 0, 28);
                oq5Var.k0(r9nVar);
                K = r9nVar;
            } else {
                cpqVar = cpqVar2;
            }
            bfg.f(booleanValue, (Function0) ((h9f) K), null, null, cpqVar instanceof bpq, ild.C(-260153157, new vl1(cpqVar, r6pVar, tmbVar, nnqVar, qnqVar, function0, function02), oq5Var), oq5Var, 196608, 12);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }

    private final Object h(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        q7g.l((qnq) this.b, (hgp) this.c, (nnq) this.d, (fvf) this.e, (yci) this.g, (Function0) this.f, (hq5) obj, rvf.R(9));
        return Unit.a;
    }

    private final Object j(Object obj, Object obj2) {
        xsq xsqVar = (xsq) this.b;
        nb6 nb6Var = (nb6) this.c;
        wn5 wn5Var = (wn5) this.d;
        zsq zsqVar = (zsq) this.e;
        hvq hvqVar = (hvq) this.f;
        Function0 function0 = (Function0) this.g;
        hq5 hq5Var = (hq5) obj;
        if ((((Integer) obj2).intValue() & 3) == 2) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        pcg.l(ild.C(-1584606306, new kt4(xsqVar, nb6Var, wn5Var, zsqVar, hvqVar, function0), hq5Var), hq5Var, 6);
        return Unit.a;
    }

    private final Object k(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        bfg.i((k4k) this.b, (String) this.c, (lvf) this.d, (dib) this.e, (v3s) this.f, (tmb) this.g, (hq5) obj, rvf.R(262657));
        return Unit.a;
    }

    private final Object l(Object obj, Object obj2) {
        oq5 oq5Var;
        String str = (String) this.b;
        sdr sdrVar = (sdr) this.c;
        yci yciVar = (yci) this.g;
        String str2 = (String) this.d;
        Function0 function0 = (Function0) this.e;
        g73 g73Var = (g73) this.f;
        hq5 hq5Var = (hq5) obj;
        if ((((Integer) obj2).intValue() & 3) == 2) {
            oq5 oq5Var2 = (oq5) hq5Var;
            if (oq5Var2.z()) {
                oq5Var2.S();
                return Unit.a;
            }
        }
        ta5 a = sa5.a(qx0.c, b2c.n, hq5Var, 0);
        oq5 oq5Var3 = (oq5) hq5Var;
        int i = oq5Var3.P;
        androidx.compose.runtime.internal.a l = oq5Var3.l();
        yci H = vnj.H(hq5Var, vci.a);
        xp5.T.getClass();
        grb grbVar = wp5.b;
        oq5Var3.d0();
        if (oq5Var3.O) {
            oq5Var3.k(grbVar);
        } else {
            oq5Var3.n0();
        }
        g0g.U(hq5Var, a, wp5.f);
        g0g.U(hq5Var, l, wp5.e);
        kb5 kb5Var = wp5.g;
        if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i))) {
            ouj.x(i, oq5Var3, i, kb5Var);
        }
        g0g.U(hq5Var, H, wp5.d);
        if (str == null || StringsKt.U(str)) {
            oq5Var = oq5Var3;
            oq5Var.Z(1139018484);
        } else {
            oq5Var3.Z(1140699087);
            q0k q0kVar = pks.a;
            boolean booleanValue = ((Boolean) sdrVar.getValue()).booleanValue();
            oq5Var = oq5Var3;
            irf.h(str, yciVar, str2, q0kVar, function0, booleanValue, null, false, null, hq5Var, 3072, 320);
        }
        oq5Var.p(false);
        g73Var.c.invoke(hq5Var, 0);
        oq5Var.p(true);
        return Unit.a;
    }

    private final Object m(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        wyf.o((yit) this.b, (njt) this.c, (spd) this.d, (Function0) this.e, (Function0) this.f, (yci) this.g, (hq5) obj, rvf.R(1));
        return Unit.a;
    }

    private final Object n(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        y1g.b((klu) this.b, (owu) this.c, (yci) this.g, (uoi) this.d, (d85) this.e, (cma) this.f, (hq5) obj, rvf.R(196993));
        return Unit.a;
    }

    private final Object o(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        o2g.p((String) this.b, (String) this.c, (jzb) this.d, (ukd) this.e, (kes) this.f, (plv) this.g, (hq5) obj, rvf.R(1));
        return Unit.a;
    }

    private final Object p(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        c1.a((e) this.b, (b) this.c, (g) this.d, (Function0) this.e, (Function1) this.f, (yci) this.g, (hq5) obj, rvf.R(1));
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0164, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r1.K(), java.lang.Integer.valueOf(r15)) == false) goto L50;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        o3k o3kVar;
        Object n71Var;
        Continuation continuation;
        aqi aqiVar;
        t71 t71Var;
        ynn ynnVar;
        boolean z;
        boolean z2;
        yci f;
        h9f h9fVar;
        sdr sdrVar;
        dh3 dh3Var;
        int i = this.a;
        dh3 dh3Var2 = androidx.compose.foundation.layout.b.a;
        vci vciVar = vci.a;
        kjn kjnVar = gq5.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                hld.a((j00) obj8, (iab) obj7, (jab) obj6, (thj) obj5, (tvd) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 1:
                o3k o3kVar2 = (o3k) obj8;
                aqi aqiVar2 = (aqi) obj7;
                t71 t71Var2 = (t71) obj6;
                o0k o0kVar = (o0k) obj5;
                fvf fvfVar = (fvf) obj4;
                fvf fvfVar2 = (fvf) obj3;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                    int i2 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, vciVar);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var, i2, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    Integer valueOf = Integer.valueOf(o3kVar2.j());
                    boolean f2 = oq5Var.f(aqiVar2) | oq5Var.f(o3kVar2) | oq5Var.h(t71Var2);
                    Object K = oq5Var.K();
                    if (f2 || K == kjnVar) {
                        o3kVar = o3kVar2;
                        continuation = null;
                        aqiVar = aqiVar2;
                        t71Var = t71Var2;
                        n71Var = new n71(o3kVar, t71Var, aqiVar, continuation, 0);
                        oq5Var.k0(n71Var);
                    } else {
                        aqiVar = aqiVar2;
                        t71Var = t71Var2;
                        o3kVar = o3kVar2;
                        n71Var = K;
                        continuation = null;
                    }
                    gld.w(oq5Var, valueOf, (Function2) n71Var);
                    Integer valueOf2 = Integer.valueOf(((v71) aqiVar.getValue()).b());
                    boolean f3 = oq5Var.f(o3kVar) | oq5Var.f(aqiVar);
                    Object K2 = oq5Var.K();
                    if (f3 || K2 == kjnVar) {
                        K2 = new l5(o3kVar, aqiVar, continuation, 25);
                        oq5Var.k0(K2);
                    }
                    gld.w(oq5Var, valueOf2, (Function2) K2);
                    hz2 hz2Var = b2c.k;
                    yci q = y2x.q(vciVar);
                    boolean f4 = oq5Var.f(aqiVar);
                    Object K3 = oq5Var.K();
                    if (f4 || K3 == kjnVar) {
                        K3 = new x80(aqiVar, 1);
                        oq5Var.k0(K3);
                    }
                    rvf.a(o3kVar, q, null, null, 0, 0.0f, hz2Var, null, false, (Function1) K3, null, null, null, ild.C(-1114421677, new k71(o0kVar, t71Var, fvfVar, fvfVar2, aqiVar, 0), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 24576, 15292);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 2:
                ha1 ha1Var = (ha1) obj8;
                tvd tvdVar = (tvd) obj4;
                ka1 ka1Var = (ka1) obj7;
                yi1 yi1Var = (yi1) obj6;
                q0d q0dVar = (q0d) obj5;
                gvd gvdVar = (gvd) obj3;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                ynn i3 = irv.i(hq5Var2);
                oq5 oq5Var3 = (oq5) hq5Var2;
                long f5 = ((ma5) oq5Var3.j(pa5.a)).f();
                ga1 ga1Var = !((Boolean) ha1Var.d.b.getValue()).booleanValue() ? new ga1(ha1Var, 0) : ((Boolean) ha1Var.e.getValue()).booleanValue() ? new ga1(ha1Var, 1) : new ga1(ha1Var, 2);
                vci vciVar2 = vci.a;
                yci a2 = androidx.compose.ui.platform.a.a(vciVar2, "artist_header");
                boolean e = oq5Var3.e(f5) | oq5Var3.f(tvdVar);
                Object K4 = oq5Var3.K();
                if (e || K4 == kjnVar) {
                    ynnVar = i3;
                    K4 = new lv(f5, tvdVar, 1);
                    oq5Var3.k0(K4);
                } else {
                    ynnVar = i3;
                }
                yci c = androidx.compose.ui.draw.a.c(a2, (Function1) K4);
                kfh d = ug3.d(b2c.b, false);
                int i4 = oq5Var3.P;
                androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                yci H2 = vnj.H(oq5Var3, c);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar2);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(oq5Var3, d, wp5.f);
                g0g.U(oq5Var3, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var3, i4, kb5Var2);
                }
                g0g.U(oq5Var3, H2, wp5.d);
                String str = ka1Var.e;
                pbu pbuVar = (pbu) t7g.C(str != null ? new jbu(str) : null, true, xpg.a(oq5Var3), null, oq5Var3, 48, 24).getValue();
                hab habVar = ha1Var.d;
                j0q j0qVar = yi1Var.o;
                boolean h = oq5Var3.h(yi1Var);
                Object K5 = oq5Var3.K();
                if (h || K5 == kjnVar) {
                    K5 = new m71(0, yi1Var, yi1.class, "onTitleClick", "onTitleClick()V", 0, 9);
                    oq5Var3.k0(K5);
                }
                Function0 function0 = (Function0) ((h9f) K5);
                boolean h2 = oq5Var3.h(yi1Var);
                Object K6 = oq5Var3.K();
                if (h2 || K6 == kjnVar) {
                    K6 = new le0(2, yi1Var, yi1.class, "onHeaderVisibilityChanged", "onHeaderVisibilityChanged(ZLjava/lang/String;)V", 0, 1);
                    oq5Var3.k0(K6);
                }
                leu.a(ka1Var, yi1Var, q0dVar, gvdVar, pbuVar, tvdVar, habVar, ga1Var, j0qVar, function0, com.yandex.music.core.ui.compose.a.b(vciVar2, ynnVar, 0L, 0.0f, null, (Function2) ((h9f) K6), 14), oq5Var3, 0);
                iz2 iz2Var = b2c.i;
                zsd.r(ga1Var, tvdVar, a.j(dh3Var2.a(vciVar2, iz2Var), 0, 160), oq5Var3, 0);
                vut.a(yi1Var, ka1Var, tvdVar, a.q(dh3Var2.a(vciVar2, iz2Var), 0.0f, 0.0f, 0.0f, 20, 7), oq5Var3, 3072);
                oq5Var3.p(true);
                if (ka1Var.i != null) {
                    oq5Var3.Z(542266901);
                    boolean g = true ^ irv.g(oq5Var3);
                    z = false;
                    oq5Var3.p(false);
                    z2 = g;
                } else {
                    z = false;
                    oq5Var3.Z(-369594016);
                    oq5Var3.p(false);
                    z2 = false;
                }
                if (z2) {
                    oq5Var3.Z(-369540629);
                    s9b.a(ga1Var, ild.C(481132201, new x3(25, ka1Var, yi1Var, tvdVar), oq5Var3), oq5Var3, 48);
                } else {
                    oq5Var3.Z(-379659060);
                }
                oq5Var3.p(z);
                u1g.l(oq5Var3, d.e(vciVar2, 24));
                return Unit.a;
            case 3:
                ((Integer) obj2).getClass();
                on1.f((xn1) obj8, (Function0) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                vut.f((h93) obj8, (wdj) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (yci) obj3, (hq5) obj, rvf.R(24577));
                return Unit.a;
            case 5:
                iab iabVar = (iab) obj7;
                gvd gvdVar2 = (gvd) obj8;
                qo6 qo6Var = qo6.g;
                pbu pbuVar2 = (pbu) obj6;
                Function0 function02 = (Function0) obj5;
                tvd tvdVar2 = (tvd) obj4;
                dib dibVar = (dib) obj3;
                hq5 hq5Var3 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var3;
                if (!oq5Var4.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    oq5Var4.S();
                } else if (iabVar.d.length() == 0) {
                    oq5Var4.Z(-886055635);
                    boolean v = v7g.v(pbuVar2);
                    Object K7 = oq5Var4.K();
                    if (K7 == kjnVar) {
                        K7 = vz1.h(oq5Var4);
                    }
                    yci d2 = androidx.compose.foundation.a.d(vci.a, (uoi) K7, null, v, null, null, function02, 24);
                    boolean f6 = oq5Var4.f(tvdVar2);
                    Object K8 = oq5Var4.K();
                    if (f6 || K8 == kjnVar) {
                        K8 = new nr(tvdVar2, 14);
                        oq5Var4.k0(K8);
                    }
                    men.n(gvdVar2, qo6Var, wyf.s(d2, (Function0) K8), oq5Var4, 0);
                    oq5Var4.p(false);
                } else {
                    oq5Var4.Z(-885386035);
                    men.m(iabVar.d, dibVar, qo6Var, false, function02, null, oq5Var4, 3072, 32);
                    oq5Var4.p(false);
                }
                return Unit.a;
            case 6:
                o3k o3kVar3 = (o3k) obj8;
                y25 y25Var = (y25) obj7;
                fvf fvfVar3 = (fvf) obj6;
                fvf fvfVar4 = (fvf) obj5;
                v25 v25Var = (v25) obj4;
                tmb tmbVar = (tmb) obj3;
                hq5 hq5Var4 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var4;
                if (oq5Var5.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    rvf.a(o3kVar3, y2x.q(vciVar), null, null, 1, 0.0f, null, null, false, null, null, null, null, ild.C(1322667500, new k71((Object) y25Var, fvfVar3, fvfVar4, (Object) v25Var, (Object) tmbVar, 1), oq5Var5), oq5Var5, 24576, 24576, 16364);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                u2x.h((String) obj8, (ru5) obj7, (String) obj6, (String) obj5, (Integer) obj4, (String) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 8:
                iv5 iv5Var = (iv5) obj8;
                mv5 mv5Var = (mv5) obj7;
                rv5 rv5Var = (rv5) obj6;
                dib dibVar2 = (dib) obj5;
                wv5 wv5Var = (wv5) obj4;
                tz5 tz5Var = (tz5) obj3;
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var5;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                if (iv5Var == null || mv5Var == null) {
                    oq5 oq5Var7 = (oq5) hq5Var5;
                    oq5Var7.Z(-710947840);
                    String str2 = wv5Var.c;
                    qo6 qo6Var2 = qo6.f;
                    boolean h3 = oq5Var7.h(tz5Var);
                    Object K9 = oq5Var7.K();
                    if (h3 || K9 == kjnVar) {
                        K9 = new e65(0, tz5Var, tz5.class, "onCoverClick", "onCoverClick()V", 0, 13);
                        oq5Var7.k0(K9);
                    }
                    men.m(str2, dibVar2, qo6Var2, true, (Function0) ((h9f) K9), com.yandex.music.core.ui.compose.b.c(d.d(vciVar, 1.0f), "cover_type", "full_screen"), oq5Var7, 200064, 0);
                    oq5Var7.p(false);
                } else {
                    oq5 oq5Var8 = (oq5) hq5Var5;
                    oq5Var8.Z(-711502244);
                    yci c2 = d.c(vciVar, 1.0f);
                    boolean h4 = oq5Var8.h(rv5Var);
                    Object K10 = oq5Var8.K();
                    if (h4 || K10 == kjnVar) {
                        K10 = new mt4(1, rv5Var, rv5.class, "onGalleryPageClicked", "onGalleryPageClicked(I)V", 0, 18);
                        oq5Var8.k0(K10);
                    }
                    i4w.e(iv5Var, dibVar2, c2, (Function1) ((h9f) K10), oq5Var8, 224640);
                    oq5Var8.p(false);
                }
                return Unit.a;
            case 9:
                qu5 qu5Var = (qu5) obj8;
                tvd tvdVar3 = (tvd) obj4;
                wv5 wv5Var2 = (wv5) obj7;
                tz5 tz5Var2 = (tz5) obj6;
                rv5 rv5Var2 = (rv5) obj5;
                gvd gvdVar3 = (gvd) obj3;
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var6;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                ynn i5 = irv.i(hq5Var6);
                oq5 oq5Var10 = (oq5) hq5Var6;
                long f7 = ((ma5) oq5Var10.j(pa5.a)).f();
                pu5 pu5Var = !((Boolean) qu5Var.d.b.getValue()).booleanValue() ? new pu5(qu5Var, 0) : ((Boolean) qu5Var.e.getValue()).booleanValue() ? new pu5(qu5Var, 1) : new pu5(qu5Var, 2);
                boolean e2 = oq5Var10.e(f7) | oq5Var10.f(tvdVar3);
                Object K11 = oq5Var10.K();
                if (e2 || K11 == kjnVar) {
                    K11 = new lv(f7, tvdVar3, 3);
                    oq5Var10.k0(K11);
                }
                vci vciVar3 = vci.a;
                yci c3 = androidx.compose.ui.draw.a.c(vciVar3, (Function1) K11);
                kfh d3 = ug3.d(b2c.b, false);
                int i6 = oq5Var10.P;
                androidx.compose.runtime.internal.a l3 = oq5Var10.l();
                yci H3 = vnj.H(oq5Var10, c3);
                xp5.T.getClass();
                grb grbVar3 = wp5.b;
                oq5Var10.d0();
                if (oq5Var10.O) {
                    oq5Var10.k(grbVar3);
                } else {
                    oq5Var10.n0();
                }
                g0g.U(oq5Var10, d3, wp5.f);
                g0g.U(oq5Var10, l3, wp5.e);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var10.O || !Intrinsics.d(oq5Var10.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var10, i6, kb5Var3);
                }
                g0g.U(oq5Var10, H3, wp5.d);
                hab habVar2 = qu5Var.d;
                j0q j0qVar2 = tz5Var2.o;
                boolean h5 = oq5Var10.h(tz5Var2);
                Object K12 = oq5Var10.K();
                if (h5 || K12 == kjnVar) {
                    K12 = new e65(0, tz5Var2, tz5.class, "onTitleClick", "onTitleClick()V", 0, 15);
                    oq5Var10.k0(K12);
                }
                Function0 function03 = (Function0) ((h9f) K12);
                boolean h6 = oq5Var10.h(tz5Var2);
                Object K13 = oq5Var10.K();
                if (h6 || K13 == kjnVar) {
                    K13 = new le0(2, tz5Var2, tz5.class, "onHeaderVisibilityChanged", "onHeaderVisibilityChanged(ZLjava/lang/String;)V", 0, 6);
                    oq5Var10.k0(K13);
                }
                pu5 pu5Var2 = pu5Var;
                xv.k(wv5Var2, tz5Var2, rv5Var2, gvdVar3, tvdVar3, habVar2, pu5Var2, j0qVar2, function03, com.yandex.music.core.ui.compose.a.b(vciVar3, i5, 0L, 0.0f, null, (Function2) ((h9f) K13), 14), oq5Var10, 8);
                zsd.r(pu5Var2, tvdVar3, a.j(dh3Var2.a(vciVar3, b2c.i), 0, 160), oq5Var10, 0);
                oq5Var10.p(true);
                float f8 = 24;
                u1g.l(oq5Var10, d.e(vciVar3, f8));
                String str3 = wv5Var2.j;
                if (str3 == null || str3.length() <= 0) {
                    oq5Var10.Z(2144106383);
                    oq5Var10.p(false);
                } else {
                    oq5Var10.Z(-2142701434);
                    boolean h7 = oq5Var10.h(tz5Var2);
                    Object K14 = oq5Var10.K();
                    if (h7 || K14 == kjnVar) {
                        K14 = new e65(0, tz5Var2, tz5.class, "onDescriptionClick", "onDescriptionClick()V", 0, 16);
                        oq5Var10.k0(K14);
                    }
                    ges j = nu0.j();
                    agr agrVar = eq0.a;
                    p0q.b(str3, (Function0) ((h9f) K14), 3, j, ((dq0) oq5Var10.j(agrVar)).b.a, ((dq0) oq5Var10.j(agrVar)).b.d, rvf.M(R.string.concert_description_more, oq5Var10), rvf.M(R.string.concert_description_more, oq5Var10), a.o(vciVar3, 16, 0.0f, 2), oq5Var10, 905970048);
                    eta.p(vciVar3, f8, oq5Var10, false);
                }
                return Unit.a;
            case 10:
                yci yciVar = (yci) obj3;
                g6d g6dVar = (g6d) obj8;
                rxv rxvVar = (rxv) obj7;
                p9f p9fVar = (p9f) obj6;
                euf eufVar = (euf) obj5;
                Function2 function2 = (Function2) obj4;
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var11 = (oq5) hq5Var7;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        return Unit.a;
                    }
                }
                Unit unit = Unit.a;
                oq5 oq5Var12 = (oq5) hq5Var7;
                boolean h8 = oq5Var12.h(g6dVar);
                Object K15 = oq5Var12.K();
                if (h8 || K15 == kjnVar) {
                    K15 = new vv4(g6dVar, (Continuation) null, 26);
                    oq5Var12.k0(K15);
                }
                f = yciVar.f(new SuspendPointerInputElement(unit, null, null, new dur((Function2) K15), 6));
                boolean f9 = oq5Var12.f(rxvVar);
                Object K16 = oq5Var12.K();
                if (f9 || K16 == kjnVar) {
                    K16 = new kk6(rxvVar, 0);
                    oq5Var12.k0(K16);
                }
                yci a3 = androidx.compose.ui.graphics.a.a(f, (Function1) K16);
                boolean h9 = oq5Var12.h(g6dVar);
                Object K17 = oq5Var12.K();
                if (h9 || K17 == kjnVar) {
                    K17 = new at5(11, g6dVar);
                    oq5Var12.k0(K17);
                }
                n7w.t(p9fVar, androidx.compose.ui.layout.a.f(a3, (Function1) K17), eufVar, function2, oq5Var12, 0, 0);
                return Unit.a;
            case 11:
                sla slaVar = (sla) obj8;
                hla hlaVar = (hla) obj7;
                qnq qnqVar = (qnq) obj6;
                fvf fvfVar5 = (fvf) obj5;
                o0k o0kVar2 = (o0k) obj4;
                nla nlaVar = (nla) obj3;
                hq5 hq5Var8 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var8;
                if (oq5Var13.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    List d0 = etn.d0(slaVar.a, hlaVar, qnqVar, oq5Var13);
                    Object K18 = oq5Var13.K();
                    if (K18 == kjnVar) {
                        nlaVar.getClass();
                        K18 = new uj1(nlaVar.a);
                        oq5Var13.k0(K18);
                    }
                    irf.u(d0, (krf) K18, androidx.compose.ui.platform.a.a(d.c(vciVar, 1.0f), "downloads_collection_landing_content"), null, null, fvfVar5, null, 0, null, ghh.C(o0kVar2, a.c(0.0f, 16, 0.0f, 0.0f, 13)), 0.0f, 0, oq5Var13, 432, 0, 3544);
                } else {
                    oq5Var13.S();
                }
                return Unit.a;
            case 12:
                String str4 = (String) obj8;
                aqi aqiVar3 = (aqi) obj7;
                fvf fvfVar6 = (fvf) obj6;
                ebj ebjVar = (ebj) obj5;
                sdr sdrVar2 = (sdr) obj4;
                sdr sdrVar3 = (sdr) obj3;
                hq5 hq5Var9 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var14 = (oq5) hq5Var9;
                if (oq5Var14.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    String str5 = (String) sdrVar2.getValue();
                    String str6 = str5 == null ? str4 : str5;
                    k2s k2sVar = (k2s) aqiVar3.getValue();
                    boolean booleanValue = ((Boolean) sdrVar3.getValue()).booleanValue();
                    boolean h10 = oq5Var14.h(ebjVar);
                    Object K19 = oq5Var14.K();
                    if (h10 || K19 == kjnVar) {
                        K19 = new m9j(0, ebjVar, ebj.class, "onSearchClick", "onSearchClick()V", 0, 4);
                        oq5Var14.k0(K19);
                    }
                    Function0 function04 = (Function0) ((h9f) K19);
                    boolean h11 = oq5Var14.h(ebjVar);
                    Object K20 = oq5Var14.K();
                    if (h11 || K20 == kjnVar) {
                        K20 = new kef(1, ebjVar, ebj.class, "onTabClick", "onTabClick(I)V", 0, 18);
                        oq5Var14.k0(K20);
                    }
                    Function1 function1 = (Function1) ((h9f) K20);
                    if (ebjVar.e) {
                        oq5Var14.Z(989477747);
                        boolean h12 = oq5Var14.h(ebjVar);
                        Object K21 = oq5Var14.K();
                        if (h12 || K21 == kjnVar) {
                            K21 = new m9j(0, ebjVar, ebj.class, "onBackButtonClick", "onBackButtonClick()V", 0, 5);
                            oq5Var14.k0(K21);
                        }
                        h9fVar = (h9f) K21;
                        oq5Var14.p(false);
                    } else {
                        oq5Var14.Z(989510730);
                        oq5Var14.p(false);
                        h9fVar = null;
                    }
                    xv7.o(str6, k2sVar, booleanValue, fvfVar6, function04, function1, (Function0) h9fVar, null, null, oq5Var14, 0, 384);
                } else {
                    oq5Var14.S();
                }
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                p6g.g((a3m) obj8, (j3m) obj7, (fvf) obj6, (lf5) obj5, (yci) obj3, (o0k) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 14:
                tvd tvdVar4 = (tvd) obj4;
                dam damVar = (dam) obj8;
                rbm rbmVar = (rbm) obj7;
                hab habVar3 = (hab) obj6;
                Function0 function05 = (Function0) obj5;
                sdr sdrVar4 = (sdr) obj3;
                hq5 hq5Var10 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var15 = (oq5) hq5Var10;
                if (oq5Var15.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    iz2 iz2Var2 = b2c.b;
                    kfh d4 = ug3.d(iz2Var2, false);
                    int i7 = oq5Var15.P;
                    androidx.compose.runtime.internal.a l4 = oq5Var15.l();
                    yci H4 = vnj.H(oq5Var15, vciVar);
                    xp5.T.getClass();
                    grb grbVar4 = wp5.b;
                    oq5Var15.d0();
                    if (oq5Var15.O) {
                        oq5Var15.k(grbVar4);
                    } else {
                        oq5Var15.n0();
                    }
                    kb5 kb5Var4 = wp5.f;
                    g0g.U(oq5Var15, d4, kb5Var4);
                    kb5 kb5Var5 = wp5.e;
                    g0g.U(oq5Var15, l4, kb5Var5);
                    kb5 kb5Var6 = wp5.g;
                    if (!oq5Var15.O) {
                        sdrVar = sdrVar4;
                        break;
                    } else {
                        sdrVar = sdrVar4;
                    }
                    ouj.x(i7, oq5Var15, i7, kb5Var6);
                    kb5 kb5Var7 = wp5.d;
                    g0g.U(oq5Var15, H4, kb5Var7);
                    long f10 = ((ma5) oq5Var15.j(pa5.a)).f();
                    boolean e3 = oq5Var15.e(f10) | oq5Var15.f(tvdVar4);
                    Object K22 = oq5Var15.K();
                    if (e3 || K22 == kjnVar) {
                        dh3Var = dh3Var2;
                        K22 = new lv(f10, tvdVar4, 5);
                        oq5Var15.k0(K22);
                    } else {
                        dh3Var = dh3Var2;
                    }
                    yci c4 = androidx.compose.ui.draw.a.c(vciVar, (Function1) K22);
                    kfh d5 = ug3.d(iz2Var2, false);
                    int i8 = oq5Var15.P;
                    androidx.compose.runtime.internal.a l5 = oq5Var15.l();
                    yci H5 = vnj.H(oq5Var15, c4);
                    oq5Var15.d0();
                    if (oq5Var15.O) {
                        oq5Var15.k(grbVar4);
                    } else {
                        oq5Var15.n0();
                    }
                    g0g.U(oq5Var15, d5, kb5Var4);
                    g0g.U(oq5Var15, l5, kb5Var5);
                    if (oq5Var15.O || !Intrinsics.d(oq5Var15.K(), Integer.valueOf(i8))) {
                        ouj.x(i8, oq5Var15, i8, kb5Var6);
                    }
                    g0g.U(oq5Var15, H5, kb5Var7);
                    iab iabVar2 = damVar.a;
                    gvd gvdVar4 = damVar.b;
                    dib dibVar3 = (dib) rbmVar.a.n;
                    boolean h13 = oq5Var15.h(rbmVar);
                    Object K23 = oq5Var15.K();
                    if (h13 || K23 == kjnVar) {
                        K23 = new ayl(0, rbmVar, rbm.class, "onCoverClick", "onCoverClick()V", 0, 15);
                        oq5Var15.k0(K23);
                    }
                    h9f h9fVar2 = (h9f) K23;
                    boolean h14 = oq5Var15.h(rbmVar);
                    Object K24 = oq5Var15.K();
                    if (h14 || K24 == kjnVar) {
                        K24 = new ayl(0, rbmVar, rbm.class, "onOverflowClick", "onOverflowClick()V", 0, 16);
                        oq5Var15.k0(K24);
                    }
                    yci d6 = d.d(vciVar, 1.0f);
                    pbu pbuVar3 = (pbu) sdrVar.getValue();
                    qo6 qo6Var3 = qo6.g;
                    Function0 function06 = (Function0) h9fVar2;
                    Function0 function07 = (Function0) ((h9f) K24);
                    boolean h15 = oq5Var15.h(rbmVar) | oq5Var15.h(damVar);
                    Object K25 = oq5Var15.K();
                    if (h15 || K25 == kjnVar) {
                        K25 = new ril(rbmVar, damVar);
                        oq5Var15.k0(K25);
                    }
                    Function0 function08 = (Function0) K25;
                    Object K26 = oq5Var15.K();
                    if (K26 == kjnVar) {
                        K26 = new hvl(14);
                        oq5Var15.k0(K26);
                    }
                    pd.m(iabVar2, gvdVar4, habVar3, tvdVar4, dibVar3, function06, function07, function08, (Function0) K26, pbuVar3, qo6Var3, d6, function05, null, oq5Var15, 100663296, 122880);
                    iz2 iz2Var3 = b2c.i;
                    dh3 dh3Var3 = dh3Var;
                    zsd.r(function05, tvdVar4, a.j(dh3Var3.a(vciVar, iz2Var3), 0, 160), oq5Var15, 0);
                    lsq.f(rbmVar, tvdVar4, a.q(dh3Var3.a(vciVar, iz2Var3), 0.0f, 0.0f, 0.0f, 20, 7), oq5Var15, 0);
                    oq5Var15.p(true);
                    oq5Var15.p(true);
                } else {
                    oq5Var15.S();
                }
                return Unit.a;
            case 15:
                ((Integer) obj2).getClass();
                ngg.e((String) obj8, (k4k) obj7, (lvf) obj6, (dib) obj5, (fem) obj4, (tmb) obj3, (hq5) obj, rvf.R(262657));
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                pvo.d((String) obj8, (d85) obj7, (String) obj6, (wn5) obj5, (wn5) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 17:
                ((Integer) obj2).getClass();
                a4g.h((c0p) obj8, (s2p) obj7, (tmb) obj6, (Function0) obj5, (yci) obj3, (Function0) obj4, (hq5) obj, rvf.R(513));
                return Unit.a;
            case 18:
                return a(obj, obj2);
            case 19:
                return d(obj, obj2);
            case 20:
                return g(obj, obj2);
            case 21:
                return h(obj, obj2);
            case 22:
                return j(obj, obj2);
            case 23:
                return k(obj, obj2);
            case 24:
                return l(obj, obj2);
            case 25:
                return m(obj, obj2);
            case 26:
                return n(obj, obj2);
            case 27:
                return o(obj, obj2);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return p(obj, obj2);
            default:
                m mVar = (m) obj2;
                ((s) obj).getClass();
                mVar.getClass();
                return new z(mVar, (com.yandex.plus.pay.ui.core.api.common.a) obj8, (com.yandex.plus.core.imageloader.b) obj7, (com.yandex.plus.pay.ui.design.api.api.a) obj6, (y) obj5, (com.yandex.plus.bdui.plus.checkout.action.a) obj4, (com.yandex.plus.log.api.b) obj3);
        }
    }

    public /* synthetic */ pr(g73 g73Var, yci yciVar, sdr sdrVar, String str, String str2, Function0 function0) {
        this.a = 24;
        this.b = str;
        this.c = sdrVar;
        this.g = yciVar;
        this.d = str2;
        this.e = function0;
        this.f = g73Var;
    }

    public /* synthetic */ pr(tvd tvdVar, dam damVar, rbm rbmVar, hab habVar, Function0 function0, aqi aqiVar) {
        this.a = 14;
        this.f = tvdVar;
        this.b = damVar;
        this.c = rbmVar;
        this.d = habVar;
        this.e = function0;
        this.g = aqiVar;
    }

    public /* synthetic */ pr(yci yciVar, g6d g6dVar, rxv rxvVar, p9f p9fVar, euf eufVar, Function2 function2) {
        this.a = 10;
        this.g = yciVar;
        this.b = g6dVar;
        this.c = rxvVar;
        this.d = p9fVar;
        this.e = eufVar;
        this.f = function2;
    }

    public /* synthetic */ pr(r6p r6pVar, tmb tmbVar, nnq nnqVar, qnq qnqVar, Function0 function0, Function0 function02) {
        this.a = 20;
        this.b = r6pVar;
        this.c = tmbVar;
        this.d = nnqVar;
        this.e = qnqVar;
        this.f = function0;
        this.g = function02;
    }

    public /* synthetic */ pr(klu kluVar, owu owuVar, yci yciVar, uoi uoiVar, d85 d85Var, cma cmaVar, int i) {
        this.a = 26;
        this.b = kluVar;
        this.c = owuVar;
        this.g = yciVar;
        this.d = uoiVar;
        this.e = d85Var;
        this.f = cmaVar;
    }

    public /* synthetic */ pr(Object obj, tvd tvdVar, Object obj2, Object obj3, Object obj4, gvd gvdVar, int i) {
        this.a = i;
        this.b = obj;
        this.f = tvdVar;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.g = gvdVar;
    }

    public /* synthetic */ pr(Object obj, Object obj2, Object obj3, Object obj4, yci yciVar, Object obj5, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.g = yciVar;
        this.f = obj5;
    }

    public /* synthetic */ pr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public /* synthetic */ pr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }
}
