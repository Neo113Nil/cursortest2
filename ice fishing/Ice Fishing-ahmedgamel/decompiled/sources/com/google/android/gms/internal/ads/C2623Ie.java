package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Ie, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2623Ie extends S2.a {
    public static final Parcelable.Creator<C2623Ie> CREATOR = new V8(12);

    /* renamed from: n, reason: collision with root package name */
    public final String f26273n;

    public C2623Ie(String str) {
        this.f26273n = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 1, this.f26273n);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
