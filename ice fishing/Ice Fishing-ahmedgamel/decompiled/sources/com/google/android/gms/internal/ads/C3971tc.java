package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.tc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3971tc extends S2.a {
    public static final Parcelable.Creator<C3971tc> CREATOR = new V8(3);

    /* renamed from: n, reason: collision with root package name */
    public final String f35101n;

    /* renamed from: u, reason: collision with root package name */
    public final String[] f35102u;

    /* renamed from: v, reason: collision with root package name */
    public final String[] f35103v;

    public C3971tc(String str, String[] strArr, String[] strArr2) {
        this.f35101n = str;
        this.f35102u = strArr;
        this.f35103v = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 1, this.f35101n);
        com.bumptech.glide.e.s(parcel, 2, this.f35102u);
        com.bumptech.glide.e.s(parcel, 3, this.f35103v);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
