package com.yandex.plus.pay.ui.core.tarifficator.api.data.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.repository.api.model.offers.w0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f implements h {
    public static final f a = new f();

    @NotNull
    public static final Parcelable.Creator<f> CREATOR = new w0(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof f);
    }

    public final int hashCode() {
        return 1696161850;
    }

    public final String toString() {
        return "NotFinished";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
