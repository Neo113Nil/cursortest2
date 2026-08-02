package androidx.compose.foundation.layout;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/OffsetNode;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class OffsetElement extends ModifierNodeElement {
    public final OffsetKt$$ExternalSyntheticLambda0 inspectorInfo;
    public final float x;
    public final float y;

    public OffsetElement(float f, float f2, OffsetKt$$ExternalSyntheticLambda0 offsetKt$$ExternalSyntheticLambda0) {
        this.x = f;
        this.y = f2;
        this.inspectorInfo = offsetKt$$ExternalSyntheticLambda0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        OffsetNode offsetNode = new OffsetNode();
        offsetNode.x = this.x;
        offsetNode.y = this.y;
        offsetNode.rtlAware = true;
        return offsetNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && Dp.m1037equalsimpl0(this.x, offsetElement.x) && Dp.m1037equalsimpl0(this.y, offsetElement.y);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + CameraState$Type$EnumUnboxingLocalUtility.m(this.y, Float.hashCode(this.x) * 31, 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetModifierElement(x=");
        Recorder$$ExternalSyntheticOutline1.m104m(this.x, ", y=", sb);
        sb.append((Object) Dp.m1038toStringimpl(this.y));
        sb.append(", rtlAware=true)");
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        OffsetNode offsetNode = (OffsetNode) node;
        float f = offsetNode.x;
        float f2 = this.x;
        boolean m1037equalsimpl0 = Dp.m1037equalsimpl0(f, f2);
        float f3 = this.y;
        if (!m1037equalsimpl0 || !Dp.m1037equalsimpl0(offsetNode.y, f3) || !offsetNode.rtlAware) {
            DepthSortedSetKt.requireLayoutNode(offsetNode).requestRelayout$ui(false);
        }
        offsetNode.x = f2;
        offsetNode.y = f3;
        offsetNode.rtlAware = true;
    }
}
