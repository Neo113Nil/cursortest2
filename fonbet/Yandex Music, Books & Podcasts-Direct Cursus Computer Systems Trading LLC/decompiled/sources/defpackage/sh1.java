package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.pulse.metrics.o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final /* synthetic */ class sh1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sh1(y3 y3Var, yo4 yo4Var, kkp kkpVar, kxi kxiVar) {
        this.a = 18;
        this.b = yo4Var;
        this.c = kkpVar;
        this.d = kxiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        iz2 iz2Var;
        int i = this.a;
        vci vciVar = vci.a;
        int i2 = 4;
        Object obj3 = gq5.a;
        final int i3 = 2;
        final int i4 = 3;
        final int i5 = 1;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                final th1 th1Var = (th1) obj6;
                final jnq jnqVar = (jnq) obj5;
                pvf pvfVar = (pvf) obj;
                pvfVar.getClass();
                ((gnq) obj2).getClass();
                pvfVar.a(new String[]{"ARTIST_ALBUMS", "ARTIST_STUDIO_ALBUMS"}, new Function0() { // from class: nh1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                return new ce((a14) th1Var.a.getValue(), jnqVar, zpd.d);
                            case 1:
                                return new ce((a14) th1Var.a.getValue(), jnqVar, zpd.g);
                            case 2:
                                return new ce((a14) th1Var.a.getValue(), jnqVar, zpd.k);
                            default:
                                return new ce((a14) th1Var.a.getValue(), jnqVar, zpd.j);
                        }
                    }
                });
                pvfVar.a(new String[]{"ARTIST_PLAYLISTS", "ARTIST_COMPILATIONS"}, new Function0() { // from class: nh1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                return new ce((a14) th1Var.a.getValue(), jnqVar, zpd.d);
                            case 1:
                                return new ce((a14) th1Var.a.getValue(), jnqVar, zpd.g);
                            case 2:
                                return new ce((a14) th1Var.a.getValue(), jnqVar, zpd.k);
                            default:
                                return new ce((a14) th1Var.a.getValue(), jnqVar, zpd.j);
                        }
                    }
                });
                final int i6 = false ? 1 : 0;
                pvfVar.a(new String[]{"SIMILAR_ARTISTS"}, new Function0() { // from class: nh1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                return new ce((a14) th1Var.a.getValue(), jnqVar, zpd.d);
                            case 1:
                                return new ce((a14) th1Var.a.getValue(), jnqVar, zpd.g);
                            case 2:
                                return new ce((a14) th1Var.a.getValue(), jnqVar, zpd.k);
                            default:
                                return new ce((a14) th1Var.a.getValue(), jnqVar, zpd.j);
                        }
                    }
                });
                t11[] t11VarArr = t11.a;
                pvfVar.a(new String[]{"ARTIST_RELEASE"}, new oh1(th1Var, false ? 1 : 0));
                pvfVar.a(new String[]{"ARTIST_UPCOMING_RELEASE"}, new oh1(th1Var, i5));
                pvfVar.a(new String[]{"ARTIST_WAVE"}, new ph1(jnqVar, false ? 1 : 0));
                pvfVar.a(new String[]{"ARTIST_CLIPS"}, new qh1((tmb) obj4, false ? 1 : 0));
                pvfVar.a(new String[]{"FAMILIAR_YOU"}, new oh1(th1Var, i3));
                pvfVar.a(new String[]{"ARTIST_PICK"}, new oh1(th1Var, i4));
                pvfVar.a(new String[]{"ARTIST_DONATION"}, new oh1(th1Var, i2));
                pvfVar.a(new String[]{"BANDLINK_SCANNER"}, new oh1(th1Var, 7));
                pvfVar.a(new String[]{"ABOUT_ARTIST"}, new oh1(th1Var, 8));
                pvfVar.a(new String[]{"ARTIST_SIMILAR_ENTITIES"}, new Function0() { // from class: nh1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                return new ce((a14) th1Var.a.getValue(), jnqVar, zpd.d);
                            case 1:
                                return new ce((a14) th1Var.a.getValue(), jnqVar, zpd.g);
                            case 2:
                                return new ce((a14) th1Var.a.getValue(), jnqVar, zpd.k);
                            default:
                                return new ce((a14) th1Var.a.getValue(), jnqVar, zpd.j);
                        }
                    }
                });
                break;
            case 1:
                cj1 cj1Var = (cj1) obj6;
                yi1 yi1Var = (yi1) obj5;
                fud fudVar = (fud) obj4;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                if (cj1Var.a != null) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    oq5Var2.Z(-1554322554);
                    String str2 = yi1Var.c.D.b;
                    boolean h = oq5Var2.h(yi1Var);
                    Object K = oq5Var2.K();
                    if (h || K == obj3) {
                        Object m71Var = new m71(0, yi1Var, yi1.class, "onBackClick", "onBackClick()V", 0, 21);
                        oq5Var2.k0(m71Var);
                        K = m71Var;
                    }
                    Function0 function0 = (Function0) ((h9f) K);
                    boolean h2 = oq5Var2.h(yi1Var);
                    Object K2 = oq5Var2.K();
                    if (h2 || K2 == obj3) {
                        Object m71Var2 = new m71(0, yi1Var, yi1.class, "onSearchClick", "onSearchClick()V", 0, 22);
                        oq5Var2.k0(m71Var2);
                        K2 = m71Var2;
                    }
                    Function0 function02 = (Function0) ((h9f) K2);
                    boolean h3 = oq5Var2.h(yi1Var);
                    Object K3 = oq5Var2.K();
                    if (h3 || K3 == obj3) {
                        Object m71Var3 = new m71(0, yi1Var, yi1.class, "onOverflowClick", "onOverflowClick()V", 0, 23);
                        oq5Var2.k0(m71Var3);
                        K3 = m71Var3;
                    }
                    ot0.a(str2, fudVar, function0, function02, (Function0) ((h9f) K3), d.d(vciVar, 1.0f), oq5Var2, 196608);
                    oq5Var2.p(false);
                } else {
                    oq5 oq5Var3 = (oq5) hq5Var;
                    oq5Var3.Z(-1553731849);
                    boolean h4 = oq5Var3.h(yi1Var);
                    Object K4 = oq5Var3.K();
                    if (h4 || K4 == obj3) {
                        Object m71Var4 = new m71(0, yi1Var, yi1.class, "onBackClick", "onBackClick()V", 0, 24);
                        oq5Var3.k0(m71Var4);
                        K4 = m71Var4;
                    }
                    h9f h9fVar = (h9f) K4;
                    boolean h5 = oq5Var3.h(yi1Var);
                    Object K5 = oq5Var3.K();
                    if (h5 || K5 == obj3) {
                        Object m71Var5 = new m71(0, yi1Var, yi1.class, "onSearchClick", "onSearchClick()V", 0, 25);
                        oq5Var3.k0(m71Var5);
                        K5 = m71Var5;
                    }
                    h9f h9fVar2 = (h9f) K5;
                    boolean h6 = oq5Var3.h(yi1Var);
                    Object K6 = oq5Var3.K();
                    if (h6 || K6 == obj3) {
                        Object m71Var6 = new m71(0, yi1Var, yi1.class, "onOverflowClick", "onOverflowClick()V", 0, 26);
                        oq5Var3.k0(m71Var6);
                        K6 = m71Var6;
                    }
                    t7g.h(gut.p1(vciVar), (Function0) h9fVar, (Function0) h9fVar2, (Function0) ((h9f) K6), oq5Var3, 0, 0);
                    oq5Var3.p(false);
                }
            case 2:
                sk1 sk1Var = (sk1) obj6;
                mqs mqsVar = (mqs) obj5;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str3 = (String) obj2;
                str3.getClass();
                sk1Var.getClass();
                mqsVar.getClass();
                weo.H(sk1Var.c, szf.N(mqsVar, (spd) obj4), booleanValue, str3, null);
                break;
            case 3:
                ((Integer) obj2).getClass();
                x97.c((nii) obj6, (ne1) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                break;
            case 4:
                ne1 ne1Var = (ne1) obj6;
                mqs mqsVar2 = (mqs) obj5;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                String str4 = (String) obj2;
                str4.getClass();
                ne1Var.getClass();
                mqsVar2.getClass();
                weo.H(ne1Var.d, szf.N(mqsVar2, (spd) obj4), booleanValue2, str4, null);
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((fl1) obj6).A((ml1) obj5, (lvf) obj4, (hq5) obj, rvf.R(65));
                break;
            case 6:
                rk1 rk1Var = (rk1) obj6;
                b22 b22Var = (b22) obj5;
                i3 i3Var = (i3) obj4;
                hq5 hq5Var2 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var2;
                if (oq5Var4.P(intValue & 1, (intValue & 3) != 2)) {
                    wct.b(new y12(rk1Var, b22Var.g, b22Var), ((Boolean) ((u12) i3Var.b).d.getValue()).booleanValue(), null, oq5Var4, 0);
                } else {
                    oq5Var4.S();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                ot0.c((mo2) obj6, (qn2) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                break;
            case 8:
                Function1 function1 = (Function1) obj6;
                wn5 wn5Var = (wn5) obj5;
                drf drfVar = (drf) obj4;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                oq5 oq5Var6 = (oq5) hq5Var3;
                xil xilVar = (xil) oq5Var6.j(glg.a);
                int intValue2 = ((Number) oq5Var6.j(glg.b)).intValue();
                boolean f = oq5Var6.f(function1) | oq5Var6.f(xilVar);
                Object K7 = oq5Var6.K();
                if (f || K7 == obj3) {
                    String str5 = drfVar.a().b;
                    String str6 = drfVar.a().a;
                    str5.getClass();
                    str6.getClass();
                    K7 = function1.invoke(xilVar.a(new lab(1, intValue2 + 1, 0, str5, str6)));
                    oq5Var6.k0(K7);
                }
                wn5Var.invoke(K7, oq5Var6, 0);
            case 9:
                g3 g3Var = (g3) obj6;
                wn5 wn5Var2 = (wn5) obj5;
                drf drfVar2 = (drf) obj4;
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var4;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        break;
                    }
                }
                oq5 oq5Var8 = (oq5) hq5Var4;
                xil xilVar2 = (xil) oq5Var8.j(glg.a);
                int intValue3 = ((Number) oq5Var8.j(glg.b)).intValue();
                boolean f2 = oq5Var8.f(g3Var) | oq5Var8.f(xilVar2);
                Object K8 = oq5Var8.K();
                if (f2 || K8 == obj3) {
                    String str7 = drfVar2.a().b;
                    String str8 = drfVar2.a().a;
                    str7.getClass();
                    str8.getClass();
                    K8 = g3Var.invoke(new exa(new lab(1, intValue3 + 1, 0, str7, str8), xilVar2.b, xilVar2.e));
                    oq5Var8.k0(K8);
                }
                wn5Var2.invoke(K8, oq5Var8, 0);
            case 10:
                ((Integer) obj2).getClass();
                fgq.g((tvd) obj6, (c93) obj5, (va3) obj4, (hq5) obj, rvf.R(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                nt0.g((q91) obj6, (yci) obj5, (String) obj4, (hq5) obj, rvf.R(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                vq1.l((wx3) obj6, (ny3) obj5, (yci) obj4, (hq5) obj, rvf.R(9));
                break;
            case 13:
                bci bciVar = (bci) obj6;
                kkp kkpVar = (kkp) obj5;
                sai saiVar = (sai) obj4;
                hq5 hq5Var5 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var5;
                if (oq5Var9.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    yd5.f(null, null, bciVar, null, null, false, false, false, 0L, 0L, 0.0f, ild.C(-1752223320, new w34(kkpVar, saiVar, i5), oq5Var9), oq5Var9, 4096, 4087);
                } else {
                    oq5Var9.S();
                }
                break;
            case 14:
                u44 u44Var = (u44) obj6;
                r34 r34Var = (r34) obj5;
                spd spdVar = (spd) obj4;
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                String str9 = (String) obj2;
                str9.getClass();
                u44Var.getClass();
                r34Var.getClass();
                spdVar.getClass();
                weo.H(u44Var.b, tt0.u(r34Var.a, spdVar), booleanValue3, str9, null);
                break;
            case 15:
                List list = (List) obj6;
                u44 u44Var2 = (u44) obj5;
                bhs bhsVar = (bhs) obj4;
                hq5 hq5Var6 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var6;
                if (oq5Var10.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    lqd.b(list, a.a(d.d(vciVar, 1.0f), "collection_sections_block"), 4, null, new mqd(16, 12), ild.C(1717962243, new jv(i5, u44Var2, bhsVar), oq5Var10), oq5Var10, 197040, 8);
                } else {
                    oq5Var10.S();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                n7w.d((zf4) obj6, (bg5) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                break;
            case 17:
                zf4 zf4Var = (zf4) obj6;
                frs frsVar = (frs) obj5;
                lzs lzsVar = (lzs) obj4;
                hq5 hq5Var7 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var11 = (oq5) hq5Var7;
                if (oq5Var11.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    n7w.f(zf4Var.h, zf4Var.a, zf4Var.b, lzsVar, null, frsVar.a(), oq5Var11, 0);
                } else {
                    oq5Var11.S();
                }
                break;
            case 18:
                yo4 yo4Var = (yo4) obj6;
                kkp kkpVar2 = (kkp) obj5;
                kxi kxiVar = (kxi) obj4;
                hq5 hq5Var8 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var12 = (oq5) hq5Var8;
                if (oq5Var12.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    boolean f3 = oq5Var12.f(yo4Var) | oq5Var12.f(kkpVar2);
                    Object K9 = oq5Var12.K();
                    if (f3 || K9 == obj3) {
                        K9 = new ip4(yo4Var, kkpVar2, kxiVar, yo4Var.e);
                        oq5Var12.k0(K9);
                    }
                    sk3.d((ip4) K9, null, oq5Var12, 0);
                } else {
                    oq5Var12.S();
                }
                break;
            case 19:
                ((Integer) obj2).getClass();
                ltg.g((d53) obj6, (eqp) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                h4a.e((jz4) obj6, (bz4) obj5, (qnq) obj4, (hq5) obj, rvf.R(513));
                break;
            case 21:
                ((Integer) obj2).getClass();
                fgq.p((g5u) obj6, (k65) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                y65.a((a75) obj6, (kxi) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                break;
            case 23:
                je1 je1Var = (je1) obj6;
                h75 h75Var = (h75) obj5;
                kxi kxiVar2 = (kxi) obj4;
                hq5 hq5Var9 = (hq5) obj;
                int intValue8 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var9;
                if (oq5Var13.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    boolean f4 = oq5Var13.f(je1Var) | oq5Var13.f(h75Var);
                    Object K10 = oq5Var13.K();
                    if (f4 || K10 == obj3) {
                        K10 = new l75(je1Var, h75Var.e, h75Var, kxiVar2);
                        oq5Var13.k0(K10);
                    }
                    vut.g((l75) K10, oq5Var13, 0);
                } else {
                    oq5Var13.S();
                }
                break;
            case 24:
                ut5 ut5Var = (ut5) obj6;
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                String str10 = (String) obj2;
                str10.getClass();
                h06 h06Var = ((ht5) obj5).a;
                ut5Var.getClass();
                weo.H(ut5Var.d, x97.o(h06Var, (spd) obj4), booleanValue4, str10, null);
                break;
            case 25:
                mv5 mv5Var = (mv5) obj6;
                iv5 iv5Var = (iv5) obj5;
                yci yciVar = (yci) obj4;
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var14 = (oq5) hq5Var10;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        break;
                    }
                }
                lv5 lv5Var = (lv5) mv5Var;
                int i7 = lv5Var.b;
                int size = lv5Var.e.size();
                IntRange intRange = lv5Var.d;
                oq5 oq5Var15 = (oq5) hq5Var10;
                boolean h7 = oq5Var15.h(iv5Var);
                Object K11 = oq5Var15.K();
                if (h7 || K11 == obj3) {
                    Object mt4Var = new mt4(1, iv5Var, iv5.class, "onIndicatorRangeChanged", "onIndicatorRangeChanged(Lkotlin/ranges/IntRange;)V", 0, 17);
                    oq5Var15.k0(mt4Var);
                    K11 = mt4Var;
                }
                jx7 jx7Var = (jx7) oq5Var15.j(es5.h);
                float n0 = jx7Var.n0(3);
                float n02 = jx7Var.n0(2);
                float n03 = jx7Var.n0(1);
                float n04 = jx7Var.n0(4);
                agr agrVar = eq0.a;
                ivf.j(i7, intRange, (Function1) ((h9f) K11), size, new m2k(n0, n02, n03, n04, ((dq0) oq5Var15.j(agrVar)).a.c, ((dq0) oq5Var15.j(agrVar)).a.a, 5), yciVar, oq5Var15, 0, 0);
            case 26:
                o16 o16Var = (o16) obj6;
                c26 c26Var = (c26) obj5;
                tvd tvdVar = (tvd) obj4;
                hq5 hq5Var11 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var16 = (oq5) hq5Var11;
                    if (oq5Var16.z()) {
                        oq5Var16.S();
                        break;
                    }
                }
                bg3.e(o16Var, c26Var, tvdVar, null, hq5Var11, 0);
            case 27:
                zg6 zg6Var = (zg6) obj6;
                kh6 kh6Var = (kh6) obj5;
                c8l c8lVar = (c8l) obj4;
                hq5 hq5Var12 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var17 = (oq5) hq5Var12;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        break;
                    }
                }
                aqi M = gld.M(zg6Var.i, hq5Var12);
                aqi M2 = gld.M(zg6Var.j, hq5Var12);
                c8l c8lVar2 = kh6Var.c;
                if (c8lVar2 == null || (str = c8lVar2.a) == null) {
                    str = "";
                }
                gh6.e(c8lVar.b, leu.X(str, hq5Var12), ((Boolean) M.getValue()).booleanValue(), (cdj) M2.getValue(), zg6Var, null, hq5Var12, 0, 32);
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                yci yciVar2 = (yci) obj6;
                u9b u9bVar = (u9b) obj5;
                qw qwVar = (qw) obj4;
                hq5 hq5Var13 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var18 = (oq5) hq5Var13;
                    if (oq5Var18.z()) {
                        oq5Var18.S();
                        break;
                    }
                }
                oq5 oq5Var19 = (oq5) hq5Var13;
                if (((Boolean) oq5Var19.j(koe.a)).booleanValue()) {
                    oq5Var19.Z(58503632);
                    ug3.a(androidx.compose.foundation.a.b(yciVar2, ((dq0) oq5Var19.j(eq0.a)).d.a, vnj.i), oq5Var19, 0);
                    oq5Var19.p(false);
                } else {
                    oq5Var19.Z(58679216);
                    String e = u9bVar.e(wct.t(), WebPath$Storage.AVATARS);
                    String M3 = rvf.M(R.string.cover_description, oq5Var19);
                    yci u = xp3.u(a.a(yciVar2, "promo_cover"), o5g.G(oq5Var19));
                    int ordinal = qwVar.a.a.e.ordinal();
                    if (ordinal == 0) {
                        iz2Var = b2c.f;
                    } else if (ordinal != 1) {
                        b6e.s();
                        break;
                    } else {
                        iz2Var = b2c.c;
                    }
                    p1g.a(e, M3, u, null, null, iz2Var, hd6.a, 0.0f, null, 0, oq5Var19, ScreenMirroringConfig.Video.BITRATE_1_5MB, 920);
                    oq5Var19.p(false);
                }
            default:
                ((Integer) obj2).getClass();
                pd.k((gy7) obj6, (Function1) obj5, (yci) obj4, (hq5) obj, rvf.R(9));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ sh1(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ sh1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
