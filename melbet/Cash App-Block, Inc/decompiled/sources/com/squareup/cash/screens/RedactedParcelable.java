package com.squareup.cash.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zza;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RedactedParcelable extends Redacted {
    public static final Parcelable.Creator<RedactedParcelable> CREATOR = new zza(29);
    public final Parcelable value;

    public RedactedParcelable(Parcelable parcelable) {
        this.value = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RedactedParcelable) && Intrinsics.areEqual(this.value, ((RedactedParcelable) obj).value);
    }

    @Override // com.squareup.cash.screens.Redacted
    public final Object getValue() {
        return this.value;
    }

    public final int hashCode() {
        Parcelable parcelable = this.value;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.value, i);
    }
}
