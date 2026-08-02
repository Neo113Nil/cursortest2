package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new B8.d(26);

    /* renamed from: n, reason: collision with root package name */
    public final long f36712n;

    public d(long j6) {
        this.f36712n = j6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f36712n == ((d) obj).f36712n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f36712n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f36712n);
    }
}
