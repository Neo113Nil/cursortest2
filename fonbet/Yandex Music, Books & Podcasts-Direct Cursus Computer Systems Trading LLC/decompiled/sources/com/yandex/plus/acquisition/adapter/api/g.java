package com.yandex.plus.acquisition.adapter.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.ui.authsdk.r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class g implements m {
    public static final g a = new g();

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new r(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g);
    }

    public final int hashCode() {
        return 1832335413;
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
