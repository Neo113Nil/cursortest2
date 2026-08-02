package com.squareup.cash.fidesmo.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import app.cash.local.backend.CartBuilder;
import app.cash.local.presenters.brand.menu.LocalMenuItemDetailsPresenter;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.analytics.LocalClientCartMenuItemAddedContext;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$$inlined$CollectEffect$1;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $activationPhase$delegate$inlined;
    public final /* synthetic */ MutableState $activityNullable$delegate$inlined;
    public final /* synthetic */ Object $cashAppTags$delegate$inlined;
    public final /* synthetic */ Object $closeRequestedDuringSubmission$delegate$inlined;
    public final /* synthetic */ Object $deliveryCompleted$delegate$inlined;
    public final /* synthetic */ Flow $flow;
    public final /* synthetic */ Object $hasCompletedPreScanInstructions$delegate$inlined;
    public final /* synthetic */ State $lastSyntheticProgressDeliveryState$delegate$inlined;
    public final /* synthetic */ MutableState $nfcRecoveryAvailable$delegate$inlined;
    public final /* synthetic */ Object $provisioningResultSubmission$delegate$inlined;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $shutdownActivities$inlined;
    public final /* synthetic */ Object $shutdownLock$inlined;
    public final /* synthetic */ State $shutdownReasonForCurrentScreen$delegate$inlined;
    public final /* synthetic */ MutableState $syntheticProgressFinishing$delegate$inlined;
    public final /* synthetic */ Object $syntheticProgressPercent$delegate$inlined;
    public final /* synthetic */ Object $syntheticProgressTarget$delegate$inlined;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1(Flow flow, Continuation continuation, LocalMenuItemDetailsPresenter localMenuItemDetailsPresenter, List list, MenuItem menuItem, SnapshotStateMap snapshotStateMap, CartEntryWithQuantity cartEntryWithQuantity, SnapshotStateMap snapshotStateMap2, SnapshotStateMap snapshotStateMap3, CartBuilder cartBuilder, LocationMenu locationMenu, LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData menuItemAddedContextComboData, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, State state, MutableState mutableState, State state2, State state3, MutableState mutableState2) {
        super(2, continuation);
        this.$flow = flow;
        this.$shutdownLock$inlined = localMenuItemDetailsPresenter;
        this.this$0 = list;
        this.$cashAppTags$delegate$inlined = menuItem;
        this.$hasCompletedPreScanInstructions$delegate$inlined = snapshotStateMap;
        this.$activationPhase$delegate$inlined = cartEntryWithQuantity;
        this.$deliveryCompleted$delegate$inlined = snapshotStateMap2;
        this.$provisioningResultSubmission$delegate$inlined = snapshotStateMap3;
        this.$closeRequestedDuringSubmission$delegate$inlined = cartBuilder;
        this.$syntheticProgressPercent$delegate$inlined = locationMenu;
        this.$syntheticProgressTarget$delegate$inlined = menuItemAddedContextComboData;
        this.$syntheticProgressFinishing$delegate$inlined = parcelableSnapshotMutableIntState;
        this.$lastSyntheticProgressDeliveryState$delegate$inlined = state;
        this.$activityNullable$delegate$inlined = mutableState;
        this.$shutdownReasonForCurrentScreen$delegate$inlined = state2;
        this.$shutdownActivities$inlined = state3;
        this.$nfcRecoveryAvailable$delegate$inlined = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$shutdownLock$inlined;
        Object obj3 = this.$syntheticProgressTarget$delegate$inlined;
        Object obj4 = this.$shutdownActivities$inlined;
        Object obj5 = this.$syntheticProgressPercent$delegate$inlined;
        Object obj6 = this.$closeRequestedDuringSubmission$delegate$inlined;
        Object obj7 = this.$provisioningResultSubmission$delegate$inlined;
        Object obj8 = this.$deliveryCompleted$delegate$inlined;
        Object obj9 = this.$activationPhase$delegate$inlined;
        Object obj10 = this.$hasCompletedPreScanInstructions$delegate$inlined;
        Object obj11 = this.$cashAppTags$delegate$inlined;
        Object obj12 = this.this$0;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj3;
                MutableState mutableState2 = (MutableState) this.$lastSyntheticProgressDeliveryState$delegate$inlined;
                MutableState mutableState3 = (MutableState) this.$shutdownReasonForCurrentScreen$delegate$inlined;
                Object obj13 = this.$shutdownLock$inlined;
                Set set = (Set) obj4;
                FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1 fidesmoProvisioningPresenter$models$$inlined$CollectEffect$1 = new FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1(this.$flow, continuation, (FidesmoProvisioningPresenter) obj12, this.$activityNullable$delegate$inlined, this.$nfcRecoveryAvailable$delegate$inlined, (MutableState) obj11, (MutableState) obj10, (MutableState) obj9, (MutableState) obj8, (MutableState) obj7, (MutableState) obj6, (MutableState) obj5, mutableState, this.$syntheticProgressFinishing$delegate$inlined, mutableState2, mutableState3, obj13, set);
                fidesmoProvisioningPresenter$models$$inlined$CollectEffect$1.L$0 = obj;
                return fidesmoProvisioningPresenter$models$$inlined$CollectEffect$1;
            case 1:
                MutableState mutableState4 = this.$nfcRecoveryAvailable$delegate$inlined;
                Flow flow = this.$flow;
                FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1 fidesmoProvisioningPresenter$models$$inlined$CollectEffect$12 = new FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1(flow, continuation, (LocalMenuItemDetailsPresenter) obj2, (List) obj12, (MenuItem) obj11, (SnapshotStateMap) obj10, (CartEntryWithQuantity) obj9, (SnapshotStateMap) obj8, (SnapshotStateMap) obj7, (CartBuilder) obj6, (LocationMenu) obj5, (LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData) obj3, (ParcelableSnapshotMutableIntState) this.$syntheticProgressFinishing$delegate$inlined, this.$lastSyntheticProgressDeliveryState$delegate$inlined, this.$activityNullable$delegate$inlined, this.$shutdownReasonForCurrentScreen$delegate$inlined, (State) obj4, mutableState4);
                fidesmoProvisioningPresenter$models$$inlined$CollectEffect$12.L$0 = obj;
                return fidesmoProvisioningPresenter$models$$inlined$CollectEffect$12;
            default:
                State state = (State) obj4;
                MutableState mutableState5 = (MutableState) obj3;
                MutableState mutableState6 = this.$syntheticProgressFinishing$delegate$inlined;
                FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1 fidesmoProvisioningPresenter$models$$inlined$CollectEffect$13 = new FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1(this.$flow, continuation, (BitcoinTransferPresenter) obj2, (CoroutineScope) obj12, this.$activityNullable$delegate$inlined, this.$nfcRecoveryAvailable$delegate$inlined, this.$lastSyntheticProgressDeliveryState$delegate$inlined, (MutableState) obj11, (MutableState) obj10, (MutableState) obj9, (MutableState) obj8, this.$shutdownReasonForCurrentScreen$delegate$inlined, (MutableState) obj7, (MutableState) obj6, (MutableState) obj5, state, mutableState5, mutableState6);
                fidesmoProvisioningPresenter$models$$inlined$CollectEffect$13.L$0 = obj;
                return fidesmoProvisioningPresenter$models$$inlined$CollectEffect$13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$shutdownLock$inlined;
        Object obj3 = this.$syntheticProgressTarget$delegate$inlined;
        Object obj4 = this.$shutdownActivities$inlined;
        Object obj5 = this.$syntheticProgressPercent$delegate$inlined;
        Object obj6 = this.$closeRequestedDuringSubmission$delegate$inlined;
        Object obj7 = this.$provisioningResultSubmission$delegate$inlined;
        Object obj8 = this.$deliveryCompleted$delegate$inlined;
        Object obj9 = this.$activationPhase$delegate$inlined;
        Object obj10 = this.$hasCompletedPreScanInstructions$delegate$inlined;
        Object obj11 = this.$cashAppTags$delegate$inlined;
        Object obj12 = this.this$0;
        Flow flow = this.$flow;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState = (MutableState) obj3;
                    MutableState mutableState2 = (MutableState) this.$lastSyntheticProgressDeliveryState$delegate$inlined;
                    MutableState mutableState3 = (MutableState) this.$shutdownReasonForCurrentScreen$delegate$inlined;
                    Object obj13 = this.$shutdownLock$inlined;
                    Set set = (Set) obj4;
                    MainPaymentPresenter$models$$inlined$CollectEffect$1.AnonymousClass1 anonymousClass1 = new MainPaymentPresenter$models$$inlined$CollectEffect$1.AnonymousClass1(coroutineScope, (FidesmoProvisioningPresenter) obj12, this.$activityNullable$delegate$inlined, this.$nfcRecoveryAvailable$delegate$inlined, (MutableState) obj11, (MutableState) obj10, (MutableState) obj9, (MutableState) obj8, (MutableState) obj7, (MutableState) obj6, (MutableState) obj5, mutableState, this.$syntheticProgressFinishing$delegate$inlined, mutableState2, mutableState3, obj13, set);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MainPaymentPresenter$models$$inlined$CollectEffect$1.AnonymousClass1 anonymousClass12 = new MainPaymentPresenter$models$$inlined$CollectEffect$1.AnonymousClass1(coroutineScope2, (LocalMenuItemDetailsPresenter) obj2, (List) obj12, (MenuItem) obj11, (SnapshotStateMap) obj10, (CartEntryWithQuantity) obj9, (SnapshotStateMap) obj8, (SnapshotStateMap) obj7, (CartBuilder) obj6, (LocationMenu) obj5, (LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData) obj3, (ParcelableSnapshotMutableIntState) this.$syntheticProgressFinishing$delegate$inlined, this.$lastSyntheticProgressDeliveryState$delegate$inlined, this.$activityNullable$delegate$inlined, this.$shutdownReasonForCurrentScreen$delegate$inlined, (State) obj4, this.$nfcRecoveryAvailable$delegate$inlined);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass12, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState4 = (MutableState) obj6;
                    MutableState mutableState5 = (MutableState) obj5;
                    State state = (State) obj4;
                    MutableState mutableState6 = (MutableState) obj3;
                    MutableState mutableState7 = this.$syntheticProgressFinishing$delegate$inlined;
                    MainPaymentPresenter$models$$inlined$CollectEffect$1.AnonymousClass1 anonymousClass13 = new MainPaymentPresenter$models$$inlined$CollectEffect$1.AnonymousClass1(coroutineScope3, (BitcoinTransferPresenter) obj2, (CoroutineScope) obj12, this.$activityNullable$delegate$inlined, this.$nfcRecoveryAvailable$delegate$inlined, this.$lastSyntheticProgressDeliveryState$delegate$inlined, (MutableState) obj11, (MutableState) obj10, (MutableState) obj9, (MutableState) obj8, this.$shutdownReasonForCurrentScreen$delegate$inlined, (MutableState) obj7, mutableState4, mutableState5, state, mutableState6, mutableState7);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass13, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
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
    public FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1(Flow flow, Continuation continuation, BitcoinTransferPresenter bitcoinTransferPresenter, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, State state, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, State state2, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, State state3, MutableState mutableState10, MutableState mutableState11) {
        super(2, continuation);
        this.$flow = flow;
        this.$shutdownLock$inlined = bitcoinTransferPresenter;
        this.this$0 = coroutineScope;
        this.$activityNullable$delegate$inlined = mutableState;
        this.$nfcRecoveryAvailable$delegate$inlined = mutableState2;
        this.$lastSyntheticProgressDeliveryState$delegate$inlined = state;
        this.$cashAppTags$delegate$inlined = mutableState3;
        this.$hasCompletedPreScanInstructions$delegate$inlined = mutableState4;
        this.$activationPhase$delegate$inlined = mutableState5;
        this.$deliveryCompleted$delegate$inlined = mutableState6;
        this.$shutdownReasonForCurrentScreen$delegate$inlined = state2;
        this.$provisioningResultSubmission$delegate$inlined = mutableState7;
        this.$closeRequestedDuringSubmission$delegate$inlined = mutableState8;
        this.$syntheticProgressPercent$delegate$inlined = mutableState9;
        this.$shutdownActivities$inlined = state3;
        this.$syntheticProgressTarget$delegate$inlined = mutableState10;
        this.$syntheticProgressFinishing$delegate$inlined = mutableState11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidesmoProvisioningPresenter$models$$inlined$CollectEffect$1(Flow flow, Continuation continuation, FidesmoProvisioningPresenter fidesmoProvisioningPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, Object obj, Set set) {
        super(2, continuation);
        this.$flow = flow;
        this.this$0 = fidesmoProvisioningPresenter;
        this.$activityNullable$delegate$inlined = mutableState;
        this.$nfcRecoveryAvailable$delegate$inlined = mutableState2;
        this.$cashAppTags$delegate$inlined = mutableState3;
        this.$hasCompletedPreScanInstructions$delegate$inlined = mutableState4;
        this.$activationPhase$delegate$inlined = mutableState5;
        this.$deliveryCompleted$delegate$inlined = mutableState6;
        this.$provisioningResultSubmission$delegate$inlined = mutableState7;
        this.$closeRequestedDuringSubmission$delegate$inlined = mutableState8;
        this.$syntheticProgressPercent$delegate$inlined = mutableState9;
        this.$syntheticProgressTarget$delegate$inlined = mutableState10;
        this.$syntheticProgressFinishing$delegate$inlined = mutableState11;
        this.$lastSyntheticProgressDeliveryState$delegate$inlined = mutableState12;
        this.$shutdownReasonForCurrentScreen$delegate$inlined = mutableState13;
        this.$shutdownLock$inlined = obj;
        this.$shutdownActivities$inlined = set;
    }
}
