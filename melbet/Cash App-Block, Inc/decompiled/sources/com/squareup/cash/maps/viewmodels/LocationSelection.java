package com.squareup.cash.maps.viewmodels;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LocationSelection {
    public final UUID id;
    public final String locationToken;

    public LocationSelection(String str, UUID uuid) {
        uuid.getClass();
        this.locationToken = str;
        this.id = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationSelection)) {
            return false;
        }
        LocationSelection locationSelection = (LocationSelection) obj;
        return Intrinsics.areEqual(this.locationToken, locationSelection.locationToken) && Intrinsics.areEqual(this.id, locationSelection.id);
    }

    public final int hashCode() {
        String str = this.locationToken;
        return this.id.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "LocationSelection(locationToken=" + this.locationToken + ", id=" + this.id + ")";
    }
}
