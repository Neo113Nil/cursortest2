package com.yandex.plus.acquisition.adapter.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.ui.authsdk.r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class e implements o {
    public static final e a = new e();

    @NotNull
    public static final Parcelable.Creator<e> CREATOR = new r(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e);
    }

    public final int hashCode() {
        return -1159240373;
    }

    public final String toString() {
        return "Cancel";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
