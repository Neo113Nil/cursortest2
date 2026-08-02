package com.squareup.cash.shopping.presenters;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.emoji2.text.EmojiExclusions;
import androidx.exifinterface.media.ExifInterfaceUtils;
import app.cash.api.ApiResult;
import app.cash.passcode.backend.RealAppLockState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.autofillweb.real.AggregateAutofillWebManager;
import com.squareup.cash.autofillweb.real.RealAutofillWebManagerProvider;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.BrowserViewPerformanceScore;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$CashWebMonitoringScript;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fillr.api.FillrWebManager$FillrVersions;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.shopping.backend.analytics.ShopHubAnalyticsHelper$Flow;
import com.squareup.cash.shopping.backend.real.RealShopHubAnalyticsHelper;
import com.squareup.cash.shopping.screens.ShoppingScreenContext;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.shopping.viewmodels.CashFillStatus;
import com.squareup.cash.shopping.viewmodels.FillrStatus;
import com.squareup.cash.shopping.viewmodels.WebVitals;
import com.squareup.cash.shopping.viewmodels.WebVitalsScore;
import com.squareup.cash.webview.android.WebViewUseCase;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.cashapproxy.api.CashApProxyClientService;
import com.squareup.protos.cash.cashapproxy.api.GetAfterpayCheckoutTokensRequest;
import com.squareup.protos.cash.cashapproxy.api.GetAfterpayCheckoutTokensResponse;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import com.squareup.protos.franklin.app.AppService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealShoppingJavascriptPresenter {
    public static final List validAfterpayURLs = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"https://portal.afterpay.com", "https://portal.clearpay.co.uk", "https://portal.qa.afterpay-beta.com", "https://portal.qa.clearpay-beta.co.uk", "https://portal.stage.afterpay-beta.com", "https://portal.stage.clearpay-beta.co.uk", "https://portal.sandbox.afterpay.com", "https://portal.sandbox.clearpay.co.uk"});
    public final Analytics analytics;
    public final ShoppingWebScreen args;
    public final AggregateAutofillWebManager autofillManager;
    public final CashApProxyClientService cashApProxyService;
    public final ParcelableSnapshotMutableState currentUrl$delegate;
    public final FeatureFlagManager featureFlagManager;
    public final String flowToken;
    public final AppService franklinAppService;
    public final CoroutineContext ioDispatcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealBugReportSenderFactory shoppingWebAnalytics;
    public final AndroidStringManager stringManager;
    public final ParcelableSnapshotMutableState webVitalResult$delegate;

    public RealShoppingJavascriptPresenter(ShoppingWebScreen shoppingWebScreen, BetterNavigator.ScreenNavigator screenNavigator, RealBugReportSenderFactory realBugReportSenderFactory, CoroutineContext coroutineContext, Analytics analytics, AndroidStringManager androidStringManager, RealAutofillWebManagerProvider realAutofillWebManagerProvider, CashApProxyClientService cashApProxyClientService, AppService appService, RealShopHubAnalyticsHelper realShopHubAnalyticsHelper, FeatureFlagManager featureFlagManager) {
        ShoppingScreenContext screenContext;
        ShoppingScreenContext screenContext2;
        InAppBrowserMetadata.EntityInformation entityInformation;
        String str;
        InAppBrowserMetadata.EntityInformation entityInformation2;
        InAppBrowserMetadata.EntityInformation entityInformation3;
        String flowToken;
        shoppingWebScreen.getClass();
        this.args = shoppingWebScreen;
        this.navigator = screenNavigator;
        this.shoppingWebAnalytics = realBugReportSenderFactory;
        this.ioDispatcher = coroutineContext;
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.cashApProxyService = cashApProxyClientService;
        this.franklinAppService = appService;
        this.featureFlagManager = featureFlagManager;
        String flowToken2 = realShopHubAnalyticsHelper.getFlowToken(ShopHubAnalyticsHelper$Flow.SHOP);
        ShoppingScreenContext screenContext3 = shoppingWebScreen.getScreenContext();
        if (screenContext3 != null && (flowToken = EmojiExclusions.getFlowToken(screenContext3)) != null) {
            flowToken2 = flowToken;
        }
        this.flowToken = flowToken2;
        boolean z = shoppingWebScreen instanceof ShoppingWebScreen.ShoppingWebScreenV2;
        String str2 = null;
        ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV2 = z ? (ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen : null;
        if ((shoppingWebScreenV2 == null || (entityInformation3 = shoppingWebScreenV2.entityInformation) == null || entityInformation3.entity_name == null) && (screenContext = shoppingWebScreen.getScreenContext()) != null) {
            EmojiExclusions.getEntityInformation(screenContext);
        }
        ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV22 = z ? (ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen : null;
        if ((shoppingWebScreenV22 == null || (entityInformation2 = shoppingWebScreenV22.entityInformation) == null || entityInformation2.entity_token == null) && (screenContext2 = shoppingWebScreen.getScreenContext()) != null) {
            EmojiExclusions.getEntityToken(screenContext2);
        }
        ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV23 = z ? (ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen : null;
        if (shoppingWebScreenV23 == null || (entityInformation = shoppingWebScreenV23.entityInformation) == null || (str = entityInformation.business_token) == null) {
            ShoppingScreenContext screenContext4 = shoppingWebScreen.getScreenContext();
            if (screenContext4 != null) {
                str2 = EmojiExclusions.getMerchantToken(screenContext4);
            }
        } else {
            str2 = str;
        }
        this.webVitalResult$delegate = Updater.mutableStateOf$default(new WebVitals());
        this.currentUrl$delegate = Updater.mutableStateOf$default(shoppingWebScreen.getUrl());
        this.autofillManager = realAutofillWebManagerProvider.get(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getCheckoutToken(RealShoppingJavascriptPresenter realShoppingJavascriptPresenter, ContinuationImpl continuationImpl) {
        RealShoppingJavascriptPresenter$getCheckoutToken$1 realShoppingJavascriptPresenter$getCheckoutToken$1;
        int i;
        GetAfterpayCheckoutTokensRequest getAfterpayCheckoutTokensRequest;
        ApiResult apiResult;
        Object obj;
        String str = realShoppingJavascriptPresenter.flowToken;
        if (continuationImpl instanceof RealShoppingJavascriptPresenter$getCheckoutToken$1) {
            realShoppingJavascriptPresenter$getCheckoutToken$1 = (RealShoppingJavascriptPresenter$getCheckoutToken$1) continuationImpl;
            int i2 = realShoppingJavascriptPresenter$getCheckoutToken$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShoppingJavascriptPresenter$getCheckoutToken$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realShoppingJavascriptPresenter$getCheckoutToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShoppingJavascriptPresenter$getCheckoutToken$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (ExifInterfaceUtils.isVersion2WithCorrectMetadata(realShoppingJavascriptPresenter.args, WebViewUseCase.AFTERPAY)) {
                        Edge.Companion companion = GetAfterpayCheckoutTokensRequest.Source.Companion;
                        getAfterpayCheckoutTokensRequest = new GetAfterpayCheckoutTokensRequest(str, 4);
                    } else {
                        getAfterpayCheckoutTokensRequest = new GetAfterpayCheckoutTokensRequest(str, 6);
                    }
                    CashApProxyClientService cashApProxyClientService = realShoppingJavascriptPresenter.cashApProxyService;
                    realShoppingJavascriptPresenter$getCheckoutToken$1.label = 1;
                    obj2 = cashApProxyClientService.getAfterpayCheckoutTokens(getAfterpayCheckoutTokensRequest, realShoppingJavascriptPresenter$getCheckoutToken$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                apiResult = (ApiResult) obj2;
                if (!(apiResult instanceof ApiResult.Success)) {
                    Iterator it = ((GetAfterpayCheckoutTokensResponse) ((ApiResult.Success) apiResult).response).tokens.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (StringsKt__StringsJVMKt.equals(((GetAfterpayCheckoutTokensResponse.CheckoutToken) obj).name, "cash_checkout_token", false)) {
                            break;
                        }
                    }
                    GetAfterpayCheckoutTokensResponse.CheckoutToken checkoutToken = (GetAfterpayCheckoutTokensResponse.CheckoutToken) obj;
                    if (checkoutToken != null) {
                        return checkoutToken.token;
                    }
                } else if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return null;
            }
        }
        realShoppingJavascriptPresenter$getCheckoutToken$1 = new RealShoppingJavascriptPresenter$getCheckoutToken$1(realShoppingJavascriptPresenter, continuationImpl);
        Object obj22 = realShoppingJavascriptPresenter$getCheckoutToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShoppingJavascriptPresenter$getCheckoutToken$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj22;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return null;
    }

    public final WebVitals getWebVitalResult() {
        return (WebVitals) this.webVitalResult$delegate.getValue();
    }

    public final void sendPerformanceToCDF(String str, FillrStatus fillrStatus, CashFillStatus cashFillStatus) {
        str.getClass();
        fillrStatus.getClass();
        cashFillStatus.getClass();
        if (((JsonFeatureFlags$CashWebMonitoringScript.WebMonitoringOptions) ((FeatureFlag$JsonFeatureFlag.Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(JsonFeatureFlags$CashWebMonitoringScript.INSTANCE)).value).enabled) {
            WebVitals webVitalResult = getWebVitalResult();
            if (StringsKt.isBlank(webVitalResult.FCP.value) && StringsKt.isBlank(webVitalResult.TBT.value) && StringsKt.isBlank(webVitalResult.CLS.value) && StringsKt.isBlank(webVitalResult.TTI.value) && StringsKt.isBlank(webVitalResult.FID.value) && StringsKt.isBlank(webVitalResult.INP.value) && StringsKt.isBlank(webVitalResult.LCP.value) && StringsKt.isBlank(webVitalResult.TTFB.value)) {
                return;
            }
            String str2 = (String) this.currentUrl$delegate.getValue();
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            WebVitals webVitalResult2 = getWebVitalResult();
            webVitalResult2.getClass();
            RealBugReportSenderFactory realBugReportSenderFactory = this.shoppingWebAnalytics;
            InfoContext infoContext = (InfoContext) realBugReportSenderFactory.featureEligibilityDumper;
            String str4 = (String) realBugReportSenderFactory.tempStorage;
            String str5 = (String) realBugReportSenderFactory.cashDatabase;
            String str6 = (String) realBugReportSenderFactory.endpointContext;
            boolean z = cashFillStatus.cashFillEnabled;
            String str7 = cashFillStatus.cashFillVersion;
            FillrWebManager$FillrVersions fillrWebManager$FillrVersions = fillrStatus.fillrVersions;
            fillrWebManager$FillrVersions.getClass();
            String str8 = fillrWebManager$FillrVersions.widgetVersion;
            boolean z2 = fillrStatus.fillrEnabled;
            WebVitalsScore webVitalsScore = webVitalResult2.FCP;
            String str9 = webVitalsScore.value;
            String str10 = webVitalsScore.score;
            WebVitalsScore webVitalsScore2 = webVitalResult2.TBT;
            String str11 = webVitalsScore2.value;
            String str12 = webVitalsScore2.score;
            WebVitalsScore webVitalsScore3 = webVitalResult2.CLS;
            String str13 = webVitalsScore3.value;
            String str14 = webVitalsScore3.score;
            WebVitalsScore webVitalsScore4 = webVitalResult2.TTI;
            String str15 = webVitalsScore4.value;
            String str16 = webVitalsScore4.score;
            WebVitalsScore webVitalsScore5 = webVitalResult2.FID;
            String str17 = webVitalsScore5.value;
            String str18 = webVitalsScore5.score;
            WebVitalsScore webVitalsScore6 = webVitalResult2.INP;
            String str19 = webVitalsScore6.value;
            String str20 = webVitalsScore6.score;
            WebVitalsScore webVitalsScore7 = webVitalResult2.LCP;
            String str21 = webVitalsScore7.value;
            String str22 = webVitalsScore7.score;
            WebVitalsScore webVitalsScore8 = webVitalResult2.TTFB;
            this.analytics.track(new BrowserViewPerformanceScore(str3, str4, str, Boolean.valueOf(z), str7, Boolean.valueOf(z2), str8, str5, str6, infoContext, str9, str11, str13, str15, str17, str19, str21, webVitalsScore8.value, str10, str12, str14, str16, str18, str20, str22, webVitalsScore8.score, (BrowserOrigin) realBugReportSenderFactory.sessionManager), null);
            this.webVitalResult$delegate.setValue(new WebVitals());
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final Provider autofillManagerProvider;
        public final DoubleCheck cashApProxyService;
        public final DoubleCheck featureFlagManager;
        public final DoubleCheck franklinAppService;
        public final LambdaProvider ioDispatcher;
        public final DoubleCheck shopHubAnalyticsHelper;
        public final LambdaProvider stringManager;

        public MetroFactory(RealAppLockState.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck5) {
            this.autofillManagerProvider = metroFactory;
            this.analytics = doubleCheck;
            this.cashApProxyService = doubleCheck2;
            this.ioDispatcher = lambdaProvider;
            this.franklinAppService = doubleCheck3;
            this.shopHubAnalyticsHelper = doubleCheck4;
            this.stringManager = lambdaProvider2;
            this.featureFlagManager = doubleCheck5;
        }

        public MetroFactory(RealMessageSigner.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5) {
            this.autofillManagerProvider = metroFactory;
            this.ioDispatcher = lambdaProvider;
            this.analytics = doubleCheck;
            this.cashApProxyService = doubleCheck2;
            this.franklinAppService = doubleCheck3;
            this.stringManager = lambdaProvider2;
            this.shopHubAnalyticsHelper = doubleCheck4;
            this.featureFlagManager = doubleCheck5;
        }

        public MetroFactory(RealMessageSigner.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck5) {
            this.autofillManagerProvider = metroFactory;
            this.ioDispatcher = lambdaProvider;
            this.analytics = doubleCheck;
            this.cashApProxyService = doubleCheck2;
            this.franklinAppService = doubleCheck3;
            this.shopHubAnalyticsHelper = doubleCheck4;
            this.stringManager = lambdaProvider2;
            this.featureFlagManager = doubleCheck5;
        }

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2, NavigationSideEffects.MetroFactory metroFactory, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5) {
            this.ioDispatcher = lambdaProvider;
            this.analytics = doubleCheck;
            this.stringManager = lambdaProvider2;
            this.autofillManagerProvider = metroFactory;
            this.cashApProxyService = doubleCheck2;
            this.franklinAppService = doubleCheck3;
            this.shopHubAnalyticsHelper = doubleCheck4;
            this.featureFlagManager = doubleCheck5;
        }
    }
}
