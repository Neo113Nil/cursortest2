package com.gamericefishpro.space.v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.i9.y3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<n> CREATOR = new com.gamericefishpro.space.h.a(28);
    public final int d;
    public List e;

    public n(int i, List list) {
        this.d = i;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.U(parcel, 1, 4);
        parcel.writeInt(this.d);
        y3.S(parcel, 2, this.e);
        y3.W(parcel, iV);
    }
}
