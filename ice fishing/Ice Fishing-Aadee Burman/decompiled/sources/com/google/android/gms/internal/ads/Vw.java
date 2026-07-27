package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Vw extends Q2.a {
    public static final Parcelable.Creator<Vw> CREATOR = new V8(23);

    /* renamed from: n, reason: collision with root package name */
    public final int f28276n;

    /* renamed from: u, reason: collision with root package name */
    public final int f28277u;

    /* renamed from: v, reason: collision with root package name */
    public final String f28278v;

    /* renamed from: w, reason: collision with root package name */
    public final String f28279w;

    /* renamed from: x, reason: collision with root package name */
    public final int f28280x;

    public Vw(int i, int i6, int i9, String str, String str2) {
        this.f28276n = i;
        this.f28277u = i6;
        this.f28278v = str;
        this.f28279w = str2;
        this.f28280x = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f28276n);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f28277u);
        A8.b.z(parcel, 3, this.f28278v);
        A8.b.z(parcel, 4, this.f28279w);
        A8.b.F(parcel, 5, 4);
        parcel.writeInt(this.f28280x);
        A8.b.I(parcel, G7);
    }
}
