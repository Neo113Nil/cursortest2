package com.squareup.cash.phoneplans.applets.viewmodels;

import com.squareup.cash.money.core.ids.ItemId;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PhonePlansAppletTileEvent$Click {
    public final ItemId itemId;

    public PhonePlansAppletTileEvent$Click(ItemId itemId) {
        itemId.getClass();
        this.itemId = itemId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhonePlansAppletTileEvent$Click) && Intrinsics.areEqual(this.itemId, ((PhonePlansAppletTileEvent$Click) obj).itemId);
    }

    public final int hashCode() {
        return this.itemId.hashCode();
    }

    public final String toString() {
        return "Click(itemId=" + this.itemId + ")";
    }
}
