package com.gamericefishpro.space.n9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a4 extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<a4> CREATOR = new com.gamericefishpro.space.h.a(9);
    public final String d;
    public final long e;
    public final int i;

    public a4(String str, long j, int i) {
        this.d = str;
        this.e = j;
        this.i = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = com.gamericefishpro.space.i9.y3.V(parcel, 20293);
        com.gamericefishpro.space.i9.y3.Q(parcel, 1, this.d);
        com.gamericefishpro.space.i9.y3.U(parcel, 2, 8);
        parcel.writeLong(this.e);
        com.gamericefishpro.space.i9.y3.U(parcel, 3, 4);
        parcel.writeInt(this.i);
        com.gamericefishpro.space.i9.y3.W(parcel, iV);
    }
}
