package com.squareup.address.typeahead.backend.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.protos.common.countries.Country;
import defpackage.JsonLogicResult;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AddressResult$LocationResult extends JsonLogicResult {
    public final String city;
    public final Country country;
    public final String neighborhood;
    public final String state;

    public AddressResult$LocationResult(String str, String str2, String str3, Country country) {
        str.getClass();
        str2.getClass();
        country.getClass();
        this.city = str;
        this.state = str2;
        this.neighborhood = str3;
        this.country = country;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressResult$LocationResult)) {
            return false;
        }
        AddressResult$LocationResult addressResult$LocationResult = (AddressResult$LocationResult) obj;
        return Intrinsics.areEqual(this.city, addressResult$LocationResult.city) && Intrinsics.areEqual(this.state, addressResult$LocationResult.state) && this.neighborhood.equals(addressResult$LocationResult.neighborhood) && this.country == addressResult$LocationResult.country;
    }

    public final int hashCode() {
        return this.country.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.city.hashCode() * 31, 31, this.state), 31, this.neighborhood);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(this.city, ", ", this.state);
    }
}
