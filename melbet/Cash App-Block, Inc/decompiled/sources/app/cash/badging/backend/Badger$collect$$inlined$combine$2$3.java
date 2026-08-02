package app.cash.badging.backend;

import androidx.compose.material3.DateInputKt$DateInputTextField$3;
import androidx.core.os.BundleKt;
import androidx.room.util.DBUtil;
import app.cash.badging.api.BadgingState;
import app.cash.local.backend.real.RealMarketingMessageRepository$getMarketingMessages$1;
import app.cash.local.worker.LocalActivitySetupTeardown;
import app.cash.local.worker.LocalActivitySetupTeardown$setup$job$1$1$1;
import app.cash.molecule.PlatformKt;
import app.cash.molecule.RecompositionMode;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.zipline.loader.FastCodeUpdatesKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.types.PrincipalAccountToken;
import com.squareup.cash.appforeground.AppForegroundState;
import com.squareup.cash.attribution.ActivityTransitionsSideEffectsPerformer;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.boost.backend.RealBoostRepository$getAllOrderedBoosts$$inlined$map$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.db2.profile.SingleAccountHolderEligibility;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.identityverification.backend.api.IdentityVerificationStatus;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationRepo;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationRepo$status$2$1;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.mri.android.MRIUseCase;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseCashCardRepository;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseCashCardRepository$prepurchaseAppletSyncData$$inlined$map$1;
import com.squareup.cash.support.backend.real.RealSupportPhoneVerificationMonitor$setup$1$1$1;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.treehouse.android.configuration.RealTreehouseConfigurationStore;
import com.squareup.cash.treehouse.android.configuration.TreehouseAppConfiguration;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.MainContainerDelegate;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.cash.wallet.db.CardTabHeroStateQueries$select$2;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.cash.wallet.presenters.RealCardAppletTileRepository;
import com.squareup.cash.wallet.presenters.RealCardAppletTileRepository$installedModelFlow$$inlined$combine$1$3;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.C4bEligibilityState;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.ui.IdentityHubState;
import com.squareup.util.coroutines.DerivedStateFlow;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.CombineKt;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class Badger$collect$$inlined$combine$2$3 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ Object receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Badger$collect$$inlined$combine$2$3(RealMRIFactory realMRIFactory, MRIUseCase mRIUseCase, Continuation continuation) {
        super(3, continuation);
        this.$r8$classId = 6;
        this.L$1 = realMRIFactory;
        this.receiver$inlined = mRIUseCase;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.receiver$inlined;
        switch (i) {
            case 0:
                Badger$collect$$inlined$combine$2$3 badger$collect$$inlined$combine$2$3 = new Badger$collect$$inlined$combine$2$3((Continuation) obj3, (Badger) obj4, 0);
                badger$collect$$inlined$combine$2$3.L$0 = (FlowCollector) obj;
                badger$collect$$inlined$combine$2$3.L$1 = (Object[]) obj2;
                return badger$collect$$inlined$combine$2$3.invokeSuspend(Unit.INSTANCE);
            case 1:
                Badger$collect$$inlined$combine$2$3 badger$collect$$inlined$combine$2$32 = new Badger$collect$$inlined$combine$2$3((Continuation) obj3, (LocalActivitySetupTeardown) obj4, 1);
                badger$collect$$inlined$combine$2$32.L$0 = (FlowCollector) obj;
                badger$collect$$inlined$combine$2$32.L$1 = obj2;
                return badger$collect$$inlined$combine$2$32.invokeSuspend(Unit.INSTANCE);
            case 2:
                Badger$collect$$inlined$combine$2$3 badger$collect$$inlined$combine$2$33 = new Badger$collect$$inlined$combine$2$3((Continuation) obj3, (RealFeatureEligibilityRepository) obj4, 2);
                badger$collect$$inlined$combine$2$33.L$0 = (FlowCollector) obj;
                badger$collect$$inlined$combine$2$33.L$1 = obj2;
                return badger$collect$$inlined$combine$2$33.invokeSuspend(Unit.INSTANCE);
            case 3:
                Badger$collect$$inlined$combine$2$3 badger$collect$$inlined$combine$2$34 = new Badger$collect$$inlined$combine$2$3((Continuation) obj3, (RealFamilyProfileManager) obj4, 3);
                badger$collect$$inlined$combine$2$34.L$0 = (FlowCollector) obj;
                badger$collect$$inlined$combine$2$34.L$1 = obj2;
                return badger$collect$$inlined$combine$2$34.invokeSuspend(Unit.INSTANCE);
            case 4:
                Badger$collect$$inlined$combine$2$3 badger$collect$$inlined$combine$2$35 = new Badger$collect$$inlined$combine$2$3((Continuation) obj3, (RealIdentityVerificationRepo) obj4, 4);
                badger$collect$$inlined$combine$2$35.L$0 = (FlowCollector) obj;
                badger$collect$$inlined$combine$2$35.L$1 = obj2;
                return badger$collect$$inlined$combine$2$35.invokeSuspend(Unit.INSTANCE);
            case 5:
                Badger$collect$$inlined$combine$2$3 badger$collect$$inlined$combine$2$36 = new Badger$collect$$inlined$combine$2$3((Continuation) obj3, (RealEntityPriceRefresher) obj4, 5);
                badger$collect$$inlined$combine$2$36.L$0 = (FlowCollector) obj;
                badger$collect$$inlined$combine$2$36.L$1 = obj2;
                return badger$collect$$inlined$combine$2$36.invokeSuspend(Unit.INSTANCE);
            case 6:
                int intValue = ((Number) obj2).intValue();
                Badger$collect$$inlined$combine$2$3 badger$collect$$inlined$combine$2$37 = new Badger$collect$$inlined$combine$2$3((RealMRIFactory) this.L$1, (MRIUseCase) obj4, (Continuation) obj3);
                badger$collect$$inlined$combine$2$37.L$0 = (Throwable) obj;
                badger$collect$$inlined$combine$2$37.label = intValue;
                return badger$collect$$inlined$combine$2$37.invokeSuspend(Unit.INSTANCE);
            case 7:
                Badger$collect$$inlined$combine$2$3 badger$collect$$inlined$combine$2$38 = new Badger$collect$$inlined$combine$2$3((Continuation) obj3, (ActivityTransitionsSideEffectsPerformer) obj4, 7);
                badger$collect$$inlined$combine$2$38.L$0 = (FlowCollector) obj;
                badger$collect$$inlined$combine$2$38.L$1 = obj2;
                return badger$collect$$inlined$combine$2$38.invokeSuspend(Unit.INSTANCE);
            case 8:
                Badger$collect$$inlined$combine$2$3 badger$collect$$inlined$combine$2$39 = new Badger$collect$$inlined$combine$2$3((Continuation) obj3, (RealTreehouseConfigurationStore) obj4, 8);
                badger$collect$$inlined$combine$2$39.L$0 = (FlowCollector) obj;
                badger$collect$$inlined$combine$2$39.L$1 = obj2;
                return badger$collect$$inlined$combine$2$39.invokeSuspend(Unit.INSTANCE);
            case 9:
                Badger$collect$$inlined$combine$2$3 badger$collect$$inlined$combine$2$310 = new Badger$collect$$inlined$combine$2$3((Continuation) obj3, (MainContainerDelegate) obj4, 9);
                badger$collect$$inlined$combine$2$310.L$0 = (FlowCollector) obj;
                badger$collect$$inlined$combine$2$310.L$1 = obj2;
                return badger$collect$$inlined$combine$2$310.invokeSuspend(Unit.INSTANCE);
            case 10:
                Badger$collect$$inlined$combine$2$3 badger$collect$$inlined$combine$2$311 = new Badger$collect$$inlined$combine$2$3((Continuation) obj3, (RealCardAppletTileRepository) obj4, 10);
                badger$collect$$inlined$combine$2$311.L$0 = (FlowCollector) obj;
                badger$collect$$inlined$combine$2$311.L$1 = obj2;
                return badger$collect$$inlined$combine$2$311.invokeSuspend(Unit.INSTANCE);
            case 11:
                Badger$collect$$inlined$combine$2$3 badger$collect$$inlined$combine$2$312 = new Badger$collect$$inlined$combine$2$3((Continuation) obj3, (DerivedStateFlow) obj4, 11);
                badger$collect$$inlined$combine$2$312.L$0 = (FlowCollector) obj;
                badger$collect$$inlined$combine$2$312.L$1 = obj2;
                return badger$collect$$inlined$combine$2$312.invokeSuspend(Unit.INSTANCE);
            default:
                Badger$collect$$inlined$combine$2$3 badger$collect$$inlined$combine$2$313 = new Badger$collect$$inlined$combine$2$3((Continuation) obj3, (RealSupportPhoneVerificationMonitor$setup$1$1$1) obj4, 12);
                badger$collect$$inlined$combine$2$313.L$0 = (FlowCollector) obj;
                badger$collect$$inlined$combine$2$313.L$1 = (Object[]) obj2;
                return badger$collect$$inlined$combine$2$313.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i;
        Flow flow;
        Flow appLockMonitor$special$$inlined$map$2;
        int i2 = this.$r8$classId;
        int i3 = 10;
        Flow flow2 = EmptyFlow.INSTANCE;
        int i4 = 19;
        int i5 = 0;
        Object obj3 = this.receiver$inlined;
        int i6 = 1;
        Object obj4 = null;
        switch (i2) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    Object obj5 = objArr[0];
                    Object obj6 = objArr[1];
                    Object obj7 = objArr[2];
                    Object obj8 = objArr[3];
                    Object obj9 = objArr[4];
                    Object obj10 = objArr[5];
                    Object obj11 = objArr[6];
                    Object obj12 = objArr[7];
                    Object obj13 = objArr[8];
                    Object obj14 = objArr[9];
                    Object obj15 = objArr[10];
                    Object obj16 = objArr[11];
                    Object obj17 = objArr[12];
                    Object obj18 = objArr[13];
                    Object obj19 = objArr[14];
                    long longValue = ((Number) objArr[15]).longValue();
                    boolean booleanValue = ((Boolean) obj19).booleanValue();
                    boolean booleanValue2 = ((Boolean) obj18).booleanValue();
                    boolean booleanValue3 = ((Boolean) obj17).booleanValue();
                    boolean booleanValue4 = ((Boolean) obj16).booleanValue();
                    boolean booleanValue5 = ((Boolean) obj15).booleanValue();
                    long longValue2 = ((Number) obj14).longValue();
                    long longValue3 = ((Number) obj13).longValue();
                    long longValue4 = ((Number) obj12).longValue();
                    long longValue5 = ((Number) obj11).longValue();
                    long longValue6 = ((Number) obj10).longValue();
                    long longValue7 = ((Number) obj9).longValue();
                    long longValue8 = ((Number) obj8).longValue();
                    long longValue9 = ((Number) obj7).longValue();
                    long longValue10 = ((Number) obj6).longValue();
                    BadgingState badgingState = new BadgingState(((Number) obj5).longValue(), longValue10 + longValue9 + longValue, longValue8, longValue7, longValue6, longValue5, booleanValue5 ? 1L : 0L, longValue4, booleanValue4 ? 1L : 0L, booleanValue3 ? 1L : 0L, booleanValue2 ? 1L : 0L, longValue3, longValue2, booleanValue ? 1L : 0L);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (flowCollector.emit(badgingState, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                LocalActivitySetupTeardown localActivitySetupTeardown = (LocalActivitySetupTeardown) obj3;
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                Object obj20 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((AppForegroundState) obj20) != AppForegroundState.FOREGROUND) {
                        i = 1;
                        obj2 = null;
                        flow = flow2;
                    } else {
                        obj2 = null;
                        i = 1;
                        flow = FlowKt.take(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(localActivitySetupTeardown.syncValueReader.getSingleValue(AndroidSyncValueSpecs.LocalAccount), PlatformKt.getOnAuthenticated(localActivitySetupTeardown.sessionManager), new LocalActivitySetupTeardown$setup$job$1$1$1(3, null), i5), 24), 1);
                    }
                    this.L$0 = obj2;
                    this.L$1 = obj2;
                    this.label = i;
                    if (FlowKt.emitAll(flowCollector2, flow, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) obj3;
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                Object obj21 = this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = (String) obj21;
                    SafeFlow flow3 = DBUtil.toFlow(realFeatureEligibilityRepository.eligibilityQueries.eligibility(str));
                    C4bEligibilityState c4bEligibilityState = new C4bEligibilityState(Boolean.TRUE);
                    Boolean bool = Boolean.FALSE;
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(DBUtil.mapToOneOrDefault(flow3, new SingleAccountHolderEligibility(str, 0L, c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, new C4bEligibilityState(bool), c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, c4bEligibilityState, new C4bEligibilityState(bool), new C4bEligibilityState(bool), new C4bEligibilityState(bool), c4bEligibilityState, c4bEligibilityState, new C4bEligibilityState(bool), new C4bEligibilityState(bool), new C4bEligibilityState(bool), new C4bEligibilityState(bool)), realFeatureEligibilityRepository.ioDispatcher));
                    RealAppConfigManager$update$2$2 realAppConfigManager$update$2$2 = new RealAppConfigManager$update$2$2(realFeatureEligibilityRepository, null, 27);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector3);
                    Object collect = distinctUntilChanged.collect(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2(flowCollector3, realAppConfigManager$update$2$2, 1), this);
                    if (collect != coroutineSingletons3) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != coroutineSingletons3) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons3) {
                        break;
                    }
                } else if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                Object obj22 = this.L$1;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PrincipalAccountToken principalAccountToken = (PrincipalAccountToken) obj22;
                    Flow realGooglePayer$createWallet$$inlined$filter$1 = principalAccountToken instanceof PrincipalAccountToken.Some ? new RealGooglePayer$createWallet$$inlined$filter$1(((RealFamilyProfileManager) obj3).customerStore.getCustomerForId(((PrincipalAccountToken.Some) principalAccountToken).accountToken), 21) : new AppLockMonitor$special$$inlined$map$2(obj4, i4);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector4, realGooglePayer$createWallet$$inlined$filter$1, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                FlowCollector flowCollector5 = (FlowCollector) this.L$0;
                Object obj23 = this.L$1;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow singleValueOrDefault = ((Boolean) obj23).booleanValue() ? ((RealIdentityVerificationRepo) obj3).syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.IdentityHubState, new IdentityVerificationStatus(true, IdentityHubState.EntrypointStatus.VERIFY, 0L), RealIdentityVerificationRepo$status$2$1.INSTANCE) : new AppLockMonitor$special$$inlined$map$2(obj4, i4);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector5, singleValueOrDefault, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                FlowCollector flowCollector6 = (FlowCollector) this.L$0;
                Object obj24 = this.L$1;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list = (List) obj24;
                    Flow flow4 = flow2;
                    if (!list.isEmpty()) {
                        RealEntityPriceRefresher realEntityPriceRefresher = (RealEntityPriceRefresher) obj3;
                        flow4 = new RealActivityInvitePresenter(17, realEntityPriceRefresher.tickerFlow, realEntityPriceRefresher, list);
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector6, flow4, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                Throwable th = (Throwable) this.L$0;
                int i13 = this.label;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((RealMRIFactory) this.L$1).errorReporter.report(new RealMRIFactory.MRIFactoryError(th, "buildMRIContext", i13, i13 == 3, (MRIUseCase) obj3), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                break;
            case 7:
                FlowCollector flowCollector7 = (FlowCollector) this.L$0;
                Object obj25 = this.L$1;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = flow2;
                    if (((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) obj25).enabled()) {
                        flow5 = FlowKt.drop(FlowKt.distinctUntilChanged(((RealInstrumentManager) ((ActivityTransitionsSideEffectsPerformer) obj3).appsFlyerClient).forTypes(CashInstrumentType.DEBIT_CARD)), 1);
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector7, flow5, this) == coroutineSingletons8) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 8:
                FlowCollector flowCollector8 = (FlowCollector) this.L$0;
                Object obj26 = this.L$1;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TreehouseAppConfiguration treehouseAppConfiguration = (TreehouseAppConfiguration) obj26;
                    Flow flow6 = flow2;
                    if (treehouseAppConfiguration.getManifestUrl() != null) {
                        AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(String.valueOf(treehouseAppConfiguration.getManifestUrl()), i4);
                        flow6 = appLockMonitor$special$$inlined$map$22;
                        if (RealTreehouseConfigurationStore.WhenMappings.$EnumSwitchMapping$0[treehouseAppConfiguration.getEndpointType().ordinal()] == 1) {
                            flow6 = FastCodeUpdatesKt.m1429withDevelopmentServerPushSxA4cEA$default(appLockMonitor$special$$inlined$map$22, ((RealTreehouseConfigurationStore) obj3).ziplineHttpClient);
                        }
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector8, flow6, this) == coroutineSingletons9) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 9:
                FlowCollector flowCollector9 = (FlowCollector) this.L$0;
                Object obj27 = this.L$1;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) obj27).booleanValue()) {
                        RecompositionMode recompositionMode = RecompositionMode.ContextClock;
                        appLockMonitor$special$$inlined$map$2 = BundleKt.moleculeFlow$default(new DateInputKt$DateInputTextField$3((MainContainerDelegate) obj3, i3));
                    } else {
                        appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(new TabToolbarInternalViewModel(null, 31), i4);
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector9, appLockMonitor$special$$inlined$map$2, this) == coroutineSingletons10) {
                        break;
                    }
                } else if (i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 10:
                FlowCollector flowCollector10 = (FlowCollector) this.L$0;
                Object obj28 = this.L$1;
                Object obj29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealCardAppletTileRepository realCardAppletTileRepository = (RealCardAppletTileRepository) obj3;
                    StateFlow stateFlow = realCardAppletTileRepository.cardScheme;
                    RealBoostRepository realBoostRepository = realCardAppletTileRepository.boostRepository;
                    Flow distinctUntilChanged2 = FlowKt.distinctUntilChanged(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realBoostRepository.getSelectedBoostTokens(), FlowKt.distinctUntilChanged(new RealBoostRepository$getAllOrderedBoosts$$inlined$map$1(realBoostRepository.boostProvider.getCategorizedBoosts(), i5)), new RealMarketingMessageRepository$getMarketingMessages$1(), i5));
                    RealDrawerOpener$getDrawerScreen$$inlined$map$1 realDrawerOpener$getDrawerScreen$$inlined$map$1 = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(realCardAppletTileRepository.profileManager.publicProfile(), 28);
                    GpsConfigQueries gpsConfigQueries = realCardAppletTileRepository.heroCardStateQueries;
                    gpsConfigQueries.getClass();
                    CardTabHeroStateQueries$select$2 cardTabHeroStateQueries$select$2 = CardTabHeroStateQueries$select$2.INSTANCE;
                    SqlDriver sqlDriver = gpsConfigQueries.driver;
                    AlertBannerKt$$ExternalSyntheticLambda3 alertBannerKt$$ExternalSyntheticLambda3 = new AlertBannerKt$$ExternalSyntheticLambda3(gpsConfigQueries);
                    sqlDriver.getClass();
                    FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull = DBUtil.mapToOneOrNull(DBUtil.toFlow(new SimpleQuery(-1944971947, new String[]{"cardTabHeroState"}, sqlDriver, "CardTabHeroState.sq", "select", "SELECT cardTabHeroState._id, cardTabHeroState.card_token, cardTabHeroState.rendering_info, cardTabHeroState.facing_forward, cardTabHeroState.enabled FROM cardTabHeroState WHERE _id = 1", alertBannerKt$$ExternalSyntheticLambda3)), realCardAppletTileRepository.ioDispatcher);
                    MoneyTabPresenter$models$lambda$17$$inlined$map$1 issuedCardState = ((RealIssuedCardManager) realCardAppletTileRepository.issuedCardManager).getIssuedCardState();
                    RealPrepurchaseCashCardRepository realPrepurchaseCashCardRepository = realCardAppletTileRepository.prepurchaseCashCardRepository;
                    final Flow[] flowArr = {stateFlow, distinctUntilChanged2, realDrawerOpener$getDrawerScreen$$inlined$map$1, mapToOneOrNull, issuedCardState, new RealPrepurchaseCashCardRepository$prepurchaseAppletSyncData$$inlined$map$1(realPrepurchaseCashCardRepository.syncValueReader.getSingleValue(AndroidSyncValueSpecs.PrepurchaseCashCardData), realPrepurchaseCashCardRepository, i6)};
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector10);
                    Object combineInternal = CombineKt.combineInternal(this, new Function0(flowArr) { // from class: com.squareup.cash.wallet.presenters.RealCardAppletTileRepository$installedModelFlow$$inlined$combine$1$2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return new Object[6];
                        }
                    }, new RealCardAppletTileRepository$installedModelFlow$$inlined$combine$1$3(null, realCardAppletTileRepository, (IssuedCardFactory.IssuedCard) obj28), flowCollector10, flowArr);
                    if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        combineInternal = Unit.INSTANCE;
                    }
                    if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        combineInternal = Unit.INSTANCE;
                    }
                    if (combineInternal == obj29) {
                        break;
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 11:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector11 = (FlowCollector) this.L$0;
                    Object obj30 = ((Map) ((DerivedStateFlow) obj3).getValue).get(this.L$1);
                    obj30.getClass();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector11, (Flow) obj30, this) == coroutineSingletons11) {
                        break;
                    }
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                FlowCollector flowCollector12 = (FlowCollector) this.L$0;
                Object[] objArr2 = (Object[]) this.L$1;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object obj31 = objArr2[0];
                    Object obj32 = objArr2[1];
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (((RealSupportPhoneVerificationMonitor$setup$1$1$1) obj3).invoke(flowCollector12, obj31, obj32, this) == coroutineSingletons12) {
                        break;
                    }
                } else if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Badger$collect$$inlined$combine$2$3(Continuation continuation, Object obj, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.receiver$inlined = obj;
    }
}
