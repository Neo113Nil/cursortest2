package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Fc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2550Fc extends Q2.a {
    public static final Parcelable.Creator<C2550Fc> CREATOR = new V8(7);

    /* renamed from: n, reason: collision with root package name */
    public final int f24806n;

    /* renamed from: u, reason: collision with root package name */
    public final int f24807u;

    /* renamed from: v, reason: collision with root package name */
    public final String f24808v;

    /* renamed from: w, reason: collision with root package name */
    public final int f24809w;

    public C2550Fc(int i, String str, int i6, int i9) {
        this.f24806n = i;
        this.f24807u = i6;
        this.f24808v = str;
        this.f24809w = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f24807u);
        A8.b.z(parcel, 2, this.f24808v);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(this.f24809w);
        A8.b.F(parcel, 1000, 4);
        parcel.writeInt(this.f24806n);
        A8.b.I(parcel, G7);
    }
}
