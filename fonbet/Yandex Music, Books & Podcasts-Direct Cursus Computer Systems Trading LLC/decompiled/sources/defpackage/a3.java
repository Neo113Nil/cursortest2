package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.pulse.metrics.o;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class a3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a3(nii niiVar, r61 r61Var) {
        this.a = 8;
        this.b = niiVar;
        this.c = r61Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i = this.a;
        kjn kjnVar = gq5.a;
        vci vciVar = vci.a;
        int i2 = 1;
        int i3 = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                q3 q3Var = (q3) obj4;
                l3 l3Var = (l3) obj3;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                boolean z = q3Var.b.e;
                oq5 oq5Var2 = (oq5) hq5Var;
                boolean h = oq5Var2.h(l3Var);
                Object K = oq5Var2.K();
                if (h || K == kjnVar) {
                    c3 c3Var = new c3(0, l3Var, l3.class, "onLikeClick", "onLikeClick()V", 0, 1);
                    oq5Var2.k0(c3Var);
                    K = c3Var;
                }
                saf.q(z, (Function0) ((h9f) K), null, null, 0L, 0L, oq5Var2, 0, 60);
            case 1:
                ((Integer) obj2).getClass();
                j66.A((bxl) obj4, (Function1) obj3, (hq5) obj, rvf.R(1));
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                ((ca0) obj4).a(floatValue, ((Float) obj2).floatValue());
                ((uqn) obj3).a = floatValue;
                break;
            case 3:
                Function0 function0 = (Function0) obj4;
                r01 r01Var = (r01) obj3;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                float f = 16;
                yci f2 = a.o(vciVar, f, 0.0f, 2).f((yci) function0.invoke());
                kfh d = ug3.d(b2c.b, false);
                oq5 oq5Var4 = (oq5) hq5Var2;
                int i4 = oq5Var4.P;
                androidx.compose.runtime.internal.a l = oq5Var4.l();
                yci H = vnj.H(hq5Var2, f2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar);
                } else {
                    oq5Var4.n0();
                }
                kb5 kb5Var = wp5.f;
                g0g.U(hq5Var2, d, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(hq5Var2, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var4, i4, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(hq5Var2, H, kb5Var4);
                ivf.k(0, 0, hq5Var2, xp3.u(d.c(vciVar, 1.0f), o5g.C(hq5Var2)), r01Var.a);
                yci m = a.m(b.a.a(vciVar, b2c.h), f);
                ta5 a = sa5.a(qx0.c, b2c.n, hq5Var2, 0);
                int i5 = oq5Var4.P;
                androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                yci H2 = vnj.H(hq5Var2, m);
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(hq5Var2, a, kb5Var);
                g0g.U(hq5Var2, l2, kb5Var2);
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var4, i5, kb5Var3);
                }
                g0g.U(hq5Var2, H2, kb5Var4);
                oq5Var4.p(true);
                oq5Var4.p(true);
                break;
            case 4:
                ((Integer) obj2).getClass();
                xv7.a((i01) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                break;
            case 5:
                i01 i01Var = (i01) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str2 = (String) obj2;
                str2.getClass();
                s01 s01Var = (s01) ((t01) obj3);
                i01Var.getClass();
                s01Var.getClass();
                weo.H(i01Var.c, gld.I(s01Var.d, 0), booleanValue, str2, null);
                break;
            case 6:
                nii niiVar = (nii) obj4;
                v31 v31Var = (v31) obj3;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                jf0.m(niiVar, 2, 2, 3, ild.C(2111864040, new n31(i3, v31Var), hq5Var3), androidx.compose.ui.platform.a.a(vciVar, "concerts_horizontal_pager"), null, 0.0f, 0.0f, hq5Var3, 28080, 480);
            case 7:
                d41 d41Var = (d41) obj4;
                aqi aqiVar = (aqi) obj3;
                hq5 hq5Var4 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var4;
                if (oq5Var6.P(intValue & 1, (intValue & 3) != 2)) {
                    t41 t41Var = (t41) aqiVar.getValue();
                    boolean h2 = oq5Var6.h(d41Var);
                    Object K2 = oq5Var6.K();
                    if (h2 || K2 == kjnVar) {
                        zy zyVar = new zy(0, d41Var, d41.class, "onBackClick", "onBackClick()V", 0, 24);
                        oq5Var6.k0(zyVar);
                        K2 = zyVar;
                    }
                    xee.a(t41Var, (Function0) ((h9f) K2), null, oq5Var6, 0);
                } else {
                    oq5Var6.S();
                }
                break;
            case 8:
                nii niiVar2 = (nii) obj4;
                r61 r61Var = (r61) obj3;
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var5;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        break;
                    }
                }
                jf0.m(niiVar2, 1, 1, Integer.MAX_VALUE, ild.C(1047764442, new n31(i2, r61Var), hq5Var5), vci.a, null, 0.0f, 0.0f, hq5Var5, 28080, 480);
            case 9:
                l81 l81Var = (l81) obj4;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                String str3 = (String) obj2;
                str3.getClass();
                c91 c91Var = (c91) ((d91) obj3);
                l81Var.getClass();
                c91Var.getClass();
                weo.H(l81Var.c, c91Var.d, booleanValue2, str3, null);
                break;
            case 10:
                ((Integer) obj2).getClass();
                weo.a((t71) obj4, (o0k) obj3, (hq5) obj, rvf.R(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                n7w.a((sa1) obj4, (ib1) obj3, (hq5) obj, rvf.R(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                u2x.a((ua1) obj4, (ib1) obj3, (hq5) obj, rvf.R(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                y2x.b((db1) obj4, (yci) obj3, (hq5) obj, rvf.R(49));
                break;
            case 14:
                uc1 uc1Var = (uc1) obj4;
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                String str4 = (String) obj2;
                str4.getClass();
                uc1Var.getClass();
                str4.getClass();
                weo.H(uc1Var.b, ((dd1) obj3).e, booleanValue3, str4, null);
                break;
            case 15:
                jd1 jd1Var = (jd1) obj4;
                e9g e9gVar = (e9g) obj3;
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var8 = (oq5) hq5Var6;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        break;
                    }
                }
                String str5 = jd1Var.a;
                qo6 qo6Var = qo6.d;
                irf.y(str5, qo6Var, androidx.compose.ui.platform.a.a(d.m(vciVar, lsq.s(e9gVar)), "cover_image"), false, false, null, null, lsq.r(e9gVar, qo6Var, hq5Var6, 48), hq5Var6, 48, 120);
            case 16:
                xe1 xe1Var = (xe1) obj4;
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                String str6 = (String) obj2;
                str6.getClass();
                eul eulVar = (eul) ((if1) obj3).a.b;
                xe1Var.getClass();
                weo.H(xe1Var.c, t7g.m(eulVar, 0), booleanValue4, str6, null);
                break;
            case 17:
                ((Integer) obj2).getClass();
                vq1.a((xe1) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                break;
            case 18:
                eul eulVar2 = (eul) obj4;
                nnk nnkVar = (nnk) obj3;
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var7;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        break;
                    }
                }
                yci d2 = d.d(vciVar, 1.0f);
                ta5 a2 = sa5.a(qx0.c, b2c.n, hq5Var7, 0);
                oq5 oq5Var10 = (oq5) hq5Var7;
                int i6 = oq5Var10.P;
                androidx.compose.runtime.internal.a l3 = oq5Var10.l();
                yci H3 = vnj.H(hq5Var7, d2);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var10.d0();
                if (oq5Var10.O) {
                    oq5Var10.k(grbVar2);
                } else {
                    oq5Var10.n0();
                }
                g0g.U(hq5Var7, a2, wp5.f);
                g0g.U(hq5Var7, l3, wp5.e);
                kb5 kb5Var5 = wp5.g;
                if (oq5Var10.O || !Intrinsics.d(oq5Var10.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var10, i6, kb5Var5);
                }
                g0g.U(hq5Var7, H3, wp5.d);
                String str7 = eulVar2.c;
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                ges j = nu0.j();
                agr agrVar = eq0.a;
                oq5 oq5Var11 = (oq5) hq5Var7;
                xv7.j(str7, androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "playlist_list_item_title"), ((dq0) oq5Var11.j(agrVar)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, j, hq5Var7, 48, 3120, 55288);
                List list = (List) nnkVar.a;
                List q0 = CollectionsKt.q0(list, 3);
                if (list.size() > 3) {
                    oq5Var10.Z(36827109);
                    str = StringUtil.SPACE + rvf.M(R.string.artist_pick_artists_more, oq5Var10);
                    oq5Var10.p(false);
                } else {
                    oq5Var10.Z(1141705975);
                    oq5Var10.p(false);
                    str = "";
                }
                xv7.j(CollectionsKt.X(q0, ", ", null, str, ef1.b, 26), androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "playlist_list_description"), ((dq0) oq5Var11.j(agrVar)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), hq5Var7, 48, 3120, 55288);
                oq5Var10.p(true);
                break;
            case 19:
                rf1 rf1Var = (rf1) obj3;
                boolean booleanValue5 = ((Boolean) obj).booleanValue();
                String str8 = (String) obj2;
                str8.getClass();
                rf1Var.getClass();
                weo.H(rf1Var.c, ((jg1) obj4).c, booleanValue5, str8, null);
                break;
            case 20:
                boolean booleanValue6 = ((Boolean) obj).booleanValue();
                String str9 = (String) obj2;
                str9.getClass();
                ((ug1) obj4).a(booleanValue6, str9, ((ch1) obj3).a);
                break;
            case 21:
                ni1 ni1Var = (ni1) obj4;
                yi1 yi1Var = (yi1) obj3;
                hq5 hq5Var8 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var12 = (oq5) hq5Var8;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        break;
                    }
                }
                jf0.a(new qzm[0], ni1Var.j, false, ild.C(1350373487, new mi1(yi1Var, i3), hq5Var8), hq5Var8, 0, 4);
            case 22:
                ((Integer) obj2).getClass();
                j66.d((yi1) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                break;
            case 23:
                sj1 sj1Var = (sj1) obj4;
                ne1 ne1Var = (ne1) obj3;
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var13 = (oq5) hq5Var9;
                    if (oq5Var13.z()) {
                        oq5Var13.S();
                        break;
                    }
                }
                x97.c((nii) sj1Var.a.b.getValue(), ne1Var, null, hq5Var9, 0);
            case 24:
                k61 k61Var = (k61) obj4;
                sj1 sj1Var2 = (sj1) obj3;
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var14 = (oq5) hq5Var10;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        break;
                    }
                }
                vnj.a(k61Var, (nii) sj1Var2.a.b.getValue(), null, hq5Var10, 0);
            case 25:
                uc1 uc1Var2 = (uc1) obj4;
                wc1 wc1Var = (wc1) obj3;
                hq5 hq5Var11 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var15 = (oq5) hq5Var11;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                        break;
                    }
                }
                zsd.e(uc1Var2, wc1Var, null, hq5Var11, 0);
            case 26:
                sj1 sj1Var3 = (sj1) obj4;
                l81 l81Var2 = (l81) obj3;
                hq5 hq5Var12 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var16 = (oq5) hq5Var12;
                    if (oq5Var16.z()) {
                        oq5Var16.S();
                        break;
                    }
                }
                men.d(sj1Var3.a.c, l81Var2, null, hq5Var12, 0);
            case 27:
                sj1 sj1Var4 = (sj1) obj4;
                rf1 rf1Var2 = (rf1) obj3;
                hq5 hq5Var13 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var17 = (oq5) hq5Var13;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        break;
                    }
                }
                lg3.e(sj1Var4.a.d, rf1Var2, null, hq5Var13, 0);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                String str10 = (String) obj2;
                ((mqs) obj).getClass();
                str10.getClass();
                ((sk1) obj4).c.m(null, (thj) obj3, str10);
                break;
            default:
                ((Integer) obj2).getClass();
                zo1.b((bp1) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ a3(nii niiVar, v31 v31Var) {
        this.a = 6;
        this.b = niiVar;
        this.c = v31Var;
    }

    public /* synthetic */ a3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ a3(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ a3(Function0 function0, r01 r01Var) {
        this.a = 3;
        this.b = function0;
        this.c = r01Var;
    }
}
