package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Sw extends P2.a {
    public static final Parcelable.Creator<Sw> CREATOR = new S8(21);

    /* renamed from: n, reason: collision with root package name */
    public final int f27645n;

    /* renamed from: u, reason: collision with root package name */
    public final String f27646u;

    /* renamed from: v, reason: collision with root package name */
    public final String f27647v;

    public Sw(int i, String str, String str2) {
        this.f27645n = i;
        this.f27646u = str;
        this.f27647v = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f27645n);
        S0.f.u(parcel, 2, this.f27646u);
        S0.f.u(parcel, 3, this.f27647v);
        S0.f.C(parcel, B8);
    }
}
