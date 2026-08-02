package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import com.yandex.pulse.metrics.o;
import java.util.LinkedHashMap;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class jo5 implements pyc {
    public final /* synthetic */ int a;

    public /* synthetic */ jo5(int i) {
        this.a = i;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        kjn kjnVar = gq5.a;
        int i2 = 18;
        vci vciVar = vci.a;
        switch (i) {
            case 0:
                zkn zknVar = (zkn) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                zknVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(zknVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                bs1 k = zknVar.b.k();
                if (k instanceof as1) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    oq5Var2.Z(320951855);
                    irf.r(((as1) k).a, null, vci.a, zknVar.d, zknVar.e, 0.0f, null, oq5Var2, 432, 96);
                    oq5Var2.p(false);
                } else {
                    if (!Intrinsics.d(k, xr1.a) && !(k instanceof yr1) && !(k instanceof zr1)) {
                        throw vz1.i((oq5) hq5Var, 1534371709, false);
                    }
                    oq5 oq5Var3 = (oq5) hq5Var;
                    oq5Var3.Z(321438462);
                    qld.q(0, oq5Var3);
                    oq5Var3.p(false);
                }
                return Unit.a;
            case 1:
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var4 = (oq5) hq5Var2;
                if (oq5Var4.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    xcs.b(rvf.M(R.string.easy_login_bottom_sheet_button_later, oq5Var4), null, ((dq0) oq5Var4.j(eq0.a)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var4, 0, 0, 65530);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 2:
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var5 = (oq5) hq5Var3;
                if (oq5Var5.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                    xcs.b(rvf.M(R.string.empty_favourites_start_myvibe, oq5Var5), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oq5Var5, 0, 0, 131070);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 3:
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var6 = (oq5) hq5Var4;
                if (oq5Var6.P(intValue4 & 1, (intValue4 & 17) != 16)) {
                    xcs.b(rvf.M(R.string.mixes, oq5Var6), a.n(vciVar, 16, 4), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var6, 0, 0, 65532);
                } else {
                    oq5Var6.S();
                }
                return Unit.a;
            case 4:
                hq5 hq5Var5 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var7 = (oq5) hq5Var5;
                if (oq5Var7.P(intValue5 & 1, (intValue5 & 17) != 16)) {
                    xcs.b(rvf.M(R.string.nng_header, oq5Var7), a.n(vciVar, 16, 4), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var7, 0, 0, 65532);
                } else {
                    oq5Var7.S();
                }
                return Unit.a;
            case 5:
                hq5 hq5Var6 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var8 = (oq5) hq5Var6;
                if (oq5Var8.P(intValue6 & 1, (intValue6 & 17) != 16)) {
                    xcs.b(rvf.M(R.string.my_music_collections, oq5Var8), a.n(vciVar, 16, 4), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 0, 0, 65532);
                } else {
                    oq5Var8.S();
                }
                return Unit.a;
            case 6:
                hq5 hq5Var7 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((uvd) obj).getClass();
                oq5 oq5Var9 = (oq5) hq5Var7;
                if (oq5Var9.P(intValue7 & 1, (intValue7 & 17) != 16)) {
                    u1g.l(oq5Var9, d.e(vciVar, 24));
                } else {
                    oq5Var9.S();
                }
                return Unit.a;
            case 7:
                hq5 hq5Var8 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((c) obj).getClass();
                oq5 oq5Var10 = (oq5) hq5Var8;
                if (oq5Var10.P(intValue8 & 1, (intValue8 & 17) != 16)) {
                    kfh d = ug3.d(b2c.b, false);
                    int i3 = oq5Var10.P;
                    androidx.compose.runtime.internal.a l = oq5Var10.l();
                    yci H = vnj.H(oq5Var10, vciVar);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var10.d0();
                    if (oq5Var10.O) {
                        oq5Var10.k(grbVar);
                    } else {
                        oq5Var10.n0();
                    }
                    g0g.U(oq5Var10, d, wp5.f);
                    g0g.U(oq5Var10, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var10.O || !Intrinsics.d(oq5Var10.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var10, i3, kb5Var);
                    }
                    g0g.U(oq5Var10, H, wp5.d);
                    iab iabVar = erm.a;
                    frm frmVar = new frm(c3x.h(4280967033L));
                    tvd X = zwf.X(new fvf(0, 0), oq5Var10, 14);
                    v4b v4bVar = new v4b();
                    yci d2 = d.d(vciVar, 1.0f);
                    qo6 qo6Var = qo6.b;
                    Object K = oq5Var10.K();
                    if (K == kjnVar) {
                        K = new do5(11);
                        oq5Var10.k0(K);
                    }
                    Function0 function0 = (Function0) K;
                    Object K2 = oq5Var10.K();
                    if (K2 == kjnVar) {
                        K2 = new do5(12);
                        oq5Var10.k0(K2);
                    }
                    Function0 function02 = (Function0) K2;
                    Object K3 = oq5Var10.K();
                    if (K3 == kjnVar) {
                        K3 = new do5(13);
                        oq5Var10.k0(K3);
                    }
                    Function0 function03 = (Function0) K3;
                    Object K4 = oq5Var10.K();
                    if (K4 == kjnVar) {
                        K4 = new do5(14);
                        oq5Var10.k0(K4);
                    }
                    pd.m(iabVar, frmVar, null, X, v4bVar, function0, function02, function03, (Function0) K4, lbu.a, qo6Var, d2, null, null, oq5Var10, 920322432, 126976);
                    eud eudVar = new eud(0);
                    Object K5 = oq5Var10.K();
                    if (K5 == kjnVar) {
                        K5 = new do5(15);
                        oq5Var10.k0(K5);
                    }
                    Function0 function04 = (Function0) K5;
                    Object K6 = oq5Var10.K();
                    if (K6 == kjnVar) {
                        K6 = new do5(16);
                        oq5Var10.k0(K6);
                    }
                    Function0 function05 = (Function0) K6;
                    Object K7 = oq5Var10.K();
                    if (K7 == kjnVar) {
                        K7 = new do5(17);
                        oq5Var10.k0(K7);
                    }
                    tt0.l("ASTROWORLD", eudVar, function04, function05, (Function0) K7, d.d(vciVar, 1.0f), oq5Var10, 224646);
                    neg.e(0, 0, oq5Var10, a.q(b.a.a(vciVar, b2c.i), 0.0f, 0.0f, 0.0f, 36, 7));
                    oq5Var10.p(true);
                } else {
                    oq5Var10.S();
                }
                return Unit.a;
            case 8:
                c cVar = (c) obj;
                hq5 hq5Var9 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((oq5) hq5Var9).f(cVar) ? 4 : 2;
                }
                if ((intValue9 & 19) == 18) {
                    oq5 oq5Var11 = (oq5) hq5Var9;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        return Unit.a;
                    }
                }
                pd.g(0, 0, hq5Var9, d.x(d.e(d.d(vciVar, 1.0f), cVar.c() / 2), b2c.f, 2));
                return Unit.a;
            case 9:
                hq5 hq5Var10 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue10 & 17) == 16) {
                    oq5 oq5Var12 = (oq5) hq5Var10;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        return Unit.a;
                    }
                }
                xcs.b(rvf.M(R.string.no_text, hq5Var10), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, hq5Var10, 0, 0, 131070);
                return Unit.a;
            case 10:
                hq5 hq5Var11 = (hq5) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue11 & 17) == 16) {
                    oq5 oq5Var13 = (oq5) hq5Var11;
                    if (oq5Var13.z()) {
                        oq5Var13.S();
                        return Unit.a;
                    }
                }
                xcs.b(rvf.M(R.string.yes_text, hq5Var11), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, hq5Var11, 0, 0, 131070);
                return Unit.a;
            case 11:
                rmu rmuVar = (rmu) obj;
                int intValue12 = ((Integer) obj3).intValue();
                rmuVar.getClass();
                o5g.q(rmuVar, null, (hq5) obj2, intValue12 & 14);
                return Unit.a;
            case 12:
                lrp lrpVar = (lrp) obj;
                int intValue13 = ((Integer) obj3).intValue();
                lrpVar.getClass();
                trp.i(lrpVar, null, null, (hq5) obj2, 14 & intValue13, 6);
                return Unit.a;
            case 13:
                vm1 vm1Var = (vm1) obj;
                int intValue14 = ((Integer) obj3).intValue();
                vm1Var.getClass();
                on1.d(vm1Var, (hq5) obj2, intValue14 & 14);
                return Unit.a;
            case 14:
                l3 l3Var = (l3) obj;
                int intValue15 = ((Integer) obj3).intValue();
                l3Var.getClass();
                q6k.a(l3Var, null, (hq5) obj2, intValue15 & 14);
                return Unit.a;
            case 15:
                b4 b4Var = (b4) obj;
                int intValue16 = ((Integer) obj3).intValue();
                b4Var.getClass();
                men.a(b4Var, (hq5) obj2, intValue16 & 14);
                return Unit.a;
            case 16:
                c cVar2 = (c) obj;
                hq5 hq5Var12 = (hq5) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                cVar2.getClass();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((oq5) hq5Var12).f(cVar2) ? 4 : 2;
                }
                oq5 oq5Var14 = (oq5) hq5Var12;
                if (oq5Var14.P(intValue17 & 1, (intValue17 & 19) != 18)) {
                    xme x = ox6.x(null, oq5Var14, 7);
                    mn0 mn0Var = new mn0(rvf.M(R.string.favorite_playlist_title, oq5Var14));
                    float f = r43.a;
                    ges b = r43.b();
                    long j = ((dq0) oq5Var14.j(eq0.a)).b.a;
                    LinkedHashMap l2 = bow.l(x);
                    pn0 k2 = bow.k(cVar2, new xme[]{x});
                    Object K8 = oq5Var14.K();
                    if (K8 == kjnVar) {
                        K8 = new z35(21);
                        oq5Var14.k0(K8);
                    }
                    xv7.i(mn0Var, androidx.compose.ui.platform.a.a(nfp.b(vciVar, false, (Function1) K8), "collection_favourite_playlist_header_title"), j, 0L, 0L, 0, 0L, 0, false, 2, 0, l2, null, b, k2, null, oq5Var14, 0, 134220800, 614392);
                } else {
                    oq5Var14.S();
                }
                return Unit.a;
            case 17:
                khe kheVar = (khe) obj;
                hq5 hq5Var13 = (hq5) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                kheVar.getClass();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((oq5) hq5Var13).f(kheVar) ? 4 : 2;
                }
                oq5 oq5Var15 = (oq5) hq5Var13;
                if (oq5Var15.P(intValue18 & 1, (intValue18 & 19) != 18)) {
                    jhe.a(kheVar, null, oq5Var15, intValue18 & 14);
                } else {
                    oq5Var15.S();
                }
                return Unit.a;
            case 18:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                hq5 hq5Var14 = (hq5) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                if ((intValue19 & 6) == 0) {
                    intValue19 |= ((oq5) hq5Var14).g(booleanValue) ? 4 : 2;
                }
                if ((intValue19 & 19) == 18) {
                    oq5 oq5Var16 = (oq5) hq5Var14;
                    if (oq5Var16.z()) {
                        oq5Var16.S();
                        return Unit.a;
                    }
                }
                ows.c(intValue19 & 14, hq5Var14, null, booleanValue);
                return Unit.a;
            case 19:
                c cVar3 = (c) obj;
                hq5 hq5Var15 = (hq5) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                cVar3.getClass();
                if ((intValue20 & 6) == 0) {
                    intValue20 |= ((oq5) hq5Var15).f(cVar3) ? 4 : 2;
                }
                if ((intValue20 & 19) == 18) {
                    oq5 oq5Var17 = (oq5) hq5Var15;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        return Unit.a;
                    }
                }
                hvb c = ivb.c(cVar3.d(), cVar3.c(), ocg.u(hq5Var15), hq5Var15);
                gz2 gz2Var = b2c.o;
                oq5 oq5Var18 = (oq5) hq5Var15;
                boolean f2 = oq5Var18.f(c);
                Object K9 = oq5Var18.K();
                if (f2 || K9 == kjnVar) {
                    K9 = new v5(29, c);
                    oq5Var18.k0(K9);
                }
                weo.g(null, null, null, null, gz2Var, null, false, (Function1) K9, oq5Var18, 196608, 223);
                if (c instanceof fvb) {
                    oq5Var18.Z(-145600011);
                    etn.l(ivb.b.a(c), ild.C(-997927914, new m32(26, cVar3, (fvb) c), oq5Var18), oq5Var18, 56);
                } else {
                    oq5Var18.Z(-166777785);
                }
                oq5Var18.p(false);
                return Unit.a;
            case 20:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                hq5 hq5Var16 = (hq5) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                if ((intValue21 & 6) == 0) {
                    intValue21 |= ((oq5) hq5Var16).g(booleanValue2) ? 4 : 2;
                }
                if ((intValue21 & 19) == 18) {
                    oq5 oq5Var19 = (oq5) hq5Var16;
                    if (oq5Var19.z()) {
                        oq5Var19.S();
                        return Unit.a;
                    }
                }
                ows.c(intValue21 & 14, hq5Var16, null, booleanValue2);
                return Unit.a;
            case 21:
                hq5 hq5Var17 = (hq5) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                if ((intValue22 & 17) == 16) {
                    oq5 oq5Var20 = (oq5) hq5Var17;
                    if (oq5Var20.z()) {
                        oq5Var20.S();
                        return Unit.a;
                    }
                }
                xcs.b("Toggle loading", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, hq5Var17, 6, 0, 131070);
                return Unit.a;
            case 22:
                c cVar4 = (c) obj;
                hq5 hq5Var18 = (hq5) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                cVar4.getClass();
                if ((intValue23 & 6) == 0) {
                    intValue23 |= ((oq5) hq5Var18).f(cVar4) ? 4 : 2;
                }
                if ((intValue23 & 19) == 18) {
                    oq5 oq5Var21 = (oq5) hq5Var18;
                    if (oq5Var21.z()) {
                        oq5Var21.S();
                        return Unit.a;
                    }
                }
                hvb d3 = ivb.d(cVar4.d(), cVar4.c(), ocg.u(hq5Var18), hq5Var18);
                sxk a = rxk.a(c5b.a, 447);
                eml emlVar = eml.d;
                iil c2 = hil.c(o8g.s(new cml(a, dml.a()), 5), 6);
                oq5 oq5Var22 = (oq5) hq5Var18;
                Object K10 = oq5Var22.K();
                if (K10 == kjnVar) {
                    K10 = szf.g0(c2);
                    oq5Var22.k0(K10);
                }
                aqi aqiVar = (aqi) K10;
                boolean f3 = oq5Var22.f(d3) | oq5Var22.h(c2) | oq5Var22.h(gil.a);
                Object K11 = oq5Var22.K();
                if (f3 || K11 == kjnVar) {
                    K11 = new g3(i2, d3, c2, aqiVar);
                    oq5Var22.k0(K11);
                }
                weo.g(null, null, null, null, null, null, false, (Function1) K11, oq5Var22, 0, KotlinVersion.MAX_COMPONENT_VALUE);
                return Unit.a;
            case 23:
                hq5 hq5Var19 = (hq5) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                oq5 oq5Var23 = (oq5) hq5Var19;
                if (oq5Var23.P(intValue24 & 1, (intValue24 & 17) != 16)) {
                    gae.b(a0g.E(R.drawable.ic_voice_search_multicolor_24, 0, oq5Var23), rvf.M(R.string.shortcut_short_label_music_recognition_redesign, oq5Var23), null, 0L, oq5Var23, 0, 12);
                } else {
                    oq5Var23.S();
                }
                return Unit.a;
            case 24:
                androidx.compose.foundation.lazy.a aVar = (androidx.compose.foundation.lazy.a) obj;
                hq5 hq5Var20 = (hq5) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                aVar.getClass();
                if ((intValue25 & 6) == 0) {
                    intValue25 |= ((oq5) hq5Var20).f(aVar) ? 4 : 2;
                }
                oq5 oq5Var24 = (oq5) hq5Var20;
                if (oq5Var24.P(intValue25 & 1, (intValue25 & 19) != 18)) {
                    xcs.b(rvf.M(R.string.my_shelf_placeholder_title, oq5Var24), d.x(androidx.compose.foundation.lazy.a.b(aVar, a.o(vciVar, 24, 0.0f, 2)), b2c.f, 2), ((dq0) oq5Var24.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var24, 0, 0, 65016);
                } else {
                    oq5Var24.S();
                }
                return Unit.a;
            case 25:
                hq5 hq5Var21 = (hq5) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue26 & 17) == 16) {
                    oq5 oq5Var25 = (oq5) hq5Var21;
                    if (oq5Var25.z()) {
                        oq5Var25.S();
                        return Unit.a;
                    }
                }
                bn2 bn2Var = ((zn2) ((oq5) hq5Var21).j(ao2.a)).b;
                gae.b(a0g.E(R.drawable.ic_offline_mode_lte_wi_fi_40, 0, hq5Var21), null, d.c(vciVar, 1.0f), neg.m(hq5Var21).b.b, hq5Var21, 432, 0);
                return Unit.a;
            case 26:
                hq5 hq5Var22 = (hq5) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue27 & 17) == 16) {
                    oq5 oq5Var26 = (oq5) hq5Var22;
                    if (oq5Var26.z()) {
                        oq5Var26.S();
                    }
                }
                return Unit.a;
            case 27:
                o0k o0kVar = (o0k) obj;
                hq5 hq5Var23 = (hq5) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                o0kVar.getClass();
                if ((intValue28 & 6) == 0) {
                    intValue28 |= ((oq5) hq5Var23).f(o0kVar) ? 4 : 2;
                }
                oq5 oq5Var27 = (oq5) hq5Var23;
                if (oq5Var27.P(intValue28 & 1, (intValue28 & 19) != 18)) {
                    hag.c(0, oq5Var27, a.l(vciVar, o0kVar), rvf.M(R.string.my_shelf_new_episodes_placeholder_title, oq5Var27));
                } else {
                    oq5Var27.S();
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                hq5 hq5Var24 = (hq5) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                oq5 oq5Var28 = (oq5) hq5Var24;
                if (oq5Var28.P(intValue29 & 1, (intValue29 & 17) != 16)) {
                    gae.b(a0g.E(R.drawable.ic_warning_16, 0, oq5Var28), null, d.c(vciVar, 1.0f), ((dq0) oq5Var28.j(eq0.a)).b.d, oq5Var28, 432, 0);
                } else {
                    oq5Var28.S();
                }
                return Unit.a;
            default:
                hq5 hq5Var25 = (hq5) obj2;
                int intValue30 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                oq5 oq5Var29 = (oq5) hq5Var25;
                if (!oq5Var29.P(intValue30 & 1, (intValue30 & 17) != 16)) {
                    oq5Var29.S();
                }
                return Unit.a;
        }
    }
}
