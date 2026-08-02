package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Rw extends S2.a {
    public static final Parcelable.Creator<Rw> CREATOR = new V8(21);

    /* renamed from: n, reason: collision with root package name */
    public final int f28084n;

    /* renamed from: u, reason: collision with root package name */
    public final String f28085u;

    /* renamed from: v, reason: collision with root package name */
    public final String f28086v;

    public Rw(int i, String str, String str2) {
        this.f28084n = i;
        this.f28085u = str;
        this.f28086v = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f28084n);
        com.bumptech.glide.e.r(parcel, 2, this.f28085u);
        com.bumptech.glide.e.r(parcel, 3, this.f28086v);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
