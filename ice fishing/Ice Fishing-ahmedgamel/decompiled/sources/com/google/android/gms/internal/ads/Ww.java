package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Ww extends S2.a {
    public static final Parcelable.Creator<Ww> CREATOR = new V8(24);

    /* renamed from: n, reason: collision with root package name */
    public final int f29225n;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f29226u;

    /* renamed from: v, reason: collision with root package name */
    public final int f29227v;

    public Ww(byte[] bArr, int i, int i4) {
        this.f29225n = i;
        this.f29226u = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f29227v = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f29225n);
        com.bumptech.glide.e.o(parcel, 2, this.f29226u);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(this.f29227v);
        com.bumptech.glide.e.z(parcel, x9);
    }

    public Ww() {
        this(null, 1, 1);
    }
}
