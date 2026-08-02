package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.zc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4295zc extends S2.a {
    public static final Parcelable.Creator<C4295zc> CREATOR = new V8(5);

    /* renamed from: n, reason: collision with root package name */
    public final String f36122n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f36123u;

    /* renamed from: v, reason: collision with root package name */
    public final int f36124v;

    /* renamed from: w, reason: collision with root package name */
    public final String f36125w;

    public C4295zc(String str, int i, String str2, boolean z6) {
        this.f36122n = str;
        this.f36123u = z6;
        this.f36124v = i;
        this.f36125w = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 1, this.f36122n);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f36123u ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(this.f36124v);
        com.bumptech.glide.e.r(parcel, 4, this.f36125w);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
