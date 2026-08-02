package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.io.LinesSequence;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/SimpleDropShadowElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/draw/SimpleDropShadowNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SimpleDropShadowElement extends ModifierNodeElement {
    public final Shadow shadow;
    public final Shape shape;

    public SimpleDropShadowElement(Shape shape, Shadow shadow) {
        this.shape = shape;
        this.shadow = shadow;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        SimpleDropShadowNode simpleDropShadowNode = new SimpleDropShadowNode();
        simpleDropShadowNode.shape = this.shape;
        simpleDropShadowNode.shadow = this.shadow;
        return simpleDropShadowNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleDropShadowElement)) {
            return false;
        }
        SimpleDropShadowElement simpleDropShadowElement = (SimpleDropShadowElement) obj;
        return Intrinsics.areEqual(this.shape, simpleDropShadowElement.shape) && this.shadow.equals(simpleDropShadowElement.shadow);
    }

    public final int hashCode() {
        return this.shadow.hashCode() + (this.shape.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "dropShadow";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(this.shape, "shape");
        linesSequence.set(this.shadow, "dropShadow");
    }

    public final String toString() {
        return "SimpleDropShadowElement(shape=" + this.shape + ", shadow=" + this.shadow + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        SimpleDropShadowNode simpleDropShadowNode = (SimpleDropShadowNode) node;
        Shape shape = simpleDropShadowNode.shape;
        Shape shape2 = this.shape;
        boolean areEqual = Intrinsics.areEqual(shape, shape2);
        Shadow shadow = this.shadow;
        if (!areEqual || !Intrinsics.areEqual(simpleDropShadowNode.shadow, shadow)) {
            simpleDropShadowNode.shadowPainter = null;
        }
        simpleDropShadowNode.shape = shape2;
        simpleDropShadowNode.shadow = shadow;
    }
}
