package com.squareup.cash.google.pay;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.emoji2.text.MetadataRepo;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.directdepositaccount.DirectDepositAccountTapStartManualSetup;
import com.squareup.cash.cdf.gps.GpsEventTrigger;
import com.squareup.cash.cdf.papermoney.PaperMoneyDepositViewMap;
import com.squareup.cash.cdf.papermoney.PaperMoneyDepositViewSwipeToLoadOnboarding;
import com.squareup.cash.cdf.papermoney.PaperMoneyDepositViewTutorial;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.profile.CustomerLimitsManager;
import com.squareup.cash.data.profile.RealContactAliasFetcher;
import com.squareup.cash.data.profile.RealCustomerLimitsManager;
import com.squareup.cash.data.profile.RealProfileAliasRepository;
import com.squareup.cash.data.profile.RealProfileAliasRepository$forAliasTypeProfileValues$1;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.data.transfers.RealTransferManager;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.backend.real.barcode.RealCashDepositBarcodeManager;
import com.squareup.cash.deposits.physical.presenter.barcode.PaperMoneyDepositBarcodeExpiredPresenter;
import com.squareup.cash.deposits.physical.presenter.map.PaperMoneyDepositMapPresenter;
import com.squareup.cash.deposits.physical.presenter.onboarding.PaperMoneyDepositOnboardingPresenter;
import com.squareup.cash.deposits.physical.presenter.onboarding.SwipeToLoadOnboardingPresenter;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositBarcodeFailedScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositBarcodeScreen;
import com.squareup.cash.directdeposit.presenters.DirectDepositSetupPresenter;
import com.squareup.cash.directdeposit.screens.DirectDepositSetupScreen;
import com.squareup.cash.earnings.applets.presenters.RealEarnerAppletAvailabilityState;
import com.squareup.cash.earnings.backend.api.CustomerInfo;
import com.squareup.cash.earnings.backend.api.PayerCustomersResult;
import com.squareup.cash.earnings.backend.api.PayerResult;
import com.squareup.cash.earnings.backend.real.RealPayerRepository;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.family.familyhub.backend.real.RealManagedAccountTransferManager;
import com.squareup.cash.family.familyhub.backend.real.sync.RealTargetEntityManager;
import com.squareup.cash.family.familyhub.screens.SponsorDetailScreen;
import com.squareup.cash.family.familyhub.screens.SponsorLedInviteScreen;
import com.squareup.cash.family.familyhub.views.DisabledClickableNode;
import com.squareup.cash.family.requestsponsorship.presenters.SelectSponsorPresenter;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$Option;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.FeatureFlagManagerKt$selectClientSyncValue$$inlined$flatMapLatest$1;
import com.squareup.cash.featureflags.JsonFeatureFlags$MigratedSyncValuesFlag;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AndroidUseJanusContactAliases;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$IsEmployee;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.gps.backend.real.GpsLocationRefresher;
import com.squareup.cash.gps.backend.real.RealGpsLocationManager;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.components.InvestingHomeView$2$1;
import com.squareup.cash.localization.RealRegionProvider;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.types.MetadataSection$AdditionalInfoSection;
import com.squareup.cash.observability.types.MetadataSection$UserSection;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.aegis.api.GetFamilyAccountSponsorRequest;
import com.squareup.protos.cash.aegis.api.GetFamilyAccountSponsorResponse;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipState;
import com.squareup.protos.cash.janus.api.GetPublicContactAliasesRequest;
import com.squareup.protos.cash.janus.api.JanusService;
import com.squareup.protos.cash.librarian.api.LegalDocumentsRequest;
import com.squareup.protos.cash.librarian.api.LegalDocumentsResponse;
import com.squareup.protos.cash.librarian.api.LibrarianService;
import com.squareup.protos.cash.paychecks.api.v1.GetPayersForCustomerRequest;
import com.squareup.protos.cash.paychecks.api.v1.GetPayersForCustomerResponse;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.cash.postbank.api.InitiateDirectDepositSetupFlowRequest;
import com.squareup.protos.cash.postbank.api.InitiateDirectDepositSetupFlowResponse;
import com.squareup.protos.cash.postbank.api.PostbankAppService;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.CompleteDigitalWalletTokenProvisioningResponse;
import com.squareup.protos.franklin.app.GetEffectiveCustomerLimitsRequest;
import com.squareup.protos.franklin.app.GetEffectiveCustomerLimitsResponse;
import com.squareup.protos.franklin.app.GetFeatureFlagsResponse;
import com.squareup.protos.franklin.common.FeatureFlag;
import com.squareup.protos.franklin.common.LimitedAction;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncValueType;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class GooglePayPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayPresenter$models$1$1(RealProfileAliasRepository realProfileAliasRepository, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 3;
        UiAlias.Type.Companion companion = UiAlias.Type.Companion;
        this.this$0 = realProfileAliasRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new GooglePayPresenter$models$1$1((GooglePayPresenter) obj2, continuation, 0);
            case 1:
                return new GooglePayPresenter$models$1$1((RealContactAliasFetcher) obj2, continuation, 1);
            case 2:
                return new GooglePayPresenter$models$1$1((RealCustomerLimitsManager) obj2, continuation, 2);
            case 3:
                UiAlias.Type.Companion companion = UiAlias.Type.Companion;
                return new GooglePayPresenter$models$1$1((RealProfileAliasRepository) obj2, continuation);
            case 4:
                return new GooglePayPresenter$models$1$1((RealProfileManager) obj2, continuation, 4);
            case 5:
                return new GooglePayPresenter$models$1$1((RealProfileSyncer) obj2, continuation, 5);
            case 6:
                return new GooglePayPresenter$models$1$1((MetadataRepo) obj2, continuation, 6);
            case 7:
                return new GooglePayPresenter$models$1$1((RealTransferManager) obj2, continuation, 7);
            case 8:
                return new GooglePayPresenter$models$1$1((PaperMoneyDepositBarcodeExpiredPresenter) obj2, continuation, 8);
            case 9:
                return new GooglePayPresenter$models$1$1((PaperMoneyDepositMapPresenter) obj2, continuation, 9);
            case 10:
                return new GooglePayPresenter$models$1$1((PaperMoneyDepositOnboardingPresenter) obj2, continuation, 10);
            case 11:
                return new GooglePayPresenter$models$1$1((SwipeToLoadOnboardingPresenter) obj2, continuation, 11);
            case 12:
                return new GooglePayPresenter$models$1$1((DirectDepositSetupPresenter) obj2, continuation, 12);
            case 13:
                return new GooglePayPresenter$models$1$1((CardStudioPresenter) obj2, continuation, 13);
            case 14:
                return new GooglePayPresenter$models$1$1((RealEarnerAppletAvailabilityState) obj2, continuation, 14);
            case 15:
                return new GooglePayPresenter$models$1$1((RealPayerRepository) obj2, continuation, 15);
            case 16:
                return new GooglePayPresenter$models$1$1((TransfersPresenter) obj2, continuation, 16);
            case 17:
                return new GooglePayPresenter$models$1$1((ActivitiesManager) obj2, continuation, 17);
            case 18:
                return new GooglePayPresenter$models$1$1((DisclosurePresenter) obj2, continuation, 18);
            case 19:
                return new GooglePayPresenter$models$1$1((RealDependentControlStatusManager) obj2, continuation, 19);
            case 20:
                return new GooglePayPresenter$models$1$1((RealTargetEntityManager) obj2, continuation, 20);
            case 21:
                return new GooglePayPresenter$models$1$1((CardStudioPresenter) obj2, continuation, 21);
            case 22:
                return new GooglePayPresenter$models$1$1((EndAppLockPresenter) obj2, continuation, 22);
            case 23:
                return new GooglePayPresenter$models$1$1((DisabledClickableNode) obj2, continuation, 23);
            case 24:
                return new GooglePayPresenter$models$1$1((SelectSponsorPresenter) obj2, continuation, 24);
            case 25:
                return new GooglePayPresenter$models$1$1((LocalHomePresenter) obj2, continuation, 25);
            case 26:
                return new GooglePayPresenter$models$1$1((RealFeatureFlagManager) obj2, continuation, 26);
            case 27:
                return new GooglePayPresenter$models$1$1((LocalEditorialPresenter) obj2, continuation, 27);
            case 28:
                return new GooglePayPresenter$models$1$1((DisclosurePresenter) obj2, continuation, 28);
            default:
                return new GooglePayPresenter$models$1$1((GpsLocationRefresher) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((GooglePayPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x02bc, code lost:
    
        if (r0 == r2) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02a7, code lost:
    
        if (r3 == r2) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x06ef, code lost:
    
        if (r2.prefetch(r58) == r0) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x06e4, code lost:
    
        if (com.squareup.cash.deposits.physical.presenter.map.PaperMoneyDepositMapPresenter.access$initialNavigation(r5, r58) == r0) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0245, code lost:
    
        if (r9 != null) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v73 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object publicContactAliases;
        Object effectiveCustomerLimits;
        Object firstOrNull;
        Object legalDocuments;
        Object initiateDirectDepositSetupFlow;
        InitiateDirectDepositSetupFlowResponse initiateDirectDepositSetupFlowResponse;
        Object payersForCustomer;
        CustomerInfo customerInfo;
        CustomerInfo customerInfo2;
        Object familyAccountSponsor;
        Object shouldShowRequestPermissionRationale;
        Object shouldShowOverridePrompt;
        Object until;
        Object value;
        Object value2;
        Object obj2;
        FeatureFlag$Option featureFlag$Option;
        Object trackBlockerSubmissionAnalytics$default;
        Screen next;
        Object collectGpsLocation;
        int i = this.$r8$classId;
        int i2 = 20;
        int i3 = 8;
        short s = 0;
        Object obj3 = this.this$0;
        String str = 0;
        Object obj4 = null;
        str = 0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GooglePayPresenter googlePayPresenter = (GooglePayPresenter) obj3;
                    CoroutineContext coroutineContext = googlePayPresenter.ioDispatcher;
                    FormCashtag.AnonymousClass8.AnonymousClass2 anonymousClass2 = new FormCashtag.AnonymousClass8.AnonymousClass2(googlePayPresenter, str, 29);
                    this.label = 1;
                    if (JobKt.withContext(coroutineContext, anonymousClass2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                RealContactAliasFetcher realContactAliasFetcher = (RealContactAliasFetcher) obj3;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) realContactAliasFetcher.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$AndroidUseJanusContactAliases.INSTANCE)).enabled()) {
                        return Unit.INSTANCE;
                    }
                    JanusService janusService = realContactAliasFetcher.janusService;
                    GetPublicContactAliasesRequest getPublicContactAliasesRequest = new GetPublicContactAliasesRequest(ByteString.EMPTY);
                    this.label = 1;
                    publicContactAliases = janusService.getPublicContactAliases(getPublicContactAliasesRequest, this);
                    if (publicContactAliases == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    publicContactAliases = obj;
                }
                ApiResult apiResult = (ApiResult) publicContactAliases;
                if (apiResult instanceof ApiResult.Success) {
                    realContactAliasFetcher.profileAliasQueries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(26, realContactAliasFetcher, (ApiResult.Success) apiResult));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.e("Failed to fetch contact aliases from Janus: %s", apiResult);
                }
                return Unit.INSTANCE;
            case 2:
                RealCustomerLimitsManager realCustomerLimitsManager = (RealCustomerLimitsManager) obj3;
                AndroidClock androidClock = realCustomerLimitsManager.clock;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j = realCustomerLimitsManager.lastRefresh;
                    CustomerLimitsManager.Companion.getClass();
                    if (Duration.m4167getInWholeMillisecondsimpl(CustomerLimitsManager.Companion.EXPIRATION_TIME) + j >= androidClock.millis()) {
                        return Unit.INSTANCE;
                    }
                    realCustomerLimitsManager.lastRefresh = androidClock.millis();
                    AppService appService = realCustomerLimitsManager.appService;
                    GetEffectiveCustomerLimitsRequest getEffectiveCustomerLimitsRequest = new GetEffectiveCustomerLimitsRequest(CollectionsKt__CollectionsKt.listOf((Object[]) new LimitedAction[]{LimitedAction.ADD_CASH, LimitedAction.BUY_CRYPTOCURRENCY, LimitedAction.SELL_CRYPTOCURRENCY}), ByteString.EMPTY);
                    this.label = 1;
                    effectiveCustomerLimits = appService.getEffectiveCustomerLimits(getEffectiveCustomerLimitsRequest, this);
                    if (effectiveCustomerLimits == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    effectiveCustomerLimits = obj;
                }
                ApiResult apiResult2 = (ApiResult) effectiveCustomerLimits;
                if (apiResult2 instanceof ApiResult.Success) {
                    realCustomerLimitsManager.limitsQueries.transactionWithWrapper(new BadgedBoxKt$$ExternalSyntheticLambda0(27, realCustomerLimitsManager, (GetEffectiveCustomerLimitsResponse) ((ApiResult.Success) apiResult2).response));
                }
                return Unit.INSTANCE;
            case 3:
                UiAlias.Type.Companion companion = UiAlias.Type.Companion;
                RealProfileAliasRepository realProfileAliasRepository = (RealProfileAliasRepository) obj3;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FeatureFlagManager featureFlagManager = realProfileAliasRepository.featureFlagManager;
                    SyncValueType syncValueType = SyncValueType.PROFILE_ALIAS;
                    InstrumentQueries instrumentQueries = realProfileAliasRepository.profileAliasQueries;
                    RealProfileAliasRepository$forAliasTypeProfileValues$1 realProfileAliasRepository$forAliasTypeProfileValues$1 = RealProfileAliasRepository$forAliasTypeProfileValues$1.INSTANCE;
                    instrumentQueries.getClass();
                    RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
                    ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(realFeatureFlagManager.peekValues(JsonFeatureFlags$MigratedSyncValuesFlag.INSTANCE), new FeatureFlagManagerKt$selectClientSyncValue$$inlined$flatMapLatest$1(null, syncValueType, new RealTransferManager$addCash$$inlined$map$1(realProfileAliasRepository.syncValueReader.getAllValues(AndroidSyncValueSpecs.ProfileAlias), realProfileAliasRepository), realFeatureFlagManager, DBUtil.mapToList(DBUtil.toFlow(new OffersSheetQueries$ForSheetKeyQuery(instrumentQueries, new OfflineQueries$$ExternalSyntheticLambda0(instrumentQueries, s))), realProfileAliasRepository.ioContext)));
                    this.label = 1;
                    firstOrNull = FlowKt.firstOrNull(transformLatest, this);
                    if (firstOrNull == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    firstOrNull = obj;
                }
                List list = (List) firstOrNull;
                return list == null ? EmptyList.INSTANCE : list;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RealGooglePayer$createWallet$$inlined$filter$1 realGooglePayer$createWallet$$inlined$filter$1 = new RealGooglePayer$createWallet$$inlined$filter$1(((RealProfileManager) obj3).bitcoinDisplayUnits(), 9);
                this.label = 1;
                Object first = FlowKt.first(realGooglePayer$createWallet$$inlined$filter$1, this);
                return first == coroutineSingletons5 ? coroutineSingletons5 : first;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object access$performSync = RealProfileSyncer.access$performSync((RealProfileSyncer) obj3, this);
                    return access$performSync == coroutineSingletons6 ? coroutineSingletons6 : access$performSync;
                }
                if (i9 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                MetadataRepo metadataRepo = (MetadataRepo) obj3;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LibrarianService librarianService = (LibrarianService) metadataRepo.mMetadataList;
                    LegalDocumentsRequest legalDocumentsRequest = new LegalDocumentsRequest(((RealRegionProvider) metadataRepo.mEmojiCharArray).get(), ByteString.EMPTY);
                    this.label = 1;
                    legalDocuments = librarianService.legalDocuments(legalDocumentsRequest, this);
                    if (legalDocuments == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    legalDocuments = obj;
                }
                ApiResult apiResult3 = (ApiResult) legalDocuments;
                if (!(apiResult3 instanceof ApiResult.Success)) {
                    return apiResult3;
                }
                ((SessionQueries) metadataRepo.mTypeface).transactionWithWrapper(new InstrumentQueries$$ExternalSyntheticLambda0(5, metadataRepo, (LegalDocumentsResponse) ((ApiResult.Success) apiResult3).response));
                return apiResult3;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                FinishSetupTileBadgeCounter offlineConfig = ((RealAppConfigManager) ((RealTransferManager) obj3).appConfig).offlineConfig();
                this.label = 1;
                Object first2 = FlowKt.first(offlineConfig, this);
                return first2 == coroutineSingletons8 ? coroutineSingletons8 : first2;
            case 8:
                PaperMoneyDepositBarcodeExpiredPresenter paperMoneyDepositBarcodeExpiredPresenter = (PaperMoneyDepositBarcodeExpiredPresenter) obj3;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealCashDepositBarcodeManager realCashDepositBarcodeManager = paperMoneyDepositBarcodeExpiredPresenter.barcodeManager;
                    this.label = 1;
                    if (realCashDepositBarcodeManager.prefetch(this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                BetterNavigator.ScreenNavigator screenNavigator = paperMoneyDepositBarcodeExpiredPresenter.navigator;
                PaperMoneyDepositBarcodeFailedScreen paperMoneyDepositBarcodeFailedScreen = paperMoneyDepositBarcodeExpiredPresenter.args;
                screenNavigator.goTo(new PaperMoneyDepositBarcodeScreen(paperMoneyDepositBarcodeFailedScreen.paperCashDepositBlocker, PaperMoneyDepositBarcodeScreen.Origin.BARCODE_EXPIRATION, paperMoneyDepositBarcodeFailedScreen.blockersData));
                return Unit.INSTANCE;
            case 9:
                PaperMoneyDepositMapPresenter paperMoneyDepositMapPresenter = (PaperMoneyDepositMapPresenter) obj3;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    paperMoneyDepositMapPresenter.analytics.track(new PaperMoneyDepositViewMap(), null);
                    this.label = 1;
                    break;
                } else {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                RealCashDepositBarcodeManager realCashDepositBarcodeManager2 = paperMoneyDepositMapPresenter.barcodeManager;
                this.label = 2;
                break;
            case 10:
                PaperMoneyDepositOnboardingPresenter paperMoneyDepositOnboardingPresenter = (PaperMoneyDepositOnboardingPresenter) obj3;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    paperMoneyDepositOnboardingPresenter.analytics.track(new PaperMoneyDepositViewTutorial(), null);
                    KeyValue keyValue = paperMoneyDepositOnboardingPresenter.lastViewed;
                    Long l = new Long(paperMoneyDepositOnboardingPresenter.clock.millis());
                    this.label = 1;
                    if (keyValue.set(l, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                SwipeToLoadOnboardingPresenter swipeToLoadOnboardingPresenter = (SwipeToLoadOnboardingPresenter) obj3;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    KeyValue keyValue2 = swipeToLoadOnboardingPresenter.lastViewed;
                    Long l2 = new Long(swipeToLoadOnboardingPresenter.clock.millis());
                    this.label = 1;
                    if (keyValue2.set(l2, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                swipeToLoadOnboardingPresenter.analytics.track(new PaperMoneyDepositViewSwipeToLoadOnboarding(), null);
                return Unit.INSTANCE;
            case 12:
                DirectDepositSetupPresenter directDepositSetupPresenter = (DirectDepositSetupPresenter) obj3;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    directDepositSetupPresenter.analytics.track(new DirectDepositAccountTapStartManualSetup(), null);
                    if (directDepositSetupPresenter.manualDirectDepositSetupFlow) {
                        PostbankAppService postbankAppService = directDepositSetupPresenter.postbankAppService;
                        InitiateDirectDepositSetupFlowRequest initiateDirectDepositSetupFlowRequest = new InitiateDirectDepositSetupFlowRequest(ByteString.EMPTY);
                        this.label = 1;
                        initiateDirectDepositSetupFlow = postbankAppService.initiateDirectDepositSetupFlow(initiateDirectDepositSetupFlowRequest, this);
                        if (initiateDirectDepositSetupFlow == coroutineSingletons13) {
                            return coroutineSingletons13;
                        }
                    }
                    DirectDepositSetupPresenter.access$completeScenario(directDepositSetupPresenter, ClientScenario.GET_DIRECT_DEPOSIT_FORM);
                    return Unit.INSTANCE;
                }
                if (i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                initiateDirectDepositSetupFlow = obj;
                ApiResult apiResult4 = (ApiResult) initiateDirectDepositSetupFlow;
                ApiResult.Success success = apiResult4 instanceof ApiResult.Success ? (ApiResult.Success) apiResult4 : null;
                if (success != null && (initiateDirectDepositSetupFlowResponse = (InitiateDirectDepositSetupFlowResponse) success.response) != null) {
                    str = initiateDirectDepositSetupFlowResponse.client_route;
                }
                if (str != 0) {
                    RealRouter realRouter = directDepositSetupPresenter.router;
                    DirectDepositSetupScreen directDepositSetupScreen = directDepositSetupPresenter.args;
                    Screen screen = directDepositSetupScreen.exitScreen;
                    if (screen == null) {
                        screen = RealMoneyNavigatorHelper.moneyTabScreen();
                    }
                    realRouter.route(new RoutingParams(directDepositSetupScreen, null, screen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str);
                    return Unit.INSTANCE;
                }
                DirectDepositSetupPresenter.access$completeScenario(directDepositSetupPresenter, ClientScenario.GET_DIRECT_DEPOSIT_FORM);
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealEarnerAppletAvailabilityState realEarnerAppletAvailabilityState = (RealEarnerAppletAvailabilityState) ((CardStudioPresenter) obj3).navigator;
                    this.label = 1;
                    Object refreshAppletSyncState = realEarnerAppletAvailabilityState.refreshAppletSyncState(this);
                    if (refreshAppletSyncState != coroutineSingletons14) {
                        refreshAppletSyncState = Unit.INSTANCE;
                    }
                    if (refreshAppletSyncState == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (((RealEarnerAppletAvailabilityState) obj3).refreshAppletSyncState(this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                RealPayerRepository realPayerRepository = (RealPayerRepository) obj3;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaychecksAppService paychecksAppService = realPayerRepository.appService;
                    GetPayersForCustomerRequest getPayersForCustomerRequest = new GetPayersForCustomerRequest(ByteString.EMPTY);
                    this.label = 1;
                    payersForCustomer = paychecksAppService.getPayersForCustomer(getPayersForCustomerRequest, this);
                    if (payersForCustomer == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    payersForCustomer = obj;
                }
                ApiResult apiResult5 = (ApiResult) payersForCustomer;
                if (!(apiResult5 instanceof ApiResult.Success)) {
                    if (apiResult5 instanceof ApiResult.Failure) {
                        return new PayerResult.Failure();
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                GetPayersForCustomerResponse getPayersForCustomerResponse = (GetPayersForCustomerResponse) ((ApiResult.Success) apiResult5).response;
                List list2 = getPayersForCustomerResponse.tagged_payers;
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        List<com.squareup.protos.cash.paychecks.api.v1.CustomerInfo> list3 = getPayersForCustomerResponse.recent_senders;
                        ArrayList arrayList2 = new ArrayList();
                        for (com.squareup.protos.cash.paychecks.api.v1.CustomerInfo customerInfo3 : list3) {
                            String str2 = customerInfo3.customer_token;
                            if (str2 == null) {
                                customerInfo = null;
                            } else {
                                String str3 = customerInfo3.display_name;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                String str4 = customerInfo3.cashtag;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                customerInfo = new CustomerInfo(str2, str3, str4, customerInfo3.profile_photo_url);
                            }
                            if (customerInfo != null) {
                                arrayList2.add(customerInfo);
                            }
                        }
                        return new PayerResult.Success(new PayerCustomersResult(arrayList, arrayList2));
                    }
                    com.squareup.protos.cash.paychecks.api.v1.CustomerInfo customerInfo4 = (com.squareup.protos.cash.paychecks.api.v1.CustomerInfo) it.next();
                    String str5 = customerInfo4.customer_token;
                    if (str5 == null) {
                        customerInfo2 = null;
                    } else {
                        String str6 = customerInfo4.display_name;
                        if (str6 == null) {
                            str6 = "";
                        }
                        String str7 = customerInfo4.cashtag;
                        customerInfo2 = new CustomerInfo(str5, str6, str7 != null ? str7 : "", customerInfo4.profile_photo_url);
                    }
                    if (customerInfo2 != null) {
                        arrayList.add(customerInfo2);
                    }
                }
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivitiesManager activitiesManager = (ActivitiesManager) ((TransfersPresenter) obj3).args;
                    ActivitiesManager.LoadMode loadMode = ActivitiesManager.LoadMode.RELOAD_FIRST_PAGE;
                    this.label = 1;
                    if (activitiesManager.load(loadMode, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivitiesManager.LoadMode loadMode2 = ActivitiesManager.LoadMode.RELOAD_FIRST_PAGE;
                    this.label = 1;
                    if (((ActivitiesManager) obj3).load(loadMode2, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj3;
                Navigator navigator = (Navigator) disclosurePresenter.launcher;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AegisService aegisService = (AegisService) disclosurePresenter.blockersNavigator;
                    GetFamilyAccountSponsorRequest getFamilyAccountSponsorRequest = new GetFamilyAccountSponsorRequest();
                    this.label = 1;
                    familyAccountSponsor = aegisService.getFamilyAccountSponsor(getFamilyAccountSponsorRequest, this);
                    if (familyAccountSponsor == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    familyAccountSponsor = obj;
                }
                ApiResult apiResult6 = (ApiResult) familyAccountSponsor;
                GetFamilyAccountSponsorResponse getFamilyAccountSponsorResponse = (GetFamilyAccountSponsorResponse) (apiResult6 instanceof ApiResult.Success ? ((ApiResult.Success) apiResult6).response : null);
                Sponsor sponsor = getFamilyAccountSponsorResponse != null ? getFamilyAccountSponsorResponse.sponsor : null;
                SponsorshipState sponsorshipState = sponsor != null ? sponsor.status : null;
                SponsorshipState sponsorshipState2 = SponsorshipState.PENDING;
                if (sponsorshipState == sponsorshipState2 && Intrinsics.areEqual(getFamilyAccountSponsorResponse.is_sponsor_led, Boolean.TRUE)) {
                    navigator.goTo(new SponsorLedInviteScreen(sponsor));
                } else if ((sponsor != null ? sponsor.status : null) == sponsorshipState2 && Intrinsics.areEqual(getFamilyAccountSponsorResponse.is_sponsor_led, Boolean.FALSE)) {
                    navigator.goTo(new SponsorDetailScreen(sponsor));
                } else {
                    ((RealRouter) disclosurePresenter.args).route(new RoutingParams(new MoneyTabScreen(null), null, null, null, null, null, 510), "https://internal.cash.app/dl/flow/FAMILY_ACCOUNT_STATE%3Fparams%3DCAQaAA==");
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 != 0) {
                    if (i23 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RealDependentControlStatusManager realDependentControlStatusManager = (RealDependentControlStatusManager) obj3;
                SharedFlowImpl sharedFlowImpl = realDependentControlStatusManager.dependentControlsCache.statusUpdates;
                FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass4 = new FormCashtag.AnonymousClass8.AnonymousClass4(realDependentControlStatusManager, 12);
                this.label = 1;
                sharedFlowImpl.collect(new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(i3, anonymousClass4, realDependentControlStatusManager), this);
                return coroutineSingletons20;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealTargetEntityManager realTargetEntityManager = (RealTargetEntityManager) obj3;
                    Flow flow = realTargetEntityManager.signOut;
                    FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass42 = new FormCashtag.AnonymousClass8.AnonymousClass4(realTargetEntityManager, 13);
                    this.label = 1;
                    if (flow.collect(anonymousClass42, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 != 0) {
                    if (i25 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj3;
                SharedFlowImpl sharedFlowImpl2 = ((RealManagedAccountTransferManager) cardStudioPresenter.args).actions;
                FormCashtag.AnonymousClass8.AnonymousClass4 anonymousClass43 = new FormCashtag.AnonymousClass8.AnonymousClass4(cardStudioPresenter, i2);
                this.label = 1;
                sharedFlowImpl2.collect(anonymousClass43, this);
                return coroutineSingletons22;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) obj3;
                    RealBlockersHelper realBlockersHelper = (RealBlockersHelper) endAppLockPresenter.accountOutboundNavigator;
                    BlockersScreens.U13CelebrationBlockerScreen u13CelebrationBlockerScreen = (BlockersScreens.U13CelebrationBlockerScreen) endAppLockPresenter.appLockState;
                    BlockerAction blockerAction = u13CelebrationBlockerScreen.ctaButtonAction;
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(realBlockersHelper, blockerAction, u13CelebrationBlockerScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                DisabledClickableNode disabledClickableNode = (DisabledClickableNode) obj3;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PressInteraction.Press press = disabledClickableNode.pressInteraction;
                    if (press != null) {
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = disabledClickableNode.interactionSource;
                        PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                        this.label = 1;
                        if (mutableInteractionSourceImpl.emit(cancel, this) == coroutineSingletons24) {
                            return coroutineSingletons24;
                        }
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                disabledClickableNode.pressInteraction = null;
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (SelectSponsorPresenter.access$handleEnableContact((SelectSponsorPresenter) obj3, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj3;
                ModifiablePermissions modifiablePermissions = (ModifiablePermissions) localHomePresenter.tabContentPresenterFactory;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    shouldShowRequestPermissionRationale = modifiablePermissions.shouldShowRequestPermissionRationale(this);
                    break;
                } else {
                    if (i29 != 1) {
                        if (i29 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        shouldShowOverridePrompt = obj;
                        if (((Boolean) shouldShowOverridePrompt).booleanValue()) {
                            ((BetterNavigator.ScreenNavigator) localHomePresenter.navigator).goTo(new BlockersScreens.ReadContactsPermissionScreen());
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
            case 26:
                RealFeatureFlagManager realFeatureFlagManager2 = (RealFeatureFlagManager) obj3;
                StateFlowImpl stateFlowImpl = realFeatureFlagManager2.syncStatus;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Signal signal = realFeatureFlagManager2.signOutSignal;
                    Scene.AnonymousClass1 anonymousClass1 = new Scene.AnonymousClass1(realFeatureFlagManager2, (Continuation) str, i2);
                    this.label = 1;
                    until = StateFlowKt.until(signal, anonymousClass1, this);
                    if (until == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    until = obj;
                }
                ApiResult apiResult7 = (ApiResult) until;
                if (apiResult7 instanceof ApiResult.Success) {
                    ApiResult.Success success2 = (ApiResult.Success) apiResult7;
                    realFeatureFlagManager2.featureFlagQueries.transactionWithWrapper(new GLSceneScope$$ExternalSyntheticLambda10(6, realFeatureFlagManager2, success2));
                    BugsnagClient bugsnagClient = realFeatureFlagManager2.bugsnagClient;
                    do {
                        value2 = stateFlowImpl.getValue();
                    } while (!stateFlowImpl.compareAndSet(value2, RealFeatureFlagManager.SyncStatus.SUCCESS));
                    Timber.Forest.i("Feature flags updated", new Object[0]);
                    MetadataSection$AdditionalInfoSection metadataSection$AdditionalInfoSection = MetadataSection$AdditionalInfoSection.INSTANCE;
                    MetadataSection$AdditionalInfoSection.FeatureFlagSyncTimeKey featureFlagSyncTimeKey = MetadataSection$AdditionalInfoSection.FeatureFlagSyncTimeKey.INSTANCE;
                    String format2 = DateTimeFormatter.ISO_INSTANT.format(DimensionKt.now(realFeatureFlagManager2.clock));
                    format2.getClass();
                    bugsnagClient.addMetadata(metadataSection$AdditionalInfoSection, featureFlagSyncTimeKey, format2);
                    MetadataSection$UserSection metadataSection$UserSection = MetadataSection$UserSection.INSTANCE;
                    MetadataSection$UserSection.EmployeeKey employeeKey = MetadataSection$UserSection.EmployeeKey.INSTANCE;
                    List list4 = ((GetFeatureFlagsResponse) success2.response).feature_flags;
                    LaunchDarklyFeatureFlags$IsEmployee launchDarklyFeatureFlags$IsEmployee = LaunchDarklyFeatureFlags$IsEmployee.INSTANCE;
                    list4.getClass();
                    launchDarklyFeatureFlags$IsEmployee.getClass();
                    Iterator it2 = list4.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (Intrinsics.areEqual(((FeatureFlag) obj2).name, (String) launchDarklyFeatureFlags$IsEmployee.root)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    FeatureFlag featureFlag = (FeatureFlag) obj2;
                    if (featureFlag != null) {
                        Iterator it3 = launchDarklyFeatureFlags$IsEmployee.stack.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Object next2 = it3.next();
                                if (Intrinsics.areEqual(featureFlag.selected_option_value, ((FeatureFlag$Option) next2).getIdentifier())) {
                                    obj4 = next2;
                                }
                            }
                        }
                        featureFlag$Option = (FeatureFlag$Option) obj4;
                        break;
                    }
                    featureFlag$Option = (FeatureFlag$Option) launchDarklyFeatureFlags$IsEmployee.current;
                    bugsnagClient.addMetadata(metadataSection$UserSection, employeeKey, String.valueOf(Intrinsics.areEqual(((FeatureFlag$StringFeatureFlag$Value) featureFlag$Option).value, "IS_EMPLOYEE")));
                } else if (apiResult7 instanceof ApiResult.Failure) {
                    do {
                        value = stateFlowImpl.getValue();
                    } while (!stateFlowImpl.compareAndSet(value, RealFeatureFlagManager.SyncStatus.FAILURE));
                    Timber.Forest.e("Feature flags failed to update", new Object[0]);
                }
                return Unit.INSTANCE;
            case 27:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj3;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flowOn = FlowKt.flowOn(FlowKt.take(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(((RealIssuedCardManager) ((IssuedCardManager) localEditorialPresenter.clock)).getIssuedCardOrNull(), 24), 1), (CoroutineContext) localEditorialPresenter.screen);
                    InvestingHomeView$2$1 investingHomeView$2$1 = new InvestingHomeView$2$1(localEditorialPresenter, 3);
                    this.label = 1;
                    if (flowOn.collect(investingHomeView$2$1, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                DisclosurePresenter disclosurePresenter2 = (DisclosurePresenter) obj3;
                BlockersScreens.GooglePayCompleteProvisioningScreen googlePayCompleteProvisioningScreen = (BlockersScreens.GooglePayCompleteProvisioningScreen) disclosurePresenter2.args;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = (Analytics) disclosurePresenter2.analytics;
                    BlockersData blockersData = googlePayCompleteProvisioningScreen.blockersData;
                    AndroidStringManager androidStringManager = (AndroidStringManager) disclosurePresenter2.stringManager;
                    Scene.AnonymousClass1 anonymousClass12 = new Scene.AnonymousClass1(disclosurePresenter2, (Continuation) str, 21);
                    this.label = 1;
                    trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData, analytics, androidStringManager, this, null, anonymousClass12);
                    if (trackBlockerSubmissionAnalytics$default == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    trackBlockerSubmissionAnalytics$default = obj;
                }
                ApiResult apiResult8 = (ApiResult) trackBlockerSubmissionAnalytics$default;
                if (apiResult8 instanceof ApiResult.Failure) {
                    ((BlockerFlowListener) disclosurePresenter2.launcher).onFlowCancelled(googlePayCompleteProvisioningScreen.blockersData);
                    next = googlePayCompleteProvisioningScreen.blockersData.exitScreen;
                } else {
                    if (!(apiResult8 instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) disclosurePresenter2.blockersNavigator;
                    BlockersData copy$default = BlockersData.copy$default(googlePayCompleteProvisioningScreen.blockersData, null, null, null, null, null, null, new BlockersScreens.GooglePayProvisioningExitScreen(true), null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -65, 65535);
                    ResponseContext responseContext = ((CompleteDigitalWalletTokenProvisioningResponse) ((ApiResult.Success) apiResult8).response).response_context;
                    responseContext.getClass();
                    next = blockersDataNavigator.getNext(googlePayCompleteProvisioningScreen, copy$default.updateFromResponseContext(responseContext, false));
                }
                ((BetterNavigator.ScreenNavigator) disclosurePresenter2.navigator).goTo(next);
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.i("Updating location to compass on app launch", new Object[0]);
                    RealGpsLocationManager realGpsLocationManager = ((GpsLocationRefresher) obj3).gpsLocationManager;
                    GpsEventTrigger gpsEventTrigger = GpsEventTrigger.CARD_ACTIVATION;
                    String uuid = RealUuidGenerator.generate().toString();
                    uuid.getClass();
                    String concat = "GPS_EVENT_TRIGGER_APP_OPEN_".concat(uuid);
                    this.label = 1;
                    collectGpsLocation = realGpsLocationManager.collectGpsLocation("APP_OPEN", concat, (r13 & 4) == 0, (r13 & 8) == 0, this);
                    if (collectGpsLocation == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GooglePayPresenter$models$1$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
