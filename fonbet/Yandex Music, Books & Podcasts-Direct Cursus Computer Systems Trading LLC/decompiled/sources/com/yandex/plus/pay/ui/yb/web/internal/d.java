package com.yandex.plus.pay.ui.yb.web.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class d implements e {
    public static final d a = new d();

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new l(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d);
    }

    public final int hashCode() {
        return 1777374533;
    }

    public final String toString() {
        return "SuccessTopupCard";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
