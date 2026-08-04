package com.gamericefishpro.space.v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.i9.y3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<g> CREATOR = new v(4);
    public final m d;
    public final boolean e;
    public final boolean i;
    public final int[] v;
    public final int w;
    public final int[] y;

    public g(m mVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.d = mVar;
        this.e = z;
        this.i = z2;
        this.v = iArr;
        this.w = i;
        this.y = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.P(parcel, 1, this.d, i);
        y3.U(parcel, 2, 4);
        parcel.writeInt(this.e ? 1 : 0);
        y3.U(parcel, 3, 4);
        parcel.writeInt(this.i ? 1 : 0);
        int[] iArr = this.v;
        if (iArr != null) {
            int iV2 = y3.V(parcel, 4);
            parcel.writeIntArray(iArr);
            y3.W(parcel, iV2);
        }
        y3.U(parcel, 5, 4);
        parcel.writeInt(this.w);
        int[] iArr2 = this.y;
        if (iArr2 != null) {
            int iV3 = y3.V(parcel, 6);
            parcel.writeIntArray(iArr2);
            y3.W(parcel, iV3);
        }
        y3.W(parcel, iV);
    }
}
