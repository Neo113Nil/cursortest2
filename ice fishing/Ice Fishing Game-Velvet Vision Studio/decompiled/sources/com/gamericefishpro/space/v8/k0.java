package com.gamericefishpro.space.v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.i9.y3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<k0> CREATOR = new v(3);
    public Bundle d;
    public com.gamericefishpro.space.s8.d[] e;
    public int i;
    public g v;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.N(parcel, 1, this.d);
        y3.R(parcel, 2, this.e, i);
        int i2 = this.i;
        y3.U(parcel, 3, 4);
        parcel.writeInt(i2);
        y3.P(parcel, 4, this.v, i);
        y3.W(parcel, iV);
    }
}
