package com.squareup.cash.mooncake.compose_ui.components;

import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class PositionProvider implements PopupPositionProvider {
    public static final PositionProvider INSTANCE = new PositionProvider();

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo190calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        intRect.getClass();
        layoutDirection.getClass();
        float width = (intRect.getWidth() / 2.0f) + intRect.left;
        return (MathKt__MathJVMKt.roundToInt(width - (((int) (j2 >> 32)) / 2.0f)) << 32) | (((((float) intRect.getHeight()) / 2.0f) + ((float) intRect.top) >= ((float) ((int) (j & BodyPartID.bodyIdMax))) / 2.0f ? r5 - ((int) (j2 & BodyPartID.bodyIdMax)) : intRect.bottom) & BodyPartID.bodyIdMax);
    }
}
