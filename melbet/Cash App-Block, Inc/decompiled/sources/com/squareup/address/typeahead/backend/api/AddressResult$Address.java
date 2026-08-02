package com.squareup.address.typeahead.backend.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AddressResult$Address extends JsonLogicResult {
    public final String city;
    public final Double latitude;
    public final Double longitude;
    public final String placeId;
    public final String state;
    public final String streetAddressLine1;
    public final String streetAddressLine2;
    public final String zip;

    public AddressResult$Address(String str, String str2, String str3, String str4, String str5, Double d, Double d2, String str6) {
        str3.getClass();
        str4.getClass();
        this.streetAddressLine1 = str;
        this.streetAddressLine2 = str2;
        this.city = str3;
        this.state = str4;
        this.zip = str5;
        this.latitude = d;
        this.longitude = d2;
        this.placeId = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressResult$Address)) {
            return false;
        }
        AddressResult$Address addressResult$Address = (AddressResult$Address) obj;
        return this.streetAddressLine1.equals(addressResult$Address.streetAddressLine1) && Intrinsics.areEqual(this.streetAddressLine2, addressResult$Address.streetAddressLine2) && Intrinsics.areEqual(this.city, addressResult$Address.city) && Intrinsics.areEqual(this.state, addressResult$Address.state) && this.zip.equals(addressResult$Address.zip) && Intrinsics.areEqual((Object) this.latitude, (Object) addressResult$Address.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) addressResult$Address.longitude) && Intrinsics.areEqual(this.placeId, addressResult$Address.placeId);
    }

    public final int hashCode() {
        int hashCode = this.streetAddressLine1.hashCode() * 31;
        String str = this.streetAddressLine2;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.city), 31, this.state), 31, this.zip);
        Double d = this.latitude;
        int hashCode2 = (m + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.longitude;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str2 = this.placeId;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Address(streetAddressLine1=", this.streetAddressLine1, ", streetAddressLine2=", this.streetAddressLine2, ", city=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.city, ", state=", this.state, ", zip=");
        m.append(this.zip);
        m.append(", latitude=");
        m.append(this.latitude);
        m.append(", longitude=");
        m.append(this.longitude);
        m.append(", placeId=");
        m.append(this.placeId);
        m.append(")");
        return m.toString();
    }
}
