package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.zc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4272zc extends Q2.a {
    public static final Parcelable.Creator<C4272zc> CREATOR = new V8(5);

    /* renamed from: n, reason: collision with root package name */
    public final String f35349n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f35350u;

    /* renamed from: v, reason: collision with root package name */
    public final int f35351v;

    /* renamed from: w, reason: collision with root package name */
    public final String f35352w;

    public C4272zc(String str, int i, String str2, boolean z3) {
        this.f35349n = str;
        this.f35350u = z3;
        this.f35351v = i;
        this.f35352w = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 1, this.f35349n);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f35350u ? 1 : 0);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(this.f35351v);
        A8.b.z(parcel, 4, this.f35352w);
        A8.b.I(parcel, G7);
    }
}
