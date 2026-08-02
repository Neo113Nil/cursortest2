package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/FillNode;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class FillElement extends ModifierNodeElement {
    public final Direction direction;
    public final float fraction;
    public final String inspectorName;

    public FillElement(Direction direction, float f, String str) {
        this.direction = direction;
        this.fraction = f;
        this.inspectorName = str;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        FillNode fillNode = new FillNode();
        fillNode.direction = this.direction;
        fillNode.fraction = this.fraction;
        return fillNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.direction == fillElement.direction && this.fraction == fillElement.fraction;
    }

    public final int hashCode() {
        return Float.hashCode(this.fraction) + (this.direction.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.getProperties().set(Float.valueOf(this.fraction), "fraction");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        FillNode fillNode = (FillNode) node;
        fillNode.direction = this.direction;
        fillNode.fraction = this.fraction;
    }
}
