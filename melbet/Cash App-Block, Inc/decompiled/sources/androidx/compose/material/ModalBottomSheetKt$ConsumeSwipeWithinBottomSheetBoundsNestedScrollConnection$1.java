package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 implements NestedScrollConnection {
    public final /* synthetic */ AnchoredDraggableState $state;

    public ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(AnchoredDraggableState anchoredDraggableState) {
        Orientation orientation = Orientation.Vertical;
        this.$state = anchoredDraggableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo241onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1;
        int i;
        if (continuation instanceof ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) {
            modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 = (ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) continuation;
            int i2 = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Orientation orientation = Orientation.Vertical;
                    float m1068getYimpl = Velocity.m1068getYimpl(j2);
                    modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.J$0 = j2;
                    modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label = 1;
                    if (this.$state.settle(m1068getYimpl, modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.J$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return new Velocity(j2);
            }
        }
        modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 = new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1(this, (ContinuationImpl) continuation);
        Object obj2 = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label;
        if (i != 0) {
        }
        return new Velocity(j2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo242onPostScrollDzOQY0M(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        Orientation orientation = Orientation.Vertical;
        float intBitsToFloat = Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j2));
        AnchoredDraggableState anchoredDraggableState = this.$state;
        float newOffsetForDelta$material = anchoredDraggableState.newOffsetForDelta$material(intBitsToFloat);
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) anchoredDraggableState.offset$delegate;
        float floatValue = Float.isNaN(parcelableSnapshotMutableFloatState.getFloatValue()) ? RecyclerView.DECELERATION_RATE : parcelableSnapshotMutableFloatState.getFloatValue();
        parcelableSnapshotMutableFloatState.setFloatValue(newOffsetForDelta$material);
        return toOffset(newOffsetForDelta$material - floatValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo493onPreFlingQWom1Mo(long j, Continuation continuation) {
        ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1;
        int i;
        if (continuation instanceof ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) {
            modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 = (ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) continuation;
            int i2 = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Orientation orientation = Orientation.Vertical;
                    float m1068getYimpl = Velocity.m1068getYimpl(j);
                    AnchoredDraggableState anchoredDraggableState = this.$state;
                    float requireOffset = anchoredDraggableState.requireOffset();
                    if (m1068getYimpl < RecyclerView.DECELERATION_RATE) {
                        Float m4125minOrNull = CollectionsKt.m4125minOrNull((Iterable) anchoredDraggableState.getAnchors().anchors.values());
                        if (requireOffset > (m4125minOrNull != null ? m4125minOrNull.floatValue() : Float.NaN)) {
                            modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.J$0 = j;
                            modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label = 1;
                            if (anchoredDraggableState.settle(m1068getYimpl, modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    j = 0;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.J$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return new Velocity(j);
            }
        }
        modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 = new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1(this, (ContinuationImpl) continuation);
        Object obj2 = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label;
        if (i != 0) {
        }
        return new Velocity(j);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo326onPreScrollOzD1aCk(int i, long j) {
        Orientation orientation = Orientation.Vertical;
        float intBitsToFloat = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        float f = RecyclerView.DECELERATION_RATE;
        if (intBitsToFloat >= RecyclerView.DECELERATION_RATE || i != 1) {
            return 0L;
        }
        AnchoredDraggableState anchoredDraggableState = this.$state;
        float newOffsetForDelta$material = anchoredDraggableState.newOffsetForDelta$material(intBitsToFloat);
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) anchoredDraggableState.offset$delegate;
        if (!Float.isNaN(parcelableSnapshotMutableFloatState.getFloatValue())) {
            f = parcelableSnapshotMutableFloatState.getFloatValue();
        }
        parcelableSnapshotMutableFloatState.setFloatValue(newOffsetForDelta$material);
        return toOffset(newOffsetForDelta$material - f);
    }

    public final long toOffset(float f) {
        Orientation orientation = Orientation.Vertical;
        Orientation orientation2 = Orientation.Vertical;
        return (Float.floatToRawIntBits(f) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32);
    }
}
