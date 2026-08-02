package com.squareup.cash.shopping.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.DerivedSize;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.exifinterface.media.ExifInterfaceUtils;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.boost.AppPresentation;
import com.squareup.cash.cdf.browser.BrowserViewOpenScreen;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.screens.IabMetadata;
import com.squareup.cash.shopping.screens.ShoppingScreenContext;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.webview.android.WebViewUseCase;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.grantly.app.RetrieveDefaultShippingAddressRequest;
import com.squareup.protos.cash.grantly.app.RetrieveDefaultShippingAddressResponse;
import com.squareup.protos.common.Money;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ShoppingWebPresenter$models$5$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $state$delegate;
    public final /* synthetic */ MutableState $supCreditLimit$delegate;
    public MutableState L$0;
    public int label;
    public final /* synthetic */ ShoppingWebPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShoppingWebPresenter$models$5$1(ShoppingWebPresenter shoppingWebPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = shoppingWebPresenter;
        this.$supCreditLimit$delegate = mutableState;
        this.$state$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new ShoppingWebPresenter$models$5$1(this.this$0, this.$supCreditLimit$delegate, this.$state$delegate, continuation, 0);
            default:
                return new ShoppingWebPresenter$models$5$1(this.this$0, this.$supCreditLimit$delegate, this.$state$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ShoppingWebPresenter$models$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0250, code lost:
    
        if (r1.set(r2, r50) == r10) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0231, code lost:
    
        if (r2 == r10) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01b9, code lost:
    
        if (((com.squareup.cash.shopping.screens.IabMetadata.SUPMetadata) r5).checkoutFlowEndResultData != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d7, code lost:
    
        if (r5 == r10) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00de, code lost:
    
        if (com.squareup.cash.shopping.presenters.ShoppingWebPresenter.access$setInitialActiveBoost(r3, r50) == r10) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object first;
        MutableState mutableState;
        String str;
        String str2;
        ShoppingScreenContext screenContext;
        String str3;
        Object access$getMerchantConfig;
        Object obj2;
        Object retrieveDefaultShippingAddress;
        int i = this.$r8$classId;
        MutableState mutableState2 = this.$supCreditLimit$delegate;
        ShoppingWebPresenter shoppingWebPresenter = this.this$0;
        MutableState mutableState3 = this.$state$delegate;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                KeyValue keyValue = shoppingWebPresenter.seenDetailSheetForINN;
                RealOffersAnalyticsHelper realOffersAnalyticsHelper = shoppingWebPresenter.offersAnalyticsHelper;
                ShoppingWebScreen shoppingWebScreen = shoppingWebPresenter.args;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                int i3 = 2;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = shoppingWebPresenter.analytics;
                    RealBugReportSenderFactory realBugReportSenderFactory = shoppingWebPresenter.shoppingWebAnalytics;
                    analytics.track(new BrowserViewOpenScreen((BrowserOrigin) realBugReportSenderFactory.sessionManager, (InfoContext) realBugReportSenderFactory.featureEligibilityDumper, (String) realBugReportSenderFactory.tempStorage, (String) realBugReportSenderFactory.preferences, (String) realBugReportSenderFactory.cashDatabase, (String) realBugReportSenderFactory.backStackDumper), null);
                    this.label = 1;
                    break;
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i2 == 2) {
                    MutableState mutableState4 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    mutableState = mutableState4;
                    first = obj;
                    Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                    mutableState.setValue((Money) first);
                    if (ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebScreen, WebViewUseCase.SUP)) {
                        if (shoppingWebScreen instanceof ShoppingWebScreen.ShoppingWebScreenV2) {
                            IabMetadata iabMetadata = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).metadata;
                            iabMetadata.getClass();
                            break;
                        }
                        shoppingWebScreen.getClass();
                        IabMetadata iabMetadata2 = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).metadata;
                        iabMetadata2.getClass();
                        String str4 = ((IabMetadata.SUPMetadata) iabMetadata2).supToken;
                        if (str4 == null) {
                            str4 = "";
                        }
                        this.L$0 = null;
                        this.label = 3;
                        access$getMerchantConfig = ShoppingWebPresenter.access$getMerchantConfig(shoppingWebPresenter, str4, this);
                        break;
                    }
                    this.L$0 = null;
                    this.label = 4;
                    obj2 = keyValue.get(this);
                } else if (i2 == 3) {
                    SafeTrace.throwOnFailure(obj);
                    access$getMerchantConfig = obj;
                    ShoppingWebPresenter.MerchantConfig merchantConfig = (ShoppingWebPresenter.MerchantConfig) access$getMerchantConfig;
                    Set set2 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                    mutableState3.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState3.getValue(), false, null, null, null, null, null, null, null, null, null, null, null, false, null, merchantConfig, null, null, false, (Money) mutableState2.getValue(), 267386879));
                    ShoppingWebPresenter.access$showSupInitialHalfSheet(shoppingWebPresenter, merchantConfig, true, (Money) mutableState2.getValue());
                    this.L$0 = null;
                    this.label = 4;
                    obj2 = keyValue.get(this);
                    break;
                } else if (i2 == 4) {
                    SafeTrace.throwOnFailure(obj);
                    obj2 = obj;
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    if (ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebScreen, WebViewUseCase.AFTERPAY) && !booleanValue) {
                        ShoppingWebPresenter.access$showAfterpayDetailsSheet(shoppingWebPresenter);
                        Boolean bool = Boolean.TRUE;
                        this.label = 5;
                        break;
                    }
                } else if (i2 != 5) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                ShoppingWebScreen shoppingWebScreen2 = ((shoppingWebScreen instanceof ShoppingWebScreen.AffiliateShoppingScreen) || ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebScreen, WebViewUseCase.AFFILIATE)) ? shoppingWebScreen : null;
                if (shoppingWebScreen2 != null) {
                    if (shoppingWebScreen2 instanceof ShoppingWebScreen.AffiliateShoppingScreen) {
                        str2 = ((ShoppingWebScreen.AffiliateShoppingScreen) shoppingWebScreen2).rewardToken;
                    } else if (shoppingWebScreen2 instanceof ShoppingWebScreen.ShoppingWebScreenV2) {
                        IabMetadata iabMetadata3 = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen2).metadata;
                        iabMetadata3.getClass();
                        str2 = ((IabMetadata.AffiliateBoostMetadata) iabMetadata3).boostToken;
                    } else {
                        str = null;
                        String flowToken = shoppingWebPresenter.boostAnalyticsHelper.getFlowToken();
                        RealBoostRepository realBoostRepository = shoppingWebPresenter.boostRepository;
                        Finish finish = new Finish(null);
                        ShoppingScreenContext screenContext2 = shoppingWebScreen2.getScreenContext();
                        DerivedSize.Companion boostAppLocation = screenContext2 == null ? ShoppingWebPresenter.toBoostAppLocation(screenContext2) : null;
                        screenContext = shoppingWebScreen2.getScreenContext();
                        if (screenContext == null) {
                            str3 = ((screenContext instanceof ShoppingScreenContext.OffersTab) || (screenContext instanceof ShoppingScreenContext.OffersTimelineSheet)) ? realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.BOOST_PLASMA) : null;
                        } else {
                            str3 = null;
                        }
                        RealBoostRepository.selectBoost$default(realBoostRepository, finish, str, boostAppLocation, flowToken, str3, null, null, null, AppPresentation.AffiliateSite, null, null, 7904);
                    }
                    str = str2;
                    String flowToken2 = shoppingWebPresenter.boostAnalyticsHelper.getFlowToken();
                    RealBoostRepository realBoostRepository2 = shoppingWebPresenter.boostRepository;
                    Finish finish2 = new Finish(null);
                    ShoppingScreenContext screenContext22 = shoppingWebScreen2.getScreenContext();
                    if (screenContext22 == null) {
                    }
                    screenContext = shoppingWebScreen2.getScreenContext();
                    if (screenContext == null) {
                    }
                    RealBoostRepository.selectBoost$default(realBoostRepository2, finish2, str, boostAppLocation, flowToken2, str3, null, null, null, AppPresentation.AffiliateSite, null, null, 7904);
                }
                if ((shoppingWebScreen.getScreenContext() instanceof ShoppingScreenContext.OffersTab) || (shoppingWebScreen.getScreenContext() instanceof ShoppingScreenContext.OffersTimelineSheet)) {
                    realOffersAnalyticsHelper.refreshFlowToken(OffersAnalyticsHelper$Flow.BROWSE);
                }
                ChannelFlowTransformLatest mapLatest = FlowKt.mapLatest(new DataStoreImpl$data$1.AnonymousClass2(i3, objArr == true ? 1 : 0, 29), ((SyncValueReader) shoppingWebPresenter.singleUsePaymentManager.initializer).getSingleValue(AndroidSyncValueSpecs.SupOffersTabCreditLine));
                this.L$0 = mutableState2;
                this.label = 2;
                first = FlowKt.first(mapLatest, this);
                if (first != coroutineSingletons) {
                    mutableState = mutableState2;
                    Set set3 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                    mutableState.setValue((Money) first);
                    if (ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebScreen, WebViewUseCase.SUP)) {
                    }
                    this.L$0 = null;
                    this.label = 4;
                    obj2 = keyValue.get(this);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Set set4 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                    Profile profile = (Profile) mutableState2.getValue();
                    profile.getClass();
                    String str5 = profile.profile_id;
                    this.L$0 = mutableState3;
                    this.label = 1;
                    retrieveDefaultShippingAddress = shoppingWebPresenter.shippingAddressService.retrieveDefaultShippingAddress(new RetrieveDefaultShippingAddressRequest(str5), this);
                    if (retrieveDefaultShippingAddress == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState3 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    retrieveDefaultShippingAddress = obj;
                }
                ApiResult.Success success = retrieveDefaultShippingAddress instanceof ApiResult.Success ? (ApiResult.Success) retrieveDefaultShippingAddress : null;
                RetrieveDefaultShippingAddressResponse retrieveDefaultShippingAddressResponse = success != null ? (RetrieveDefaultShippingAddressResponse) success.response : null;
                Set set5 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                mutableState3.setValue(retrieveDefaultShippingAddressResponse);
                break;
        }
        return Unit.INSTANCE;
    }
}
