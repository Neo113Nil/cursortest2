package com.squareup.cash.arcade.components;

import androidx.camera.core.impl.QuirkSettingsLoader;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda24;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.paging.compose.LazyPagingItems$collectLoadState$2;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzjr;
import com.squareup.cash.activity.views.ActivityTabViewKt$ActivityTab$5$1$3;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.InAppNotificationModel;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.cash.appmessages.db.SheetMessage;
import com.squareup.cash.appmessages.views.InAppNotificationView;
import com.squareup.cash.appmessages.views.InAppNotificationView$setModel$4$2;
import com.squareup.cash.banking.sections.RealMoreWaysToAddMoneySectionPresenter;
import com.squareup.cash.beacondetection.api.DetectionContext;
import com.squareup.cash.beacondetection.api.LocationPermissionLevel;
import com.squareup.cash.beacondetection.real.BeaconDetectionSetupTeardown;
import com.squareup.cash.beacondetection.real.BeaconRegionTracker;
import com.squareup.cash.beacondetection.real.BeaconRegionTracker$Event$RegionExit;
import com.squareup.cash.benefits.presenters.BenefitsHomePresenter;
import com.squareup.cash.bitcoin.graph.api.model.BitcoinGraphModel;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphModelCache;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphModelProvider;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$models$2$1$1;
import com.squareup.cash.bitcoin.presenters.NullWalletAddressError;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.appmessage.AppMessageInteractView;
import com.squareup.cash.cdf.bankingbenefitshome.BankingBenefitsHomeTapPrimaryCta;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractViewPage;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.CryptoAddress$BitcoinAddress;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.presenters.OffersDetailsPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.screens.Back;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;
import squareup.cash.bankingbenefits.ui.CashGreenV1;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes5.dex */
public final class ToastKt$Toast$9$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $hasShown$delegate;
    public Object $onDismiss;
    public final /* synthetic */ int $r8$classId;
    public Object $visible$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastKt$Toast$9$1(MutableState mutableState, MutableState mutableState2, LazyListState lazyListState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.$visible$delegate = mutableState;
        this.$hasShown$delegate = mutableState2;
        this.$onDismiss = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$hasShown$delegate;
        switch (i) {
            case 0:
                return new ToastKt$Toast$9$1((Function0) this.$onDismiss, (MutableState) this.$visible$delegate, (MutableState) obj2, continuation, 0);
            case 1:
                return new ToastKt$Toast$9$1((MutableState) this.$visible$delegate, (MutableState) obj2, (LazyListState) this.$onDismiss, continuation);
            case 2:
                ToastKt$Toast$9$1 toastKt$Toast$9$1 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (LocalPosCheckInPresenter) obj2, 2);
                toastKt$Toast$9$1.$onDismiss = obj;
                return toastKt$Toast$9$1;
            case 3:
                ToastKt$Toast$9$1 toastKt$Toast$9$12 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (MusicPresenter) obj2, 3);
                toastKt$Toast$9$12.$onDismiss = obj;
                return toastKt$Toast$9$12;
            case 4:
                ToastKt$Toast$9$1 toastKt$Toast$9$13 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (ErrorPresenter) obj2, 4);
                toastKt$Toast$9$13.$onDismiss = obj;
                return toastKt$Toast$9$13;
            case 5:
                ToastKt$Toast$9$1 toastKt$Toast$9$14 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (CardStudioPresenter) obj2, 5);
                toastKt$Toast$9$14.$onDismiss = obj;
                return toastKt$Toast$9$14;
            case 6:
                return new ToastKt$Toast$9$1((LocalCashBalancePresenter) this.$onDismiss, (MutableState) obj2, continuation);
            case 7:
                ToastKt$Toast$9$1 toastKt$Toast$9$15 = new ToastKt$Toast$9$1((Long) this.$visible$delegate, (InAppNotificationModel.Ready) obj2, continuation, 7);
                toastKt$Toast$9$15.$onDismiss = obj;
                return toastKt$Toast$9$15;
            case 8:
                return new ToastKt$Toast$9$1((InAppNotificationView) this.$onDismiss, (Long) this.$visible$delegate, (InAppNotificationModel.Ready) obj2, continuation, 8);
            case 9:
                return new ToastKt$Toast$9$1((MutableTransitionState) this.$onDismiss, (Function1) this.$visible$delegate, (InlineAppMessageV2ViewModel.Ready) obj2, continuation, 9);
            case 10:
                ToastKt$Toast$9$1 toastKt$Toast$9$16 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (MusicPresenter) obj2, 10);
                toastKt$Toast$9$16.$onDismiss = obj;
                return toastKt$Toast$9$16;
            case 11:
                ToastKt$Toast$9$1 toastKt$Toast$9$17 = new ToastKt$Toast$9$1((Function1) this.$visible$delegate, continuation, (MutableInteractionSourceImpl) obj2, 11);
                toastKt$Toast$9$17.$onDismiss = obj;
                return toastKt$Toast$9$17;
            case 12:
                ToastKt$Toast$9$1 toastKt$Toast$9$18 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (EndAppLockPresenter) obj2, 12);
                toastKt$Toast$9$18.$onDismiss = obj;
                return toastKt$Toast$9$18;
            case 13:
                ToastKt$Toast$9$1 toastKt$Toast$9$19 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (LocalPosCheckInPresenter) obj2, 13);
                toastKt$Toast$9$19.$onDismiss = obj;
                return toastKt$Toast$9$19;
            case 14:
                ToastKt$Toast$9$1 toastKt$Toast$9$110 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (CardStudioPresenter) obj2, 14);
                toastKt$Toast$9$110.$onDismiss = obj;
                return toastKt$Toast$9$110;
            case 15:
                ToastKt$Toast$9$1 toastKt$Toast$9$111 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (ErrorPresenter) obj2, 15);
                toastKt$Toast$9$111.$onDismiss = obj;
                return toastKt$Toast$9$111;
            case 16:
                ToastKt$Toast$9$1 toastKt$Toast$9$112 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (LocalPosCheckInPresenter) obj2, 16);
                toastKt$Toast$9$112.$onDismiss = obj;
                return toastKt$Toast$9$112;
            case 17:
                ToastKt$Toast$9$1 toastKt$Toast$9$113 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (RealMoreWaysToAddMoneySectionPresenter) obj2, 17);
                toastKt$Toast$9$113.$onDismiss = obj;
                return toastKt$Toast$9$113;
            case 18:
                return new ToastKt$Toast$9$1((BeaconRegionTracker) this.$onDismiss, (BeaconDetectionSetupTeardown) this.$visible$delegate, (LocationPermissionLevel) obj2, continuation, 18);
            case 19:
                ToastKt$Toast$9$1 toastKt$Toast$9$114 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (EndAppLockPresenter) obj2, 19);
                toastKt$Toast$9$114.$onDismiss = obj;
                return toastKt$Toast$9$114;
            case 20:
                ToastKt$Toast$9$1 toastKt$Toast$9$115 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (EndAppLockPresenter) obj2, 20);
                toastKt$Toast$9$115.$onDismiss = obj;
                return toastKt$Toast$9$115;
            case 21:
                return new ToastKt$Toast$9$1((BenefitsHomePresenter) this.$onDismiss, (MutableState) this.$visible$delegate, (State) obj2, continuation, 21);
            case 22:
                ToastKt$Toast$9$1 toastKt$Toast$9$116 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (OffersDetailsPresenter) obj2, 22);
                toastKt$Toast$9$116.$onDismiss = obj;
                return toastKt$Toast$9$116;
            case 23:
                ToastKt$Toast$9$1 toastKt$Toast$9$117 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (ErrorPresenter) obj2, 23);
                toastKt$Toast$9$117.$onDismiss = obj;
                return toastKt$Toast$9$117;
            case 24:
                ToastKt$Toast$9$1 toastKt$Toast$9$118 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (CardStudioPresenter) obj2, 24);
                toastKt$Toast$9$118.$onDismiss = obj;
                return toastKt$Toast$9$118;
            case 25:
                ToastKt$Toast$9$1 toastKt$Toast$9$119 = new ToastKt$Toast$9$1((RealBitcoinGraphModelProvider) this.$visible$delegate, (HistoricalRange) obj2, continuation, 25);
                toastKt$Toast$9$119.$onDismiss = obj;
                return toastKt$Toast$9$119;
            case 26:
                ToastKt$Toast$9$1 toastKt$Toast$9$120 = new ToastKt$Toast$9$1((TapToPayPresenter) obj2, continuation);
                toastKt$Toast$9$120.$visible$delegate = obj;
                return toastKt$Toast$9$120;
            case 27:
                ToastKt$Toast$9$1 toastKt$Toast$9$121 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (AddAliasPresenter) obj2, 27);
                toastKt$Toast$9$121.$onDismiss = obj;
                return toastKt$Toast$9$121;
            case 28:
                ToastKt$Toast$9$1 toastKt$Toast$9$122 = new ToastKt$Toast$9$1((Flow) this.$visible$delegate, continuation, (AddAliasPresenter) obj2, 28);
                toastKt$Toast$9$122.$onDismiss = obj;
                return toastKt$Toast$9$122;
            default:
                return new ToastKt$Toast$9$1((PoolsListPresenter) this.$onDismiss, (MutableState) this.$visible$delegate, (MutableState) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((ToastKt$Toast$9$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x032f, code lost:
    
        if (r2.logRegionEvent(r3, r4, r23) == r1) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02e9, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(30000, r23) == r1) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x05b2, code lost:
    
        if (r1.emit(r3, r23) == r2) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x05a1, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r3, r23) == r2) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0686, code lost:
    
        if (app.cash.molecule.PlatformKt.retryWhenRetryable$default(null, r1, r23, 3) == r7) goto L320;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v38, types: [com.squareup.cash.beacondetection.real.BeaconRegionTracker$Event$RegionExit] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object withContext;
        MutableState mutableState;
        HalfSheetMessage halfSheetMessage;
        zzjr zzjrVar;
        DetailsPage access$getDetailsPage;
        Unit unit;
        String str;
        Object bitcoinAmountEntryCurrencyPreference;
        int i = 3;
        int i2 = 7;
        int i3 = 10;
        int i4 = 12;
        int i5 = 17;
        int i6 = 2;
        int i7 = 1;
        Continuation continuation = null;
        r10 = null;
        String str2 = null;
        continuation = null;
        continuation = null;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean booleanValue = ((Boolean) ((MutableState) this.$visible$delegate).getValue()).booleanValue();
                    MutableState mutableState2 = (MutableState) this.$hasShown$delegate;
                    if (booleanValue) {
                        mutableState2.setValue(Boolean.TRUE);
                    } else if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        Duration.Companion companion = Duration.Companion;
                        long duration = DurationKt.toDuration(200, DurationUnit.MILLISECONDS);
                        this.label = 1;
                        if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ((Function0) this.$onDismiss).invoke();
                return Unit.INSTANCE;
            case 1:
                MutableState mutableState3 = (MutableState) this.$hasShown$delegate;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) ((MutableState) this.$visible$delegate).getValue()).booleanValue()) {
                        mutableState3.setValue(Boolean.TRUE);
                        return Unit.INSTANCE;
                    }
                    SwipeableState$special$$inlined$filter$1 swipeableState$special$$inlined$filter$1 = new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new DatePickerKt$$ExternalSyntheticLambda24((LazyListState) this.$onDismiss, i6)), i6);
                    this.label = 1;
                    if (FlowKt.first(swipeableState$special$$inlined$filter$1, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState3.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$visible$delegate;
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$2 = new LazyPagingItems$collectLoadState$2(coroutineScope, (LocalPosCheckInPresenter) this.$hasShown$delegate, 28);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow.collect(lazyPagingItems$collectLoadState$2, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$visible$delegate;
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$1 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope2, (MusicPresenter) this.$hasShown$delegate, i7);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow2.collect(bitcoinDepositsPresenter$models$2$1$1, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$visible$delegate;
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$12 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope3, (ErrorPresenter) this.$hasShown$delegate, i6);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow3.collect(bitcoinDepositsPresenter$models$2$1$12, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$visible$delegate;
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$3 = new ActivityTabViewKt$ActivityTab$5$1$3(i5, coroutineScope4, (CardStudioPresenter) this.$hasShown$delegate);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow4.collect(activityTabViewKt$ActivityTab$5$1$3, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                MutableState mutableState4 = (MutableState) this.$hasShown$delegate;
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) this.$onDismiss;
                SheetAppMessage sheetAppMessage = (SheetAppMessage) localCashBalancePresenter.syncer;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineContext coroutineContext = (CoroutineContext) localCashBalancePresenter.launcher;
                    MLKitTitleGenerator$1 mLKitTitleGenerator$1 = new MLKitTitleGenerator$1(localCashBalancePresenter, continuation, i4);
                    this.$visible$delegate = mutableState4;
                    this.label = 1;
                    withContext = JobKt.withContext(coroutineContext, mLKitTitleGenerator$1, this);
                    if (withContext != coroutineSingletons7) {
                        mutableState = mutableState4;
                    }
                    return coroutineSingletons7;
                }
                if (i14 != 1) {
                    if (i14 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                MutableState mutableState5 = (MutableState) this.$visible$delegate;
                SafeTrace.throwOnFailure(obj);
                mutableState = mutableState5;
                withContext = obj;
                mutableState.setValue((SheetMessage) withContext);
                Analytics analytics = (Analytics) localCashBalancePresenter.analytics;
                String str3 = sheetAppMessage.messageToken;
                SheetMessage sheetMessage = (SheetMessage) mutableState4.getValue();
                String str4 = (sheetMessage == null || (halfSheetMessage = sheetMessage.message_format) == null || (zzjrVar = halfSheetMessage.secondaryNavigationAction) == null || (access$getDetailsPage = QuirkSettingsLoader.access$getDetailsPage(zzjrVar)) == null) ? null : access$getDetailsPage.token;
                Long l = new Long(((AndroidClock) localCashBalancePresenter.clock).millis());
                String str5 = (String) localCashBalancePresenter.screen;
                DetailsPageInteractViewPage.DetailsPageOrigin detailsPageOrigin = sheetAppMessage.origin;
                SheetMessage sheetMessage2 = (SheetMessage) mutableState4.getValue();
                analytics.track(str4 != null ? new DetailsPageInteractViewPage(null, null, str4, str5, null, detailsPageOrigin, 19) : new AppMessageInteractView(sheetMessage2 != null ? sheetMessage2.metadata_id : null, AppMessageFormat.HALF_SHEET, str3, l, 1), null);
                if (((SheetMessage) mutableState4.getValue()) == null) {
                    ((BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator).goTo(Back.INSTANCE);
                }
                Scene.AnonymousClass1 anonymousClass1 = new Scene.AnonymousClass1(localCashBalancePresenter, continuation, i3);
                this.$visible$delegate = null;
                this.label = 2;
                break;
            case 7:
                FlowCollector flowCollector = (FlowCollector) this.$onDismiss;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Duration.Companion companion2 = Duration.Companion;
                    long duration2 = DurationKt.toDuration(((Long) this.$visible$delegate).longValue(), DurationUnit.SECONDS);
                    this.$onDismiss = flowCollector;
                    this.label = 1;
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken = ((InAppNotificationModel.Ready) this.$hasShown$delegate).dismiss;
                this.$onDismiss = null;
                this.label = 2;
                break;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow safeFlow = new SafeFlow(new ToastKt$Toast$9$1((Long) this.$visible$delegate, (InAppNotificationModel.Ready) this.$hasShown$delegate, continuation, i2));
                    Function1 function1 = ((InAppNotificationView) this.$onDismiss).eventReceiver;
                    if (function1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                    InAppNotificationView$setModel$4$2 inAppNotificationView$setModel$4$2 = new InAppNotificationView$setModel$4$2(0, function1);
                    this.label = 1;
                    if (safeFlow.collect(inAppNotificationView$setModel$4$2, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (JobKt.delay(80L, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((MutableTransitionState) this.$onDismiss).setTargetState(Boolean.FALSE);
                ((Function1) this.$visible$delegate).invoke(new AppMessageViewEvent.AppMessageTemporarilyDismiss((InlineAppMessageV2ViewModel.Ready) this.$hasShown$delegate, null, 2));
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$visible$delegate;
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$13 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope5, (MusicPresenter) this.$hasShown$delegate, 4);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow5.collect(bitcoinDepositsPresenter$models$2$1$13, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 != 0) {
                    if (i19 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Function1 function12 = (Function1) this.$visible$delegate;
                SharedFlowImpl sharedFlowImpl = ((MutableInteractionSourceImpl) this.$hasShown$delegate).interactions;
                SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2 anonymousClass2 = new SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2(i, function12);
                this.$onDismiss = null;
                this.label = 1;
                sharedFlowImpl.collect(anonymousClass2, this);
                return coroutineSingletons12;
            case 12:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$visible$delegate;
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$14 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope6, (EndAppLockPresenter) this.$hasShown$delegate, 6);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow6.collect(bitcoinDepositsPresenter$models$2$1$14, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
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
                CoroutineScope coroutineScope7 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$visible$delegate;
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$15 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope7, (LocalPosCheckInPresenter) this.$hasShown$delegate, i2);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow7.collect(bitcoinDepositsPresenter$models$2$1$15, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$visible$delegate;
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$32 = new ActivityTabViewKt$ActivityTab$5$1$3(20, coroutineScope8, (CardStudioPresenter) this.$hasShown$delegate);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow8.collect(activityTabViewKt$ActivityTab$5$1$32, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.$visible$delegate;
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$16 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope9, (ErrorPresenter) this.$hasShown$delegate, 8);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow9.collect(bitcoinDepositsPresenter$models$2$1$16, this) == coroutineSingletons16) {
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
            case 16:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.$visible$delegate;
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$17 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope10, (LocalPosCheckInPresenter) this.$hasShown$delegate, 9);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow10.collect(bitcoinDepositsPresenter$models$2$1$17, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.$visible$delegate;
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$18 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope11, (RealMoreWaysToAddMoneySectionPresenter) this.$hasShown$delegate, i3);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow11.collect(bitcoinDepositsPresenter$models$2$1$18, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    break;
                } else {
                    if (i26 != 1) {
                        if (i26 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                BeaconRegionTracker beaconRegionTracker = (BeaconRegionTracker) this.$onDismiss;
                synchronized (beaconRegionTracker) {
                    if (beaconRegionTracker.inRegion) {
                        Long l2 = beaconRegionTracker.lastDetectionTime;
                        if (l2 != null) {
                            if (((Number) beaconRegionTracker.clock.invoke()).longValue() - l2.longValue() > beaconRegionTracker.exitTimeoutMs) {
                                beaconRegionTracker.inRegion = false;
                                continuation = BeaconRegionTracker$Event$RegionExit.INSTANCE;
                            }
                        }
                    }
                }
                if (continuation != null) {
                    BeaconDetectionSetupTeardown beaconDetectionSetupTeardown = (BeaconDetectionSetupTeardown) this.$visible$delegate;
                    DetectionContext detectionContext = DetectionContext.BACKGROUND_REGION_EXIT;
                    LocationPermissionLevel locationPermissionLevel = (LocationPermissionLevel) this.$hasShown$delegate;
                    this.label = 2;
                    break;
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.$visible$delegate;
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$19 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope12, (EndAppLockPresenter) this.$hasShown$delegate, 11);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow12.collect(bitcoinDepositsPresenter$models$2$1$19, this) == coroutineSingletons20) {
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
            case 20:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow13 = (Flow) this.$visible$delegate;
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$110 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope13, (EndAppLockPresenter) this.$hasShown$delegate, i4);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow13.collect(bitcoinDepositsPresenter$models$2$1$110, this) == coroutineSingletons21) {
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
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BenefitsHomePresenter benefitsHomePresenter = (BenefitsHomePresenter) this.$onDismiss;
                    CashGreenV1 cashGreenV1 = (CashGreenV1) ((MutableState) this.$visible$delegate).getValue();
                    OverdraftStatus overdraftStatus = (OverdraftStatus) ((State) this.$hasShown$delegate).getValue();
                    this.label = 1;
                    if (cashGreenV1 == null) {
                        unit = Unit.INSTANCE;
                    } else {
                        Analytics analytics2 = benefitsHomePresenter.analytics;
                        BankingBenefitsHomeTapPrimaryCta.PrimaryCtaType primaryCtaType = BankingBenefitsHomeTapPrimaryCta.PrimaryCtaType.Overdraft;
                        analytics2.track(new BankingBenefitsHomeTapPrimaryCta(), null);
                        RealRouter realRouter = benefitsHomePresenter.router;
                        if (overdraftStatus != null) {
                            OverdraftStatus.Button button = overdraftStatus.footer_button_override;
                            if (button == null || (str = button.client_route_url) == null) {
                                OverdraftStatus.Button button2 = overdraftStatus.footer_button;
                                if (button2 != null) {
                                    str2 = button2.client_route_url;
                                }
                            } else {
                                str2 = str;
                            }
                        }
                        realRouter.route(new RoutingParams(null, null, Back.INSTANCE, null, null, null, 503), str2);
                        unit = Unit.INSTANCE;
                    }
                    if (unit == coroutineSingletons22) {
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
            case 22:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow14 = (Flow) this.$visible$delegate;
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$111 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope14, (OffersDetailsPresenter) this.$hasShown$delegate, 13);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow14.collect(bitcoinDepositsPresenter$models$2$1$111, this) == coroutineSingletons23) {
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
            case 23:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow15 = (Flow) this.$visible$delegate;
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$112 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope15, (ErrorPresenter) this.$hasShown$delegate, 14);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow15.collect(bitcoinDepositsPresenter$models$2$1$112, this) == coroutineSingletons24) {
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
            case 24:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow16 = (Flow) this.$visible$delegate;
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$113 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope16, (CardStudioPresenter) this.$hasShown$delegate, 15);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow16.collect(bitcoinDepositsPresenter$models$2$1$113, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                FlowCollector flowCollector2 = (FlowCollector) this.$onDismiss;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBitcoinGraphModelCache realBitcoinGraphModelCache = ((RealBitcoinGraphModelProvider) this.$visible$delegate).bitcoinGraphModelCache;
                    HistoricalRange historicalRange = (HistoricalRange) this.$hasShown$delegate;
                    historicalRange.getClass();
                    BitcoinGraphModel bitcoinGraphModel = (BitcoinGraphModel) realBitcoinGraphModelCache.bitcoinGraphModelCache.get(historicalRange);
                    if (bitcoinGraphModel != null && !bitcoinGraphModel.isStale) {
                        this.$onDismiss = null;
                        this.label = 1;
                        if (flowCollector2.emit(bitcoinGraphModel, this) == coroutineSingletons26) {
                            return coroutineSingletons26;
                        }
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.$visible$delegate;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealProfileManager realProfileManager = (RealProfileManager) ((TapToPayPresenter) this.$hasShown$delegate).profileManager;
                    this.$visible$delegate = null;
                    this.$onDismiss = produceStateScope;
                    this.label = 1;
                    bitcoinAmountEntryCurrencyPreference = realProfileManager.bitcoinAmountEntryCurrencyPreference(this);
                    if (bitcoinAmountEntryCurrencyPreference == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    produceStateScope = (ProduceStateScope) this.$onDismiss;
                    SafeTrace.throwOnFailure(obj);
                    bitcoinAmountEntryCurrencyPreference = obj;
                }
                produceStateScope.setValue(bitcoinAmountEntryCurrencyPreference);
                return Unit.INSTANCE;
            case 27:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow17 = (Flow) this.$visible$delegate;
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$114 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope17, (AddAliasPresenter) this.$hasShown$delegate, 16);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow17.collect(bitcoinDepositsPresenter$models$2$1$114, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineScope coroutineScope18 = (CoroutineScope) this.$onDismiss;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow18 = (Flow) this.$visible$delegate;
                    BitcoinDepositsPresenter$models$2$1$1 bitcoinDepositsPresenter$models$2$1$115 = new BitcoinDepositsPresenter$models$2$1$1(coroutineScope18, (AddAliasPresenter) this.$hasShown$delegate, i5);
                    this.$onDismiss = null;
                    this.label = 1;
                    if (flow18.collect(bitcoinDepositsPresenter$models$2$1$115, this) == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((CryptoAddress$BitcoinAddress) ((MutableState) this.$visible$delegate).getValue()) == null) {
                        this.label = 1;
                        if (JobKt.delay(5000L, this) == coroutineSingletons30) {
                            return coroutineSingletons30;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i37 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ((MutableState) this.$hasShown$delegate).setValue(Boolean.TRUE);
                ((ErrorReporter) ((PoolsListPresenter) this.$onDismiss).flowToken).report(NullWalletAddressError.INSTANCE, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastKt$Toast$9$1(LocalCashBalancePresenter localCashBalancePresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 6;
        this.$onDismiss = localCashBalancePresenter;
        this.$hasShown$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastKt$Toast$9$1(TapToPayPresenter tapToPayPresenter, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 26;
        this.$hasShown$delegate = tapToPayPresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToastKt$Toast$9$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onDismiss = obj;
        this.$visible$delegate = obj2;
        this.$hasShown$delegate = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToastKt$Toast$9$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$visible$delegate = obj;
        this.$hasShown$delegate = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToastKt$Toast$9$1(Object obj, Continuation continuation, Object obj2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$visible$delegate = obj;
        this.$hasShown$delegate = obj2;
    }
}
