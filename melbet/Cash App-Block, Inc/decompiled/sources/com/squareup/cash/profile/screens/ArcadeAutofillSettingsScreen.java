package com.squareup.cash.profile.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.profile.screens.OpenSourceScreen;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ArcadeAutofillSettingsScreen extends ProfileScreens {
    public static final Parcelable.Creator<ArcadeAutofillSettingsScreen> CREATOR = new OpenSourceScreen.Creator(7);
    public final GlobalAddress address;
    public final String email;
    public final String firstName;
    public final String lastName;
    public final Phone phone;
    public final String shippingAddressId;

    public ArcadeAutofillSettingsScreen(String str, String str2, String str3, String str4, Phone phone, GlobalAddress globalAddress) {
        globalAddress.getClass();
        this.shippingAddressId = str;
        this.firstName = str2;
        this.lastName = str3;
        this.email = str4;
        this.phone = phone;
        this.address = globalAddress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArcadeAutofillSettingsScreen)) {
            return false;
        }
        ArcadeAutofillSettingsScreen arcadeAutofillSettingsScreen = (ArcadeAutofillSettingsScreen) obj;
        return Intrinsics.areEqual(this.shippingAddressId, arcadeAutofillSettingsScreen.shippingAddressId) && Intrinsics.areEqual(this.firstName, arcadeAutofillSettingsScreen.firstName) && Intrinsics.areEqual(this.lastName, arcadeAutofillSettingsScreen.lastName) && Intrinsics.areEqual(this.email, arcadeAutofillSettingsScreen.email) && Intrinsics.areEqual(this.phone, arcadeAutofillSettingsScreen.phone) && Intrinsics.areEqual(this.address, arcadeAutofillSettingsScreen.address);
    }

    public final int hashCode() {
        String str = this.shippingAddressId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Phone phone = this.phone;
        return this.address.hashCode() + ((hashCode4 + (phone != null ? phone.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ArcadeAutofillSettingsScreen(shippingAddressId=", this.shippingAddressId, ", firstName=██, lastName=██, email=██, phone=██, address=██)");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.shippingAddressId);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.email);
        parcel.writeParcelable(this.phone, i);
        parcel.writeParcelable(this.address, i);
    }
}
