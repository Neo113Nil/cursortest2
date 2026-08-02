package com.squareup.cash.shopping.web;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.core.text.TextUtilsCompat;
import androidx.glance.appwidget.NormalizeCompositionTreeKt;
import app.cash.api.ApiResult;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.viewmodels.sheet.EducationalButtonAction;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.account.screens.Account;
import com.squareup.cash.autofillweb.real.AggregateAutofillWebManager;
import com.squareup.cash.autofillweb.real.RealAutofillWebManagerProvider;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cashplato.service.CashPlatoAppService;
import com.squareup.cash.cdf.account.AccountSwitchAccountViewSwitcher;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessViewIncidentAlerts;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewOpenScreen;
import com.squareup.cash.cdf.qrcodeshortcuts.QRCodeShortcutsOnboardingView;
import com.squareup.cash.cdf.taptopay.ErrorType;
import com.squareup.cash.cdf.taptopay.FlowType;
import com.squareup.cash.cdf.taptopay.ScreenID;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.common.web.UriSchemeKt;
import com.squareup.cash.common.web.WebAppBridge;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$1;
import com.squareup.cash.data.profile.RealContactAliasFetcher;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$FamilySettings;
import com.squareup.cash.eligibility.backend.api.SettingsEligibilityManager$AccountSettingsResult;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter$models$1$1$1;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.views.animation.AvatarLayoutAnimationStateHolder;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseCashCardRepository;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseCashCardRepository$prepurchaseAppletSyncData$$inlined$map$1;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter;
import com.squareup.cash.profile.presenters.RealGenericProfileElementsPresenter;
import com.squareup.cash.profile.presenters.personalizedads.RealPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.RingtoneItem;
import com.squareup.cash.profile.views.MooncakeAddressSheet;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.profile.views.ProfileCropView$3$1$1;
import com.squareup.cash.profile.views.ProfileCropView$3$1$invokeSuspend$$inlined$map$1$2;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.applets.presenters.RealSavingsAppletTileRepository;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.cash.securityhub.screens.RecoveryGuideScreen;
import com.squareup.cash.session.backend.RealUrlAuthenticator;
import com.squareup.cash.sheet.BasicShieetScope;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.shopping.viewmodels.ShoppingBridgeCommand$BackNavigationCommand;
import com.squareup.cash.shopping.viewmodels.ShoppingBridgeCommand$ForwardNavigationCommand;
import com.squareup.cash.shopping.viewmodels.ShoppingBridgeCommand$RefreshCommand;
import com.squareup.cash.support.backend.real.RealSupportPhoneService;
import com.squareup.cash.support.incidents.backend.api.Incident;
import com.squareup.cash.support.presenters.ArticlePresenter;
import com.squareup.cash.support.presenters.SupportPhoneStatusPresenter;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.taptopay.backend.api.TapToPayAction$InitiateTapToPayAction;
import com.squareup.cash.taptopay.backend.real.RealTapToPayActionManager;
import com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen;
import com.squareup.cash.taptopay.screens.TapToPayErrorReason;
import com.squareup.cash.taptopay.screens.TapToPayErrorScreen;
import com.squareup.cash.taptopay.screens.TapToPayScreen;
import com.squareup.cash.tax.presenters.TaxAuthorizationPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.tax.primitives.TaxLocation;
import com.squareup.cash.tax.screens.TaxAuthorizationScreen;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider$getPasscode$1;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashplato.api.v1.GetPersonalizedAdsStateRequest;
import com.squareup.protos.cash.cashplato.api.v1.GetPersonalizedAdsStateResponse;
import com.squareup.protos.cash.cashplato.api.v1.GetPersonalizedAdsStateResponse$Response$Error;
import com.squareup.protos.cash.cashplato.api.v1.GetPersonalizedAdsStateResponse$Response$State;
import com.squareup.protos.cash.cashplato.api.v1.PersonalizedAdsError;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.consentsys.service.CopyParameters;
import com.squareup.util.android.coroutines.ViewKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.ByteString;
import papa.PapaEvent;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class ShoppingWebBridge implements WebAppBridge {
    public final boolean afterpayUseCase;
    public final AggregateAutofillWebManager autofillManager;
    public final RealShoppingWebCheckoutCookieManager shoppingWebCheckoutCookieManager;
    public final boolean shouldSyncCookies;
    public final BufferedChannel webEvents;
    public final WebView webView;

    public ShoppingWebBridge(CoroutineScope coroutineScope, WebView webView, boolean z, boolean z2, String str, String str2, boolean z3, RealShoppingWebCheckoutCookieManager realShoppingWebCheckoutCookieManager, RealAutofillWebManagerProvider realAutofillWebManagerProvider, WebViewProvider webViewProvider) {
        coroutineScope.getClass();
        webView.getClass();
        this.webView = webView;
        this.shouldSyncCookies = z2;
        this.afterpayUseCase = z3;
        this.shoppingWebCheckoutCookieManager = realShoppingWebCheckoutCookieManager;
        BufferedChannel Channel$default = PapaEvent.Channel$default(-2, null, null, 6);
        this.webEvents = Channel$default;
        AggregateAutofillWebManager aggregateAutofillWebManager = realAutofillWebManagerProvider.get(str2);
        this.autofillManager = aggregateAutofillWebManager;
        ShoppingWebViewClient shoppingWebViewClient = new ShoppingWebViewClient(this, aggregateAutofillWebManager);
        ShoppingWebChromeClient shoppingWebChromeClient = new ShoppingWebChromeClient(this);
        aggregateAutofillWebManager.fillrManager.enabled = z;
        JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this, (Continuation) null, 0), 1);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUserAgentString(str);
        settings.setMixedContentMode(2);
        webView.addJavascriptInterface(new AfterPayCheckoutJavascriptInterface(Channel$default), "AfterpayReactNativeWebView");
        webView.addJavascriptInterface(new PayKitJavascriptInterface(Channel$default), "CashAppNative");
        webView.addJavascriptInterface(new WebMonitoringJavascriptInterface(Channel$default), "CashWebMonitoring");
        webView.setWebViewClient(shoppingWebViewClient);
        webView.setWebChromeClient(shoppingWebChromeClient);
        CookieManager cookieManager = realShoppingWebCheckoutCookieManager.cookieManager.cookieManager();
        if (cookieManager != null) {
            cookieManager.setAcceptThirdPartyCookies(webView, true);
        }
        aggregateAutofillWebManager.registerWebView(webView);
        webViewProvider.setShouldSaveWebInstance(false);
    }

    @Override // com.squareup.cash.common.web.WebAppBridge
    public final ReceiveChannel getWebEvents() {
        return this.webEvents;
    }

    @Override // com.squareup.cash.common.web.WebAppBridge
    public final void loadUrl(String str) {
        str.getClass();
        Uri https = UriSchemeKt.toHttps(Uri.parse(str));
        if (!str.equals(https.toString())) {
            Timber.Forest.e("Attempted to load http url in the shopping webview: ".concat(str), new Object[0]);
        }
        String uri = https.toString();
        WebView webView = this.webView;
        webView.loadUrl(uri);
        if (this.shouldSyncCookies) {
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            ViewKt.whileEachAttached(webView, DefaultIoScheduler.INSTANCE, new ShoppingWebBridge$loadUrl$1(this, str, null, 0));
        }
    }

    @Override // com.squareup.cash.common.web.WebAppBridge
    public final void sendWebCommand(NormalizeCompositionTreeKt normalizeCompositionTreeKt) {
        boolean z = normalizeCompositionTreeKt instanceof ShoppingBridgeCommand$BackNavigationCommand;
        WebView webView = this.webView;
        if (z) {
            if (webView.canGoBack()) {
                webView.goBack();
            }
        } else if (normalizeCompositionTreeKt instanceof ShoppingBridgeCommand$ForwardNavigationCommand) {
            if (webView.canGoForward()) {
                webView.goForward();
            }
        } else if (normalizeCompositionTreeKt instanceof ShoppingBridgeCommand$RefreshCommand) {
            webView.reload();
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    /* renamed from: com.squareup.cash.shopping.web.ShoppingWebBridge$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, RingtoneView ringtoneView, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 13;
            this.label = i;
            this.this$0 = ringtoneView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1((ShoppingWebBridge) obj2, continuation, 0);
                case 1:
                    return new AnonymousClass1((PoolsListPresenter) obj2, continuation, 1);
                case 2:
                    return new AnonymousClass1((AvatarLayoutAnimationStateHolder) obj2, continuation, 2);
                case 3:
                    return new AnonymousClass1((LocalEditorialPresenter) obj2, continuation, 3);
                case 4:
                    return new AnonymousClass1((TaxReturnsPresenter) obj2, continuation, 4);
                case 5:
                    return new AnonymousClass1((ProfilePrivacyPresenter) obj2, continuation, 5);
                case 6:
                    return new AnonymousClass1((TabToolbarPresenter) obj2, continuation, 6);
                case 7:
                    return new AnonymousClass1((RealGenericProfileElementsPresenter) obj2, continuation, 7);
                case 8:
                    return new AnonymousClass1((PdfPreviewPresenter) obj2, continuation, 8);
                case 9:
                    return new AnonymousClass1((LocalHomePresenter) obj2, continuation, 9);
                case 10:
                    return new AnonymousClass1((LocalEditorialPresenter) obj2, continuation, 10);
                case 11:
                    return new AnonymousClass1((MooncakeAddressSheet) obj2, continuation, 11);
                case 12:
                    return new AnonymousClass1((ProfileCropView) obj2, continuation, 12);
                case 13:
                    return new AnonymousClass1(this.label, (RingtoneView) obj2, continuation);
                case 14:
                    return new AnonymousClass1((CardLockPresenter) obj2, continuation, 14);
                case 15:
                    return new AnonymousClass1((TaxReturnsPresenter) obj2, continuation, 15);
                case 16:
                    return new AnonymousClass1((RealSavingsAppletTileRepository) obj2, continuation, 16);
                case 17:
                    return new AnonymousClass1((SavingsScreenPresenter) obj2, continuation, 17);
                case 18:
                    return new AnonymousClass1((LocalEditorialPresenter) obj2, continuation, 18);
                case 19:
                    return new AnonymousClass1((RealUrlAuthenticator) obj2, continuation, 19);
                case 20:
                    return new AnonymousClass1((BasicShieetScope) obj2, continuation, 20);
                case 21:
                    return new AnonymousClass1((RealSupportPhoneService) obj2, continuation, 21);
                case 22:
                    return new AnonymousClass1((ArticlePresenter) obj2, continuation, 22);
                case 23:
                    return new AnonymousClass1((InviteErrorPresenter) obj2, continuation, 23);
                case 24:
                    return new AnonymousClass1((SupportPhoneStatusPresenter) obj2, continuation, 24);
                case 25:
                    return new AnonymousClass1((WorkHomePresenter) obj2, continuation, 25);
                case 26:
                    return new AnonymousClass1((InviteErrorPresenter) obj2, continuation, 26);
                case 27:
                    return new AnonymousClass1((TaxReturnsPresenter) obj2, continuation, 27);
                case 28:
                    return new AnonymousClass1((TapToPayPresenter) obj2, continuation, 28);
                default:
                    return new AnonymousClass1((TaxAuthorizationPresenter) obj2, continuation, 29);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
                case 0:
                    ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    break;
                case 24:
                    ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    break;
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x020c, code lost:
        
            if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r2, r14) == r1) goto L130;
         */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x0201, code lost:
        
            if (r2.requestPhoneStatusUpdate(r14) == r1) goto L130;
         */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x020f, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:491:0x07ea, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r2, r1, null, null, r14, 12) == r11) goto L450;
         */
        /* JADX WARN: Code restructure failed: missing block: B:493:?, code lost:
        
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:497:0x07b7, code lost:
        
            if (kotlinx.coroutines.JobKt.delay(134, r14) == r11) goto L450;
         */
        /* JADX WARN: Code restructure failed: missing block: B:499:0x07c8, code lost:
        
            if (kotlinx.coroutines.JobKt.delay(((r0 - 1) * 35) + 284, r14) == r11) goto L450;
         */
        /* JADX WARN: Code restructure failed: missing block: B:517:0x082d, code lost:
        
            if (r0 == r1) goto L468;
         */
        /* JADX WARN: Code restructure failed: missing block: B:519:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:521:0x0818, code lost:
        
            if (r2 == r1) goto L468;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00d2, code lost:
        
            if (r1 == r0) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00a1, code lost:
        
            if (com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper.submitViewEvent$default(r1, null, r2, r14, 3) == r0) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0111, code lost:
        
            if (com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper.submitViewEvent$default(r1, null, r2, r14, 3) == r0) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0100, code lost:
        
            if (r1.set(r2, r14) == r0) goto L73;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:119:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:342:0x0566  */
        /* JADX WARN: Removed duplicated region for block: B:353:0x058c  */
        /* JADX WARN: Removed duplicated region for block: B:360:0x059e  */
        /* JADX WARN: Removed duplicated region for block: B:362:0x05a8  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0160  */
        /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r10v72 */
        /* JADX WARN: Type inference failed for: r10v73 */
        /* JADX WARN: Type inference failed for: r10v74 */
        /* JADX WARN: Type inference failed for: r10v75 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x020c -> B:118:0x01f9). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object shouldShowRequestPermissionRationale;
            Object shouldShowOverridePrompt;
            Object obj2;
            Object personalizedAdsState;
            PersonalizedAdsError personalizedAdsError;
            GetPersonalizedAdsStateResponse.State state;
            PersonalizedAdsError personalizedAdsError2;
            Ringtone ringtone;
            Object first;
            Object submitErrorEvent;
            Object submitErrorEvent2;
            UUID uuid;
            Object flowTokenFromTaxServer;
            int i = this.$r8$classId;
            int i2 = 4;
            int i3 = 6;
            boolean z = false;
            int i4 = 3;
            int i5 = 2;
            Object obj3 = this.this$0;
            int i6 = 1;
            ErrorType errorType = 0;
            ErrorType errorType2 = null;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    try {
                        if (i7 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            this.label = 1;
                            JobKt.awaitCancellation(this);
                            return coroutineSingletons;
                        }
                        if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    } finally {
                    }
                case 1:
                    PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj3;
                    ModifiablePermissions modifiablePermissions = (ModifiablePermissions) poolsListPresenter.moneyFormatter;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        shouldShowRequestPermissionRationale = modifiablePermissions.shouldShowRequestPermissionRationale(this);
                        break;
                    } else {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            shouldShowOverridePrompt = obj;
                            if (((Boolean) shouldShowOverridePrompt).booleanValue()) {
                                ((BetterNavigator.ScreenNavigator) poolsListPresenter.navigator).goTo(new BlockersScreens.ReadContactsPermissionScreen());
                            }
                            return Unit.INSTANCE;
                        }
                        SafeTrace.throwOnFailure(obj);
                        shouldShowRequestPermissionRationale = obj;
                    }
                    if (((Boolean) shouldShowRequestPermissionRationale).booleanValue()) {
                        modifiablePermissions.request();
                        return Unit.INSTANCE;
                    }
                    this.label = 2;
                    shouldShowOverridePrompt = modifiablePermissions.shouldShowOverridePrompt(this);
                    break;
                case 2:
                    AvatarLayoutAnimationStateHolder avatarLayoutAnimationStateHolder = (AvatarLayoutAnimationStateHolder) obj3;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (avatarLayoutAnimationStateHolder.index == 0) {
                            this.label = 1;
                            break;
                        } else {
                            this.label = 2;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i9 != 1 && i9 != 2) {
                        if (i9 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable = avatarLayoutAnimationStateHolder.scaleMultiplierAnimatable;
                    Float f = new Float(1.0f);
                    SpringSpec spring$default = AnimatableKt.spring$default(0.5f, 200.0f, null, 4);
                    this.label = 3;
                    break;
                case 3:
                    LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj3;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                        RealPrepurchaseCashCardRepository realPrepurchaseCashCardRepository = (RealPrepurchaseCashCardRepository) localEditorialPresenter.launcher;
                        StateFlow singleValue = realPrepurchaseCashCardRepository.syncValueReader.getSingleValue(AndroidSyncValueSpecs.PrepurchaseCashCardData);
                        WirelessProviderListPresenter$models$1$1$1 wirelessProviderListPresenter$models$1$1$1 = new WirelessProviderListPresenter$models$1$1$1(8, m, localEditorialPresenter);
                        this.label = 1;
                        Object collect = singleValue.collect(new RealPrepurchaseCashCardRepository$prepurchaseAppletSyncData$$inlined$map$1.AnonymousClass2(wirelessProviderListPresenter$models$1$1$1, realPrepurchaseCashCardRepository, 1), this);
                        if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    } else {
                        if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 4:
                    TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) obj3;
                    AndroidStringManager androidStringManager = (AndroidStringManager) taxReturnsPresenter.taxesDocumentsTaxReturnsDataProvider;
                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) taxReturnsPresenter.navigator;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealSettingsEligibilityManager realSettingsEligibilityManager = (RealSettingsEligibilityManager) taxReturnsPresenter.args;
                        this.label = 1;
                        obj2 = realSettingsEligibilityManager.settings(this);
                        if (obj2 == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    } else {
                        if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        obj2 = obj;
                    }
                    SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj2;
                    if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                        if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        screenNavigator.goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging(androidStringManager, ((SettingsEligibilityManager$AccountSettingsResult.SettingsError) settingsEligibilityManager$AccountSettingsResult).failure, null).message, null, 6));
                    } else if (((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult).cache.family.cache.containsKey(AccountSettingType$FamilySettings.FamilySubSetting.INVITE_TEEN)) {
                        RealAccountOutboundNavigator realAccountOutboundNavigator = (RealAccountOutboundNavigator) taxReturnsPresenter.router;
                        realAccountOutboundNavigator.getClass();
                        realAccountOutboundNavigator.analytics.track(new PersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.FAMILY_ACCOUNTS, null), null);
                        realAccountOutboundNavigator.navigator.goTo(FlowStarter.startPlasmaFlow$default(realAccountOutboundNavigator.flowStarter, Flow$Type.FAMILY_ACCOUNT_STATE, Account.INSTANCE, null, null, 12));
                    } else {
                        screenNavigator.goTo(new ProfileScreens.UnsupportedSettingScreen(new ProfileScreens.UnsupportedSettingScreen.AccountTypeSpecificConfiguration(androidStringManager.get(R.string.profile_unsupported_setting_family_title), androidStringManager.get(R.string.profile_personal_account_unsupported_setting_family_message)), new ProfileScreens.UnsupportedSettingScreen.AccountTypeSpecificConfiguration(androidStringManager.get(R.string.profile_unsupported_setting_family_title), androidStringManager.get(R.string.profile_business_account_unsupported_setting_family_message)), AccountSwitchAccountViewSwitcher.Entrypoint.UNSUPPORTED_FAMILY_SETTINGS, ProfileScreens.FamilyEligibilityLoadingScreen.INSTANCE, false));
                    }
                    return Unit.INSTANCE;
                case 5:
                    Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ProfilePrivacyPresenter profilePrivacyPresenter = (ProfilePrivacyPresenter) obj3;
                        this.label = 1;
                        Object first2 = FlowKt.first(FlowKt.transformLatest(profilePrivacyPresenter.requestedPermissionFlow, new RealPasscodeProvider$getPasscode$1((Continuation) errorType, profilePrivacyPresenter, i5)), this);
                        Object obj5 = first2;
                        if (first2 != obj4) {
                            obj5 = Unit.INSTANCE;
                        }
                        if (obj5 == obj4) {
                            return obj4;
                        }
                    } else {
                        if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 6:
                    Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        TabToolbarPresenter tabToolbarPresenter = (TabToolbarPresenter) obj3;
                        this.label = 1;
                        Object first3 = FlowKt.first(FlowKt.transformLatest((SharedFlowImpl) tabToolbarPresenter.moneyFormatter, new RealPasscodeProvider$getPasscode$1((Continuation) errorType, tabToolbarPresenter, i4)), this);
                        Object obj7 = first3;
                        if (first3 != obj6) {
                            obj7 = Unit.INSTANCE;
                        }
                        if (obj7 == obj6) {
                            return obj6;
                        }
                    } else {
                        if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 7:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (RealGenericProfileElementsPresenter.access$reportProfile((RealGenericProfileElementsPresenter) obj3, this) == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                    } else {
                        if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 8:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealContactAliasFetcher realContactAliasFetcher = (RealContactAliasFetcher) ((PdfPreviewPresenter) obj3).fileSaver;
                        this.label = 1;
                        if (realContactAliasFetcher.fetchAndStoreAliases(this) == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    } else {
                        if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 9:
                    LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj3;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.label;
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GetPersonalizedAdsStateRequest getPersonalizedAdsStateRequest = new GetPersonalizedAdsStateRequest(new CopyParameters(new Integer(3), ((String) localHomePresenter.tabContentPresenterFactory).equals("production") ? "CG_btcgichZQw3Q85Ms2FIQaD" : "CG_rAlVAhY0P7kWST85uaQQcD", ((Locale) ((RealLocaleManager) localHomePresenter.localHomeGeoPresenterFactory).resolvedLocale.$$delegate_0.getValue()).toLanguageTag()), ByteString.EMPTY);
                        CashPlatoAppService cashPlatoAppService = (CashPlatoAppService) localHomePresenter.clearMarketingBadgesIfNeeded;
                        this.label = 1;
                        personalizedAdsState = cashPlatoAppService.getPersonalizedAdsState(getPersonalizedAdsStateRequest, this);
                        if (personalizedAdsState == coroutineSingletons8) {
                            return coroutineSingletons8;
                        }
                    } else {
                        if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        personalizedAdsState = obj;
                    }
                    ApiResult apiResult = (ApiResult) personalizedAdsState;
                    if (!(apiResult instanceof ApiResult.Success)) {
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest.w("Failed to fetch personalized ads settings: " + TextUtilsCompat.errorMessaging((AndroidStringManager) localHomePresenter.featureFlagManager, (ApiResult.Failure) apiResult, null), new Object[0]);
                        return null;
                    }
                    EducationalButtonAction educationalButtonAction = ((GetPersonalizedAdsStateResponse) ((ApiResult.Success) apiResult).response).response;
                    if (educationalButtonAction != null) {
                        GetPersonalizedAdsStateResponse$Response$Error getPersonalizedAdsStateResponse$Response$Error = educationalButtonAction instanceof GetPersonalizedAdsStateResponse$Response$Error ? (GetPersonalizedAdsStateResponse$Response$Error) educationalButtonAction : null;
                        if (getPersonalizedAdsStateResponse$Response$Error != null) {
                            personalizedAdsError = getPersonalizedAdsStateResponse$Response$Error.value;
                            if (personalizedAdsError == null) {
                                Timber.Forest forest = Timber.Forest;
                                if (educationalButtonAction != null) {
                                    GetPersonalizedAdsStateResponse$Response$Error getPersonalizedAdsStateResponse$Response$Error2 = educationalButtonAction instanceof GetPersonalizedAdsStateResponse$Response$Error ? (GetPersonalizedAdsStateResponse$Response$Error) educationalButtonAction : null;
                                    if (getPersonalizedAdsStateResponse$Response$Error2 != null) {
                                        personalizedAdsError2 = getPersonalizedAdsStateResponse$Response$Error2.value;
                                        forest.e("Personalized ads state response contains error: " + personalizedAdsError2, new Object[0]);
                                        return null;
                                    }
                                }
                                personalizedAdsError2 = null;
                                forest.e("Personalized ads state response contains error: " + personalizedAdsError2, new Object[0]);
                                return null;
                            }
                            if (educationalButtonAction != null) {
                                GetPersonalizedAdsStateResponse$Response$State getPersonalizedAdsStateResponse$Response$State = educationalButtonAction instanceof GetPersonalizedAdsStateResponse$Response$State ? (GetPersonalizedAdsStateResponse$Response$State) educationalButtonAction : null;
                                if (getPersonalizedAdsStateResponse$Response$State != null) {
                                    state = getPersonalizedAdsStateResponse$Response$State.value;
                                    if (state != null) {
                                        Timber.Forest.w("Personalized ads state is missing from successful response", new Object[0]);
                                        return null;
                                    }
                                    Boolean bool = state.personalized_ads_enabled;
                                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                                    String str = state.copy_text;
                                    if (str == null) {
                                        str = "";
                                    }
                                    return new RealPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings(booleanValue, str);
                                }
                            }
                            state = null;
                            if (state != null) {
                            }
                        }
                    }
                    personalizedAdsError = null;
                    if (personalizedAdsError == null) {
                    }
                case 10:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    if (i17 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealContactAliasFetcher realContactAliasFetcher2 = (RealContactAliasFetcher) ((LocalEditorialPresenter) obj3).installedStore;
                        this.label = 1;
                        if (realContactAliasFetcher2.fetchAndStoreAliases(this) == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                    } else {
                        if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 11:
                    MooncakeAddressSheet mooncakeAddressSheet = (MooncakeAddressSheet) obj3;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.label;
                    if (i18 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ChannelFlowTransformLatest address = mooncakeAddressSheet.addressManager.address();
                        RingtoneView.AnonymousClass1.C00651 c00651 = new RingtoneView.AnonymousClass1.C00651(mooncakeAddressSheet, i2);
                        this.label = 1;
                        if (address.collect(c00651, this) == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                    } else {
                        if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 12:
                    ProfileCropView profileCropView = (ProfileCropView) obj3;
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = this.label;
                    if (i19 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ChannelAsFlow receiveAsFlow = FlowKt.receiveAsFlow(profileCropView.okViewClickChannel);
                        ProfileCropView$3$1$1 profileCropView$3$1$1 = new ProfileCropView$3$1$1(profileCropView, errorType, z ? 1 : 0);
                        RingtoneView.AnonymousClass1.C00651 c006512 = new RingtoneView.AnonymousClass1.C00651(profileCropView, i3);
                        this.label = 1;
                        Object collect2 = receiveAsFlow.collect(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2(new ProfileCropView$3$1$invokeSuspend$$inlined$map$1$2(new ProfileCropView$3$1$invokeSuspend$$inlined$map$1$2(c006512, profileCropView, 0), profileCropView, 1), profileCropView$3$1$1, 1), this);
                        if (collect2 != coroutineSingletons11) {
                            collect2 = Unit.INSTANCE;
                        }
                        if (collect2 != coroutineSingletons11) {
                            collect2 = Unit.INSTANCE;
                        }
                        if (collect2 != coroutineSingletons11) {
                            collect2 = Unit.INSTANCE;
                        }
                        if (collect2 == coroutineSingletons11) {
                            return coroutineSingletons11;
                        }
                    } else {
                        if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 13:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    int i20 = this.label;
                    RingtoneView ringtoneView = (RingtoneView) obj3;
                    RingtoneManager ringtoneManager = ringtoneView.rm;
                    if (i20 == ringtoneView.defaultRingtonePos) {
                        if (ringtoneView.defaultRingtone == null) {
                            ringtoneView.defaultRingtone = RingtoneManager.getRingtone(ringtoneView.getContext(), ringtoneView.uriForDefaultItem);
                        }
                        Ringtone ringtone2 = ringtoneView.defaultRingtone;
                        if (ringtone2 != null) {
                            ringtone2.setStreamType(ringtoneManager.inferStreamType());
                        }
                        ringtone = ringtoneView.defaultRingtone;
                    } else {
                        RingtoneItem ringtoneItem = (RingtoneItem) ringtoneView.additionalItemsByPosition.get(i20);
                        ringtone = ringtoneItem == null ? ringtoneManager.getRingtone(i20 - ringtoneView.staticItemCount) : RingtoneManager.getRingtone(ringtoneView.getContext(), ringtoneItem.playbackUri);
                    }
                    if (ringtone != null) {
                        ringtone.play();
                    }
                    return Unit.INSTANCE;
                case 14:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i21 = this.label;
                    if (i21 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealReferralManager realReferralManager = (RealReferralManager) ((CardLockPresenter) obj3).issuedCardManager;
                        this.label = 1;
                        if (realReferralManager.refresh(true, this) == coroutineSingletons13) {
                            return coroutineSingletons13;
                        }
                    } else {
                        if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 15:
                    TaxReturnsPresenter taxReturnsPresenter2 = (TaxReturnsPresenter) obj3;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i22 = this.label;
                    if (i22 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ((Analytics) taxReturnsPresenter2.router).track(new QRCodeShortcutsOnboardingView(), null);
                        KeyValue keyValue = (KeyValue) taxReturnsPresenter2.taxesDocumentsTaxReturnsDataProvider;
                        Boolean bool2 = Boolean.TRUE;
                        this.label = 1;
                        if (keyValue.set(bool2, this) == coroutineSingletons14) {
                            return coroutineSingletons14;
                        }
                    } else {
                        if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 16:
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i23 = this.label;
                    if (i23 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (RealSavingsAppletTileRepository.access$refreshApplet((RealSavingsAppletTileRepository) obj3, this) == coroutineSingletons15) {
                            return coroutineSingletons15;
                        }
                    } else {
                        if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 17:
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i24 = this.label;
                    if (i24 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (SavingsScreenPresenter.access$refreshSavingsScreens((SavingsScreenPresenter) obj3, this) == coroutineSingletons16) {
                            return coroutineSingletons16;
                        }
                    } else {
                        if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 18:
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i25 = this.label;
                    if (i25 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        LocalEditorialPresenter localEditorialPresenter2 = (LocalEditorialPresenter) obj3;
                        RealPasscodeFlowStarter realPasscodeFlowStarter = (RealPasscodeFlowStarter) localEditorialPresenter2.installedStore;
                        RecoveryGuideScreen recoveryGuideScreen = (RecoveryGuideScreen) localEditorialPresenter2.launcher;
                        BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) localEditorialPresenter2.navigator;
                        this.label = 1;
                        screenNavigator2.goTo(((RealFlowStarter) realPasscodeFlowStarter.blockersNavigator).startPasscodeFlow(Flow$Type.SET_OR_UPDATE_PASSCODE, recoveryGuideScreen));
                        if (Unit.INSTANCE == coroutineSingletons17) {
                            return coroutineSingletons17;
                        }
                    } else {
                        if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 19:
                    Object obj8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i26 = this.label;
                    if (i26 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        AppConfigManager appConfigManager = ((RealUrlAuthenticator) obj3).appConfig;
                        this.label = 1;
                        RealAppConfigManager realAppConfigManager = (RealAppConfigManager) appConfigManager;
                        Object withContext = JobKt.withContext(realAppConfigManager.ioDispatcher, new RealAppConfigManager$update$2$1(realAppConfigManager, errorType, i6), this);
                        Object obj9 = withContext;
                        if (withContext != obj8) {
                            obj9 = Unit.INSTANCE;
                        }
                        if (obj9 == obj8) {
                            return obj8;
                        }
                    } else {
                        if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 20:
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i27 = this.label;
                    if (i27 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealSheetState realSheetState = ((BasicShieetScope) obj3).state;
                        this.label = 1;
                        if (realSheetState.dismiss(this) == coroutineSingletons18) {
                            return coroutineSingletons18;
                        }
                    } else {
                        if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 21:
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i28 = this.label;
                    if (i28 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (((RealSupportPhoneService) obj3).requestPhoneStatusUpdate(this) == coroutineSingletons19) {
                            return coroutineSingletons19;
                        }
                    } else {
                        if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 22:
                    ArticlePresenter articlePresenter = (ArticlePresenter) obj3;
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i29 = this.label;
                    if (i29 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        StateFlowImpl stateFlowImpl = articlePresenter.incidentsService.store;
                        this.label = 1;
                        first = FlowKt.first(stateFlowImpl, this);
                        if (first == coroutineSingletons20) {
                            return coroutineSingletons20;
                        }
                    } else {
                        if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        first = obj;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj10 : (Iterable) first) {
                        if (ArticlePresenter.ONGOING_INCIDENT_TYPES.contains(((Incident) obj10).status)) {
                            arrayList.add(obj10);
                        }
                    }
                    articlePresenter.analytics.track(new CustomerSupportAccessViewIncidentAlerts(articlePresenter.args.data.flowToken, new Integer(arrayList.size()), CustomerSupportAccessViewIncidentAlerts.Trigger.NODE), null);
                    articlePresenter.navigator.askQuestion(SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.INSTANCE, new BottomSheet$$ExternalSyntheticLambda3(14, articlePresenter, arrayList));
                    return Unit.INSTANCE;
                case 23:
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i30 = this.label;
                    if (i30 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (InviteErrorPresenter.access$loadClientScenario((InviteErrorPresenter) obj3, this) == coroutineSingletons21) {
                            return coroutineSingletons21;
                        }
                    } else {
                        if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 24:
                    SupportPhoneStatusPresenter supportPhoneStatusPresenter = (SupportPhoneStatusPresenter) obj3;
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i31 = this.label;
                    if (i31 != 0) {
                        if (i31 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            long j = supportPhoneStatusPresenter.pollingInterval;
                            this.label = 2;
                            break;
                        } else if (i31 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    SafeTrace.throwOnFailure(obj);
                    RealSupportPhoneService realSupportPhoneService = supportPhoneStatusPresenter.supportPhoneService;
                    this.label = 1;
                    break;
                case 25:
                    WorkHomePresenter workHomePresenter = (WorkHomePresenter) obj3;
                    TapToPayErrorDialogScreen tapToPayErrorDialogScreen = (TapToPayErrorDialogScreen) workHomePresenter.youPresenter;
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i32 = this.label;
                    if (i32 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper = (RealTapToPayAnalyticsHelper) workHomePresenter.shiftsAnalytics;
                        FlowType flowType = FlowType.ONBOARDING;
                        String errorMessage = tapToPayErrorDialogScreen.getErrorMessage();
                        String valueOf = (errorMessage == null || errorMessage.length() == 0) ? String.valueOf(tapToPayErrorDialogScreen.getErrorReason()) : tapToPayErrorDialogScreen.getErrorReason() + ": " + tapToPayErrorDialogScreen.getErrorMessage();
                        TapToPayErrorReason errorReason = tapToPayErrorDialogScreen.getErrorReason();
                        errorReason.getClass();
                        switch (errorReason.ordinal()) {
                            case 0:
                            case 3:
                                this.label = 1;
                                submitErrorEvent = realTapToPayAnalyticsHelper.submitErrorEvent(FlowType.PAYMENT, valueOf, errorType, this);
                                if (submitErrorEvent == coroutineSingletons23) {
                                    return coroutineSingletons23;
                                }
                                break;
                            case 1:
                            case 2:
                                errorType = ErrorType.ClientSystemWarmUpError;
                                this.label = 1;
                                submitErrorEvent = realTapToPayAnalyticsHelper.submitErrorEvent(FlowType.PAYMENT, valueOf, errorType, this);
                                if (submitErrorEvent == coroutineSingletons23) {
                                }
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                errorType = ErrorType.ClientPolicyError;
                                this.label = 1;
                                submitErrorEvent = realTapToPayAnalyticsHelper.submitErrorEvent(FlowType.PAYMENT, valueOf, errorType, this);
                                if (submitErrorEvent == coroutineSingletons23) {
                                }
                                break;
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                                errorType = ErrorType.PaymentCardReaderError;
                                this.label = 1;
                                submitErrorEvent = realTapToPayAnalyticsHelper.submitErrorEvent(FlowType.PAYMENT, valueOf, errorType, this);
                                if (submitErrorEvent == coroutineSingletons23) {
                                }
                                break;
                            case 13:
                                errorType = ErrorType.PaymentCardReaderSessionReadError;
                                this.label = 1;
                                submitErrorEvent = realTapToPayAnalyticsHelper.submitErrorEvent(FlowType.PAYMENT, valueOf, errorType, this);
                                if (submitErrorEvent == coroutineSingletons23) {
                                }
                                break;
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                        }
                    } else {
                        if (i32 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 26:
                    InviteErrorPresenter inviteErrorPresenter = (InviteErrorPresenter) obj3;
                    TapToPayErrorScreen tapToPayErrorScreen = (TapToPayErrorScreen) inviteErrorPresenter.args;
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i33 = this.label;
                    if (i33 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper2 = (RealTapToPayAnalyticsHelper) inviteErrorPresenter.analytics;
                        FlowType flowType2 = FlowType.ONBOARDING;
                        String valueOf2 = String.valueOf(tapToPayErrorScreen.reason);
                        TapToPayErrorReason tapToPayErrorReason = tapToPayErrorScreen.reason;
                        tapToPayErrorReason.getClass();
                        switch (tapToPayErrorReason.ordinal()) {
                            case 0:
                            case 3:
                                this.label = 1;
                                submitErrorEvent2 = realTapToPayAnalyticsHelper2.submitErrorEvent(FlowType.PAYMENT, valueOf2, errorType2, this);
                                if (submitErrorEvent2 == coroutineSingletons24) {
                                    return coroutineSingletons24;
                                }
                                break;
                            case 1:
                            case 2:
                                errorType2 = ErrorType.ClientSystemWarmUpError;
                                this.label = 1;
                                submitErrorEvent2 = realTapToPayAnalyticsHelper2.submitErrorEvent(FlowType.PAYMENT, valueOf2, errorType2, this);
                                if (submitErrorEvent2 == coroutineSingletons24) {
                                }
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                errorType2 = ErrorType.ClientPolicyError;
                                this.label = 1;
                                submitErrorEvent2 = realTapToPayAnalyticsHelper2.submitErrorEvent(FlowType.PAYMENT, valueOf2, errorType2, this);
                                if (submitErrorEvent2 == coroutineSingletons24) {
                                }
                                break;
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                                errorType2 = ErrorType.PaymentCardReaderError;
                                this.label = 1;
                                submitErrorEvent2 = realTapToPayAnalyticsHelper2.submitErrorEvent(FlowType.PAYMENT, valueOf2, errorType2, this);
                                if (submitErrorEvent2 == coroutineSingletons24) {
                                }
                                break;
                            case 13:
                                errorType2 = ErrorType.PaymentCardReaderSessionReadError;
                                this.label = 1;
                                submitErrorEvent2 = realTapToPayAnalyticsHelper2.submitErrorEvent(FlowType.PAYMENT, valueOf2, errorType2, this);
                                if (submitErrorEvent2 == coroutineSingletons24) {
                                }
                                break;
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                        }
                    } else {
                        if (i33 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 27:
                    TaxReturnsPresenter taxReturnsPresenter3 = (TaxReturnsPresenter) obj3;
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i34 = this.label;
                    if (i34 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        KeyValue keyValue2 = (KeyValue) taxReturnsPresenter3.args;
                        Boolean bool3 = Boolean.FALSE;
                        this.label = 1;
                        break;
                    } else {
                        if (i34 != 1) {
                            if (i34 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper3 = (RealTapToPayAnalyticsHelper) taxReturnsPresenter3.taxesDocumentsTaxReturnsDataProvider;
                    FlowType flowType3 = FlowType.ONBOARDING;
                    ScreenID screenID = ScreenID.FirstTimeScreen;
                    this.label = 2;
                    break;
                case 28:
                    TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) obj3;
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i35 = this.label;
                    if (i35 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper4 = (RealTapToPayAnalyticsHelper) tapToPayPresenter.tapToPayAnalyticsHelper;
                        FlowType flowType4 = FlowType.ONBOARDING;
                        ScreenID screenID2 = ScreenID.LoadingScreen;
                        this.label = 1;
                        break;
                    } else {
                        if (i35 != 1) {
                            if (i35 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    TapToPayScreen tapToPayScreen = (TapToPayScreen) tapToPayPresenter.screen;
                    TapToPayScreen.TapToPayInitialScreen tapToPayInitialScreen = tapToPayScreen instanceof TapToPayScreen.TapToPayInitialScreen ? (TapToPayScreen.TapToPayInitialScreen) tapToPayScreen : null;
                    if (tapToPayInitialScreen != null && (uuid = tapToPayInitialScreen.paymentPadUUID) != null) {
                        RealTapToPayActionManager realTapToPayActionManager = (RealTapToPayActionManager) tapToPayPresenter.tapToPayActionManager;
                        String uuid2 = uuid.toString();
                        uuid2.getClass();
                        this.label = 2;
                        Object emit = realTapToPayActionManager.tapToPayActions.emit(new TapToPayAction$InitiateTapToPayAction(uuid2), this);
                        if (emit != coroutineSingletons26) {
                            emit = Unit.INSTANCE;
                            break;
                        }
                    }
                    return Unit.INSTANCE;
                default:
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i36 = this.label;
                    if (i36 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        TaxAuthorizationPresenter taxAuthorizationPresenter = (TaxAuthorizationPresenter) obj3;
                        TaxLocation taxLocation = ((TaxAuthorizationScreen) taxAuthorizationPresenter.args).taxLocation;
                        this.label = 1;
                        if ((taxLocation instanceof TaxLocation.DeepLink) || Intrinsics.areEqual(taxLocation, TaxLocation.EFile.INSTANCE) || Intrinsics.areEqual(taxLocation, TaxLocation.EstimateYourRefund.INSTANCE)) {
                            flowTokenFromTaxServer = taxAuthorizationPresenter.getFlowTokenFromTaxServer(this);
                            if (flowTokenFromTaxServer != coroutineSingletons27) {
                                flowTokenFromTaxServer = Unit.INSTANCE;
                            }
                        } else if (Intrinsics.areEqual(taxLocation, TaxLocation.TaxHub.INSTANCE)) {
                            flowTokenFromTaxServer = taxAuthorizationPresenter.getTaxHubWebViewBlockerFromTaxServer(this);
                            if (flowTokenFromTaxServer != coroutineSingletons27) {
                                flowTokenFromTaxServer = Unit.INSTANCE;
                            }
                        } else {
                            if (!(taxLocation instanceof TaxLocation.TaxHubWithDeepLink)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            flowTokenFromTaxServer = taxAuthorizationPresenter.getViewTaxDeepLinkBlockerFromTaxServer((TaxLocation.TaxHubWithDeepLink) taxLocation, this);
                            if (flowTokenFromTaxServer != coroutineSingletons27) {
                                flowTokenFromTaxServer = Unit.INSTANCE;
                            }
                        }
                        if (flowTokenFromTaxServer == coroutineSingletons27) {
                            return coroutineSingletons27;
                        }
                    } else {
                        if (i36 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = obj;
        }
    }
}
