package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import n2.C4807c;

/* renamed from: com.google.android.gms.internal.ads.gb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3261gb extends P2.a {
    public static final Parcelable.Creator<C3261gb> CREATOR = new S8(2);

    /* renamed from: A, reason: collision with root package name */
    public final int f31019A;

    /* renamed from: B, reason: collision with root package name */
    public final int f31020B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f31021C;

    /* renamed from: D, reason: collision with root package name */
    public final int f31022D;

    /* renamed from: n, reason: collision with root package name */
    public final int f31023n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f31024u;

    /* renamed from: v, reason: collision with root package name */
    public final int f31025v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f31026w;

    /* renamed from: x, reason: collision with root package name */
    public final int f31027x;

    /* renamed from: y, reason: collision with root package name */
    public final q2.a1 f31028y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f31029z;

    public C3261gb(int i, boolean z8, int i4, boolean z9, int i9, q2.a1 a1Var, boolean z10, int i10, int i11, boolean z11, int i12) {
        this.f31023n = i;
        this.f31024u = z8;
        this.f31025v = i4;
        this.f31026w = z9;
        this.f31027x = i9;
        this.f31028y = a1Var;
        this.f31029z = z10;
        this.f31019A = i10;
        this.f31021C = z11;
        this.f31020B = i11;
        this.f31022D = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f31023n);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f31024u ? 1 : 0);
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(this.f31025v);
        S0.f.A(parcel, 4, 4);
        parcel.writeInt(this.f31026w ? 1 : 0);
        S0.f.A(parcel, 5, 4);
        parcel.writeInt(this.f31027x);
        S0.f.t(parcel, 6, this.f31028y, i);
        S0.f.A(parcel, 7, 4);
        parcel.writeInt(this.f31029z ? 1 : 0);
        S0.f.A(parcel, 8, 4);
        parcel.writeInt(this.f31019A);
        S0.f.A(parcel, 9, 4);
        parcel.writeInt(this.f31020B);
        S0.f.A(parcel, 10, 4);
        parcel.writeInt(this.f31021C ? 1 : 0);
        S0.f.A(parcel, 11, 4);
        parcel.writeInt(this.f31022D);
        S0.f.C(parcel, B8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3261gb(C4807c c4807c) {
        this(4, c4807c.f39630a, c4807c.f39631b, c4807c.f39633d, c4807c.f39634e, r0 != null ? new q2.a1(r0) : null, c4807c.f39636g, c4807c.f39632c, 0, false, 0);
        k2.w wVar = c4807c.f39635f;
    }
}
