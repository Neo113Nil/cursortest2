package com.squareup.cash.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.screens.BoostDetailsScreen;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RedactedStringList extends Redacted {
    public static final Parcelable.Creator<RedactedStringList> CREATOR = new BoostDetailsScreen.Creator(10);
    public final List value;

    public RedactedStringList(List list) {
        list.getClass();
        this.value = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RedactedStringList) && Intrinsics.areEqual(this.value, ((RedactedStringList) obj).value);
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
        parcel.writeStringList(this.value);
    }
}
