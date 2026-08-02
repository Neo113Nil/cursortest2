package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Qe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2759Qe extends S2.a {
    public static final Parcelable.Creator<C2759Qe> CREATOR = new V8(13);

    /* renamed from: A, reason: collision with root package name */
    public final String f27820A;

    /* renamed from: B, reason: collision with root package name */
    public C3989tu f27821B;

    /* renamed from: C, reason: collision with root package name */
    public String f27822C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f27823D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f27824E;

    /* renamed from: F, reason: collision with root package name */
    public final Bundle f27825F;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f27826n;

    /* renamed from: u, reason: collision with root package name */
    public final C5189a f27827u;

    /* renamed from: v, reason: collision with root package name */
    public final ApplicationInfo f27828v;

    /* renamed from: w, reason: collision with root package name */
    public final String f27829w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f27830x;

    /* renamed from: y, reason: collision with root package name */
    public final PackageInfo f27831y;

    /* renamed from: z, reason: collision with root package name */
    public final String f27832z;

    public C2759Qe(Bundle bundle, C5189a c5189a, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, C3989tu c3989tu, String str4, boolean z6, boolean z9, Bundle bundle2) {
        this.f27826n = bundle;
        this.f27827u = c5189a;
        this.f27829w = str;
        this.f27828v = applicationInfo;
        this.f27830x = arrayList;
        this.f27831y = packageInfo;
        this.f27832z = str2;
        this.f27820A = str3;
        this.f27821B = c3989tu;
        this.f27822C = str4;
        this.f27823D = z6;
        this.f27824E = z9;
        this.f27825F = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.n(parcel, 1, this.f27826n);
        com.bumptech.glide.e.q(parcel, 2, this.f27827u, i);
        com.bumptech.glide.e.q(parcel, 3, this.f27828v, i);
        com.bumptech.glide.e.r(parcel, 4, this.f27829w);
        com.bumptech.glide.e.t(parcel, 5, this.f27830x);
        com.bumptech.glide.e.q(parcel, 6, this.f27831y, i);
        com.bumptech.glide.e.r(parcel, 7, this.f27832z);
        com.bumptech.glide.e.r(parcel, 9, this.f27820A);
        com.bumptech.glide.e.q(parcel, 10, this.f27821B, i);
        com.bumptech.glide.e.r(parcel, 11, this.f27822C);
        com.bumptech.glide.e.w(parcel, 12, 4);
        parcel.writeInt(this.f27823D ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 13, 4);
        parcel.writeInt(this.f27824E ? 1 : 0);
        com.bumptech.glide.e.n(parcel, 14, this.f27825F);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
