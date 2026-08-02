package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Pw extends S2.a {
    public static final Parcelable.Creator<Pw> CREATOR = new V8(20);

    /* renamed from: n, reason: collision with root package name */
    public final int f27666n;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f27667u;

    public Pw(int i, byte[] bArr) {
        this.f27666n = i;
        this.f27667u = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f27666n);
        com.bumptech.glide.e.o(parcel, 2, this.f27667u);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
