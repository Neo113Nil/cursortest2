package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes3.dex */
public final class CrossAxisAlignment$AlignmentLineCrossAxisAlignment extends SpacerKt {
    public final OffsetKt alignmentLineProvider;

    public CrossAxisAlignment$AlignmentLineCrossAxisAlignment(OffsetKt offsetKt) {
        this.alignmentLineProvider = offsetKt;
    }

    @Override // androidx.compose.foundation.layout.SpacerKt
    public final int align$foundation_layout(int i, int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
        int calculateAlignmentLinePosition = this.alignmentLineProvider.calculateAlignmentLinePosition(placeable);
        if (calculateAlignmentLinePosition == Integer.MIN_VALUE) {
            return 0;
        }
        int i4 = i3 - calculateAlignmentLinePosition;
        return layoutDirection == LayoutDirection.Rtl ? (i - i2) - i4 : i4;
    }

    @Override // androidx.compose.foundation.layout.SpacerKt
    public final Integer calculateAlignmentLinePosition$foundation_layout(Placeable placeable) {
        return Integer.valueOf(this.alignmentLineProvider.calculateAlignmentLinePosition(placeable));
    }
}
