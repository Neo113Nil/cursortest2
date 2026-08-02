package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.common.entities.CreditLimitPaymentMethodEntity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.common.domain.entities.Action;
import com.ybsdk.core.design.theme.ThemedParams;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.deeplink.generated.OpenWebAction;
import com.ybsdk.di.modules.features.nfc.a;
import com.ybsdk.feature.banners.api.PrizeHintEntity;
import com.ybsdk.feature.dashboard.api.model.ProductId;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.actions.Intent;
import com.ybsdk.feature.main.internal.screens.userCards.UserCardsFragment;
import com.ybsdk.feature.pfm.internal.ui.PfmFragment;
import com.ybsdk.feature.pfm.internal.ui.widgets.PFMCalendarView;
import com.ybsdk.feature.qr.payments.api.QrPaymentsArguments;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.QrPaymentsMainFragment;
import com.ybsdk.feature.status.screen.api.StatusScreenParams;
import com.ybsdk.feature.status.screen.internal.ui.StatusScreenFragment;
import com.ybsdk.feature.webview.api.WebViewAppearanceOption;
import com.ybsdk.feature.webview.api.WebViewControl;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import com.ybsdk.feature.webview.api.WebViewStatusBar;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;
import com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusFragment;
import com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusScreenParams;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes3.dex */
public final class s1h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public s1h(z9b0 z9b0Var, ContextThemeWrapper contextThemeWrapper, FragmentActivity fragmentActivity) {
        this.a = 8;
        this.b = contextThemeWrapper;
        this.c = fragmentActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c1, code lost:
    
