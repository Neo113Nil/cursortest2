package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.wf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4126wf extends P2.a {
    public static final Parcelable.Creator<C4126wf> CREATOR = new S8(17);

    /* renamed from: A, reason: collision with root package name */
    public final List f35007A;

    /* renamed from: n, reason: collision with root package name */
    public final String f35008n;

    /* renamed from: u, reason: collision with root package name */
    public final String f35009u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f35010v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f35011w;

    /* renamed from: x, reason: collision with root package name */
    public final List f35012x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f35013y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f35014z;

    public C4126wf(String str, String str2, boolean z8, boolean z9, List list, boolean z10, boolean z11, List list2) {
        this.f35008n = str;
        this.f35009u = str2;
        this.f35010v = z8;
        this.f35011w = z9;
        this.f35012x = list;
        this.f35013y = z10;
        this.f35014z = z11;
        this.f35007A = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 2, this.f35008n);
        S0.f.u(parcel, 3, this.f35009u);
        S0.f.A(parcel, 4, 4);
        parcel.writeInt(this.f35010v ? 1 : 0);
        S0.f.A(parcel, 5, 4);
        parcel.writeInt(this.f35011w ? 1 : 0);
        S0.f.w(parcel, 6, this.f35012x);
        S0.f.A(parcel, 7, 4);
        parcel.writeInt(this.f35013y ? 1 : 0);
        S0.f.A(parcel, 8, 4);
        parcel.writeInt(this.f35014z ? 1 : 0);
        S0.f.w(parcel, 9, this.f35007A);
        S0.f.C(parcel, B8);
    }
}
