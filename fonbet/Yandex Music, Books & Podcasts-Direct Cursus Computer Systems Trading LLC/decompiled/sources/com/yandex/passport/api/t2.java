package com.yandex.passport.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class t2 implements u2 {
    public static final t2 a = new t2();

    @NotNull
    public static final Parcelable.Creator<t2> CREATOR = new a(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.yandex.passport.api.u2
    public final s2 v() {
        return new s2(-2, -2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
