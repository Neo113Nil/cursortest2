package com.squareup.cash.data.blockers;

import android.graphics.Bitmap;
import android.os.Parcelable;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1;
import androidx.compose.material3.DatePickerKt$updateDisplayedMonth$3;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.worker.LocalActivitySetupTeardown;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.filament.Texture;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.blockers.analytics.BlockerFlowAnalyticsHelperKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.borrow.presenters.BorrowHomeAmountPickerPresenter;
import com.squareup.cash.bugreporting.viewmodels.BugReport;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardPreviewPresenter;
import com.squareup.cash.card.onboarding.CardPreviewPresenter$models$2$4;
import com.squareup.cash.card.onboarding.CardPreviewViewModel;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardTextureState;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.card.onboarding.RealStyledCardPresenter;
import com.squareup.cash.card.onboarding.RealStyledCardPresenter$Factory$Impl;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.card.onboarding.StyledCardWidgetViewModel;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryState;
import com.squareup.cash.card.onboarding.graphics.HeartEffectKt$HeartEffect$6$1$2;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.MiniCardEffectKt$MiniCardEffect$6$1$2;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.WandEffectKt$WandEffect$6$1$2;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.card.onboarding.screens.CardPreviewScreen;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractSkipBlocker;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda15;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.routers.payments.PaymentRouter;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.persistence.RealClientSyncTransactor$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.syncer.ClientSyncer$Result;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.composeUi.foundation.text.PressGestureScopeImpl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.deposits.physical.presenter.atm.AtmWithdrawalMapPresenter;
import com.squareup.cash.deposits.physical.screens.AddressResult;
import com.squareup.cash.deposits.physical.screens.NoAddressResult;
import com.squareup.cash.deposits.physical.screens.SelectedRecentAddressResult;
import com.squareup.cash.deposits.physical.screens.SelectedSearchAddressResult;
import com.squareup.cash.exchangedata.real.RealFxExchangeRateStreamingSubscriber;
import com.squareup.cash.family.familyhub.backend.api.DependentBalance;
import com.squareup.cash.family.familyhub.backend.api.FamilyParsingErrorFactory;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore;
import com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter;
import com.squareup.cash.family.familyhub.presenters.DependentSavingsScreenPresenter;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.family.familyhub.views.WalletMetrics;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.fidesmo.api.FidesmoDeviceState;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter;
import com.squareup.cash.fidesmo.screens.FidesmoFlowType;
import com.squareup.cash.fidesmo.screens.FidesmoProvisioningScreen;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.formview.components.FormCustomizedCardView;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.maps.presenter.CashMapPresenter;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.payments.presenters.NearbyPayRequestPresenter$models$10$1$1$1;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.recipients.backend.real.RealRecipientFinder;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.protos.cash.aegis.client_routes.SendMoneyParams;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.portfolios.BalanceHistory;
import com.squareup.protos.cash.portfolios.BalanceTick;
import com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataRequest;
import com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataResponse;
import com.squareup.protos.cash.portfolios.PortfoliosService;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CardPresentationStyle;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.ResolveMergeResponse;
import com.squareup.protos.franklin.app.SetCardCustomizationRequest;
import com.squareup.protos.franklin.app.SetCardCustomizationResponse;
import com.squareup.protos.franklin.app.SkipBlockerRequest;
import com.squareup.protos.franklin.app.SkipBlockerResponse;
import com.squareup.protos.franklin.cards.CardCustomizationData;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.lending.InitiateLoanData;
import com.squareup.util.android.StringsKt;
import com.squareup.wire.ProtoAdapter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.Mutex;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealBlockersHelper$skipBlocker$1 extends SuspendLambda implements Function2 {
    public Object $blockersData;
    public final /* synthetic */ Object $clientScenario;
    public final /* synthetic */ Object $currentScreen;
    public final /* synthetic */ int $r8$classId;
    public Object L$0;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBlockersHelper$skipBlocker$1(RealBlockersHelper realBlockersHelper, BlockersData blockersData, BlockersScreens blockersScreens, ClientScenario clientScenario, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 15;
        this.this$0 = realBlockersHelper;
        this.$blockersData = blockersData;
        this.$currentScreen = blockersScreens;
        this.$clientScenario = clientScenario;
    }

    private final Object invokeSuspend$com$squareup$cash$family$familyhub$presenters$DependentSavingsScreenPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.this$0;
            NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$1 = new NearbyPayRequestPresenter$models$10$1$1$1((Object) coroutineScope, (MoleculePresenter) this.$blockersData, (MutableState) this.$clientScenario, (State) this.$currentScreen, 4);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(nearbyPayRequestPresenter$models$10$1$1$1, this) == coroutineSingletons) {
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

    private final Object invokeSuspend$com$squareup$cash$family$familyhub$views$U13CelebrationViewKt$U13CelebrationHero$1$4$1(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (((ParcelableSnapshotMutableIntState) this.L$0).getIntValue() > 0) {
                Mutex mutex = (Mutex) this.this$0;
                Animatable animatable = (Animatable) this.$blockersData;
                WalletMetrics walletMetrics = (WalletMetrics) this.$clientScenario;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.$currentScreen;
                this.label = 1;
                if (AllowanceViewKt.access$U13CelebrationHero$lambda$29$cycleCard(mutex, animatable, walletMetrics, parcelableSnapshotMutableIntState, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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

    private final Object invokeSuspend$com$squareup$cash$favorites$presenters$ListFavoritesPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.this$0;
            NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$1 = new NearbyPayRequestPresenter$models$10$1$1$1((Object) coroutineScope, (MoleculePresenter) this.$blockersData, (MutableState) this.$clientScenario, (State) this.$currentScreen, 6);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(nearbyPayRequestPresenter$models$10$1$1$1, this) == coroutineSingletons) {
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

    private final Object invokeSuspend$com$squareup$cash$fidesmo$presenters$FidesmoProvisioningPresenter$models$11$1(Object obj) {
        MutableState mutableState = (MutableState) this.$currentScreen;
        MutableState mutableState2 = (MutableState) this.$clientScenario;
        FidesmoProvisioningPresenter fidesmoProvisioningPresenter = (FidesmoProvisioningPresenter) this.L$0;
        BlockersDataNavigator blockersDataNavigator = fidesmoProvisioningPresenter.blockersDataNavigator;
        BetterNavigator.ScreenNavigator screenNavigator = fidesmoProvisioningPresenter.navigator;
        FidesmoProvisioningScreen fidesmoProvisioningScreen = fidesmoProvisioningPresenter.args;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        FidesmoProvisioningPresenter.ProvisioningResultSubmission.InFlight inFlight = FidesmoProvisioningPresenter.ProvisioningResultSubmission.InFlight.INSTANCE;
        FidesmoProvisioningPresenter.ProvisioningResultSubmission.NotStarted notStarted = FidesmoProvisioningPresenter.ProvisioningResultSubmission.NotStarted.INSTANCE;
        String str = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            FidesmoDeviceState.ServiceDelivered serviceDelivered = (FidesmoDeviceState.ServiceDelivered) ((MutableState) this.this$0).getValue();
            if (serviceDelivered == null) {
                return Unit.INSTANCE;
            }
            FidesmoProvisioningPresenter.ActivationPhase activationPhase = (FidesmoProvisioningPresenter.ActivationPhase) ((MutableState) this.$blockersData).getValue();
            FidesmoProvisioningPresenter.ActivationPhase.ActivationCompleted activationCompleted = activationPhase instanceof FidesmoProvisioningPresenter.ActivationPhase.ActivationCompleted ? (FidesmoProvisioningPresenter.ActivationPhase.ActivationCompleted) activationPhase : null;
            if (activationCompleted != null && activationCompleted.successScreen != null && fidesmoProvisioningScreen.flowType == FidesmoFlowType.PROVISION && Intrinsics.areEqual((FidesmoProvisioningPresenter.ProvisioningResultSubmission) mutableState2.getValue(), notStarted)) {
                BlockersData blockersData = fidesmoProvisioningScreen.blockersData;
                if (blockersData.blockerId == null) {
                    mutableState2.setValue(new FidesmoProvisioningPresenter.ProvisioningResultSubmission.Succeeded(blockersData));
                    return Unit.INSTANCE;
                }
                mutableState2.setValue(inFlight);
                boolean z = serviceDelivered.activationRequired;
                String str2 = activationCompleted.deviceId;
                this.label = 1;
                obj = FidesmoProvisioningPresenter.access$submitProvisioningBlockerResult(fidesmoProvisioningPresenter, z, str2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        BlockersData blockersData2 = (BlockersData) obj;
        Object succeeded = blockersData2 != null ? new FidesmoProvisioningPresenter.ProvisioningResultSubmission.Succeeded(blockersData2) : FidesmoProvisioningPresenter.ProvisioningResultSubmission.Failed.INSTANCE;
        mutableState2.setValue(succeeded);
        if (succeeded instanceof FidesmoProvisioningPresenter.ProvisioningResultSubmission.Failed) {
            screenNavigator.goTo(new FailureMessageBlockerScreen(fidesmoProvisioningScreen.blockersData, str, str, 6));
        } else if (succeeded instanceof FidesmoProvisioningPresenter.ProvisioningResultSubmission.Succeeded) {
            BlockersData blockersData3 = ((FidesmoProvisioningPresenter.ProvisioningResultSubmission.Succeeded) succeeded).blockersData;
            if (blockersData3.getNextBlockerId() != null) {
                screenNavigator.goTo(blockersDataNavigator.getNext(fidesmoProvisioningScreen, blockersData3));
            } else if (((Boolean) mutableState.getValue()).booleanValue()) {
                mutableState.setValue(Boolean.FALSE);
                screenNavigator.goTo(blockersDataNavigator.getNext(fidesmoProvisioningScreen, blockersData3));
            }
        } else if (!succeeded.equals(inFlight) && !succeeded.equals(notStarted)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$currentScreen;
        Object obj3 = this.$clientScenario;
        switch (i) {
            case 0:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$1 = new RealBlockersHelper$skipBlocker$1((RealBlockersHelper) this.this$0, (BlockersData) this.$blockersData, (ClientScenario) obj3, (Screen) obj2, continuation, 0);
                realBlockersHelper$skipBlocker$1.L$0 = obj;
                return realBlockersHelper$skipBlocker$1;
            case 1:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$12 = new RealBlockersHelper$skipBlocker$1((Flow) this.this$0, continuation, (InitiateLoanData) this.$blockersData, (BorrowHomeAmountPickerPresenter) obj3, (MutableState) obj2, 1);
                realBlockersHelper$skipBlocker$12.L$0 = obj;
                return realBlockersHelper$skipBlocker$12;
            case 2:
                return new RealBlockersHelper$skipBlocker$1((LocalHomePresenter) this.this$0, (MutableState) this.$blockersData, (MutableState) obj3, (MutableState) obj2, continuation, 2);
            case 3:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$13 = new RealBlockersHelper$skipBlocker$1((CardModelView) obj3, (CardModelView.CardBack) obj2, continuation, 3);
                realBlockersHelper$skipBlocker$13.L$0 = obj;
                return realBlockersHelper$skipBlocker$13;
            case 4:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$14 = new RealBlockersHelper$skipBlocker$1((Flow) this.this$0, continuation, (CardPreviewPresenter) this.$blockersData, (MutableState) obj3, (State) obj2, 4);
                realBlockersHelper$skipBlocker$14.L$0 = obj;
                return realBlockersHelper$skipBlocker$14;
            case 5:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$15 = new RealBlockersHelper$skipBlocker$1((CardPreviewPresenter) this.this$0, (SetCardCustomizationRequest) obj3, (CardPreviewViewModel) obj2, continuation);
                realBlockersHelper$skipBlocker$15.L$0 = obj;
                return realBlockersHelper$skipBlocker$15;
            case 6:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$16 = new RealBlockersHelper$skipBlocker$1((Flow) this.this$0, continuation, (CardStudioPresenter) this.$blockersData, (MutableState) obj3, (MutableState) obj2, 6);
                realBlockersHelper$skipBlocker$16.L$0 = obj;
                return realBlockersHelper$skipBlocker$16;
            case 7:
                return new RealBlockersHelper$skipBlocker$1((CardDesignLibraryState) this.L$0, (MutableState) this.this$0, (Function1) this.$blockersData, (MutableState) obj3, (MutableState) obj2, continuation, 7);
            case 8:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$17 = new RealBlockersHelper$skipBlocker$1((Flow) this.this$0, continuation, (MusicPresenter) this.$blockersData, (MutableState) obj3, (MutableState) obj2, 8);
                realBlockersHelper$skipBlocker$17.L$0 = obj;
                return realBlockersHelper$skipBlocker$17;
            case 9:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$18 = new RealBlockersHelper$skipBlocker$1((Flow) this.this$0, continuation, (MusicPresenter) this.$blockersData, (MutableState) obj3, (MutableState) obj2, 9);
                realBlockersHelper$skipBlocker$18.L$0 = obj;
                return realBlockersHelper$skipBlocker$18;
            case 10:
                return new RealBlockersHelper$skipBlocker$1((MutableState) this.L$0, (MutableState) this.this$0, (MutableState) this.$blockersData, (MutableState) obj3, (HeartScene) obj2, continuation, 10);
            case 11:
                return new RealBlockersHelper$skipBlocker$1((MutableState) this.L$0, (MutableState) this.this$0, (MutableState) this.$blockersData, (MutableState) obj3, (MiniCardScene) obj2, continuation, 11);
            case 12:
                return new RealBlockersHelper$skipBlocker$1((MutableState) this.L$0, (MutableState) this.this$0, (MutableState) this.$blockersData, (MutableState) obj3, (WandScene) obj2, continuation, 12);
            case 13:
                return new RealBlockersHelper$skipBlocker$1((ClientRoute.ViewDependentPayWithParams) obj3, (PaymentRouter) obj2, continuation, 13);
            case 14:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$19 = new RealBlockersHelper$skipBlocker$1((PointerInputScope) this.this$0, (BadgedBoxKt$$ExternalSyntheticLambda0) this.$blockersData, (RealClientSyncTransactor$$ExternalSyntheticLambda0) obj3, (RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1) obj2, continuation, 14);
                realBlockersHelper$skipBlocker$19.L$0 = obj;
                return realBlockersHelper$skipBlocker$19;
            case 15:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$110 = new RealBlockersHelper$skipBlocker$1((RealBlockersHelper) this.this$0, (BlockersData) this.$blockersData, (BlockersScreens) obj2, (ClientScenario) obj3, continuation);
                realBlockersHelper$skipBlocker$110.L$0 = obj;
                return realBlockersHelper$skipBlocker$110;
            case 16:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$111 = new RealBlockersHelper$skipBlocker$1((AtmWithdrawalMapPresenter) this.this$0, (MutableState) this.$blockersData, (MutableState) obj3, (MutableState) obj2, continuation, 16);
                realBlockersHelper$skipBlocker$111.L$0 = obj;
                return realBlockersHelper$skipBlocker$111;
            case 17:
                return new RealBlockersHelper$skipBlocker$1((MutableState) this.L$0, (AtmWithdrawalMapPresenter) this.this$0, (MutableState) this.$blockersData, (MutableState) obj3, (MutableState) obj2, continuation, 17);
            case 18:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$112 = new RealBlockersHelper$skipBlocker$1((Flow) this.this$0, continuation, (CardStudioPresenter) this.$blockersData, (MutableState) obj3, (MutableState) obj2, 18);
                realBlockersHelper$skipBlocker$112.L$0 = obj;
                return realBlockersHelper$skipBlocker$112;
            case 19:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$113 = new RealBlockersHelper$skipBlocker$1((Flow) this.this$0, continuation, (LocalHomePresenter) this.$blockersData, (MutableState) obj3, (MutableState) obj2, 19);
                realBlockersHelper$skipBlocker$113.L$0 = obj;
                return realBlockersHelper$skipBlocker$113;
            case 20:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$114 = new RealBlockersHelper$skipBlocker$1((Flow) this.this$0, continuation, (LocalEditorialPresenter) this.$blockersData, (MutableState) obj3, (MutableState) obj2, 20);
                realBlockersHelper$skipBlocker$114.L$0 = obj;
                return realBlockersHelper$skipBlocker$114;
            case 21:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$115 = new RealBlockersHelper$skipBlocker$1((Flow) this.this$0, continuation, (TransfersPresenter) this.$blockersData, (MutableState) obj3, (ParcelableSnapshotMutableIntState) obj2, 21);
                realBlockersHelper$skipBlocker$115.L$0 = obj;
                return realBlockersHelper$skipBlocker$115;
            case 22:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$116 = new RealBlockersHelper$skipBlocker$1((RealFxExchangeRateStreamingSubscriber) this.this$0, (CurrencyCode) this.$blockersData, (CurrencyCode) obj3, (ProducerScope) obj2, continuation, 22);
                realBlockersHelper$skipBlocker$116.L$0 = obj;
                return realBlockersHelper$skipBlocker$116;
            case 23:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$117 = new RealBlockersHelper$skipBlocker$1((String) obj3, (RealDependentBalancesStore) obj2, continuation, 23);
                realBlockersHelper$skipBlocker$117.L$0 = obj;
                return realBlockersHelper$skipBlocker$117;
            case 24:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$118 = new RealBlockersHelper$skipBlocker$1((Flow) this.this$0, continuation, (BaseDependentControlPresenter) this.$blockersData, (State) obj3, (State) obj2, 24);
                realBlockersHelper$skipBlocker$118.L$0 = obj;
                return realBlockersHelper$skipBlocker$118;
            case 25:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$119 = new RealBlockersHelper$skipBlocker$1((Flow) this.this$0, continuation, (DependentSavingsScreenPresenter) this.$blockersData, (MutableState) obj3, (MutableState) obj2, 25);
                realBlockersHelper$skipBlocker$119.L$0 = obj;
                return realBlockersHelper$skipBlocker$119;
            case 26:
                return new RealBlockersHelper$skipBlocker$1((ParcelableSnapshotMutableIntState) this.L$0, (Mutex) this.this$0, (Animatable) this.$blockersData, (WalletMetrics) obj3, (ParcelableSnapshotMutableIntState) obj2, continuation, 26);
            case 27:
                RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$120 = new RealBlockersHelper$skipBlocker$1((Flow) this.this$0, continuation, (LocalEditorialPresenter) this.$blockersData, (MutableState) obj3, (MutableState) obj2, 27);
                realBlockersHelper$skipBlocker$120.L$0 = obj;
                return realBlockersHelper$skipBlocker$120;
            case 28:
                return new RealBlockersHelper$skipBlocker$1((FidesmoProvisioningPresenter) this.L$0, (MutableState) this.this$0, (MutableState) this.$blockersData, (MutableState) obj3, (MutableState) obj2, continuation, 28);
            default:
                return new RealBlockersHelper$skipBlocker$1((FormCustomizedCardView) this.L$0, (MutableState) this.this$0, (MutableState) this.$blockersData, (MutableState) obj3, (MutableState) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((RealBlockersHelper$skipBlocker$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x04c8, code lost:
    
        if (r14.emit(r2, r28) == r15) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04dd, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r14, r0, r28) == r15) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0499, code lost:
    
        if (r0 == r15) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x05ee, code lost:
    
        if (r6 == r1) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x05d1, code lost:
    
        if (r2 == r1) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x05ba, code lost:
    
        if (r5 == r1) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x08ac, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r5, r7, r28) == r14) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x08d5, code lost:
    
        if (r13.emit((com.squareup.cash.card.onboarding.CardPreviewViewModel) r10, r28) == r14) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x087f, code lost:
    
        if (r2 == r14) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x086a, code lost:
    
        if (r13.emit(com.squareup.cash.card.onboarding.CardPreviewViewModel.SubmittingDesign.INSTANCE, r28) == r14) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x09c3, code lost:
    
        if (r0.emit(r2, r28) == r1) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x09a1, code lost:
    
        if (r2 != r1) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0b5a, code lost:
    
        if (r7.emit(r3, r28) == r12) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0b70, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r7, r0, r28) == r12) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0b2a, code lost:
    
        if (r2 == r12) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0ab3, code lost:
    
        if (r7.emit(r5, r28) == r12) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01f7, code lost:
    
        if (r8.emit(r5, r28) == r12) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015c, code lost:
    
        if (r1 == r12) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:250:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d4 A[LOOP:0: B:59:0x01d4->B:63:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object skipBlocker;
        String str;
        List<BlockerDescriptor> list;
        Object access$processScreenshots;
        MutableState mutableState;
        CardModelView.CardBack cardBack;
        Texture texture;
        CardModelView.CardBack cardBack2;
        Object withContext;
        Object cardCustomization;
        BlockersData updateFromResponseContext;
        PaymentScreens.QuickPayExitRouterScreen quickPayExitRouterScreen;
        Object first;
        CurrencyCode currencyCode;
        Object firstOrNull;
        Recipient recipient;
        Object awaitInternal;
        Recipient recipient2;
        CurrencyCode currencyCode2;
        PaymentScreens.QuickPayExitRouterScreen quickPayExitRouterScreen2;
        Object firstOrNull2;
        PaymentScreens.QuickPayExitRouterScreen quickPayExitRouterScreen3;
        CoroutineSingletons coroutineSingletons;
        Object obj2;
        FlowCollector flowCollector;
        BlockersData blockersData;
        Object trackBlockerSubmissionAnalytics$default;
        Object access$centerOnSearchAddress;
        GetPortfoliosHistoricalDataRequest getPortfoliosHistoricalDataRequest;
        Object portfoliosHistoricalData;
        CurrencyCode currencyCode3;
        Money money;
        RealDependentBalancesStore.StockBalanceLoaded stockBalanceLoaded;
        DependentBalance.LoadingState.BalanceLoaded balanceLoaded;
        Object value;
        int i = this.$r8$classId;
        int i2 = 12;
        int i3 = 0;
        int i4 = 3;
        Object obj3 = this.$currentScreen;
        Object obj4 = this.$clientScenario;
        int i5 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                ClientScenario clientScenario = (ClientScenario) obj4;
                RealBlockersHelper realBlockersHelper = (RealBlockersHelper) this.this$0;
                BlockersData blockersData2 = (BlockersData) this.$blockersData;
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersHelper.BlockersAction.ToggleSpinner toggleSpinner = new BlockersHelper.BlockersAction.ToggleSpinner(true);
                    this.L$0 = flowCollector2;
                    this.label = 1;
                    break;
                } else if (i6 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i6 != 2) {
                        if (i6 == 3 || i6 == 4) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    skipBlocker = obj;
                    ApiResult apiResult = (ApiResult) skipBlocker;
                    if (apiResult instanceof ApiResult.Success) {
                        ResponseContext responseContext = ((SkipBlockerResponse) ((ApiResult.Success) apiResult).response).response_context;
                        responseContext.getClass();
                        Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                        BlockersHelper.BlockersAction.ShowScreen showScreen = new BlockersHelper.BlockersAction.ShowScreen(realBlockersHelper.blockersNavigator.getNext((Screen) obj3, blockersData2.updateFromResponseContext(responseContext, false)));
                        this.L$0 = null;
                        this.label = 3;
                        break;
                    } else {
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        StartedLazily$command$$inlined$unsafeFlow$1 access$blockersFailure = RealBlockersHelper.access$blockersFailure(realBlockersHelper, (ApiResult.Failure) apiResult, blockersData2);
                        this.L$0 = null;
                        this.label = 4;
                        break;
                    }
                }
                Analytics analytics = realBlockersHelper.analytics;
                String nextBlockerId = blockersData2.getNextBlockerId();
                Flow$Type flow$Type = blockersData2.flowType;
                analytics.track(new BlockerFlowInteractSkipBlocker(nextBlockerId, blockersData2.getNextBlockerType(), BlockerFlowAnalyticsHelperKt.analyticsName(clientScenario, flow$Type), flow$Type != null ? flow$Type.name() : null, blockersData2.flowToken), null);
                ScenarioPlan scenarioPlan = blockersData2.scenarioPlan;
                BlockerDescriptor blockerDescriptor = (scenarioPlan == null || (list = scenarioPlan.blocker_descriptors) == null) ? null : (BlockerDescriptor) CollectionsKt.first((List) list);
                RequestContext requestContext = (blockerDescriptor == null || (str = blockerDescriptor.id) == null) ? null : new RequestContext(null, null, str, null, null, null, null, null, 8127);
                AppService appService = realBlockersHelper.appService;
                String str2 = blockersData2.flowToken;
                SkipBlockerRequest skipBlockerRequest = new SkipBlockerRequest(requestContext, blockerDescriptor != null ? blockerDescriptor.blocker : null, 4);
                this.L$0 = flowCollector2;
                this.label = 2;
                skipBlocker = appService.skipBlocker(clientScenario, str2, skipBlockerRequest, this);
                break;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.this$0;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$3 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope, (InitiateLoanData) this.$blockersData, (BorrowHomeAmountPickerPresenter) obj4, (MutableState) obj3, 25);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(datePickerKt$updateDisplayedMonth$3, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                MutableState mutableState2 = (MutableState) obj4;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalHomePresenter localHomePresenter = (LocalHomePresenter) this.this$0;
                    List list2 = (List) ((MutableState) this.$blockersData).getValue();
                    this.L$0 = mutableState2;
                    this.label = 1;
                    access$processScreenshots = LocalHomePresenter.access$processScreenshots(localHomePresenter, list2, this);
                    if (access$processScreenshots == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                    mutableState = mutableState2;
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = (MutableState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    access$processScreenshots = obj;
                }
                mutableState.setValue((List) access$processScreenshots);
                MutableState mutableState3 = (MutableState) obj3;
                mutableState3.setValue(BugReport.copy$default((BugReport) mutableState3.getValue(), null, null, (List) mutableState2.getValue(), null, 23));
                return Unit.INSTANCE;
            case 3:
                CardModelView.CardBack cardBack3 = (CardModelView.CardBack) obj3;
                CardModelView cardModelView = (CardModelView) obj4;
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardTextureState cardTextureState = cardModelView.textureState;
                    if (cardTextureState == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textureState");
                        throw null;
                    }
                    Pair access$nullableItems = CardModelView.access$nullableItems(cardModelView, cardTextureState.copyPanTexture);
                    cardBack = (CardModelView.CardBack) access$nullableItems.first;
                    texture = (Texture) access$nullableItems.second;
                    if (texture != null) {
                        this.L$0 = flowCollector3;
                        this.this$0 = cardBack;
                        this.$blockersData = texture;
                        this.label = 1;
                        if (flowCollector3.emit(texture, this) != coroutineSingletons5) {
                            cardBack2 = cardBack;
                        }
                        return coroutineSingletons5;
                    }
                    if (Intrinsics.areEqual(cardBack, cardBack3) || texture == null) {
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        InteractiveCardView$flingTo$1.AnonymousClass2 anonymousClass2 = new InteractiveCardView$flingTo$1.AnonymousClass2(cardModelView, cardBack3, continuation, 23);
                        this.L$0 = flowCollector3;
                        this.this$0 = null;
                        this.$blockersData = texture;
                        this.label = 2;
                        withContext = JobKt.withContext(defaultIoScheduler, anonymousClass2, this);
                        break;
                    }
                    return Unit.INSTANCE;
                }
                if (i9 == 1) {
                    texture = (Texture) this.$blockersData;
                    cardBack2 = (CardModelView.CardBack) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Texture texture2 = (Texture) this.$blockersData;
                    SafeTrace.throwOnFailure(obj);
                    texture = texture2;
                    withContext = obj;
                    Texture updateOrCreate$default = CardModelView.updateOrCreate$default(cardModelView, texture, (Bitmap) withContext, TextureType.COLOR);
                    CardTextureState cardTextureState2 = cardModelView.textureState;
                    if (cardTextureState2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textureState");
                        throw null;
                    }
                    cardTextureState2.copyPanTexture = new Pair(cardBack3, updateOrCreate$default);
                    this.L$0 = null;
                    this.this$0 = null;
                    this.$blockersData = null;
                    this.label = 3;
                    break;
                }
                cardBack = cardBack2;
                if (Intrinsics.areEqual(cardBack, cardBack3)) {
                }
                DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler2 = DefaultIoScheduler.INSTANCE;
                InteractiveCardView$flingTo$1.AnonymousClass2 anonymousClass22 = new InteractiveCardView$flingTo$1.AnonymousClass2(cardModelView, cardBack3, continuation, 23);
                this.L$0 = flowCollector3;
                this.this$0 = null;
                this.$blockersData = texture;
                this.label = 2;
                withContext = JobKt.withContext(defaultIoScheduler2, anonymousClass22, this);
            case 4:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.this$0;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$32 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope2, (CardPreviewPresenter) this.$blockersData, (MutableState) obj4, (State) obj3, 27);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(datePickerKt$updateDisplayedMonth$32, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CardPreviewPresenter cardPreviewPresenter = (CardPreviewPresenter) this.this$0;
                BetterNavigator.ScreenNavigator screenNavigator = cardPreviewPresenter.navigator;
                CardPreviewScreen cardPreviewScreen = cardPreviewPresenter.args;
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = flowCollector4;
                    this.label = 1;
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                updateFromResponseContext = (BlockersData) this.$blockersData;
                                SafeTrace.throwOnFailure(obj);
                                screenNavigator.goTo(cardPreviewPresenter.blockersNavigator.getNext(cardPreviewScreen, updateFromResponseContext));
                                return Unit.INSTANCE;
                            }
                            if (i11 == 4) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        cardCustomization = obj;
                        ApiResult apiResult2 = (ApiResult) cardCustomization;
                        if (apiResult2 instanceof ApiResult.Success) {
                            BlockersData blockersData3 = cardPreviewScreen.blockersData;
                            ResponseContext responseContext2 = ((SetCardCustomizationResponse) ((ApiResult.Success) apiResult2).response).response_context;
                            responseContext2.getClass();
                            Parcelable.Creator<BlockersData> creator2 = BlockersData.CREATOR;
                            updateFromResponseContext = blockersData3.updateFromResponseContext(responseContext2, false);
                            CoroutineContext coroutineContext = cardPreviewPresenter.ioDispatcher;
                            CardPreviewPresenter$models$2$4 cardPreviewPresenter$models$2$4 = new CardPreviewPresenter$models$2$4(cardPreviewPresenter, continuation, i5);
                            this.L$0 = null;
                            this.$blockersData = updateFromResponseContext;
                            this.label = 3;
                            break;
                        } else {
                            if (!(apiResult2 instanceof ApiResult.Failure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            screenNavigator.goTo(CanvasKt.toFailureScreen((ApiResult.Failure) apiResult2, cardPreviewScreen.blockersData, cardPreviewPresenter.stringManager));
                            this.L$0 = null;
                            this.label = 4;
                            break;
                        }
                        return coroutineSingletons7;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                AppService appService2 = cardPreviewPresenter.appService;
                BlockersData blockersData4 = cardPreviewScreen.blockersData;
                this.L$0 = flowCollector4;
                this.label = 2;
                cardCustomization = appService2.setCardCustomization(blockersData4.clientScenario, blockersData4.flowToken, (SetCardCustomizationRequest) obj4, this);
                break;
            case 6:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.this$0;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$33 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope3, (CardStudioPresenter) this.$blockersData, (MutableState) obj4, (MutableState) obj3, 28);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(datePickerKt$updateDisplayedMonth$33, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new CaptureCheckFaceKt$$ExternalSyntheticLambda15(17, (CardDesignLibraryState) this.L$0, (MutableState) this.this$0));
                    RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$2 = new RealBlockersHelper$collectBlockersActions$2(i4, (Function1) this.$blockersData, (MutableState) obj4, (MutableState) obj3);
                    this.label = 1;
                    if (snapshotFlow.collect(realBlockersHelper$collectBlockersActions$2, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.this$0;
                    RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$22 = new RealBlockersHelper$collectBlockersActions$2(coroutineScope4, (MusicPresenter) this.$blockersData, (MutableState) obj4, (MutableState) obj3, 4);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow4.collect(realBlockersHelper$collectBlockersActions$22, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.this$0;
                    RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$23 = new RealBlockersHelper$collectBlockersActions$2(coroutineScope5, (MusicPresenter) this.$blockersData, (MutableState) obj4, (MutableState) obj3, 5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow5.collect(realBlockersHelper$collectBlockersActions$23, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final MutableState mutableState4 = (MutableState) this.L$0;
                    final MutableState mutableState5 = (MutableState) this.this$0;
                    final MutableState mutableState6 = (MutableState) this.$blockersData;
                    final MutableState mutableState7 = (MutableState) obj4;
                    final int i17 = 1;
                    SafeFlow snapshotFlow2 = Updater.snapshotFlow(new Function0() { // from class: com.squareup.cash.card.onboarding.graphics.WandEffectKt$WandEffect$6$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i18 = i17;
                            MutableState mutableState8 = mutableState7;
                            MutableState mutableState9 = mutableState6;
                            MutableState mutableState10 = mutableState5;
                            MutableState mutableState11 = mutableState4;
                            switch (i18) {
                                case 0:
                                    return new WandSceneState(((Number) mutableState11.getValue()).floatValue(), (Quat) mutableState10.getValue(), (Vector3) mutableState9.getValue(), ((Number) mutableState8.getValue()).floatValue());
                                case 1:
                                    return new HeartSceneState(((Number) mutableState11.getValue()).floatValue(), (Quat) mutableState10.getValue(), (Vector3) mutableState9.getValue(), ((Number) mutableState8.getValue()).floatValue());
                                default:
                                    return new MiniCardSceneState(((Number) mutableState11.getValue()).floatValue(), (Quat) mutableState10.getValue(), (Vector3) mutableState9.getValue(), ((Number) mutableState8.getValue()).floatValue());
                            }
                        }
                    });
                    HeartEffectKt$HeartEffect$6$1$2 heartEffectKt$HeartEffect$6$1$2 = new HeartEffectKt$HeartEffect$6$1$2((HeartScene) obj3, i3);
                    this.label = 1;
                    if (snapshotFlow2.collect(heartEffectKt$HeartEffect$6$1$2, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final MutableState mutableState8 = (MutableState) this.L$0;
                    final MutableState mutableState9 = (MutableState) this.this$0;
                    final MutableState mutableState10 = (MutableState) this.$blockersData;
                    final MutableState mutableState11 = (MutableState) obj4;
                    final int i19 = 2;
                    SafeFlow snapshotFlow3 = Updater.snapshotFlow(new Function0() { // from class: com.squareup.cash.card.onboarding.graphics.WandEffectKt$WandEffect$6$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i182 = i19;
                            MutableState mutableState82 = mutableState11;
                            MutableState mutableState92 = mutableState10;
                            MutableState mutableState102 = mutableState9;
                            MutableState mutableState112 = mutableState8;
                            switch (i182) {
                                case 0:
                                    return new WandSceneState(((Number) mutableState112.getValue()).floatValue(), (Quat) mutableState102.getValue(), (Vector3) mutableState92.getValue(), ((Number) mutableState82.getValue()).floatValue());
                                case 1:
                                    return new HeartSceneState(((Number) mutableState112.getValue()).floatValue(), (Quat) mutableState102.getValue(), (Vector3) mutableState92.getValue(), ((Number) mutableState82.getValue()).floatValue());
                                default:
                                    return new MiniCardSceneState(((Number) mutableState112.getValue()).floatValue(), (Quat) mutableState102.getValue(), (Vector3) mutableState92.getValue(), ((Number) mutableState82.getValue()).floatValue());
                            }
                        }
                    });
                    MiniCardEffectKt$MiniCardEffect$6$1$2 miniCardEffectKt$MiniCardEffect$6$1$2 = new MiniCardEffectKt$MiniCardEffect$6$1$2((MiniCardScene) obj3, i3);
                    this.label = 1;
                    if (snapshotFlow3.collect(miniCardEffectKt$MiniCardEffect$6$1$2, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
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
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final MutableState mutableState12 = (MutableState) this.L$0;
                    final MutableState mutableState13 = (MutableState) this.this$0;
                    final MutableState mutableState14 = (MutableState) this.$blockersData;
                    final MutableState mutableState15 = (MutableState) obj4;
                    final int i21 = 0;
                    SafeFlow snapshotFlow4 = Updater.snapshotFlow(new Function0() { // from class: com.squareup.cash.card.onboarding.graphics.WandEffectKt$WandEffect$6$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i182 = i21;
                            MutableState mutableState82 = mutableState15;
                            MutableState mutableState92 = mutableState14;
                            MutableState mutableState102 = mutableState13;
                            MutableState mutableState112 = mutableState12;
                            switch (i182) {
                                case 0:
                                    return new WandSceneState(((Number) mutableState112.getValue()).floatValue(), (Quat) mutableState102.getValue(), (Vector3) mutableState92.getValue(), ((Number) mutableState82.getValue()).floatValue());
                                case 1:
                                    return new HeartSceneState(((Number) mutableState112.getValue()).floatValue(), (Quat) mutableState102.getValue(), (Vector3) mutableState92.getValue(), ((Number) mutableState82.getValue()).floatValue());
                                default:
                                    return new MiniCardSceneState(((Number) mutableState112.getValue()).floatValue(), (Quat) mutableState102.getValue(), (Vector3) mutableState92.getValue(), ((Number) mutableState82.getValue()).floatValue());
                            }
                        }
                    });
                    WandEffectKt$WandEffect$6$1$2 wandEffectKt$WandEffect$6$1$2 = new WandEffectKt$WandEffect$6$1$2((WandScene) obj3, i3);
                    this.label = 1;
                    if (snapshotFlow4.collect(wandEffectKt$WandEffect$6$1$2, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                ClientRoute.ViewDependentPayWithParams viewDependentPayWithParams = (ClientRoute.ViewDependentPayWithParams) obj4;
                PaymentRouter paymentRouter = (PaymentRouter) obj3;
                RealRecipientFinder realRecipientFinder = paymentRouter.recipientFinder;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProtoAdapter protoAdapter = SendMoneyParams.ADAPTER;
                    ByteString.Companion companion = ByteString.Companion;
                    ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewDependentPayWithParams.sendmoneyparams);
                    decodeBase64.getClass();
                    String str3 = ((SendMoneyParams) protoAdapter.decode(decodeBase64)).exit_route;
                    str3.getClass();
                    quickPayExitRouterScreen = new PaymentScreens.QuickPayExitRouterScreen(str3);
                    FlowQuery$mapToList$$inlined$map$1 currencyCode4 = paymentRouter.profileManager.currencyCode();
                    this.L$0 = quickPayExitRouterScreen;
                    this.label = 1;
                    first = FlowKt.first(currencyCode4, this);
                    break;
                } else if (i22 == 1) {
                    PaymentScreens.QuickPayExitRouterScreen quickPayExitRouterScreen4 = (PaymentScreens.QuickPayExitRouterScreen) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    quickPayExitRouterScreen = quickPayExitRouterScreen4;
                    first = obj;
                } else if (i22 == 2) {
                    CurrencyCode currencyCode5 = (CurrencyCode) this.this$0;
                    PaymentScreens.QuickPayExitRouterScreen quickPayExitRouterScreen5 = (PaymentScreens.QuickPayExitRouterScreen) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    quickPayExitRouterScreen = quickPayExitRouterScreen5;
                    currencyCode = currencyCode5;
                    firstOrNull = obj;
                    recipient = (Recipient) firstOrNull;
                    if (recipient == null) {
                        CompletableDeferredImpl sync = paymentRouter.clientSyncer.sync(SyncTrigger.BLOCKING_USER_ACTION, SyncScope.Global.INSTANCE);
                        this.L$0 = quickPayExitRouterScreen;
                        this.this$0 = currencyCode;
                        this.$blockersData = recipient;
                        this.label = 3;
                        awaitInternal = sync.awaitInternal(this);
                        break;
                    }
                    recipient2 = recipient;
                    currencyCode2 = currencyCode;
                    quickPayExitRouterScreen2 = quickPayExitRouterScreen;
                    Orientation orientation = Orientation.CASH;
                    if (recipient2 == null) {
                    }
                } else {
                    if (i22 != 3) {
                        if (i22 != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        CurrencyCode currencyCode6 = (CurrencyCode) this.this$0;
                        quickPayExitRouterScreen3 = (PaymentScreens.QuickPayExitRouterScreen) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        currencyCode = currencyCode6;
                        firstOrNull2 = obj;
                        quickPayExitRouterScreen2 = quickPayExitRouterScreen3;
                        recipient2 = (Recipient) firstOrNull2;
                        currencyCode2 = currencyCode;
                        Orientation orientation2 = Orientation.CASH;
                        if (recipient2 == null) {
                            paymentRouter.navigator.goTo(paymentRouter.buildQuickPayScreen(orientation2, recipient2, currencyCode2, null, new RoutingParams(null, null, quickPayExitRouterScreen2, null, null, null, 503), "0", null));
                            return Unit.INSTANCE;
                        }
                        Path$$ExternalSyntheticBUOutline0.m((Object) "After retry, could not find dependent with token ".concat(viewDependentPayWithParams.customerToken));
                        return null;
                    }
                    recipient = (Recipient) this.$blockersData;
                    currencyCode = (CurrencyCode) this.this$0;
                    PaymentScreens.QuickPayExitRouterScreen quickPayExitRouterScreen6 = (PaymentScreens.QuickPayExitRouterScreen) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    quickPayExitRouterScreen = quickPayExitRouterScreen6;
                    awaitInternal = obj;
                    if (awaitInternal == ClientSyncer$Result.Success) {
                        String str4 = viewDependentPayWithParams.customerToken;
                        this.L$0 = quickPayExitRouterScreen;
                        this.this$0 = currencyCode;
                        this.$blockersData = null;
                        this.label = 4;
                        firstOrNull2 = FlowKt.firstOrNull(realRecipientFinder.contactRepository.contactById(str4), this);
                        if (firstOrNull2 != coroutineSingletons15) {
                            quickPayExitRouterScreen3 = quickPayExitRouterScreen;
                            quickPayExitRouterScreen2 = quickPayExitRouterScreen3;
                            recipient2 = (Recipient) firstOrNull2;
                            currencyCode2 = currencyCode;
                            Orientation orientation22 = Orientation.CASH;
                            if (recipient2 == null) {
                            }
                        }
                        return coroutineSingletons15;
                    }
                    recipient2 = recipient;
                    currencyCode2 = currencyCode;
                    quickPayExitRouterScreen2 = quickPayExitRouterScreen;
                    Orientation orientation222 = Orientation.CASH;
                    if (recipient2 == null) {
                    }
                }
                currencyCode = (CurrencyCode) first;
                String str5 = viewDependentPayWithParams.customerToken;
                this.L$0 = quickPayExitRouterScreen;
                this.this$0 = currencyCode;
                this.label = 2;
                firstOrNull = FlowKt.firstOrNull(realRecipientFinder.contactRepository.contactById(str5), this);
                break;
            case 14:
                PointerInputScope pointerInputScope = (PointerInputScope) this.this$0;
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TapGestureDetectorKt$detectTapAndPress$2$1 tapGestureDetectorKt$detectTapAndPress$2$1 = new TapGestureDetectorKt$detectTapAndPress$2$1((BadgedBoxKt$$ExternalSyntheticLambda0) this.$blockersData, coroutineScope6, (RealClientSyncTransactor$$ExternalSyntheticLambda0) obj4, new PressGestureScopeImpl(pointerInputScope), (RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1) obj3, null, 4);
                    this.L$0 = null;
                    this.label = 1;
                    if (Draggable2DKt.awaitEachGesture(pointerInputScope, tapGestureDetectorKt$detectTapAndPress$2$1, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                BlockersData blockersData5 = (BlockersData) this.$blockersData;
                RealBlockersHelper realBlockersHelper2 = (RealBlockersHelper) this.this$0;
                FlowCollector flowCollector5 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                Continuation continuation2 = null;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersHelper.BlockersAction.ToggleSpinner toggleSpinner2 = new BlockersHelper.BlockersAction.ToggleSpinner(true);
                    this.L$0 = flowCollector5;
                    this.label = 1;
                    if (flowCollector5.emit(toggleSpinner2, this) == coroutineSingletons17) {
                        coroutineSingletons = coroutineSingletons17;
                        return coroutineSingletons;
                    }
                } else if (i24 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i24 != 2) {
                        if (i24 == 3 || i24 == 4) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    coroutineSingletons = coroutineSingletons17;
                    blockersData = blockersData5;
                    flowCollector = flowCollector5;
                    obj2 = null;
                    trackBlockerSubmissionAnalytics$default = obj;
                    ApiResult apiResult3 = (ApiResult) trackBlockerSubmissionAnalytics$default;
                    if (apiResult3 instanceof ApiResult.Success) {
                        ResponseContext responseContext3 = ((ResolveMergeResponse) ((ApiResult.Success) apiResult3).response).response_context;
                        responseContext3.getClass();
                        Parcelable.Creator<BlockersData> creator3 = BlockersData.CREATOR;
                        BlockersHelper.BlockersAction.ShowScreen showScreen2 = new BlockersHelper.BlockersAction.ShowScreen(realBlockersHelper2.blockersNavigator.getNext((BlockersScreens) obj3, blockersData.updateFromResponseContext(responseContext3, false)));
                        this.L$0 = obj2;
                        this.label = 3;
                        break;
                    } else {
                        if (!(apiResult3 instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        StartedLazily$command$$inlined$unsafeFlow$1 access$blockersFailure2 = RealBlockersHelper.access$blockersFailure(realBlockersHelper2, (ApiResult.Failure) apiResult3, blockersData);
                        this.L$0 = obj2;
                        this.label = 4;
                        break;
                    }
                }
                Analytics analytics2 = realBlockersHelper2.analytics;
                AndroidStringManager androidStringManager = realBlockersHelper2.stringManager;
                SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(realBlockersHelper2, (ClientScenario) obj4, blockersData5, continuation2, 15);
                obj2 = null;
                this.L$0 = flowCollector5;
                this.label = 2;
                flowCollector = flowCollector5;
                coroutineSingletons = coroutineSingletons17;
                blockersData = blockersData5;
                trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData, analytics2, androidStringManager, this, null, sessionWorker$doWork$2$2);
                break;
            case 16:
                MutableState mutableState16 = (MutableState) obj3;
                MutableState mutableState17 = (MutableState) obj4;
                MutableState mutableState18 = (MutableState) this.$blockersData;
                AtmWithdrawalMapPresenter atmWithdrawalMapPresenter = (AtmWithdrawalMapPresenter) this.this$0;
                CashMapPresenter cashMapPresenter = atmWithdrawalMapPresenter.cashMapPresenter;
                AddressResult addressResult = (AddressResult) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!Intrinsics.areEqual(addressResult, NoAddressResult.INSTANCE)) {
                        if (addressResult instanceof SelectedRecentAddressResult) {
                            SelectedRecentAddressResult selectedRecentAddressResult = (SelectedRecentAddressResult) addressResult;
                            LocationViewModel locationViewModel = new LocationViewModel(selectedRecentAddressResult.latitude, selectedRecentAddressResult.longitude, 12.5f);
                            cashMapPresenter.searchLocation(locationViewModel);
                            mutableState18.setValue(locationViewModel);
                            mutableState17.setValue(Boolean.TRUE);
                            mutableState16.setValue(selectedRecentAddressResult.fullText.toString());
                        } else {
                            if (!(addressResult instanceof SelectedSearchAddressResult)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            this.L$0 = addressResult;
                            this.label = 1;
                            access$centerOnSearchAddress = AtmWithdrawalMapPresenter.access$centerOnSearchAddress(atmWithdrawalMapPresenter, (SelectedSearchAddressResult) addressResult, this);
                            if (access$centerOnSearchAddress == coroutineSingletons18) {
                                return coroutineSingletons18;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i25 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                access$centerOnSearchAddress = obj;
                LocationViewModel locationViewModel2 = (LocationViewModel) access$centerOnSearchAddress;
                if (locationViewModel2 != null) {
                    cashMapPresenter.searchLocation(locationViewModel2);
                    mutableState18.setValue(locationViewModel2);
                    mutableState17.setValue(Boolean.TRUE);
                    mutableState16.setValue(((SelectedSearchAddressResult) addressResult).fullText.toString());
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow5 = Updater.snapshotFlow(new DrawerViewKt$$ExternalSyntheticLambda2(i2, (MutableState) this.L$0));
                    RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$1 = new RealBlockersHelper$skipBlocker$1((AtmWithdrawalMapPresenter) this.this$0, (MutableState) this.$blockersData, (MutableState) obj4, (MutableState) obj3, (Continuation) null, 16);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow5, realBlockersHelper$skipBlocker$1, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.this$0;
                    RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$24 = new RealBlockersHelper$collectBlockersActions$2(coroutineScope7, (CardStudioPresenter) this.$blockersData, (MutableState) obj4, (MutableState) obj3, 17);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow6.collect(realBlockersHelper$collectBlockersActions$24, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.this$0;
                    NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$1 = new NearbyPayRequestPresenter$models$10$1$1$1((Object) coroutineScope8, (MoleculePresenter) this.$blockersData, (MutableState) obj4, (State) obj3, 1);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow7.collect(nearbyPayRequestPresenter$models$10$1$1$1, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.this$0;
                    RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$25 = new RealBlockersHelper$collectBlockersActions$2(coroutineScope9, (LocalEditorialPresenter) this.$blockersData, (MutableState) obj4, (MutableState) obj3, 19);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow8.collect(realBlockersHelper$collectBlockersActions$25, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.this$0;
                    RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$26 = new RealBlockersHelper$collectBlockersActions$2(coroutineScope10, (TransfersPresenter) this.$blockersData, (MutableState) obj4, (ParcelableSnapshotMutableIntState) obj3, 22);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow9.collect(realBlockersHelper$collectBlockersActions$26, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                Map map = (Map) this.L$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (map == null) {
                        return Unit.INSTANCE;
                    }
                    RealFxExchangeRateStreamingSubscriber realFxExchangeRateStreamingSubscriber = (RealFxExchangeRateStreamingSubscriber) this.this$0;
                    realFxExchangeRateStreamingSubscriber.exponentialBackoff.trackType = 0;
                    DbSessionManager$updateDb$2 dbSessionManager$updateDb$2 = new DbSessionManager$updateDb$2(realFxExchangeRateStreamingSubscriber, map, (CurrencyCode) this.$blockersData, (CurrencyCode) obj4, (ProducerScope) obj3, null, 2);
                    this.L$0 = null;
                    this.label = 1;
                    if (JobKt.coroutineScope(dbSessionManager$updateDb$2, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                String str6 = (String) obj4;
                RealDependentBalancesStore realDependentBalancesStore = (RealDependentBalancesStore) obj3;
                StateFlowImpl stateFlowImpl = realDependentBalancesStore.cachedStockBalanceLoadingState;
                FlowCollector flowCollector6 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetPortfoliosHistoricalDataRequest getPortfoliosHistoricalDataRequest2 = new GetPortfoliosHistoricalDataRequest(HistoricalRange.DAY, str6, 12);
                    Object obj5 = (DependentBalance.LoadingState) ((Map) stateFlowImpl.getValue()).get(str6);
                    if (obj5 == null) {
                        obj5 = DependentBalance.LoadingState.BalanceLoading.INSTANCE;
                    }
                    this.L$0 = flowCollector6;
                    this.this$0 = getPortfoliosHistoricalDataRequest2;
                    this.label = 1;
                    if (flowCollector6.emit(obj5, this) != coroutineSingletons25) {
                        getPortfoliosHistoricalDataRequest = getPortfoliosHistoricalDataRequest2;
                    }
                    return coroutineSingletons25;
                }
                if (i32 == 1) {
                    getPortfoliosHistoricalDataRequest = (GetPortfoliosHistoricalDataRequest) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                } else if (i32 == 2) {
                    flowCollector6 = (FlowCollector) this.$blockersData;
                    SafeTrace.throwOnFailure(obj);
                    portfoliosHistoricalData = obj;
                    ApiResult apiResult4 = (ApiResult) portfoliosHistoricalData;
                    boolean z = apiResult4 instanceof ApiResult.Failure;
                    Object obj6 = DependentBalance.LoadingState.BalanceFailedToLoad.INSTANCE;
                    if (!z) {
                        if (!(apiResult4 instanceof ApiResult.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        GetPortfoliosHistoricalDataResponse getPortfoliosHistoricalDataResponse = (GetPortfoliosHistoricalDataResponse) ((ApiResult.Success) apiResult4).response;
                        int i33 = RealDependentBalancesStore.$r8$clinit;
                        FamilyParsingErrorFactory familyParsingErrorFactory = FamilyParsingErrorFactory.INSTANCE;
                        try {
                            ProtoValidationScope protoValidationScope = new ProtoValidationScope(getPortfoliosHistoricalDataResponse, familyParsingErrorFactory, realDependentBalancesStore);
                            BalanceHistory balanceHistory = (BalanceHistory) protoValidationScope.reportIfNullAndContinue("balance_history", (String) null, getPortfoliosHistoricalDataResponse.balance_history);
                            if (balanceHistory != null && (currencyCode3 = (CurrencyCode) protoValidationScope.reportIfNullAndContinue("balance_history.currency_code", (String) null, balanceHistory.currency_code)) != null) {
                                BalanceTick balanceTick = (BalanceTick) CollectionsKt.lastOrNull(balanceHistory.balance_ticks);
                                if (balanceTick == null) {
                                    money = new Money((Long) 0L, currencyCode3, 4);
                                } else {
                                    Long l = (Long) protoValidationScope.reportIfNullAndContinue("balance_history.balance_ticks.amount_cents", (String) null, balanceTick.amount_cents);
                                    if (l != null) {
                                        money = new Money(l, currencyCode3, 4);
                                    }
                                }
                                stockBalanceLoaded = new RealDependentBalancesStore.StockBalanceLoaded(new DependentBalance.LoadingState.BalanceLoaded(money));
                                balanceLoaded = stockBalanceLoaded == null ? stockBalanceLoaded.loaded : null;
                                if (balanceLoaded != null) {
                                    do {
                                        value = stateFlowImpl.getValue();
                                    } while (!stateFlowImpl.compareAndSet(value, MapsKt__MapsKt.plus((Map) value, new Pair(str6, balanceLoaded))));
                                    obj6 = balanceLoaded;
                                }
                            }
                            stockBalanceLoaded = null;
                            if (stockBalanceLoaded == null) {
                            }
                            if (balanceLoaded != null) {
                            }
                        } catch (Exception e) {
                            throw RotateKt.toProtoParsingExceptionFor(e, getPortfoliosHistoricalDataResponse != null ? Reflection.factory.getOrCreateKotlinClass(GetPortfoliosHistoricalDataResponse.class) : null, familyParsingErrorFactory, null);
                        }
                    }
                    this.L$0 = null;
                    this.this$0 = null;
                    this.$blockersData = null;
                    this.label = 3;
                    break;
                } else {
                    if (i32 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                PortfoliosService portfoliosService = realDependentBalancesStore.portfoliosService;
                this.L$0 = null;
                this.this$0 = null;
                this.$blockersData = flowCollector6;
                this.label = 2;
                portfoliosHistoricalData = portfoliosService.getPortfoliosHistoricalData(getPortfoliosHistoricalDataRequest, this);
                break;
            case 24:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.this$0;
                    NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$12 = new NearbyPayRequestPresenter$models$10$1$1$1(coroutineScope11, (BaseDependentControlPresenter) this.$blockersData, (State) obj4, (State) obj3, 3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow10.collect(nearbyPayRequestPresenter$models$10$1$1$12, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                return invokeSuspend$com$squareup$cash$family$familyhub$presenters$DependentSavingsScreenPresenter$models$$inlined$CollectEffect$1(obj);
            case 26:
                return invokeSuspend$com$squareup$cash$family$familyhub$views$U13CelebrationViewKt$U13CelebrationHero$1$4$1(obj);
            case 27:
                return invokeSuspend$com$squareup$cash$favorites$presenters$ListFavoritesPresenter$models$$inlined$CollectEffect$1(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$fidesmo$presenters$FidesmoProvisioningPresenter$models$11$1(obj);
            default:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FormCustomizedCardView formCustomizedCardView = (FormCustomizedCardView) this.L$0;
                    RealStyledCardPresenter$Factory$Impl realStyledCardPresenter$Factory$Impl = (RealStyledCardPresenter$Factory$Impl) formCustomizedCardView.presenterFactory;
                    CardCustomizationData cardCustomizationData = (CardCustomizationData) formCustomizedCardView.data;
                    realStyledCardPresenter$Factory$Impl.getClass();
                    cardCustomizationData.getClass();
                    LocalActivitySetupTeardown.MetroFactory metroFactory = realStyledCardPresenter$Factory$Impl.delegateFactory;
                    AppConfigManager appConfigManager = (AppConfigManager) metroFactory.appForegroundStateProvider.invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) metroFactory.sessionManager.invoke();
                    RealFilamentSupportProvider realFilamentSupportProvider = (RealFilamentSupportProvider) metroFactory.syncValueReader.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.shortlinkHandler.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) metroFactory.ioDispatcher.invoke();
                    appConfigManager.getClass();
                    realProfileManager.getClass();
                    realFilamentSupportProvider.getClass();
                    featureFlagManager.getClass();
                    coroutineContext2.getClass();
                    RealStyledCardPresenter realStyledCardPresenter = new RealStyledCardPresenter(appConfigManager, realProfileManager, realFilamentSupportProvider, featureFlagManager, coroutineContext2, cardCustomizationData);
                    final MutableState mutableState19 = (MutableState) this.this$0;
                    final MutableState mutableState20 = (MutableState) this.$blockersData;
                    final MutableState mutableState21 = (MutableState) obj4;
                    final MutableState mutableState22 = (MutableState) obj3;
                    FlowCollector flowCollector7 = new FlowCollector() { // from class: com.squareup.cash.formview.components.FormCustomizedCardView$Content$1$1$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj7, Continuation continuation3) {
                            StyledCardWidgetViewModel styledCardWidgetViewModel = (StyledCardWidgetViewModel) obj7;
                            StyledCardViewModel styledCardViewModel = styledCardWidgetViewModel.styledCardViewModel;
                            CardPresentationStyle cardPresentationStyle = styledCardWidgetViewModel.cardPresentationStyle;
                            boolean z2 = styledCardWidgetViewModel.disableFilament;
                            int i36 = FormCustomizedCardView.$r8$clinit;
                            MutableState.this.setValue(styledCardViewModel);
                            mutableState20.setValue(cardPresentationStyle);
                            mutableState21.setValue(Boolean.valueOf(z2));
                            if (cardPresentationStyle == CardPresentationStyle.TRUE_3D) {
                                CardTheme cardTheme = styledCardViewModel.theme;
                                String str7 = cardTheme.ink_color;
                                Timber.Forest forest = Timber.Forest;
                                Integer safeParseColor = StringsKt.safeParseColor(str7, new EnumListAdapter$encode$1(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 9));
                                safeParseColor.getClass();
                                int intValue = safeParseColor.intValue();
                                CardTheme.Identifier identifier = cardTheme.id;
                                Integer safeParseColor2 = StringsKt.safeParseColor(cardTheme.card_color, new EnumListAdapter$encode$1(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 6));
                                safeParseColor2.getClass();
                                int intValue2 = safeParseColor2.intValue();
                                Integer safeParseColor3 = StringsKt.safeParseColor(cardTheme.card_info_text_color, null);
                                int intValue3 = safeParseColor3 != null ? safeParseColor3.intValue() : intValue;
                                Integer safeParseColor4 = StringsKt.safeParseColor(cardTheme.mag_stripe_color, new EnumListAdapter$encode$1(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 7));
                                int intValue4 = safeParseColor4 != null ? safeParseColor4.intValue() : -12303292;
                                CardTheme.CardCustomizationMargin cardCustomizationMargin = cardTheme.card_customization_margin;
                                Integer safeParseColor5 = StringsKt.safeParseColor(cardTheme.mag_stripe_back_color, new EnumListAdapter$encode$1(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 8));
                                int intValue5 = safeParseColor5 != null ? safeParseColor5.intValue() : CardModelView.DEFAULT_MAG_BACK_COLOR;
                                mutableState22.setValue(new CardModelView.ViewModel(intValue2, intValue, intValue3, identifier, cardTheme.background_image, cardTheme.font, styledCardViewModel.showCustomization ? styledCardViewModel.customizationDetails : null, cardCustomizationMargin, styledCardViewModel.showCashtag ? styledCardViewModel.cashtag : null, intValue4, intValue5, null, null, null, null, styledCardViewModel.paymentMethod, null, false, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, -142376992, 2047));
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (realStyledCardPresenter.collect(flowCollector7, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBlockersHelper$skipBlocker$1(CardPreviewPresenter cardPreviewPresenter, SetCardCustomizationRequest setCardCustomizationRequest, CardPreviewViewModel cardPreviewViewModel, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 5;
        this.this$0 = cardPreviewPresenter;
        this.$clientScenario = setCardCustomizationRequest;
        this.$currentScreen = cardPreviewViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBlockersHelper$skipBlocker$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.this$0 = obj2;
        this.$blockersData = obj3;
        this.$clientScenario = obj4;
        this.$currentScreen = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBlockersHelper$skipBlocker$1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$blockersData = obj2;
        this.$clientScenario = obj3;
        this.$currentScreen = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBlockersHelper$skipBlocker$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$clientScenario = obj;
        this.$currentScreen = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBlockersHelper$skipBlocker$1(Flow flow, Continuation continuation, Object obj, Object obj2, State state, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = flow;
        this.$blockersData = obj;
        this.$clientScenario = obj2;
        this.$currentScreen = state;
    }
}
