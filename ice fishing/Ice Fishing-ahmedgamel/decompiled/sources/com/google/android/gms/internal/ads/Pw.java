package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Pw extends Q2.a {
    public static final Parcelable.Creator<Pw> CREATOR = new V8(20);

    /* renamed from: n, reason: collision with root package name */
    public final int f26879n;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f26880u;

    public Pw(int i, byte[] bArr) {
        this.f26879n = i;
        this.f26880u = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f26879n);
        A8.b.w(parcel, 2, this.f26880u);
        A8.b.I(parcel, G7);
    }
}
