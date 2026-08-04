package com.gamericefishpro.space.r5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Parcelable {
    public static final Parcelable.Creator<r0> CREATOR = new com.gamericefishpro.space.h.a(21);
    public boolean A;
    public boolean B;
    public boolean C;
    public int d;
    public int e;
    public int i;
    public int[] v;
    public int w;
    public int[] y;
    public ArrayList z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.i);
        if (this.i > 0) {
            parcel.writeIntArray(this.v);
        }
        parcel.writeInt(this.w);
        if (this.w > 0) {
            parcel.writeIntArray(this.y);
        }
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeList(this.z);
    }
}
