package defpackage;

import android.app.Activity;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.passport.internal.analytics.j0;
import com.yandex.passport.internal.analytics.l;
import com.yandex.passport.internal.analytics.l0;
import com.yandex.passport.internal.analytics.n0;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.analytics.w;
import com.yandex.passport.internal.common.e;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.ui.bouncer.roundabout.k;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetComposeActivity;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.p;
import com.yandex.passport.internal.ui.domik.a0;
import com.yandex.passport.internal.ui.domik.b0;
import com.yandex.passport.internal.ui.domik.t;
import com.yandex.passport.internal.ui.domik.v;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.sloth.ebs.BiometricVerificationActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesActivity;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.plus.core.locale.b;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.PlaybackScope;

/* loaded from: classes4.dex */
public final /* synthetic */ class kws implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kws(yci yciVar, lnu lnuVar, pwu pwuVar) {
        this.a = 13;
        this.d = yciVar;
        this.b = lnuVar;
        this.c = pwuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        sdr sdrVar;
        int i = this.a;
        int i2 = 12;
        vci vciVar = vci.a;
        kjn kjnVar = gq5.a;
        int i3 = 3;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                lws.b((jws) obj5, (Function0) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                g0g.x((y5t) obj5, (tmb) obj4, (Function1) obj3, (hq5) obj, rvf.R(65));
                break;
            case 2:
                ((Integer) obj2).getClass();
                k5t.a((h5t) obj5, (a6t) obj4, (fvf) obj3, (hq5) obj, rvf.R(1));
                break;
            case 3:
                p5t p5tVar = (p5t) obj5;
                Function0 function0 = (Function0) obj4;
                Function0 function02 = (Function0) obj3;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    p1g.s(p5tVar, function0, function02, null, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            case 4:
                Function0 function03 = (Function0) obj4;
                Function0 function04 = (Function0) obj5;
                d85 d85Var = (d85) obj3;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                boolean z = ((Number) function03.invoke()).floatValue() > 0.5f;
                yci a = a.a(vciVar, "trailer_button");
                oq5 oq5Var3 = (oq5) hq5Var2;
                Object K = oq5Var3.K();
                if (K == kjnVar) {
                    K = new h4t(6);
                    oq5Var3.k0(K);
                }
                a0g.p(function04, nfp.a(a, (Function1) K), false, z, 0L, d85Var, bg3.e, oq5Var3, ScreenMirroringConfig.Video.BITRATE_1_5MB, 20);
            case 5:
                ((Integer) obj2).getClass();
                ixf.k((cjt) obj5, (njt) obj4, (tmb) obj3, (hq5) obj, rvf.R(513));
                break;
            case 6:
                ((Integer) obj2).getClass();
                q5g.p((x53) obj5, (eqp) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                break;
            case 7:
                apo apoVar = (apo) obj5;
                Activity activity = (Activity) obj4;
                bci bciVar = (bci) obj3;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var3;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                gao gaoVar = (gao) apoVar.c;
                x1u x1uVar = (x1u) apoVar.b;
                oq5 oq5Var5 = (oq5) hq5Var3;
                tmb tmbVar = ((hai) oq5Var5.j(iai.a)).b;
                activity.getClass();
                tmbVar.getClass();
                x1uVar.getClass();
                cr crVar = (cr) gaoVar.a;
                dda ddaVar = (dda) crVar.b;
                bjt bjtVar = new bjt(activity, new m((PlaybackScope) crVar.e, ddaVar, activity, (y) crVar.c, (ru0) crVar.f, 16), (kxi) crVar.d, ddaVar);
                boolean h = oq5Var5.h(x1uVar) | oq5Var5.h(crVar);
                Object K2 = oq5Var5.K();
                if (h || K2 == kjnVar) {
                    K2 = new wes(i2, x1uVar, crVar);
                    oq5Var5.k0(K2);
                }
                Function1 function1 = (Function1) K2;
                oq5Var5.a0(419377738);
                kfu a2 = rpg.a(oq5Var5);
                if (a2 == null) {
                    xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    break;
                } else {
                    bfu R = ngg.R(ern.a(f3u.class), a2, null, k5r.g(f3u.class, new p97(1), function1), a2 instanceof ssd ? ((ssd) a2).getDefaultViewModelCreationExtras() : gs6.b, oq5Var5);
                    oq5Var5.p(false);
                    f3u f3uVar = (f3u) R;
                    boolean f = oq5Var5.f(x1uVar);
                    Object K3 = oq5Var5.K();
                    if (f || K3 == kjnVar) {
                        x2u x2uVar = new x2u(activity, x1uVar, f3uVar, bjtVar, tmbVar, (nmj) ((jyr) crVar.h).getValue());
                        oq5Var5.k0(x2uVar);
                        K3 = x2uVar;
                    }
                    y1g.r((x2u) K3, bciVar, oq5Var5, 64);
                }
            case 8:
                ((Integer) obj2).getClass();
                v3g.r((a3u) obj5, (Function0) obj4, (yci) obj3, (hq5) obj, rvf.R(9));
                break;
            case 9:
                i3 i3Var = (i3) obj5;
                slu sluVar = (slu) obj4;
                kxi kxiVar = (kxi) obj3;
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var4;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        break;
                    }
                }
                wn5 wn5Var = (wn5) i3Var.d;
                oq5 oq5Var7 = (oq5) hq5Var4;
                boolean f2 = oq5Var7.f(sluVar);
                Object K4 = oq5Var7.K();
                if (f2 || K4 == kjnVar) {
                    K4 = new nlu(sluVar, kxiVar);
                    oq5Var7.k0(K4);
                }
                wn5Var.invoke((nlu) K4, oq5Var7, 0);
            case 10:
                ((Integer) obj2).getClass();
                ocg.h((pru) obj5, (nru) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                break;
            case 11:
                zru zruVar = (zru) obj5;
                sai saiVar = (sai) obj4;
                sdr sdrVar2 = (sdr) obj3;
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var8 = (oq5) hq5Var5;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        break;
                    }
                }
                if (((bsu) sdrVar2.getValue()).a) {
                    oq5 oq5Var9 = (oq5) hq5Var5;
                    oq5Var9.Z(255935713);
                    sdrVar = pm0.f(oq5Var9);
                    oq5Var9.p(false);
                } else {
                    oq5 oq5Var10 = (oq5) hq5Var5;
                    oq5Var10.Z(255996628);
                    Object K5 = oq5Var10.K();
                    if (K5 == kjnVar) {
                        K5 = tlm.h(1.0f, oq5Var10);
                    }
                    sdrVar = (poi) K5;
                    oq5Var10.p(false);
                }
                oq5 oq5Var11 = (oq5) hq5Var5;
                boolean h2 = oq5Var11.h(zruVar) | oq5Var11.f(saiVar);
                Object K6 = oq5Var11.K();
                if (h2 || K6 == kjnVar) {
                    K6 = new xes(21, zruVar, saiVar);
                    oq5Var11.k0(K6);
                }
                Function0 function05 = (Function0) K6;
                yci o = androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), 16, 0.0f, 2);
                boolean f3 = oq5Var11.f(sdrVar);
                Object K7 = oq5Var11.K();
                if (f3 || K7 == kjnVar) {
                    K7 = new f6u(sdrVar, 10);
                    oq5Var11.k0(K7);
                }
                hdg.n(384, 0, qld.j, oq5Var11, wyf.s(o, (Function0) K7), function05);
            case 12:
                ((Integer) obj2).getClass();
                u1g.r((onu) obj5, (yci) obj3, (Function0) obj4, (hq5) obj, rvf.R(1));
                break;
            case 13:
                yci yciVar = (yci) obj3;
                lnu lnuVar = (lnu) obj5;
                pwu pwuVar = (pwu) obj4;
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var12 = (oq5) hq5Var6;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        break;
                    }
                }
                yci a3 = a.a(d.d(yciVar, 1.0f), "dialog_action_wave");
                kfh d = ug3.d(b2c.f, false);
                oq5 oq5Var13 = (oq5) hq5Var6;
                int i4 = oq5Var13.P;
                androidx.compose.runtime.internal.a l = oq5Var13.l();
                yci H = vnj.H(hq5Var6, a3);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var13.d0();
                if (oq5Var13.O) {
                    oq5Var13.k(grbVar);
                } else {
                    oq5Var13.n0();
                }
                g0g.U(hq5Var6, d, wp5.f);
                g0g.U(hq5Var6, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var13.O || !Intrinsics.d(oq5Var13.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var13, i4, kb5Var);
                }
                g0g.U(hq5Var6, H, wp5.d);
                e9q.a(lnuVar, pwuVar, null, 0.0f, hq5Var6, 0, 12);
                oq5Var13.p(true);
                break;
            case 14:
                xjv xjvVar = (xjv) obj5;
                mjv mjvVar = (mjv) obj4;
                spd spdVar = (spd) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                xjvVar.getClass();
                spdVar.getClass();
                c1 c1Var = mjvVar.b;
                String str2 = c1Var.a;
                int i5 = c1Var.c;
                bjv bjvVar = mjvVar.c;
                iiv iivVar = new iiv(str2, i5, bjvVar);
                if (booleanValue) {
                    if (xjvVar.g) {
                        ((zhv) xjvVar.a.g.getValue()).a(ovk.p(iivVar, ejv.c));
                    } else {
                        xjvVar.d.a(ovk.p(iivVar, ejv.c));
                    }
                }
                exa exaVar = xjvVar.e;
                exaVar.b(booleanValue, str, new a63(new x43((cvo) exaVar.b.getValue(), c1Var.b, 4), irf.E(bjvVar, spdVar)), "");
                break;
            case 15:
                ((Integer) obj2).getClass();
                y1g.v((uht) obj5, (Function1) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                y7g.m((String) obj5, (yci) obj3, (ges) obj4, (hq5) obj, rvf.R(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ldg.j((hwv) obj5, (dwv) obj4, (sdr) obj3, (hq5) obj, rvf.R(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                wdg.u((lwv) obj5, (fvf) obj4, (yci) obj3, (hq5) obj, rvf.R(385));
                break;
            case 19:
                sdr sdrVar3 = (sdr) obj5;
                j1w j1wVar = (j1w) obj4;
                d8t d8tVar = (d8t) obj3;
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var14 = (oq5) hq5Var7;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        break;
                    }
                }
                oq5 oq5Var15 = (oq5) hq5Var7;
                boolean f4 = oq5Var15.f(sdrVar3);
                Object K8 = oq5Var15.K();
                if (f4 || K8 == kjnVar) {
                    K8 = new f6u(sdrVar3, 28);
                    oq5Var15.k0(K8);
                }
                avf.r(j1wVar, d8tVar, wyf.s(vciVar, (Function0) K8), oq5Var15, 0);
            case 20:
                ((Integer) obj2).getClass();
                avf.q((j1w) obj5, (rxv) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                avf.r((j1w) obj5, (d8t) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                break;
            case 22:
                j1w j1wVar2 = (j1w) obj5;
                rxv rxvVar = (rxv) obj4;
                d8t d8tVar2 = (d8t) obj3;
                hq5 hq5Var8 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var16 = (oq5) hq5Var8;
                    if (oq5Var16.z()) {
                        oq5Var16.S();
                        break;
                    }
                }
                j1wVar2.getClass();
                oq5 oq5Var17 = (oq5) hq5Var8;
                dyv dyvVar = ((d3w) oq5Var17.j(e3w.a)).b;
                heh hehVar = heh.a;
                Object K9 = oq5Var17.K();
                if (K9 == kjnVar) {
                    l1w l1wVar = j1wVar2.a;
                    K9 = new cyv(l1wVar.U(), l1wVar.P(), new vtm(j1wVar2), l1wVar.K(), l1wVar.L(), Intrinsics.d(j1wVar2.b.getValue(), e1w.a));
                    oq5Var17.k0(K9);
                }
                bfg.j((cyv) K9, hvf.a(0, 0, hq5Var8, 0, 3), rxvVar, d8tVar2, null, hq5Var8, 0);
            case 23:
                ((Integer) obj2).getClass();
                rvf.s((rxv) obj5, (Function0) obj4, (dzv) obj3, (hq5) obj, rvf.R(1));
                break;
            case 24:
                LogoutBottomSheetComposeActivity logoutBottomSheetComposeActivity = (LogoutBottomSheetComposeActivity) obj5;
                p pVar = (p) obj4;
                u uVar = (u) obj3;
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    int i6 = LogoutBottomSheetComposeActivity.f;
                    oq5 oq5Var18 = (oq5) hq5Var9;
                    if (oq5Var18.z()) {
                        oq5Var18.S();
                        break;
                    }
                }
                boolean z2 = logoutBottomSheetComposeActivity.a;
                oq5 oq5Var19 = (oq5) hq5Var9;
                boolean h3 = oq5Var19.h(logoutBottomSheetComposeActivity);
                Object K10 = oq5Var19.K();
                if (h3 || K10 == kjnVar) {
                    K10 = new k(i3, logoutBottomSheetComposeActivity);
                    oq5Var19.k0(K10);
                }
                Function1 function12 = (Function1) K10;
                boolean h4 = oq5Var19.h(pVar) | oq5Var19.h(logoutBottomSheetComposeActivity) | oq5Var19.h(uVar);
                Object K11 = oq5Var19.K();
                if (h4 || K11 == kjnVar) {
                    K11 = new zzq(29, pVar, logoutBottomSheetComposeActivity, uVar);
                    oq5Var19.k0(K11);
                }
                Function1 function13 = (Function1) K11;
                boolean h5 = oq5Var19.h(pVar) | oq5Var19.h(logoutBottomSheetComposeActivity) | oq5Var19.h(uVar);
                Object K12 = oq5Var19.K();
                if (h5 || K12 == kjnVar) {
                    K12 = new ftr(24, pVar, logoutBottomSheetComposeActivity, uVar);
                    oq5Var19.k0(K12);
                }
                Function0 function06 = (Function0) K12;
                boolean h6 = oq5Var19.h(logoutBottomSheetComposeActivity);
                Object K13 = oq5Var19.K();
                if (h6 || K13 == kjnVar) {
                    K13 = new e(21, logoutBottomSheetComposeActivity);
                    oq5Var19.k0(K13);
                }
                b.c(pVar, z2, function12, function13, function06, (Function0) K13, oq5Var19, 0);
            case 25:
                o0 o0Var = (o0) obj5;
                v vVar = (v) obj3;
                a0 a0Var = (a0) obj;
                t tVar = (t) obj2;
                a0Var.getClass();
                tVar.getClass();
                o0Var.getClass();
                xy0 xy0Var = new xy0(0);
                xy0Var.put(Constants.KEY_MESSAGE, "onSuccessPhonishAuth:start");
                w wVar = o0Var.a;
                l lVar = l.c;
                wVar.b(lVar, xy0Var);
                ((com.yandex.passport.internal.ui.domik.sms.b) obj4).u.e(j0.a);
                vVar.getClass();
                n0 n0Var = vVar.d;
                b0 b0Var = a0Var.p;
                n0Var.getClass();
                b0Var.getClass();
                n0Var.c(n0Var.e, l0.AUTH_SUCCESS, tah.b(new Pair("unsubscribe_from_maillists", b0Var.a)));
                vVar.a.u.m(tVar);
                xy0 xy0Var2 = new xy0(0);
                xy0Var2.put(Constants.KEY_MESSAGE, "onSuccessPhonishAuth:end");
                wVar.b(lVar, xy0Var2);
                break;
            case 26:
                com.yandex.passport.common.ui.a aVar = (com.yandex.passport.common.ui.a) obj5;
                PassportProcessGlobalComponent passportProcessGlobalComponent = (PassportProcessGlobalComponent) obj4;
                GlobalRouterActivity globalRouterActivity = (GlobalRouterActivity) obj3;
                hq5 hq5Var10 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i7 = GlobalRouterActivity.i;
                if ((intValue2 & 3) == 2) {
                    oq5 oq5Var20 = (oq5) hq5Var10;
                    if (oq5Var20.z()) {
                        oq5Var20.S();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.d.a(com.yandex.plus.pay.ui.core.b.z(aVar, hq5Var10), passportProcessGlobalComponent.getProperties().x, ild.C(68152242, new r0w(8, globalRouterActivity), hq5Var10), hq5Var10, 384, 0);
            case 27:
                com.yandex.passport.common.ui.a aVar2 = (com.yandex.passport.common.ui.a) obj5;
                com.yandex.passport.internal.ui.sloth.ebs.b bVar = (com.yandex.passport.internal.ui.sloth.ebs.b) obj4;
                BiometricVerificationActivity biometricVerificationActivity = (BiometricVerificationActivity) obj3;
                hq5 hq5Var11 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i8 = BiometricVerificationActivity.a;
                if ((intValue3 & 3) == 2) {
                    oq5 oq5Var21 = (oq5) hq5Var11;
                    if (oq5Var21.z()) {
                        oq5Var21.S();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.d.a(com.yandex.plus.pay.ui.core.b.z(aVar2, hq5Var11), bVar.isWhiteLabel(), ild.C(-1997001185, new com.yandex.passport.internal.ui.bouncer.p(10, bVar, biometricVerificationActivity), hq5Var11), hq5Var11, 384, 0);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                com.yandex.passport.common.ui.a aVar3 = (com.yandex.passport.common.ui.a) obj5;
                com.yandex.passport.internal.ui.sloth.plusdevices.b bVar2 = (com.yandex.passport.internal.ui.sloth.plusdevices.b) obj4;
                ManagingPlusDevicesActivity managingPlusDevicesActivity = (ManagingPlusDevicesActivity) obj3;
                hq5 hq5Var12 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i9 = ManagingPlusDevicesActivity.a;
                if ((intValue4 & 3) == 2) {
                    oq5 oq5Var22 = (oq5) hq5Var12;
                    if (oq5Var22.z()) {
                        oq5Var22.S();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.d.a(com.yandex.plus.pay.ui.core.b.z(aVar3, hq5Var12), bVar2.isWhiteLabel(), ild.C(-1024388948, new com.yandex.passport.internal.ui.bouncer.p(11, bVar2, managingPlusDevicesActivity), hq5Var12), hq5Var12, 384, 0);
            default:
                com.yandex.passport.common.ui.a aVar4 = (com.yandex.passport.common.ui.a) obj5;
                com.yandex.passport.internal.ui.sloth.webauthn.b bVar3 = (com.yandex.passport.internal.ui.sloth.webauthn.b) obj4;
                RegisterWebAuthNActivity registerWebAuthNActivity = (RegisterWebAuthNActivity) obj3;
                hq5 hq5Var13 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i10 = RegisterWebAuthNActivity.a;
                if ((intValue5 & 3) == 2) {
                    oq5 oq5Var23 = (oq5) hq5Var13;
                    if (oq5Var23.z()) {
                        oq5Var23.S();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.d.a(com.yandex.plus.pay.ui.core.b.z(aVar4, hq5Var13), bVar3.isWhiteLabel(), ild.C(-1107412191, new com.yandex.passport.internal.ui.bouncer.p(12, bVar3, registerWebAuthNActivity), hq5Var13), hq5Var13, 384, 0);
        }
        return Unit.a;
    }

    public /* synthetic */ kws(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ kws(int i, int i2, yci yciVar, Object obj, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.d = yciVar;
        this.c = obj2;
    }

    public /* synthetic */ kws(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ kws(Function0 function0, Function0 function02, d85 d85Var) {
        this.a = 4;
        this.c = function0;
        this.b = function02;
        this.d = d85Var;
    }
}
