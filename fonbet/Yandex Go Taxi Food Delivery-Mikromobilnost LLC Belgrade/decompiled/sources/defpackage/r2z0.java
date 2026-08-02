package defpackage;

import androidx.compose.material3.t;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.airbnb.lottie.compose.LottieCompositionResultImpl;
import com.airbnb.lottie.compose.a;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.scooters.bdui.api.ScootersBduiScreenType;
import com.yandex.go.scooters.bdui.c;
import com.yandex.messaging.ui.settings.folder.addChat.g;
import com.yx360.design.compose.atoms.DsButtonClose$Type;
import java.util.List;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public final /* synthetic */ class r2z0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ r2z0(f530 f530Var, x3z0 x3z0Var, boolean z, tls tlsVar, int i) {
        this.a = 20;
        this.w = f530Var;
        this.c = x3z0Var;
        this.b = z;
        this.x = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        c530 c530Var;
        int i;
        c530 c530Var2;
        int i2;
        int i3 = this.a;
        g43 g43Var = lr20.c;
        Object obj3 = did.a;
        boolean z = this.b;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.x;
        Object obj5 = this.w;
        Object obj6 = this.c;
        switch (i3) {
            case 0:
                x3z0 x3z0Var = (x3z0) obj6;
                oz40 oz40Var = (oz40) obj5;
                oz40 oz40Var2 = (oz40) obj4;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                } else if (((Boolean) oz40Var.getValue()).booleanValue() && x3z0Var.j != null) {
                    btsVar.e0(-1125889338);
                    k3r k3rVar = ljs0.c;
                    iqx iqxVar = x3z0Var.j;
                    wp2 wp2Var = x3z0Var.a.b;
                    Object Q = btsVar.Q();
                    if (Q == obj3) {
                        Q = new w01(26, oz40Var);
                        btsVar.o0(Q);
                    }
                    g2z0.b(k3rVar, iqxVar, wp2Var, (sls) Q, btsVar, 3078);
                    btsVar.t(false);
                } else if (((Boolean) oz40Var2.getValue()).booleanValue()) {
                    btsVar.e0(-1125132070);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-1125640439);
                    LottieCompositionResultImpl f = a.f(new vsz(!z ? "light-await-lottie.json" : "dark-await-lottie.json"), btsVar, 0);
                    yrz c = a.c((nsz) f.getValue(), false, false, false, 0.0f, Integer.MAX_VALUE, btsVar, 958);
                    nsz nszVar = (nsz) f.getValue();
                    boolean k = btsVar.k(c);
                    Object Q2 = btsVar.Q();
                    if (k || Q2 == obj3) {
                        Q2 = new b8i0(c, 1);
                        btsVar.o0(Q2);
                    }
                    a.a(nszVar, (sls) Q2, ljs0.c(c530.a, 1.0f), false, false, false, false, null, false, null, null, null, false, false, null, null, false, btsVar, 384, 0, 131064);
                    btsVar.t(false);
                }
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                g.h((o5f) obj6, this.b, (sls) obj5, (f530) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 2:
                sls slsVar = null;
                i611 i611Var = (i611) obj6;
                ety0 ety0Var = (ety0) obj5;
                tls tlsVar = (tls) obj4;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                boolean V = btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2);
                dmw0 dmw0Var = btsVar2.a;
                if (!V) {
                    btsVar2.Y();
                    return zy11Var;
                }
                so5 so5Var = x4c.G;
                sic a = qic.a(g43Var, so5Var, btsVar2, 0);
                int hashCode = Long.hashCode(btsVar2.T);
                r1b0 o = btsVar2.o();
                c530 c530Var3 = c530.a;
                f530 d = b.d(btsVar2, c530Var3);
                ohd.G1.getClass();
                sls slsVar2 = d.b;
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar2);
                } else {
                    btsVar2.r0();
                }
                wls wlsVar = d.f;
                qje.W(btsVar2, wlsVar, a);
                wls wlsVar2 = d.e;
                qje.W(btsVar2, wlsVar2, o);
                Integer valueOf = Integer.valueOf(hashCode);
                wls wlsVar3 = d.g;
                qje.W(btsVar2, wlsVar3, valueOf);
                tls tlsVar2 = d.h;
                qje.M(btsVar2, tlsVar2);
                wls wlsVar4 = d.d;
                qje.W(btsVar2, wlsVar4, d);
                f530 o2 = an91.o(c530Var3, 4.0f, 0.0f, 0.0f, 0.0f, 14);
                Object Q3 = btsVar2.Q();
                if (Q3 == obj3) {
                    c530Var = c530Var3;
                    Q3 = new teb(20);
                    btsVar2.o0(Q3);
                } else {
                    c530Var = c530Var3;
                }
                qgy.b(i611Var.a, null, fnq0.a(o2, (tls) Q3), AppColor$Palette.Text, 0L, 0L, null, 0L, 2, 0, 0, ety0Var, null, btsVar2, 805309440, 0, 11762);
                ib11 ib11Var = i611Var.e;
                btsVar2.e0(-1337699813);
                if (z) {
                    btsVar2.e0(-771305701);
                    i = 0;
                    btsVar2.t(false);
                } else {
                    btsVar2.e0(-771269307);
                    boolean k2 = btsVar2.k(tlsVar) | btsVar2.e(ib11Var);
                    Object Q4 = btsVar2.Q();
                    if (k2 || Q4 == obj3) {
                        Q4 = new ej5(tlsVar, ib11Var, 1);
                        btsVar2.o0(Q4);
                    }
                    i = 0;
                    btsVar2.t(false);
                    slsVar = (sls) Q4;
                }
                c530 c530Var4 = c530Var;
                f530 o3 = an91.o(c530Var4, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                sic a2 = qic.a(g43Var, so5Var, btsVar2, i);
                int hashCode2 = Long.hashCode(btsVar2.T);
                r1b0 o4 = btsVar2.o();
                f530 d2 = b.d(btsVar2, o3);
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar2);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, wlsVar, a2);
                qje.W(btsVar2, wlsVar2, o4);
                vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar2);
                qje.W(btsVar2, wlsVar4, d2);
                ptb1.b(ib11Var, true, null, slsVar, true, null, null, null, null, null, btsVar2, 24624, 996);
                jra1.d(ib11Var.l, an91.o(c530Var4, 0.0f, 4.0f, 0.0f, 0.0f, 13), false, btsVar2, 48);
                btsVar2.t(true);
                btsVar2.t(false);
                if (i611Var.f.length() > 0) {
                    btsVar2.e0(-1337065460);
                    f530 o5 = an91.o(c530Var4, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                    Object Q5 = btsVar2.Q();
                    if (Q5 == obj3) {
                        Q5 = new teb(20);
                        btsVar2.o0(Q5);
                    }
                    jeb1.f(i611Var.f, fnq0.a(o5, (tls) Q5), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 2, false, 0, 0, null, xya1.e(btsVar2).h.a, btsVar2, 805306752, 0, 15864);
                    btsVar2.t(false);
                } else {
                    btsVar2.e0(-1336753786);
                    btsVar2.t(false);
                }
                btsVar2.t(true);
                return zy11Var;
            case 3:
                k611 k611Var = (k611) obj6;
                ety0 ety0Var2 = (ety0) obj5;
                tls tlsVar3 = (tls) obj4;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                boolean V2 = btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2);
                dmw0 dmw0Var2 = btsVar3.a;
                if (V2) {
                    so5 so5Var2 = x4c.G;
                    sic a3 = qic.a(g43Var, so5Var2, btsVar3, 0);
                    sls slsVar3 = null;
                    int hashCode3 = Long.hashCode(btsVar3.T);
                    r1b0 o6 = btsVar3.o();
                    c530 c530Var5 = c530.a;
                    f530 d3 = b.d(btsVar3, c530Var5);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (dmw0Var2 == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar4);
                    } else {
                        btsVar3.r0();
                    }
                    wls wlsVar5 = d.f;
                    qje.W(btsVar3, wlsVar5, a3);
                    wls wlsVar6 = d.e;
                    qje.W(btsVar3, wlsVar6, o6);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    wls wlsVar7 = d.g;
                    qje.W(btsVar3, wlsVar7, valueOf2);
                    tls tlsVar4 = d.h;
                    qje.M(btsVar3, tlsVar4);
                    wls wlsVar8 = d.d;
                    qje.W(btsVar3, wlsVar8, d3);
                    f530 o7 = an91.o(c530Var5, 4.0f, 0.0f, 0.0f, 0.0f, 14);
                    Object Q6 = btsVar3.Q();
                    if (Q6 == obj3) {
                        c530Var2 = c530Var5;
                        Q6 = new teb(20);
                        btsVar3.o0(Q6);
                    } else {
                        c530Var2 = c530Var5;
                    }
                    f530 a4 = fnq0.a(o7, (tls) Q6);
                    String str = k611Var.a;
                    String str2 = k611Var.f;
                    qgy.b(str, null, a4, AppColor$Palette.Text, 0L, 0L, null, 0L, 2, 0, 0, ety0Var2, null, btsVar3, 805309440, 0, 11762);
                    ib11 ib11Var2 = k611Var.e;
                    btsVar3.e0(-1130207440);
                    if (z) {
                        btsVar3.e0(541190506);
                        btsVar3.t(false);
                        i2 = 0;
                    } else {
                        btsVar3.e0(541226900);
                        boolean k3 = btsVar3.k(tlsVar3) | btsVar3.e(ib11Var2);
                        Object Q7 = btsVar3.Q();
                        if (k3 || Q7 == obj3) {
                            Q7 = new ej5(tlsVar3, ib11Var2, 2);
                            btsVar3.o0(Q7);
                        }
                        i2 = 0;
                        btsVar3.t(false);
                        slsVar3 = (sls) Q7;
                    }
                    c530 c530Var6 = c530Var2;
                    f530 o8 = an91.o(c530Var6, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                    sic a5 = qic.a(g43Var, so5Var2, btsVar3, i2);
                    int hashCode4 = Long.hashCode(btsVar3.T);
                    r1b0 o9 = btsVar3.o();
                    f530 d4 = b.d(btsVar3, o8);
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar4);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, wlsVar5, a5);
                    qje.W(btsVar3, wlsVar6, o9);
                    vfc.v(hashCode4, btsVar3, wlsVar7, btsVar3, tlsVar4);
                    qje.W(btsVar3, wlsVar8, d4);
                    ptb1.b(ib11Var2, true, null, slsVar3, true, null, null, null, null, null, btsVar3, 24624, 996);
                    jra1.d(ib11Var2.l, an91.o(c530Var6, 0.0f, 4.0f, 0.0f, 0.0f, 13), false, btsVar3, 48);
                    btsVar3.t(true);
                    btsVar3.t(false);
                    if (str2.length() > 0) {
                        btsVar3.e0(-1129570018);
                        f530 o10 = an91.o(c530Var6, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                        Object Q8 = btsVar3.Q();
                        if (Q8 == obj3) {
                            Q8 = new teb(20);
                            btsVar3.o0(Q8);
                        }
                        jeb1.f(str2, fnq0.a(o10, (tls) Q8), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 2, false, 0, 0, null, xya1.e(btsVar3).h.a, btsVar3, 805306752, 0, 15864);
                        btsVar3.t(false);
                    } else {
                        btsVar3.e0(-1129255461);
                        btsVar3.t(false);
                    }
                    btsVar3.t(true);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                sq5.d((tq5) obj6, this.b, (f530) obj5, (tls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 5:
                ((Integer) obj2).getClass();
                com.yandex.go.chargers.feedback.ui.b.a((CharSequence) obj6, this.b, (sls) obj5, (f530) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 6:
                el51 el51Var = (el51) obj6;
                YandexShapes yandexShapes = (YandexShapes) obj5;
                androidx.compose.runtime.internal.a aVar = (androidx.compose.runtime.internal.a) obj4;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (el51Var == null) {
                        el51Var = z ? qti.b : qti.a;
                    }
                    py91.e(el51Var, qti.c, yandexShapes, aVar, btsVar4, 48);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 7:
                ((Integer) obj2).getClass();
                csm.a(this.b, (DsButtonClose$Type) obj6, (sls) obj5, (f530) obj4, (fid) obj, vng.O(3073));
                return zy11Var;
            case 8:
                ((Integer) obj2).getClass();
                o3b1.a((sls) obj6, (f530) obj5, this.b, (wls) obj4, (fid) obj, vng.O(24577));
                return zy11Var;
            case 9:
                ((Integer) obj2).getClass();
                com.yandex.go.loyalty.impl.selector.ui.a.b((f530) obj6, this.b, (jxz) obj5, (tls) obj4, (fid) obj, vng.O(7));
                return zy11Var;
            case 10:
                ((Integer) obj2).getClass();
                com.yandex.go.navigator.main_screen.ui.a.c((f530) obj6, this.b, (x700) obj5, (tls) obj4, (fid) obj, vng.O(513));
                return zy11Var;
            case 11:
                ((Integer) obj2).getClass();
                jub1.c((uo9) obj6, (f530) obj5, this.b, (tls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 12:
                zx40 zx40Var = (zx40) obj6;
                imy0 imy0Var = (imy0) obj5;
                ehr0 ehr0Var = (ehr0) obj4;
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    t.a.a(this.b, zx40Var, null, imy0Var, ehr0Var, 0.0f, 0.0f, btsVar5, 100663296, 200);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 13:
                ((Integer) obj2).getClass();
                g1a1.c((String) obj6, this.b, (tls) obj5, (f530) obj4, (fid) obj, vng.O(385));
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point.a.f((nae) obj6, this.b, (sls) obj5, (sls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 15:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scenario_selector.a.a((qmm0) obj6, this.b, (sls) obj5, (androidx.compose.runtime.internal.a) obj4, (fid) obj, vng.O(3073));
                return zy11Var;
            case 16:
                ((Integer) obj2).getClass();
                c.c((xhr) obj6, (pjr) obj5, (ScootersBduiScreenType) obj4, this.b, (fid) obj, vng.O(1));
                return zy11Var;
            case 17:
                ((Integer) obj2).getClass();
                k4b1.k((String) obj6, (CharSequence) obj5, (CharSequence) obj4, this.b, (fid) obj, vng.O(1));
                return zy11Var;
            case 18:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.selector.a.b((jlq0) obj6, (f530) obj5, this.b, (tls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 19:
                ((Integer) obj2).getClass();
                c1z0.g((f530) obj6, this.b, (List) obj5, (tls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.communications.ticket.ui.a.a((f530) obj5, (x3z0) obj6, this.b, (tls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.masstransit.trains.search.b.d((nvi0) obj6, (CharSequence) obj5, this.b, (f530) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 22:
                ki31 ki31Var = (ki31) obj6;
                xfd xfdVar = (xfd) obj5;
                hnr0 hnr0Var = (hnr0) obj4;
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    com.yandex.go.taxi.summary.verticalsummary.ui.d.d(ki31Var, this.b, ((bgd) xfdVar).a, hnr0Var, btsVar6, 0);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 23:
                ((Integer) obj2).getClass();
                com.yandex.go.taxi.summary.verticalsummary.ui.d.d((ki31) obj6, this.b, (tls) obj5, (tpr) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            default:
                ((Integer) obj2).getClass();
                er41.b(this.b, (x9o) obj6, (sls) obj5, (sls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
        }
    }

    public /* synthetic */ r2z0(h711 h711Var, ety0 ety0Var, boolean z, tls tlsVar, int i) {
        this.a = i;
        this.c = h711Var;
        this.w = ety0Var;
        this.b = z;
        this.x = tlsVar;
    }

    public /* synthetic */ r2z0(Object obj, Object obj2, Object obj3, boolean z, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.b = z;
    }

    public /* synthetic */ r2z0(Object obj, Object obj2, boolean z, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.b = z;
        this.x = obj3;
    }

    public /* synthetic */ r2z0(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.w = obj2;
        this.x = obj3;
    }

    public /* synthetic */ r2z0(Object obj, boolean z, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = z;
        this.w = obj2;
        this.x = obj3;
    }

    public /* synthetic */ r2z0(boolean z, zx40 zx40Var, imy0 imy0Var, ehr0 ehr0Var) {
        this.a = 12;
        this.b = z;
        this.c = zx40Var;
        this.w = imy0Var;
        this.x = ehr0Var;
    }

    public /* synthetic */ r2z0(boolean z, Object obj, sls slsVar, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = obj;
        this.w = slsVar;
        this.x = obj2;
    }
}
