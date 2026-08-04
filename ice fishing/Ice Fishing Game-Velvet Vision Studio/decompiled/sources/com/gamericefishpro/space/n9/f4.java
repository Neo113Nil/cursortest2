package com.gamericefishpro.space.n9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f4 extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<f4> CREATOR = new com.gamericefishpro.space.h.a(12);
    public final List d;

    public f4(ArrayList arrayList) {
        this.d = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = com.gamericefishpro.space.i9.y3.V(parcel, 20293);
        com.gamericefishpro.space.i9.y3.S(parcel, 1, this.d);
        com.gamericefishpro.space.i9.y3.W(parcel, iV);
    }
}
