package com.squareup.cash.marketing.components;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class PositionProvider implements PopupPositionProvider {
    public final Alignment.Horizontal alignment;
    public final TooltipBoxKt$$ExternalSyntheticLambda2 onOrientationCalculated;

    public PositionProvider(Alignment.Horizontal horizontal, TooltipBoxKt$$ExternalSyntheticLambda2 tooltipBoxKt$$ExternalSyntheticLambda2) {
        horizontal.getClass();
        this.alignment = horizontal;
        this.onOrientationCalculated = tooltipBoxKt$$ExternalSyntheticLambda2;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo190calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        intRect.getClass();
        layoutDirection.getClass();
        float height = (intRect.getHeight() / 2.0f) + intRect.top;
        int align = this.alignment.align((int) (j2 >> 32), intRect.getWidth(), layoutDirection) + intRect.left;
        boolean z = height >= ((float) ((int) (j & BodyPartID.bodyIdMax))) / 2.0f;
        this.onOrientationCalculated.invoke(z ? ArrowOrientation.Down : ArrowOrientation.Up);
        return (align << 32) | ((z ? r0 - ((int) (j2 & BodyPartID.bodyIdMax)) : intRect.bottom) & BodyPartID.bodyIdMax);
    }
}
