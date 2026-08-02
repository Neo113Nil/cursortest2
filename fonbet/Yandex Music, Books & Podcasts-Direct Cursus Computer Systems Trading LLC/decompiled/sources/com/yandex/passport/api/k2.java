package com.yandex.passport.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.vz1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class k2 implements l2 {

    @NotNull
    public static final Parcelable.Creator<k2> CREATOR = new a(8);
    public final int a;

    public k2(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2) && this.a == ((k2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("Lottie(lottieAnimationResId="), this.a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
    }
}
