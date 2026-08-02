package com.squareup.cash.deposits.physical.viewmodels.address;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AddressSearchViewModel {
    public final String formattedAddress;
    public final String identifier;
    public final double latitude;
    public final double longitude;
    public final String primaryText;
    public final String secondaryText;

    public AddressSearchViewModel(String str, String str2, String str3, String str4, double d, double d2) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str4);
        this.identifier = str;
        this.primaryText = str2;
        this.secondaryText = str3;
        this.formattedAddress = str4;
        this.latitude = d;
        this.longitude = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressSearchViewModel)) {
            return false;
        }
        AddressSearchViewModel addressSearchViewModel = (AddressSearchViewModel) obj;
        return Intrinsics.areEqual(this.identifier, addressSearchViewModel.identifier) && Intrinsics.areEqual(this.primaryText, addressSearchViewModel.primaryText) && Intrinsics.areEqual(this.secondaryText, addressSearchViewModel.secondaryText) && Intrinsics.areEqual(this.formattedAddress, addressSearchViewModel.formattedAddress) && Double.compare(this.latitude, addressSearchViewModel.latitude) == 0 && Double.compare(this.longitude, addressSearchViewModel.longitude) == 0;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.identifier.hashCode() * 31, 31, this.primaryText);
        String str = this.secondaryText;
        return Double.hashCode(this.longitude) + Fragment$5$$ExternalSyntheticOutline0.m(this.latitude, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.formattedAddress), 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AddressSearchViewModel(identifier=", this.identifier, ", primaryText=", this.primaryText, ", secondaryText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.secondaryText, ", formattedAddress=", this.formattedAddress, ", latitude=");
        m.append(this.latitude);
        m.append(", longitude=");
        m.append(this.longitude);
        m.append(")");
        return m.toString();
    }
}
