package com.yandex.plus.acquisition.sdk.api.offers;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.acquisition.adapter.api.k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class g implements i {
    public static final g a = new g();

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new k(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g);
    }

    public final int hashCode() {
        return -1627390259;
    }

    public final String toString() {
        return "Other";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
