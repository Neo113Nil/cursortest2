package app.cash.local.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandLocationPhoneContentModel implements LocalBrandProfileSectionContent {
    public final String phoneNumber;
    public final String phoneNumberLabel;

    public LocalBrandLocationPhoneContentModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.phoneNumberLabel = str;
        this.phoneNumber = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandLocationPhoneContentModel)) {
            return false;
        }
        LocalBrandLocationPhoneContentModel localBrandLocationPhoneContentModel = (LocalBrandLocationPhoneContentModel) obj;
        return Intrinsics.areEqual(this.phoneNumberLabel, localBrandLocationPhoneContentModel.phoneNumberLabel) && Intrinsics.areEqual(this.phoneNumber, localBrandLocationPhoneContentModel.phoneNumber);
    }

    public final int hashCode() {
        return this.phoneNumber.hashCode() + (this.phoneNumberLabel.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("LocalBrandLocationPhoneContentModel(phoneNumberLabel=", this.phoneNumberLabel, ", phoneNumber=", this.phoneNumber, ")");
    }
}
