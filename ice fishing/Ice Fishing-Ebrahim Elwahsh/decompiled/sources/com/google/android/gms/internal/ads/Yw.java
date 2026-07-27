package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Yw extends P2.a {
    public static final Parcelable.Creator<Yw> CREATOR = new S8(24);

    /* renamed from: n, reason: collision with root package name */
    public final int f28921n;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f28922u;

    /* renamed from: v, reason: collision with root package name */
    public final int f28923v;

    public Yw(byte[] bArr, int i, int i4) {
        this.f28921n = i;
        this.f28922u = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f28923v = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f28921n);
        S0.f.r(parcel, 2, this.f28922u);
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(this.f28923v);
        S0.f.C(parcel, B8);
    }

    public Yw() {
        this(null, 1, 1);
    }
}
