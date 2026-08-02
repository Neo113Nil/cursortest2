package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.tu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3989tu extends S2.a {
    public static final Parcelable.Creator<C3989tu> CREATOR = new V8(19);

    /* renamed from: A, reason: collision with root package name */
    public final int f35189A;

    /* renamed from: B, reason: collision with root package name */
    public final int f35190B;

    /* renamed from: C, reason: collision with root package name */
    public final int f35191C;

    /* renamed from: n, reason: collision with root package name */
    public final Context f35192n;

    /* renamed from: u, reason: collision with root package name */
    public final int f35193u;

    /* renamed from: v, reason: collision with root package name */
    public final EnumC3935su f35194v;

    /* renamed from: w, reason: collision with root package name */
    public final int f35195w;

    /* renamed from: x, reason: collision with root package name */
    public final int f35196x;

    /* renamed from: y, reason: collision with root package name */
    public final int f35197y;

    /* renamed from: z, reason: collision with root package name */
    public final String f35198z;

    public C3989tu(int i, int i4, int i6, int i9, String str, int i10, int i11) {
        EnumC3935su[] values = EnumC3935su.values();
        this.f35192n = null;
        this.f35193u = i;
        this.f35194v = values[i];
        this.f35195w = i4;
        this.f35196x = i6;
        this.f35197y = i9;
        this.f35198z = str;
        this.f35189A = i10;
        this.f35191C = new int[]{1, 2, 3}[i10];
        this.f35190B = i11;
        int i12 = new int[]{1}[i11];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f35193u);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f35195w);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(this.f35196x);
        com.bumptech.glide.e.w(parcel, 4, 4);
        parcel.writeInt(this.f35197y);
        com.bumptech.glide.e.r(parcel, 5, this.f35198z);
        com.bumptech.glide.e.w(parcel, 6, 4);
        parcel.writeInt(this.f35189A);
        com.bumptech.glide.e.w(parcel, 7, 4);
        parcel.writeInt(this.f35190B);
        com.bumptech.glide.e.z(parcel, x9);
    }

    public C3989tu(Context context, EnumC3935su enumC3935su, int i, int i4, int i6, String str, String str2) {
        EnumC3935su.values();
        this.f35192n = context;
        this.f35193u = enumC3935su.ordinal();
        this.f35194v = enumC3935su;
        this.f35195w = i;
        this.f35196x = i4;
        this.f35197y = i6;
        this.f35198z = str;
        int i9 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.f35191C = i9;
        this.f35189A = i9 - 1;
        this.f35190B = 0;
    }
}
