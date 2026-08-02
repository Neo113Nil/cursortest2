package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Ze, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2908Ze extends S2.a {
    public static final Parcelable.Creator<C2908Ze> CREATOR = new V8(14);

    /* renamed from: n, reason: collision with root package name */
    public final s2.c1 f29688n;

    /* renamed from: u, reason: collision with root package name */
    public final String f29689u;

    public C2908Ze(String str, s2.c1 c1Var) {
        this.f29688n = c1Var;
        this.f29689u = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.q(parcel, 2, this.f29688n, i);
        com.bumptech.glide.e.r(parcel, 3, this.f29689u);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
