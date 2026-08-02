package com.yandex.passport.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eta;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class j2 implements l2 {

    @NotNull
    public static final Parcelable.Creator<j2> CREATOR = new a(7);
    public final long a;

    public /* synthetic */ j2() {
        this(0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2) && this.a == ((j2) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return eta.g(new StringBuilder("Default(visibilityDelay="), this.a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
    }

    public j2(long j) {
        this.a = j;
    }
}
