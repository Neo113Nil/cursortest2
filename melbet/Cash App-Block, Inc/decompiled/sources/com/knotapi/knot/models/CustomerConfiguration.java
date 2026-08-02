package com.knotapi.knot.models;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class CustomerConfiguration implements Parcelable {
    public static final Parcelable.Creator<CustomerConfiguration> CREATOR = new Parcelable.Creator<CustomerConfiguration>() { // from class: com.knotapi.knot.models.CustomerConfiguration.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomerConfiguration createFromParcel(Parcel parcel) {
            return new CustomerConfiguration(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomerConfiguration[] newArray(int i) {
            return new CustomerConfiguration[i];
        }
    };
    private final String cardName;
    private final String customerName;
    private final String logoId;

    public CustomerConfiguration(Parcel parcel) {
        this.cardName = parcel.readString();
        this.customerName = parcel.readString();
        this.logoId = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getLogoId() {
        return this.logoId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cardName);
        parcel.writeString(this.customerName);
        parcel.writeString(this.logoId);
    }

    public CustomerConfiguration(String str, String str2, String str3) {
        this.cardName = str;
        this.customerName = str2;
        this.logoId = str3;
    }
}
