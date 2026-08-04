package com.gamericefishpro.space.p9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.i9.y3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<b> CREATOR = new com.gamericefishpro.space.h.a(16);
    public final int d;
    public final int e;
    public final Intent i;

    public b(int i, int i2, Intent intent) {
        this.d = i;
        this.e = i2;
        this.i = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.U(parcel, 1, 4);
        parcel.writeInt(this.d);
        y3.U(parcel, 2, 4);
        parcel.writeInt(this.e);
        y3.P(parcel, 3, this.i, i);
        y3.W(parcel, iV);
    }
}
