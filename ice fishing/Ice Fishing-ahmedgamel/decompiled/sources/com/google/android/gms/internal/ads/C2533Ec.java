package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Ec, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2533Ec extends Q2.a {
    public static final Parcelable.Creator<C2533Ec> CREATOR = new V8(6);

    /* renamed from: n, reason: collision with root package name */
    public final String f24631n;

    /* renamed from: u, reason: collision with root package name */
    public final Bundle f24632u;

    public C2533Ec(String str, Bundle bundle) {
        this.f24631n = str;
        this.f24632u = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 1, this.f24631n);
        A8.b.v(parcel, 2, this.f24632u);
        A8.b.I(parcel, G7);
    }
}
