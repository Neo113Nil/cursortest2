package com.yandex.plus.pay.ui.api.feature.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.repository.api.model.offers.w0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class e implements g {
    public static final e a = new e();

    @NotNull
    public static final Parcelable.Creator<e> CREATOR = new w0(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e);
    }

    public final int hashCode() {
        return -2000335732;
    }

    public final String toString() {
        return "Unauthorized";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
