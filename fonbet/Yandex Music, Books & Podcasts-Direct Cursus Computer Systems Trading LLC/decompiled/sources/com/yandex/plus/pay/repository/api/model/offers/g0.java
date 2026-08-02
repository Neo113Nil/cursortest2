package com.yandex.plus.pay.repository.api.model.offers;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eta;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class g0 extends h0 {

    @NotNull
    public static final Parcelable.Creator<g0> CREATOR = new com.yandex.plus.pay.adapter.api.b0(25);
    public final long a;

    public g0(long j) {
        this.a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && this.a == ((g0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return eta.g(new StringBuilder("TrialUntil(until="), this.a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
    }
}
