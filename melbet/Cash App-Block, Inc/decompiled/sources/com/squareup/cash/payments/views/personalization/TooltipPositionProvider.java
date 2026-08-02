package com.squareup.cash.payments.views.personalization;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class TooltipPositionProvider implements PopupPositionProvider {
    public final Density density;

    public TooltipPositionProvider(Density density) {
        density.getClass();
        this.density = density;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo190calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        intRect.getClass();
        layoutDirection.getClass();
        return (((intRect.getHeight() / 2) + (((int) (intRect.m1052getTopLeftnOccac() & BodyPartID.bodyIdMax)) - (((int) (j2 & BodyPartID.bodyIdMax)) / 2))) & BodyPartID.bodyIdMax) | (((((int) (intRect.m1052getTopLeftnOccac() >> 32)) - ((int) (j2 >> 32))) - this.density.mo230roundToPx0680j_4(4.0f)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TooltipPositionProvider) && Intrinsics.areEqual(this.density, ((TooltipPositionProvider) obj).density);
    }

    public final int hashCode() {
        return this.density.hashCode();
    }

    public final String toString() {
        return "TooltipPositionProvider(density=" + this.density + ")";
    }
}
