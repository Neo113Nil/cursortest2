package com.gamericefishpro.space.tb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.i9.y3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<r> CREATOR = new com.gamericefishpro.space.h.a(27);
    public final Bundle d;

    public r(Bundle bundle) {
        this.d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.N(parcel, 2, this.d);
        y3.W(parcel, iV);
    }
}
