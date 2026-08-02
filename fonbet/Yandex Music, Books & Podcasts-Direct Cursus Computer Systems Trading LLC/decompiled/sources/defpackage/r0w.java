package defpackage;

import android.content.Intent;
import android.view.View;
import android.webkit.WebView;
import com.yandex.passport.data.models.m;
import com.yandex.passport.internal.analytics.i0;
import com.yandex.passport.internal.social.esia.EsiaBindActivity;
import com.yandex.passport.internal.social.esia.b;
import com.yandex.passport.internal.social.esia.n0;
import com.yandex.passport.internal.ui.bouncer.error.s;
import com.yandex.passport.internal.ui.bouncer.roundabout.k;
import com.yandex.passport.internal.ui.bouncer.u;
import com.yandex.passport.internal.ui.challenge.delete.DeleteAccountActivity;
import com.yandex.passport.internal.ui.challenge.delete.g;
import com.yandex.passport.internal.ui.domik.relogin.d;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.router.i;
import com.yandex.passport.internal.ui.router.j;
import com.yandex.passport.internal.ui.sloth.StandaloneSlothComposeActivity;
import com.yandex.passport.internal.ui.sloth.ebs.BiometricVerificationActivity;
import com.yandex.passport.internal.ui.sloth.w;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import com.yandex.passport.sloth.ui.c1;
import com.yandex.plus.bdui.action.a;
import com.yandex.plus.bdui.plus.action.z;
import com.yandex.plus.bdui.plus.analytics.f;
import com.yandex.plus.bdui.plus.checkout.content.controller.f0;
import com.yandex.plus.bdui.plus.checkout.content.controller.l;
import com.yandex.plus.bdui.plus.checkout.content.controller.l0;
import com.yandex.plus.bdui.plus.checkout.content.controller.q;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.p3;
import com.yandex.plus.bdui.plus.scenario.h;
import com.yandex.plus.bdui.query.e;
import com.yandex.plus.core.analytics.c;
import com.yandex.plus.core.analytics.o;
import com.yandex.plus.core.graphql.fragment.g9;
import com.yandex.plus.core.graphql.fragment.h9;
import com.yandex.plus.core.graphql.fragment.i9;
import com.yandex.plus.core.graphql.fragment.s5;
import com.yandex.plus.core.graphql.fragment.t5;
import com.yandex.plus.core.graphql.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class r0w implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r0w(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x06dd, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(((java.lang.Number) r5.e()).floatValue(), (java.lang.Float) r5.g) != false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0721, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(((java.lang.Number) r1.e()).floatValue(), (java.lang.Float) r1.g) != false) goto L211;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        a aVar;
        int i = this.a;
        kjn kjnVar = gq5.a;
        int i2 = 10;
        int i3 = 2;
        int i4 = 3;
        boolean z2 = true;
        r13 = true;
        boolean z3 = true;
        z2 = true;
        z2 = true;
        z2 = true;
        z2 = true;
        z2 = true;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                swf.u((j1w) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                uwf.f((l1w) obj3, (hq5) obj, rvf.R(9));
                return Unit.a;
            case 2:
                fuw fuwVar = (fuw) obj3;
                float floatValue = ((Float) obj2).floatValue();
                long j = ((enj) obj).a;
                fk0 fk0Var = fuwVar.f;
                fk0 fk0Var2 = fuwVar.e;
                Boolean bool = fuwVar.j;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    if (floatValue == 1.0f) {
                        if (fuwVar.c() != 1.0f) {
                            float abs = Math.abs(enj.e(j)) / Math.abs(enj.f(j));
                            if (abs > 3.0f) {
                                if (enj.e(j) < 0.0f && Intrinsics.a(((Number) fk0Var2.e()).floatValue(), (Float) fk0Var2.f)) {
                                    z2 = false;
                                }
                                if (enj.e(j) > 0.0f) {
                                    break;
                                }
                            } else if (abs < 0.33d) {
                                if (enj.f(j) < 0.0f && Intrinsics.a(((Number) fk0Var.e()).floatValue(), (Float) fk0Var.f)) {
                                    z2 = false;
                                }
                                if (enj.f(j) > 0.0f) {
                                    break;
                                }
                            }
                        }
                        z2 = false;
                    }
                    fuwVar.j = Boolean.valueOf(z2);
                    z = z2;
                }
                return Boolean.valueOf(z);
            case 3:
                EsiaBindActivity esiaBindActivity = (EsiaBindActivity) obj3;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                int i5 = EsiaBindActivity.h;
                if ((intValue & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                n0 n0Var = (n0) esiaBindActivity.c.getValue();
                oq5 oq5Var2 = (oq5) hq5Var;
                boolean h = oq5Var2.h(esiaBindActivity);
                Object K = oq5Var2.K();
                if (h || K == kjnVar) {
                    K = new b(esiaBindActivity, z2 ? 1 : 0);
                    oq5Var2.k0(K);
                }
                Function1 function1 = (Function1) K;
                boolean h2 = oq5Var2.h(esiaBindActivity);
                Object K2 = oq5Var2.K();
                if (h2 || K2 == kjnVar) {
                    vlv vlvVar = new vlv(1, esiaBindActivity, EsiaBindActivity.class, "finishActivityWithResult", "finishActivityWithResult(Lcom/yandex/passport/internal/social/esia/EsiaBindViewModel$Result;)V", 0, 21);
                    oq5Var2.k0(vlvVar);
                    K2 = vlvVar;
                }
                Function1 function12 = (Function1) K2;
                boolean h3 = oq5Var2.h(esiaBindActivity);
                Object K3 = oq5Var2.K();
                if (h3 || K3 == kjnVar) {
                    vlv vlvVar2 = new vlv(1, esiaBindActivity, EsiaBindActivity.class, "finishActivityWithError", "finishActivityWithError(Ljava/lang/Throwable;)V", 0, 22);
                    oq5Var2.k0(vlvVar2);
                    K3 = vlvVar2;
                }
                Function1 function13 = (Function1) K3;
                boolean h4 = oq5Var2.h(esiaBindActivity);
                Object K4 = oq5Var2.K();
                if (h4 || K4 == kjnVar) {
                    K4 = new com.yandex.passport.internal.social.esia.a(esiaBindActivity, i4);
                    oq5Var2.k0(K4);
                }
                Function0 function0 = (Function0) K4;
                boolean h5 = oq5Var2.h(esiaBindActivity);
                Object K5 = oq5Var2.K();
                if (h5 || K5 == kjnVar) {
                    K5 = new com.yandex.passport.internal.social.esia.a(esiaBindActivity, 4);
                    oq5Var2.k0(K5);
                }
                com.yandex.passport.internal.ui.a.e(n0Var, function1, function12, function13, function0, (Function0) K5, oq5Var2, 0);
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                s.a((u) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 5:
                DeleteAccountActivity deleteAccountActivity = (DeleteAccountActivity) obj3;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i6 = DeleteAccountActivity.b;
                if ((intValue2 & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                com.yandex.passport.internal.ui.challenge.delete.b bVar = deleteAccountActivity.a;
                if (bVar == null) {
                    Intrinsics.j("component");
                    throw null;
                }
                oq5 oq5Var4 = (oq5) hq5Var2;
                boolean h6 = oq5Var4.h(deleteAccountActivity);
                Object K6 = oq5Var4.K();
                if (h6 || K6 == kjnVar) {
                    K6 = new k(i3, deleteAccountActivity);
                    oq5Var4.k0(K6);
                }
                g.a(bVar, (Function1) K6, oq5Var4, 0);
                return Unit.a;
            case 6:
                ((com.yandex.passport.internal.ui.domik.common.g) obj3).s.m((m) obj2);
                return Unit.a;
            case 7:
                d dVar = (d) obj3;
                com.yandex.passport.internal.ui.domik.d dVar2 = (com.yandex.passport.internal.ui.domik.d) obj;
                m mVar = (m) obj2;
                dVar.t.e(i0.c);
                com.yandex.passport.internal.ui.domik.b bVar2 = dVar.s;
                bVar2.getClass();
                dVar2.getClass();
                mVar.getClass();
                bVar2.a.q.m(new com.yandex.passport.internal.ui.base.m(new fb7(i2, dVar2, mVar), com.yandex.passport.internal.ui.domik.smsauth.a.y, false, 2));
                return Unit.a;
            case 8:
                GlobalRouterActivity globalRouterActivity = (GlobalRouterActivity) obj3;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    int i7 = GlobalRouterActivity.i;
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                j.a((i) globalRouterActivity.g.getValue(), hq5Var3, 0);
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                j.a((i) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 10:
                StandaloneSlothComposeActivity standaloneSlothComposeActivity = (StandaloneSlothComposeActivity) obj3;
                hq5 hq5Var4 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i8 = StandaloneSlothComposeActivity.c;
                if ((intValue3 & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var4;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                w wVar = standaloneSlothComposeActivity.a;
                if (wVar != null) {
                    c1.b(wVar, null, hq5Var4, 0, 2);
                    return Unit.a;
                }
                Intrinsics.j("component");
                throw null;
            case 11:
                BiometricVerificationActivity biometricVerificationActivity = (BiometricVerificationActivity) obj3;
                int intValue4 = ((Integer) obj).intValue();
                int i9 = BiometricVerificationActivity.a;
                Intent intent = new Intent();
                intent.putExtra("track_id", (String) obj2);
                biometricVerificationActivity.setResult(intValue4, intent);
                biometricVerificationActivity.finish();
                return Unit.a;
            case 12:
                RegisterWebAuthNActivity registerWebAuthNActivity = (RegisterWebAuthNActivity) obj3;
                int i10 = RegisterWebAuthNActivity.a;
                registerWebAuthNActivity.setResult(((Integer) obj).intValue(), (Intent) obj2);
                registerWebAuthNActivity.finish();
                return Unit.a;
            case 13:
                h hVar = (h) obj3;
                z zVar = (z) obj;
                e eVar = (e) obj2;
                zVar.getClass();
                eVar.getClass();
                if (zVar.e) {
                    return null;
                }
                return (com.yandex.plus.bdui.document.e) hVar.invoke(eVar);
            case 14:
                c cVar = (c) obj;
                com.yandex.plus.bdui.analytics.c cVar2 = (com.yandex.plus.bdui.analytics.c) obj2;
                cVar.getClass();
                cVar2.getClass();
                String str = cVar2.a;
                Map map = cVar2.b;
                com.yandex.plus.log.api.b bVar3 = ((com.yandex.plus.bdui.plus.analytics.e) obj3).b;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                if (bVar3.b(aVar2)) {
                    bVar3.c(aVar2, "PlusDiagnosticAnalyticsTransport", "sendEvent(); report event name = " + str + ", params = " + map);
                }
                cVar.reportDiagnosticEvent(str, map);
                return Unit.a;
            case 15:
                com.yandex.plus.analytics.dwh.a aVar3 = (com.yandex.plus.analytics.dwh.a) obj;
                com.yandex.plus.bdui.analytics.c cVar3 = (com.yandex.plus.bdui.analytics.c) obj2;
                aVar3.getClass();
                cVar3.getClass();
                String str2 = cVar3.a;
                Map map2 = cVar3.b;
                com.yandex.plus.log.api.b bVar4 = ((f) obj3).b;
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                if (bVar4.b(aVar4)) {
                    bVar4.c(aVar4, "PlusDwhAnalyticsTransport", "sendEvent(); report event name = " + str2 + ", params = " + map2);
                }
                aVar3.a(str2, map2);
                return Unit.a;
            case 16:
                com.yandex.plus.core.analytics.f fVar = (com.yandex.plus.core.analytics.f) obj;
                com.yandex.plus.bdui.analytics.c cVar4 = (com.yandex.plus.bdui.analytics.c) obj2;
                fVar.getClass();
                cVar4.getClass();
                String str3 = cVar4.a;
                Map map3 = cVar4.b;
                com.yandex.plus.log.api.b bVar5 = ((com.yandex.plus.bdui.plus.analytics.g) obj3).b;
                com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.c;
                if (bVar5.b(aVar5)) {
                    bVar5.c(aVar5, "PlusMetricaAnalyticsTransport", "sendEvent(); report event name = " + str3 + ", params = " + map3);
                }
                fVar.reportEvent(str3, map3);
                return Unit.a;
            case 17:
                com.yandex.plus.bdui.analytics.c cVar5 = (com.yandex.plus.bdui.analytics.c) obj3;
                com.yandex.plus.bdui.plus.analytics.h hVar2 = (com.yandex.plus.bdui.plus.analytics.h) obj;
                com.yandex.plus.bdui.analytics.c cVar6 = (com.yandex.plus.bdui.analytics.c) obj2;
                hVar2.getClass();
                cVar6.getClass();
                for (com.yandex.plus.bdui.analytics.a aVar6 : hVar2.d) {
                    com.yandex.plus.log.api.b bVar6 = hVar2.b;
                    com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.c;
                    if (bVar6.b(aVar7)) {
                        bVar6.c(aVar7, "PlusMultiAnalyticsTransport", "sendEvent(); event = " + cVar5 + " to transport = " + ern.a(aVar6.getClass()).h());
                    }
                    aVar6.a(cVar6);
                }
                return Unit.a;
            case 18:
                o oVar = (o) obj;
                com.yandex.plus.bdui.analytics.c cVar7 = (com.yandex.plus.bdui.analytics.c) obj2;
                oVar.getClass();
                cVar7.getClass();
                String str4 = cVar7.a;
                Map map4 = cVar7.b;
                com.yandex.plus.log.api.b bVar7 = ((com.yandex.plus.bdui.plus.analytics.e) obj3).b;
                com.yandex.plus.log.api.a aVar8 = com.yandex.plus.log.api.a.c;
                if (bVar7.b(aVar8)) {
                    bVar7.c(aVar8, "PlusStatboxAnalyticsTransport", "sendEvent(); report event name = " + str4 + ", params = " + map4);
                }
                oVar.reportStatboxEvent(str4, map4);
                return Unit.a;
            case 19:
                String str5 = (String) obj2;
                ((String) obj).getClass();
                str5.getClass();
                ((l) obj3).g.i(str5);
                return Unit.a;
            case 20:
                String str6 = (String) obj2;
                ((String) obj).getClass();
                str6.getClass();
                ((q) obj3).e.i(str6);
                return Unit.a;
            case 21:
                com.yandex.plus.bdui.plus.checkout.content.controller.u uVar = (com.yandex.plus.bdui.plus.checkout.content.controller.u) obj3;
                String str7 = (String) obj;
                String str8 = (String) obj2;
                str7.getClass();
                str8.getClass();
                com.yandex.plus.log.api.b bVar8 = uVar.f;
                com.yandex.plus.bdui.content.d dVar3 = uVar.h;
                if (dVar3 != null) {
                    com.yandex.plus.bdui.content.a aVar9 = dVar3.b;
                    Map e = uah.e(new Pair("text", str7), new Pair("url", str8));
                    com.yandex.plus.log.api.a aVar10 = com.yandex.plus.log.api.a.c;
                    if (bVar8.b(aVar10)) {
                        StringBuilder m = f1d.m("onLinkClick(", str7, ", ", str8, "); dispatch link click action = ");
                        m.append(((p3) aVar9).k);
                        m.append("with payload ");
                        m.append(e);
                        bVar8.c(aVar10, "PlusPayCounterOffersContentController", m.toString());
                    }
                    uVar.e(dVar3, ((p3) aVar9).k, e);
                    if (kotlin.text.c.v(str8, "plus-checkout://co-action/", false)) {
                        String k0 = StringsKt.k0(str8, "plus-checkout://co-action/", str8);
                        Map a = r1.a(dVar3.c);
                        if (a == null || (aVar = (a) a.get(k0)) == null) {
                            com.yandex.plus.log.api.a aVar11 = com.yandex.plus.log.api.a.d;
                            if (bVar8.b(aVar11)) {
                                bVar8.c(aVar11, "PlusPayCounterOffersContentController", hrg.s("onLinkClick(", str7, ", ", str8, "); action not found!"));
                            }
                        } else {
                            if (bVar8.b(aVar10)) {
                                com.appsflyer.internal.k.x(f1d.m("onLinkClick(", str7, ", ", str8, "); dispatch shared action = "), aVar, bVar8, aVar10, "PlusPayCounterOffersContentController");
                            }
                            uVar.e(dVar3, aVar, null);
                        }
                    } else {
                        uVar.e.i(str8);
                    }
                } else {
                    com.yandex.plus.log.api.a aVar12 = com.yandex.plus.log.api.a.d;
                    if (bVar8.b(aVar12)) {
                        bVar8.c(aVar12, "PlusPayCounterOffersContentController", hrg.s("onLinkClick(", str7, ", ", str8, "); update is null!"));
                    }
                }
                return Unit.a;
            case 22:
                f0 f0Var = (f0) obj3;
                String str9 = (String) obj;
                String str10 = (String) obj2;
                str9.getClass();
                str10.getClass();
                com.yandex.plus.log.api.b bVar9 = f0Var.f;
                com.yandex.plus.log.api.a aVar13 = com.yandex.plus.log.api.a.c;
                if (bVar9.b(aVar13)) {
                    bVar9.c(aVar13, "PlusPayPresaleContentController", "onLinkClick(" + str9 + ", " + str10 + ')');
                }
                f0Var.e.i(str10);
                return Unit.a;
            case 23:
                String str11 = (String) obj2;
                ((String) obj).getClass();
                str11.getClass();
                ((l0) obj3).d.i(str11);
                return Unit.a;
            case 24:
                com.yandex.plus.webview.core.d dVar4 = (com.yandex.plus.webview.core.d) obj;
                String str12 = (String) obj2;
                dVar4.getClass();
                str12.getClass();
                x97.y(gld.e((kotlinx.coroutines.a) ((com.yandex.plus.bdui.flex.ui.s) obj3).f), null, null, new com.yandex.passport.sloth.ui.q(dVar4, str12, false, null, 5), 3);
                return Unit.a;
            case 25:
                int intValue5 = ((Integer) obj).intValue();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                s9f[] s9fVarArr = com.yandex.plus.core.debug.panel.internal.presentation.view.o.I;
                ((boolean[]) obj3)[intValue5] = booleanValue;
                return Unit.a;
            case 26:
                vqn vqnVar = (vqn) obj3;
                int intValue6 = ((Integer) obj).intValue();
                View view = (View) obj2;
                view.getClass();
                Object[] objArr = view.getForeground() != null;
                if (intValue6 <= vqnVar.a || view.getVisibility() != 0 || view.getAlpha() <= 0.0f || (view.getBackground() == null && objArr == false)) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 27:
                String str13 = (String) obj2;
                s9f[] s9fVarArr2 = com.yandex.plus.home.feature.webviews.internal.simple.e.s;
                ((WebView) obj).getClass();
                str13.getClass();
                com.yandex.plus.home.feature.webviews.internal.simple.j jVar = ((com.yandex.plus.home.feature.webviews.internal.simple.e) obj3).a;
                jVar.getClass();
                if (jVar.w) {
                    com.yandex.plus.core.analytics.logging.b bVar10 = com.yandex.plus.core.analytics.logging.b.b;
                    String q = hrg.q("onPageFinished() url=", str13, ", errorOccured=true");
                    jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar10, q, null);
                } else {
                    com.yandex.plus.core.analytics.logging.b bVar11 = com.yandex.plus.core.analytics.logging.b.b;
                    String concat = "onPageFinished() url=".concat(str13);
                    jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar11, concat, null);
                    rar rarVar = jVar.x;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    jVar.i0();
                    if (!jVar.v) {
                        jVar.v = true;
                        jVar.r.a(jVar.h);
                    }
                }
                return Unit.a;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                v1 v1Var = (v1) obj;
                com.yandex.plus.home.graphql.panel.mappers.a aVar14 = (com.yandex.plus.home.graphql.panel.mappers.a) obj2;
                v1Var.getClass();
                aVar14.getClass();
                com.yandex.plus.bdui.plus.content.controller.f fVar2 = ((com.yandex.plus.home.graphql.panel.g) obj3).i;
                fVar2.getClass();
                i9 i9Var = v1Var.a.b;
                ArrayList arrayList = i9Var.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ArrayList arrayList3 = ((h9) it.next()).a;
                    ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((g9) it2.next()).b);
                    }
                    z75.t(arrayList2, arrayList4);
                }
                ArrayList arrayList5 = v1Var.b.b.a;
                ArrayList arrayList6 = new ArrayList();
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    ArrayList arrayList7 = ((t5) it3.next()).a;
                    ArrayList arrayList8 = new ArrayList(v75.o(arrayList7, 10));
                    Iterator it4 = arrayList7.iterator();
                    while (it4.hasNext()) {
                        arrayList8.add(((s5) it4.next()).b);
                    }
                    z75.t(arrayList6, arrayList8);
                }
                return new com.yandex.plus.home.repository.api.model.panel.i(i9Var.a, i9Var.b, fVar2.n(arrayList2, arrayList6, false, aVar14));
            default:
                com.yandex.plus.pay.log.impl.b.f(((com.yandex.plus.pay.internal.feature.closing.f) obj3).d, com.yandex.plus.pay.common.internal.log.a.j, "Failed to get closing offer", (com.yandex.plus.pay.api.exception.a) obj2, 8);
                return Unit.a;
        }
    }

    public /* synthetic */ r0w(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
