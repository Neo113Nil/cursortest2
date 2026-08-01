package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.uc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4002uc extends Q2.a {
    public static final Parcelable.Creator<C4002uc> CREATOR = new V8(4);

    /* renamed from: A, reason: collision with root package name */
    public final long f34547A;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f34548n;

    /* renamed from: u, reason: collision with root package name */
    public final String f34549u;

    /* renamed from: v, reason: collision with root package name */
    public final int f34550v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f34551w;

    /* renamed from: x, reason: collision with root package name */
    public final String[] f34552x;

    /* renamed from: y, reason: collision with root package name */
    public final String[] f34553y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f34554z;

    public C4002uc(boolean z3, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z6, long j6) {
        this.f34548n = z3;
        this.f34549u = str;
        this.f34550v = i;
        this.f34551w = bArr;
        this.f34552x = strArr;
        this.f34553y = strArr2;
        this.f34554z = z6;
        this.f34547A = j6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f34548n ? 1 : 0);
        A8.b.z(parcel, 2, this.f34549u);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(this.f34550v);
        A8.b.w(parcel, 4, this.f34551w);
        A8.b.A(parcel, 5, this.f34552x);
        A8.b.A(parcel, 6, this.f34553y);
        A8.b.F(parcel, 7, 4);
        parcel.writeInt(this.f34554z ? 1 : 0);
        A8.b.F(parcel, 8, 8);
        parcel.writeLong(this.f34547A);
        A8.b.I(parcel, G7);
    }
}
