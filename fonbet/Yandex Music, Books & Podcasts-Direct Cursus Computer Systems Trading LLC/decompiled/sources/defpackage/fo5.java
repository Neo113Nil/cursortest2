package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class fo5 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ fo5(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        kjn kjnVar = gq5.a;
        int i2 = 6;
        vci vciVar = vci.a;
        int i3 = 2;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_search_24, 0, oq5Var), rvf.M(R.string.search, oq5Var), a.a(d.m(androidx.compose.foundation.layout.a.o(vciVar, 12, 0.0f, 2), 24), "landing_toolbar_search_button"), ((dq0) oq5Var.j(eq0.a)).a.a, oq5Var, 384, 0);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    if (K == kjnVar) {
                        K = szf.g0(null);
                        oq5Var2.k0(K);
                    }
                    aqi aqiVar = (aqi) K;
                    List h = u75.h(new k0s("1", "Для вас"), new k0s("2", "Популярное"));
                    c5b c5bVar = c5b.a;
                    Object K2 = oq5Var2.K();
                    if (K2 == kjnVar) {
                        K2 = tlm.h(0.0f, oq5Var2);
                    }
                    poi poiVar = (poi) K2;
                    Object K3 = oq5Var2.K();
                    if (K3 == kjnVar) {
                        K3 = new do5(5);
                        oq5Var2.k0(K3);
                    }
                    Function0 function0 = (Function0) K3;
                    Object K4 = oq5Var2.K();
                    if (K4 == kjnVar) {
                        K4 = new z35(19);
                        oq5Var2.k0(K4);
                    }
                    Function1 function1 = (Function1) K4;
                    Object K5 = oq5Var2.K();
                    if (K5 == kjnVar) {
                        K5 = new fo5(i3);
                        oq5Var2.k0(K5);
                    }
                    sj2.b(aqiVar, h, 0, c5bVar, function0, function1, (Function2) K5, poiVar, false, null, null, oq5Var2, 115043718, 1536);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                ((String) obj2).getClass();
                break;
            case 3:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                gae.b(a0g.E(R.drawable.ic_close_round_dark_28, 0, hq5Var3), rvf.M(R.string.btn_close, hq5Var3), null, ((dq0) ((oq5) hq5Var3).j(eq0.a)).a.a, hq5Var3, 0, 4);
            case 4:
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var4;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                pm0.c(xp3.u(d.c(vciVar, 1.0f), o5g.D(hq5Var4)), hq5Var4, 0);
            case 5:
                hq5 hq5Var5 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    n7w.i(1, 54, oq5Var5, null, true);
                } else {
                    oq5Var5.S();
                }
                break;
            case 6:
                hq5 hq5Var6 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var6;
                if (oq5Var6.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    pm0.a(null, jf0.b, oq5Var6, 48, 1);
                } else {
                    oq5Var6.S();
                }
                break;
            case 7:
                hq5 hq5Var7 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var7 = (oq5) hq5Var7;
                if (oq5Var7.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    n7w.u(true, null, false, false, oq5Var7, 6, 14);
                } else {
                    oq5Var7.S();
                }
                break;
            case 8:
                hq5 hq5Var8 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var8 = (oq5) hq5Var8;
                if (oq5Var8.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    pm0.a(null, jf0.c, oq5Var8, 48, 1);
                } else {
                    oq5Var8.S();
                }
                break;
            case 9:
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var9;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                    }
                }
                break;
            case 10:
                hq5 hq5Var10 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var10;
                if (oq5Var10.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    vwb.z(0, 1, oq5Var10, null);
                } else {
                    oq5Var10.S();
                }
                break;
            case 11:
                hq5 hq5Var11 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var11 = (oq5) hq5Var11;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                    }
                }
                break;
            case 12:
                hq5 hq5Var12 = (hq5) obj;
                int intValue8 = ((Integer) obj2).intValue();
                oq5 oq5Var12 = (oq5) hq5Var12;
                if (oq5Var12.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    vwb.f(new zqm(true), new qec(6), null, oq5Var12, 64, 4);
                } else {
                    oq5Var12.S();
                }
                break;
            case 13:
                hq5 hq5Var13 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var13 = (oq5) hq5Var13;
                    if (oq5Var13.z()) {
                        oq5Var13.S();
                        break;
                    }
                }
                pm0.c(xp3.u(vciVar, irf.R(qo6.a, hq5Var13)), hq5Var13, 0);
            case 14:
                hq5 hq5Var14 = (hq5) obj;
                int intValue9 = ((Integer) obj2).intValue();
                oq5 oq5Var14 = (oq5) hq5Var14;
                if (oq5Var14.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    vwb.f(new zqm(false), new qec(6), null, oq5Var14, 64, 4);
                } else {
                    oq5Var14.S();
                }
                break;
            case 15:
                hq5 hq5Var15 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var15 = (oq5) hq5Var15;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                        break;
                    }
                }
                ivf.l(true, d.d(vciVar, 0.33333334f), null, hq5Var15, 54, 4);
            case 16:
                hq5 hq5Var16 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var16 = (oq5) hq5Var16;
                    if (oq5Var16.z()) {
                        oq5Var16.S();
                        break;
                    }
                }
                ivf.l(true, d.d(vciVar, 0.25f), null, hq5Var16, 54, 4);
            case 17:
                hq5 hq5Var17 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var17 = (oq5) hq5Var17;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                    }
                }
                break;
            case 18:
                hq5 hq5Var18 = (hq5) obj;
                int intValue10 = ((Integer) obj2).intValue();
                oq5 oq5Var18 = (oq5) hq5Var18;
                if (oq5Var18.P(intValue10 & 1, (intValue10 & 3) != 2)) {
                    lxe.d(androidx.compose.foundation.layout.a.a(0.0f, 0.0f, 3), null, oq5Var18, 6);
                } else {
                    oq5Var18.S();
                }
                break;
            case 19:
                hq5 hq5Var19 = (hq5) obj;
                int intValue11 = ((Integer) obj2).intValue();
                oq5 oq5Var19 = (oq5) hq5Var19;
                if (oq5Var19.P(intValue11 & 1, (intValue11 & 3) != 2)) {
                    gae.b(a0g.E(R.drawable.ic_search_24, 0, oq5Var19), rvf.M(R.string.search, oq5Var19), a.a(vciVar, "playlist_list_toolbar_search_button"), ((dq0) oq5Var19.j(eq0.a)).a.a, oq5Var19, 384, 0);
                } else {
                    oq5Var19.S();
                }
                break;
            case 20:
                hq5 hq5Var20 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var20 = (oq5) hq5Var20;
                    if (oq5Var20.z()) {
                        oq5Var20.S();
                        break;
                    }
                }
                xcs.b(rvf.M(R.string.concert_location_selector_search_placeholder, hq5Var20), null, ((dq0) ((oq5) hq5Var20).j(eq0.a)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), hq5Var20, 0, 0, 65530);
            case 21:
                hq5 hq5Var21 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var21 = (oq5) hq5Var21;
                    if (oq5Var21.z()) {
                        oq5Var21.S();
                        break;
                    }
                }
                zsd.i(new fy5(new qy5(new oy5("VK Stadium", "Москва, Ленинградский пр-т, д. 80", u75.h(new g5i("Соколники", t75.c(Integer.valueOf(c3x.U(d85.h)))), new g5i("Речной вокзал", u75.h(Integer.valueOf(c3x.U(d85.g)), Integer.valueOf(c3x.U(d85.i))))), "https://static-maps.yandex.ru/1.x/?ls=1&lang=ru_RU&z=16&l=map&scale=2&lg=0&cr=0&key=AGeh0lgBAAAAs1PgYgMAzuhW7ly4I_lrBubuobRiJ9YyC7IAAAAAAAAAAACZXFRqAiBGKCnoI9JJT-SilxqvFg==&ll=37.58623,55.805098&pt=37.58623,55.805098,org&size=1000,500", null), new thj(pkb.NonApplicable, "", 1, 1, ""))), null, hq5Var21, 0);
            case 22:
                hq5 hq5Var22 = (hq5) obj;
                int intValue12 = ((Integer) obj2).intValue();
                oq5 oq5Var22 = (oq5) hq5Var22;
                if (oq5Var22.P(intValue12 & 1, (intValue12 & 3) != 2)) {
                    irf.r(a0g.E(R.drawable.ic_navigation_24, 0, oq5Var22), rvf.M(R.string.open_map, oq5Var22), null, null, null, 0.0f, null, oq5Var22, 0, 124);
                } else {
                    oq5Var22.S();
                }
                break;
            case 23:
                hq5 hq5Var23 = (hq5) obj;
                int intValue13 = ((Integer) obj2).intValue();
                oq5 oq5Var23 = (oq5) hq5Var23;
                if (oq5Var23.P(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Object K6 = oq5Var23.K();
                    if (K6 == kjnVar) {
                        K6 = new do5(6);
                        oq5Var23.k0(K6);
                    }
                    pd.h("", (Function0) K6, "Minsk Arena", "Minsk, Skaryna st.", u75.h(new f5i("Сокол", -16711936), new f5i("Панфиловская", -65536), new f5i("Аэропорт", -16711936)), null, oq5Var23, 3510);
                } else {
                    oq5Var23.S();
                }
                break;
            case 24:
                hq5 hq5Var24 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var24 = (oq5) hq5Var24;
                    if (oq5Var24.z()) {
                        oq5Var24.S();
                        break;
                    }
                }
                xqc u = vq2.u(hq5Var24);
                ArrayList arrayList = new ArrayList(10);
                for (int i4 = 0; i4 < 10; i4++) {
                    arrayList.add(new s06(x2i.W(14, "mock_id", null), new ct5("", d85.i, "Овсянкин", "20:00", "июн", "12", "пт", "Москва", "VK Stadium", null, "15%", 15, "", new ru5("unspecified"))));
                }
                lvf a = ovf.a(ydr.a(new v3k(new fs(15, new f1k(arrayList)), v3k.e, v3k.f, new ep7(arrayList, 3))), hq5Var24);
                oq5 oq5Var25 = (oq5) hq5Var24;
                boolean h2 = oq5Var25.h(a) | oq5Var25.f(u);
                Object K7 = oq5Var25.K();
                if (h2 || K7 == kjnVar) {
                    K7 = new ny2(i2, a, u);
                    oq5Var25.k0(K7);
                }
                weo.g(null, null, null, null, null, null, false, (Function1) K7, oq5Var25, 0, KotlinVersion.MAX_COMPONENT_VALUE);
            case 25:
                hq5 hq5Var25 = (hq5) obj;
                int intValue14 = ((Integer) obj2).intValue();
                oq5 oq5Var26 = (oq5) hq5Var25;
                if (oq5Var26.P(intValue14 & 1, (intValue14 & 3) != 2)) {
                    ArrayList arrayList2 = new ArrayList(5);
                    for (int i5 = 0; i5 < 5; i5++) {
                        h06 W = x2i.W(15, null, null);
                        arrayList2.add(new c36(new ws5(W, aaw.d(W, new n36(), wct.t(), false))));
                    }
                    up6.g(new x26(new f36(arrayList2)), null, oq5Var26, 0);
                } else {
                    oq5Var26.S();
                }
                break;
            case 26:
                hq5 hq5Var26 = (hq5) obj;
                int intValue15 = ((Integer) obj2).intValue();
                oq5 oq5Var27 = (oq5) hq5Var26;
                if (oq5Var27.P(intValue15 & 1, (intValue15 & 3) != 2)) {
                    up6.g(new x26(new g36(true)), null, oq5Var27, 0);
                } else {
                    oq5Var27.S();
                }
                break;
            case 27:
                hq5 hq5Var27 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var28 = (oq5) hq5Var27;
                    if (oq5Var28.z()) {
                        oq5Var28.S();
                        break;
                    }
                }
                w4k E = a0g.E(R.drawable.ic_more_24, 0, hq5Var27);
                long r = kg5.r(R.color.icon_primary_night, hq5Var27);
                String M = rvf.M(R.string.overflow_menu_content_description, hq5Var27);
                yci a2 = a.a(vciVar, "my_shelf_block_play_overflow");
                oq5 oq5Var29 = (oq5) hq5Var27;
                Object K8 = oq5Var29.K();
                if (K8 == kjnVar) {
                    K8 = new z35(20);
                    oq5Var29.k0(K8);
                }
                gae.b(E, M, nfp.a(a2, (Function1) K8), r, oq5Var29, 0, 0);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                hq5 hq5Var28 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var30 = (oq5) hq5Var28;
                    if (oq5Var30.z()) {
                        oq5Var30.S();
                        break;
                    }
                }
                swf.e(0, 1, hq5Var28, null);
            default:
                hq5 hq5Var29 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var31 = (oq5) hq5Var29;
                    if (oq5Var31.z()) {
                        oq5Var31.S();
                        break;
                    }
                }
                xcs.b(rvf.M(R.string.new_playlist_edit_hint, hq5Var29), a.a(vciVar, "playlist_name_hint"), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), hq5Var29, 48, 0, 65532);
        }
        return Unit.a;
    }
}
