package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class zo5 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ zo5(int i) {
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
                    gae.b(new w85(d85.h), null, d.m(vciVar, 16), 0L, oq5Var, 432, 8);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    avf.j(new ygs("Placeholder"), null, 0, null, null, null, nt0.q, null, null, oq5Var2, ScreenMirroringConfig.Video.BITRATE_1_5MB, 446);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    avf.j(new ygs("Albums"), null, 0, null, null, null, null, null, null, oq5Var3, 0, 510);
                } else {
                    oq5Var3.S();
                }
                break;
            case 3:
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    yci r = d.r(vciVar, 180);
                    kfh d = ug3.d(b2c.b, false);
                    int i2 = oq5Var4.P;
                    a l = oq5Var4.l();
                    yci H = vnj.H(oq5Var4, r);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var4.d0();
                    if (oq5Var4.O) {
                        oq5Var4.k(grbVar);
                    } else {
                        oq5Var4.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(oq5Var4, d, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(oq5Var4, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var4, i2, kb5Var3);
                    }
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var4, H, kb5Var4);
                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var4, 0);
                    int i3 = oq5Var4.P;
                    a l2 = oq5Var4.l();
                    yci H2 = vnj.H(oq5Var4, vciVar);
                    oq5Var4.d0();
                    if (oq5Var4.O) {
                        oq5Var4.k(grbVar);
                    } else {
                        oq5Var4.n0();
                    }
                    g0g.U(oq5Var4, a, kb5Var);
                    g0g.U(oq5Var4, l2, kb5Var2);
                    if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var4, i3, kb5Var3);
                    }
                    g0g.U(oq5Var4, H2, kb5Var4);
                    avf.j(new zgs(-1, "Playlists", null, u75.h("James Blake", "Foals"), c5b.a), null, 0, null, null, null, null, null, null, oq5Var4, 0, 510);
                    avf.j(new ygs("Downloads"), null, 0, null, null, null, null, null, null, oq5Var4, 0, 510);
                    oq5Var4.p(true);
                    oq5Var4.p(true);
                } else {
                    oq5Var4.S();
                }
                break;
            case 4:
                hq5 hq5Var5 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (!oq5Var5.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    oq5Var5.S();
                }
                break;
            case 5:
                hq5 hq5Var6 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var6;
                if (oq5Var6.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    avf.j(new zgs(-1, "Downloads", "26 minutes", ((zgs) uwf.q().get(0)).c, ((zgs) uwf.q().get(0)).d), null, 0, null, null, null, null, null, null, oq5Var6, 0, 510);
                } else {
                    oq5Var6.S();
                }
                break;
            case 6:
                hq5 hq5Var7 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var7 = (oq5) hq5Var7;
                if (oq5Var7.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    avf.j(new zgs(-1, "Playlists", null, ((zgs) uwf.q().get(1)).c, ((zgs) uwf.q().get(1)).d), null, 0, null, null, null, null, null, null, oq5Var7, 0, 510);
                } else {
                    oq5Var7.S();
                }
                break;
            case 7:
                hq5 hq5Var8 = (hq5) obj;
                int intValue8 = ((Integer) obj2).intValue();
                oq5 oq5Var8 = (oq5) hq5Var8;
                if (oq5Var8.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    avf.j(new zgs(-1, "Artists", null, ((zgs) uwf.q().get(2)).c, ((zgs) uwf.q().get(2)).d), null, 0, null, null, null, null, null, null, oq5Var8, 0, 510);
                } else {
                    oq5Var8.S();
                }
                break;
            case 8:
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var9;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        break;
                    }
                }
                ivf.l(true, d.d(vciVar, 0.33f), null, hq5Var9, 54, 4);
            case 9:
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var10;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        break;
                    }
                }
                ivf.l(true, d.d(vciVar, 0.25f), null, hq5Var10, 54, 4);
            case 10:
                hq5 hq5Var11 = (hq5) obj;
                int intValue9 = ((Integer) obj2).intValue();
                oq5 oq5Var11 = (oq5) hq5Var11;
                if (oq5Var11.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_arrow_big_down_24, 0, oq5Var11), rvf.M(R.string.go_back, oq5Var11), null, ((dq0) oq5Var11.j(eq0.a)).b.a, oq5Var11, 0, 4);
                } else {
                    oq5Var11.S();
                }
                break;
            case 11:
                hq5 hq5Var12 = (hq5) obj;
                int intValue10 = ((Integer) obj2).intValue();
                oq5 oq5Var12 = (oq5) hq5Var12;
                if (oq5Var12.P(intValue10 & 1, (intValue10 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_share_new_24, 0, oq5Var12), rvf.M(R.string.menu_element_share, oq5Var12), null, ((dq0) oq5Var12.j(eq0.a)).a.c, oq5Var12, 0, 4);
                } else {
                    oq5Var12.S();
                }
                break;
            case 12:
                hq5 hq5Var13 = (hq5) obj;
                int intValue11 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var13;
                if (oq5Var13.P(intValue11 & 1, (intValue11 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_more_24, 0, oq5Var13), rvf.M(R.string.overflow_menu_content_description, oq5Var13), null, ((dq0) oq5Var13.j(eq0.a)).a.c, oq5Var13, 0, 4);
                } else {
                    oq5Var13.S();
                }
                break;
            case 13:
                hq5 hq5Var14 = (hq5) obj;
                int intValue12 = ((Integer) obj2).intValue();
                oq5 oq5Var14 = (oq5) hq5Var14;
                if (oq5Var14.P(intValue12 & 1, (intValue12 & 3) != 2)) {
                    xxk xxkVar = orm.a;
                    Object K = oq5Var14.K();
                    if (K == kjnVar) {
                        K = wg.k;
                        oq5Var14.k0(K);
                    }
                    Function0 function0 = (Function0) K;
                    Object K2 = oq5Var14.K();
                    if (K2 == kjnVar) {
                        K2 = new to5(10);
                        oq5Var14.k0(K2);
                    }
                    Function0 function02 = (Function0) K2;
                    Object K3 = oq5Var14.K();
                    if (K3 == kjnVar) {
                        K3 = new to5(11);
                        oq5Var14.k0(K3);
                    }
                    Function0 function03 = (Function0) K3;
                    Object K4 = oq5Var14.K();
                    if (K4 == kjnVar) {
                        K4 = new to5(12);
                        oq5Var14.k0(K4);
                    }
                    Function0 function04 = (Function0) K4;
                    Object K5 = oq5Var14.K();
                    if (K5 == kjnVar) {
                        K5 = new to5(13);
                        oq5Var14.k0(K5);
                    }
                    zdg.k(vci.a, xxkVar, null, null, function0, function02, null, function03, null, function04, (Function0) K5, null, oq5Var14, 818113974, 6, 2368);
                } else {
                    oq5Var14.S();
                }
                break;
            case 14:
                hq5 hq5Var15 = (hq5) obj;
                int intValue13 = ((Integer) obj2).intValue();
                oq5 oq5Var15 = (oq5) hq5Var15;
                if (oq5Var15.P(intValue13 & 1, (intValue13 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_sort_24, 0, oq5Var15), rvf.M(R.string.sort, oq5Var15), androidx.compose.ui.platform.a.a(d.m(vciVar, 24), "track_sorting"), ((dq0) oq5Var15.j(eq0.a)).a.a, oq5Var15, 384, 0);
                } else {
                    oq5Var15.S();
                }
                break;
            case 15:
                hq5 hq5Var16 = (hq5) obj;
                int intValue14 = ((Integer) obj2).intValue();
                oq5 oq5Var16 = (oq5) hq5Var16;
                if (oq5Var16.P(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Object K6 = oq5Var16.K();
                    if (K6 == kjnVar) {
                        K6 = new to5(14);
                        oq5Var16.k0(K6);
                    }
                    qgg.q("13 episodes", "Oldest first", (Function0) K6, null, oq5Var16, 438);
                } else {
                    oq5Var16.S();
                }
                break;
            case 16:
                hq5 hq5Var17 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var17 = (oq5) hq5Var17;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                    }
                }
                break;
            case 17:
                hq5 hq5Var18 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var18 = (oq5) hq5Var18;
                    if (oq5Var18.z()) {
                        oq5Var18.S();
                        break;
                    }
                }
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                xcs.b("Заголовок экрана", vci.a, 0L, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, nu0.d(), hq5Var18, 54, 3120, 55292);
            case 18:
                hq5 hq5Var19 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var19 = (oq5) hq5Var19;
                    if (oq5Var19.z()) {
                        oq5Var19.S();
                        break;
                    }
                }
                gae.a(up6.u(), null, 0L, hq5Var19, 48, 12);
            case 19:
                hq5 hq5Var20 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var20 = (oq5) hq5Var20;
                    if (oq5Var20.z()) {
                        oq5Var20.S();
                        break;
                    }
                }
                oq5 oq5Var21 = (oq5) hq5Var20;
                Object K7 = oq5Var21.K();
                if (K7 == kjnVar) {
                    K7 = new to5(15);
                    oq5Var21.k0(K7);
                }
                aae.a((Function0) K7, null, false, lg3.l, oq5Var21, 24582, 14);
            case 20:
                hq5 hq5Var21 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var22 = (oq5) hq5Var21;
                    if (oq5Var22.z()) {
                        oq5Var22.S();
                        break;
                    }
                }
                fvf a2 = hvf.a(0, 0, hq5Var21, 0, 3);
                float f = kct.a;
                a2.getClass();
                oq5 oq5Var23 = (oq5) hq5Var21;
                boolean f2 = oq5Var23.f(a2);
                Object K8 = oq5Var23.K();
                if (f2 || K8 == kjnVar) {
                    K8 = new mct(new lct(a2));
                    oq5Var23.k0(K8);
                }
                kct.c((mct) K8, lg3.i, lg3.j, lg3.k, mp0.a(hq5Var21), null, lg3.m, 0L, hq5Var21, 1576368, 160);
            case 21:
                hq5 hq5Var22 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var24 = (oq5) hq5Var22;
                    if (oq5Var24.z()) {
                        oq5Var24.S();
                        break;
                    }
                }
                h6g h6gVar3 = nu0.a;
                h6g h6gVar4 = h6g.c;
                xcs.b("Заголовок экрана", null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.g(), hq5Var22, 6, 3120, 55294);
            case 22:
                hq5 hq5Var23 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var25 = (oq5) hq5Var23;
                    if (oq5Var25.z()) {
                        oq5Var25.S();
                        break;
                    }
                }
                gae.a(up6.u(), null, 0L, hq5Var23, 48, 12);
            case 23:
                hq5 hq5Var24 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var26 = (oq5) hq5Var24;
                    if (oq5Var26.z()) {
                        oq5Var26.S();
                        break;
                    }
                }
                oq5 oq5Var27 = (oq5) hq5Var24;
                Object K9 = oq5Var27.K();
                if (K9 == kjnVar) {
                    K9 = new to5(16);
                    oq5Var27.k0(K9);
                }
                aae.a((Function0) K9, null, false, lg3.p, oq5Var27, 24582, 14);
            case 24:
                hq5 hq5Var25 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var28 = (oq5) hq5Var25;
                    if (oq5Var28.z()) {
                        oq5Var28.S();
                        break;
                    }
                }
                kct.a(lg3.n, lg3.o, mp0.a(hq5Var25), null, lg3.q, null, 0L, hq5Var25, 24630, 104);
            case 25:
                hq5 hq5Var26 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var29 = (oq5) hq5Var26;
                    if (oq5Var29.z()) {
                        oq5Var29.S();
                    }
                }
                break;
            case 26:
                hq5 hq5Var27 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var30 = (oq5) hq5Var27;
                    if (oq5Var30.z()) {
                        oq5Var30.S();
                    }
                }
                break;
            case 27:
                hq5 hq5Var28 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var31 = (oq5) hq5Var28;
                    if (oq5Var31.z()) {
                        oq5Var31.S();
                    }
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                hq5 hq5Var29 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var32 = (oq5) hq5Var29;
                    if (oq5Var32.z()) {
                        oq5Var32.S();
                        break;
                    }
                }
                h6g h6gVar5 = nu0.a;
                h6g h6gVar6 = h6g.c;
                xcs.b("Заголовок экрана", null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.g(), hq5Var29, 6, 3120, 55294);
            default:
                hq5 hq5Var30 = (hq5) obj;
                int intValue15 = ((Integer) obj2).intValue();
                oq5 oq5Var33 = (oq5) hq5Var30;
                if (oq5Var33.P(intValue15 & 1, (intValue15 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_more_24, 0, oq5Var33), rvf.M(R.string.overflow_menu_content_description, oq5Var33), f8g.g0(androidx.compose.ui.platform.a.a(d.m(vciVar, 24), "video_clip_overflow"), 2.0f), ((dq0) oq5Var33.j(eq0.a)).a.c, oq5Var33, 384, 0);
                } else {
                    oq5Var33.S();
                }
                break;
        }
        return Unit.a;
    }
}