        if (r2.equals("arrow") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0169, code lost:
    
        if (r2.equals("none") == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a1  */
    @Override // defpackage.k3h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        fh51 dh51Var;
        String v;
        Map map;
        String paramsJson;
        YBProduct yBProduct;
        Action action;
        List singletonList;
        WebViewAppearanceOption noToolbar;
        WebViewAppearanceOption webViewAppearanceOption;
        String auth;
        WebViewScreenParams.Auth auth2;
        ColorModel headerColor;
        int i = this.a;
        int i2 = 0;
        List list = EmptyList.a;
        x0h x0hVar = x0h.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CardLanding)) {
                    return x0hVar;
                }
                ((AppAnalyticsReporter) obj2).k.a.a("card.create.initiated", null);
                return new v0h(((df8) ((cf8) obj)).b(), null, 6);
            case 1:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.Close)) {
                    return x0hVar;
                }
                String landingFirstRunQueryParam = ((DeeplinkAction.Close) baseDeeplinkAction).getLandingFirstRunQueryParam();
                if (landingFirstRunQueryParam != null) {
                    ((AppAnalyticsReporter) obj2).o.f(landingFirstRunQueryParam);
                }
                ((tfl0) obj).e();
                return new v0h(list, null, 6);
            case 2:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CloseSdkWithResult)) {
                    return x0hVar;
                }
                DeeplinkAction.CloseSdkWithResult closeSdkWithResult = (DeeplinkAction.CloseSdkWithResult) baseDeeplinkAction;
                h5c h5cVar = (h5c) obj2;
                String scenario = closeSdkWithResult.getScenario();
                if (jl40.l(scenario, "credit_limit_payment_method")) {
                    dh51Var = new dh51(closeSdkWithResult.getScenario(), closeSdkWithResult.getParams());
                    try {
                        String str = closeSdkWithResult.getParams().get(TarifficatorScenarioActivity.RESULT_KEY);
                        CreditLimitPaymentMethodEntity creditLimitPaymentMethodEntity = (CreditLimitPaymentMethodEntity) (str != null ? h5cVar.d.fromJson(str) : null);
                        if (creditLimitPaymentMethodEntity != null && creditLimitPaymentMethodEntity.getStatus() != CreditLimitPaymentMethodEntity.CreditLimitStatus.UNKNOWN) {
                            dh51Var = h5cVar.a(closeSdkWithResult, creditLimitPaymentMethodEntity);
                        }
                    } catch (Throwable th) {
                        x4c.g("Could not extract CreditLimitPaymentMethodEntity data", th, null, null, 12);
                    }
                } else if (jl40.l(scenario, "credit_limit_upgrade")) {
                    gff gffVar = h5cVar.b.f;
                    gffVar.a.m0.a.a("tech.session.cache_reset", null);
                    gffVar.c.f();
                    dh51Var = new ch51("credit_limit_upgrade", closeSdkWithResult.getParams());
                } else {
                    dh51Var = new dh51(closeSdkWithResult.getScenario(), closeSdkWithResult.getParams());
                }
                h5cVar.a.f(dh51Var);
                ((tfl0) obj).f();
                return new v0h(list, null, 6);
            case 3:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.CreateNfcShortcut)) {
                    return x0hVar;
                }
                ((a) obj2).a(new j1(10, (tfl0) obj));
                return new v0h(list, null, 6);
            case 4:
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                if (!(baseDeeplinkAction instanceof DeeplinkAction.PrizesSnackbar)) {
                    return x0hVar;
                }
                DeeplinkAction.PrizesSnackbar prizesSnackbar = (DeeplinkAction.PrizesSnackbar) baseDeeplinkAction;
                v5c0 v5c0Var = (v5c0) ((tu4) obj2).c.get();
                List<PrizeHintEntity> prizeHintEntities = prizesSnackbar.getPrizeHintEntities();
                v4f0 v4f0Var = (v4f0) v5c0Var.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : prizeHintEntities) {
                    PrizeHintEntity prizeHintEntity = (PrizeHintEntity) obj3;
                    boolean z = v4f0Var.a.getBoolean("prize_hint_id:".concat(prizeHintEntity.m366getPrizeHintIdkyR0wrU()), false);
                    if (!z) {
                        String m366getPrizeHintIdkyR0wrU = prizeHintEntity.m366getPrizeHintIdkyR0wrU();
                        SharedPreferences.Editor edit = v4f0Var.a.edit();
                        edit.putBoolean("prize_hint_id:".concat(m366getPrizeHintIdkyR0wrU), true);
                        edit.commit();
                    }
                    if (!z) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!evu0.J(((PrizeHintEntity) next).getText())) {
                        arrayList2.add(next);
                    }
                }
                if (arrayList2.isEmpty()) {
                    v = null;
                } else if (arrayList2.size() == 1) {
                    v = ((PrizeHintEntity) kotlin.collections.a.P(arrayList2)).getText();
                } else {
                    String string = fragmentActivity.getString(dzh0.ybsdk_loyalty_prizes_snackbar_subtitle_and);
                    PrizeHintEntity prizeHintEntity2 = (PrizeHintEntity) kotlin.collections.a.Z(arrayList2);
                    String p = oyr.p(" ", string, prizeHintEntity2.getText());
                    v = cvu0.v(kotlin.collections.a.X(arrayList2, Extension.FIX_SPACE, null, null, new vld0(28), 30), Extension.FIX_SPACE + prizeHintEntity2.getText(), p, false);
                }
                if (v != null) {
                    com.ybsdk.widgets.common.snackbar.a aVar = Snackbar.Companion;
                    n0t0 n0t0Var = new n0t0(unr0.h(Text.Companion, dzh0.ybsdk_loyalty_prizes_snackbar_title), new Text.Constant(v));
                    Long duration = prizesSnackbar.getDuration();
                    com.ybsdk.widgets.common.snackbar.a.a(aVar, fragmentActivity, n0t0Var, duration != null ? new j0t0(duration.longValue()) : j0t0.b, 8);
                }
                return new v0h(list, null, 6);
            case 5:
                if (!(baseDeeplinkAction instanceof Intent)) {
                    return x0hVar;
                }
                Intent intent = (Intent) baseDeeplinkAction;
                if (rje.k((ContextThemeWrapper) obj2, new android.content.Intent("android.intent.action.VIEW", intent.getUri()).addFlags(SelfTester_JCP.IMITA))) {
                    return new v0h(list, null, 6);
                }
                if (intent.getFallback() != null) {
                    return ((l3h) ((j3h) ((yvf0) obj).get())).d(intent.getFallback());
                }
                x4c.g("Unable to open in webview", null, String.valueOf(intent.getUri()), null, 10);
                return new v0h(list, null, 6);
            case 6:
                SharedPreferences sharedPreferences = ((ppc) obj2).a;
                if (!(baseDeeplinkAction instanceof DeeplinkAction.OpenOnce)) {
                    return x0hVar;
                }
                DeeplinkAction.OpenOnce openOnce = (DeeplinkAction.OpenOnce) baseDeeplinkAction;
                Set<String> stringSet = sharedPreferences.getStringSet("once_opened_deeplink_ids", null);
                if (stringSet == null) {
                    stringSet = EmptySet.a;
                }
                j3h j3hVar = (j3h) ((yvf0) obj).get();
                if (stringSet.contains(openOnce.getId())) {
                    String nextUrl = openOnce.getNextUrl();
                    return nextUrl != null ? h791.c(j3hVar, nextUrl) : x0hVar;
                }
                y0h c = h791.c(j3hVar, openOnce.getOnceUrl());
                if (!(c instanceof v0h)) {
                    return c;
                }
                sharedPreferences.edit().putStringSet("once_opened_deeplink_ids", v4r0.i(stringSet, openOnce.getId())).apply();
                return c;
            case 7:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.OpenSdk)) {
                    return x0hVar;
                }
                List b = ((l3h) ((j3h) obj2)).b(((u470) obj).a());
                if (b != null) {
                    list = b;
                }
                return new v0h(list, null, 6);
            case 8:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.PfmCalendarBottomSheet)) {
                    return x0hVar;
                }
                DeeplinkAction.PfmCalendarBottomSheet pfmCalendarBottomSheet = (DeeplinkAction.PfmCalendarBottomSheet) baseDeeplinkAction;
                erg ergVar = new erg(bei.B);
                Calendar a = ergVar.a(pfmCalendarBottomSheet.getStartDate());
                Calendar a2 = ergVar.a(pfmCalendarBottomSheet.getEndDate());
                Calendar a3 = ergVar.a(pfmCalendarBottomSheet.getFirstAvailableDate());
                if (a3 == null) {
                    a3 = kdb1.f(kdb1.e());
                }
                ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) obj2;
                y390 a4 = y390.a(y390.g, q6i0.a(q6i0.e, a3, null, a, a2, 2));
                PFMCalendarView pFMCalendarView = new PFMCalendarView(contextThemeWrapper, null, 0, 6, null);
                pFMCalendarView.render(a4);
                BottomSheetDialogView bottomSheetDialogView = new BottomSheetDialogView(contextThemeWrapper, null, 0, 6, null);
                YbButtonView.a aVar2 = new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_common_design_button_select), null, null, null, null, null, null, pFMCalendarView.hasValidRangeDate(), false, null, 3582);
                bottomSheetDialogView.onPrimaryAction(new fx00(16, pFMCalendarView, bottomSheetDialogView));
                bottomSheetDialogView.onSecondaryAction(new fx00(17, pFMCalendarView, a4));
                pFMCalendarView.setOnRangePickerStateChangedListener(new vqy(pFMCalendarView, a4, bottomSheetDialogView, aVar2, 16));
                bottomSheetDialogView.render(new BottomSheetDialogView.State(new e(null, null, new w390(pFMCalendarView, 2), 3), aVar2, new YbButtonView.a(new Text.Resource(dzh0.ybsdk_common_design_button_reset), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, new h(new ColorModel.Attr(ung0.ybColor_textIcon_primary), new Text.Resource(dzh0.ybsdk_pfm_transactions_for_period)), 81656));
                BottomSheetDialogView.show$default(bottomSheetDialogView, (FragmentActivity) obj, null, 2, null);
                return new v0h(list, null, 6);
            case 9:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.Pfm)) {
                    return x0hVar;
                }
                if (((CommonFeatureFlag) ((b) obj2).d(wlp.f).getData()).isEnabled()) {
                    ((aab0) ((z9b0) obj)).b.getClass();
                    list = Collections.singletonList(new FragmentScreen("PfmScreen", false, null, TransitionPolicyType.NONE, qoi0.a(PfmFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 2, null));
                } else {
                    x4c.g("Unable to open Pfm screen", null, null, null, 14);
                }
                return new v0h(list, null, 6);
            case 10:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.QrPayment)) {
                    return x0hVar;
                }
                DeeplinkAction.QrPayment qrPayment = (DeeplinkAction.QrPayment) baseDeeplinkAction;
                a8g0 a8g0Var = (a8g0) obj2;
                QrPaymentsArguments qrPaymentsArguments = new QrPaymentsArguments(qrPayment.getUrl().toString(), qrPayment.getQrSource(), qrPayment.getOrigin(), qrPayment.getAgreementId(), qrPayment.getAutopaymentId(), ((CommonFeatureFlag) ((b) obj).d(wlp.I0).getData()).isEnabled() ? OpenScreenRequirement.WithYbSession.INSTANCE : OpenScreenRequirement.WithBuid.INSTANCE);
                a8g0Var.b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("QrPaymentsMainScreen", false, qrPaymentsArguments, TransitionPolicyType.POPUP, qoi0.a(QrPaymentsMainFragment.class), qrPaymentsArguments.getScreenRequirement(), 2, null)), null, 6);
            case 11:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.SendAnalytics)) {
                    return x0hVar;
                }
                DeeplinkAction.SendAnalytics sendAnalytics = (DeeplinkAction.SendAnalytics) baseDeeplinkAction;
                JsonAdapter adapter = ((Moshi) obj).adapter(Types.newParameterizedType(Map.class, String.class, Object.class));
                try {
                    paramsJson = sendAnalytics.getParamsJson();
                } catch (Exception e) {
                    x4c.g("Unable to parse JSON with analytics params from deeplink", e, null, null, 12);
                }
                if (paramsJson != null) {
                    map = (Map) adapter.fromJson(paramsJson);
                    ((AppAnalyticsReporter) obj2).b(sendAnalytics.getEventName(), map);
                    return new v0h(list, null, 6);
                }
                map = null;
                ((AppAnalyticsReporter) obj2).b(sendAnalytics.getEventName(), map);
                return new v0h(list, null, 6);
            case 12:
                com.ybsdk.screens.registration.a aVar3 = (com.ybsdk.screens.registration.a) obj;
                b bVar = aVar3.e;
                hri0 hri0Var = aVar3.b;
                if (!(baseDeeplinkAction instanceof DeeplinkAction.StartLandingGo)) {
                    return x0hVar;
                }
                DeeplinkAction.StartLandingGo startLandingGo = (DeeplinkAction.StartLandingGo) baseDeeplinkAction;
                ((AppAnalyticsReporter) obj2).o.f(startLandingGo.getLandingFirstRunQueryParam());
                String str2 = startLandingGo.getAdditionalParams().get(SdkUri$QueryParam.PRODUCT.getParamValue());
                YBProduct.Companion.getClass();
                YBProduct[] values = YBProduct.values();
                int length = values.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        yBProduct = values[i3];
                        String name = yBProduct.name();
                        Locale locale = Locale.ROOT;
                        if (!name.toLowerCase(locale).equals(str2 != null ? str2.toLowerCase(locale) : null)) {
                            i3++;
                        }
                    } else {
                        yBProduct = null;
                    }
                }
                if (yBProduct == null) {
                    amt amtVar = cya1.a;
                    yBProduct = amtVar != null ? amtVar.a : null;
                    if (yBProduct == null) {
                        yBProduct = YBProduct.WALLET;
                    }
                }
                String str3 = startLandingGo.getAdditionalParams().get(SdkUri$QueryParam.ACTION.getParamValue());
                Action.Companion.getClass();
                Action[] values2 = Action.values();
                int length2 = values2.length;
                while (true) {
                    if (i2 < length2) {
                        action = values2[i2];
                        String name2 = action.name();
                        Locale locale2 = Locale.ROOT;
                        if (!name2.toLowerCase(locale2).equals(str3 != null ? str3.toLowerCase(locale2) : null)) {
                            i2++;
                        }
                    } else {
                        action = null;
                    }
                }
                amt amtVar2 = cya1.a;
                Object yltVar = amtVar2 != null ? amtVar2.b : new ylt();
                Map<String, String> additionalParams = startLandingGo.getAdditionalParams();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : additionalParams.entrySet()) {
                    if (!jl40.l(entry.getKey(), SdkUri$QueryParam.PRODUCT.getParamValue())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                int i4 = action == null ? -1 : k1h.c[action.ordinal()];
                if (i4 != -1) {
                    if (i4 == 1) {
                        String uri = startLandingGo.getDeeplinkUri().toString();
                        bVar.getClass();
                        RegistrationApplicationStatusScreenParams.OpenProduct openProduct = new RegistrationApplicationStatusScreenParams.OpenProduct(yBProduct, ((CommonFeatureFlag) bVar.d(wlp.K0).getData()).isEnabled(), linkedHashMap, uri);
                        hri0Var.getClass();
                        singletonList = Collections.singletonList(new FragmentScreen("RegistrationApplicationStatusScreen", false, openProduct, null, qoi0.a(RegistrationApplicationStatusFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null));
                    } else {
                        if (i4 != 2) {
                            w511.b();
                            return null;
                        }
                        singletonList = Collections.singletonList(com.ybsdk.screens.registration.a.d(aVar3, yBProduct, linkedHashMap, false, startLandingGo.getDeeplinkUri().toString(), 12));
                    }
                    return new v0h(singletonList, null, 6);
                }
                YBProduct yBProduct2 = yBProduct;
                if (yltVar.equals(zlt.a)) {
                    String uri2 = startLandingGo.getDeeplinkUri().toString();
                    bVar.getClass();
                    RegistrationApplicationStatusScreenParams.OpenProduct openProduct2 = new RegistrationApplicationStatusScreenParams.OpenProduct(yBProduct2, ((CommonFeatureFlag) bVar.d(wlp.K0).getData()).isEnabled(), linkedHashMap, uri2);
                    hri0Var.getClass();
                    singletonList = Collections.singletonList(new FragmentScreen("RegistrationApplicationStatusScreen", false, openProduct2, null, qoi0.a(RegistrationApplicationStatusFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null));
                } else {
                    if (!(yltVar instanceof ylt)) {
                        w511.b();
                        return null;
                    }
                    singletonList = Collections.singletonList(com.ybsdk.screens.registration.a.d(aVar3, yBProduct2, linkedHashMap, false, startLandingGo.getDeeplinkUri().toString(), 4));
                }
                return new v0h(singletonList, null, 6);
            case 13:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.StartLandingSkip)) {
                    return x0hVar;
                }
                ((AppAnalyticsReporter) obj2).o.f(((DeeplinkAction.StartLandingSkip) baseDeeplinkAction).getLandingFirstRunQueryParam());
                return new v0h(Collections.singletonList(com.ybsdk.screens.initial.a.c((com.ybsdk.screens.initial.a) obj)), null, 6);
            case 14:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.StatusScreenAction)) {
                    return x0hVar;
                }
                DeeplinkAction.StatusScreenAction statusScreenAction = (DeeplinkAction.StatusScreenAction) baseDeeplinkAction;
                if (!((CommonFeatureFlag) ((b) obj2).d(wlp.f0).getData()).isEnabled()) {
                    return x0hVar;
                }
                String target = statusScreenAction.getTarget();
                Map<String, String> additionalParams2 = statusScreenAction.getAdditionalParams();
                ((b9u0) obj).b.getClass();
                return new v0h(Collections.singletonList(new FragmentScreen("CommonStatusScreen", false, new StatusScreenParams(target, additionalParams2), null, qoi0.a(StatusScreenFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null)), null, 6);
            case 15:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.TransportPaymentSDK)) {
                    return x0hVar;
                }
                android.content.Intent d = ((bja0) ((k1x0) obj2).get()).d(((DeeplinkAction.TransportPaymentSDK) baseDeeplinkAction).getDeeplink());
                if (d == null) {
                    x4c.g("Unable to start PaymentSDK", null, null, null, 14);
                } else {
                    rje.k((ContextThemeWrapper) obj, d.addFlags(SelfTester_JCP.IMITA));
                }
                return new v0h(list, null, 6);
            case 16:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.UserCards)) {
                    return x0hVar;
                }
                DeeplinkAction.UserCards userCards = (DeeplinkAction.UserCards) baseDeeplinkAction;
                ((p400) obj2).b.getClass();
                FragmentScreen fragmentScreen = new FragmentScreen("UserCardsScreen", false, null, null, qoi0.a(UserCardsFragment.class), OpenScreenRequirement.WithYbSession.INSTANCE, 14, null);
                String snackbarTitle = userCards.getSnackbarTitle();
                if (snackbarTitle != null) {
                    com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, (FragmentActivity) obj, new n0t0(d.f(snackbarTitle), d.f(userCards.getSnackbarSubtitle())), null, 12);
                }
                return new v0h(Collections.singletonList(fragmentScreen), null, 6);
            case 17:
                wig wigVar = (wig) obj2;
                if (!(baseDeeplinkAction instanceof DeeplinkAction.FinishUpgradeSplit)) {
                    return x0hVar;
                }
                wigVar.c("credit_limit", list, true);
                ((tfl0) obj).a(new ujc(wigVar.c(ProductId.SPLIT.getValue(), list, false), 4), new jkc(wigVar.c("credit_limit", list, true)));
                return new v0h(list, null, 6);
            default:
                if (!(baseDeeplinkAction instanceof OpenWebAction)) {
                    return x0hVar;
                }
                OpenWebAction openWebAction = (OpenWebAction) baseDeeplinkAction;
                np41 np41Var = (np41) obj2;
                vop0 vop0Var = (vop0) obj;
                String addSvcRetpath = openWebAction.getAddSvcRetpath();
                Uri parse = Uri.parse(openWebAction.getUrl());
                if (addSvcRetpath != null) {
                    Uri.Builder buildUpon = parse.buildUpon();
                    buildUpon.appendQueryParameter(SdkUri$QueryParam.RETPATH.getParamValue(), vop0Var.a(addSvcRetpath));
                    parse = buildUpon.build();
                }
                String uri3 = parse.toString();
                boolean openKeyboard = openWebAction.getOpenKeyboard();
                ColorModel headerColor2 = openWebAction.getHeaderColor();
                if (headerColor2 == null) {
                    WebViewAppearanceOption.Companion.getClass();
                    headerColor2 = ql41.a();
                }
                ColorModel colorModel = headerColor2;
                ColorModel controlColor = openWebAction.getControlColor();
                if (controlColor == null) {
                    WebViewControl.Companion.getClass();
                    controlColor = ln41.a();
                }
                boolean showNavbar = openWebAction.getShowNavbar();
                if (showNavbar) {
                    String control = openWebAction.getControl();
                    if (control != null) {
                        int hashCode = control.hashCode();
                        if (hashCode != 3387192) {
                            if (hashCode == 93090825) {
                                break;
                            } else if (hashCode == 94935104 && control.equals("cross")) {
                                noToolbar = new WebViewAppearanceOption.ShowToolbar(new WebViewControl(WebViewControl.Type.CROSS, controlColor), false, openWebAction.getTitle(), colorModel, 2, null);
                            }
                            noToolbar = new WebViewAppearanceOption.ShowToolbar(null, false, openWebAction.getTitle(), colorModel, 2, null);
                            l970.d(SdkUri$QueryParam.CONTROL.getParamValue(), openWebAction.getControl());
                        } else {
                            if (control.equals("none")) {
                                noToolbar = new WebViewAppearanceOption.ShowToolbar(null, false, openWebAction.getTitle(), colorModel, 2, null);
                            }
                            noToolbar = new WebViewAppearanceOption.ShowToolbar(null, false, openWebAction.getTitle(), colorModel, 2, null);
                            l970.d(SdkUri$QueryParam.CONTROL.getParamValue(), openWebAction.getControl());
                        }
                    }
                    noToolbar = new WebViewAppearanceOption.ShowToolbar(new WebViewControl(WebViewControl.Type.ARROW, controlColor), false, openWebAction.getTitle(), colorModel, 2, null);
                } else {
                    if (showNavbar) {
                        w511.b();
                        return null;
                    }
                    String control2 = openWebAction.getControl();
                    if (control2 != null) {
                        int hashCode2 = control2.hashCode();
                        if (hashCode2 != 3387192) {
                            if (hashCode2 != 93090825) {
                                if (hashCode2 == 94935104 && control2.equals("cross")) {
                                    noToolbar = new WebViewAppearanceOption.NoToolbar(new WebViewControl(WebViewControl.Type.CROSS, controlColor), false, false, 6, null);
                                }
                            } else if (control2.equals("arrow")) {
                                noToolbar = new WebViewAppearanceOption.NoToolbar(new WebViewControl(WebViewControl.Type.ARROW, controlColor), false, false, 6, null);
                            }
                            auth = openWebAction.getAuth();
                            if (auth == null) {
                                auth2 = WebViewScreenParams.Auth.NONE;
                            } else {
                                WebViewScreenParams.Auth.Companion.getClass();
                                WebViewScreenParams.Auth a5 = com.ybsdk.feature.webview.api.b.a(auth);
                                if (a5 == null) {
                                    a5 = WebViewScreenParams.Auth.NONE;
                                    l970.d(SdkUri$QueryParam.AUTH.getParamValue(), auth);
                                }
                                auth2 = a5;
                            }
                            headerColor = openWebAction.getHeaderColor();
                            if (headerColor == null) {
                                WebViewAppearanceOption.Companion.getClass();
                                headerColor = ql41.a();
                            }
                            ThemedParams<String> statusbarStyle = openWebAction.getStatusbarStyle();
                            boolean c2 = l970.c(statusbarStyle != null ? statusbarStyle.getLight() : null, false);
                            ThemedParams<String> statusbarStyle2 = openWebAction.getStatusbarStyle();
                            return new v0h(Collections.singletonList(((com.ybsdk.feature.webview.internal.a) np41Var).e(new WebViewScreenParams(uri3, openKeyboard, auth2, webViewAppearanceOption, null, new WebViewStatusBar(headerColor, mob1.c(c2, l970.c(statusbarStyle2 != null ? statusbarStyle2.getDark() : null, true))), openWebAction.getFitWindowTop() != null ? Boolean.valueOf(!r0.booleanValue()) : null, null, false, Constants.MINIMAL_ERROR_STATUS_CODE, null))), null, 6);
                        }
                        break;
                        WebViewAppearanceOption noToolbar2 = new WebViewAppearanceOption.NoToolbar(null, false, false, 4, null);
                        l970.d(SdkUri$QueryParam.CONTROL.getParamValue(), openWebAction.getControl());
                        webViewAppearanceOption = noToolbar2;
                        auth = openWebAction.getAuth();
                        if (auth == null) {
                        }
                        headerColor = openWebAction.getHeaderColor();
                        if (headerColor == null) {
                        }
                        ThemedParams<String> statusbarStyle3 = openWebAction.getStatusbarStyle();
                        boolean c22 = l970.c(statusbarStyle3 != null ? statusbarStyle3.getLight() : null, false);
                        ThemedParams<String> statusbarStyle22 = openWebAction.getStatusbarStyle();
                        return new v0h(Collections.singletonList(((com.ybsdk.feature.webview.internal.a) np41Var).e(new WebViewScreenParams(uri3, openKeyboard, auth2, webViewAppearanceOption, null, new WebViewStatusBar(headerColor, mob1.c(c22, l970.c(statusbarStyle22 != null ? statusbarStyle22.getDark() : null, true))), openWebAction.getFitWindowTop() != null ? Boolean.valueOf(!r0.booleanValue()) : null, null, false, Constants.MINIMAL_ERROR_STATUS_CODE, null))), null, 6);
                    }
                    noToolbar = new WebViewAppearanceOption.NoToolbar(null, false, false, 4, null);
                }
                webViewAppearanceOption = noToolbar;
                auth = openWebAction.getAuth();
                if (auth == null) {
                }
                headerColor = openWebAction.getHeaderColor();
                if (headerColor == null) {
                }
                ThemedParams<String> statusbarStyle32 = openWebAction.getStatusbarStyle();
                boolean c222 = l970.c(statusbarStyle32 != null ? statusbarStyle32.getLight() : null, false);
                ThemedParams<String> statusbarStyle222 = openWebAction.getStatusbarStyle();
                return new v0h(Collections.singletonList(((com.ybsdk.feature.webview.internal.a) np41Var).e(new WebViewScreenParams(uri3, openKeyboard, auth2, webViewAppearanceOption, null, new WebViewStatusBar(headerColor, mob1.c(c222, l970.c(statusbarStyle222 != null ? statusbarStyle222.getDark() : null, true))), openWebAction.getFitWindowTop() != null ? Boolean.valueOf(!r0.booleanValue()) : null, null, false, Constants.MINIMAL_ERROR_STATUS_CODE, null))), null, 6);
        }
    }

    public /* synthetic */ s1h(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ s1h(Object obj, kg51 kg51Var, tfl0 tfl0Var, kcs kcsVar, int i) {
        this.a = i;
        this.b = obj;
        this.c = tfl0Var;
    }

    public /* synthetic */ s1h(Object obj, AppAnalyticsReporter appAnalyticsReporter, int i) {
        this.a = i;
        this.c = obj;
        this.b = appAnalyticsReporter;
    }
}
