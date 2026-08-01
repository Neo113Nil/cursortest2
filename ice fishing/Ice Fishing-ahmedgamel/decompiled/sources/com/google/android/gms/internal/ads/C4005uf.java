package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.uf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4005uf extends Q2.a {
    public static final Parcelable.Creator<C4005uf> CREATOR = new V8(16);

    /* renamed from: n, reason: collision with root package name */
    public final String f34555n;

    /* renamed from: u, reason: collision with root package name */
    public final String f34556u;

    public C4005uf(String str, String str2) {
        this.f34555n = str;
        this.f34556u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 1, this.f34555n);
        A8.b.z(parcel, 2, this.f34556u);
        A8.b.I(parcel, G7);
    }
}
