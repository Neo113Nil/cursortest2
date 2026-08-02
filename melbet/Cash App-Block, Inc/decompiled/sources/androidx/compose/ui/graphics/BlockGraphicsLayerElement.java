package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends ModifierNodeElement {
    public final Function1 block;

    public BlockGraphicsLayerElement(Function1 function1) {
        this.block = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new BlockGraphicsLayerModifier(this.block);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BlockGraphicsLayerElement) {
            return this.block == ((BlockGraphicsLayerElement) obj).block;
        }
        return false;
    }

    public final int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set(this.block, "block");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        NodeCoordinator nodeCoordinator;
        BlockGraphicsLayerModifier blockGraphicsLayerModifier = (BlockGraphicsLayerModifier) node;
        Function1 function1 = this.block;
        blockGraphicsLayerModifier.layerBlock = function1;
        if (blockGraphicsLayerModifier.getNode().isAttached() && (nodeCoordinator = DepthSortedSetKt.m864requireCoordinator64DMado(blockGraphicsLayerModifier, 2).wrapped) != null) {
            nodeCoordinator.updateLayerBlock(true, function1);
        }
    }
}
