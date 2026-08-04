package com.gamericefishpro.space.p9;

import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.v8.w;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<g> CREATOR = new com.gamericefishpro.space.h.a(18);
    public final int d;
    public final com.gamericefishpro.space.s8.b e;
    public final w i;

    public g(int i, com.gamericefishpro.space.s8.b bVar, w wVar) {
        this.d = i;
        this.e = bVar;
        this.i = wVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.U(parcel, 1, 4);
        parcel.writeInt(this.d);
        y3.P(parcel, 2, this.e, i);
        y3.P(parcel, 3, this.i, i);
        y3.W(parcel, iV);
    }
}
