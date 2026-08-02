package com.yandex.plus.pay.ui.yb.web.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class a implements e {
    public static final a a = new a();

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new l(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a);
    }

    public final int hashCode() {
        return -1151910750;
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
