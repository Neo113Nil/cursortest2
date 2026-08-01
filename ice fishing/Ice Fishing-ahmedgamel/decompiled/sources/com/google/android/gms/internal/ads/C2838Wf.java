package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Wf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2838Wf extends Q2.a {
    public static final Parcelable.Creator<C2838Wf> CREATOR = new V8(18);

    /* renamed from: n, reason: collision with root package name */
    public final String f28363n;

    /* renamed from: u, reason: collision with root package name */
    public final String f28364u;

    /* renamed from: v, reason: collision with root package name */
    public final q2.f1 f28365v;

    /* renamed from: w, reason: collision with root package name */
    public final q2.c1 f28366w;

    public C2838Wf(String str, String str2, q2.f1 f1Var, q2.c1 c1Var) {
        this.f28363n = str;
        this.f28364u = str2;
        this.f28365v = f1Var;
        this.f28366w = c1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 1, this.f28363n);
        A8.b.z(parcel, 2, this.f28364u);
        A8.b.y(parcel, 3, this.f28365v, i);
        A8.b.y(parcel, 4, this.f28366w, i);
        A8.b.I(parcel, G7);
    }
}
