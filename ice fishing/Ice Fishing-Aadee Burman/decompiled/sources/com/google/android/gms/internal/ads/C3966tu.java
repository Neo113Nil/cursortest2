package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.tu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3966tu extends Q2.a {
    public static final Parcelable.Creator<C3966tu> CREATOR = new V8(19);

    /* renamed from: A, reason: collision with root package name */
    public final int f34415A;

    /* renamed from: B, reason: collision with root package name */
    public final int f34416B;

    /* renamed from: C, reason: collision with root package name */
    public final int f34417C;

    /* renamed from: n, reason: collision with root package name */
    public final Context f34418n;

    /* renamed from: u, reason: collision with root package name */
    public final int f34419u;

    /* renamed from: v, reason: collision with root package name */
    public final EnumC3912su f34420v;

    /* renamed from: w, reason: collision with root package name */
    public final int f34421w;

    /* renamed from: x, reason: collision with root package name */
    public final int f34422x;

    /* renamed from: y, reason: collision with root package name */
    public final int f34423y;

    /* renamed from: z, reason: collision with root package name */
    public final String f34424z;

    public C3966tu(int i, int i6, int i9, int i10, String str, int i11, int i12) {
        EnumC3912su[] values = EnumC3912su.values();
        this.f34418n = null;
        this.f34419u = i;
        this.f34420v = values[i];
        this.f34421w = i6;
        this.f34422x = i9;
        this.f34423y = i10;
        this.f34424z = str;
        this.f34415A = i11;
        this.f34417C = new int[]{1, 2, 3}[i11];
        this.f34416B = i12;
        int i13 = new int[]{1}[i12];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f34419u);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f34421w);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(this.f34422x);
        A8.b.F(parcel, 4, 4);
        parcel.writeInt(this.f34423y);
        A8.b.z(parcel, 5, this.f34424z);
        A8.b.F(parcel, 6, 4);
        parcel.writeInt(this.f34415A);
        A8.b.F(parcel, 7, 4);
        parcel.writeInt(this.f34416B);
        A8.b.I(parcel, G7);
    }

    public C3966tu(Context context, EnumC3912su enumC3912su, int i, int i6, int i9, String str, String str2) {
        EnumC3912su.values();
        this.f34418n = context;
        this.f34419u = enumC3912su.ordinal();
        this.f34420v = enumC3912su;
        this.f34421w = i;
        this.f34422x = i6;
        this.f34423y = i9;
        this.f34424z = str;
        int i10 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.f34417C = i10;
        this.f34415A = i10 - 1;
        this.f34416B = 0;
    }
}
