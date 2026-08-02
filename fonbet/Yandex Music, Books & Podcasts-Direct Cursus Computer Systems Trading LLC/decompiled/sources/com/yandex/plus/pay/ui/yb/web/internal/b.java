package com.yandex.plus.pay.ui.yb.web.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b implements e {
    public static final b a = new b();

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new l(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b);
    }

    public final int hashCode() {
        return 796483296;
    }

    public final String toString() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
