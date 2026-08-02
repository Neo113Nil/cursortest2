package com.yandex.passport.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eta;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class z1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<z1> CREATOR = new a(6);
    public final com.yandex.passport.api.impl.b a;
    public final long b;

    public z1(com.yandex.passport.api.impl.b bVar, long j) {
        bVar.getClass();
        this.a = bVar;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return Intrinsics.d(this.a, z1Var.a) && this.b == z1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.a * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassportUidImpl(environment=");
        sb.append(this.a);
        sb.append(", value=");
        return eta.g(sb, this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeLong(this.b);
    }
}
