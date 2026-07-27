package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Ie, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2603Ie extends Q2.a {
    public static final Parcelable.Creator<C2603Ie> CREATOR = new V8(12);

    /* renamed from: n, reason: collision with root package name */
    public final String f25524n;

    public C2603Ie(String str) {
        this.f25524n = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 1, this.f25524n);
        A8.b.I(parcel, G7);
    }
}
