package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.uf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4028uf extends S2.a {
    public static final Parcelable.Creator<C4028uf> CREATOR = new V8(16);

    /* renamed from: n, reason: collision with root package name */
    public final String f35327n;

    /* renamed from: u, reason: collision with root package name */
    public final String f35328u;

    public C4028uf(String str, String str2) {
        this.f35327n = str;
        this.f35328u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 1, this.f35327n);
        com.bumptech.glide.e.r(parcel, 2, this.f35328u);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
