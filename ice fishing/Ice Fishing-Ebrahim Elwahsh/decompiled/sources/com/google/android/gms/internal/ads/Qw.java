package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Qw extends P2.a {
    public static final Parcelable.Creator<Qw> CREATOR = new S8(20);

    /* renamed from: n, reason: collision with root package name */
    public final int f27275n;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f27276u;

    public Qw(int i, byte[] bArr) {
        this.f27275n = i;
        this.f27276u = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f27275n);
        S0.f.r(parcel, 2, this.f27276u);
        S0.f.C(parcel, B8);
    }
}
