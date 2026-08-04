package com.gamericefishpro.space.n;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends com.gamericefishpro.space.j4.b {
    public static final Parcelable.Creator<f2> CREATOR = new com.gamericefishpro.space.f1.t(4);
    public int i;
    public boolean v;

    public f2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.i = parcel.readInt();
        this.v = parcel.readInt() != 0;
    }

    @Override // com.gamericefishpro.space.j4.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.i);
        parcel.writeInt(this.v ? 1 : 0);
    }
}
