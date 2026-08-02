package com.squareup.cash.profile.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.profile.viewmodels.Alias;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class AddressSheetResponse implements Parcelable {
    public static final /* synthetic */ AddressSheetResponse[] $VALUES;
    public static final Parcelable.Creator<AddressSheetResponse> CREATOR;
    public static final AddressSheetResponse REPLACE_ADDRESS;

    static {
        AddressSheetResponse addressSheetResponse = new AddressSheetResponse("REPLACE_ADDRESS", 0);
        REPLACE_ADDRESS = addressSheetResponse;
        $VALUES = new AddressSheetResponse[]{addressSheetResponse};
        CREATOR = new Alias.Creator(17);
    }

    public static AddressSheetResponse valueOf(String str) {
        return (AddressSheetResponse) Enum.valueOf(AddressSheetResponse.class, str);
    }

    public static AddressSheetResponse[] values() {
        return (AddressSheetResponse[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
