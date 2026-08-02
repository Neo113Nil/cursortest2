package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Fc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2570Fc extends S2.a {
    public static final Parcelable.Creator<C2570Fc> CREATOR = new V8(7);

    /* renamed from: n, reason: collision with root package name */
    public final int f25595n;

    /* renamed from: u, reason: collision with root package name */
    public final int f25596u;

    /* renamed from: v, reason: collision with root package name */
    public final String f25597v;

    /* renamed from: w, reason: collision with root package name */
    public final int f25598w;

    public C2570Fc(int i, String str, int i4, int i6) {
        this.f25595n = i;
        this.f25596u = i4;
        this.f25597v = str;
        this.f25598w = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f25596u);
        com.bumptech.glide.e.r(parcel, 2, this.f25597v);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(this.f25598w);
        com.bumptech.glide.e.w(parcel, 1000, 4);
        parcel.writeInt(this.f25595n);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
