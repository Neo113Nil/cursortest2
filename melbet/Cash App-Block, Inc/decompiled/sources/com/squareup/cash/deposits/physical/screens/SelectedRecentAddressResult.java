package com.squareup.cash.deposits.physical.screens;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.squareup.cash.db.contacts.Recipient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SelectedRecentAddressResult implements AddressResult {
    public static final Parcelable.Creator<SelectedRecentAddressResult> CREATOR = new Recipient.Creator(26);
    public final CharSequence fullText;
    public final double latitude;
    public final double longitude;
    public final CharSequence primaryText;
    public final CharSequence secondaryText;

    public SelectedRecentAddressResult(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, double d, double d2) {
        charSequence.getClass();
        charSequence3.getClass();
        this.primaryText = charSequence;
        this.secondaryText = charSequence2;
        this.fullText = charSequence3;
        this.latitude = d;
        this.longitude = d2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedRecentAddressResult)) {
            return false;
        }
        SelectedRecentAddressResult selectedRecentAddressResult = (SelectedRecentAddressResult) obj;
        return Intrinsics.areEqual(this.primaryText, selectedRecentAddressResult.primaryText) && Intrinsics.areEqual(this.secondaryText, selectedRecentAddressResult.secondaryText) && Intrinsics.areEqual(this.fullText, selectedRecentAddressResult.fullText) && Double.compare(this.latitude, selectedRecentAddressResult.latitude) == 0 && Double.compare(this.longitude, selectedRecentAddressResult.longitude) == 0;
    }

    public final int hashCode() {
        int hashCode = this.primaryText.hashCode() * 31;
        CharSequence charSequence = this.secondaryText;
        return Double.hashCode(this.longitude) + Fragment$5$$ExternalSyntheticOutline0.m(this.latitude, (this.fullText.hashCode() + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31, 31);
    }

    public final String toString() {
        return "SelectedRecentAddressResult(primaryText=" + ((Object) this.primaryText) + ", secondaryText=" + ((Object) this.secondaryText) + ", fullText=" + ((Object) this.fullText) + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        TextUtils.writeToParcel(this.primaryText, parcel, i);
        TextUtils.writeToParcel(this.secondaryText, parcel, i);
        TextUtils.writeToParcel(this.fullText, parcel, i);
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
    }
}
