package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Rw extends Q2.a {
    public static final Parcelable.Creator<Rw> CREATOR = new V8(21);

    /* renamed from: n, reason: collision with root package name */
    public final int f27370n;

    /* renamed from: u, reason: collision with root package name */
    public final String f27371u;

    /* renamed from: v, reason: collision with root package name */
    public final String f27372v;

    public Rw(int i, String str, String str2) {
        this.f27370n = i;
        this.f27371u = str;
        this.f27372v = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f27370n);
        A8.b.z(parcel, 2, this.f27371u);
        A8.b.z(parcel, 3, this.f27372v);
        A8.b.I(parcel, G7);
    }
}
