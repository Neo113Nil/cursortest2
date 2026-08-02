package com.squareup.cash.deposits.physical.screens;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$SessionId$GoogleSessionId;
import com.squareup.cash.db.contacts.Recipient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SelectedSearchAddressResult implements AddressResult {
    public static final Parcelable.Creator<SelectedSearchAddressResult> CREATOR = new Recipient.Creator(27);
    public final CharSequence fullText;
    public final String identifier;
    public final CharSequence primaryText;
    public final CharSequence secondaryText;
    public final LocationSearchClient$SessionId$GoogleSessionId sessionId;

    public SelectedSearchAddressResult(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, LocationSearchClient$SessionId$GoogleSessionId locationSearchClient$SessionId$GoogleSessionId) {
        str.getClass();
        charSequence.getClass();
        charSequence3.getClass();
        locationSearchClient$SessionId$GoogleSessionId.getClass();
        this.identifier = str;
        this.primaryText = charSequence;
        this.secondaryText = charSequence2;
        this.fullText = charSequence3;
        this.sessionId = locationSearchClient$SessionId$GoogleSessionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedSearchAddressResult)) {
            return false;
        }
        SelectedSearchAddressResult selectedSearchAddressResult = (SelectedSearchAddressResult) obj;
        return Intrinsics.areEqual(this.identifier, selectedSearchAddressResult.identifier) && Intrinsics.areEqual(this.primaryText, selectedSearchAddressResult.primaryText) && Intrinsics.areEqual(this.secondaryText, selectedSearchAddressResult.secondaryText) && Intrinsics.areEqual(this.fullText, selectedSearchAddressResult.fullText) && Intrinsics.areEqual(this.sessionId, selectedSearchAddressResult.sessionId);
    }

    public final int hashCode() {
        int hashCode = (this.primaryText.hashCode() + (this.identifier.hashCode() * 31)) * 31;
        CharSequence charSequence = this.secondaryText;
        return this.sessionId.hashCode() + ((this.fullText.hashCode() + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "SelectedSearchAddressResult(identifier=" + this.identifier + ", primaryText=" + ((Object) this.primaryText) + ", secondaryText=" + ((Object) this.secondaryText) + ", fullText=" + ((Object) this.fullText) + ", sessionId=" + this.sessionId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.identifier);
        TextUtils.writeToParcel(this.primaryText, parcel, i);
        TextUtils.writeToParcel(this.secondaryText, parcel, i);
        TextUtils.writeToParcel(this.fullText, parcel, i);
        parcel.writeParcelable(this.sessionId, i);
    }
}
