package androidx.compose.foundation.gestures;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: IndirectPointerInputDragCycleDetector.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputEventSmoother;", "", "<init>", "()V", "eventRotatingIndex", "", "eventRotatingArray", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "smoothEventPosition", "Landroidx/compose/ui/geometry/Offset;", "change", "smoothEventPosition-tuRUvjQ", "(Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;)J", "Companion", "foundation"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class IndirectPointerInputEventSmoother {
    private static final int SmoothingFactor = 3;
    private MutableObjectList<IndirectPointerInputChange> eventRotatingArray = new MutableObjectList<>(0, 1, null);
    private int eventRotatingIndex;
    public static final int $stable = 8;

    /* renamed from: smoothEventPosition-tuRUvjQ, reason: not valid java name */
    public final long m664smoothEventPositiontuRUvjQ(IndirectPointerInputChange change) {
        boolean changedToUpIgnoreConsumed;
        float intBitsToFloat = Float.intBitsToFloat((int) (change.getPosition() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (change.getPosition() & 4294967295L));
        if (IndirectPointerInputDragCycleDetectorKt.changedToDownIgnoreConsumed(change)) {
            this.eventRotatingIndex = 0;
            this.eventRotatingArray.clear();
        }
        changedToUpIgnoreConsumed = IndirectPointerInputDragCycleDetectorKt.changedToUpIgnoreConsumed(change);
        if (!changedToUpIgnoreConsumed && !IndirectPointerInputDragCycleDetectorKt.changedToDownIgnoreConsumed(change)) {
            if (this.eventRotatingArray.getSize() == 3) {
                MutableObjectList<IndirectPointerInputChange> mutableObjectList = this.eventRotatingArray;
                int i = this.eventRotatingIndex;
                this.eventRotatingIndex = i + 1;
                mutableObjectList.set(i, change);
            } else {
                this.eventRotatingArray.add(change);
            }
            if (this.eventRotatingIndex == 3) {
                this.eventRotatingIndex = 0;
            }
            intBitsToFloat = smoothEventPosition_tuRUvjQ$averageBy(this.eventRotatingArray, new Function1() { // from class: androidx.compose.foundation.gestures.IndirectPointerInputEventSmoother$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    float smoothEventPosition_tuRUvjQ$lambda$1;
                    smoothEventPosition_tuRUvjQ$lambda$1 = IndirectPointerInputEventSmoother.smoothEventPosition_tuRUvjQ$lambda$1((IndirectPointerInputChange) obj);
                    return Float.valueOf(smoothEventPosition_tuRUvjQ$lambda$1);
                }
            });
            intBitsToFloat2 = smoothEventPosition_tuRUvjQ$averageBy(this.eventRotatingArray, new Function1() { // from class: androidx.compose.foundation.gestures.IndirectPointerInputEventSmoother$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    float smoothEventPosition_tuRUvjQ$lambda$2;
                    smoothEventPosition_tuRUvjQ$lambda$2 = IndirectPointerInputEventSmoother.smoothEventPosition_tuRUvjQ$lambda$2((IndirectPointerInputChange) obj);
                    return Float.valueOf(smoothEventPosition_tuRUvjQ$lambda$2);
                }
            });
        }
        return Offset.m6511constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float smoothEventPosition_tuRUvjQ$lambda$1(IndirectPointerInputChange indirectPointerInputChange) {
        return Float.intBitsToFloat((int) (indirectPointerInputChange.getPosition() >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float smoothEventPosition_tuRUvjQ$lambda$2(IndirectPointerInputChange indirectPointerInputChange) {
        return Float.intBitsToFloat((int) (indirectPointerInputChange.getPosition() & 4294967295L));
    }

    private static final <T> float smoothEventPosition_tuRUvjQ$averageBy(ObjectList<T> objectList, Function1<? super T, Float> function1) {
        Object[] objArr = objectList.content;
        int i = objectList._size;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += function1.invoke(objArr[i2]).floatValue();
        }
        return f / objectList.getSize();
    }
}
