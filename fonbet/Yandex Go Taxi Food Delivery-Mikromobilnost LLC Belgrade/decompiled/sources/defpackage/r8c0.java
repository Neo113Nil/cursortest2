package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.net.Uri;
import android.os.PowerManager;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import androidx.work.impl.foreground.SystemForegroundService;
import com.yandex.div.core.expression.variables.a;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.SuperAppMainOnboardingView;
import com.yandex.go.scooters.data.model.ScootersOnboardingExperiment;
import com.yandex.go.scooters.insurance.ScootersInsuranceModalView;
import com.yandex.go.scooters.insurance.analytics.InsuranceCloseReason;
import com.yandex.go.scooters.insurance.d;
import com.yandex.go.scooters.insurance.model.ScootersInsuranceCompletion;
import com.yandex.go.scooters.insurance.model.ScootersInsuranceControl;
import com.yandex.go.scooters.offers.v2.components.bottom.ScootersCardBottomComponent;
import com.yandex.go.scooters.offers.v2.components.options.ScootersCardSubscriptionComponent;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import com.yandex.go.scooters.passes.h;
import com.yandex.messaging.domain.statuses.j;
import com.yandex.plus.home.feature.webviews.internalapi.WebViewType;
import com.ybsdk.feature.qr.internal.screens.container.QrContainerItem;
import com.ybsdk.feature.qr.internal.screens.container.QrContainerScreenParams;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.QrGenerationFeatureData;
import defpackage.tls;
import java.util.List;
import java.util.UUID;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.cashback.f;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.preorder.source.domain.t;
import ru.yandex.taxi.scooters.presentation.ontheway.domain.model.ScootersOnTheWayAction;
import ru.yandex.taxi.summary.promotions.analytics.SummaryPromotionsAnalytics$SummaryState;

