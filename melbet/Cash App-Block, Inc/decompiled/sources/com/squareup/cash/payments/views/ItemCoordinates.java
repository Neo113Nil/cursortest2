package com.squareup.cash.payments.views;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes6.dex */
public final class ItemCoordinates {
    public final long offset;
    public final long size;

    public ItemCoordinates(long j, long j2) {
        this.size = j;
        this.offset = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemCoordinates)) {
            return false;
        }
        ItemCoordinates itemCoordinates = (ItemCoordinates) obj;
        return IntSize.m1055equalsimpl0(this.size, itemCoordinates.size) && Offset.m622equalsimpl0(this.offset, itemCoordinates.offset);
    }

    public final int hashCode() {
        return Long.hashCode(this.offset) + (Long.hashCode(this.size) * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ItemCoordinates(size=", IntSize.m1056toStringimpl(this.size), ", offset=", Offset.m628toStringimpl(this.offset), ")");
    }
}
