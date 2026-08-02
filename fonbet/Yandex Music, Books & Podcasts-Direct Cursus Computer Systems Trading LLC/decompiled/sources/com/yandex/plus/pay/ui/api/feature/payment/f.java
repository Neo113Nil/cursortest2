package com.yandex.plus.pay.ui.api.feature.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.repository.api.model.offers.w0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f implements g {
    public static final f a = new f();

    @NotNull
    public static final Parcelable.Creator<f> CREATOR = new w0(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof f);
    }

    public final int hashCode() {
        return -2043501079;
    }

    public final String toString() {
        return "Unexpected";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
