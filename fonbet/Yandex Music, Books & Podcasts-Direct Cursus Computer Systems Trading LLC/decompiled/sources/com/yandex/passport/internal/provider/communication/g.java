package com.yandex.passport.internal.provider.communication;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class g extends i {
    public static final g a = new g();

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new com.yandex.passport.internal.properties.f(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
