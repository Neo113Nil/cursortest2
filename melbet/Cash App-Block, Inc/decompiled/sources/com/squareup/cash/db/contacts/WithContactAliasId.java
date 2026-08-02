package com.squareup.cash.db.contacts;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.db.contacts.Recipient;

/* loaded from: classes6.dex */
public final class WithContactAliasId implements Parcelable {
    public static final Parcelable.Creator<WithContactAliasId> CREATOR = new Recipient.Creator(11);
    public final String email;
    public final String hashed_alias;
    public final String hashed_alias_id;
    public final String lookupKey;
    public final String sms;

    public WithContactAliasId(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        this.lookupKey = str;
        this.hashed_alias = str2;
        this.hashed_alias_id = str3;
        this.sms = str4;
        this.email = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.lookupKey);
        parcel.writeString(this.hashed_alias);
        parcel.writeString(this.hashed_alias_id);
        parcel.writeString(this.sms);
        parcel.writeString(this.email);
    }
}
