package com.yandex.passport.sloth.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.vz1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class f extends g {

    @NotNull
    public static final Parcelable.Creator<f> CREATOR = new com.yandex.passport.internal.ui.authsdk.r(17);
    public final int a;

    public f(int i) {
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
        return (obj instanceof f) && this.a == ((f) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("Success(selectedPicture="), this.a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
    }
}
