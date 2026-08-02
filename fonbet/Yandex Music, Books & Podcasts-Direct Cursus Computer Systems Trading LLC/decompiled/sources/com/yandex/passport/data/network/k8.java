package com.yandex.passport.data.network;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class k8 extends m8 {
    public static final k8 a = new k8();

    @NotNull
    public static final Parcelable.Creator<k8> CREATOR = new com.yandex.passport.api.impl.a(22);

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
