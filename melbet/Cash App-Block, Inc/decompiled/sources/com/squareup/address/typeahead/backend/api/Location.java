package com.squareup.address.typeahead.backend.api;

import com.fillr.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Location {
    public final e addressComponents;
    public final Coordinates coordinates;
    public final String formattedAddress;
    public final String identifier;

    public Location(String str, Coordinates coordinates, String str2, e eVar) {
        str.getClass();
        this.identifier = str;
        this.coordinates = coordinates;
        this.formattedAddress = str2;
        this.addressComponents = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return Intrinsics.areEqual(this.identifier, location.identifier) && this.coordinates.equals(location.coordinates) && Intrinsics.areEqual(this.formattedAddress, location.formattedAddress) && Intrinsics.areEqual(this.addressComponents, location.addressComponents);
    }

    public final int hashCode() {
        int hashCode = (this.coordinates.hashCode() + (this.identifier.hashCode() * 31)) * 31;
        String str = this.formattedAddress;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.addressComponents;
        return hashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "Location(identifier=" + this.identifier + ", coordinates=" + this.coordinates + ", formattedAddress=" + this.formattedAddress + ", addressComponents=" + this.addressComponents + ")";
    }
}
