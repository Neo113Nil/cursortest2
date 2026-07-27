package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Ze, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2885Ze extends Q2.a {
    public static final Parcelable.Creator<C2885Ze> CREATOR = new V8(14);

    /* renamed from: n, reason: collision with root package name */
    public final q2.c1 f28911n;

    /* renamed from: u, reason: collision with root package name */
    public final String f28912u;

    public C2885Ze(String str, q2.c1 c1Var) {
        this.f28911n = c1Var;
        this.f28912u = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.y(parcel, 2, this.f28911n, i);
        A8.b.z(parcel, 3, this.f28912u);
        A8.b.I(parcel, G7);
    }
}
