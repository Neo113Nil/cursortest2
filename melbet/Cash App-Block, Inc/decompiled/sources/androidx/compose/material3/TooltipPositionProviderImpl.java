package androidx.compose.material3;

import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class TooltipPositionProviderImpl implements PopupPositionProvider {
    public final int tooltipAnchorSpacing;

    public TooltipPositionProviderImpl(int i) {
        this.tooltipAnchorSpacing = i;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo190calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        int i = (int) (j2 >> 32);
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intRect.getWidth(), i, 2, intRect.left);
        if (m < 0) {
            m = intRect.left;
        } else if (m + i > ((int) (j >> 32))) {
            m = intRect.right - i;
        }
        int i2 = intRect.top - ((int) (j2 & BodyPartID.bodyIdMax));
        int i3 = this.tooltipAnchorSpacing;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = intRect.bottom + i3;
        }
        return (m << 32) | (i4 & BodyPartID.bodyIdMax);
    }
}
