package com.yandex.plus.acquisition.sdk.api.offers;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.acquisition.adapter.api.k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class h implements i {
    public static final h a = new h();

    @NotNull
    public static final Parcelable.Creator<h> CREATOR = new k(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof h);
    }

    public final int hashCode() {
        return 1359431636;
    }

    public final String toString() {
        return "Yandex";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