/* loaded from: classes13.dex */
public final /* synthetic */ class r8c0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ r8c0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ScootersCardSubscriptionComponent subscriptionComponentLazy$lambda$0;
        tls tlsVar;
        zy11 attachOnboardingView$lambda$2;
        boolean z = true;
        switch (this.a) {
            case 0:
                return new vlr("PlacesFlexContainer", new zm5((a) this.x, 4), null, (g0p) this.b, null, null, null, null, null, null, (k6x) this.c, null, null, null, null, null, null, null, (cac0) this.w, 522218);
            case 1:
                z0j z0jVar = (z0j) this.b;
                oep0 oep0Var = (oep0) this.c;
                f fVar = (f) this.w;
                w2d0 w2d0Var = (w2d0) this.x;
                z0jVar.b();
                ((pep0) oep0Var).f(fVar, new e0h(w2d0Var), hxx.a);
                return zy11.a;
            case 2:
                QrContainerScreenParams qrContainerScreenParams = (QrContainerScreenParams) this.b;
                v5c0 v5c0Var = (v5c0) this.c;
                jdg0 jdg0Var = (jdg0) this.w;
                d7g0 d7g0Var = (d7g0) this.x;
                ListBuilder a = rcc.a();
                a.add(QrContainerItem.QR_SCAN);
                if (((CommonFeatureFlag) ((b) ((y4a0) jdg0Var).c).d(wlp.Y).getData()).isEnabled()) {
                    d7g0Var.getClass();
                }
                b bVar = (b) ((y4a0) jdg0Var).c;
                if (((QrGenerationFeatureData) bVar.d(bVar.i.p).getData()).isEnabled()) {
                    a.add(QrContainerItem.QR_GENERATE);
                }
                ListBuilder j = a.j();
                com.ybsdk.feature.passes.widget.internal.a aVar = (com.ybsdk.feature.passes.widget.internal.a) v5c0Var.b;
                aVar.getClass();
                t8j0 t8j0Var = new t8j0();
                p370 p370Var = aVar.c;
                b bVar2 = ((tv3) p370Var.c).a;
                bVar2.getClass();
                if (((CommonFeatureFlag) bVar2.d(wlp.d0).getData()).isEnabled() && !p370Var.z()) {
                    z = false;
                }
                return new o6g0(j, qrContainerScreenParams, 0, new nm90(t8j0Var, z));
            case 3:
                subscriptionComponentLazy$lambda$0 = ScootersCardBottomComponent.subscriptionComponentLazy$lambda$0((ScootersCardBottomComponent) this.b, (Context) this.c, (pav) this.w, (tse) this.x);
                return subscriptionComponentLazy$lambda$0;
            case 4:
                d dVar = (d) this.b;
                ScootersInsuranceControl scootersInsuranceControl = (ScootersInsuranceControl) this.c;
                String str = (String) this.w;
                ScootersInsuranceModalView scootersInsuranceModalView = (ScootersInsuranceModalView) this.x;
                dVar.h(InsuranceCloseReason.ENABLE_INSURANCE_BUTTON, scootersInsuranceControl, str);
                tlsVar = scootersInsuranceModalView.onComplete;
                tlsVar.invoke(ScootersInsuranceCompletion.CLOSED);
                return zy11.a;
            case 5:
                ((com.yandex.go.scooters.offers.v2.newbie_guide.b) this.b).S((String) this.c, (hee0) this.w, (ScootersOnboardingExperiment) this.x);
                return zy11.a;
            case 6:
                com.yandex.go.scooters.offer_on_camera.b bVar3 = (com.yandex.go.scooters.offer_on_camera.b) this.b;
                v3o0 v3o0Var = (v3o0) this.c;
                jqo0 jqo0Var = new jqo0(new iqo0((CharSequence) this.w, (CharSequence) this.x));
                bVar3.I.a.b("Perf.ScootersQrRouter.Launch");
                bVar3.A((m950) bVar3.D.get(), new spo0(v3o0Var.a, jqo0Var), new y3o0(bVar3));
                return zy11.a;
            case 7:
                ru.yandex.taxi.scooters.presentation.ontheway.f fVar2 = (ru.yandex.taxi.scooters.presentation.ontheway.f) this.b;
                String str2 = (String) this.c;
                zuo0 zuo0Var = (zuo0) this.w;
                ScootersOnTheWayAction scootersOnTheWayAction = (ScootersOnTheWayAction) this.x;
                qwo0 qwo0Var = fVar2.B;
                rme0 rme0Var = qwo0Var.k;
                kgx[] kgxVarArr = qwo0.B;
                qwo0Var.k.setValue(qwo0Var, kgxVarArr[9], kotlin.collections.a.o0((List) rme0Var.getValue(qwo0Var, kgxVarArr[9]), str2));
                fVar2.Og(zuo0Var, scootersOnTheWayAction);
                return zy11.a;
            case 8:
                ((h) this.b).S((sco0) this.c, (ScootersPassesFromScreen) this.w, (String) this.x);
                return zy11.a;
            case 9:
                com.yandex.go.scooters.b bVar4 = (com.yandex.go.scooters.b) this.b;
                pxm0 pxm0Var = (pxm0) this.c;
                sls slsVar = (sls) this.w;
                qpo0 qpo0Var = (qpo0) this.x;
                com.yandex.go.scooters.offer_on_camera.b bVar5 = bVar4.h0;
                if (bVar5 == null) {
                    bVar5 = (com.yandex.go.scooters.offer_on_camera.b) bVar4.O.get();
                    bVar4.h0 = bVar5;
                }
                bVar4.A(bVar5, new v3o0(pxm0Var, qpo0Var), new klo0(bVar4, pxm0Var, slsVar));
                return zy11.a;
            case 10:
                yaq0 yaq0Var = (yaq0) this.b;
                return new waq0(yaq0Var.a, ((c0g) ((i6r) this.c)).P5(), (taq0) this.w, yaq0Var.c, (qgn0) this.x, yaq0Var.b);
            case 11:
                int[] iArr = (int[]) this.b;
                float[] fArr = (float[]) this.c;
                Shader.TileMode tileMode = (Shader.TileMode) this.w;
                fes0 fes0Var = (fes0) this.x;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.5f, 0.0f, -0.5f, iArr, fArr, tileMode);
                linearGradient.setLocalMatrix(fes0Var.e);
                return linearGradient;
            case 12:
                ((wit0) ((t) this.b).l.a(true)).c((zzs) this.c, (String) this.w, (PositionInitAction) this.x);
                return zy11.a;
            case 13:
                znu0 znu0Var = (znu0) this.b;
                zqc zqcVar = (zqc) this.c;
                el41 el41Var = (el41) this.w;
                WebViewType webViewType = (WebViewType) this.x;
                return new com.yandex.plus.home.feature.webviews.internal.stories.contract.a(zqcVar, el41Var, znu0Var.I, znu0Var.x, znu0Var.w, znu0Var.e(), znu0Var.f(), znu0Var.c, znu0Var.y, znu0Var.z, znu0Var.A, znu0Var.B, znu0Var.C, znu0Var.D, znu0Var.E, znu0Var.F, znu0Var.G, znu0Var.H, webViewType, znu0Var.K, znu0Var.J);
            case 14:
                ((ru.yandex.taxi.summary.promotions.interactor.a) this.b).c.b((zkv0) this.c, (SummaryPromotionsAnalytics$SummaryState) this.w, (ActionButton) this.x);
                return zy11.a;
            case 15:
                attachOnboardingView$lambda$2 = SuperAppMainOnboardingView.attachOnboardingView$lambda$2((ViewGroup) this.b, (SuperAppMainOnboardingView) this.c, (j170) this.w, (String) this.x);
                return attachOnboardingView$lambda$2;
            case 16:
                z3x0 z3x0Var = (z3x0) this.b;
                Uri uri = (Uri) this.c;
                String str3 = (String) this.w;
                final tls tlsVar2 = (tls) this.x;
                ((CookieManager) z3x0Var.b.getValue()).setCookie(uri.toString(), str3, new ValueCallback() { // from class: com.yandex.quark.webchat.cookie.internal.a
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        ((WebCookieManagerExtensionsKt$setCookie$2$1) tls.this).invoke((Boolean) obj);
                    }
                });
                return zy11.a;
            case 17:
                j jVar = (j) this.b;
                String str4 = (String) this.c;
                zt21 zt21Var = (zt21) this.w;
                pzt0 pzt0Var = (pzt0) this.x;
                au21 au21Var = jVar.a;
                if (jl40.l(au21Var.o, str4)) {
                    bh11 bh11Var = au21Var.m;
                    if (bh11Var != null) {
                        au21Var.h.removeCallbacks(bh11Var);
                    }
                    au21Var.m = null;
                    au21Var.n = e3n.c;
                    au21Var.o = "";
                }
                zt21Var.cancel();
                pzt0Var.a(null);
                return zy11.a;
            case 18:
                m951 m951Var = (m951) this.b;
                UUID uuid = (UUID) this.c;
                s2s s2sVar = (s2s) this.w;
                Context context = (Context) this.x;
                String uuid2 = uuid.toString();
                fa51 d = m951Var.c.d(uuid2);
                if (d == null || d.b.a()) {
                    ny61.r("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    r6f0 r6f0Var = (r6f0) m951Var.b;
                    synchronized (r6f0Var.k) {
                        try {
                            hgz.g().h(r6f0.l, "Moving WorkSpec (" + uuid2 + ") to the foreground");
                            androidx.work.impl.d dVar2 = (androidx.work.impl.d) r6f0Var.g.remove(uuid2);
                            if (dVar2 != null) {
                                if (r6f0Var.a == null) {
                                    PowerManager.WakeLock a2 = u041.a(r6f0Var.b);
                                    r6f0Var.a = a2;
                                    a2.acquire();
                                }
                                r6f0Var.f.put(uuid2, dVar2);
                                r6f0Var.b.startForegroundService(y2x0.a(r6f0Var.b, udq0.q(dVar2.a), s2sVar));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    n951 q = udq0.q(d);
                    String str5 = y2x0.C;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", s2sVar.a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", s2sVar.b);
                    intent.putExtra("KEY_NOTIFICATION", s2sVar.c);
                    intent.putExtra("KEY_WORKSPEC_ID", q.a);
                    intent.putExtra("KEY_GENERATION", q.b);
                    context.startService(intent);
                }
                return null;
            case 19:
                return Boolean.valueOf(pr51.b((pr51) this.b, (v3k) this.c, (fpl) this.w, (rvo) this.x));
            case 20:
                return Boolean.valueOf(pr51.c((pr51) this.b, (f9l) this.c, (fpl) this.w, (rvo) this.x));
            case 21:
                return Boolean.valueOf(pr51.d((pr51) this.b, (nnk) this.c, (fpl) this.w, (rvo) this.x));
            default:
                return Boolean.valueOf(pr51.a((pr51) this.b, (DivVisibilityAction) this.c, (fpl) this.w, (rvo) this.x));
        }
    }
}
