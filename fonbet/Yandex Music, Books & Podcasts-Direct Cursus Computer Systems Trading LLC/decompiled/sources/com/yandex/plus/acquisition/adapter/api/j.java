package com.yandex.plus.acquisition.adapter.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.ui.authsdk.r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class j implements m {
    public static final j a = new j();

    @NotNull
    public static final Parcelable.Creator<j> CREATOR = new r(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof j);
    }

    public final int hashCode() {
        return -1364453237;
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
