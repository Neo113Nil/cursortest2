package com.yandex.passport.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.g4i;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class q2 implements u2 {
    public static final q2 a = new q2();

    @NotNull
    public static final Parcelable.Creator<q2> CREATOR = new a(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.yandex.passport.api.u2
    public final s2 v() {
        float f = 50;
        float f2 = g4i.a.density;
        return new s2((int) (f * f2), (int) (f * f2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
