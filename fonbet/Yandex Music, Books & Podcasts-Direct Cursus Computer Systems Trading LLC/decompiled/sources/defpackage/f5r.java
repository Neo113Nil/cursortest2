package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import androidx.fragment.app.t;
import com.yandex.music.core.ui.compose.b;
import com.yandex.music.shared.wave.shader.api.component.WaveGlShaderView;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class f5r implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f5r(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        d85 d85Var;
        long j;
        long j2;
        int i = this.a;
        String str = null;
        vci vciVar = vci.a;
        kjn kjnVar = gq5.a;
        int i2 = 2;
        int i3 = 1;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                a5r a5rVar = (a5r) obj3;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    qo6 qo6Var = qo6.k;
                    z4r z4rVar = a5rVar.k;
                    String str2 = pd.M() ? z4rVar.a : z4rVar.b;
                    if (str2 == null) {
                        oq5Var.Z(-359108152);
                    } else {
                        oq5Var.Z(-359108151);
                        yci a = a.a(d.c(vciVar, 1.0f), "special_image_bg_url");
                        int V = StringsKt.V(6, str2, "/");
                        ltg.e(qo6Var, str2, b.c(a, "color_special_image_bg_url", V == -1 ? str2 : str2.substring(0, V)), hd6.a, a5rVar.j == x4r.a ? b2c.g : b2c.e, bow.h, bow.i, null, oq5Var, 1772550, 128);
                    }
                    oq5Var.p(false);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                e7r e7rVar = (e7r) obj3;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                Object K = oq5Var3.K();
                if (K == kjnVar) {
                    K = new o7r(e7rVar.a());
                    oq5Var3.k0(K);
                }
                o7r o7rVar = (o7r) K;
                boolean h = oq5Var3.h(e7rVar);
                Object K2 = oq5Var3.K();
                if (h || K2 == kjnVar) {
                    K2 = new b7r(e7rVar, i3);
                    oq5Var3.k0(K2);
                }
                p6g.j(o7rVar, (Function0) K2, oq5Var3, 0);
                return Unit.a;
            case 2:
                vov vovVar = (vov) obj3;
                hq5 hq5Var3 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var3;
                if (oq5Var4.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Bitmap bitmap = vovVar.a;
                    if (bitmap == null) {
                        oq5Var4.Z(-853032963);
                    } else {
                        oq5Var4.Z(-853032962);
                        Context context = (Context) oq5Var4.j(cs5.b);
                        n33 n33Var = new n33(bitmap);
                        ukd z = o5g.z(skd.a);
                        boolean h2 = oq5Var4.h(vovVar) | oq5Var4.h(context);
                        Object K3 = oq5Var4.K();
                        Object obj4 = K3;
                        if (h2 || K3 == kjnVar) {
                            fon fonVar = new fon(vovVar, context, i3);
                            oq5Var4.k0(fonVar);
                            obj4 = fonVar;
                        }
                        saf.o(n33Var, zdg.E(z, (Function1) obj4), 0, null, oq5Var4, 48, 16);
                    }
                    oq5Var4.p(false);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 3:
                ((Integer) obj2).getClass();
                szf.p((vnr) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                g0g.v((kor) obj3, (hq5) obj, rvf.R(7));
                return Unit.a;
            case 5:
                ((uqn) obj3).a += ((Float) obj2).floatValue();
                return Unit.a;
            case 6:
                x2s x2sVar = (x2s) obj3;
                o2s o2sVar = x2sVar.c;
                hq5 hq5Var4 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var4;
                if (oq5Var5.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean z2 = x2sVar.d;
                    if (z2) {
                        oq5Var5.Z(-57361911);
                        boolean h3 = oq5Var5.h(o2sVar);
                        Object K4 = oq5Var5.K();
                        if (h3 || K4 == kjnVar) {
                            lgq lgqVar = new lgq(1, o2sVar, o2s.class, "selectTab", "selectTab(I)V", 0, 10);
                            oq5Var5.k0(lgqVar);
                            K4 = lgqVar;
                        }
                        szf.o(o2sVar, (Function1) ((h9f) K4), a.a(vciVar, "tabs_block_container"), oq5Var5, 384);
                        oq5Var5.p(false);
                    } else {
                        if (z2) {
                            throw vz1.i(oq5Var5, 1383621841, false);
                        }
                        oq5Var5.Z(-57100209);
                        boolean h4 = oq5Var5.h(o2sVar);
                        Object K5 = oq5Var5.K();
                        if (h4 || K5 == kjnVar) {
                            lgq lgqVar2 = new lgq(1, o2sVar, o2s.class, "selectTab", "selectTab(I)V", 0, 11);
                            oq5Var5.k0(lgqVar2);
                            K5 = lgqVar2;
                        }
                        wdg.m(o2sVar, (Function1) ((h9f) K5), a.a(vciVar, "tabs_block_container"), oq5Var5, 384);
                        oq5Var5.p(false);
                    }
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                ngg.g((sg2) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 8:
                ((Integer) obj2).getClass();
                ixf.h((y8p) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 9:
                vki vkiVar = (vki) obj3;
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var5;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                if (vkiVar instanceof tki) {
                    num = Integer.valueOf(R.string.listening_history_day_title_today);
                } else if (vkiVar instanceof uki) {
                    num = Integer.valueOf(R.string.listening_history_day_title_yesterday);
                } else if (vkiVar instanceof rki) {
                    num = Integer.valueOf(R.string.listening_history_day_title_day_before_yesterday);
                } else {
                    if (!(vkiVar instanceof ski)) {
                        b6e.s();
                        return null;
                    }
                    num = null;
                }
                if (num == null) {
                    oq5 oq5Var7 = (oq5) hq5Var5;
                    oq5Var7.Z(-1465891978);
                    oq5Var7.p(false);
                } else {
                    oq5 oq5Var8 = (oq5) hq5Var5;
                    oq5Var8.Z(-1465891977);
                    str = rvf.N(num.intValue(), new Object[]{vkiVar.f()}, oq5Var8);
                    oq5Var8.p(false);
                }
                if (str == null) {
                    str = vkiVar.f();
                }
                String str3 = str;
                oq5 oq5Var9 = (oq5) hq5Var5;
                Object K6 = oq5Var9.K();
                if (K6 == kjnVar) {
                    K6 = new phs(i2);
                    oq5Var9.k0(K6);
                }
                xcs.b(str3, a.a(nfp.b(vciVar, false, (Function1) K6), "music_history_title_day"), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oq5Var9, 0, 0, 131068);
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                cb0.q((z5t) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 11:
                p5t p5tVar = (p5t) obj3;
                hq5 hq5Var6 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var6;
                if (oq5Var10.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    w4k E = a0g.E(R.drawable.ic_trailer_24, 0, oq5Var10);
                    agr agrVar = eq0.a;
                    long j3 = ((dq0) oq5Var10.j(agrVar)).a.a;
                    yci a2 = androidx.compose.foundation.layout.b.a.a(vciVar, b2c.j);
                    Float f = p5tVar.h;
                    if (f != null) {
                        float floatValue = f.floatValue();
                        int i4 = d85.o;
                        d85Var = new d85(mvt.z(floatValue, 0.6f, 0.45f, 0.0f, 24));
                    } else {
                        d85Var = p5tVar.e;
                    }
                    if (d85Var == null) {
                        oq5Var10.Z(-2014572810);
                        j = ((dq0) oq5Var10.j(agrVar)).c.a;
                        oq5Var10.p(false);
                    } else {
                        oq5Var10.Z(-2014578545);
                        oq5Var10.p(false);
                        j = d85Var.a;
                    }
                    gae.b(E, null, a.a(androidx.compose.foundation.layout.a.m(d.m(androidx.compose.foundation.a.b(a2, j, ugo.a), 40), 8), "trailer_icon"), j3, oq5Var10, 48, 0);
                } else {
                    oq5Var10.S();
                }
                return Unit.a;
            case 12:
                skt sktVar = (skt) obj3;
                hq5 hq5Var7 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var11 = (oq5) hq5Var7;
                if (oq5Var11.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    qkt qktVar = sktVar.a;
                    rzf.n(null, qktVar.d, qktVar.e, qktVar.b.a, qktVar.c, oq5Var11, 0);
                } else {
                    oq5Var11.S();
                }
                return Unit.a;
            case 13:
                cr crVar = (cr) obj3;
                jlt jltVar = (jlt) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                jltVar.getClass();
                vbv vbvVar = (vbv) crVar.b;
                jltVar.getClass();
                return new n7e(vbvVar, null, booleanValue, new ilt(crVar, jltVar, r8 ? 1 : 0), new ilt(crVar, jltVar, i3));
            case 14:
                zhs zhsVar = (zhs) obj3;
                hq5 hq5Var8 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var12 = (oq5) hq5Var8;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var13 = (oq5) hq5Var8;
                boolean f2 = oq5Var13.f(zhsVar);
                Object K7 = oq5Var13.K();
                if (f2 || K7 == kjnVar) {
                    K7 = new u8p(R.drawable.ic_info_24, R.string.clip_info_bottom_sheet_title, "dialog_action_video_clip_info", zhsVar);
                    oq5Var13.k0(K7);
                }
                ivf.o((u8p) K7, zhsVar, vci.a, null, null, oq5Var13, 384, 24);
                return Unit.a;
            case 15:
                jzb jzbVar = (jzb) obj3;
                hq5 hq5Var9 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var14 = (oq5) hq5Var9;
                if (oq5Var14.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    lg3.q(jzbVar, d.m(androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 8, 0.0f, 0.0f, 13), 24), ((dq0) oq5Var14.j(eq0.a)).a.a, oq5Var14, 48, 0);
                } else {
                    oq5Var14.S();
                }
                return Unit.a;
            case 16:
                m4u m4uVar = (m4u) obj3;
                hq5 hq5Var10 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var15 = (oq5) hq5Var10;
                if (oq5Var15.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    boolean z3 = m4uVar.c;
                    w4k E2 = a0g.E(z3 ? R.drawable.ic_like_active_24 : R.drawable.ic_like_unactive_24, 0, oq5Var15);
                    if (z3) {
                        oq5Var15.Z(-193422873);
                        j2 = ((dq0) oq5Var15.j(eq0.a)).a.g;
                    } else {
                        oq5Var15.Z(-193421908);
                        j2 = ((dq0) oq5Var15.j(eq0.a)).a.c;
                    }
                    oq5Var15.p(false);
                    gae.b(E2, null, b.c(a.a(vciVar, "video_clip_like"), "video_clip_is_liked", Boolean.valueOf(z3)), j2, oq5Var15, 48, 0);
                } else {
                    oq5Var15.S();
                }
                return Unit.a;
            case 17:
                int intValue8 = ((Integer) obj).intValue();
                ((ilu) obj2).getClass();
                return intValue8 + ((glu) obj3).a.a;
            case 18:
                ((Integer) obj2).getClass();
                int i5 = WaveGlShaderView.m;
                ((WaveGlShaderView) obj3).j(rvf.R(1), (hq5) obj);
                return Unit.a;
            case 19:
                euu euuVar = (euu) obj3;
                hq5 hq5Var11 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var16 = (oq5) hq5Var11;
                    if (oq5Var16.z()) {
                        oq5Var16.S();
                        return Unit.a;
                    }
                }
                yci d = d.d(vciVar, 1.0f);
                ta5 a3 = sa5.a(qx0.c, b2c.n, hq5Var11, 0);
                oq5 oq5Var17 = (oq5) hq5Var11;
                int i6 = oq5Var17.P;
                androidx.compose.runtime.internal.a l = oq5Var17.l();
                yci H = vnj.H(hq5Var11, d);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var17.d0();
                if (oq5Var17.O) {
                    oq5Var17.k(grbVar);
                } else {
                    oq5Var17.n0();
                }
                g0g.U(hq5Var11, a3, wp5.f);
                g0g.U(hq5Var11, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var17.O || !Intrinsics.d(oq5Var17.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var17, i6, kb5Var);
                }
                g0g.U(hq5Var11, H, wp5.d);
                String str4 = euuVar.a;
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                ges j4 = nu0.j();
                agr agrVar2 = eq0.a;
                oq5 oq5Var18 = (oq5) hq5Var11;
                xv7.j(str4, a.a(d.d(vciVar, 1.0f), "wave_list_item_title"), ((dq0) oq5Var18.j(agrVar2)).b.a, 0L, 0L, 0, 0L, 2, false, 2, 0, null, j4, hq5Var11, 48, 3120, 55288);
                String str5 = euuVar.b;
                if (str5 == null || str5.length() == 0) {
                    oq5Var17.Z(1194104268);
                } else {
                    oq5Var17.Z(1197622737);
                    u1g.l(hq5Var11, d.e(vciVar, mu0.a));
                    xv7.j(str5, a.a(d.d(vciVar, 1.0f), "wave_list_item_subtitle"), ((dq0) oq5Var18.j(agrVar2)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), hq5Var11, 48, 3120, 55288);
                }
                oq5Var17.p(false);
                oq5Var17.p(true);
                return Unit.a;
            case 20:
                List list = (List) obj;
                String str6 = (String) obj2;
                list.getClass();
                str6.getClass();
                ((c0v) obj3).a(list, false, null, str6);
                return Unit.a;
            case 21:
                goo gooVar = (goo) obj;
                ya0 ya0Var = (ya0) obj2;
                gooVar.getClass();
                ya0Var.getClass();
                return (d44) ((zoo) obj3).a(gooVar, ya0Var);
            case 22:
                cr crVar2 = (cr) obj3;
                String str7 = (String) obj;
                List list2 = (List) obj2;
                str7.getClass();
                list2.getClass();
                Integer num2 = (str7.hashCode() == 42 && str7.equals("*")) ? (Integer) crVar2.g : (Integer) ((HashMap) crVar2.d).get(str7);
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list2) {
                    ((mlt) obj5).getClass();
                    arrayList.add(obj5);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    mlt mltVar = (mlt) it.next();
                    nlt v0 = crVar2.v0(mltVar, num2);
                    cr crVar3 = mltVar.a;
                    jlt jltVar2 = mltVar.b;
                    crVar3.getClass();
                    crVar3.U(jltVar2, v0);
                }
                return Unit.a;
            case 23:
                dov dovVar = (dov) obj3;
                hq5 hq5Var12 = (hq5) obj;
                int intValue9 = ((Integer) obj2).intValue();
                oq5 oq5Var19 = (oq5) hq5Var12;
                if (oq5Var19.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Object K8 = oq5Var19.K();
                    if (K8 == kjnVar) {
                        iov iovVar = (iov) dovVar.h.getValue();
                        aov aovVar = (aov) dovVar.g.getValue();
                        t requireActivity = dovVar.requireActivity();
                        requireActivity.getClass();
                        aovVar.getClass();
                        K8 = new bov(iovVar, new sml(requireActivity));
                        oq5Var19.k0(K8);
                    }
                    pd.b(new qzm[0], false, ild.C(-726507294, new cov((bov) K8), oq5Var19), oq5Var19, 0, 2);
                } else {
                    oq5Var19.S();
                }
                return Unit.a;
            case 24:
                psv psvVar = (psv) obj3;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                ((String) obj2).getClass();
                ktv a4 = psvVar.a();
                if (a4 != null && booleanValue2) {
                    p0w p0wVar = psvVar.d;
                    String str8 = a4.b;
                    String str9 = a4.c;
                    boolean z4 = a4.i;
                    String str10 = (String) psvVar.c.invoke();
                    p0wVar.getClass();
                    str10.getClass();
                    nmb a5 = p0wVar.a();
                    String j5 = k5r.j(p0wVar, a5);
                    LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
                    m.put("hash", j5);
                    m.put("genre_tab", str10);
                    m.put("artist_id", str8);
                    eta.u(m, "artist_name", str9, z4, "insta_recommended");
                    m.put("_meta", nmb.u(2));
                    a5.C("Wizard.Artist.Showed", m);
                }
                return Unit.a;
            case 25:
                jd1 jd1Var = (jd1) obj3;
                hq5 hq5Var13 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var20 = (oq5) hq5Var13;
                    if (oq5Var20.z()) {
                        oq5Var20.S();
                        return Unit.a;
                    }
                }
                boolean z5 = jd1Var.c;
                yci q = androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 0.0f, 12, 0.0f, 11);
                long j6 = neg.n(hq5Var13).b.b;
                long j7 = ((dq0) ((oq5) hq5Var13).j(eq0.a)).a.c;
                neg.o(hq5Var13);
                neg.o(hq5Var13);
                a0g.e(z5, q, null, j6, j7, new b0g(R.drawable.ic_medium_like_active_20, R.drawable.ic_medium_like_unactive_20), hq5Var13, 48, 4);
                return Unit.a;
            case 26:
                cvv cvvVar = (cvv) obj3;
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                String str11 = (String) obj2;
                str11.getClass();
                cvvVar.getClass();
                rmb rmbVar = cvvVar.c;
                thj a6 = cvvVar.a();
                if (a6 != null) {
                    weo.H(rmbVar, a6, booleanValue3, str11, null);
                }
                return Unit.a;
            case 27:
                ((Integer) obj2).getClass();
                hdg.C((wvv) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                wdg.y((lwv) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                qzv.b((rzv) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
        }
    }

    public /* synthetic */ f5r(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
