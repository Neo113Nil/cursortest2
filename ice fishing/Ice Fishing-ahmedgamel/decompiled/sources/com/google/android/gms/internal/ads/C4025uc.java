package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.uc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4025uc extends S2.a {
    public static final Parcelable.Creator<C4025uc> CREATOR = new V8(4);

    /* renamed from: A, reason: collision with root package name */
    public final long f35319A;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f35320n;

    /* renamed from: u, reason: collision with root package name */
    public final String f35321u;

    /* renamed from: v, reason: collision with root package name */
    public final int f35322v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f35323w;

    /* renamed from: x, reason: collision with root package name */
    public final String[] f35324x;

    /* renamed from: y, reason: collision with root package name */
    public final String[] f35325y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f35326z;

    public C4025uc(boolean z6, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z9, long j6) {
        this.f35320n = z6;
        this.f35321u = str;
        this.f35322v = i;
        this.f35323w = bArr;
        this.f35324x = strArr;
        this.f35325y = strArr2;
        this.f35326z = z9;
        this.f35319A = j6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f35320n ? 1 : 0);
        com.bumptech.glide.e.r(parcel, 2, this.f35321u);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(this.f35322v);
        com.bumptech.glide.e.o(parcel, 4, this.f35323w);
        com.bumptech.glide.e.s(parcel, 5, this.f35324x);
        com.bumptech.glide.e.s(parcel, 6, this.f35325y);
        com.bumptech.glide.e.w(parcel, 7, 4);
        parcel.writeInt(this.f35326z ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 8, 8);
        parcel.writeLong(this.f35319A);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
