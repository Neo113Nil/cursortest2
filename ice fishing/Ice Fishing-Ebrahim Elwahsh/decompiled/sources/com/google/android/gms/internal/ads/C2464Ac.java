package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Ac, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2464Ac extends P2.a {
    public static final Parcelable.Creator<C2464Ac> CREATOR = new S8(7);

    /* renamed from: n, reason: collision with root package name */
    public final int f23876n;

    /* renamed from: u, reason: collision with root package name */
    public final int f23877u;

    /* renamed from: v, reason: collision with root package name */
    public final String f23878v;

    /* renamed from: w, reason: collision with root package name */
    public final int f23879w;

    public C2464Ac(int i, String str, int i4, int i9) {
        this.f23876n = i;
        this.f23877u = i4;
        this.f23878v = str;
        this.f23879w = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f23877u);
        S0.f.u(parcel, 2, this.f23878v);
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(this.f23879w);
        S0.f.A(parcel, 1000, 4);
        parcel.writeInt(this.f23876n);
        S0.f.C(parcel, B8);
    }
}
