package app.cash.local.viewmodels;

import app.cash.local.primitives.LocationToken;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandLocationsBottomSheetModel$Location {
    public final String address;
    public final String name;
    public final LocationStatus status;
    public final String token;

    public LocalBrandLocationsBottomSheetModel$Location(String str, String str2, String str3, LocationStatus locationStatus) {
        str.getClass();
        str2.getClass();
        this.token = str;
        this.name = str2;
        this.address = str3;
        this.status = locationStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandLocationsBottomSheetModel$Location)) {
            return false;
        }
        LocalBrandLocationsBottomSheetModel$Location localBrandLocationsBottomSheetModel$Location = (LocalBrandLocationsBottomSheetModel$Location) obj;
        return Intrinsics.areEqual(this.token, localBrandLocationsBottomSheetModel$Location.token) && Intrinsics.areEqual(this.name, localBrandLocationsBottomSheetModel$Location.name) && this.address.equals(localBrandLocationsBottomSheetModel$Location.address) && this.status.equals(localBrandLocationsBottomSheetModel$Location.status);
    }

    public final int hashCode() {
        return this.status.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name), 31, this.address);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Location(token=", LocationToken.m1252toStringimpl(this.token), ", name=", this.name, ", address=");
        m.append(this.address);
        m.append(", status=");
        m.append(this.status);
        m.append(")");
        return m.toString();
    }
}
