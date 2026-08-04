package com.gamericefishpro.space.r8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.i9.y3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<a> CREATOR = new c(0);
    public final Intent d;

    public a(Intent intent) {
        this.d = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.P(parcel, 1, this.d, i);
        y3.W(parcel, iV);
    }
}
