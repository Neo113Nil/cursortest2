package androidx.compose.foundation.lazy;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/ParentSizeNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ParentSizeElement extends ModifierNodeElement {
    public final float fraction;
    public final State heightState;
    public final String inspectorName;
    public final State widthState;

    public /* synthetic */ ParentSizeElement(ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2, String str, int i) {
        this((i & 2) != 0 ? null : parcelableSnapshotMutableIntState, (i & 4) != 0 ? null : parcelableSnapshotMutableIntState2, str);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        ParentSizeNode parentSizeNode = new ParentSizeNode();
        parentSizeNode.fraction = this.fraction;
        parentSizeNode.widthState = this.widthState;
        parentSizeNode.heightState = this.heightState;
        return parentSizeNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.fraction == parentSizeElement.fraction && Intrinsics.areEqual(this.widthState, parentSizeElement.widthState) && Intrinsics.areEqual(this.heightState, parentSizeElement.heightState);
    }

    public final int hashCode() {
        State state = this.widthState;
        int hashCode = (state != null ? state.hashCode() : 0) * 31;
        State state2 = this.heightState;
        return Float.hashCode(this.fraction) + ((hashCode + (state2 != null ? state2.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = this.inspectorName;
        inspectorInfo.value = Float.valueOf(this.fraction);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        ParentSizeNode parentSizeNode = (ParentSizeNode) node;
        parentSizeNode.fraction = this.fraction;
        parentSizeNode.widthState = this.widthState;
        parentSizeNode.heightState = this.heightState;
    }

    public ParentSizeElement(State state, State state2, String str) {
        this.fraction = 1.0f;
        this.widthState = state;
        this.heightState = state2;
        this.inspectorName = str;
    }
}
