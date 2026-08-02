package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/AspectRatioNode;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AspectRatioElement extends ModifierNodeElement {
    public final float aspectRatio;
    public final boolean matchHeightConstraintsFirst;

    public AspectRatioElement(float f, boolean z) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
        if (f > RecyclerView.DECELERATION_RATE) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("aspectRatio " + f + " must be > 0");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        AspectRatioNode aspectRatioNode = new AspectRatioNode();
        aspectRatioNode.aspectRatio = this.aspectRatio;
        aspectRatioNode.matchHeightConstraintsFirst = this.matchHeightConstraintsFirst;
        return aspectRatioNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement != null && this.aspectRatio == aspectRatioElement.aspectRatio) {
            return this.matchHeightConstraintsFirst == ((AspectRatioElement) obj).matchHeightConstraintsFirst;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.matchHeightConstraintsFirst) + (Float.hashCode(this.aspectRatio) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        AspectRatioNode aspectRatioNode = (AspectRatioNode) node;
        aspectRatioNode.aspectRatio = this.aspectRatio;
        aspectRatioNode.matchHeightConstraintsFirst = this.matchHeightConstraintsFirst;
    }
}
