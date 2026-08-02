package com.yandex.plus.pay.ui.api.feature.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.repository.api.model.offers.w0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b implements g {
    public static final b a = new b();

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new w0(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b);
    }

    public final int hashCode() {
        return 1885304950;
    }

    public final String toString() {
        return "Connection";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
