package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.pulse.metrics.o;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class io5 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ io5(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 8;
        Continuation continuation = null;
        kjn kjnVar = gq5.a;
        vci vciVar = vci.a;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    xv7.j(rvf.M(R.string.create_new_list_text, oq5Var), d.d(vciVar, 1.0f), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var, 48, 3120, 55288);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    xcs.b(rvf.M(R.string.auto_cache_dialog_title, oq5Var2), null, ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var2, 0, 0, 65530);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (!oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    oq5Var3.S();
                }
                break;
            case 3:
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    pd.g(0, 1, oq5Var4, null);
                } else {
                    oq5Var4.S();
                }
                break;
            case 4:
                hq5 hq5Var5 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    pd.b(new qzm[0], false, hld.b, oq5Var5, 0, 2);
                } else {
                    oq5Var5.S();
                }
                break;
            case 5:
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var6;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        break;
                    }
                }
                pm0.c(xp3.u(d.m(vciVar, 52), ugo.a(8)), hq5Var6, 0);
            case 6:
                hq5 hq5Var7 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var7 = (oq5) hq5Var7;
                if (oq5Var7.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    irf.n(new wya(new oza(""), new ko5()), null, oq5Var7, 0);
                } else {
                    oq5Var7.S();
                }
                break;
            case 7:
                hq5 hq5Var8 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var8 = (oq5) hq5Var8;
                if (oq5Var8.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Object K = oq5Var8.K();
                    if (K == kjnVar) {
                        K = new do5(7);
                        oq5Var8.k0(K);
                    }
                    wdp.R((Function0) K, oq5Var8, R.drawable.ic_like_active_32, 48);
                } else {
                    oq5Var8.S();
                }
                break;
            case 8:
                hq5 hq5Var9 = (hq5) obj;
                int intValue8 = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var9;
                if (oq5Var9.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Object K2 = oq5Var9.K();
                    if (K2 == kjnVar) {
                        K2 = new do5(8);
                        oq5Var9.k0(K2);
                    }
                    Function0 function0 = (Function0) K2;
                    Object K3 = oq5Var9.K();
                    if (K3 == kjnVar) {
                        K3 = new do5(9);
                        oq5Var9.k0(K3);
                    }
                    Function0 function02 = (Function0) K3;
                    Object K4 = oq5Var9.K();
                    if (K4 == kjnVar) {
                        K4 = new do5(10);
                        oq5Var9.k0(K4);
                    }
                    bkp.N(function0, function02, (Function0) K4, a.m(vciVar, 16), oq5Var9, 3510);
                } else {
                    oq5Var9.S();
                }
                break;
            case 9:
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var10;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        break;
                    }
                }
                pd.g(6, 0, hq5Var10, d.x(d.c(vciVar, 1.0f), null, 3));
            case 10:
                hq5 hq5Var11 = (hq5) obj;
                int intValue9 = ((Integer) obj2).intValue();
                oq5 oq5Var11 = (oq5) hq5Var11;
                if (oq5Var11.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    ug3.a(androidx.compose.foundation.a.b(xp3.u(d.e(d.r(vciVar, 188), 16), ugo.a(50)), d85.f, vnj.i), oq5Var11, 0);
                } else {
                    oq5Var11.S();
                }
                break;
            case 11:
                hq5 hq5Var12 = (hq5) obj;
                int intValue10 = ((Integer) obj2).intValue();
                oq5 oq5Var12 = (oq5) hq5Var12;
                if (oq5Var12.P(intValue10 & 1, (intValue10 & 3) != 2)) {
                    u1g.l(oq5Var12, d.e(vciVar, 24));
                } else {
                    oq5Var12.S();
                }
                break;
            case 12:
                hq5 hq5Var13 = (hq5) obj;
                int intValue11 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var13;
                if (oq5Var13.P(intValue11 & 1, (intValue11 & 3) != 2)) {
                    ug3.a(androidx.compose.foundation.a.b(xp3.u(vciVar, ugo.a(8)), d85.f, vnj.i), oq5Var13, 0);
                } else {
                    oq5Var13.S();
                }
                break;
            case 13:
                hq5 hq5Var14 = (hq5) obj;
                int intValue12 = ((Integer) obj2).intValue();
                oq5 oq5Var14 = (oq5) hq5Var14;
                if (oq5Var14.P(intValue12 & 1, (intValue12 & 3) != 2)) {
                    for (int i3 = 0; i3 < 3; i3++) {
                        tt0.j(0, oq5Var14);
                    }
                } else {
                    oq5Var14.S();
                }
                break;
            case 14:
                hq5 hq5Var15 = (hq5) obj;
                int intValue13 = ((Integer) obj2).intValue();
                oq5 oq5Var15 = (oq5) hq5Var15;
                if (oq5Var15.P(intValue13 & 1, (intValue13 & 3) != 2)) {
                    yci o = d.o(vciVar, 360, 450);
                    kfh d = ug3.d(b2c.b, false);
                    int i4 = oq5Var15.P;
                    androidx.compose.runtime.internal.a l = oq5Var15.l();
                    yci H = vnj.H(oq5Var15, o);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var15.d0();
                    if (oq5Var15.O) {
                        oq5Var15.k(grbVar);
                    } else {
                        oq5Var15.n0();
                    }
                    g0g.U(oq5Var15, d, wp5.f);
                    g0g.U(oq5Var15, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var15.O || !Intrinsics.d(oq5Var15.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var15, i4, kb5Var);
                    }
                    g0g.U(oq5Var15, H, wp5.d);
                    eud eudVar = new eud(0);
                    yci a = b.a.a(vciVar, b2c.f);
                    Object K5 = oq5Var15.K();
                    if (K5 == kjnVar) {
                        K5 = new do5(18);
                        oq5Var15.k0(K5);
                    }
                    Function0 function03 = (Function0) K5;
                    Object K6 = oq5Var15.K();
                    if (K6 == kjnVar) {
                        K6 = new do5(19);
                        oq5Var15.k0(K6);
                    }
                    Function0 function04 = (Function0) K6;
                    Object K7 = oq5Var15.K();
                    if (K7 == kjnVar) {
                        K7 = new do5(20);
                        oq5Var15.k0(K7);
                    }
                    tt0.l("ASTROWORLD", eudVar, function03, function04, (Function0) K7, a, oq5Var15, 28038);
                    oq5Var15.p(true);
                } else {
                    oq5Var15.S();
                }
                break;
            case 15:
                hq5 hq5Var16 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var16 = (oq5) hq5Var16;
                    if (oq5Var16.z()) {
                        oq5Var16.S();
                        break;
                    }
                }
                u1g.l(hq5Var16, d.e(vciVar, 16));
            case 16:
                hq5 hq5Var17 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var17 = (oq5) hq5Var17;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        break;
                    }
                }
                bg3.a(null, null, false, q6k.b, hq5Var17, 3072, 7);
            case 17:
                hq5 hq5Var18 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var18 = (oq5) hq5Var18;
                    if (oq5Var18.z()) {
                        oq5Var18.S();
                        break;
                    }
                }
                xcs.b(rvf.M(R.string.changes_will_not_be_saved, hq5Var18), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, hq5Var18, 0, 0, 131070);
            case 18:
                hq5 hq5Var19 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var19 = (oq5) hq5Var19;
                    if (oq5Var19.z()) {
                        oq5Var19.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_queue_24, 0, hq5Var19), rvf.M(R.string.player_open_playback_queue_description, hq5Var19), androidx.compose.ui.platform.a.a(vciVar, "open_queue_button"), ((dq0) ((oq5) hq5Var19).j(eq0.a)).a.c, hq5Var19, 384, 0);
            case 19:
                hq5 hq5Var20 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var20 = (oq5) hq5Var20;
                    if (oq5Var20.z()) {
                        oq5Var20.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_arrow_big_down_24, 0, hq5Var20), rvf.M(R.string.btn_close, hq5Var20), null, ((dq0) ((oq5) hq5Var20).j(eq0.a)).a.c, hq5Var20, 0, 4);
            case 20:
                hq5 hq5Var21 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var21 = (oq5) hq5Var21;
                    if (oq5Var21.z()) {
                        oq5Var21.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_close_mid_24, 0, hq5Var21), rvf.M(R.string.close_content_description, hq5Var21), null, ((dq0) ((oq5) hq5Var21).j(eq0.a)).a.a, hq5Var21, 0, 4);
            case 21:
                hq5 hq5Var22 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var22 = (oq5) hq5Var22;
                    if (oq5Var22.z()) {
                        oq5Var22.S();
                        break;
                    }
                }
                s0d s0dVar = new s0d();
                d1d d1dVar = new d1d(hd6.b, false, true);
                oq5 oq5Var23 = (oq5) hq5Var22;
                Object K8 = oq5Var23.K();
                if (K8 == kjnVar) {
                    K8 = new do5(21);
                    oq5Var23.k0(K8);
                }
                bkp.P(s0dVar, d1dVar, (Function0) K8, null, oq5Var23, 384, 8);
            case 22:
                hq5 hq5Var23 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var24 = (oq5) hq5Var23;
                    if (oq5Var24.z()) {
                        oq5Var24.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_search_24, 0, hq5Var23), rvf.M(R.string.search, hq5Var23), d.m(a.o(vciVar, 12, 0.0f, 2), 24), ((dq0) ((oq5) hq5Var23).j(eq0.a)).a.a, hq5Var23, 384, 0);
            case 23:
                hq5 hq5Var24 = (hq5) obj;
                int intValue14 = ((Integer) obj2).intValue();
                oq5 oq5Var25 = (oq5) hq5Var24;
                if (oq5Var25.P(intValue14 & 1, (intValue14 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_arrow_big_down_24, 0, oq5Var25), rvf.M(R.string.btn_close, oq5Var25), null, ((dq0) oq5Var25.j(eq0.a)).a.c, oq5Var25, 0, 4);
                } else {
                    oq5Var25.S();
                }
                break;
            case 24:
                hq5 hq5Var25 = (hq5) obj;
                int intValue15 = ((Integer) obj2).intValue();
                oq5 oq5Var26 = (oq5) hq5Var25;
                if (oq5Var26.P(intValue15 & 1, (intValue15 & 3) != 2)) {
                    bdn bdnVar = new bdn("Now playing", "TestQueue with very very very very very long name", new q84(true, new d74(R.drawable.ic_station_2_24)), true, null);
                    evo evoVar = evo.a;
                    crh crhVar = crh.c;
                    crhVar.getClass();
                    pv9 pv9Var = new pv9(crhVar);
                    v84 v84Var = v84.a;
                    Object K9 = oq5Var26.K();
                    int i5 = 22;
                    if (K9 == kjnVar) {
                        K9 = new do5(22);
                        oq5Var26.k0(K9);
                    }
                    Function0 function05 = (Function0) K9;
                    Object K10 = oq5Var26.K();
                    int i6 = 23;
                    if (K10 == kjnVar) {
                        K10 = new do5(23);
                        oq5Var26.k0(K10);
                    }
                    Function0 function06 = (Function0) K10;
                    Object K11 = oq5Var26.K();
                    if (K11 == kjnVar) {
                        K11 = new z35(i5);
                        oq5Var26.k0(K11);
                    }
                    Function1 function1 = (Function1) K11;
                    Object K12 = oq5Var26.K();
                    if (K12 == kjnVar) {
                        K12 = new z35(i6);
                        oq5Var26.k0(K12);
                    }
                    weo.e(bdnVar, evoVar, pv9Var, v84Var, function05, function06, function1, (Function1) K12, vci.a, oq5Var26, 115043376, 0);
                } else {
                    oq5Var26.S();
                }
                break;
            case 25:
                hq5 hq5Var26 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var27 = (oq5) hq5Var26;
                    if (oq5Var27.z()) {
                        oq5Var27.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_share_new_24, 0, hq5Var26), rvf.M(R.string.menu_element_share, hq5Var26), null, ((dq0) ((oq5) hq5Var26).j(eq0.a)).a.c, hq5Var26, 0, 4);
            case 26:
                hq5 hq5Var27 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var28 = (oq5) hq5Var27;
                    if (oq5Var28.z()) {
                        oq5Var28.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_more_24, 0, hq5Var27), rvf.M(R.string.overflow_menu_content_description, hq5Var27), null, ((dq0) ((oq5) hq5Var27).j(eq0.a)).a.c, hq5Var27, 0, 4);
            case 27:
                hq5 hq5Var28 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var29 = (oq5) hq5Var28;
                    if (oq5Var29.z()) {
                        oq5Var29.S();
                        break;
                    }
                }
                xcs.b(rvf.M(R.string.restore_purchases_title, hq5Var28), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.g(), hq5Var28, 0, 0, 65534);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                hq5 hq5Var29 = (hq5) obj;
                int intValue16 = ((Integer) obj2).intValue();
                oq5 oq5Var30 = (oq5) hq5Var29;
                if (oq5Var30.P(intValue16 & 1, (intValue16 & 3) != 2)) {
                    ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var30, 0);
                    int i7 = oq5Var30.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var30.l();
                    yci H2 = vnj.H(oq5Var30, vciVar);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var30.d0();
                    if (oq5Var30.O) {
                        oq5Var30.k(grbVar2);
                    } else {
                        oq5Var30.n0();
                    }
                    g0g.U(oq5Var30, a2, wp5.f);
                    g0g.U(oq5Var30, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var30.O || !Intrinsics.d(oq5Var30.K(), Integer.valueOf(i7))) {
                        ouj.x(i7, oq5Var30, i7, kb5Var2);
                    }
                    g0g.U(oq5Var30, H2, wp5.d);
                    Object K13 = oq5Var30.K();
                    if (K13 == kjnVar) {
                        List list = jhe.a;
                        K13 = new pgt("В стиле", list, (ahe) CollectionsKt.Q(list));
                        oq5Var30.k0(K13);
                    }
                    pgt pgtVar = (pgt) K13;
                    Object K14 = oq5Var30.K();
                    if (K14 == kjnVar) {
                        K14 = szf.g0(new cgt("В стиле", true));
                        oq5Var30.k0(K14);
                    }
                    aqi aqiVar = (aqi) K14;
                    Unit unit = Unit.a;
                    Object K15 = oq5Var30.K();
                    if (K15 == kjnVar) {
                        K15 = new vv4(pgtVar, aqiVar, continuation, i2);
                        oq5Var30.k0(K15);
                    }
                    gld.w(oq5Var30, unit, (Function2) K15);
                    jhe.a(new mhe(new cgt("В стиле", true)), null, oq5Var30, 0);
                    oq5Var30.p(true);
                } else {
                    oq5Var30.S();
                }
                break;
            default:
                hq5 hq5Var30 = (hq5) obj;
                int intValue17 = ((Integer) obj2).intValue();
                oq5 oq5Var31 = (oq5) hq5Var30;
                if (oq5Var31.P(intValue17 & 1, (intValue17 & 3) != 2)) {
                    q5g.k(null, null, 0L, 0L, null, 0.0f, leu.c, oq5Var31, ScreenMirroringConfig.Video.BITRATE_1_5MB, 63);
                } else {
                    oq5Var31.S();
                }
                break;
        }
        return Unit.a;
    }
}
