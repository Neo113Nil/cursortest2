package com.yandex.passport.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eta;
import defpackage.u7g;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class u0 implements Parcelable {
    public final long a;

    @NotNull
    public static final t0 Companion = new t0();

    @NotNull
    public static final Parcelable.Creator<u0> CREATOR = new a(3);

    public /* synthetic */ u0(int i, long j) {
        if (1 == (i & 1)) {
            this.a = j;
        } else {
            u7g.V(i, 1, s0.a.getDescriptor());
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && this.a == ((u0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return eta.g(new StringBuilder("PassportLocation(value="), this.a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
    }

    public u0(long j) {
        this.a = j;
    }
}
