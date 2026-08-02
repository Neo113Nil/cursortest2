package com.squareup.cash.arcade.components;

import androidx.compose.ui.unit.DpOffset;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class BadgePlacement {
    public final long largeOffset;
    public final long smallOffset;
    public static final BadgePlacement BottomNavigation = new BadgePlacement((Float.floatToRawIntBits(3.0f) << 32) | (Float.floatToRawIntBits(-2.0f) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(Float.NaN) << 32) | (Float.floatToRawIntBits(-4.0f) & BodyPartID.bodyIdMax));
    public static final BadgePlacement TitleBarIcon = new BadgePlacement((Float.floatToRawIntBits(4.0f) << 32) | (Float.floatToRawIntBits(-4.0f) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(Float.NaN) << 32) | (Float.floatToRawIntBits(-9.0f) & BodyPartID.bodyIdMax));
    public static final BadgePlacement TitleBarCustom = new BadgePlacement((Float.floatToRawIntBits(4.0f) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(Float.NaN) << 32) | (Float.floatToRawIntBits(-5.0f) & BodyPartID.bodyIdMax));

    public BadgePlacement(long j, long j2) {
        this.smallOffset = j;
        this.largeOffset = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgePlacement)) {
            return false;
        }
        BadgePlacement badgePlacement = (BadgePlacement) obj;
        return this.smallOffset == badgePlacement.smallOffset && this.largeOffset == badgePlacement.largeOffset;
    }

    public final int hashCode() {
        return Long.hashCode(this.largeOffset) + (Long.hashCode(this.smallOffset) * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("BadgePlacement(smallOffset=", DpOffset.m1041toStringimpl(this.smallOffset), ", largeOffset=", DpOffset.m1041toStringimpl(this.largeOffset), ")");
    }
}
