package com.squareup.cash.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.screens.BoostDetailsScreen;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class RedactedParcelableStringMap extends Redacted {
    public static final Parcelable.Creator<RedactedParcelableStringMap> CREATOR = new BoostDetailsScreen.Creator(9);
    public final HashMap value;

    public RedactedParcelableStringMap(HashMap hashMap) {
        this.value = hashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RedactedParcelableStringMap) && this.value.equals(((RedactedParcelableStringMap) obj).value);
    }

    @Override // com.squareup.cash.screens.Redacted
    public final Object getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        HashMap hashMap = this.value;
        parcel.writeInt(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
