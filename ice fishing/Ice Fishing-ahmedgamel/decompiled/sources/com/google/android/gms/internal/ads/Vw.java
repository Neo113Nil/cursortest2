package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Vw extends S2.a {
    public static final Parcelable.Creator<Vw> CREATOR = new V8(23);

    /* renamed from: n, reason: collision with root package name */
    public final int f29074n;

    /* renamed from: u, reason: collision with root package name */
    public final int f29075u;

    /* renamed from: v, reason: collision with root package name */
    public final String f29076v;

    /* renamed from: w, reason: collision with root package name */
    public final String f29077w;

    /* renamed from: x, reason: collision with root package name */
    public final int f29078x;

    public Vw(int i, int i4, int i6, String str, String str2) {
        this.f29074n = i;
        this.f29075u = i4;
        this.f29076v = str;
        this.f29077w = str2;
        this.f29078x = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f29074n);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f29075u);
        com.bumptech.glide.e.r(parcel, 3, this.f29076v);
        com.bumptech.glide.e.r(parcel, 4, this.f29077w);
        com.bumptech.glide.e.w(parcel, 5, 4);
        parcel.writeInt(this.f29078x);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
