package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class SiblingsAlignedNode extends Modifier.Node implements ParentDataModifierNode {

    public final class WithAlignmentLineBlockNode extends SiblingsAlignedNode {
        public RowScopeInstance$$ExternalSyntheticLambda0 block;

        @Override // androidx.compose.ui.node.ParentDataModifierNode
        public final Object modifyParentData(Density density, Object obj) {
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData();
            }
            final RowScopeInstance$$ExternalSyntheticLambda0 rowScopeInstance$$ExternalSyntheticLambda0 = this.block;
            rowColumnParentData.crossAxisAlignment = new CrossAxisAlignment$AlignmentLineCrossAxisAlignment(new OffsetKt(rowScopeInstance$$ExternalSyntheticLambda0) { // from class: androidx.compose.foundation.layout.AlignmentLineProvider$Block
                public final RowScopeInstance$$ExternalSyntheticLambda0 lineProviderBlock;

                {
                    this.lineProviderBlock = rowScopeInstance$$ExternalSyntheticLambda0;
                }

                @Override // androidx.compose.foundation.layout.OffsetKt
                public final int calculateAlignmentLinePosition(Placeable placeable) {
                    return ((Number) this.lineProviderBlock.f$0.invoke(placeable)).intValue();
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof AlignmentLineProvider$Block) && Intrinsics.areEqual(this.lineProviderBlock, ((AlignmentLineProvider$Block) obj2).lineProviderBlock);
                }

                public final int hashCode() {
                    return this.lineProviderBlock.hashCode();
                }

                public final String toString() {
                    return "Block(lineProviderBlock=" + this.lineProviderBlock + ')';
                }
            });
            return rowColumnParentData;
        }
    }

    public final class WithAlignmentLineNode extends SiblingsAlignedNode {
        public AlignmentLine alignmentLine;

        @Override // androidx.compose.ui.node.ParentDataModifierNode
        public final Object modifyParentData(Density density, Object obj) {
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData();
            }
            final AlignmentLine alignmentLine = this.alignmentLine;
            rowColumnParentData.crossAxisAlignment = new CrossAxisAlignment$AlignmentLineCrossAxisAlignment(new OffsetKt(alignmentLine) { // from class: androidx.compose.foundation.layout.AlignmentLineProvider$Value
                public final AlignmentLine alignmentLine;

                {
                    this.alignmentLine = alignmentLine;
                }

                @Override // androidx.compose.foundation.layout.OffsetKt
                public final int calculateAlignmentLinePosition(Placeable placeable) {
                    return placeable.get(this.alignmentLine);
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof AlignmentLineProvider$Value) && Intrinsics.areEqual(this.alignmentLine, ((AlignmentLineProvider$Value) obj2).alignmentLine);
                }

                public final int hashCode() {
                    return this.alignmentLine.hashCode();
                }

                public final String toString() {
                    return "Value(alignmentLine=" + this.alignmentLine + ')';
                }
            });
            return rowColumnParentData;
        }
    }
}
