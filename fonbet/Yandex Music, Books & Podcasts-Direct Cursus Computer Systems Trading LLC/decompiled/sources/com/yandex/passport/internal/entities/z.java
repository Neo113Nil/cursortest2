package com.yandex.passport.internal.entities;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class z implements a0 {
    public static final z a = new z();

    @NotNull
    public static final Parcelable.Creator<z> CREATOR = new com.yandex.passport.internal.credentials.b(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z);
    }

    public final int hashCode() {
        return -1717803673;
    }

    public final String toString() {
        return "Pending";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
