package com.squareup.cash.shopping.autofill.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.screens.BoostDetailsScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AutofillData implements Parcelable {
    public static final Parcelable.Creator<AutofillData> CREATOR = new BoostDetailsScreen.Creator(27);
    public final String cardMasked;
    public final String email;
    public final String formattedAddress;
    public final String fullName;
    public final String phone;

    public AutofillData(String str, String str2, String str3, String str4, String str5) {
        this.fullName = str;
        this.formattedAddress = str2;
        this.email = str3;
        this.phone = str4;
        this.cardMasked = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillData)) {
            return false;
        }
        AutofillData autofillData = (AutofillData) obj;
        return Intrinsics.areEqual(this.fullName, autofillData.fullName) && Intrinsics.areEqual(this.formattedAddress, autofillData.formattedAddress) && Intrinsics.areEqual(this.email, autofillData.email) && Intrinsics.areEqual(this.phone, autofillData.phone) && Intrinsics.areEqual(this.cardMasked, autofillData.cardMasked);
    }

    public final int hashCode() {
        String str = this.fullName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.formattedAddress;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.phone;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardMasked;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AutofillData(fullName=", this.fullName, ", formattedAddress=", this.formattedAddress, ", email=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.email, ", phone=", this.phone, ", cardMasked=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.cardMasked, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.fullName);
        parcel.writeString(this.formattedAddress);
        parcel.writeString(this.email);
        parcel.writeString(this.phone);
        parcel.writeString(this.cardMasked);
    }
}
