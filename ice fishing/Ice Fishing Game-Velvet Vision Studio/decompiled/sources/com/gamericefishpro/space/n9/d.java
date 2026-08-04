package com.gamericefishpro.space.n9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<d> CREATOR = new com.gamericefishpro.space.h.a(4);
    public final long d;
    public final int e;
    public final long i;

    public d(int i, long j, long j2) {
        this.d = j;
        this.e = i;
        this.i = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = com.gamericefishpro.space.i9.y3.V(parcel, 20293);
        com.gamericefishpro.space.i9.y3.U(parcel, 1, 8);
        parcel.writeLong(this.d);
        com.gamericefishpro.space.i9.y3.U(parcel, 2, 4);
        parcel.writeInt(this.e);
        com.gamericefishpro.space.i9.y3.U(parcel, 3, 8);
        parcel.writeLong(this.i);
        com.gamericefishpro.space.i9.y3.W(parcel, iV);
    }
}
