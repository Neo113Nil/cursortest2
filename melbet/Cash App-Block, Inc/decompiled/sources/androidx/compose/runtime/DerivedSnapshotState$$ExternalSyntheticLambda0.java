package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class DerivedSnapshotState$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ DerivedSnapshotState$$ExternalSyntheticLambda0(TextFieldCoreModifierNode textFieldCoreModifierNode, int i, Placeable placeable, MeasureScope measureScope) {
        this.f$0 = textFieldCoreModifierNode;
        this.f$3 = i;
        this.f$1 = placeable;
        this.f$2 = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                IntRef intRef = (IntRef) obj3;
                MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) obj2;
                if (obj == ((DerivedSnapshotState) obj4)) {
                    a$$ExternalSyntheticBUOutline0.m$1("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof StateObject) {
                    int i2 = intRef.element - this.f$3;
                    int findKeyIndex = mutableObjectIntMap.findKeyIndex(obj);
                    mutableObjectIntMap.set(Math.min(i2, findKeyIndex >= 0 ? mutableObjectIntMap.values[findKeyIndex] : Integer.MAX_VALUE), obj);
                }
                return Unit.INSTANCE;
            default:
                TextFieldCoreModifierNode textFieldCoreModifierNode = (TextFieldCoreModifierNode) obj4;
                Placeable placeable = (Placeable) obj3;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                textFieldCoreModifierNode.m406updateScrollStatetIlFzwE(placementScope, this.f$3, placeable.width, textFieldCoreModifierNode.textFieldState.getVisualText().selection, ((MeasureScope) obj2).getLayoutDirection());
                placementScope.placeRelative(placeable, -textFieldCoreModifierNode.scrollState.value$delegate.getIntValue(), 0, RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DerivedSnapshotState$$ExternalSyntheticLambda0(DerivedSnapshotState derivedSnapshotState, IntRef intRef, MutableObjectIntMap mutableObjectIntMap, int i) {
        this.f$0 = derivedSnapshotState;
        this.f$1 = intRef;
        this.f$2 = mutableObjectIntMap;
        this.f$3 = i;
    }
}
