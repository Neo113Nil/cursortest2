package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4275zf extends Q2.a {
    public static final Parcelable.Creator<C4275zf> CREATOR = new V8(17);

    /* renamed from: A, reason: collision with root package name */
    public final List f35363A;

    /* renamed from: n, reason: collision with root package name */
    public final String f35364n;

    /* renamed from: u, reason: collision with root package name */
    public final String f35365u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f35366v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f35367w;

    /* renamed from: x, reason: collision with root package name */
    public final List f35368x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f35369y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f35370z;

    public C4275zf(String str, String str2, boolean z3, boolean z6, List list, boolean z9, boolean z10, List list2) {
        this.f35364n = str;
        this.f35365u = str2;
        this.f35366v = z3;
        this.f35367w = z6;
        this.f35368x = list;
        this.f35369y = z9;
        this.f35370z = z10;
        this.f35363A = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 2, this.f35364n);
        A8.b.z(parcel, 3, this.f35365u);
        A8.b.F(parcel, 4, 4);
        parcel.writeInt(this.f35366v ? 1 : 0);
        A8.b.F(parcel, 5, 4);
        parcel.writeInt(this.f35367w ? 1 : 0);
        A8.b.B(parcel, 6, this.f35368x);
        A8.b.F(parcel, 7, 4);
        parcel.writeInt(this.f35369y ? 1 : 0);
        A8.b.F(parcel, 8, 4);
        parcel.writeInt(this.f35370z ? 1 : 0);
        A8.b.B(parcel, 9, this.f35363A);
        A8.b.I(parcel, G7);
    }
}
