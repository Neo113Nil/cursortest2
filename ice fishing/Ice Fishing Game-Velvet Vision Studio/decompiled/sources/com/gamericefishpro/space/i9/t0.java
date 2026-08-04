package com.gamericefishpro.space.i9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<t0> CREATOR = new u0(0);
    public final long d;
    public final long e;
    public final boolean i;
    public final Bundle v;
    public final String w;

    public t0(long j, long j2, boolean z, Bundle bundle, String str) {
        this.d = j;
        this.e = j2;
        this.i = z;
        this.v = bundle;
        this.w = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.U(parcel, 1, 8);
        parcel.writeLong(this.d);
        y3.U(parcel, 2, 8);
        parcel.writeLong(this.e);
        y3.U(parcel, 3, 4);
        parcel.writeInt(this.i ? 1 : 0);
        y3.N(parcel, 7, this.v);
        y3.Q(parcel, 8, this.w);
        y3.W(parcel, iV);
    }
}
