package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.unit.Density;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda5;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ModalBottomSheetState {
    public final AnchoredDraggableState anchoredDraggableState;
    public final boolean isSkipHalfExpanded;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModalBottomSheetValue.values().length];
            try {
                ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, Density density, Function1 function1, AnimationSpec animationSpec, boolean z) {
        this.isSkipHalfExpanded = z;
        this.anchoredDraggableState = new AnchoredDraggableState(modalBottomSheetValue, new ToastKt$$ExternalSyntheticLambda5(density, 1), new ModalBottomSheetState$$ExternalSyntheticLambda1(density, 0), animationSpec, function1);
        if (z && modalBottomSheetValue == ModalBottomSheetValue.HalfExpanded) {
            a$$ExternalSyntheticBUOutline0.m$3("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
            throw null;
        }
    }

    public static Object animateTo$material$default(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, ContinuationImpl continuationImpl) {
        Object animateTo = CardKt.animateTo(modalBottomSheetState.anchoredDraggableState, modalBottomSheetValue, ((ParcelableSnapshotMutableFloatState) modalBottomSheetState.anchoredDraggableState.lastVelocity$delegate).getFloatValue(), continuationImpl);
        return animateTo == CoroutineSingletons.COROUTINE_SUSPENDED ? animateTo : Unit.INSTANCE;
    }

    public final Object hide(ContinuationImpl continuationImpl) {
        Object animateTo$material$default = animateTo$material$default(this, ModalBottomSheetValue.Hidden, continuationImpl);
        return animateTo$material$default == CoroutineSingletons.COROUTINE_SUSPENDED ? animateTo$material$default : Unit.INSTANCE;
    }

    public final boolean isVisible() {
        return ((ParcelableSnapshotMutableState) this.anchoredDraggableState.currentValue$delegate).getValue() != ModalBottomSheetValue.Hidden;
    }

    public final Object show(SuspendLambda suspendLambda) {
        AnchoredDraggableState anchoredDraggableState = this.anchoredDraggableState;
        MapDraggableAnchors anchors = anchoredDraggableState.getAnchors();
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        boolean containsKey = anchors.anchors.containsKey(modalBottomSheetValue);
        if (WhenMappings.$EnumSwitchMapping$0[((ModalBottomSheetValue) ((ParcelableSnapshotMutableState) anchoredDraggableState.currentValue$delegate).getValue()).ordinal()] == 1) {
            MapDraggableAnchors anchors2 = anchoredDraggableState.getAnchors();
            ModalBottomSheetValue modalBottomSheetValue2 = ModalBottomSheetValue.HalfExpanded;
            if (anchors2.anchors.containsKey(modalBottomSheetValue2)) {
                modalBottomSheetValue = modalBottomSheetValue2;
            }
        } else if (!containsKey) {
            modalBottomSheetValue = ModalBottomSheetValue.Hidden;
        }
        Object animateTo$material$default = animateTo$material$default(this, modalBottomSheetValue, suspendLambda);
        return animateTo$material$default == CoroutineSingletons.COROUTINE_SUSPENDED ? animateTo$material$default : Unit.INSTANCE;
    }
}
