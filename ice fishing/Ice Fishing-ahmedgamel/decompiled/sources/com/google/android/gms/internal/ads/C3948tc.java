package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.tc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3948tc extends Q2.a {
    public static final Parcelable.Creator<C3948tc> CREATOR = new V8(3);

    /* renamed from: n, reason: collision with root package name */
    public final String f34322n;

    /* renamed from: u, reason: collision with root package name */
    public final String[] f34323u;

    /* renamed from: v, reason: collision with root package name */
    public final String[] f34324v;

    public C3948tc(String str, String[] strArr, String[] strArr2) {
        this.f34322n = str;
        this.f34323u = strArr;
        this.f34324v = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 1, this.f34322n);
        A8.b.A(parcel, 2, this.f34323u);
        A8.b.A(parcel, 3, this.f34324v);
        A8.b.I(parcel, G7);
    }
}
