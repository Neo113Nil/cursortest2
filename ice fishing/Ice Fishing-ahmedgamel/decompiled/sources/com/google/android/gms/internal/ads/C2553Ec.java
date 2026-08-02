package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Ec, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2553Ec extends S2.a {
    public static final Parcelable.Creator<C2553Ec> CREATOR = new V8(6);

    /* renamed from: n, reason: collision with root package name */
    public final String f25384n;

    /* renamed from: u, reason: collision with root package name */
    public final Bundle f25385u;

    public C2553Ec(String str, Bundle bundle) {
        this.f25384n = str;
        this.f25385u = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 1, this.f25384n);
        com.bumptech.glide.e.n(parcel, 2, this.f25385u);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
