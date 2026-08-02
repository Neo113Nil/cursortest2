package defpackage;

import android.media.ImageWriter;
import android.webkit.WebView;
import androidx.concurrent.futures.b;
import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.lootbox.impl.presentation.modal.LootBoxModalView;
import com.yandex.go.platform.js_api.JsNativeApi;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType;
import com.yandex.go.safety.center.lost_item.modal.navigation.a;
import com.yandex.go.safety.center.lost_item.modal.ui.LostItemModalView;
import com.yandex.go.settings.lang.LanguageModalView;
import com.yandex.go.shortcuts.dto.response.nestedbutton.NestedButton;
import com.yandex.go.shortcuts.impl.view.adapter.h;
import com.yandex.go.taxi.intercity.dashboard.impl.feedback.presentation.modal.IntercityDashboardFeedbackModalView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardButtonsContainerView;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.InternetPaymentSelectProviderFragment;
import flex.logger.view.LoggerOverlayView;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.widget.InstructionsView;
import ru.yandex.video.m3.player.impl.listeners.InternalFrameDropObserver;
import ru.yandex.video.m3.ui.debug.ListYandexPlayerManagerDebugView;

/* loaded from: classes10.dex */
public final /* synthetic */ class r7v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r7v(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        yqz yqzVar;
        int i = this.a;
        Object obj = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                mdl0 mdl0Var = (mdl0) obj2;
                ((mdl0) obj3).d();
                if (mdl0Var != null) {
                    mdl0Var.d();
                    break;
                }
                break;
            case 1:
                atx0 atx0Var = (atx0) obj2;
                try {
                    atx0Var.a(((j9v) obj3).a());
                    break;
                } catch (Exception e) {
                    atx0Var.a.r(e);
                    return;
                }
            case 2:
                ((rf61) obj3).onImageReleased((ImageWriter) obj2);
                break;
            case 3:
                InstructionsView.bindAction$lambda$0((InstructionsView) obj3, (a4w) obj2);
                break;
            case 4:
                InstructionsView.bindButton$lambda$0((InstructionsView) obj3, (v3w) obj2);
                break;
            case 5:
                IntercityDashboardButtonsContainerView.renderButton$lambda$0((IntercityDashboardButtonsContainerView) obj3, (vaw) obj2);
                break;
            case 6:
                IntercityDashboardFeedbackModalView.lambda$0$3((scw) obj3, (IntercityDashboardFeedbackModalView) obj2);
                break;
            case 7:
                xen xenVar = ((zcw) obj3).R;
                IntercityDashboardFeedbackModalView.reasonAdapter$lambda$0((IntercityDashboardFeedbackModalView) xenVar.b, ((auq) obj2).a);
                break;
            case 8:
                InternalFrameDropObserver.checkFrameDrop$lambda$2((InternalFrameDropObserver) obj3, (tls) obj2);
                break;
            case 9:
                ((xeo) obj3).success((Map) obj2);
                break;
            case 10:
                InternetPaymentSelectProviderFragment.setAdapterElements$lambda$16((auw) obj3, (InternetPaymentSelectProviderFragment) obj2);
                break;
            case 11:
                xvw xvwVar = (xvw) obj3;
                xvwVar.z = false;
                xvwVar.a();
                ((Runnable) obj2).run();
                break;
            case 12:
                ((cww) obj3).A.b((String) obj2, SharedPaymentContext.INVITE_CARD);
                break;
            case 13:
                b7x b7xVar = (b7x) obj3;
                String str = (String) obj2;
                prr prrVar = b7xVar.b;
                new mtw(5);
                xv10 xv10Var = prrVar.a;
                xv10Var.getClass();
                if (!((w4u) xv10Var.b).k(b7xVar)) {
                    new AndroidWebKitError("missing-instance-error", "Callback to `JavaScriptChannel.postMessage` failed because native instance was not in the instance manager.", "");
                    break;
                } else {
                    new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage", xv10Var.f(), obj).z(scc.g(b7xVar, str), new osb0());
                    break;
                }
            case 14:
                ((WebView) ((c9v) obj3).b).evaluateJavascript((String) obj2, null);
                break;
            case 15:
                ((JsNativeApi) obj3).l.evaluateJavascript((String) obj2, null);
                break;
            case 16:
                ru.yandex.taxi.web.nativeapi.JsNativeApi.postScriptEvaluation$lambda$0((ru.yandex.taxi.web.nativeapi.JsNativeApi) obj3, (String) obj2);
                break;
            case 17:
                LanguageModalView.getLangView$lambda$0((LanguageModalView) obj3, (i5z) obj2);
                break;
            case 18:
                ddf ddfVar = (ddf) obj3;
                pbj pbjVar = (pbj) obj2;
                HashSet hashSet = new HashSet();
                if (ddfVar != null) {
                    hashSet.addAll((LinkedHashSet) ddfVar.b);
                }
                ((sbj) pbjVar.a).getClass();
                break;
            case 19:
                ((Ref$ObjectRef) obj3).element = ((sls) obj2).invoke();
                break;
            case 20:
                NestedButton nestedButton = (NestedButton) obj2;
                ays aysVar = ((h) obj3).a0;
                if (aysVar == null) {
                    jst.e.q("onNestedClickListener is null in ListItemShortcutViewHolder");
                    break;
                } else {
                    aysVar.a(nestedButton.a);
                    break;
                }
            case 21:
                ListYandexPlayerManagerDebugView.updateItemsList$lambda$6((ListYandexPlayerManagerDebugView) obj3, (String) obj2);
                break;
            case 22:
                dq60 dq60Var = (dq60) obj2;
                dvy dvyVar = (dvy) ((evy) obj3).a.d();
                if (dvyVar != null) {
                    dq60Var.a(dvyVar.a);
                    break;
                }
                break;
            case 23:
                b bVar = (b) obj2;
                dvy dvyVar2 = (dvy) ((evy) obj3).a.d();
                if (dvyVar2 != null) {
                    bVar.b(dvyVar2.a);
                    break;
                } else {
                    bVar.d(new IllegalStateException("Observable has not yet been initialized with a value."));
                    break;
                }
            case 24:
                dvy dvyVar3 = (dvy) obj2;
                dq60 dq60Var2 = (dq60) ((Map.Entry) obj3).getKey();
                dvyVar3.getClass();
                dq60Var2.a(dvyVar3.a);
                break;
            case 25:
                LoggerOverlayView.onAttachedToWindow$lambda$10$lambda$9((List) obj3, (LoggerOverlayView) obj2);
                break;
            case 26:
                LootBoxModalView.configureTakeAllButtonClickListener$lambda$0((LootBoxModalView) obj3, (toz) obj2);
                break;
            case 27:
                LostItemModalView.createBullet$lambda$0$0((LostItemModalView) obj3, (erz) obj2);
                break;
            case 28:
                yqzVar = ((LostItemModalView) obj3).presenter;
                wqz wqzVar = ((hrz) obj2).e.c;
                a aVar = yqzVar.A;
                dqk0 dqk0Var = yqzVar.z;
                ppl0 ppl0Var = yqzVar.y;
                if (!(wqzVar instanceof tqz)) {
                    if (!wqzVar.equals(vqz.a)) {
                        if (!wqzVar.equals(uqz.a)) {
                            w511.b();
                            break;
                        }
                    } else {
                        ppl0Var.b(dqk0Var.a, SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType.BtnOpenHistory);
                        aVar.a();
                        break;
                    }
                } else {
                    ppl0Var.b(dqk0Var.a, SafetyCenterAnalytics$LostItemsAnalyticsTappedViewType.BtnCallDriver);
                    ((aj7) ((yi7) ((yvf0) aVar.a.I).get())).b(((tqz) wqzVar).a, false);
                    break;
                }
                break;
            default:
                x000 x000Var = (x000) obj3;
                lmo lmoVar = (lmo) obj2;
                if (!jl40.l(x000Var.w, lmoVar)) {
                    x000Var.w = lmoVar;
                    x000Var.f(lmoVar);
                    x000Var.b.invoke(lmoVar);
                    break;
                }
                break;
        }
    }
}
