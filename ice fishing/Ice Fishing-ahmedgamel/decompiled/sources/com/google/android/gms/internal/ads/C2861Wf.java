package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Wf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2861Wf extends S2.a {
    public static final Parcelable.Creator<C2861Wf> CREATOR = new V8(18);

    /* renamed from: n, reason: collision with root package name */
    public final String f29162n;

    /* renamed from: u, reason: collision with root package name */
    public final String f29163u;

    /* renamed from: v, reason: collision with root package name */
    public final s2.f1 f29164v;

    /* renamed from: w, reason: collision with root package name */
    public final s2.c1 f29165w;

    public C2861Wf(String str, String str2, s2.f1 f1Var, s2.c1 c1Var) {
        this.f29162n = str;
        this.f29163u = str2;
        this.f29164v = f1Var;
        this.f29165w = c1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 1, this.f29162n);
        com.bumptech.glide.e.r(parcel, 2, this.f29163u);
        com.bumptech.glide.e.q(parcel, 3, this.f29164v, i);
        com.bumptech.glide.e.q(parcel, 4, this.f29165w, i);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
