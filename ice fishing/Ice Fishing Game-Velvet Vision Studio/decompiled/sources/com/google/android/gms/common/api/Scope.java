package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.v8.c0;
import com.gamericefishpro.space.w8.a;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new com.gamericefishpro.space.h.a(25);
    public final int d;
    public final String e;

    public Scope(int i, String str) {
        c0.e(str, "scopeUri must not be null or empty");
        this.d = i;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.e.equals(((Scope) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.U(parcel, 1, 4);
        parcel.writeInt(this.d);
        y3.Q(parcel, 2, this.e);
        y3.W(parcel, iV);
    }
}
