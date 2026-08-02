package com.yandex.passport.data.network;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class i8 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<i8> CREATOR = new com.yandex.passport.api.impl.a(20);
    public final String a;
    public final m8 b;

    public i8(String str, m8 m8Var) {
        str.getClass();
        m8Var.getClass();
        this.a = str;
        this.b = m8Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return Intrinsics.d(this.a, i8Var.a) && Intrinsics.d(this.b, i8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Result(trackId=" + this.a + ", state=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
