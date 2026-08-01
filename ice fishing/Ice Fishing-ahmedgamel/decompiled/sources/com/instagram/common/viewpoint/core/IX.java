package com.instagram.common.viewpoint.core;

import android.os.Parcel;

/* loaded from: assets/audience_network/classes2.dex */
public final class IX {
    public final int A00;
    public final long A01;
    public final long A02;

    public IX(int i, long j6, long j9) {
        this.A00 = i;
        this.A02 = j6;
        this.A01 = j9;
    }

    public /* synthetic */ IX(int i, long j6, long j9, IW iw) {
        this(i, j6, j9);
    }

    public static IX A00(Parcel parcel) {
        return new IX(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}
