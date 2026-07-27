package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Qe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2739Qe extends Q2.a {
    public static final Parcelable.Creator<C2739Qe> CREATOR = new V8(13);

    /* renamed from: A, reason: collision with root package name */
    public final String f27035A;

    /* renamed from: B, reason: collision with root package name */
    public C3966tu f27036B;

    /* renamed from: C, reason: collision with root package name */
    public String f27037C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f27038D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f27039E;

    /* renamed from: F, reason: collision with root package name */
    public final Bundle f27040F;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f27041n;

    /* renamed from: u, reason: collision with root package name */
    public final C5110a f27042u;

    /* renamed from: v, reason: collision with root package name */
    public final ApplicationInfo f27043v;

    /* renamed from: w, reason: collision with root package name */
    public final String f27044w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f27045x;

    /* renamed from: y, reason: collision with root package name */
    public final PackageInfo f27046y;

    /* renamed from: z, reason: collision with root package name */
    public final String f27047z;

    public C2739Qe(Bundle bundle, C5110a c5110a, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, C3966tu c3966tu, String str4, boolean z3, boolean z6, Bundle bundle2) {
        this.f27041n = bundle;
        this.f27042u = c5110a;
        this.f27044w = str;
        this.f27043v = applicationInfo;
        this.f27045x = arrayList;
        this.f27046y = packageInfo;
        this.f27047z = str2;
        this.f27035A = str3;
        this.f27036B = c3966tu;
        this.f27037C = str4;
        this.f27038D = z3;
        this.f27039E = z6;
        this.f27040F = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.v(parcel, 1, this.f27041n);
        A8.b.y(parcel, 2, this.f27042u, i);
        A8.b.y(parcel, 3, this.f27043v, i);
        A8.b.z(parcel, 4, this.f27044w);
        A8.b.B(parcel, 5, this.f27045x);
        A8.b.y(parcel, 6, this.f27046y, i);
        A8.b.z(parcel, 7, this.f27047z);
        A8.b.z(parcel, 9, this.f27035A);
        A8.b.y(parcel, 10, this.f27036B, i);
        A8.b.z(parcel, 11, this.f27037C);
        A8.b.F(parcel, 12, 4);
        parcel.writeInt(this.f27038D ? 1 : 0);
        A8.b.F(parcel, 13, 4);
        parcel.writeInt(this.f27039E ? 1 : 0);
        A8.b.v(parcel, 14, this.f27040F);
        A8.b.I(parcel, G7);
    }
}
