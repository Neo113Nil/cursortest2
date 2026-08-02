package com.yandex.passport.internal.push;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eta;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class j0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<j0> CREATOR = new b0(2);
    public final h0 a;
    public final long b;
    public final long c;

    public j0(h0 h0Var, long j, long j2) {
        this.a = h0Var;
        this.b = j;
        this.c = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.d(this.a, j0Var.a) && this.b == j0Var.b && this.c == j0Var.c;
    }

    public final int hashCode() {
        h0 h0Var = this.a;
        return Long.hashCode(this.c) + tlm.c(this.b, (h0Var == null ? 0 : h0Var.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushPayloadHolder(pushPayload=");
        sb.append(this.a);
        sb.append(", passportProcessStarted=");
        sb.append(this.b);
        sb.append(", passportProcessFinished=");
        return eta.g(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        h0 h0Var = this.a;
        if (h0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            h0Var.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }
}
