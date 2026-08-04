package com.gamericefishpro.space.s8;

import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.i9.y3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<s> CREATOR = new com.gamericefishpro.space.h.a(24);
    public final boolean d;
    public final String e;
    public final int i;
    public final int v;
    public final long w;

    public s(boolean z, String str, int i, int i2, long j) {
        this.d = z;
        this.e = str;
        this.i = com.gamericefishpro.space.wa.b.T(i) - 1;
        this.v = com.gamericefishpro.space.u6.f.O(i2) - 1;
        this.w = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.U(parcel, 1, 4);
        parcel.writeInt(this.d ? 1 : 0);
        y3.Q(parcel, 2, this.e);
        y3.U(parcel, 3, 4);
        parcel.writeInt(this.i);
        y3.U(parcel, 4, 4);
        parcel.writeInt(this.v);
        y3.U(parcel, 5, 8);
        parcel.writeLong(this.w);
        y3.W(parcel, iV);
    }
}
