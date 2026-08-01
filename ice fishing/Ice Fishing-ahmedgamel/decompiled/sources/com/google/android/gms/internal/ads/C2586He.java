package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.He, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2586He extends Q2.a {
    public static final Parcelable.Creator<C2586He> CREATOR = new V8(11);

    /* renamed from: n, reason: collision with root package name */
    public final boolean f25333n;

    /* renamed from: u, reason: collision with root package name */
    public final List f25334u;

    public C2586He(boolean z3, List list) {
        this.f25333n = z3;
        this.f25334u = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f25333n ? 1 : 0);
        A8.b.B(parcel, 3, this.f25334u);
        A8.b.I(parcel, G7);
    }
}
