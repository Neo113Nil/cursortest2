package com.squareup.cash.deposits.physical.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PhysicalDepositUsAddressSearch {
    public final long created_at;
    public final String formatted_address;
    public final String identifier;
    public final Double latitude;
    public final Double longitude;
    public final String primary_text;
    public final String secondary_text;

    public PhysicalDepositUsAddressSearch(String str, long j, String str2, String str3, String str4, Double d, Double d2) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.identifier = str;
        this.created_at = j;
        this.formatted_address = str2;
        this.primary_text = str3;
        this.secondary_text = str4;
        this.latitude = d;
        this.longitude = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhysicalDepositUsAddressSearch)) {
            return false;
        }
        PhysicalDepositUsAddressSearch physicalDepositUsAddressSearch = (PhysicalDepositUsAddressSearch) obj;
        return Intrinsics.areEqual(this.identifier, physicalDepositUsAddressSearch.identifier) && this.created_at == physicalDepositUsAddressSearch.created_at && Intrinsics.areEqual(this.formatted_address, physicalDepositUsAddressSearch.formatted_address) && Intrinsics.areEqual(this.primary_text, physicalDepositUsAddressSearch.primary_text) && Intrinsics.areEqual(this.secondary_text, physicalDepositUsAddressSearch.secondary_text) && Intrinsics.areEqual((Object) this.latitude, (Object) physicalDepositUsAddressSearch.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) physicalDepositUsAddressSearch.longitude);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.identifier.hashCode() * 31, 31, this.created_at), 31, this.formatted_address), 31, this.primary_text);
        String str = this.secondary_text;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.latitude;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.longitude;
        return hashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("PhysicalDepositUsAddressSearch(identifier=", this.identifier, ", created_at=", this.created_at);
        Boxes$$ExternalSyntheticOutline1.m(m, ", formatted_address=", this.formatted_address, ", primary_text=", this.primary_text);
        m.append(", secondary_text=");
        m.append(this.secondary_text);
        m.append(", latitude=");
        m.append(this.latitude);
        m.append(", longitude=");
        m.append(this.longitude);
        m.append(")");
        return m.toString();
    }
}
