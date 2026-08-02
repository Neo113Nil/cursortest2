package androidx.compose.foundation.lazy.layout;

import androidx.camera.video.Recorder;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsProviderModifierNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class LazyLayoutBeyondBoundsModifierElement extends ModifierNodeElement {
    public final Recorder.AnonymousClass6 beyondBoundsInfo;
    public final Orientation orientation;
    public final LazyLayoutBeyondBoundsState state;

    public LazyLayoutBeyondBoundsModifierElement(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, Recorder.AnonymousClass6 anonymousClass6, Orientation orientation) {
        this.state = lazyLayoutBeyondBoundsState;
        this.beyondBoundsInfo = anonymousClass6;
        this.orientation = orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        LazyLayoutBeyondBoundsProviderModifierNode lazyLayoutBeyondBoundsProviderModifierNode = new LazyLayoutBeyondBoundsProviderModifierNode();
        lazyLayoutBeyondBoundsProviderModifierNode.state = this.state;
        lazyLayoutBeyondBoundsProviderModifierNode.beyondBoundsInfo = this.beyondBoundsInfo;
        lazyLayoutBeyondBoundsProviderModifierNode.orientation = this.orientation;
        return lazyLayoutBeyondBoundsProviderModifierNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return Intrinsics.areEqual(this.state, lazyLayoutBeyondBoundsModifierElement.state) && Intrinsics.areEqual(this.beyondBoundsInfo, lazyLayoutBeyondBoundsModifierElement.beyondBoundsInfo) && this.orientation == lazyLayoutBeyondBoundsModifierElement.orientation;
    }

    public final int hashCode() {
        return this.orientation.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.beyondBoundsInfo.hashCode() + (this.state.hashCode() * 31)) * 31, 31, false);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        LazyLayoutBeyondBoundsProviderModifierNode lazyLayoutBeyondBoundsProviderModifierNode = (LazyLayoutBeyondBoundsProviderModifierNode) node;
        lazyLayoutBeyondBoundsProviderModifierNode.state = this.state;
        lazyLayoutBeyondBoundsProviderModifierNode.beyondBoundsInfo = this.beyondBoundsInfo;
        lazyLayoutBeyondBoundsProviderModifierNode.orientation = this.orientation;
    }
}
