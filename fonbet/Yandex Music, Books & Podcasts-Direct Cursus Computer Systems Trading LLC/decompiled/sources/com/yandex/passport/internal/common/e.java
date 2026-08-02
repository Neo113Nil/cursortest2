package com.yandex.passport.internal.common;

import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.yandex.passport.R;
import com.yandex.passport.internal.config.p;
import com.yandex.passport.internal.core.accounts.s;
import com.yandex.passport.internal.core.accounts.y;
import com.yandex.passport.internal.flags.o;
import com.yandex.passport.internal.impl.r0;
import com.yandex.passport.internal.links.LinksHandlingActivity;
import com.yandex.passport.internal.report.reporters.k1;
import com.yandex.passport.internal.social.esia.x;
import com.yandex.passport.internal.ui.autologin.AutoLoginRetryActivity;
import com.yandex.passport.internal.ui.bouncer.challenge.m;
import com.yandex.passport.internal.ui.bouncer.chooser.r;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import com.yandex.passport.internal.ui.bouncer.v;
import com.yandex.passport.internal.ui.challenge.changecurrent.g0;
import com.yandex.passport.internal.ui.challenge.delete.j1;
import com.yandex.passport.internal.ui.challenge.delete.t;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetComposeActivity;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.b0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.w;
import com.yandex.passport.internal.ui.challenge.logout.e0;
import com.yandex.passport.internal.ui.domik.DomikActivity;
import com.yandex.passport.internal.ui.sloth.StandaloneSlothComposeActivity;
import com.yandex.passport.internal.ui.sloth.authsdk.z;
import com.yandex.passport.internal.ui.sloth.k0;
import defpackage.eta;
import defpackage.orq;
import defpackage.phg;
import defpackage.szf;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        String string;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Object systemService = ((f) obj2).a.getSystemService("phone");
                if (systemService instanceof TelephonyManager) {
                    return (TelephonyManager) systemService;
                }
                return null;
            case 1:
                return ((com.yandex.passport.internal.config.a) obj2).a.getSharedPreferences("passport_sso_pref", 0);
            case 2:
                return ((com.yandex.passport.internal.config.h) obj2).a.getSharedPreferences("ebs_config_pref", 0);
            case 3:
                return ((p) obj2).a.getSharedPreferences("white_list_pref", 0);
            case 4:
                return ((y) obj2).c.b(false);
            case 5:
                r0 r0Var = (r0) obj2;
                return new com.yandex.passport.internal.autologin.ui.a(r0Var, r0Var.a);
            case 6:
                LinksHandlingActivity linksHandlingActivity = (LinksHandlingActivity) obj2;
                com.yandex.passport.internal.flags.i iVar = linksHandlingActivity.j;
                return (iVar == null || !((Boolean) iVar.b(o.b0)).booleanValue()) ? linksHandlingActivity.d : linksHandlingActivity.e;
            case 7:
                return (String) ((com.yandex.passport.internal.report.d) obj2).a.c.getValue();
            case 8:
                return phg.a(((com.yandex.passport.internal.sloth.performers.f) obj2).a);
            case 9:
                x xVar = (x) obj2;
                return new com.yandex.passport.internal.social.esia.o(xVar.b, xVar.c, xVar.d, xVar.e, xVar.f);
            case 10:
                AutoLoginRetryActivity autoLoginRetryActivity = (AutoLoginRetryActivity) obj2;
                int i2 = AutoLoginRetryActivity.l;
                autoLoginRetryActivity.setResult(0);
                autoLoginRetryActivity.finish();
                return null;
            case 11:
                com.yandex.passport.internal.ui.bouncer.g gVar = (com.yandex.passport.internal.ui.bouncer.g) obj2;
                if (((Boolean) gVar.o.b(o.T)).booleanValue()) {
                    obj = new com.yandex.passport.internal.ui.bouncer.challenge.e(gVar.a, gVar.p);
                } else {
                    obj = gVar.j.get();
                    obj.getClass();
                }
                return (orq) obj;
            case 12:
                return szf.g0(new v(((s1) obj2).b.a.a.a, eta.e()));
            case 13:
                return new com.yandex.passport.internal.ui.bouncer.challenge.h(((m) obj2).b);
            case 14:
                ((com.yandex.passport.internal.ui.bouncer.chooser.h) obj2).k.a(y1.a);
                return Unit.a;
            case 15:
                r rVar = (r) obj2;
                return new com.yandex.passport.internal.ui.bouncer.chooser.k(rVar.b, rVar.d, rVar.c);
            case 16:
                com.yandex.passport.internal.ui.bouncer.sloth.g gVar2 = (com.yandex.passport.internal.ui.bouncer.sloth.g) obj2;
                com.yandex.passport.data.network.l lVar = new com.yandex.passport.data.network.l();
                com.yandex.passport.internal.ui.sloth.h hVar = gVar2.a;
                com.yandex.passport.internal.ui.bouncer.sloth.h hVar2 = gVar2.c;
                com.yandex.passport.internal.ui.bouncer.sloth.a aVar = gVar2.b;
                com.yandex.plus.core.network.api.utils.a aVar2 = gVar2.e;
                aVar.getClass();
                aVar.e = aVar2;
                aVar.d.c = Integer.valueOf(R.color.passport_roundabout_background);
                lVar.a = hVar.a(hVar2, aVar, gVar2.d);
                return lVar.s().f();
            case 17:
                g0 g0Var = (g0) obj2;
                return new com.yandex.passport.internal.ui.challenge.changecurrent.y(g0Var.b, g0Var.c, g0Var.d);
            case 18:
                t tVar = (t) obj2;
                return new com.yandex.passport.internal.ui.challenge.delete.o(tVar.b, tVar.c, tVar.d, tVar.e, tVar.f, tVar.g, tVar.h);
            case 19:
                j1 j1Var = (j1) obj2;
                com.yandex.passport.data.network.l lVar2 = new com.yandex.passport.data.network.l();
                com.yandex.passport.internal.ui.sloth.h hVar3 = j1Var.a;
                k0 k0Var = j1Var.c;
                com.yandex.passport.internal.ui.bouncer.sloth.a aVar3 = j1Var.b;
                int i3 = R.color.passport_roundabout_background;
                aVar3.getClass();
                aVar3.d.c = Integer.valueOf(i3);
                lVar2.a = hVar3.a(k0Var, aVar3, j1Var.d);
                return lVar2.s().f();
            case 20:
                e0 e0Var = (e0) obj2;
                return new com.yandex.passport.internal.social.esia.o(e0Var.b, e0Var.c, e0Var.d, e0Var.e);
            case 21:
                LogoutBottomSheetComposeActivity logoutBottomSheetComposeActivity = (LogoutBottomSheetComposeActivity) obj2;
                int i4 = LogoutBottomSheetComposeActivity.f;
                logoutBottomSheetComposeActivity.setResult(4);
                logoutBottomSheetComposeActivity.finish();
                return Unit.a;
            case 22:
                b0 b0Var = (b0) obj2;
                com.yandex.passport.internal.core.accounts.e eVar = b0Var.b;
                com.yandex.passport.internal.flags.i iVar2 = b0Var.c;
                s sVar = b0Var.d;
                com.yandex.passport.internal.ui.challenge.logout.t tVar2 = b0Var.e;
                return new w(eVar, iVar2, sVar, tVar2.a, tVar2.d, b0Var.f);
            case 23:
                com.yandex.passport.internal.flags.experiments.p pVar = (com.yandex.passport.internal.flags.experiments.p) obj2;
                return new com.yandex.passport.internal.social.esia.o((com.yandex.passport.internal.usecase.vpn.e) pVar.b, (com.yandex.passport.internal.config.o) pVar.c, (k1) pVar.d);
            case 24:
                ((DomikActivity) obj2).k.x.l(null);
                return null;
            case 25:
                Bundle arguments = ((com.yandex.passport.internal.ui.domik.samlsso.e) obj2).getArguments();
                if (arguments != null && (string = arguments.getString("auth_url_param")) != null) {
                    return string;
                }
                xq0.q("auth url is missing");
                return null;
            case 26:
                int i5 = StandaloneSlothComposeActivity.c;
                com.yandex.passport.internal.ui.sloth.w wVar = ((StandaloneSlothComposeActivity) obj2).a;
                if (wVar != null) {
                    return wVar.getViewModelFactory();
                }
                Intrinsics.j("component");
                throw null;
            case 27:
                com.yandex.passport.internal.ui.sloth.e0 e0Var2 = (com.yandex.passport.internal.ui.sloth.e0) obj2;
                com.yandex.passport.data.network.l lVar3 = new com.yandex.passport.data.network.l();
                com.yandex.passport.internal.ui.sloth.h hVar4 = e0Var2.a;
                k0 k0Var2 = e0Var2.b;
                com.yandex.passport.sloth.ui.dependencies.o oVar = e0Var2.c;
                int i6 = R.color.passport_roundabout_background;
                oVar.getClass();
                oVar.b().c = Integer.valueOf(i6);
                lVar3.a = com.yandex.passport.internal.ui.sloth.h.b(hVar4, k0Var2, oVar, 4);
                return lVar3.s().f();
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((com.yandex.passport.internal.ui.sloth.authsdk.e0) obj2).a(z.a);
                return Unit.a;
            default:
                com.yandex.passport.internal.ui.sloth.authsdk.w wVar2 = (com.yandex.passport.internal.ui.sloth.authsdk.w) obj2;
                return new com.yandex.passport.internal.ui.sloth.authsdk.s(wVar2.b, wVar2.c);
        }
    }
}
