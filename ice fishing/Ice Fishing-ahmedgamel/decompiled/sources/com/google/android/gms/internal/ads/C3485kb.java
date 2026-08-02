package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p2.C4832c;

/* renamed from: com.google.android.gms.internal.ads.kb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3485kb extends S2.a {
    public static final Parcelable.Creator<C3485kb> CREATOR = new V8(2);

    /* renamed from: A, reason: collision with root package name */
    public final int f32244A;

    /* renamed from: B, reason: collision with root package name */
    public final int f32245B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f32246C;

    /* renamed from: D, reason: collision with root package name */
    public final int f32247D;

    /* renamed from: n, reason: collision with root package name */
    public final int f32248n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f32249u;

    /* renamed from: v, reason: collision with root package name */
    public final int f32250v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f32251w;

    /* renamed from: x, reason: collision with root package name */
    public final int f32252x;

    /* renamed from: y, reason: collision with root package name */
    public final s2.Z0 f32253y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f32254z;

    public C3485kb(int i, boolean z6, int i4, boolean z9, int i6, s2.Z0 z02, boolean z10, int i9, int i10, boolean z11, int i11) {
        this.f32248n = i;
        this.f32249u = z6;
        this.f32250v = i4;
        this.f32251w = z9;
        this.f32252x = i6;
        this.f32253y = z02;
        this.f32254z = z10;
        this.f32244A = i9;
        this.f32246C = z11;
        this.f32245B = i10;
        this.f32247D = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f32248n);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f32249u ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(this.f32250v);
        com.bumptech.glide.e.w(parcel, 4, 4);
        parcel.writeInt(this.f32251w ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 5, 4);
        parcel.writeInt(this.f32252x);
        com.bumptech.glide.e.q(parcel, 6, this.f32253y, i);
        com.bumptech.glide.e.w(parcel, 7, 4);
        parcel.writeInt(this.f32254z ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 8, 4);
        parcel.writeInt(this.f32244A);
        com.bumptech.glide.e.w(parcel, 9, 4);
        parcel.writeInt(this.f32245B);
        com.bumptech.glide.e.w(parcel, 10, 4);
        parcel.writeInt(this.f32246C ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 11, 4);
        parcel.writeInt(this.f32247D);
        com.bumptech.glide.e.z(parcel, x9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3485kb(C4832c c4832c) {
        this(4, c4832c.f39801a, c4832c.f39802b, c4832c.f39804d, c4832c.f39805e, r0 != null ? new s2.Z0(r0) : null, c4832c.f39807g, c4832c.f39803c, 0, false, 0);
        m2.w wVar = c4832c.f39806f;
    }
}
