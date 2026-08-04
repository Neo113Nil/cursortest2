package com.gamericefishpro.space.n9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d4 extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<d4> CREATOR = new com.gamericefishpro.space.h.a(10);
    public final long d;
    public byte[] e;
    public final String i;
    public final Bundle v;
    public final int w;
    public final long y;
    public String z;

    public d4(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.d = j;
        this.e = bArr;
        this.i = str;
        this.v = bundle;
        this.w = i;
        this.y = j2;
        this.z = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = com.gamericefishpro.space.i9.y3.V(parcel, 20293);
        com.gamericefishpro.space.i9.y3.U(parcel, 1, 8);
        parcel.writeLong(this.d);
        byte[] bArr = this.e;
        if (bArr != null) {
            int iV2 = com.gamericefishpro.space.i9.y3.V(parcel, 2);
            parcel.writeByteArray(bArr);
            com.gamericefishpro.space.i9.y3.W(parcel, iV2);
        }
        com.gamericefishpro.space.i9.y3.Q(parcel, 3, this.i);
        com.gamericefishpro.space.i9.y3.N(parcel, 4, this.v);
        com.gamericefishpro.space.i9.y3.U(parcel, 5, 4);
        parcel.writeInt(this.w);
        com.gamericefishpro.space.i9.y3.U(parcel, 6, 8);
        parcel.writeLong(this.y);
        com.gamericefishpro.space.i9.y3.Q(parcel, 7, this.z);
        com.gamericefishpro.space.i9.y3.W(parcel, iV);
    }
}
