package com.yandex.passport.internal.entities;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class x implements a0 {
    public static final x a = new x();

    @NotNull
    public static final Parcelable.Creator<x> CREATOR = new com.yandex.passport.internal.credentials.b(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof x);
    }

    public final int hashCode() {
        return -1946559112;
    }

    public final String toString() {
        return "Allowed";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
