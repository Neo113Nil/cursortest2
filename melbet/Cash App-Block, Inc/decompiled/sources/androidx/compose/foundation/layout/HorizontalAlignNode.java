package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class HorizontalAlignNode extends Modifier.Node implements ParentDataModifierNode {
    public Alignment.Horizontal horizontal;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object modifyParentData(Density density, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData();
        }
        final Alignment.Horizontal horizontal = this.horizontal;
        rowColumnParentData.crossAxisAlignment = new SpacerKt(horizontal) { // from class: androidx.compose.foundation.layout.CrossAxisAlignment$HorizontalCrossAxisAlignment
            public final Alignment.Horizontal horizontal;

            {
                this.horizontal = horizontal;
            }

            @Override // androidx.compose.foundation.layout.SpacerKt
            public final int align$foundation_layout(int i, int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
                return this.horizontal.align(i2, i, layoutDirection);
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CrossAxisAlignment$HorizontalCrossAxisAlignment) && Intrinsics.areEqual(this.horizontal, ((CrossAxisAlignment$HorizontalCrossAxisAlignment) obj2).horizontal);
            }

            public final int hashCode() {
                return this.horizontal.hashCode();
            }

            public final String toString() {
                return "HorizontalCrossAxisAlignment(horizontal=" + this.horizontal + ')';
            }
        };
        return rowColumnParentData;
    }
}
