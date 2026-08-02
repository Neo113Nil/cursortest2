package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class lo5 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ lo5(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        kjn kjnVar = gq5.a;
        vci vciVar = vci.a;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_search_24, 0, oq5Var), rvf.M(R.string.search, oq5Var), a.a(androidx.compose.foundation.layout.a.o(vciVar, 12, 0.0f, 2), "landing_top_bar_search_button"), ((dq0) oq5Var.j(eq0.a)).a.a, oq5Var, 384, 0);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    k2s k2sVar = new k2s(0, new j2s(u75.h(new k0s("1", "Аудиокниги"), new k0s("2", "Подкасты")), ydr.a(0), ydr.a(c5b.a), false));
                    fvf a = hvf.a(0, 0, oq5Var2, 0, 3);
                    Object K = oq5Var2.K();
                    if (K == kjnVar) {
                        K = new do5(25);
                        oq5Var2.k0(K);
                    }
                    Function0 function0 = (Function0) K;
                    Object K2 = oq5Var2.K();
                    if (K2 == kjnVar) {
                        K2 = new z35(25);
                        oq5Var2.k0(K2);
                    }
                    Function1 function1 = (Function1) K2;
                    Object K3 = oq5Var2.K();
                    if (K3 == kjnVar) {
                        K3 = new do5(26);
                        oq5Var2.k0(K3);
                    }
                    xv7.o("Подкасты и книги", k2sVar, true, a, function0, function1, (Function0) K3, null, null, oq5Var2, 1794438, 384);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    k2s k2sVar2 = new k2s(0, new j2s(u75.h(new k0s("1", "Аудиокниги"), new k0s("2", "Подкасты")), ydr.a(0), ydr.a(c5b.a), false));
                    fvf a2 = hvf.a(0, 0, oq5Var3, 0, 3);
                    Object K4 = oq5Var3.K();
                    if (K4 == kjnVar) {
                        K4 = new do5(24);
                        oq5Var3.k0(K4);
                    }
                    Function0 function02 = (Function0) K4;
                    Object K5 = oq5Var3.K();
                    if (K5 == kjnVar) {
                        K5 = new z35(24);
                        oq5Var3.k0(K5);
                    }
                    xv7.o("Подкасты и книги", k2sVar2, false, a2, function02, (Function1) K5, null, null, null, oq5Var3, 1794438, 384);
                } else {
                    oq5Var3.S();
                }
                break;
            case 3:
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    yci a3 = a.a(d.c(vciVar, 1.0f), "login_screen");
                    kfh d = ug3.d(b2c.f, false);
                    int i2 = oq5Var4.P;
                    androidx.compose.runtime.internal.a l = oq5Var4.l();
                    yci H = vnj.H(oq5Var4, a3);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var4.d0();
                    if (oq5Var4.O) {
                        oq5Var4.k(grbVar);
                    } else {
                        oq5Var4.n0();
                    }
                    g0g.U(oq5Var4, d, wp5.f);
                    g0g.U(oq5Var4, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var4, i2, kb5Var);
                    }
                    g0g.U(oq5Var4, H, wp5.d);
                    pd.g(0, 1, oq5Var4, null);
                    oq5Var4.p(true);
                } else {
                    oq5Var4.S();
                }
                break;
            case 4:
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var5;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                u1g.l(hq5Var5, d.e(vciVar, g6h.a(hq5Var5)));
            case 5:
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var6;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        break;
                    }
                }
                fj6.c(null, hq5Var6, 0);
            case 6:
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var7;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        break;
                    }
                }
                bg3.a(d.c(vciVar, 1.0f), null, false, ksw.g, hq5Var7, 3078, 6);
            case 7:
                hq5 hq5Var8 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var8 = (oq5) hq5Var8;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        break;
                    }
                }
                u1g.l(hq5Var8, d.e(vciVar, g6h.a(hq5Var8)));
            case 8:
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var9;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        break;
                    }
                }
                fj6.c(null, hq5Var9, 0);
            case 9:
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var10;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                    }
                }
                break;
            case 10:
                hq5 hq5Var11 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var11 = (oq5) hq5Var11;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        break;
                    }
                }
                p6g.c(0, 1, hq5Var11, null);
            case 11:
                hq5 hq5Var12 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var12 = (oq5) hq5Var12;
                if (oq5Var12.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    yci r = d.r(vciVar, 300);
                    ta5 a4 = sa5.a(qx0.c, b2c.n, oq5Var12, 0);
                    int i3 = oq5Var12.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var12.l();
                    yci H2 = vnj.H(oq5Var12, r);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var12.d0();
                    if (oq5Var12.O) {
                        oq5Var12.k(grbVar2);
                    } else {
                        oq5Var12.n0();
                    }
                    g0g.U(oq5Var12, a4, wp5.f);
                    g0g.U(oq5Var12, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var12.O || !Intrinsics.d(oq5Var12.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var12, i3, kb5Var2);
                    }
                    g0g.U(oq5Var12, H2, wp5.d);
                    Object K6 = oq5Var12.K();
                    if (K6 == kjnVar) {
                        K6 = szf.g0(Boolean.TRUE);
                        oq5Var12.k0(K6);
                    }
                    aqi aqiVar = (aqi) K6;
                    Object K7 = oq5Var12.K();
                    if (K7 == kjnVar) {
                        K7 = new eoi();
                        oq5Var12.k0(K7);
                    }
                    etn.l(es5.n.a(xof.b), ild.C(-1281671359, new m32(27, (eoi) K7, aqiVar), oq5Var12), oq5Var12, 56);
                    oq5Var12.p(true);
                } else {
                    oq5Var12.S();
                }
                break;
            case 12:
                hq5 hq5Var13 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var13;
                if (oq5Var13.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Object K8 = oq5Var13.K();
                    if (K8 == kjnVar) {
                        K8 = new do5(27);
                        oq5Var13.k0(K8);
                    }
                    doi.a((Function0) K8, null, oq5Var13, 6, 2);
                } else {
                    oq5Var13.S();
                }
                break;
            case 13:
                hq5 hq5Var14 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var14 = (oq5) hq5Var14;
                if (oq5Var14.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    ngg.f(0, oq5Var14);
                } else {
                    oq5Var14.S();
                }
                break;
            case 14:
                hq5 hq5Var15 = (hq5) obj;
                int intValue8 = ((Integer) obj2).intValue();
                oq5 oq5Var15 = (oq5) hq5Var15;
                if (oq5Var15.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    ug3.a(vciVar, oq5Var15, 6);
                } else {
                    oq5Var15.S();
                }
                break;
            case 15:
                hq5 hq5Var16 = (hq5) obj;
                int intValue9 = ((Integer) obj2).intValue();
                oq5 oq5Var16 = (oq5) hq5Var16;
                if (oq5Var16.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    j66.v(new h5j(new qgt(u75.h(mvt.w(Integer.valueOf((int) d85.g), t75.c(ogp.l("Frank Sinatra, Merry Christmas")), 27), mvt.w(null, u75.h(ogp.l("Leo Da'Vinci"), ogp.l("Joconda"), ogp.l("Anaconda")), 31)))), null, oq5Var16, 0);
                } else {
                    oq5Var16.S();
                }
                break;
            case 16:
                hq5 hq5Var17 = (hq5) obj;
                int intValue10 = ((Integer) obj2).intValue();
                oq5 oq5Var17 = (oq5) hq5Var17;
                if (oq5Var17.P(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Object K9 = oq5Var17.K();
                    if (K9 == kjnVar) {
                        K9 = new dgt(true);
                        oq5Var17.k0(K9);
                    }
                    dgt dgtVar = (dgt) K9;
                    dgtVar.getClass();
                    j66.v(new h5j(dgtVar), null, oq5Var17, 0);
                } else {
                    oq5Var17.S();
                }
                break;
            case 17:
                hq5 hq5Var18 = (hq5) obj;
                int intValue11 = ((Integer) obj2).intValue();
                oq5 oq5Var18 = (oq5) hq5Var18;
                if (oq5Var18.P(intValue11 & 1, (intValue11 & 3) != 2)) {
                    pm0.a(null, nt0.m, oq5Var18, 48, 1);
                } else {
                    oq5Var18.S();
                }
                break;
            case 18:
                hq5 hq5Var19 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var19 = (oq5) hq5Var19;
                    if (oq5Var19.z()) {
                        oq5Var19.S();
                        break;
                    }
                }
                ngg.f(0, hq5Var19);
            case 19:
                hq5 hq5Var20 = (hq5) obj;
                int intValue12 = ((Integer) obj2).intValue();
                oq5 oq5Var20 = (oq5) hq5Var20;
                if (oq5Var20.P(intValue12 & 1, (intValue12 & 3) != 2)) {
                    u1g.l(oq5Var20, d.r(vciVar, 16));
                } else {
                    oq5Var20.S();
                }
                break;
            case 20:
                hq5 hq5Var21 = (hq5) obj;
                int intValue13 = ((Integer) obj2).intValue();
                oq5 oq5Var21 = (oq5) hq5Var21;
                if (oq5Var21.P(intValue13 & 1, (intValue13 & 3) != 2)) {
                    dej dejVar = new dej("Daily Easy English Lesson Podcast - to DO someone", true, true, jzb.c, true, new g0t("Сегодня", true), true);
                    rba rbaVar = rba.c;
                    lzs lzsVar = lzs.a;
                    frs frsVar = frs.d;
                    bdj bdjVar = new bdj("Left 25 minutes", 1500L, 0.7f);
                    Object K10 = oq5Var21.K();
                    if (K10 == kjnVar) {
                        K10 = new do5(28);
                        oq5Var21.k0(K10);
                    }
                    Function0 function03 = (Function0) K10;
                    Object K11 = oq5Var21.K();
                    if (K11 == kjnVar) {
                        K11 = new do5(29);
                        oq5Var21.k0(K11);
                    }
                    asq.j(dejVar, rbaVar, lzsVar, frsVar, bdjVar, false, function03, null, (Function0) K11, null, oq5Var21, 115019184, RemoteCameraConfig.Mic.BUFFER_SIZE);
                } else {
                    oq5Var21.S();
                }
                break;
            case 21:
                hq5 hq5Var22 = (hq5) obj;
                int intValue14 = ((Integer) obj2).intValue();
                oq5 oq5Var22 = (oq5) hq5Var22;
                if (oq5Var22.P(intValue14 & 1, (intValue14 & 3) != 2)) {
                    swf.e(0, 0, oq5Var22, androidx.compose.foundation.layout.a.m(xp3.u(vciVar, ugo.a(6)), 10));
                } else {
                    oq5Var22.S();
                }
                break;
            case 22:
                hq5 hq5Var23 = (hq5) obj;
                int intValue15 = ((Integer) obj2).intValue();
                oq5 oq5Var23 = (oq5) hq5Var23;
                if (oq5Var23.P(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Object K12 = oq5Var23.K();
                    if (K12 == kjnVar) {
                        List h = u75.h(aaw.m("Bohemian rhapsody"), aaw.m("Bohemian rhapsody2"), aaw.m("Bohemian rhapsody3"));
                        ArrayList arrayList = new ArrayList(v75.o(h, 10));
                        Iterator it = h.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new jo6((po6) it.next(), wyf.E("1")));
                        }
                        eul eulVar = new eul("", "", "Премьера", null, null);
                        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((jo6) it2.next()).a);
                        }
                        K12 = new rgt(eulVar, arrayList, true, "https://avatars.yandex.net/get-music-user-playlist/27701/r5ldfjP1rJoson/m1000x1000?1641982016228", new usj("Это заголовок блока а не плейлиста оатмолтмолав млова молва молваы молыва мтло", "Открываем вам главные новинки вытмалвмолвыам валом ова мвоа молав тмлова молыва мловаы ", arrayList2));
                        oq5Var23.k0(K12);
                    }
                    rgt rgtVar = (rgt) K12;
                    o2g.g(rgtVar.e, new nsj(rgtVar), qee.j, ild.C(-1246395255, new qo5(rgtVar, false ? 1 : 0), oq5Var23), null, false, null, oq5Var23, 3072, 112);
                    o2g.h(6, 6, oq5Var23, null, true, false);
                } else {
                    oq5Var23.S();
                }
                break;
            case 23:
                hq5 hq5Var24 = (hq5) obj;
                int intValue16 = ((Integer) obj2).intValue();
                oq5 oq5Var24 = (oq5) hq5Var24;
                if (oq5Var24.P(intValue16 & 1, (intValue16 & 3) != 2)) {
                    ta5 a5 = sa5.a(qx0.c, b2c.n, oq5Var24, 0);
                    int i4 = oq5Var24.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var24.l();
                    yci H3 = vnj.H(oq5Var24, vciVar);
                    xp5.T.getClass();
                    grb grbVar3 = wp5.b;
                    oq5Var24.d0();
                    if (oq5Var24.O) {
                        oq5Var24.k(grbVar3);
                    } else {
                        oq5Var24.n0();
                    }
                    g0g.U(oq5Var24, a5, wp5.f);
                    g0g.U(oq5Var24, l3, wp5.e);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var24.O || !Intrinsics.d(oq5Var24.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var24, i4, kb5Var3);
                    }
                    g0g.U(oq5Var24, H3, wp5.d);
                    pm0.a(null, bg3.d, oq5Var24, 48, 1);
                    oq5Var24.p(true);
                } else {
                    oq5Var24.S();
                }
                break;
            case 24:
                hq5 hq5Var25 = (hq5) obj;
                int intValue17 = ((Integer) obj2).intValue();
                oq5 oq5Var25 = (oq5) hq5Var25;
                if (oq5Var25.P(intValue17 & 1, (intValue17 & 3) != 2)) {
                    pd.g(0, 1, oq5Var25, null);
                } else {
                    oq5Var25.S();
                }
                break;
            case 25:
                hq5 hq5Var26 = (hq5) obj;
                int intValue18 = ((Integer) obj2).intValue();
                oq5 oq5Var26 = (oq5) hq5Var26;
                if (oq5Var26.P(intValue18 & 1, (intValue18 & 3) != 2)) {
                    pd.b(new qzm[0], false, sk3.c, oq5Var26, 0, 2);
                } else {
                    oq5Var26.S();
                }
                break;
            case 26:
                hq5 hq5Var27 = (hq5) obj;
                int intValue19 = ((Integer) obj2).intValue();
                oq5 oq5Var27 = (oq5) hq5Var27;
                if (oq5Var27.P(intValue19 & 1, (intValue19 & 3) != 2)) {
                    gut.b(0, oq5Var27);
                } else {
                    oq5Var27.S();
                }
                break;
            case 27:
                hq5 hq5Var28 = (hq5) obj;
                int intValue20 = ((Integer) obj2).intValue();
                oq5 oq5Var28 = (oq5) hq5Var28;
                if (oq5Var28.P(intValue20 & 1, (intValue20 & 3) != 2)) {
                    pd.b(new qzm[0], true, xp3.c, oq5Var28, 432, 0);
                } else {
                    oq5Var28.S();
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                hq5 hq5Var29 = (hq5) obj;
                int intValue21 = ((Integer) obj2).intValue();
                oq5 oq5Var29 = (oq5) hq5Var29;
                if (oq5Var29.P(intValue21 & 1, (intValue21 & 3) != 2)) {
                    iz2 iz2Var = b2c.f;
                    yci c = d.c(vciVar, 1.0f);
                    kfh d2 = ug3.d(iz2Var, false);
                    int i5 = oq5Var29.P;
                    androidx.compose.runtime.internal.a l4 = oq5Var29.l();
                    yci H4 = vnj.H(oq5Var29, c);
                    xp5.T.getClass();
                    grb grbVar4 = wp5.b;
                    oq5Var29.d0();
                    if (oq5Var29.O) {
                        oq5Var29.k(grbVar4);
                    } else {
                        oq5Var29.n0();
                    }
                    g0g.U(oq5Var29, d2, wp5.f);
                    g0g.U(oq5Var29, l4, wp5.e);
                    kb5 kb5Var4 = wp5.g;
                    if (oq5Var29.O || !Intrinsics.d(oq5Var29.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var29, i5, kb5Var4);
                    }
                    g0g.U(oq5Var29, H4, wp5.d);
                    pd.g(0, 1, oq5Var29, null);
                    oq5Var29.p(true);
                } else {
                    oq5Var29.S();
                }
                break;
            default:
                hq5 hq5Var30 = (hq5) obj;
                int intValue22 = ((Integer) obj2).intValue();
                oq5 oq5Var30 = (oq5) hq5Var30;
                if (oq5Var30.P(intValue22 & 1, (intValue22 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_sort_24, 0, oq5Var30), rvf.M(R.string.sort, oq5Var30), null, 0L, oq5Var30, 0, 12);
                } else {
                    oq5Var30.S();
                }
                break;
        }
        return Unit.a;
    }
}
