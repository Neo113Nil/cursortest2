package app.cash.local.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandLocationAddressContentModel implements LocalBrandProfileSectionContent {
    public final String address;
    public final String addressLabel;

    public LocalBrandLocationAddressContentModel(String str, String str2) {
        str.getClass();
        this.addressLabel = str;
        this.address = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandLocationAddressContentModel)) {
            return false;
        }
        LocalBrandLocationAddressContentModel localBrandLocationAddressContentModel = (LocalBrandLocationAddressContentModel) obj;
        return Intrinsics.areEqual(this.addressLabel, localBrandLocationAddressContentModel.addressLabel) && this.address.equals(localBrandLocationAddressContentModel.address);
    }

    public final int hashCode() {
        return this.address.hashCode() + (this.addressLabel.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("LocalBrandLocationAddressContentModel(addressLabel=", this.addressLabel, ", address=", this.address, ")");
    }
}
