package com.squareup.cash.pools.presenters;

import androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.res.ImageResources_androidKt;
import androidx.glance.appwidget.IgnoreResultKt;
import androidx.glance.layout.ColumnKt;
import androidx.media3.extractor.text.ttml.TtmlRenderUtil;
import androidx.paging.PageFetcher$flow$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahh;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.ContactStatus;
import com.squareup.cash.cdf.asset.AssetPoolPoolListToggleTap;
import com.squareup.cash.cdf.asset.ExperienceType;
import com.squareup.cash.cdf.browser.BrowserCheckoutComplete;
import com.squareup.cash.cdf.browser.BrowserCheckoutReceiveError;
import com.squareup.cash.cdf.browser.CheckoutDetectionMethod;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.cdf.customersupport.Channel;
import com.squareup.cash.cdf.customersupport.CustomerSupportContactStart;
import com.squareup.cash.cdf.customersupport.CustomerSupportPhoneViewStatus;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentDiscoverFoundPeople;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.data.contacts.ContactsStatus;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.profile.CustomerProfile;
import com.squareup.cash.db2.profile.CustomerProfileQueries$customerProfile$2;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$StablecoinDebitCardSource;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentRowLoader;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.nearby.backend.NearbyAdvertisement;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paychecks.presenters.EditDistributionPresenter$models$2$3$1;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewEvent;
import com.squareup.cash.paychecks.viewmodels.IsSubmissionInteraction;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import com.squareup.cash.payments.presenters.NearbyPayRequestPresenter$models$10$1$1$1;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.payments.screens.NearbyAvatarInfo;
import com.squareup.cash.payments.viewmodels.NearbyPerson;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewEvent;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.RecipientSelectedStep;
import com.squareup.cash.payments.views.personalization.TransformableKt$transformable$3$block$1$1$1$1;
import com.squareup.cash.payments.views.personalization.TransformationState$TransformationOccurred;
import com.squareup.cash.payments.views.personalization.TransformationState$TransformationStopped;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$map$2$2;
import com.squareup.cash.pools.backend.api.CreatePoolFailureReason;
import com.squareup.cash.pools.backend.api.CreatePoolResult;
import com.squareup.cash.pools.backend.api.LoadPoolStatus;
import com.squareup.cash.pools.backend.api.PoolAppletPreview;
import com.squareup.cash.pools.backend.api.PoolData;
import com.squareup.cash.pools.backend.api.PoolsAppletData;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.pools.backend.real.RealPoolsRepository$createPool$2$WhenMappings;
import com.squareup.cash.pools.screens.PoolDetailsScreen;
import com.squareup.cash.pools.viewmodels.PoolCategory;
import com.squareup.cash.pools.viewmodels.PoolsListViewEvent;
import com.squareup.cash.pools.viewmodels.PoolsListViewModel;
import com.squareup.cash.profile.devicemanager.backend.LoggedInDevice;
import com.squareup.cash.profile.devicemanager.presenters.DataLoadingState;
import com.squareup.cash.profile.devicemanager.presenters.DeviceManagerDeviceDetailsPresenter$DeleteState;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.profile.repo.api.CustomerProfileData;
import com.squareup.cash.profile.repo.api.CustomerProfileDetails;
import com.squareup.cash.profile.repo.real.RealProfileRepo;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.qrcodes.presenters.QrCodeProfilePresenter;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.recipients.analytics.PaymentType;
import com.squareup.cash.recipients.analytics.RecipientAnalyticsKt;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.shopping.backend.api.SearchResults;
import com.squareup.cash.shopping.backend.real.RealProductSearchRepository;
import com.squareup.cash.shopping.presenters.ProductSearchPresenter;
import com.squareup.cash.shopping.presenters.RealShoppingJavascriptPresenter;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.settings.presenters.ShoppingSettingsAutofillPresenter;
import com.squareup.cash.shopping.viewmodels.InjectJavascriptViewModel$Empty;
import com.squareup.cash.shopping.viewmodels.InjectJavascriptViewModel$InjectJsViewModel;
import com.squareup.cash.shopping.viewmodels.ProductSearchViewModel;
import com.squareup.cash.shopping.viewmodels.RestrictedProduct;
import com.squareup.cash.shopping.viewmodels.ShoppingJavascriptViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingWebViewEvent;
import com.squareup.cash.support.backend.api.SupportPhoneStatus;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.backend.api.articles.ArticlesService$ArticleResult;
import com.squareup.cash.support.presenters.ArticlePresenter;
import com.squareup.cash.support.presenters.PhoneVerificationPresenter;
import com.squareup.cash.support.presenters.RealContactSupportNavigator;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.ArticleViewEvent;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsRequest;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import com.squareup.protos.cash.nearby.api.v1.BroadcasterProfileData;
import com.squareup.protos.cash.nearby.api.v1.GetNearbySessionRequest;
import com.squareup.protos.cash.nearby.api.v1.GetNearbySessionResponse;
import com.squareup.protos.cash.nearby.api.v1.NearbyContext;
import com.squareup.protos.cash.nearby.api.v1.NearbySession;
import com.squareup.protos.cash.paychecks.api.blockers.v1.SetPaycheckAllocationAmountInputs;
import com.squareup.protos.cash.pools.CreatePoolRequest;
import com.squareup.protos.cash.pools.CreatePoolResponse;
import com.squareup.protos.cash.pools.MoneyPool;
import com.squareup.protos.cash.pools.PoolsService;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import com.squareup.wire.GrpcStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;
import papa.SafeTrace;
import squareup.cash.paychecks.AllocationDistribution;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class PoolsListPresenter$models$2$2 extends SuspendLambda implements Function2 {
    public Object $category$delegate;
    public Object $event;
    public final /* synthetic */ int $r8$classId;
    public Object $state$delegate;
    public Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolsListPresenter$models$2$2(ArticleViewEvent articleViewEvent, ArticlePresenter articlePresenter, MutableState mutableState, State state, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 27;
        this.$state$delegate = articleViewEvent;
        this.$event = articlePresenter;
        this.L$0 = mutableState;
        this.this$0 = state;
        this.$category$delegate = mutableState2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r4 == r3) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$shopping$presenters$ProductSearchPresenter$models$3$1(Object obj) {
        Object withContext;
        Object viewModel;
        SearchResults searchResults;
        ProductSearchPresenter.State state;
        ProductSearchPresenter productSearchPresenter = (ProductSearchPresenter) this.this$0;
        MutableState mutableState = (MutableState) this.$category$delegate;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ProductSearchPresenter.State state2 = (ProductSearchPresenter.State) mutableState.getValue();
            if (state2.isRestoringState && state2.hasSavedResults) {
                RealProductSearchRepository realProductSearchRepository = productSearchPresenter.repository;
                this.label = 1;
                withContext = JobKt.withContext(realProductSearchRepository.ioDispatcher, new RealQrCodesPresenter$models$1$1(realProductSearchRepository, continuation, 23), this);
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mutableState = (MutableState) this.L$0;
            state = (ProductSearchPresenter.State) this.$event;
            SearchResults searchResults2 = (SearchResults) this.$state$delegate;
            SafeTrace.throwOnFailure(obj);
            searchResults = searchResults2;
            viewModel = obj;
            mutableState.setValue(ProductSearchPresenter.State.copy$default(state, (ProductSearchViewModel.Loaded) viewModel, null, false, false, false, false, 0, null, searchResults, 998));
            return Unit.INSTANCE;
        }
        SafeTrace.throwOnFailure(obj);
        withContext = obj;
        SearchResults searchResults3 = (SearchResults) withContext;
        ProductSearchPresenter.State state3 = (ProductSearchPresenter.State) mutableState.getValue();
        ProductSearchPresenter.State state4 = (ProductSearchPresenter.State) mutableState.getValue();
        this.$state$delegate = searchResults3;
        this.$event = state3;
        this.L$0 = mutableState;
        this.label = 2;
        viewModel = productSearchPresenter.toViewModel(state4, searchResults3, false, this);
        if (viewModel != coroutineSingletons) {
            searchResults = searchResults3;
            state = state3;
            mutableState.setValue(ProductSearchPresenter.State.copy$default(state, (ProductSearchViewModel.Loaded) viewModel, null, false, false, false, false, 0, null, searchResults, 998));
            return Unit.INSTANCE;
        }
        return coroutineSingletons;
    }

    private final Object invokeSuspend$com$squareup$cash$shopping$presenters$RealShoppingJavascriptPresenter$model$$inlined$CollectEffect$5(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$state$delegate;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.$event;
            ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$2 = new ChannelFlowMerge$collectTo$2(coroutineScope, (RealShoppingJavascriptPresenter) this.this$0, (MutableState) this.L$0, (MutableState) this.$category$delegate, 4);
            this.$state$delegate = null;
            this.label = 1;
            if (flow.collect(channelFlowMerge$collectTo$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e7 A[Catch: JSONException -> 0x002d, TryCatch #0 {JSONException -> 0x002d, blocks: (B:6:0x0025, B:8:0x00d9, B:10:0x00de, B:12:0x00e7, B:14:0x0115, B:16:0x011b, B:17:0x011e, B:18:0x0124, B:23:0x0122, B:28:0x0039, B:30:0x004b, B:33:0x0056, B:36:0x0060, B:37:0x008f, B:40:0x0099, B:41:0x00a2, B:44:0x00ac, B:46:0x00bd, B:48:0x00ce, B:51:0x0135, B:52:0x013f, B:55:0x0148), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0122 A[Catch: JSONException -> 0x002d, TryCatch #0 {JSONException -> 0x002d, blocks: (B:6:0x0025, B:8:0x00d9, B:10:0x00de, B:12:0x00e7, B:14:0x0115, B:16:0x011b, B:17:0x011e, B:18:0x0124, B:23:0x0122, B:28:0x0039, B:30:0x004b, B:33:0x0056, B:36:0x0060, B:37:0x008f, B:40:0x0099, B:41:0x00a2, B:44:0x00ac, B:46:0x00bd, B:48:0x00ce, B:51:0x0135, B:52:0x013f, B:55:0x0148), top: B:2:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$shopping$presenters$RealShoppingJavascriptPresenter$model$7$1(Object obj) {
        String string2;
        String str;
        Object access$getCheckoutToken;
        IgnoreResultKt ignoreResultKt;
        MutableState mutableState = (MutableState) this.$category$delegate;
        MutableState mutableState2 = (MutableState) this.L$0;
        ShoppingWebViewEvent.AfterpayWebCheckoutFlowJsonEvents afterpayWebCheckoutFlowJsonEvents = (ShoppingWebViewEvent.AfterpayWebCheckoutFlowJsonEvents) this.$event;
        RealShoppingJavascriptPresenter realShoppingJavascriptPresenter = (RealShoppingJavascriptPresenter) this.this$0;
        RealBugReportSenderFactory realBugReportSenderFactory = realShoppingJavascriptPresenter.shoppingWebAnalytics;
        Analytics analytics = realShoppingJavascriptPresenter.analytics;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (JSONException e) {
            Timber.Forest.e("Error parsing origin token from AfterPay web message", new Object[0], e);
        }
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            String str2 = afterpayWebCheckoutFlowJsonEvents.jsonString;
            String str3 = afterpayWebCheckoutFlowJsonEvents.jsonString;
            String string3 = new JSONObject(str2).getString("type");
            if (string3 != null) {
                switch (string3.hashCode()) {
                    case -1057958717:
                        if (!string3.equals("onCheckoutError")) {
                            break;
                        } else {
                            String string4 = new JSONObject(str3).getString("payload");
                            String string5 = new JSONObject(string4).getString(BreadcrumbHelper.Category.ERROR);
                            String string6 = new JSONObject(string4).getString("errorCode");
                            string5.getClass();
                            string6.getClass();
                            analytics.track(new BrowserCheckoutReceiveError(null, (InfoContext) realBugReportSenderFactory.featureEligibilityDumper, (BrowserOrigin) realBugReportSenderFactory.sessionManager, (String) realBugReportSenderFactory.tempStorage, (String) realBugReportSenderFactory.cashDatabase, (String) realBugReportSenderFactory.recentMoneybotSession, (String) realBugReportSenderFactory.preferences, (String) realBugReportSenderFactory.backStackDumper, string5, string6, 1), null);
                            break;
                        }
                    case -281060656:
                        if (!string3.equals("CHECKOUT_TOKEN_REQUEST")) {
                            break;
                        } else {
                            string2 = new JSONObject(str3).getString("payload");
                            if (!RealShoppingJavascriptPresenter.validAfterpayURLs.contains(string2)) {
                                Timber.Forest.w("Received an invalid json request from AfterPay", new Object[0]);
                                break;
                            } else {
                                Timber.Forest.d("AfterPay requested checkout token", new Object[0]);
                                str = (String) mutableState2.getValue();
                                if (str == null) {
                                    this.$state$delegate = string2;
                                    this.label = 1;
                                    access$getCheckoutToken = RealShoppingJavascriptPresenter.access$getCheckoutToken(realShoppingJavascriptPresenter, this);
                                    if (access$getCheckoutToken == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                                if (str == null) {
                                    List list = RealShoppingJavascriptPresenter.validAfterpayURLs;
                                    string2.getClass();
                                    String str4 = "\n        (function () {\n          const iframeContainer = document.getElementById(\n            \"afterpay__iframe-checkout-container\"\n          );\n          if (iframeContainer) {\n            const iframe = iframeContainer.getElementsByTagName(\"iframe\");\n            if (iframe.length > 0) {\n              iframe[0].contentWindow.postMessage(\n                '{\"type\":\"CASH_CHECKOUT_TOKEN\",\"payload\":\"" + str + "\"}',\n                \"" + string2 + "\"\n              );\n            }\n          }\n        })();\n        ";
                                    IgnoreResultKt ignoreResultKt2 = ((ShoppingJavascriptViewModel) mutableState.getValue()).injectJavascriptViewModel;
                                    InjectJavascriptViewModel$InjectJsViewModel injectJavascriptViewModel$InjectJsViewModel = ignoreResultKt2 instanceof InjectJavascriptViewModel$InjectJsViewModel ? (InjectJavascriptViewModel$InjectJsViewModel) ignoreResultKt2 : null;
                                    ignoreResultKt = new InjectJavascriptViewModel$InjectJsViewModel(str4, injectJavascriptViewModel$InjectJsViewModel != null ? 1 + injectJavascriptViewModel$InjectJsViewModel.version : 1);
                                } else {
                                    ignoreResultKt = InjectJavascriptViewModel$Empty.INSTANCE;
                                }
                                List list2 = RealShoppingJavascriptPresenter.validAfterpayURLs;
                                mutableState.setValue(ShoppingJavascriptViewModel.copy$default((ShoppingJavascriptViewModel) mutableState.getValue(), ignoreResultKt, null, 2));
                                break;
                            }
                        }
                    case 1760134314:
                        if (!string3.equals("onCheckoutLoaded")) {
                            break;
                        } else {
                            analytics.track(realBugReportSenderFactory.trackBrowserCheckoutLoad(), null);
                            break;
                        }
                    case 2078462728:
                        if (!string3.equals("onOrderComplete")) {
                            break;
                        } else {
                            BrowserOrigin browserOrigin = (BrowserOrigin) realBugReportSenderFactory.sessionManager;
                            String str5 = (String) realBugReportSenderFactory.tempStorage;
                            String str6 = (String) realBugReportSenderFactory.cashDatabase;
                            String str7 = (String) realBugReportSenderFactory.recentMoneybotSession;
                            String str8 = (String) realBugReportSenderFactory.preferences;
                            InfoContext infoContext = (InfoContext) realBugReportSenderFactory.featureEligibilityDumper;
                            CheckoutDetectionMethod checkoutDetectionMethod = CheckoutDetectionMethod.AfterPaySDK;
                            analytics.track(new BrowserCheckoutComplete(infoContext, browserOrigin, str5, str6, str7, str8, str8), null);
                            break;
                        }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str9 = (String) this.$state$delegate;
        SafeTrace.throwOnFailure(obj);
        string2 = str9;
        access$getCheckoutToken = obj;
        str = (String) access$getCheckoutToken;
        if (str != null) {
            List list3 = RealShoppingJavascriptPresenter.validAfterpayURLs;
            mutableState2.setValue(str);
        } else {
            str = null;
        }
        if (str == null) {
        }
        List list22 = RealShoppingJavascriptPresenter.validAfterpayURLs;
        mutableState.setValue(ShoppingJavascriptViewModel.copy$default((ShoppingJavascriptViewModel) mutableState.getValue(), ignoreResultKt, null, 2));
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$shopping$presenters$RealShoppingJavascriptPresenter$model$8$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$category$delegate;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.$state$delegate;
            ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$2 = new ChannelFlowMerge$collectTo$2((RestrictedProduct) this.$event, (RealShoppingJavascriptPresenter) this.this$0, coroutineScope, (MutableState) this.L$0, 5);
            this.$category$delegate = null;
            this.label = 1;
            if (flow.collect(channelFlowMerge$collectTo$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$shopping$presenters$ShoppingWebPresenter$models$composeSUPScreen$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$state$delegate;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.$event;
            BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass1 = new BufferCountKt$bufferSkip$1.AnonymousClass1(coroutineScope, (ShoppingWebPresenter) this.this$0, (MutableState) this.L$0, (MutableState) this.$category$delegate, 6);
            this.$state$delegate = null;
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$shopping$settings$presenters$ShoppingSettingsAutofillPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$category$delegate;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.$state$delegate;
            ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$2 = new ChannelFlowMerge$collectTo$2(coroutineScope, (ShoppingSettingsAutofillPresenter) this.$event, (MutableState) this.L$0, (State) this.this$0, 6);
            this.$category$delegate = null;
            this.label = 1;
            if (flow.collect(channelFlowMerge$collectTo$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$support$chat$presenters$ChatExitPromptSheetPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$state$delegate;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.$event;
            ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$2 = new ChannelFlowMerge$collectTo$2(coroutineScope, (PoolsListPresenter) this.this$0, (MutableState) this.L$0, (MutableState) this.$category$delegate, 7);
            this.$state$delegate = null;
            this.label = 1;
            if (flow.collect(channelFlowMerge$collectTo$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$support$presenters$ArticlePresenter$models$12$5(Object obj) {
        Channel channel;
        ArticleViewEvent articleViewEvent = (ArticleViewEvent) this.$state$delegate;
        ArticlePresenter articlePresenter = (ArticlePresenter) this.$event;
        BetterNavigator.ScreenNavigator screenNavigator = articlePresenter.navigator;
        Analytics analytics = articlePresenter.analytics;
        SupportScreens.FlowScreens.ArticleScreen articleScreen = articlePresenter.args;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            MutableState mutableState = (MutableState) this.L$0;
            List list = ArticlePresenter.ONGOING_INCIDENT_TYPES;
            ArticlesService$ArticleResult articlesService$ArticleResult = (ArticlesService$ArticleResult) mutableState.getValue();
            ArticlesService$ArticleResult.Success success = articlesService$ArticleResult instanceof ArticlesService$ArticleResult.Success ? (ArticlesService$ArticleResult.Success) articlesService$ArticleResult : null;
            Article article = success != null ? success.article : null;
            if (article == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Cannot select contact option without valid article.");
                return null;
            }
            ArticleViewEvent.Contact contact = (ArticleViewEvent.Contact) articleViewEvent;
            int ordinal = contact.option.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    SupportPhoneStatus supportPhoneStatus = (SupportPhoneStatus) ((MutableState) this.$category$delegate).getValue();
                    Channel channel2 = Channel.CALLBACK;
                    SupportScreens.FlowScreens.Data data = articleScreen.data;
                    analytics.track(new CustomerSupportContactStart(channel2, data.flowToken, CustomerSupportContactStart.Trigger.NODE, data.paymentToken, articlePresenter.articleToken, null, ColumnKt.getChannelAvailability(supportPhoneStatus), ColumnKt.getChannelStatus(supportPhoneStatus), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE), null);
                    int ordinal2 = ColumnKt.getNextScreenOnSelected(supportPhoneStatus).ordinal();
                    if (ordinal2 == 0) {
                        RealRouter realRouter = articlePresenter.router;
                        ClientRoute.Flow phoneSupportRoute = TtmlRenderUtil.getPhoneSupportRoute(data.paymentToken, articlePresenter.articleToken);
                        RoutingParams routingParams = new RoutingParams(articlePresenter.args, BlockersData.AnalyticsData.Source.SUPPORT_ARTICLE.getAnalyticsName(), null, null, null, null, 508);
                        realRouter.getClass();
                        realRouter.clientRouteRouter.route(phoneSupportRoute, routingParams);
                    } else {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("Feature not enabled");
                            return null;
                        }
                        screenNavigator.goTo(new SupportScreens.SupportPhoneStatusScreen(true, data.flowToken, CustomerSupportPhoneViewStatus.Trigger.NODE_CONTACT_BUTTON));
                    }
                } else if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
            Article.ContactOption contactOption = contact.option;
            Boolean bool = (Boolean) ((State) this.this$0).getValue();
            bool.getClass();
            int ordinal3 = contactOption.ordinal();
            if (ordinal3 == 0) {
                channel = Channel.CHAT;
            } else if (ordinal3 == 1) {
                channel = Channel.CALLBACK;
            } else {
                if (ordinal3 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                channel = Channel.EMAIL;
            }
            Channel channel3 = channel;
            SupportScreens.FlowScreens.Data data2 = articleScreen.data;
            analytics.track(new CustomerSupportContactStart(channel3, data2.flowToken, CustomerSupportContactStart.Trigger.NODE, data2.paymentToken, articlePresenter.articleToken, null, null, null, contactOption == Article.ContactOption.CHAT ? bool : null, 224), null);
            RealContactSupportNavigator realContactSupportNavigator = articlePresenter.contactSupportNavigator;
            Article.ContactOption contactOption2 = contact.option;
            boolean z = article.selectPaymentForCaseCreation;
            String str = article.token;
            String str2 = articleScreen.data.flowToken;
            Boolean valueOf = Boolean.valueOf(article.includeIssueDescription);
            String str3 = articleScreen.data.paymentToken;
            this.label = 1;
            if (realContactSupportNavigator.goToScreenForOption(screenNavigator, contactOption2, z, str, str2, valueOf, str3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$support$presenters$ContactSupportEmailInputPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$state$delegate;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.$event;
            ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$2 = new ChannelFlowMerge$collectTo$2(coroutineScope, (WorkHomePresenter) this.this$0, (MutableState) this.L$0, (MutableState) this.$category$delegate, 8);
            this.$state$delegate = null;
            this.label = 1;
            if (flow.collect(channelFlowMerge$collectTo$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new PoolsListPresenter$models$2$2((PoolsListViewEvent) this.$event, (PoolsListPresenter) obj2, (MutableState) this.$category$delegate, (MutableState) this.$state$delegate, continuation);
            case 1:
                return new PoolsListPresenter$models$2$2((LocalCashBalancePresenter) this.$category$delegate, (EditDistributionConfiguration.DestinationUiConfiguration) this.$state$delegate, (EditDistributionViewEvent) this.$event, (MutableState) this.L$0, (MutableFloatState) obj2, continuation);
            case 2:
                return new PoolsListPresenter$models$2$2((CardLockPresenter) this.L$0, (NearbyAdvertisement) this.$category$delegate, (SnapshotStateMap) this.$state$delegate, (SnapshotStateSet) this.$event, (SnapshotStateSet) obj2, continuation);
            case 3:
                return new PoolsListPresenter$models$2$2((PaymentConfigurationPresenter) this.$event, (MutableState) this.L$0, (MutableState) this.$category$delegate, (MutableState) this.$state$delegate, (MutableState) obj2, continuation, 3);
            case 4:
                return new PoolsListPresenter$models$2$2((MutableStateFlow) this.$category$delegate, (PaymentConfigurationPresenter) this.$state$delegate, (MutableState) this.L$0, (State) this.$event, (State) obj2, continuation);
            case 5:
                return new PoolsListPresenter$models$2$2((PaymentConfigurationViewEvent) this.$category$delegate, (Set) this.$state$delegate, (PaymentConfigurationPresenter) this.$event, (MutableStateFlow) obj2, continuation, 5);
            case 6:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$2 = new PoolsListPresenter$models$2$2((Ref$ObjectRef) this.$state$delegate, (kotlinx.coroutines.channels.Channel) this.$event, (Function0) obj2, continuation, 6);
                poolsListPresenter$models$2$2.$category$delegate = obj;
                return poolsListPresenter$models$2$2;
            case 7:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$22 = new PoolsListPresenter$models$2$2((PointerInputScope) this.$category$delegate, (kotlinx.coroutines.channels.Channel) this.$state$delegate, (Function0) this.$event, (Function1) obj2, continuation, 7);
                poolsListPresenter$models$2$22.L$0 = obj;
                return poolsListPresenter$models$2$22;
            case 8:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$23 = new PoolsListPresenter$models$2$2((Flow) this.$state$delegate, continuation, (MoleculePresenter) this.$event, (MutableState) this.L$0, (State) obj2, 8);
                poolsListPresenter$models$2$23.$category$delegate = obj;
                return poolsListPresenter$models$2$23;
            case 9:
                return new PoolsListPresenter$models$2$2((RealPoolsRepository) this.$category$delegate, (Money) this.$state$delegate, (String) this.$event, (String) obj2, continuation, 9);
            case 10:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$24 = new PoolsListPresenter$models$2$2((Flow) this.$event, continuation, obj2, (MutableState) this.L$0, (MutableState) this.$category$delegate, 10);
                poolsListPresenter$models$2$24.$state$delegate = obj;
                return poolsListPresenter$models$2$24;
            case 11:
                return new PoolsListPresenter$models$2$2((ProfilePresenter) this.$event, (MutableState) this.L$0, (MutableState) this.$category$delegate, (MutableState) this.$state$delegate, (MutableState) obj2, continuation, 11);
            case 12:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$25 = new PoolsListPresenter$models$2$2((Flow) this.$event, continuation, obj2, (MutableState) this.L$0, (MutableState) this.$category$delegate, 12);
                poolsListPresenter$models$2$25.$state$delegate = obj;
                return poolsListPresenter$models$2$25;
            case 13:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$26 = new PoolsListPresenter$models$2$2((Flow) this.$state$delegate, continuation, (StartPoolPresenter) this.$event, (MutableState) this.L$0, (State) obj2, 13);
                poolsListPresenter$models$2$26.$category$delegate = obj;
                return poolsListPresenter$models$2$26;
            case 14:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$27 = new PoolsListPresenter$models$2$2(this.$state$delegate, (DataLoadingState) this.$event, continuation, (PdfPreviewPresenter) obj2, (MutableState) this.L$0);
                poolsListPresenter$models$2$27.$category$delegate = obj;
                return poolsListPresenter$models$2$27;
            case 15:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$28 = new PoolsListPresenter$models$2$2((Flow) this.$event, continuation, obj2, (MutableState) this.L$0, (MutableState) this.$category$delegate, 15);
                poolsListPresenter$models$2$28.$state$delegate = obj;
                return poolsListPresenter$models$2$28;
            case 16:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$29 = new PoolsListPresenter$models$2$2((Flow) this.$state$delegate, continuation, (WorkHomePresenter) this.$event, (List) obj2, (MutableState) this.L$0, 16);
                poolsListPresenter$models$2$29.$category$delegate = obj;
                return poolsListPresenter$models$2$29;
            case 17:
                return new PoolsListPresenter$models$2$2((ProfileScreens.ProfileScreen.Customer.CashCustomer) this.$state$delegate, (RealProfileRepo) this.$event, (GetProfileDetailsContext) obj2, continuation, 17);
            case 18:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$210 = new PoolsListPresenter$models$2$2((Flow) this.$state$delegate, continuation, (QrCodeProfilePresenter) this.$event, (State) obj2, (MutableState) this.L$0, 18);
                poolsListPresenter$models$2$210.$category$delegate = obj;
                return poolsListPresenter$models$2$210;
            case 19:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$211 = new PoolsListPresenter$models$2$2((Flow) this.$state$delegate, continuation, (LocalEditorialPresenter) this.$event, (State) obj2, (MutableState) this.L$0, 19);
                poolsListPresenter$models$2$211.$category$delegate = obj;
                return poolsListPresenter$models$2$211;
            case 20:
                return new PoolsListPresenter$models$2$2((ProductSearchPresenter) obj2, (MutableState) this.$category$delegate, continuation);
            case 21:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$212 = new PoolsListPresenter$models$2$2((Flow) this.$event, continuation, (RealShoppingJavascriptPresenter) obj2, (MutableState) this.L$0, (MutableState) this.$category$delegate, 21);
                poolsListPresenter$models$2$212.$state$delegate = obj;
                return poolsListPresenter$models$2$212;
            case 22:
                return new PoolsListPresenter$models$2$2((ShoppingWebViewEvent.AfterpayWebCheckoutFlowJsonEvents) this.$event, (RealShoppingJavascriptPresenter) obj2, (MutableState) this.L$0, (MutableState) this.$category$delegate, continuation);
            case 23:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$213 = new PoolsListPresenter$models$2$2((Flow) this.$state$delegate, (RestrictedProduct) this.$event, (RealShoppingJavascriptPresenter) obj2, (MutableState) this.L$0, continuation);
                poolsListPresenter$models$2$213.$category$delegate = obj;
                return poolsListPresenter$models$2$213;
            case 24:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$214 = new PoolsListPresenter$models$2$2((Flow) this.$event, continuation, obj2, (MutableState) this.L$0, (MutableState) this.$category$delegate, 24);
                poolsListPresenter$models$2$214.$state$delegate = obj;
                return poolsListPresenter$models$2$214;
            case 25:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$215 = new PoolsListPresenter$models$2$2((Flow) this.$state$delegate, continuation, (ShoppingSettingsAutofillPresenter) this.$event, (MutableState) this.L$0, (State) obj2, 25);
                poolsListPresenter$models$2$215.$category$delegate = obj;
                return poolsListPresenter$models$2$215;
            case 26:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$216 = new PoolsListPresenter$models$2$2((Flow) this.$event, continuation, obj2, (MutableState) this.L$0, (MutableState) this.$category$delegate, 26);
                poolsListPresenter$models$2$216.$state$delegate = obj;
                return poolsListPresenter$models$2$216;
            case 27:
                return new PoolsListPresenter$models$2$2((ArticleViewEvent) this.$state$delegate, (ArticlePresenter) this.$event, (MutableState) this.L$0, (State) obj2, (MutableState) this.$category$delegate, continuation);
            case 28:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$217 = new PoolsListPresenter$models$2$2((Flow) this.$event, continuation, obj2, (MutableState) this.L$0, (MutableState) this.$category$delegate, 28);
                poolsListPresenter$models$2$217.$state$delegate = obj;
                return poolsListPresenter$models$2$217;
            default:
                PoolsListPresenter$models$2$2 poolsListPresenter$models$2$218 = new PoolsListPresenter$models$2$2((Flow) this.$event, continuation, obj2, (MutableState) this.L$0, (MutableState) this.$category$delegate, 29);
                poolsListPresenter$models$2$218.$state$delegate = obj;
                return poolsListPresenter$models$2$218;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((PoolsListPresenter$models$2$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0332, code lost:
    
        if (r1 == r3) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x06b1, code lost:
    
        if (r3.activePoolsCount == 0) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x06a8, code lost:
    
        if (r3 == r4) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0695, code lost:
    
        if (r5 == r4) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0688, code lost:
    
        if (r5 == r4) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x064f, code lost:
    
        if (r1 == r4) goto L310;
     */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0373  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:364:0x0825 -> B:351:0x0826). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object access$refreshData;
        Object access$submitAllocationUpdates;
        Object nearbySession;
        BroadcasterProfileData broadcasterProfileData;
        NearbyContext nearbyContext;
        BroadcasterProfileData broadcasterProfileData2;
        String str;
        BroadcasterProfileData broadcasterProfileData3;
        String str2;
        BroadcasterProfileData broadcasterProfileData4;
        String str3;
        BroadcasterProfileData broadcasterProfileData5;
        String str4;
        BroadcasterProfileData broadcasterProfileData6;
        BroadcasterProfileData broadcasterProfileData7;
        String str5;
        List list;
        RecipientViewModel recipient;
        RecipientViewModel recipient2;
        Recipient recipient3;
        Recipient recipient4;
        Object contactStatus;
        Object obj2;
        Object createPool;
        MoneyPool moneyPool;
        Object obj3;
        Object obj4;
        Object obj5;
        CurrencyCode currencyCode;
        MoneyPool moneyPool2;
        Long l;
        Object withContext;
        String str6;
        Object access$deleteDevice;
        Object obj6;
        CustomerProfileData customerProfileData;
        CustomerProfileData customerProfileData2;
        String str7;
        Object profileDetails;
        CustomerProfileDetails customerProfileDetails;
        String str8;
        String str9;
        Image image;
        boolean z;
        boolean z2;
        boolean z3;
        String str10;
        String str11;
        boolean z4;
        String str12;
        MerchantData merchantData;
        String str13;
        Image image2;
        String str14;
        Color uiColor;
        Color validate;
        Object obj7;
        Object firstOrNull;
        String str15;
        ContactsStatus contactsStatus;
        CustomerProfileData customerProfileData3;
        int i = this.$r8$classId;
        Object obj8 = this.this$0;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) this.$state$delegate;
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj8;
                MutableState mutableState2 = (MutableState) this.$category$delegate;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState2.setValue(((PoolsListViewEvent.SelectCategory) ((PoolsListViewEvent) this.$event)).category);
                    Analytics analytics = (Analytics) poolsListPresenter.analytics;
                    String str16 = (String) poolsListPresenter.flowToken;
                    String name = ((PoolCategory) mutableState2.getValue()).name();
                    str16.getClass();
                    name.getClass();
                    analytics.track(new AssetPoolPoolListToggleTap(str16, name), null);
                    mutableState.setValue(new PoolsListViewModel.Loading((PoolCategory) mutableState2.getValue()));
                    PoolCategory poolCategory = (PoolCategory) mutableState2.getValue();
                    this.L$0 = mutableState;
                    this.label = 1;
                    access$refreshData = PoolsListPresenter.access$refreshData(poolsListPresenter, poolCategory, this);
                    if (access$refreshData == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = (MutableState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    access$refreshData = obj;
                }
                mutableState.setValue((PoolsListViewModel) access$refreshData);
                return Unit.INSTANCE;
            case 1:
                EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration = (EditDistributionConfiguration.DestinationUiConfiguration) this.$state$delegate;
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) this.$category$delegate;
                MutableState mutableState3 = (MutableState) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState3.setValue(Boolean.TRUE);
                    AllocationDistribution allocationDistribution = new AllocationDistribution(ImageResources_androidKt.calculateAllocations(((EditDistributionConfiguration) localCashBalancePresenter.service).initialDestinationStates, destinationUiConfiguration, ((ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj8)).getFloatValue(), EditDistributionPresenter$models$2$3$1.INSTANCE));
                    SetPaycheckAllocationAmountInputs.SubmissionInteraction interaction = ((IsSubmissionInteraction) ((EditDistributionViewEvent) this.$event)).getInteraction();
                    this.label = 1;
                    access$submitAllocationUpdates = LocalCashBalancePresenter.access$submitAllocationUpdates(localCashBalancePresenter, destinationUiConfiguration, allocationDistribution, interaction, this);
                    if (access$submitAllocationUpdates == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$submitAllocationUpdates = obj;
                }
                Boolean bool = (Boolean) access$submitAllocationUpdates;
                bool.booleanValue();
                mutableState3.setValue(bool);
                return Unit.INSTANCE;
            case 2:
                SnapshotStateSet snapshotStateSet = (SnapshotStateSet) this.$event;
                NearbyAdvertisement nearbyAdvertisement = (NearbyAdvertisement) this.$category$delegate;
                CardLockPresenter cardLockPresenter = (CardLockPresenter) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) cardLockPresenter.issuedCardManager;
                    ByteString.Companion companion = ByteString.Companion;
                    GetNearbySessionRequest getNearbySessionRequest = new GetNearbySessionRequest(ByteString.Companion.of$default(nearbyAdvertisement.toByteArray()));
                    this.label = 1;
                    nearbySession = markwonConfiguration.getNearbySession(getNearbySessionRequest, this);
                    if (nearbySession == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    nearbySession = obj;
                }
                ApiResult apiResult = (ApiResult) nearbySession;
                if (apiResult instanceof ApiResult.Success) {
                    SnapshotStateMap snapshotStateMap = (SnapshotStateMap) this.$state$delegate;
                    GetNearbySessionResponse getNearbySessionResponse = (GetNearbySessionResponse) ((ApiResult.Success) apiResult).response;
                    NearbySession nearbySession2 = getNearbySessionResponse.nearby_session;
                    Character monogram = (nearbySession2 == null || (broadcasterProfileData7 = nearbySession2.broadcaster_profile_data) == null || (str5 = broadcasterProfileData7.display_name) == null) ? null : GrpcStatus.Companion.monogram(str5);
                    NearbySession nearbySession3 = getNearbySessionResponse.nearby_session;
                    Color uiColor2 = ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(29, null, (nearbySession3 == null || (broadcasterProfileData6 = nearbySession3.broadcaster_profile_data) == null) ? null : broadcasterProfileData6.customer_token, null, null, null));
                    NearbySession nearbySession4 = getNearbySessionResponse.nearby_session;
                    NearbyAvatarInfo nearbyAvatarInfo = new NearbyAvatarInfo(monogram, uiColor2, (nearbySession4 == null || (broadcasterProfileData5 = nearbySession4.broadcaster_profile_data) == null || (str4 = broadcasterProfileData5.profile_photo_url) == null) ? null : new Image(str4, str4, 4));
                    NearbySession nearbySession5 = getNearbySessionResponse.nearby_session;
                    snapshotStateMap.put(nearbyAdvertisement, new NearbyPerson(nearbyAvatarInfo, (nearbySession5 == null || (broadcasterProfileData4 = nearbySession5.broadcaster_profile_data) == null || (str3 = broadcasterProfileData4.display_name) == null) ? "" : str3, (nearbySession5 == null || (broadcasterProfileData3 = nearbySession5.broadcaster_profile_data) == null || (str2 = broadcasterProfileData3.customer_token) == null) ? "" : str2, (nearbySession5 == null || (broadcasterProfileData2 = nearbySession5.broadcaster_profile_data) == null || (str = broadcasterProfileData2.cashtag) == null) ? "" : str, (nearbySession5 == null || (nearbyContext = nearbySession5.nearby_context) == null) ? null : nearbyContext.context_token));
                    NearbySession nearbySession6 = getNearbySessionResponse.nearby_session;
                    String str17 = (nearbySession6 == null || (broadcasterProfileData = nearbySession6.broadcaster_profile_data) == null) ? null : broadcasterProfileData.customer_token;
                    if (str17 != null && str17.length() != 0) {
                        snapshotStateSet.add(str17);
                        Analytics analytics2 = (Analytics) cardLockPresenter.analytics;
                        int size = snapshotStateSet.size();
                        String str18 = (String) cardLockPresenter.ioDispatcher;
                        str18.getClass();
                        analytics2.track(new NearbyPaymentDiscoverFoundPeople(Integer.valueOf(size), str17, str18), null);
                    }
                } else {
                    ((SnapshotStateSet) obj8).add(nearbyAdvertisement);
                }
                return Unit.INSTANCE;
            case 3:
                MutableState mutableState4 = (MutableState) this.$category$delegate;
                MutableState mutableState5 = (MutableState) this.L$0;
                PaymentConfigurationPresenter paymentConfigurationPresenter = (PaymentConfigurationPresenter) this.$event;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (paymentConfigurationPresenter.args.orientation == Orientation.CASH) {
                        PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) mutableState5.getValue();
                        RecipientSelectedStep recipientSelectedStep = paymentConfigurationViewModel instanceof RecipientSelectedStep ? (RecipientSelectedStep) paymentConfigurationViewModel : null;
                        boolean z5 = ((recipientSelectedStep == null || (recipient2 = recipientSelectedStep.getRecipient()) == null || (recipient3 = recipient2.recipient) == null) ? null : recipient3.invoice) instanceof Recipient.CryptoRecipientPayment.Stablecoin;
                        boolean enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) paymentConfigurationPresenter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$StablecoinDebitCardSource.INSTANCE)).enabled();
                        boolean z6 = ((PaymentRouterData) mutableState4.getValue()).scheduleSelection != null;
                        RealInstrumentRowLoader realInstrumentRowLoader = paymentConfigurationPresenter.instrumentRowLoader;
                        Money money = ((PaymentRouterData) mutableState4.getValue()).amount;
                        if (((PaymentConfigurationViewModel) mutableState5.getValue()) instanceof RecipientSelectedStep) {
                            PaymentConfigurationViewModel paymentConfigurationViewModel2 = (PaymentConfigurationViewModel) mutableState5.getValue();
                            RecipientSelectedStep recipientSelectedStep2 = paymentConfigurationViewModel2 instanceof RecipientSelectedStep ? (RecipientSelectedStep) paymentConfigurationViewModel2 : null;
                            if (recipientSelectedStep2 == null || (recipient = recipientSelectedStep2.getRecipient()) == null || (list = CollectionsKt__CollectionsJVMKt.listOf(recipient.recipient)) == null) {
                                list = EmptyList.INSTANCE;
                            }
                        } else {
                            list = EmptyList.INSTANCE;
                        }
                        FlowExtensionsKt$combine$$inlined$combine$1 models = realInstrumentRowLoader.models(money, list, (InstrumentSelection) ((MutableState) this.$state$delegate).getValue(), (z5 || z6) ? false : true, !z5 || enabled, true, (!((Boolean) ((MutableState) obj8).getValue()).booleanValue() || z5 || z6) ? false : true);
                        MusicPresenter$models$2$1.AnonymousClass1 anonymousClass1 = new MusicPresenter$models$2$1.AnonymousClass1(24, mutableState4);
                        this.label = 1;
                        if (models.collect(anonymousClass1, this) == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                MutableState mutableState6 = (MutableState) this.L$0;
                PaymentConfigurationPresenter paymentConfigurationPresenter2 = (PaymentConfigurationPresenter) this.$state$delegate;
                MutableStateFlow mutableStateFlow = (MutableStateFlow) this.$category$delegate;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(FlowKt.debounce(mutableStateFlow, 500L), new PageFetcher$flow$1.AnonymousClass2(paymentConfigurationPresenter2, (MutableStateFlow) this.$category$delegate, mutableState6, (State) this.$event, null, 3));
                    State state = (State) this.$event;
                    NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$1 = new NearbyPayRequestPresenter$models$10$1$1$1((Object) mutableStateFlow, (MoleculePresenter) paymentConfigurationPresenter2, mutableState6, (State) obj8, 25);
                    this.label = 1;
                    Object collect = transformLatest.collect(new AndroidPermissionChecker$granted$$inlined$map$2$2(9, nearbyPayRequestPresenter$models$10$1$1$1, paymentConfigurationPresenter2, state), this);
                    if (collect != coroutineSingletons5) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                PaymentConfigurationPresenter paymentConfigurationPresenter3 = (PaymentConfigurationPresenter) this.$event;
                UUID uuid = paymentConfigurationPresenter3.paymentToken;
                Analytics analytics3 = paymentConfigurationPresenter3.analytics;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RecipientViewModel recipientViewModel = ((PaymentConfigurationViewEvent.RecipientViewed) ((PaymentConfigurationViewEvent) this.$category$delegate)).recipient;
                    recipient4 = recipientViewModel.recipient;
                    StablecoinWithdrawalOption stablecoinOptionOrNull = zzahh.stablecoinOptionOrNull(recipientViewModel);
                    if (stablecoinOptionOrNull != null) {
                        StablecoinNetwork stablecoinNetwork = stablecoinOptionOrNull.network;
                        String str19 = stablecoinNetwork.address;
                        String str20 = stablecoinNetwork.chain;
                        str19.getClass();
                        str20.getClass();
                        if (((Set) this.$state$delegate).add(str19 + "::" + str20)) {
                            String uuid2 = uuid.toString();
                            uuid2.getClass();
                            AnalyticsHelperKt.trackPaymentViewStablecoinRecipient(analytics3, uuid2, str20, paymentConfigurationPresenter3.flowToken, paymentConfigurationPresenter3.analyticsOrigin);
                        }
                        return Unit.INSTANCE;
                    }
                    String str21 = recipient4.customerId;
                    String str22 = (str21 == null && (str21 = recipient4.lookupKey) == null) ? "" : str21;
                    RealRecipientRepository realRecipientRepository = paymentConfigurationPresenter3.recipientRepository;
                    this.L$0 = recipient4;
                    this.label = 1;
                    contactStatus = realRecipientRepository.getContactStatus(str22, this);
                    if (contactStatus == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Recipient recipient5 = (Recipient) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    recipient4 = recipient5;
                    contactStatus = obj;
                }
                ContactsStatus contactsStatus2 = (ContactsStatus) contactStatus;
                ContactStatus analyticsContactStatus = contactsStatus2 != null ? RecipientAnalyticsKt.toAnalyticsContactStatus(contactsStatus2) : ContactStatus.IN_CONTACTS;
                if (((CharSequence) ((StateFlowImpl) ((MutableStateFlow) obj8)).getValue()).length() == 0) {
                    Recipient.Analytics analytics4 = recipient4.analytics;
                    if (!(analytics4 != null ? analytics4.isAssetSendViewEventTracked : false)) {
                        PaymentType paymentType = paymentConfigurationPresenter3.args.orientation == Orientation.CASH ? PaymentType.SEND : PaymentType.REQUEST;
                        String uuid3 = uuid.toString();
                        uuid3.getClass();
                        RecipientAnalyticsKt.logAssetViewRecipient(analytics3, paymentType, uuid3, analyticsContactStatus, recipient4.analytics, ExperienceType.BOTTOM_SHEET, paymentConfigurationPresenter3.flowToken);
                        Recipient.Analytics analytics5 = recipient4.analytics;
                        if (analytics5 != null) {
                            analytics5.isAssetSendViewEventTracked = true;
                        }
                    }
                } else {
                    Recipient.Analytics analytics6 = recipient4.analytics;
                    if (!(analytics6 != null ? analytics6.isRecipientSearchEventTracked : false)) {
                        String uuid4 = uuid.toString();
                        uuid4.getClass();
                        RecipientAnalyticsKt.logRecipientSearchViewContact(analytics3, uuid4, paymentConfigurationPresenter3.searchFlowToken, analyticsContactStatus, recipient4.analytics, com.squareup.cash.cdf.recipient.ExperienceType.BOTTOM_SHEET);
                    }
                    Recipient.Analytics analytics7 = recipient4.analytics;
                    if (analytics7 != null) {
                        analytics7.isRecipientSearchEventTracked = true;
                    }
                }
                return Unit.INSTANCE;
            case 6:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.$state$delegate;
                DefaultTransformableState$transformScope$1 defaultTransformableState$transformScope$1 = (DefaultTransformableState$transformScope$1) this.$category$delegate;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    obj2 = ref$ObjectRef.element;
                    if (obj2 instanceof TransformationState$TransformationStopped) {
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef2;
                    Object receive = obj;
                    ref$ObjectRef3.element = receive;
                    if (Intrinsics.areEqual(ref$ObjectRef.element, TransformationState$TransformationStopped.INSTANCE)) {
                        ((Function0) obj8).invoke();
                    }
                    obj2 = ref$ObjectRef.element;
                    if (obj2 instanceof TransformationState$TransformationStopped) {
                        return Unit.INSTANCE;
                    }
                    TransformationState$TransformationOccurred transformationState$TransformationOccurred = obj2 instanceof TransformationState$TransformationOccurred ? (TransformationState$TransformationOccurred) obj2 : null;
                    if (transformationState$TransformationOccurred != null) {
                        defaultTransformableState$transformScope$1.this$0.onTransformation.invoke(new Offset(9205357640488583168L), Float.valueOf(transformationState$TransformationOccurred.zoomChange), new Offset(transformationState$TransformationOccurred.panChange), Float.valueOf(transformationState$TransformationOccurred.rotationChange));
                    }
                    kotlinx.coroutines.channels.Channel channel = (kotlinx.coroutines.channels.Channel) this.$event;
                    this.$category$delegate = defaultTransformableState$transformScope$1;
                    this.L$0 = ref$ObjectRef;
                    this.label = 1;
                    receive = channel.receive(this);
                    if (receive == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                    ref$ObjectRef3 = ref$ObjectRef;
                    ref$ObjectRef3.element = receive;
                    if (Intrinsics.areEqual(ref$ObjectRef.element, TransformationState$TransformationStopped.INSTANCE)) {
                    }
                    obj2 = ref$ObjectRef.element;
                    if (obj2 instanceof TransformationState$TransformationStopped) {
                    }
                }
            case 7:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PointerInputScope pointerInputScope = (PointerInputScope) this.$category$delegate;
                    TransformableKt$transformable$3$block$1$1$1$1 transformableKt$transformable$3$block$1$1$1$1 = new TransformableKt$transformable$3$block$1$1$1$1((kotlinx.coroutines.channels.Channel) this.$state$delegate, (Function0) this.$event, coroutineScope, (Function1) obj8, null);
                    this.L$0 = null;
                    this.label = 1;
                    if (Draggable2DKt.awaitEachGesture(pointerInputScope, transformableKt$transformable$3$block$1$1$1$1, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.$category$delegate;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$state$delegate;
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$2 = new AndroidPermissionChecker$granted$$inlined$map$2$2(coroutineScope2, (InviteErrorPresenter) this.$event, (MutableState) this.L$0, (ParcelableSnapshotMutableIntState) obj8, 13);
                    this.$category$delegate = null;
                    this.label = 1;
                    if (flow.collect(androidPermissionChecker$granted$$inlined$map$2$2, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                RealPoolsRepository realPoolsRepository = (RealPoolsRepository) this.$category$delegate;
                KeyValue keyValue = realPoolsRepository.poolsAppletData;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PoolsService poolsService = realPoolsRepository.poolsService;
                    CreatePoolRequest createPoolRequest = new CreatePoolRequest((Money) this.$state$delegate, (String) this.$event, (String) obj8, ByteString.EMPTY);
                    this.label = 1;
                    createPool = poolsService.createPool(createPoolRequest, this);
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            moneyPool = (MoneyPool) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            obj3 = obj;
                            if (obj3 != null) {
                                this.L$0 = moneyPool;
                                this.label = 3;
                                obj4 = keyValue.get(this);
                                break;
                            }
                            Money money2 = moneyPool.target;
                            if (money2 == null || (currencyCode = money2.currency_code) == null) {
                                currencyCode = CurrencyCode.USD;
                            }
                            PoolsAppletData poolsAppletData = new PoolsAppletData(1, 0, currencyCode, CollectionsKt__CollectionsJVMKt.listOf(new PoolAppletPreview(moneyPool.name, EmptyList.INSTANCE, RecyclerView.DECELERATION_RATE, 0L, (money2 == null || (l = money2.amount) == null) ? 0L : l.longValue())));
                            this.L$0 = moneyPool;
                            this.label = 5;
                            if (keyValue.set(poolsAppletData, this) != coroutineSingletons10) {
                                moneyPool2 = moneyPool;
                                moneyPool = moneyPool2;
                                return new CreatePoolResult.Success(moneyPool);
                            }
                            return coroutineSingletons10;
                        }
                        if (i11 == 3) {
                            moneyPool = (MoneyPool) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            obj4 = obj;
                            PoolsAppletData poolsAppletData2 = (PoolsAppletData) obj4;
                            if (poolsAppletData2 != null && poolsAppletData2.closedPoolsCount == 0) {
                                this.L$0 = moneyPool;
                                this.label = 4;
                                obj5 = keyValue.get(this);
                                break;
                            }
                            return new CreatePoolResult.Success(moneyPool);
                        }
                        if (i11 != 4) {
                            if (i11 != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            moneyPool2 = (MoneyPool) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            moneyPool = moneyPool2;
                            return new CreatePoolResult.Success(moneyPool);
                        }
                        moneyPool = (MoneyPool) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        obj5 = obj;
                        PoolsAppletData poolsAppletData3 = (PoolsAppletData) obj5;
                        if (poolsAppletData3 != null) {
                            break;
                        }
                        return new CreatePoolResult.Success(moneyPool);
                    }
                    SafeTrace.throwOnFailure(obj);
                    createPool = obj;
                }
                ApiResult apiResult2 = (ApiResult) createPool;
                if (!(apiResult2 instanceof ApiResult.Failure.HttpFailure) && !(apiResult2 instanceof ApiResult.Failure.NetworkFailure)) {
                    if (!(apiResult2 instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    CreatePoolResponse createPoolResponse = (CreatePoolResponse) ((ApiResult.Success) apiResult2).response;
                    CreatePoolResponse.FailureReason failureReason = createPoolResponse.failure_reason;
                    moneyPool = createPoolResponse.pool;
                    if (failureReason == null && moneyPool != null) {
                        this.L$0 = moneyPool;
                        this.label = 2;
                        obj3 = keyValue.get(this);
                        break;
                    } else {
                        int i12 = failureReason == null ? -1 : RealPoolsRepository$createPool$2$WhenMappings.$EnumSwitchMapping$0[failureReason.ordinal()];
                        return new CreatePoolResult.Error(i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? i12 != 5 ? CreatePoolFailureReason.GENERIC : CreatePoolFailureReason.RISK_BLOCKED_ELIGIBILITY : CreatePoolFailureReason.RISK_BLOCKED : CreatePoolFailureReason.REQUIRES_IDV : CreatePoolFailureReason.MAX_OPEN_POOL_LIMIT : CreatePoolFailureReason.INVALID_NAME);
                    }
                }
                return new CreatePoolResult.Error();
            case 10:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$event;
                    NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$12 = new NearbyPayRequestPresenter$models$10$1$1$1((Object) coroutineScope3, (MoleculePresenter) obj8, (MutableState) this.L$0, (State) this.$category$delegate, 26);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (flow2.collect(nearbyPayRequestPresenter$models$10$1$1$12, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProfilePresenter profilePresenter = (ProfilePresenter) this.$event;
                    RealPoolsRepository realPoolsRepository2 = (RealPoolsRepository) profilePresenter.profileRepo;
                    this.label = 1;
                    withContext = JobKt.withContext(realPoolsRepository2.ioDispatcher, new RingtoneView.AnonymousClass1(realPoolsRepository2, ((PoolDetailsScreen) profilePresenter.paymentsInboundNavigator).token, null, 1), this);
                    if (withContext == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                MutableState mutableState7 = (MutableState) this.L$0;
                MutableState mutableState8 = (MutableState) this.$category$delegate;
                MutableState mutableState9 = (MutableState) this.$state$delegate;
                MutableState mutableState10 = (MutableState) obj8;
                LoadPoolStatus loadPoolStatus = (LoadPoolStatus) withContext;
                mutableState7.setValue(Boolean.FALSE);
                if ((loadPoolStatus instanceof LoadPoolStatus.HttpFailure) || (loadPoolStatus instanceof LoadPoolStatus.NetworkFailure) || (loadPoolStatus instanceof LoadPoolStatus.ResponseFailure)) {
                    mutableState8.setValue(loadPoolStatus);
                } else if (loadPoolStatus instanceof LoadPoolStatus.Success) {
                    PoolData poolData = ((LoadPoolStatus.Success) loadPoolStatus).data;
                    mutableState9.setValue(poolData.pool);
                    mutableState10.setValue(Boolean.valueOf(Intrinsics.areEqual(poolData.viewerCanLeavePool, Boolean.TRUE)));
                    mutableState8.setValue(null);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$event;
                    NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$13 = new NearbyPayRequestPresenter$models$10$1$1$1((Object) coroutineScope4, (MoleculePresenter) obj8, (MutableState) this.L$0, (State) this.$category$delegate, 27);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (flow3.collect(nearbyPayRequestPresenter$models$10$1$1$13, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.$category$delegate;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$state$delegate;
                    NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$14 = new NearbyPayRequestPresenter$models$10$1$1$1((Object) coroutineScope5, (MoleculePresenter) this.$event, (MutableState) this.L$0, (State) obj8, 28);
                    this.$category$delegate = null;
                    this.label = 1;
                    if (flow4.collect(nearbyPayRequestPresenter$models$10$1$1$14, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) obj8;
                MutableState mutableState11 = (MutableState) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object obj9 = this.$state$delegate;
                    DataLoadingState dataLoadingState = (DataLoadingState) this.$event;
                    DataLoadingState.DataLoaded dataLoaded = dataLoadingState instanceof DataLoadingState.DataLoaded ? (DataLoadingState.DataLoaded) dataLoadingState : null;
                    LoggedInDevice loggedInDevice = dataLoaded != null ? (LoggedInDevice) dataLoaded.data : null;
                    if (loggedInDevice != null) {
                        DeviceManagerDeviceDetailsPresenter$DeleteState deviceManagerDeviceDetailsPresenter$DeleteState = (DeviceManagerDeviceDetailsPresenter$DeleteState) mutableState11.getValue();
                        String str23 = deviceManagerDeviceDetailsPresenter$DeleteState.deviceId;
                        deviceManagerDeviceDetailsPresenter$DeleteState.getClass();
                        mutableState11.setValue(new DeviceManagerDeviceDetailsPresenter$DeleteState(str23, true));
                        str6 = null;
                        this.$category$delegate = null;
                        this.label = 1;
                        access$deleteDevice = PdfPreviewPresenter.access$deleteDevice(pdfPreviewPresenter, loggedInDevice, this);
                        if (access$deleteDevice == coroutineSingletons15) {
                            return coroutineSingletons15;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                access$deleteDevice = obj;
                str6 = null;
                ((DeviceManagerDeviceDetailsPresenter$DeleteState) mutableState11.getValue()).getClass();
                mutableState11.setValue(new DeviceManagerDeviceDetailsPresenter$DeleteState(str6, false));
                pdfPreviewPresenter.navigator.goTo((Screen) access$deleteDevice);
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$event;
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$22 = new AndroidPermissionChecker$granted$$inlined$map$2$2(coroutineScope6, (InviteErrorPresenter) obj8, (MutableState) this.L$0, (MutableState) this.$category$delegate, 15);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (flow5.collect(androidPermissionChecker$granted$$inlined$map$2$22, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.$category$delegate;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$state$delegate;
                    ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$2 = new ChannelFlowMerge$collectTo$2(coroutineScope7, (WorkHomePresenter) this.$event, (List) obj8, (MutableState) this.L$0, 1);
                    this.$category$delegate = null;
                    this.label = 1;
                    if (flow6.collect(channelFlowMerge$collectTo$2, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                ProfileScreens.ProfileScreen.Customer.CashCustomer cashCustomer = (ProfileScreens.ProfileScreen.Customer.CashCustomer) this.$state$delegate;
                RealProfileRepo realProfileRepo = (RealProfileRepo) this.$event;
                Map map = realProfileRepo.categoryNameMap;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str24 = (String) cashCustomer.customerId.getValue();
                    ContactQueries contactQueries = realProfileRepo.customerProfileQueries;
                    contactQueries.getClass();
                    str24.getClass();
                    CustomerProfileQueries$customerProfile$2 customerProfileQueries$customerProfile$2 = CustomerProfileQueries$customerProfile$2.INSTANCE;
                    CustomerProfile customerProfile = (CustomerProfile) new OffersSheetQueries$ForSheetKeyQuery(contactQueries, str24, new OfflineQueries$$ExternalSyntheticLambda0(contactQueries)).executeAsOneOrNull();
                    if (customerProfile != null) {
                        String str25 = customerProfile.customer_display_name;
                        String str26 = customerProfile.contact_display_name;
                        String str27 = customerProfile.customer_id;
                        MerchantData merchantData2 = customerProfile.merchant_data;
                        boolean z7 = customerProfile.is_cash_customer;
                        String str28 = customerProfile.lookup_key;
                        String str29 = ((z7 || str26 == null || str28 == null) && str25 != null) ? str25 : str26;
                        String str30 = customerProfile.cashtag;
                        String str31 = customerProfile.email;
                        String str32 = customerProfile.sms;
                        Image image3 = customerProfile.photo;
                        boolean z8 = customerProfile.is_business;
                        boolean z9 = customerProfile.is_verified;
                        Color color = customerProfile.themed_accent_color;
                        if (color == null || (validate = ColorsKt.validate(color)) == null) {
                            boolean z10 = customerProfile.is_cash_customer;
                            String str33 = customerProfile.lookup_key;
                            if ((!z10 && str26 != null && str33 != null) || str25 == null) {
                                str25 = str26;
                            }
                            z4 = z9;
                            str12 = str27;
                            merchantData = merchantData2;
                            str13 = str29;
                            image2 = image3;
                            str14 = str32;
                            uiColor = ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(1, null, str12, str25, customerProfile.sms, customerProfile.email));
                        } else {
                            uiColor = validate;
                            z4 = z9;
                            merchantData = merchantData2;
                            str14 = str32;
                            str13 = str29;
                            str12 = str27;
                            image2 = image3;
                        }
                        obj6 = obj8;
                        customerProfileData = new CustomerProfileData(str12, str28, str13, str30, str31, str14, image2, z7, (ContactsStatus) null, z8, z4, uiColor, customerProfile.region, customerProfile.credit_card_fee, customerProfile.blocked, merchantData != null, (String) map.getOrDefault(merchantData != null ? merchantData.category : null, merchantData != null ? merchantData.category : null), merchantData != null ? merchantData.should_colorize_avatar : null, Boolean.valueOf(customerProfile.can_accept_payments), (String) null, 1114368);
                    } else {
                        obj6 = obj8;
                        customerProfileData = null;
                    }
                    if (customerProfileData == null) {
                        ProfileScreens.ProfileScreen.Customer.CashCustomer.CashCustomerData cashCustomerData = cashCustomer.customerData;
                        if (cashCustomerData != null) {
                            Redacted redacted = cashCustomerData.displayName;
                            Redacted redacted2 = cashCustomerData.sms;
                            Redacted redacted3 = cashCustomerData.email;
                            String str34 = (String) redacted.getValue();
                            Redacted redacted4 = cashCustomerData.cashtag;
                            String str35 = redacted4 != null ? (String) redacted4.getValue() : null;
                            String str36 = redacted3 != null ? (String) redacted3.getValue() : null;
                            if (redacted2 != null) {
                                str8 = str35;
                                str9 = (String) redacted2.getValue();
                            } else {
                                str8 = str35;
                                str9 = null;
                            }
                            Image image4 = cashCustomerData.photo;
                            boolean z11 = cashCustomerData.isCashCustomer;
                            boolean z12 = cashCustomerData.isBusiness;
                            boolean z13 = cashCustomerData.isVerified;
                            Color color2 = cashCustomerData.accentColor;
                            if (color2 == null) {
                                String str37 = (String) redacted.getValue();
                                if (redacted2 != null) {
                                    z3 = z13;
                                    str11 = (String) redacted2.getValue();
                                } else {
                                    z3 = z13;
                                    str11 = null;
                                }
                                String str38 = redacted3 != null ? (String) redacted3.getValue() : null;
                                image = image4;
                                z = z11;
                                str10 = str24;
                                z2 = z12;
                                color2 = ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(1, null, str10, str37, str11, str38));
                            } else {
                                image = image4;
                                z = z11;
                                z2 = z12;
                                z3 = z13;
                                str10 = str24;
                            }
                            Color color3 = color2;
                            Region region = cashCustomerData.region;
                            Long l2 = cashCustomerData.creditCardFee;
                            BlockState blockState = cashCustomerData.blockState;
                            boolean z14 = cashCustomerData.isMerchantCustomer;
                            String str39 = cashCustomerData.merchantCategory;
                            str24 = str10;
                            customerProfileData2 = new CustomerProfileData(str24, (String) null, str34, str8, str36, str9, image, z, (ContactsStatus) null, z2, z3, color3, region, l2, blockState, z14, (String) map.getOrDefault(str39, str39), cashCustomerData.colorizeAvatar, Boolean.valueOf(cashCustomerData.canAcceptPayments), (String) null, 1114370);
                        } else {
                            customerProfileData2 = null;
                        }
                        str7 = str24;
                        if (customerProfileData2 == null) {
                            this.L$0 = str7;
                            this.label = 1;
                            profileDetails = realProfileRepo.appService.getProfileDetails(new GetProfileDetailsRequest(com.squareup.protos.cash.cashface.api.ContactsStatus.NOT_IN_CONTACTS, (String) cashCustomer.customerId.getValue(), (GetProfileDetailsContext) obj6, (String) null, 24), this);
                            break;
                        } else {
                            customerProfileDetails = new CustomerProfileDetails(customerProfileData2, null);
                        }
                    } else {
                        customerProfileDetails = new CustomerProfileDetails(customerProfileData, null);
                    }
                    return customerProfileDetails;
                }
                if (i20 != 1) {
                    if (i20 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj7 = (ApiResult.Success) this.$category$delegate;
                    String str40 = (String) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str15 = str40;
                    firstOrNull = obj;
                    contactsStatus = (ContactsStatus) firstOrNull;
                    if (contactsStatus == null) {
                        contactsStatus = ContactsStatus.NOT_IN_CONTACTS;
                    }
                    ApiResult.Success success = (ApiResult.Success) obj7;
                    customerProfileData3 = realProfileRepo.customerProfileData((GetProfileDetailsResponse) success.response, str15, null, null, contactsStatus);
                    if (customerProfileData3 != null) {
                        return new CustomerProfileDetails(customerProfileData3, (GetProfileDetailsResponse) success.response);
                    }
                    return null;
                }
                String str41 = (String) this.L$0;
                SafeTrace.throwOnFailure(obj);
                str7 = str41;
                profileDetails = obj;
                obj7 = (ApiResult) profileDetails;
                if (obj7 instanceof ApiResult.Success) {
                    ApiResult.Success success2 = (ApiResult.Success) obj7;
                    realProfileRepo.extendedProfileDetailsQueries.insertOrReplace(str7, (GetProfileDetailsResponse) success2.response);
                    Flow contactsStatusForCustomer = realProfileRepo.contactRepository.contactsStatusForCustomer(str7);
                    this.L$0 = str7;
                    this.$category$delegate = success2;
                    this.label = 2;
                    firstOrNull = FlowKt.firstOrNull(contactsStatusForCustomer, this);
                    if (firstOrNull != coroutineSingletons18) {
                        str15 = str7;
                        contactsStatus = (ContactsStatus) firstOrNull;
                        if (contactsStatus == null) {
                        }
                        ApiResult.Success success3 = (ApiResult.Success) obj7;
                        customerProfileData3 = realProfileRepo.customerProfileData((GetProfileDetailsResponse) success3.response, str15, null, null, contactsStatus);
                        if (customerProfileData3 != null) {
                        }
                    }
                    return coroutineSingletons18;
                }
                return null;
            case 18:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.$category$delegate;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$state$delegate;
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$23 = new AndroidPermissionChecker$granted$$inlined$map$2$2(coroutineScope8, (QrCodeProfilePresenter) this.$event, (State) obj8, (MutableState) this.L$0, 23);
                    this.$category$delegate = null;
                    this.label = 1;
                    if (flow7.collect(androidPermissionChecker$granted$$inlined$map$2$23, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.$category$delegate;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$state$delegate;
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$24 = new AndroidPermissionChecker$granted$$inlined$map$2$2(coroutineScope9, (LocalEditorialPresenter) this.$event, (State) obj8, (MutableState) this.L$0, 27);
                    this.$category$delegate = null;
                    this.label = 1;
                    if (flow8.collect(androidPermissionChecker$granted$$inlined$map$2$24, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                return invokeSuspend$com$squareup$cash$shopping$presenters$ProductSearchPresenter$models$3$1(obj);
            case 21:
                return invokeSuspend$com$squareup$cash$shopping$presenters$RealShoppingJavascriptPresenter$model$$inlined$CollectEffect$5(obj);
            case 22:
                return invokeSuspend$com$squareup$cash$shopping$presenters$RealShoppingJavascriptPresenter$model$7$1(obj);
            case 23:
                return invokeSuspend$com$squareup$cash$shopping$presenters$RealShoppingJavascriptPresenter$model$8$1(obj);
            case 24:
                return invokeSuspend$com$squareup$cash$shopping$presenters$ShoppingWebPresenter$models$composeSUPScreen$$inlined$CollectEffect$1(obj);
            case 25:
                return invokeSuspend$com$squareup$cash$shopping$settings$presenters$ShoppingSettingsAutofillPresenter$models$$inlined$CollectEffect$1(obj);
            case 26:
                return invokeSuspend$com$squareup$cash$support$chat$presenters$ChatExitPromptSheetPresenter$models$$inlined$CollectEffect$1(obj);
            case 27:
                return invokeSuspend$com$squareup$cash$support$presenters$ArticlePresenter$models$12$5(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$support$presenters$ContactSupportEmailInputPresenter$models$$inlined$CollectEffect$1(obj);
            default:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.$event;
                    ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$22 = new ChannelFlowMerge$collectTo$2(coroutineScope10, (PhoneVerificationPresenter) obj8, (MutableState) this.L$0, (MutableState) this.$category$delegate, 9);
                    this.$state$delegate = null;
                    this.label = 1;
                    if (flow9.collect(channelFlowMerge$collectTo$22, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolsListPresenter$models$2$2(LocalCashBalancePresenter localCashBalancePresenter, EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration, EditDistributionViewEvent editDistributionViewEvent, MutableState mutableState, MutableFloatState mutableFloatState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.$category$delegate = localCashBalancePresenter;
        this.$state$delegate = destinationUiConfiguration;
        this.$event = editDistributionViewEvent;
        this.L$0 = mutableState;
        this.this$0 = mutableFloatState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolsListPresenter$models$2$2(PoolsListViewEvent poolsListViewEvent, PoolsListPresenter poolsListPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.$event = poolsListViewEvent;
        this.this$0 = poolsListPresenter;
        this.$category$delegate = mutableState;
        this.$state$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolsListPresenter$models$2$2(ProductSearchPresenter productSearchPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 20;
        this.this$0 = productSearchPresenter;
        this.$category$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolsListPresenter$models$2$2(ShoppingWebViewEvent.AfterpayWebCheckoutFlowJsonEvents afterpayWebCheckoutFlowJsonEvents, RealShoppingJavascriptPresenter realShoppingJavascriptPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 22;
        this.$event = afterpayWebCheckoutFlowJsonEvents;
        this.this$0 = realShoppingJavascriptPresenter;
        this.L$0 = mutableState;
        this.$category$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PoolsListPresenter$models$2$2(MoleculePresenter moleculePresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$event = moleculePresenter;
        this.L$0 = mutableState;
        this.$category$delegate = mutableState2;
        this.$state$delegate = mutableState3;
        this.this$0 = mutableState4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolsListPresenter$models$2$2(CardLockPresenter cardLockPresenter, NearbyAdvertisement nearbyAdvertisement, SnapshotStateMap snapshotStateMap, SnapshotStateSet snapshotStateSet, SnapshotStateSet snapshotStateSet2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.L$0 = cardLockPresenter;
        this.$category$delegate = nearbyAdvertisement;
        this.$state$delegate = snapshotStateMap;
        this.$event = snapshotStateSet;
        this.this$0 = snapshotStateSet2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolsListPresenter$models$2$2(Object obj, DataLoadingState dataLoadingState, Continuation continuation, PdfPreviewPresenter pdfPreviewPresenter, MutableState mutableState) {
        super(2, continuation);
        this.$r8$classId = 14;
        this.$state$delegate = obj;
        this.$event = dataLoadingState;
        this.this$0 = pdfPreviewPresenter;
        this.L$0 = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PoolsListPresenter$models$2$2(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$category$delegate = obj;
        this.$state$delegate = obj2;
        this.$event = obj3;
        this.this$0 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PoolsListPresenter$models$2$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state$delegate = obj;
        this.$event = obj2;
        this.this$0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolsListPresenter$models$2$2(Flow flow, RestrictedProduct restrictedProduct, RealShoppingJavascriptPresenter realShoppingJavascriptPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 23;
        this.$state$delegate = flow;
        this.$event = restrictedProduct;
        this.this$0 = realShoppingJavascriptPresenter;
        this.L$0 = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PoolsListPresenter$models$2$2(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, MutableState mutableState, State state, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state$delegate = flow;
        this.$event = moleculePresenter;
        this.L$0 = mutableState;
        this.this$0 = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PoolsListPresenter$models$2$2(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, Object obj, MutableState mutableState, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state$delegate = flow;
        this.$event = moleculePresenter;
        this.this$0 = obj;
        this.L$0 = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PoolsListPresenter$models$2$2(Flow flow, Continuation continuation, Object obj, MutableState mutableState, MutableState mutableState2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$event = flow;
        this.this$0 = obj;
        this.L$0 = mutableState;
        this.$category$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolsListPresenter$models$2$2(MutableStateFlow mutableStateFlow, PaymentConfigurationPresenter paymentConfigurationPresenter, MutableState mutableState, State state, State state2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 4;
        this.$category$delegate = mutableStateFlow;
        this.$state$delegate = paymentConfigurationPresenter;
        this.L$0 = mutableState;
        this.$event = state;
        this.this$0 = state2;
    }
}
