package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Xw extends P2.a {
    public static final Parcelable.Creator<Xw> CREATOR = new S8(23);

    /* renamed from: n, reason: collision with root package name */
    public final int f28735n;

    /* renamed from: u, reason: collision with root package name */
    public final int f28736u;

    /* renamed from: v, reason: collision with root package name */
    public final String f28737v;

    /* renamed from: w, reason: collision with root package name */
    public final String f28738w;

    /* renamed from: x, reason: collision with root package name */
    public final int f28739x;

    public Xw(int i, int i4, int i9, String str, String str2) {
        this.f28735n = i;
        this.f28736u = i4;
        this.f28737v = str;
        this.f28738w = str2;
        this.f28739x = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f28735n);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f28736u);
        S0.f.u(parcel, 3, this.f28737v);
        S0.f.u(parcel, 4, this.f28738w);
        S0.f.A(parcel, 5, 4);
        parcel.writeInt(this.f28739x);
        S0.f.C(parcel, B8);
    }
}
