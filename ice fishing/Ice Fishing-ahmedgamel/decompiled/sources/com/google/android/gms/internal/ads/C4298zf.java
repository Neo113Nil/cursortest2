package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4298zf extends S2.a {
    public static final Parcelable.Creator<C4298zf> CREATOR = new V8(17);

    /* renamed from: A, reason: collision with root package name */
    public final List f36136A;

    /* renamed from: n, reason: collision with root package name */
    public final String f36137n;

    /* renamed from: u, reason: collision with root package name */
    public final String f36138u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f36139v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f36140w;

    /* renamed from: x, reason: collision with root package name */
    public final List f36141x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f36142y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f36143z;

    public C4298zf(String str, String str2, boolean z6, boolean z9, List list, boolean z10, boolean z11, List list2) {
        this.f36137n = str;
        this.f36138u = str2;
        this.f36139v = z6;
        this.f36140w = z9;
        this.f36141x = list;
        this.f36142y = z10;
        this.f36143z = z11;
        this.f36136A = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 2, this.f36137n);
        com.bumptech.glide.e.r(parcel, 3, this.f36138u);
        com.bumptech.glide.e.w(parcel, 4, 4);
        parcel.writeInt(this.f36139v ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 5, 4);
        parcel.writeInt(this.f36140w ? 1 : 0);
        com.bumptech.glide.e.t(parcel, 6, this.f36141x);
        com.bumptech.glide.e.w(parcel, 7, 4);
        parcel.writeInt(this.f36142y ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 8, 4);
        parcel.writeInt(this.f36143z ? 1 : 0);
        com.bumptech.glide.e.t(parcel, 9, this.f36136A);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
