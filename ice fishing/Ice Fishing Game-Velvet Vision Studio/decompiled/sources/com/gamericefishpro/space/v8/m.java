package com.gamericefishpro.space.v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.i9.y3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<m> CREATOR = new v(2);
    public final int d;
    public final boolean e;
    public final boolean i;
    public final int v;
    public final int w;

    public m(int i, boolean z, boolean z2, int i2, int i3) {
        this.d = i;
        this.e = z;
        this.i = z2;
        this.v = i2;
        this.w = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.U(parcel, 1, 4);
        parcel.writeInt(this.d);
        y3.U(parcel, 2, 4);
        parcel.writeInt(this.e ? 1 : 0);
        y3.U(parcel, 3, 4);
        parcel.writeInt(this.i ? 1 : 0);
        y3.U(parcel, 4, 4);
        parcel.writeInt(this.v);
        y3.U(parcel, 5, 4);
        parcel.writeInt(this.w);
        y3.W(parcel, iV);
    }
}
