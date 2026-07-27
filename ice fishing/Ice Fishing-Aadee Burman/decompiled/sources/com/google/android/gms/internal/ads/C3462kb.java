package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import n2.C4752c;

/* renamed from: com.google.android.gms.internal.ads.kb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3462kb extends Q2.a {
    public static final Parcelable.Creator<C3462kb> CREATOR = new V8(2);

    /* renamed from: A, reason: collision with root package name */
    public final int f31467A;

    /* renamed from: B, reason: collision with root package name */
    public final int f31468B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f31469C;

    /* renamed from: D, reason: collision with root package name */
    public final int f31470D;

    /* renamed from: n, reason: collision with root package name */
    public final int f31471n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f31472u;

    /* renamed from: v, reason: collision with root package name */
    public final int f31473v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f31474w;

    /* renamed from: x, reason: collision with root package name */
    public final int f31475x;

    /* renamed from: y, reason: collision with root package name */
    public final q2.Z0 f31476y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f31477z;

    public C3462kb(int i, boolean z3, int i6, boolean z6, int i9, q2.Z0 z02, boolean z9, int i10, int i11, boolean z10, int i12) {
        this.f31471n = i;
        this.f31472u = z3;
        this.f31473v = i6;
        this.f31474w = z6;
        this.f31475x = i9;
        this.f31476y = z02;
        this.f31477z = z9;
        this.f31467A = i10;
        this.f31469C = z10;
        this.f31468B = i11;
        this.f31470D = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f31471n);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f31472u ? 1 : 0);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(this.f31473v);
        A8.b.F(parcel, 4, 4);
        parcel.writeInt(this.f31474w ? 1 : 0);
        A8.b.F(parcel, 5, 4);
        parcel.writeInt(this.f31475x);
        A8.b.y(parcel, 6, this.f31476y, i);
        A8.b.F(parcel, 7, 4);
        parcel.writeInt(this.f31477z ? 1 : 0);
        A8.b.F(parcel, 8, 4);
        parcel.writeInt(this.f31467A);
        A8.b.F(parcel, 9, 4);
        parcel.writeInt(this.f31468B);
        A8.b.F(parcel, 10, 4);
        parcel.writeInt(this.f31469C ? 1 : 0);
        A8.b.F(parcel, 11, 4);
        parcel.writeInt(this.f31470D);
        A8.b.I(parcel, G7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3462kb(C4752c c4752c) {
        this(4, c4752c.f39461a, c4752c.f39462b, c4752c.f39464d, c4752c.f39465e, r0 != null ? new q2.Z0(r0) : null, c4752c.f39467g, c4752c.f39463c, 0, false, 0);
        k2.w wVar = c4752c.f39466f;
    }
}
