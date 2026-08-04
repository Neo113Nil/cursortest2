package com.gamericefishpro.space.v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.i9.y3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<k> CREATOR = new com.gamericefishpro.space.h.a(29);
    public final int A;
    public final int B;
    public final int d;
    public final int e;
    public final int i;
    public final long v;
    public final long w;
    public final String y;
    public final String z;

    public k(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.d = i;
        this.e = i2;
        this.i = i3;
        this.v = j;
        this.w = j2;
        this.y = str;
        this.z = str2;
        this.A = i4;
        this.B = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.U(parcel, 1, 4);
        parcel.writeInt(this.d);
        y3.U(parcel, 2, 4);
        parcel.writeInt(this.e);
        y3.U(parcel, 3, 4);
        parcel.writeInt(this.i);
        y3.U(parcel, 4, 8);
        parcel.writeLong(this.v);
        y3.U(parcel, 5, 8);
        parcel.writeLong(this.w);
        y3.Q(parcel, 6, this.y);
        y3.Q(parcel, 7, this.z);
        y3.U(parcel, 8, 4);
        parcel.writeInt(this.A);
        y3.U(parcel, 9, 4);
        parcel.writeInt(this.B);
        y3.W(parcel, iV);
    }
}
