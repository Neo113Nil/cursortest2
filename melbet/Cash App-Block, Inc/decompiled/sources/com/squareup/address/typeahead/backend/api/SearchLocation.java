package com.squareup.address.typeahead.backend.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.play.core.review.zzb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class SearchLocation implements Parcelable {
    public static final Parcelable.Creator<SearchLocation> CREATOR = new zzb(18);
    public final CharSequence fullText;
    public final String identifier;
    public final CharSequence primaryText;
    public final CharSequence secondaryText;

    public SearchLocation(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        str.getClass();
        charSequence.getClass();
        charSequence3.getClass();
        this.identifier = str;
        this.primaryText = charSequence;
        this.secondaryText = charSequence2;
        this.fullText = charSequence3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchLocation)) {
            return false;
        }
        SearchLocation searchLocation = (SearchLocation) obj;
        return Intrinsics.areEqual(this.identifier, searchLocation.identifier) && Intrinsics.areEqual(this.primaryText, searchLocation.primaryText) && Intrinsics.areEqual(this.secondaryText, searchLocation.secondaryText) && Intrinsics.areEqual(this.fullText, searchLocation.fullText);
    }

    public final int hashCode() {
        int hashCode = (this.primaryText.hashCode() + (this.identifier.hashCode() * 31)) * 31;
        CharSequence charSequence = this.secondaryText;
        return this.fullText.hashCode() + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }

    public final String toString() {
        return "SearchLocation(identifier=" + this.identifier + ", primaryText=" + ((Object) this.primaryText) + ", secondaryText=" + ((Object) this.secondaryText) + ", fullText=" + ((Object) this.fullText) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.identifier);
        TextUtils.writeToParcel(this.primaryText, parcel, i);
        TextUtils.writeToParcel(this.secondaryText, parcel, i);
        TextUtils.writeToParcel(this.fullText, parcel, i);
    }
}
