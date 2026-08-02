package com.squareup.cash.savings.applets.presenters;

import androidx.core.text.TextUtilsCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.MotionEventCompat;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.presenters.settings.ShoppingSetting$isFeatureEligible$$inlined$map$1;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.views.SelectPaymentPlanViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.savings.applets.presenters.SavingsRepositoryModel;
import com.squareup.cash.savings.backend.api.model.SavingsAction;
import com.squareup.cash.savings.backend.real.SyncValuesBasedSavingsBalanceStore;
import com.squareup.cash.savings.views.CelebrationKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$1$5;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider$getPasscode$1;
import com.squareup.protos.cash.piggybank.appapi.PiggybankAppService;
import com.squareup.protos.cash.piggybank.appapi.RefreshSavingsAppletRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.savings.SavingsApplet;
import squareup.cash.savings.VersionedSavingsFolders;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealSavingsAppletTileRepository implements HasObservability {
    public final StateFlow allFolders;
    public final DerivedStateFlow availabilityState;
    public final RealClientRouteParser clientRouteParser;
    public final ErrorReporter errorReporter;
    public final CoroutineContext ioDispatcher;
    public final ReadonlyStateFlow isC4BAccountFlow;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final ReadonlyStateFlow savingsBalanceState;
    public final FlowKt__MergeKt$flatMapConcat$$inlined$map$1 savingsConfigState;
    public final ReadonlyStateFlow savingsModelState;
    public final PiggybankAppService service;
    public final AndroidStringManager stringManager;
    public final DerivedStateFlow uninstallationSectionId;

    public RealSavingsAppletTileRepository(SyncValueReader syncValueReader, RealFeatureEligibilityRepository realFeatureEligibilityRepository, SyncValuesBasedSavingsBalanceStore syncValuesBasedSavingsBalanceStore, PiggybankAppService piggybankAppService, AndroidStringManager androidStringManager, RealClientRouteParser realClientRouteParser, ErrorReporter errorReporter, SampleStrategy sampleStrategy, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.service = piggybankAppService;
        this.stringManager = androidStringManager;
        this.clientRouteParser = realClientRouteParser;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.ioDispatcher = coroutineContext;
        final int i = 0;
        DerivedStateFlow mapState = StateFlowKt.mapState(syncValueReader.getSingleValue(AndroidSyncValueSpecs.SavingsApplet), new Function1(this) { // from class: com.squareup.cash.savings.applets.presenters.RealSavingsAppletTileRepository$$ExternalSyntheticLambda0
            public final /* synthetic */ RealSavingsAppletTileRepository f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                RealSavingsAppletTileRepository realSavingsAppletTileRepository = this.f$0;
                switch (i2) {
                    case 0:
                        SavingsApplet savingsApplet = (SavingsApplet) obj;
                        if (savingsApplet != null) {
                            return KeyEventDispatcher.toSavingsApplet(realSavingsAppletTileRepository, savingsApplet);
                        }
                        return null;
                    default:
                        VersionedSavingsFolders versionedSavingsFolders = (VersionedSavingsFolders) obj;
                        versionedSavingsFolders.getClass();
                        return MotionEventCompat.toSavingsFolders(realSavingsAppletTileRepository, versionedSavingsFolders);
                }
            }
        });
        int i2 = 5;
        int i3 = 2;
        Continuation continuation = null;
        this.savingsConfigState = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealTabProvider$setup$1$5(i3, continuation, i2), new RealRecipientRepository$suggestions$$inlined$map$1(syncValueReader.getSingleValue(AndroidSyncValueSpecs.SavingsConfig), i2));
        MoneyTabPresenter$models$lambda$17$$inlined$map$1 moneyTabPresenter$models$lambda$17$$inlined$map$1 = new MoneyTabPresenter$models$lambda$17$$inlined$map$1(syncValuesBasedSavingsBalanceStore.get(), 3);
        StartedWhileSubscribed WhileSubscribed$default = SharingStarted.Companion.WhileSubscribed$default();
        Boolean bool = Boolean.FALSE;
        final int i4 = 1;
        ReadonlyStateFlow stateIn = FlowKt.stateIn(moneyTabPresenter$models$lambda$17$$inlined$map$1, coroutineScope, WhileSubscribed$default, new SavingsRepositoryModel.SavingsBalanceState(null, bool, true));
        this.savingsBalanceState = stateIn;
        this.allFolders = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.VersionedSavingsFolders, null, new Function1(this) { // from class: com.squareup.cash.savings.applets.presenters.RealSavingsAppletTileRepository$$ExternalSyntheticLambda0
            public final /* synthetic */ RealSavingsAppletTileRepository f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i4;
                RealSavingsAppletTileRepository realSavingsAppletTileRepository = this.f$0;
                switch (i22) {
                    case 0:
                        SavingsApplet savingsApplet = (SavingsApplet) obj;
                        if (savingsApplet != null) {
                            return KeyEventDispatcher.toSavingsApplet(realSavingsAppletTileRepository, savingsApplet);
                        }
                        return null;
                    default:
                        VersionedSavingsFolders versionedSavingsFolders = (VersionedSavingsFolders) obj;
                        versionedSavingsFolders.getClass();
                        return MotionEventCompat.toSavingsFolders(realSavingsAppletTileRepository, versionedSavingsFolders);
                }
            }
        });
        ReadonlyStateFlow stateIn2 = FlowKt.stateIn(new ShoppingSetting$isFeatureEligible$$inlined$map$1(realFeatureEligibilityRepository.currentEligibleFeatures(), i3), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(), bool);
        this.isC4BAccountFlow = stateIn2;
        JobKt.launch$default(coroutineScope, coroutineContext, null, new ShoppingWebBridge.AnonymousClass1(this, continuation, 16), 2);
        this.availabilityState = StateFlowKt.combineState(mapState, stateIn, new SelectPaymentPlanViewKt$$ExternalSyntheticLambda10(25));
        this.uninstallationSectionId = StateFlowKt.mapState(stateIn2, new CelebrationKt$$ExternalSyntheticLambda1(13));
        this.savingsModelState = FlowKt.stateIn(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new FinishSetupTileBadgeCounter(21, FlowKt.transformLatest(mapState, new RealPasscodeProvider$getPasscode$1(continuation, this, 6)), new RealPasscodeProvider$getPasscode$1(this, continuation, i2)), 24), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r10 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        if (r10 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$action(RealSavingsAppletTileRepository realSavingsAppletTileRepository, com.squareup.cash.savings.backend.api.model.SavingsApplet savingsApplet, ContinuationImpl continuationImpl) {
        RealSavingsAppletTileRepository$action$1 realSavingsAppletTileRepository$action$1;
        int i;
        ClientRoute clientRoute;
        CoroutineContext coroutineContext = realSavingsAppletTileRepository.ioDispatcher;
        if (continuationImpl instanceof RealSavingsAppletTileRepository$action$1) {
            realSavingsAppletTileRepository$action$1 = (RealSavingsAppletTileRepository$action$1) continuationImpl;
            int i2 = realSavingsAppletTileRepository$action$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSavingsAppletTileRepository$action$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSavingsAppletTileRepository$action$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSavingsAppletTileRepository$action$1.label;
                int i3 = 6;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SavingsAction savingsAction = savingsApplet.action;
                    if (savingsAction != null) {
                        realSavingsAppletTileRepository$action$1.label = 1;
                        obj = JobKt.withContext(coroutineContext, new ProfileCropView.AnonymousClass3(savingsAction, realSavingsAppletTileRepository, continuation, i3), realSavingsAppletTileRepository$action$1);
                    }
                    realSavingsAppletTileRepository$action$1.label = 2;
                    obj = JobKt.withContext(coroutineContext, new ProfileCropView.AnonymousClass3(continuation, realSavingsAppletTileRepository, continuation, i3), realSavingsAppletTileRepository$action$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        ClientRoute clientRoute2 = (ClientRoute) obj;
                        return clientRoute2 == null ? new ClientRoute.ViewSavingsHome() : clientRoute2;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                clientRoute = (ClientRoute) obj;
                if (clientRoute != null) {
                    return clientRoute;
                }
                realSavingsAppletTileRepository$action$1.label = 2;
                obj = JobKt.withContext(coroutineContext, new ProfileCropView.AnonymousClass3(continuation, realSavingsAppletTileRepository, continuation, i3), realSavingsAppletTileRepository$action$1);
            }
        }
        realSavingsAppletTileRepository$action$1 = new RealSavingsAppletTileRepository$action$1(realSavingsAppletTileRepository, continuationImpl);
        Object obj2 = realSavingsAppletTileRepository$action$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSavingsAppletTileRepository$action$1.label;
        int i32 = 6;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        clientRoute = (ClientRoute) obj2;
        if (clientRoute != null) {
        }
        realSavingsAppletTileRepository$action$1.label = 2;
        obj2 = JobKt.withContext(coroutineContext, new ProfileCropView.AnonymousClass3(continuation2, realSavingsAppletTileRepository, continuation2, i32), realSavingsAppletTileRepository$action$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$refreshApplet(RealSavingsAppletTileRepository realSavingsAppletTileRepository, ContinuationImpl continuationImpl) {
        RealSavingsAppletTileRepository$refreshApplet$1 realSavingsAppletTileRepository$refreshApplet$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealSavingsAppletTileRepository$refreshApplet$1) {
            realSavingsAppletTileRepository$refreshApplet$1 = (RealSavingsAppletTileRepository$refreshApplet$1) continuationImpl;
            int i2 = realSavingsAppletTileRepository$refreshApplet$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSavingsAppletTileRepository$refreshApplet$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSavingsAppletTileRepository$refreshApplet$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSavingsAppletTileRepository$refreshApplet$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RefreshSavingsAppletRequest refreshSavingsAppletRequest = new RefreshSavingsAppletRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), 2);
                    PiggybankAppService piggybankAppService = realSavingsAppletTileRepository.service;
                    realSavingsAppletTileRepository$refreshApplet$1.label = 1;
                    obj = piggybankAppService.refreshSavingsApplet(refreshSavingsAppletRequest, realSavingsAppletTileRepository$refreshApplet$1);
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
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    Timber.Forest.d("Successfully refreshed Savings Applet", new Object[0]);
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.w("Failed to refresh Savings Applet: " + TextUtilsCompat.errorMessaging(realSavingsAppletTileRepository.stringManager, (ApiResult.Failure) apiResult, null), new Object[0]);
                }
                return Unit.INSTANCE;
            }
        }
        realSavingsAppletTileRepository$refreshApplet$1 = new RealSavingsAppletTileRepository$refreshApplet$1(realSavingsAppletTileRepository, continuationImpl);
        Object obj2 = realSavingsAppletTileRepository$refreshApplet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSavingsAppletTileRepository$refreshApplet$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }
}
