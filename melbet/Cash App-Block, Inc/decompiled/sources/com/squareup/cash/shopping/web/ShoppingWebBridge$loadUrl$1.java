package com.squareup.cash.shopping.web;

import android.provider.Telephony;
import androidx.camera.core.processing.TargetUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.gridlayout.widget.GridLayout;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import app.cash.api.ApiResult;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpe;
import com.google.mlkit.vision.text.zzb;
import com.squareup.cash.R;
import com.squareup.cash.activity.primitives.ActivityItemKey;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.card.onboarding.CardModelView$textures$$inlined$combine$1;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessOpenIncidentAlert;
import com.squareup.cash.cdf.customersupport.CustomerSupportFullTransactionPickerView;
import com.squareup.cash.cdf.customersupport.CustomerSupportPhoneCancel;
import com.squareup.cash.cdf.customersupport.CustomerSupportSearchEnterText;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileLocalTabVisibility;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper$special$$inlined$map$1;
import com.squareup.cash.offers.db.OffersHomeQueries$ForIdQuery;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$3$1;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.security.presenters.BasePasswordPresenter;
import com.squareup.cash.security.presenters.PasswordResponseAdapter;
import com.squareup.cash.sharesheet.RealShareTargetsManager$TargetPreparationState;
import com.squareup.cash.sharesheet.RealShareTargetsManager$addSmsTarget$$inlined$map$1;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sharesheet.ShareSheetPresenter$models$1$1$4;
import com.squareup.cash.sharesheet.ShareSheetPresenter$models$1$1$5;
import com.squareup.cash.sharesheet.ShareTarget;
import com.squareup.cash.sharesheet.ShareableAssetsManager$ShareableAssets;
import com.squareup.cash.sheet.RealSheetState$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.backend.api.FiltersResults;
import com.squareup.cash.shopping.backend.api.PayLaterBusinessProfile;
import com.squareup.cash.shopping.backend.api.SearchQuery;
import com.squareup.cash.shopping.backend.real.RealProductSearchRepository;
import com.squareup.cash.shopping.backend.real.RealRecentSearchManager;
import com.squareup.cash.shopping.backend.real.RealShippingAddressRepository;
import com.squareup.cash.shopping.db.ShoppingRecentlyViewed;
import com.squareup.cash.shopping.db.ShoppingRecentlyViewedQueries$recentlyViewed$2;
import com.squareup.cash.shopping.presenters.ProductSearchPresenter;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.settings.presenters.ShoppingSettingsAutofillPresenter;
import com.squareup.cash.shopping.viewmodels.ShoppingWebBridgeEvent;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.support.backend.api.SupportPhoneStatus;
import com.squareup.cash.support.backend.api.articles.ArticlesService$ArticleResult;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.backend.real.RealSupportPhoneService;
import com.squareup.cash.support.backend.real.articles.RealArticlesService;
import com.squareup.cash.support.chat.backend.api.ChatSurvey;
import com.squareup.cash.support.chat.backend.api.ChatSurveyResponse;
import com.squareup.cash.support.chat.backend.api.MessageBody;
import com.squareup.cash.support.chat.backend.real.RealChatManager;
import com.squareup.cash.support.chat.backend.real.RealChatSurveyService;
import com.squareup.cash.support.chat.backend.real.RealPendingMessagesStore;
import com.squareup.cash.support.chat.backend.real.RealTransactionBodyResolver;
import com.squareup.cash.support.chat.backend.real.TransactionBodyResolver;
import com.squareup.cash.support.chat.presenters.ChatPresenter;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatViewEvent;
import com.squareup.cash.support.incidents.backend.api.Incident;
import com.squareup.cash.support.incidents.backend.real.RealIncidentsService;
import com.squareup.cash.support.presenters.ArticlePresenter;
import com.squareup.cash.support.presenters.RealSupportLinkNavigator;
import com.squareup.cash.support.presenters.SupportHomePresenter;
import com.squareup.cash.support.presenters.SupportIncidentDetailsPresenter$State;
import com.squareup.cash.support.presenters.SupportPhoneStatusPresenter;
import com.squareup.cash.support.presenters.SupportSearchPresenter;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.ArticleViewEvent;
import com.squareup.cash.support.viewmodels.SupportHomeViewEvent;
import com.squareup.cash.support.viewmodels.SupportSearchViewEvent;
import com.squareup.cash.tabprovider.real.RealLocalTabProvider;
import com.squareup.cash.tabprovider.real.RealTabProvider;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$1$1;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$1$5;
import com.squareup.cash.transfers.presenters.InstrumentDetailsPresenter;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.treehouse.activity.SerializableActivityItem;
import com.squareup.cash.ui.PaymentPasscodeActivity$loadView$3$1;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider$getPasscode$1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.cashstorefronts.api.BusinessProfile;
import com.squareup.protos.cash.cashstorefronts.api.CashStorefrontsClientService;
import com.squareup.protos.cash.cashstorefronts.api.Feature;
import com.squareup.protos.cash.cashstorefronts.api.GetBusinessProfileRequest;
import com.squareup.protos.cash.cashstorefronts.api.GetBusinessProfileResponse;
import com.squareup.protos.cash.customersearch.api.CustomerSearchClientService;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.customersearch.api.ShopSearchProductFiltersRequest;
import com.squareup.protos.cash.customersearch.api.ShopSearchProductFiltersResponse;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.protos.cash.grantly.app.UpdateDefaultShippingAddressRequest;
import com.squareup.protos.cash.sup.api.v1.CancelCheckoutRequest;
import com.squareup.protos.cash.supportal.app.EndChatRequest;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.util.android.AndroidPackageManager;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import com.squareup.util.coroutines.Teardown;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import com.stripe.hcaptcha.HCaptcha;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.CombineKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ShoppingWebBridge$loadUrl$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $url;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingWebBridge$loadUrl$1(String str, ShoppingWebPresenter shoppingWebPresenter, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 11;
        this.$url = str;
        this.this$0 = shoppingWebPresenter;
    }

    private final Object invokeSuspend$com$squareup$cash$support$presenters$UnauthenticatedArticlePresenter$models$1$1(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.this$0;
            RealArticlesService realArticlesService = (RealArticlesService) localEditorialPresenter.launcher;
            SupportScreens.UnauthenticatedArticleScreen unauthenticatedArticleScreen = (SupportScreens.UnauthenticatedArticleScreen) localEditorialPresenter.clock;
            String str = unauthenticatedArticleScreen.flowToken;
            String str2 = unauthenticatedArticleScreen.token;
            this.label = 1;
            obj = realArticlesService.getArticle(str, str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        ((MutableState) this.$url).setValue((ArticlesService$ArticleResult) obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$url;
        switch (i) {
            case 0:
                return new ShoppingWebBridge$loadUrl$1((ShoppingWebBridge) this.this$0, (String) obj2, continuation, 0);
            case 1:
                return new ShoppingWebBridge$loadUrl$1((Animatable) this.this$0, (Motion) obj2, continuation, 1);
            case 2:
                ShoppingWebBridge$loadUrl$1 shoppingWebBridge$loadUrl$1 = new ShoppingWebBridge$loadUrl$1((BasePasswordPresenter) obj2, continuation, 2);
                shoppingWebBridge$loadUrl$1.this$0 = obj;
                return shoppingWebBridge$loadUrl$1;
            case 3:
                return new ShoppingWebBridge$loadUrl$1((Job) this.this$0, (Ref$ObjectRef) obj2, continuation, 3);
            case 4:
                ShoppingWebBridge$loadUrl$1 shoppingWebBridge$loadUrl$12 = new ShoppingWebBridge$loadUrl$1((ShareTarget.Instagram) obj2, continuation, 4);
                shoppingWebBridge$loadUrl$12.this$0 = obj;
                return shoppingWebBridge$loadUrl$12;
            case 5:
                ShoppingWebBridge$loadUrl$1 shoppingWebBridge$loadUrl$13 = new ShoppingWebBridge$loadUrl$1((ShareTarget.SaveToPhotos) obj2, continuation, 5);
                shoppingWebBridge$loadUrl$13.this$0 = obj;
                return shoppingWebBridge$loadUrl$13;
            case 6:
                return new ShoppingWebBridge$loadUrl$1((ShareSheetPresenter) this.this$0, (MutableState) obj2, continuation, 6);
            case 7:
                return new ShoppingWebBridge$loadUrl$1((RealProductSearchRepository) this.this$0, (SearchQuery) obj2, continuation, 7);
            case 8:
                return new ShoppingWebBridge$loadUrl$1((RealRecentSearchManager) obj2, continuation, 8);
            case 9:
                return new ShoppingWebBridge$loadUrl$1((RealShippingAddressRepository) this.this$0, (String) obj2, continuation, 9);
            case 10:
                return new ShoppingWebBridge$loadUrl$1((ProductSearchPresenter) this.this$0, (SearchQuery) obj2, continuation, 10);
            case 11:
                return new ShoppingWebBridge$loadUrl$1((String) obj2, (ShoppingWebPresenter) this.this$0, continuation);
            case 12:
                return new ShoppingWebBridge$loadUrl$1((ShoppingSettingsAutofillPresenter) this.this$0, (MutableState) obj2, continuation, 12);
            case 13:
                return new ShoppingWebBridge$loadUrl$1((ShoppingWebChromeClient) this.this$0, (String) obj2, continuation, 13);
            case 14:
                return new ShoppingWebBridge$loadUrl$1((ShoppingWebViewClient) this.this$0, (String) obj2, continuation, 14);
            case 15:
                return new ShoppingWebBridge$loadUrl$1((RealChatManager) this.this$0, (String) obj2, continuation, 15);
            case 16:
                return new ShoppingWebBridge$loadUrl$1((RealChatSurveyService) obj2, continuation, 16);
            case 17:
                return new ShoppingWebBridge$loadUrl$1((RealPendingMessagesStore) this.this$0, (MessageBody.TransactionBody.Selected) obj2, continuation, 17);
            case 18:
                return new ShoppingWebBridge$loadUrl$1((ChatPresenter) this.this$0, (ChatViewEvent) obj2, continuation, 18);
            case 19:
                return new ShoppingWebBridge$loadUrl$1((PdfPreviewPresenter) this.this$0, (MutableState) obj2, continuation, 19);
            case 20:
                return new ShoppingWebBridge$loadUrl$1((ArticlePresenter) this.this$0, (ArticleViewEvent) obj2, continuation, 20);
            case 21:
                return new ShoppingWebBridge$loadUrl$1((ArticlePresenter) this.this$0, (State) obj2, continuation, 21);
            case 22:
                return new ShoppingWebBridge$loadUrl$1((LocalHomePresenter) this.this$0, (MutableState) obj2, continuation, 22);
            case 23:
                return new ShoppingWebBridge$loadUrl$1((SupportHomePresenter) this.this$0, (SupportHomeViewEvent) obj2, continuation, 23);
            case 24:
                return new ShoppingWebBridge$loadUrl$1((InstrumentDetailsPresenter) this.this$0, (MutableState) obj2, continuation, 24);
            case 25:
                return new ShoppingWebBridge$loadUrl$1((SupportPhoneStatusPresenter) this.this$0, (MutableState) obj2, continuation, 25);
            case 26:
                return new ShoppingWebBridge$loadUrl$1((Flow) this.this$0, (SupportSearchPresenter) obj2, continuation, 26);
            case 27:
                return new ShoppingWebBridge$loadUrl$1((MutableSharedFlow) this.this$0, (SupportSearchViewEvent) obj2, continuation, 27);
            case 28:
                return new ShoppingWebBridge$loadUrl$1((LocalEditorialPresenter) this.this$0, (MutableState) obj2, continuation, 28);
            default:
                ShoppingWebBridge$loadUrl$1 shoppingWebBridge$loadUrl$14 = new ShoppingWebBridge$loadUrl$1(continuation, (RealTabProvider) obj2);
                shoppingWebBridge$loadUrl$14.this$0 = obj;
                return shoppingWebBridge$loadUrl$14;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((ShoppingWebBridge$loadUrl$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a4, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b9, code lost:
    
        if (r4 == r7) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01aa, code lost:
    
        if (r9 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0180, code lost:
    
        if (r8 == r7) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c8, code lost:
    
        if (r4 == r7) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x04fa, code lost:
    
        if (r7 == r0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x051d, code lost:
    
        if (com.squareup.util.coroutines.StateFlowKt.until(r9, r10, r21) == r0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x088b, code lost:
    
        if (r1 == r0) goto L385;
     */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:436:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x051d -> B:221:0x04f2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineContext coroutineContext;
        Flow flow;
        Flow flow2;
        final Flow flow3;
        Object shopSearchProductFilters;
        List executeAsList;
        Object businessProfile;
        boolean z;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        Object obj2;
        Object cacheActivityItemAndCheckEnrichedReceipt;
        Object survey;
        String str;
        Object cacheActivityItemAndCheckEnrichedReceipt2;
        Object access$awaitInitialLoadedActivities;
        ArrayList arrayList;
        Unit navigateWith;
        Object incident;
        Object first;
        Incident incident2;
        Object incident3;
        CustomerSupportAccessOpenIncidentAlert.Status status;
        CustomerSupportAccessOpenIncidentAlert.Trigger trigger;
        int i = this.$r8$classId;
        int i2 = 20;
        int i3 = 28;
        int i4 = 5;
        int i5 = 26;
        int i6 = 6;
        int i7 = 9;
        int i8 = 2;
        int i9 = 0;
        Object obj3 = this.$url;
        final int i10 = 1;
        Continuation continuation = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShoppingWebBridge shoppingWebBridge = (ShoppingWebBridge) this.this$0;
                    RealShoppingWebCheckoutCookieManager realShoppingWebCheckoutCookieManager = shoppingWebBridge.shoppingWebCheckoutCookieManager;
                    String str2 = (String) obj3;
                    boolean z12 = shoppingWebBridge.afterpayUseCase;
                    this.label = 1;
                    if (realShoppingWebCheckoutCookieManager.syncCookieTokens(str2, z12, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable = (Animatable) this.this$0;
                    Float f = new Float(2.0f);
                    SpringSpec steady$default = TargetUtils.steady$default((zzb) ((Motion) obj3).springs.text);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, f, steady$default, null, null, this, 12) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                PasswordResponseAdapter passwordResponseAdapter = (PasswordResponseAdapter) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str3 = passwordResponseAdapter.passwordToken;
                    if (str3 != null) {
                        AndroidBiometricsStore androidBiometricsStore = ((BasePasswordPresenter) obj3).biometricsStore;
                        this.this$0 = null;
                        this.label = 1;
                        if (androidBiometricsStore.write("biometric_enclave_key", str3, this) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Job job = (Job) this.this$0;
                    this.label = 1;
                    if (job.join(this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Teardown teardown = (Teardown) ((Ref$ObjectRef) obj3).element;
                if (teardown != null) {
                    teardown.teardown();
                    return Unit.INSTANCE;
                }
                return null;
            case 4:
                FlowCollector flowCollector = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealShareTargetsManager$TargetPreparationState.Loading loading = new RealShareTargetsManager$TargetPreparationState.Loading((ShareTarget.Instagram) obj3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flowCollector.emit(loading, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                FlowCollector flowCollector2 = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealShareTargetsManager$TargetPreparationState.Loading loading2 = new RealShareTargetsManager$TargetPreparationState.Loading((ShareTarget.SaveToPhotos) obj3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flowCollector2.emit(loading2, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) this.this$0;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowExtensionsKt$combine$$inlined$combine$1 flowExtensionsKt$combine$$inlined$combine$1 = new FlowExtensionsKt$combine$$inlined$combine$1(7, ((RealProfileManager) shareSheetPresenter.profileManager).currencyCode(), shareSheetPresenter);
                    final StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) shareSheetPresenter.shareTargetsManager;
                    AndroidStringManager androidStringManager = (AndroidStringManager) stuckPlayerDetector.clock;
                    AndroidPackageManager androidPackageManager = (AndroidPackageManager) stuckPlayerDetector.handler;
                    HCaptcha hCaptcha = (HCaptcha) stuckPlayerDetector.player;
                    ReadonlySharedFlow shareIn = FlowKt.shareIn(FlowKt.flowOn(((RealProfileManager) hCaptcha.result).publicProfile(), (CoroutineContext) hCaptcha.onOpenListeners), (CoroutineScope) hCaptcha.handler, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1);
                    int i18 = 3;
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop = FlowKt.drop(new FlowUtil$createFlow$$inlined$map$1(new ShareableAssetsManager$ShareableAssets(null, null, 3), FlowKt.merge(new RealRecipientRepository$suggestions$$inlined$map$1(FlowKt.distinctUntilChanged(new RealOffersAnalyticsHelper$special$$inlined$map$1(shareIn, i18)), 9), new RealDrawerOpener$getDrawerScreen$$inlined$map$1(FlowKt.transformLatest(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(FlowKt.distinctUntilChanged(new RealOffersAnalyticsHelper$special$$inlined$map$1(shareIn, 4)), new ProfileCropView.AnonymousClass3(hCaptcha, z4 ? 1 : 0, 18), i18), new RealPasscodeProvider$getPasscode$1((Continuation) (z3 ? 1 : 0), (Object) hCaptcha, 8)), 24)), new CardModelView.AnonymousClass1.AnonymousClass4(3, (Continuation) (z2 ? 1 : 0), 16)), 1);
                    CoroutineContext coroutineContext2 = (CoroutineContext) stuckPlayerDetector.stuckBufferingDetector;
                    Flow flowOn = FlowKt.flowOn(drop, coroutineContext2);
                    CoroutineScope coroutineScope = (CoroutineScope) stuckPlayerDetector.stuckPlayingDetector;
                    ReadonlySharedFlow shareIn2 = FlowKt.shareIn(flowOn, coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1);
                    final Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new RealOffersAnalyticsHelper$special$$inlined$map$1(shareIn2, i10));
                    Flow distinctUntilChanged2 = FlowKt.distinctUntilChanged(new RealOffersAnalyticsHelper$special$$inlined$map$1(shareIn2, 2));
                    Flow flowOn2 = FlowKt.flowOn(FlowKt.distinctUntilChanged(new RealDisclosureProvider$special$$inlined$map$1(((RealProfileManager) stuckPlayerDetector.playerListener).profile(), 20)), coroutineContext2);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (androidPackageManager.isPackageInstalled("com.twitter.android")) {
                        coroutineContext = coroutineContext2;
                        flow = distinctUntilChanged;
                        flow2 = flowOn2;
                        linkedHashMap.put(ShareTarget.Id.X_TARGET_ID, FlowKt.shareIn(new Flow() { // from class: com.squareup.cash.sharesheet.RealShareTargetsManager$addMoreTarget$$inlined$map$1

                            /* renamed from: com.squareup.cash.sharesheet.RealShareTargetsManager$addMoreTarget$$inlined$map$1$2, reason: invalid class name */
                            public final class AnonymousClass2 implements FlowCollector {
                                public final /* synthetic */ int $r8$classId;
                                public final /* synthetic */ FlowCollector $this_unsafeFlow;
                                public final /* synthetic */ StuckPlayerDetector this$0;

                                /* renamed from: com.squareup.cash.sharesheet.RealShareTargetsManager$addMoreTarget$$inlined$map$1$2$1, reason: invalid class name */
                                public final class AnonymousClass1 extends ContinuationImpl {
                                    public int label;
                                    public /* synthetic */ Object result;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= PKIFailureInfo.systemUnavail;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, StuckPlayerDetector stuckPlayerDetector, int i) {
                                    this.$r8$classId = i;
                                    this.$this_unsafeFlow = flowCollector;
                                    this.this$0 = stuckPlayerDetector;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
                                /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
                                /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    int i;
                                    RealShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1 realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1;
                                    int i2;
                                    int i3 = this.$r8$classId;
                                    StuckPlayerDetector stuckPlayerDetector = this.this$0;
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    switch (i3) {
                                        case 0:
                                            if (continuation instanceof AnonymousClass1) {
                                                anonymousClass1 = (AnonymousClass1) continuation;
                                                int i4 = anonymousClass1.label;
                                                if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                                                    anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                                                    Object obj2 = anonymousClass1.result;
                                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                    i = anonymousClass1.label;
                                                    if (i != 0) {
                                                        SafeTrace.throwOnFailure(obj2);
                                                        RealShareTargetsManager$TargetPreparationState.Ready ready = new RealShareTargetsManager$TargetPreparationState.Ready(new ShareTarget.More(((AndroidStringManager) stuckPlayerDetector.clock).get(R.string.share_more), new ShareTarget.More.Content((String) obj)));
                                                        anonymousClass1.label = 1;
                                                        if (flowCollector.emit(ready, anonymousClass1) == coroutineSingletons) {
                                                            break;
                                                        }
                                                    } else if (i != 1) {
                                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                        break;
                                                    } else {
                                                        SafeTrace.throwOnFailure(obj2);
                                                    }
                                                    break;
                                                }
                                            }
                                            anonymousClass1 = new AnonymousClass1(continuation);
                                            Object obj22 = anonymousClass1.result;
                                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                            i = anonymousClass1.label;
                                            if (i != 0) {
                                            }
                                        default:
                                            if (continuation instanceof RealShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1) {
                                                realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1 = (RealShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1) continuation;
                                                int i5 = realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1.label;
                                                if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                                                    realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                                                    Object obj3 = realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1.result;
                                                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                    i2 = realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1.label;
                                                    if (i2 != 0) {
                                                        SafeTrace.throwOnFailure(obj3);
                                                        RealShareTargetsManager$TargetPreparationState.Ready ready2 = new RealShareTargetsManager$TargetPreparationState.Ready(new ShareTarget.XApp(((AndroidStringManager) stuckPlayerDetector.clock).get(R.string.share_x), new ShareTarget.XApp.Content((String) obj)));
                                                        realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1.label = 1;
                                                        if (flowCollector.emit(ready2, realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1) == coroutineSingletons3) {
                                                            break;
                                                        }
                                                    } else if (i2 != 1) {
                                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                        break;
                                                    } else {
                                                        SafeTrace.throwOnFailure(obj3);
                                                    }
                                                    break;
                                                }
                                            }
                                            realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1 = new RealShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1(this, continuation);
                                            Object obj32 = realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1.result;
                                            CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                            i2 = realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1.label;
                                            if (i2 != 0) {
                                            }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlinx.coroutines.flow.Flow
                            public final Object collect(FlowCollector flowCollector3, Continuation continuation2) {
                                int i19 = i10;
                                StuckPlayerDetector stuckPlayerDetector2 = stuckPlayerDetector;
                                Flow flow4 = distinctUntilChanged;
                                switch (i19) {
                                    case 0:
                                        Object collect = flow4.collect(new AnonymousClass2(flowCollector3, stuckPlayerDetector2, 0), continuation2);
                                        if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            break;
                                        }
                                        break;
                                    default:
                                        Object collect2 = flow4.collect(new AnonymousClass2(flowCollector3, stuckPlayerDetector2, 1), continuation2);
                                        if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            break;
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1));
                    } else {
                        coroutineContext = coroutineContext2;
                        flow = distinctUntilChanged;
                        flow2 = flowOn2;
                    }
                    if (androidPackageManager.isPackageInstalled("com.instagram.android")) {
                        ShareTarget.Instagram instagram = new ShareTarget.Instagram(androidStringManager.get(R.string.share_insta), new ShareTarget.Instagram.Content(null));
                        linkedHashMap.put(ShareTarget.Id.INSTAGRAM_TARGET_ID, FlowKt.shareIn(FlowKt.flowOn(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new ShoppingWebBridge$loadUrl$1(instagram, (Continuation) null, 4), new RealActivityInvitePresenter(28, distinctUntilChanged2, instagram, stuckPlayerDetector)), coroutineContext), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1));
                    }
                    String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(androidPackageManager.context);
                    if (defaultSmsPackage == null || !androidPackageManager.isPackageInstalled(defaultSmsPackage)) {
                        flow3 = flow;
                    } else {
                        flow3 = flow;
                        linkedHashMap.put(ShareTarget.Id.SMS_TARGET_ID, FlowKt.shareIn(new RealShareTargetsManager$addSmsTarget$$inlined$map$1(flow3, stuckPlayerDetector, defaultSmsPackage, 0), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1));
                    }
                    linkedHashMap.put(ShareTarget.Id.COPY_TO_CLIPBOARD_TARGET_ID, FlowKt.shareIn(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flow3, flow2, new CardModelView$getActiveHeat$2$2(stuckPlayerDetector, (Continuation) null, 17), 0), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1));
                    ShareTarget.SaveToPhotos saveToPhotos = new ShareTarget.SaveToPhotos(androidStringManager.get(R.string.save_to_photos), new ShareTarget.SaveToPhotos.Content(null));
                    linkedHashMap.put(ShareTarget.Id.SAVE_TO_PHOTOS_TARGET_ID, FlowKt.shareIn(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new ShoppingWebBridge$loadUrl$1(saveToPhotos, (Continuation) null, 5), new RealActivityInvitePresenter(29, distinctUntilChanged2, saveToPhotos, stuckPlayerDetector)), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1));
                    final int i19 = 0;
                    linkedHashMap.put(ShareTarget.Id.MORE_TARGET_ID, FlowKt.shareIn(new Flow() { // from class: com.squareup.cash.sharesheet.RealShareTargetsManager$addMoreTarget$$inlined$map$1

                        /* renamed from: com.squareup.cash.sharesheet.RealShareTargetsManager$addMoreTarget$$inlined$map$1$2, reason: invalid class name */
                        public final class AnonymousClass2 implements FlowCollector {
                            public final /* synthetic */ int $r8$classId;
                            public final /* synthetic */ FlowCollector $this_unsafeFlow;
                            public final /* synthetic */ StuckPlayerDetector this$0;

                            /* renamed from: com.squareup.cash.sharesheet.RealShareTargetsManager$addMoreTarget$$inlined$map$1$2$1, reason: invalid class name */
                            public final class AnonymousClass1 extends ContinuationImpl {
                                public int label;
                                public /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= PKIFailureInfo.systemUnavail;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, StuckPlayerDetector stuckPlayerDetector, int i) {
                                this.$r8$classId = i;
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = stuckPlayerDetector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                            /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
                            /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
                            /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                int i;
                                RealShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1 realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1;
                                int i2;
                                int i3 = this.$r8$classId;
                                StuckPlayerDetector stuckPlayerDetector = this.this$0;
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                switch (i3) {
                                    case 0:
                                        if (continuation instanceof AnonymousClass1) {
                                            anonymousClass1 = (AnonymousClass1) continuation;
                                            int i4 = anonymousClass1.label;
                                            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                                                anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                                                Object obj22 = anonymousClass1.result;
                                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i = anonymousClass1.label;
                                                if (i != 0) {
                                                    SafeTrace.throwOnFailure(obj22);
                                                    RealShareTargetsManager$TargetPreparationState.Ready ready = new RealShareTargetsManager$TargetPreparationState.Ready(new ShareTarget.More(((AndroidStringManager) stuckPlayerDetector.clock).get(R.string.share_more), new ShareTarget.More.Content((String) obj)));
                                                    anonymousClass1.label = 1;
                                                    if (flowCollector.emit(ready, anonymousClass1) == coroutineSingletons2) {
                                                        break;
                                                    }
                                                } else if (i != 1) {
                                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                    break;
                                                } else {
                                                    SafeTrace.throwOnFailure(obj22);
                                                }
                                                break;
                                            }
                                        }
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                        Object obj222 = anonymousClass1.result;
                                        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                        }
                                    default:
                                        if (continuation instanceof RealShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1) {
                                            realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1 = (RealShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1) continuation;
                                            int i5 = realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1.label;
                                            if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                                                realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                                                Object obj32 = realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1.result;
                                                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i2 = realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1.label;
                                                if (i2 != 0) {
                                                    SafeTrace.throwOnFailure(obj32);
                                                    RealShareTargetsManager$TargetPreparationState.Ready ready2 = new RealShareTargetsManager$TargetPreparationState.Ready(new ShareTarget.XApp(((AndroidStringManager) stuckPlayerDetector.clock).get(R.string.share_x), new ShareTarget.XApp.Content((String) obj)));
                                                    realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1.label = 1;
                                                    if (flowCollector.emit(ready2, realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1) == coroutineSingletons32) {
                                                        break;
                                                    }
                                                } else if (i2 != 1) {
                                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                    break;
                                                } else {
                                                    SafeTrace.throwOnFailure(obj32);
                                                }
                                                break;
                                            }
                                        }
                                        realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1 = new RealShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1(this, continuation);
                                        Object obj322 = realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1.result;
                                        CoroutineSingletons coroutineSingletons322 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i2 = realShareTargetsManager$addTwitterTarget$$inlined$map$1$2$1.label;
                                        if (i2 != 0) {
                                        }
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public final Object collect(FlowCollector flowCollector3, Continuation continuation2) {
                            int i192 = i19;
                            StuckPlayerDetector stuckPlayerDetector2 = stuckPlayerDetector;
                            Flow flow4 = flow3;
                            switch (i192) {
                                case 0:
                                    Object collect = flow4.collect(new AnonymousClass2(flowCollector3, stuckPlayerDetector2, 0), continuation2);
                                    if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                                default:
                                    Object collect2 = flow4.collect(new AnonymousClass2(flowCollector3, stuckPlayerDetector2, 1), continuation2);
                                    if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1));
                    stuckPlayerDetector.stuckPlayingNotEndingDetector = linkedHashMap;
                    CardModelView$textures$$inlined$combine$1 cardModelView$textures$$inlined$combine$1 = new CardModelView$textures$$inlined$combine$1((Flow[]) CollectionsKt.toList(linkedHashMap.values()).toArray(new Flow[0]), 9);
                    ShareSheetPresenter$models$1$1$4 shareSheetPresenter$models$1$1$4 = ShareSheetPresenter$models$1$1$4.INSTANCE;
                    ShareSheetPresenter$models$1$1$5 shareSheetPresenter$models$1$1$5 = new ShareSheetPresenter$models$1$1$5(i19, (MutableState) obj3);
                    this.label = 1;
                    Object combineInternal = CombineKt.combineInternal(this, FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, new FlowKt__ZipKt$combine$1$1(shareSheetPresenter$models$1$1$4, (Continuation) null, i19), shareSheetPresenter$models$1$1$5, new Flow[]{flowExtensionsKt$combine$$inlined$combine$1, cardModelView$textures$$inlined$combine$1});
                    Object obj5 = combineInternal;
                    if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        obj5 = Unit.INSTANCE;
                    }
                    if (obj5 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CustomerSearchClientService customerSearchClientService = ((RealProductSearchRepository) this.this$0).service;
                    SearchQuery searchQuery = (SearchQuery) obj3;
                    ShopSearchProductFiltersRequest shopSearchProductFiltersRequest = new ShopSearchProductFiltersRequest(searchQuery.searchText, searchQuery.shopFlowToken, searchQuery.searchFlowToken, ByteString.EMPTY);
                    this.label = 1;
                    shopSearchProductFilters = customerSearchClientService.shopSearchProductFilters(shopSearchProductFiltersRequest, this);
                    break;
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    shopSearchProductFilters = obj;
                }
                ApiResult apiResult = (ApiResult) shopSearchProductFilters;
                if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                    List list = Collections.EMPTY_LIST;
                    list.getClass();
                    return new FiltersResults(list, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "Error: "));
                }
                if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                    List list2 = Collections.EMPTY_LIST;
                    list2.getClass();
                    return new FiltersResults(list2, Recorder$$ExternalSyntheticOutline2.m("Error: ", ((ApiResult.Failure.NetworkFailure) apiResult).error.getLocalizedMessage()));
                }
                if (apiResult instanceof ApiResult.Success) {
                    obj6 = new FiltersResults(((ShopSearchProductFiltersResponse) ((ApiResult.Success) apiResult).response).available_filters, null);
                    return obj6;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 8:
                RealRecentSearchManager realRecentSearchManager = (RealRecentSearchManager) obj3;
                GpsConfigQueries gpsConfigQueries = realRecentSearchManager.recentlyViewedQueries;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    UiAlias.Type.Companion companion = Metadata.EntityType.Companion;
                    gpsConfigQueries.getClass();
                    executeAsList = new OffersSheetQueries$ForSheetKeyQuery(gpsConfigQueries, new RealSheetState$$ExternalSyntheticLambda0(17)).executeAsList();
                    if (!executeAsList.isEmpty()) {
                        CashStorefrontsClientService cashStorefrontsClientService = realRecentSearchManager.service;
                        EmptyList emptyList = EmptyList.INSTANCE;
                        GetBusinessProfileRequest getBusinessProfileRequest = new GetBusinessProfileRequest(executeAsList, emptyList, emptyList, emptyList, emptyList, ByteString.EMPTY);
                        this.this$0 = executeAsList;
                        this.label = 1;
                        businessProfile = cashStorefrontsClientService.getBusinessProfile(getBusinessProfileRequest, this);
                        if (businessProfile == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    }
                    i10 = 0;
                    gpsConfigQueries.getClass();
                    ShoppingRecentlyViewedQueries$recentlyViewed$2 shoppingRecentlyViewedQueries$recentlyViewed$2 = ShoppingRecentlyViewedQueries$recentlyViewed$2.INSTANCE;
                    List executeAsList2 = new OffersHomeQueries$ForIdQuery(gpsConfigQueries, new RealSandboxer$$ExternalSyntheticLambda0(gpsConfigQueries, (char) 0)).executeAsList();
                    if (i10 != 0) {
                        return executeAsList2;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj7 : executeAsList2) {
                        if (((ShoppingRecentlyViewed) obj7).f1205type != Metadata.EntityType.AP_STORE) {
                            arrayList2.add(obj7);
                        }
                    }
                    return arrayList2;
                }
                if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list3 = (List) this.this$0;
                SafeTrace.throwOnFailure(obj);
                executeAsList = list3;
                businessProfile = obj;
                ApiResult apiResult2 = (ApiResult) businessProfile;
                if (!(apiResult2 instanceof ApiResult.Failure)) {
                    if (!(apiResult2 instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    GetBusinessProfileResponse getBusinessProfileResponse = (GetBusinessProfileResponse) ((ApiResult.Success) apiResult2).response;
                    getBusinessProfileResponse.getClass();
                    List<BusinessProfile> list4 = getBusinessProfileResponse.business_profiles;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    for (BusinessProfile businessProfile2 : list4) {
                        List list5 = businessProfile2.features;
                        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                            Iterator it = list5.iterator();
                            while (it.hasNext()) {
                                if (((Feature) it.next()) == Feature.CASH_APP_PAY_LATER) {
                                    z = true;
                                    arrayList3.add(new PayLaterBusinessProfile(businessProfile2.token, z));
                                }
                            }
                        }
                        z = false;
                        arrayList3.add(new PayLaterBusinessProfile(businessProfile2.token, z));
                    }
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((PayLaterBusinessProfile) it2.next()).token);
                    }
                    Set set = CollectionsKt.toSet(arrayList4);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj8 : executeAsList) {
                        if (!set.contains((String) obj8)) {
                            arrayList6.add(obj8);
                        }
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList6, arrayList5);
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        if (!((PayLaterBusinessProfile) next).isActive) {
                            arrayList7.add(next);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                    Iterator it4 = arrayList7.iterator();
                    while (it4.hasNext()) {
                        arrayList8.add(((PayLaterBusinessProfile) it4.next()).token);
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList8, arrayList5);
                    gpsConfigQueries.getClass();
                    String createArguments = TransacterImpl.createArguments(arrayList5.size());
                    SqlDriver sqlDriver = gpsConfigQueries.driver;
                    String trimMargin$default = StringsKt__IndentKt.trimMargin$default("\n        |DELETE FROM shoppingRecentlyViewed\n        |WHERE token IN " + createArguments + "\n        ");
                    arrayList5.size();
                    sqlDriver.execute(null, trimMargin$default, new TextStreamsKt$$ExternalSyntheticLambda0(8, arrayList5));
                    gpsConfigQueries.notifyQueries(-479521995, new RealSheetState$$ExternalSyntheticLambda0(18));
                    i10 = 0;
                }
                gpsConfigQueries.getClass();
                ShoppingRecentlyViewedQueries$recentlyViewed$2 shoppingRecentlyViewedQueries$recentlyViewed$22 = ShoppingRecentlyViewedQueries$recentlyViewed$2.INSTANCE;
                List executeAsList22 = new OffersHomeQueries$ForIdQuery(gpsConfigQueries, new RealSandboxer$$ExternalSyntheticLambda0(gpsConfigQueries, (char) 0)).executeAsList();
                if (i10 != 0) {
                }
                break;
            case 9:
                RealShippingAddressRepository realShippingAddressRepository = (RealShippingAddressRepository) this.this$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShippingAddressService shippingAddressService = realShippingAddressRepository.shippingAddressService;
                    UpdateDefaultShippingAddressRequest updateDefaultShippingAddressRequest = new UpdateDefaultShippingAddressRequest(null, PlatformKt.activeAccountToken(realShippingAddressRepository.sessionManager), (String) obj3, null, ByteString.EMPTY);
                    this.label = 1;
                    if (shippingAddressService.updateDefaultShippingAddress(updateDefaultShippingAddressRequest, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object awaitFilters = ((ProductSearchPresenter) this.this$0).repository.awaitFilters((SearchQuery) obj3, this);
                    return awaitFilters == coroutineSingletons9 ? coroutineSingletons9 : awaitFilters;
                }
                if (i23 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str4 = (String) obj3;
                    if (str4 != null) {
                        ShoppingWebPresenter shoppingWebPresenter = (ShoppingWebPresenter) this.this$0;
                        this.label = 1;
                        Object cancelCheckout = shoppingWebPresenter.checkoutService.cancelCheckout(new CancelCheckoutRequest(str4, ByteString.EMPTY), this);
                        if (cancelCheckout != coroutineSingletons10) {
                            cancelCheckout = Unit.INSTANCE;
                        }
                        if (cancelCheckout == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                MutableState mutableState = (MutableState) obj3;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShoppingSettingsAutofillPresenter shoppingSettingsAutofillPresenter = (ShoppingSettingsAutofillPresenter) this.this$0;
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 quickPayViewKt$QuickPay$1$1$1$2$1$3$1 = new QuickPayViewKt$QuickPay$1$1$1$2$1$3$1(i7, mutableState);
                    this.label = 1;
                    if (shoppingSettingsAutofillPresenter.handleAutofillCheckChange(booleanValue, quickPayViewKt$QuickPay$1$1$1$2$1$3$1, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BufferedChannel bufferedChannel = ((ShoppingWebBridge) ((ShoppingWebChromeClient) this.this$0).shoppingWebBridge).webEvents;
                    ShoppingWebBridgeEvent.TitleUpdated titleUpdated = new ShoppingWebBridgeEvent.TitleUpdated((String) obj3);
                    this.label = 1;
                    if (bufferedChannel.send(titleUpdated, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BufferedChannel bufferedChannel2 = ((ShoppingWebViewClient) this.this$0).shoppingWebBridge.webEvents;
                    ShoppingWebBridgeEvent.UrlUpdated urlUpdated = new ShoppingWebBridgeEvent.UrlUpdated((String) obj3);
                    this.label = 1;
                    if (bufferedChannel2.send(urlUpdated, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    EndChatRequest endChatRequest = new EndChatRequest();
                    this.label = 1;
                    if (((RealChatManager) this.this$0).service.endChat((String) obj3, endChatRequest, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                RealChatSurveyService realChatSurveyService = (RealChatSurveyService) obj3;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BufferedChannel bufferedChannel3 = realChatSurveyService.surveyResponses;
                    bufferedChannel3.getClass();
                    bufferedChannelIterator = bufferedChannel3.new BufferedChannelIterator();
                } else if (i29 == 1) {
                    BufferedChannel.BufferedChannelIterator bufferedChannelIterator2 = (BufferedChannel.BufferedChannelIterator) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    bufferedChannelIterator = bufferedChannelIterator2;
                    obj2 = obj;
                    if (!((Boolean) obj2).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    ChatSurveyResponse chatSurveyResponse = (ChatSurveyResponse) bufferedChannelIterator.next();
                    Scene.AnonymousClass1 anonymousClass1 = new Scene.AnonymousClass1((Object) realChatSurveyService, (Continuation) (z6 ? 1 : 0), i3);
                    RealMRIFactory$sign$2.AnonymousClass1 anonymousClass12 = new RealMRIFactory$sign$2.AnonymousClass1(realChatSurveyService, chatSurveyResponse, z5 ? 1 : 0, i2);
                    this.this$0 = bufferedChannelIterator;
                    this.label = 2;
                    break;
                } else {
                    if (i29 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    BufferedChannel.BufferedChannelIterator bufferedChannelIterator3 = (BufferedChannel.BufferedChannelIterator) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    bufferedChannelIterator = bufferedChannelIterator3;
                }
                this.this$0 = bufferedChannelIterator;
                this.label = 1;
                obj2 = bufferedChannelIterator.hasNext(this);
                break;
            case 17:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 != 0) {
                    if (i30 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                TransactionBodyResolver transactionBodyResolver = ((RealPendingMessagesStore) this.this$0).transactionBodyResolver;
                String str5 = ((MessageBody.TransactionBody.Selected) obj3).entityId;
                this.label = 1;
                Object transaction = ((RealTransactionBodyResolver) transactionBodyResolver).getTransaction(str5, this);
                return transaction == coroutineSingletons16 ? coroutineSingletons16 : transaction;
            case 18:
                ChatPresenter chatPresenter = (ChatPresenter) this.this$0;
                ChatViewEvent chatViewEvent = (ChatViewEvent) obj3;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityDataBridge activityDataBridge = chatPresenter.activityDataBridge;
                    SerializableActivityItem serializable = zzpe.serializable(((ChatViewEvent.ActivityTransactionClicked) chatViewEvent).activityItem);
                    this.label = 1;
                    cacheActivityItemAndCheckEnrichedReceipt = activityDataBridge.cacheActivityItemAndCheckEnrichedReceipt(serializable, this);
                    if (cacheActivityItemAndCheckEnrichedReceipt == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    cacheActivityItemAndCheckEnrichedReceipt = obj;
                }
                if (((Boolean) cacheActivityItemAndCheckEnrichedReceipt).booleanValue()) {
                    ChatViewEvent.ActivityTransactionClicked activityTransactionClicked = (ChatViewEvent.ActivityTransactionClicked) chatViewEvent;
                    if (activityTransactionClicked.activityItem.getPaymentHistoryData().url_to_open == null) {
                        chatPresenter.navigator.goTo(new HistoryScreens.PaymentReceipt(new ActivityItemKey(activityTransactionClicked.activityItem.getActivityItemGlobalId(), null, ActivityScope.SUPPORT_TRANSACTION), (String) (z7 ? 1 : 0), i6));
                    }
                }
                return Unit.INSTANCE;
            case 19:
                MutableState mutableState2 = (MutableState) obj3;
                PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) this.this$0;
                AndroidStringManager androidStringManager2 = (AndroidStringManager) pdfPreviewPresenter.stringManager;
                SupportChatScreens.FlowScreen.ChatSurveyScreen chatSurveyScreen = (SupportChatScreens.FlowScreen.ChatSurveyScreen) pdfPreviewPresenter.fileSaver;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealChatSurveyService realChatSurveyService2 = (RealChatSurveyService) pdfPreviewPresenter.args;
                    String str6 = chatSurveyScreen.surveyToken;
                    this.label = 1;
                    survey = realChatSurveyService2.getSurvey(str6, this);
                    if (survey == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    survey = obj;
                }
                ChatSurvey chatSurvey = (ChatSurvey) survey;
                GridLayout.Alignment.logAnswerStart((Analytics) pdfPreviewPresenter.launcher, chatSurveyScreen.surveyToken, chatSurvey);
                if (chatSurvey.equals(ChatSurvey.Completed.INSTANCE)) {
                    mutableState2.setValue(ChatSurveyViewModel.Complete.INSTANCE);
                } else if (chatSurvey instanceof ChatSurvey.Pending) {
                    ChatSurvey.Pending pending = (ChatSurvey.Pending) chatSurvey;
                    ChatSurvey.Pending.SatisfactionQuestion satisfactionQuestion = pending.satisfactionQuestion;
                    if (satisfactionQuestion == null || (str = satisfactionQuestion.title) == null) {
                        str = androidStringManager2.get(R.string.support_standardized_chat_survey_satisfaction_title);
                    }
                    String str7 = pending.resolutionQuestion.title;
                    if (str7 == null) {
                        str7 = androidStringManager2.get(R.string.support_standardized_chat_survey_resolution_title);
                    }
                    mutableState2.setValue(new ChatSurveyViewModel.Loaded(str, str7, null, ((Boolean) ((Lazy) pdfPreviewPresenter.pdfFile$delegate).getValue()).booleanValue()));
                } else {
                    if (!chatSurvey.equals(ChatSurvey.Unavailable.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    pdfPreviewPresenter.navigator.goTo(new SupportChatScreens.SupportChatDialogs.ChatSurveyUnavailable(chatSurveyScreen.surveyToken));
                }
                return Unit.INSTANCE;
            case 20:
                ArticlePresenter articlePresenter = (ArticlePresenter) this.this$0;
                ArticleViewEvent articleViewEvent = (ArticleViewEvent) obj3;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityDataBridge activityDataBridge2 = articlePresenter.activityDataBridge;
                    SerializableActivityItem serializable2 = zzpe.serializable(((ArticleViewEvent.ActivityTransactionClicked) articleViewEvent).activityItem);
                    this.label = 1;
                    cacheActivityItemAndCheckEnrichedReceipt2 = activityDataBridge2.cacheActivityItemAndCheckEnrichedReceipt(serializable2, this);
                    if (cacheActivityItemAndCheckEnrichedReceipt2 == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    cacheActivityItemAndCheckEnrichedReceipt2 = obj;
                }
                if (((Boolean) cacheActivityItemAndCheckEnrichedReceipt2).booleanValue()) {
                    ArticleViewEvent.ActivityTransactionClicked activityTransactionClicked2 = (ArticleViewEvent.ActivityTransactionClicked) articleViewEvent;
                    if (activityTransactionClicked2.activityItem.getPaymentHistoryData().url_to_open == null) {
                        articlePresenter.navigator.goTo(new HistoryScreens.PaymentReceipt(new ActivityItemKey(activityTransactionClicked2.activityItem.getActivityItemGlobalId(), null, ActivityScope.SUPPORT_TRANSACTION), (String) (z8 ? 1 : 0), i6));
                    }
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list6 = ArticlePresenter.ONGOING_INCIDENT_TYPES;
                    if (((SupportPhoneStatus) ((State) obj3).getValue()) instanceof SupportPhoneStatus.Undetermined) {
                        RealSupportPhoneService realSupportPhoneService = ((ArticlePresenter) this.this$0).supportPhoneService;
                        this.label = 1;
                        if (realSupportPhoneService.requestPhoneStatusUpdate(this) == coroutineSingletons20) {
                            return coroutineSingletons20;
                        }
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.this$0;
                SupportScreens.FlowScreens.SupportActivityPickerFullScreen supportActivityPickerFullScreen = (SupportScreens.FlowScreens.SupportActivityPickerFullScreen) localHomePresenter.localHomeGeoPresenterFactory;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new OverlayKt$$ExternalSyntheticLambda1(i5, (MutableState) obj3));
                    this.label = 1;
                    access$awaitInitialLoadedActivities = LocalHomePresenter.access$awaitInitialLoadedActivities(localHomePresenter, snapshotFlow, this);
                    if (access$awaitInitialLoadedActivities == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$awaitInitialLoadedActivities = obj;
                }
                List list7 = (List) access$awaitInitialLoadedActivities;
                Analytics analytics = (Analytics) localHomePresenter.featureFlagManager;
                String str8 = supportActivityPickerFullScreen.data.flowToken;
                List list8 = list7;
                CustomerSupportFullTransactionPickerView.Status status2 = (list8 == null || list8.isEmpty()) ? CustomerSupportFullTransactionPickerView.Status.FAILURE : CustomerSupportFullTransactionPickerView.Status.SUCCESS;
                JsonAdapter jsonAdapter = (JsonAdapter) localHomePresenter.tabContentPresenterFactory;
                if (list7 != null) {
                    List list9 = list7;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list9, 10));
                    Iterator it5 = list9.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(((ActivityItemViewModel) ((ActivityFeedEntry.Item) it5.next()).activityItem.model).rowId);
                    }
                } else {
                    arrayList = null;
                }
                analytics.track(new CustomerSupportFullTransactionPickerView(status2, jsonAdapter.toJson(arrayList), str8, supportActivityPickerFullScreen.origin), null);
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SupportHomePresenter supportHomePresenter = (SupportHomePresenter) this.this$0;
                    RealSupportLinkNavigator realSupportLinkNavigator = supportHomePresenter.linkNavigator;
                    BetterNavigator.ScreenNavigator screenNavigator = supportHomePresenter.navigator;
                    SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen = supportHomePresenter.args;
                    Link.Target target = ((SupportHomeViewEvent.SuggestedActionClicked) ((SupportHomeViewEvent) obj3)).link.target;
                    BlockersData.AnalyticsData.Source source = BlockersData.AnalyticsData.Source.SUPPORT_HOME;
                    this.label = 1;
                    navigateWith = realSupportLinkNavigator.navigateWith(screenNavigator, supportHomeScreen, target, null, source);
                    if (navigateWith == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                InstrumentDetailsPresenter instrumentDetailsPresenter = (InstrumentDetailsPresenter) this.this$0;
                RealIncidentsService realIncidentsService = (RealIncidentsService) instrumentDetailsPresenter.args;
                SupportScreens.FlowScreens.SupportIncidentDetailsScreen supportIncidentDetailsScreen = (SupportScreens.FlowScreens.SupportIncidentDetailsScreen) instrumentDetailsPresenter.scope;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (supportIncidentDetailsScreen.useCachedIncident) {
                        StateFlowImpl stateFlowImpl = realIncidentsService.store;
                        this.label = 1;
                        first = FlowKt.first(stateFlowImpl, this);
                        break;
                    } else {
                        String str9 = supportIncidentDetailsScreen.incidentId;
                        this.label = 3;
                        incident = realIncidentsService.getIncident(str9, this);
                        break;
                    }
                    return coroutineSingletons23;
                }
                if (i37 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    first = obj;
                    Iterator it6 = ((Iterable) first).iterator();
                    Object obj9 = null;
                    boolean z13 = false;
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        } else {
                            Object next2 = it6.next();
                            if (Intrinsics.areEqual(((Incident) next2).id, supportIncidentDetailsScreen.incidentId)) {
                                if (z13) {
                                    break;
                                } else {
                                    z13 = true;
                                    obj9 = next2;
                                }
                            }
                            z13 = z13;
                        }
                    }
                    incident2 = (Incident) obj9;
                    if (incident2 == null) {
                        String str10 = supportIncidentDetailsScreen.incidentId;
                        this.label = 2;
                        incident3 = realIncidentsService.getIncident(str10, this);
                        break;
                    }
                } else if (i37 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    incident3 = obj;
                    incident2 = (Incident) incident3;
                } else {
                    if (i37 != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    incident = obj;
                    incident2 = (Incident) incident;
                }
                if (incident2 != null) {
                    Analytics analytics2 = instrumentDetailsPresenter.analytics;
                    String str11 = supportIncidentDetailsScreen.data.flowToken;
                    String str12 = incident2.id;
                    int ordinal = incident2.status.ordinal();
                    if (ordinal == 0) {
                        status = CustomerSupportAccessOpenIncidentAlert.Status.IDENTIFIED;
                    } else if (ordinal == 1) {
                        status = CustomerSupportAccessOpenIncidentAlert.Status.INVESTIGATING;
                    } else if (ordinal == 2) {
                        status = CustomerSupportAccessOpenIncidentAlert.Status.RESOLVED;
                    } else {
                        if (ordinal != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        status = CustomerSupportAccessOpenIncidentAlert.Status.UNKNOWN;
                    }
                    int ordinal2 = supportIncidentDetailsScreen.source.ordinal();
                    if (ordinal2 == 0) {
                        trigger = CustomerSupportAccessOpenIncidentAlert.Trigger.HOME;
                    } else if (ordinal2 == 1) {
                        trigger = CustomerSupportAccessOpenIncidentAlert.Trigger.NODE;
                    } else if (ordinal2 == 2) {
                        trigger = CustomerSupportAccessOpenIncidentAlert.Trigger.NOTIFICATION;
                    } else {
                        if (ordinal2 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        trigger = null;
                    }
                    analytics2.track(new CustomerSupportAccessOpenIncidentAlert(str11, str12, status, trigger), null);
                }
                MutableState mutableState3 = (MutableState) obj3;
                mutableState3.setValue(SupportIncidentDetailsPresenter$State.copy$default((SupportIncidentDetailsPresenter$State) mutableState3.getValue(), incident2, false, 4));
                return Unit.INSTANCE;
            case 25:
                SupportPhoneStatusPresenter supportPhoneStatusPresenter = (SupportPhoneStatusPresenter) this.this$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    supportPhoneStatusPresenter.analytics.track(new CustomerSupportPhoneCancel(supportPhoneStatusPresenter.args.flowToken), null);
                    this.label = 1;
                    if (SupportPhoneStatusPresenter.access$cancelPhoneRequest(supportPhoneStatusPresenter, (MutableState) obj3, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i38 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                SupportSearchPresenter supportSearchPresenter = (SupportSearchPresenter) obj3;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop2 = FlowKt.drop(new RealRecipientRepository$suggestions$$inlined$map$1((Flow) this.this$0, 25), 1);
                    this.label = 1;
                    if (FlowKt.first(drop2, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i39 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                supportSearchPresenter.analytics.track(new CustomerSupportSearchEnterText(supportSearchPresenter.args.data.flowToken), null);
                return Unit.INSTANCE;
            case 27:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.label;
                if (i40 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.this$0;
                    String str13 = ((SupportSearchViewEvent.SearchTextChanged) ((SupportSearchViewEvent) obj3)).text;
                    this.label = 1;
                    if (mutableSharedFlow.emit(str13, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i40 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                return invokeSuspend$com$squareup$cash$support$presenters$UnauthenticatedArticlePresenter$models$1$1(obj);
            default:
                RealTabProvider realTabProvider = (RealTabProvider) obj3;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i41 = this.label;
                if (i41 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged3 = FlowKt.distinctUntilChanged(RealBitcoinCapabilityProvider.isBTCxFlow());
                    StateFlow sessionState = realTabProvider.sessionManager.getSessionState();
                    RealLocalTabProvider realLocalTabProvider = realTabProvider.localTabProvider;
                    FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealTabProvider$setup$1$5(i8, z10 ? 1 : 0, i9), new NullStateSwipeConfigProvider(FlowKt.combine(distinctUntilChanged3, sessionState, FlowKt.distinctUntilChanged(FlowKt.transformLatest(((RealFeatureFlagManager) realLocalTabProvider.featureFlagManager).peekValues(AmplitudeExperiments$MobileLocalTabVisibility.INSTANCE), new RealPasscodeProvider$getPasscode$1(continuation, realLocalTabProvider, i7))), realTabProvider.familyProfileManager.familyProfile, new RealTabProvider$setup$1$1(realTabProvider, z11 ? 1 : 0, i9)), i5));
                    WorkflowNode$tick$1$1 workflowNode$tick$1$1 = new WorkflowNode$tick$1$1((Object) realTabProvider, (Continuation) (z9 ? 1 : 0), i4);
                    PaymentPasscodeActivity$loadView$3$1 paymentPasscodeActivity$loadView$3$1 = new PaymentPasscodeActivity$loadView$3$1(realTabProvider.tabPublisher, i6);
                    this.this$0 = null;
                    this.label = 1;
                    Object collect = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2(paymentPasscodeActivity$loadView$3$1, workflowNode$tick$1$1, i10), this);
                    if (collect != coroutineSingletons27) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i41 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShoppingWebBridge$loadUrl$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$url = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShoppingWebBridge$loadUrl$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$url = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingWebBridge$loadUrl$1(Continuation continuation, RealTabProvider realTabProvider) {
        super(2, continuation);
        this.$r8$classId = 29;
        this.$url = realTabProvider;
    }
}
