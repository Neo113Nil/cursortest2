package com.squareup.cash.paychecks.views;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda2;
import bo.app.ta$$ExternalSyntheticLambda1;
import com.squareup.cash.bitcoin.presenters.RealBitcoinKeypadStateStore$models$2$1;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.common.composeui.SegmentedCircleInteractableState;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes6.dex */
public final class DistributionWheelGesturesKt$handleGestures$1$1$1 implements PointerInputEventHandler {
    public final /* synthetic */ MutableState $currentModel$delegate;
    public final /* synthetic */ State $interactiveSegmentIndex$delegate;
    public final /* synthetic */ Object $onDrag;
    public final /* synthetic */ Object $onDragComplete;
    public final /* synthetic */ Object $onStartDrag;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $startingAngleOfInteractiveSegment$delegate;
    public final /* synthetic */ Object $wheelInteractableState;

    public DistributionWheelGesturesKt$handleGestures$1$1$1(CardScene cardScene, CoroutineScope coroutineScope, State state, MutableSharedFlow mutableSharedFlow, MutableState mutableState, MutableState mutableState2, MutableSharedFlow mutableSharedFlow2) {
        this.$wheelInteractableState = cardScene;
        this.$onDragComplete = coroutineScope;
        this.$interactiveSegmentIndex$delegate = state;
        this.$onStartDrag = mutableSharedFlow;
        this.$currentModel$delegate = mutableState;
        this.$onDrag = mutableState2;
        this.$startingAngleOfInteractiveSegment$delegate = mutableSharedFlow2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.$startingAngleOfInteractiveSegment$delegate;
        Object obj2 = this.$onDrag;
        Object obj3 = this.$onStartDrag;
        Object obj4 = this.$onDragComplete;
        Object obj5 = this.$wheelInteractableState;
        switch (i) {
            case 0:
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                BankingConfigQueries$$ExternalSyntheticLambda0 bankingConfigQueries$$ExternalSyntheticLambda0 = new BankingConfigQueries$$ExternalSyntheticLambda0((SegmentedCircleInteractableState) obj5, ref$BooleanRef, pointerInputScope, ref$ObjectRef2, 28);
                State state = this.$interactiveSegmentIndex$delegate;
                Object detectDragGestures$default = DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, bankingConfigQueries$$ExternalSyntheticLambda0, new ta$$ExternalSyntheticLambda1(ref$BooleanRef, ref$ObjectRef, ref$ObjectRef2, (Function2) obj4, state, 18), new NavHostKt$$ExternalSyntheticLambda2(ref$BooleanRef, ref$ObjectRef2, pointerInputScope, ref$ObjectRef, this.$currentModel$delegate, state, (State) obj, (Function2) obj3, (Function2) obj2), continuation, 4);
                if (detectDragGestures$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object coroutineScope = JobKt.coroutineScope(new RealBitcoinKeypadStateStore$models$2$1(pointerInputScope, (CardScene) obj5, (CoroutineScope) obj4, this.$interactiveSegmentIndex$delegate, (MutableSharedFlow) obj3, this.$currentModel$delegate, (MutableState) obj2, (MutableSharedFlow) obj, null), continuation);
                if (coroutineScope != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public DistributionWheelGesturesKt$handleGestures$1$1$1(SegmentedCircleInteractableState segmentedCircleInteractableState, Function2 function2, State state, MutableState mutableState, State state2, Function2 function22, Function2 function23) {
        this.$wheelInteractableState = segmentedCircleInteractableState;
        this.$onDragComplete = function2;
        this.$interactiveSegmentIndex$delegate = state;
        this.$currentModel$delegate = mutableState;
        this.$startingAngleOfInteractiveSegment$delegate = state2;
        this.$onStartDrag = function22;
        this.$onDrag = function23;
    }
}
