package com.gamericefishpro.space.r5;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends com.gamericefishpro.space.j4.b {
    public static final Parcelable.Creator<i0> CREATOR = new com.gamericefishpro.space.f1.t(7);
    public Parcelable i;

    public i0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.i = parcel.readParcelable(classLoader == null ? b0.class.getClassLoader() : classLoader);
    }

    @Override // com.gamericefishpro.space.j4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.i, 0);
    }
}
