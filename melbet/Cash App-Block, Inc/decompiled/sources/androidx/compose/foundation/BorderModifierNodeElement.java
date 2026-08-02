package androidx.compose.foundation;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawModifierNodeImpl;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.io.LinesSequence;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/BorderModifierNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BorderModifierNodeElement extends ModifierNodeElement {
    public final Brush brush;
    public final Shape shape;
    public final float width;

    public BorderModifierNodeElement(float f, Brush brush, Shape shape) {
        this.width = f;
        this.brush = brush;
        this.shape = shape;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new BorderModifierNode(this.width, this.brush, this.shape);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return Dp.m1037equalsimpl0(this.width, borderModifierNodeElement.width) && Intrinsics.areEqual(this.brush, borderModifierNodeElement.brush) && Intrinsics.areEqual(this.shape, borderModifierNodeElement.shape);
    }

    public final int hashCode() {
        return this.shape.hashCode() + ((this.brush.hashCode() + (Float.hashCode(this.width) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("border");
        inspectorInfo.getProperties().set(new Dp(this.width), "width");
        Brush brush = this.brush;
        if (brush instanceof SolidColor) {
            LinesSequence properties = inspectorInfo.getProperties();
            long j = ((SolidColor) brush).value;
            properties.set(new Color(j), "color");
            inspectorInfo.setValue(new Color(j));
        } else {
            inspectorInfo.getProperties().set(brush, "brush");
        }
        inspectorInfo.getProperties().set(this.shape, "shape");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderModifierNodeElement(width=");
        Recorder$$ExternalSyntheticOutline1.m104m(this.width, ", brush=", sb);
        sb.append(this.brush);
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        BorderModifierNode borderModifierNode = (BorderModifierNode) node;
        float f = borderModifierNode.width;
        CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl = borderModifierNode.drawWithCacheModifierNode;
        float f2 = this.width;
        if (!Dp.m1037equalsimpl0(f, f2)) {
            borderModifierNode.width = f2;
            cacheDrawModifierNodeImpl.invalidateDrawCache();
        }
        Brush brush = borderModifierNode.brush;
        Brush brush2 = this.brush;
        if (!Intrinsics.areEqual(brush, brush2)) {
            borderModifierNode.brush = brush2;
            cacheDrawModifierNodeImpl.invalidateDrawCache();
        }
        Shape shape = borderModifierNode.shape;
        Shape shape2 = this.shape;
        if (Intrinsics.areEqual(shape, shape2)) {
            return;
        }
        borderModifierNode.shape = shape2;
        cacheDrawModifierNodeImpl.invalidateDrawCache();
        DepthSortedSetKt.requireLayoutNode(borderModifierNode).invalidateSemantics$ui();
    }
}
