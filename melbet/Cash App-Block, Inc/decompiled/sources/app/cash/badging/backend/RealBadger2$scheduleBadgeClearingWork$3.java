package app.cash.badging.backend;

import android.util.Log;
import androidx.camera.camera2.impl.UseCaseCameraImpl;
import androidx.camera.camera2.pipe.compat.Camera2CameraController;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.focus.FocusRequester;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.work.Constraints;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import coil3.Extras;
import coil3.size.SizeKt;
import com.squareup.cash.cdf.offers.AppLocation;
import com.squareup.cash.cdf.offers.OfferState;
import com.squareup.cash.cdf.offers.OffersTapOpenOfferView;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.marketing.components.TooltipState;
import com.squareup.cash.marketing.components.TooltipState$hide$1;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreenV2;
import com.squareup.cash.paymentpad.views.MainPaymentPadViewKt;
import com.squareup.cash.wallet.backend.api.WalletAnalyticsHelper$Flow;
import com.squareup.cash.wallet.backend.real.RealWalletAnalyticsHelper;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.util.workmanager.AndroidWorkManager;
import com.squareup.wire.GrpcMethod;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;
import timber.log.Timber;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class RealBadger2$scheduleBadgeClearingWork$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBadger2$scheduleBadgeClearingWork$3(Continuation continuation, UseCaseCameraImpl useCaseCameraImpl, boolean z) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.this$0 = useCaseCameraImpl;
        this.Z$0 = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                RealBadger2$scheduleBadgeClearingWork$3 realBadger2$scheduleBadgeClearingWork$3 = new RealBadger2$scheduleBadgeClearingWork$3((RealBadger2) this.this$0, continuation, 0);
                realBadger2$scheduleBadgeClearingWork$3.Z$0 = ((Boolean) obj).booleanValue();
                return realBadger2$scheduleBadgeClearingWork$3;
            case 1:
                return new RealBadger2$scheduleBadgeClearingWork$3(continuation, (UseCaseCameraImpl) this.this$0, this.Z$0);
            case 2:
                RealBadger2$scheduleBadgeClearingWork$3 realBadger2$scheduleBadgeClearingWork$32 = new RealBadger2$scheduleBadgeClearingWork$3((TooltipStateImpl) this.this$0, continuation, 2);
                realBadger2$scheduleBadgeClearingWork$32.Z$0 = ((Boolean) obj).booleanValue();
                return realBadger2$scheduleBadgeClearingWork$32;
            case 3:
                return new RealBadger2$scheduleBadgeClearingWork$3((MutableTransitionState) this.this$0, this.Z$0, continuation, 3);
            case 4:
                return new RealBadger2$scheduleBadgeClearingWork$3(this.Z$0, (FocusRequester) this.this$0, continuation, 4);
            case 5:
                return new RealBadger2$scheduleBadgeClearingWork$3(this.Z$0, (Function0) this.this$0, continuation, 5);
            case 6:
                RealBadger2$scheduleBadgeClearingWork$3 realBadger2$scheduleBadgeClearingWork$33 = new RealBadger2$scheduleBadgeClearingWork$3(this.Z$0, continuation);
                realBadger2$scheduleBadgeClearingWork$33.this$0 = obj;
                return realBadger2$scheduleBadgeClearingWork$33;
            case 7:
                return new RealBadger2$scheduleBadgeClearingWork$3(this.Z$0, (ParcelableSnapshotMutableIntState) this.this$0, continuation, 7);
            case 8:
                return new RealBadger2$scheduleBadgeClearingWork$3(this.Z$0, (TooltipState) this.this$0, continuation, 8);
            case 9:
                return new RealBadger2$scheduleBadgeClearingWork$3((CardSchemePresenter) this.this$0, this.Z$0, continuation, 9);
            default:
                return new RealBadger2$scheduleBadgeClearingWork$3((FinancialConnectionsSheetNativeViewModel) this.this$0, this.Z$0, continuation, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                break;
        }
        return ((RealBadger2$scheduleBadgeClearingWork$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OfferState offerState;
        Object value;
        Map map;
        switch (this.$r8$classId) {
            case 0:
                Extras.Key key = ((RealBadger2) this.this$0).badgingWorkEnqueuer;
                boolean z = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z) {
                    Timber.Forest.i("Queuing badge clear work.", new Object[0]);
                    AndroidWorkManager androidWorkManager = (AndroidWorkManager) key.f61default;
                    ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.KEEP;
                    GrpcMethod OneTimeWorkRequestBuilder = SizeKt.OneTimeWorkRequestBuilder(BadgeClearingWorker.class, (Pair[]) Arrays.copyOf(new Pair[0], 0));
                    NetworkType networkType = NetworkType.NOT_REQUIRED;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Constraints constraints = new Constraints(new NetworkRequestCompat(null), NetworkType.CONNECTED, false, false, false, false, -1L, -1L, CollectionsKt.toSet(linkedHashSet));
                    WorkSpec workSpec = (WorkSpec) OneTimeWorkRequestBuilder.requestAdapter;
                    workSpec.constraints = constraints;
                    OutOfQuotaPolicy outOfQuotaPolicy = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
                    workSpec.expedited = true;
                    workSpec.outOfQuotaPolicy = outOfQuotaPolicy;
                    androidWorkManager.enqueueUniqueWork("BadgeClearingWorker", existingWorkPolicy, OneTimeWorkRequestBuilder.build());
                } else {
                    Timber.Forest.i("Cancelling badge clear work because there is no more work to do.", new Object[0]);
                    ((AndroidWorkManager) key.f61default).cancelUniqueWork("BadgeClearingWorker");
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!((UseCaseCameraImpl) this.this$0).closed.getValue()) {
                    CameraGraphImpl graph = ((UseCaseCameraImpl) this.this$0).useCaseGraphContext.getGraph();
                    boolean z2 = this.Z$0;
                    Camera2CameraController camera2CameraController = graph.cameraController;
                    synchronized (camera2CameraController.lock) {
                        camera2CameraController._isForeground = z2;
                    }
                } else if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "UseCaseCamera is closed before setActiveResumeMode, skipping setup.");
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!this.Z$0) {
                    ((TooltipStateImpl) this.this$0).dismiss();
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((MutableTransitionState) this.this$0).setTargetState(Boolean.valueOf(this.Z$0));
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (this.Z$0) {
                    FocusRequester.m605requestFocus3ESFkO8$default((FocusRequester) this.this$0);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (this.Z$0) {
                    ((Function0) this.this$0).invoke();
                }
                return Unit.INSTANCE;
            case 6:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (this.Z$0) {
                    produceStateScope.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 7:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.this$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (this.Z$0) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = MainPaymentPadViewKt.LocalElementBoundsRegistry;
                    NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (this.Z$0) {
                    TooltipState tooltipState = (TooltipState) this.this$0;
                    JobKt.launch$default(tooltipState.scope, null, null, new TooltipState$hide$1(tooltipState, null, 1), 3);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardSchemePresenter cardSchemePresenter = (CardSchemePresenter) this.this$0;
                Boolean valueOf = Boolean.valueOf(this.Z$0);
                Analytics analytics = cardSchemePresenter.analytics;
                RealWalletAnalyticsHelper realWalletAnalyticsHelper = cardSchemePresenter.analyticsHelper;
                WalletAnalyticsHelper$Flow[] walletAnalyticsHelper$FlowArr = WalletAnalyticsHelper$Flow.$VALUES;
                String flowToken = realWalletAnalyticsHelper.getFlowToken();
                AppLocation appLocation = AppLocation.CardTab;
                if (valueOf.equals(Boolean.TRUE)) {
                    offerState = OfferState.ACTIVE;
                } else {
                    if (!valueOf.equals(Boolean.FALSE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    offerState = OfferState.INACTIVE;
                }
                analytics.track(new OffersTapOpenOfferView(flowToken, appLocation, offerState), null);
                cardSchemePresenter.navigator.goTo(OffersScreen$OffersHomeScreenV2.INSTANCE);
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel = (FinancialConnectionsSheetNativeViewModel) this.this$0;
                boolean z3 = this.Z$0;
                StateFlowImpl stateFlowImpl = financialConnectionsSheetNativeViewModel.topAppBarStateUpdatesByPane;
                Object value2 = financialConnectionsSheetNativeViewModel.currentPane.getValue();
                stateFlowImpl.getClass();
                do {
                    value = stateFlowImpl.getValue();
                    map = (Map) value;
                    Object obj2 = map.get(value2);
                    if (obj2 != null) {
                        map = MapsKt__MapsKt.plus(map, MapsKt__MapsJVMKt.mapOf(new Pair(value2, TopAppBarState.copy$default((TopAppBarState) obj2, null, false, false, false, z3, null, false, 895))));
                    }
                } while (!stateFlowImpl.compareAndSet(value, map));
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBadger2$scheduleBadgeClearingWork$3(Object obj, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.Z$0 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBadger2$scheduleBadgeClearingWork$3(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBadger2$scheduleBadgeClearingWork$3(boolean z, Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.Z$0 = z;
        this.this$0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBadger2$scheduleBadgeClearingWork$3(boolean z, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 6;
        this.Z$0 = z;
    }
}
