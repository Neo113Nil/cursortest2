package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.De, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2517De extends P2.a {
    public static final Parcelable.Creator<C2517De> CREATOR = new S8(11);

    /* renamed from: n, reason: collision with root package name */
    public final boolean f24449n;

    /* renamed from: u, reason: collision with root package name */
    public final List f24450u;

    public C2517De(boolean z8, List list) {
        this.f24449n = z8;
        this.f24450u = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f24449n ? 1 : 0);
        S0.f.w(parcel, 3, this.f24450u);
        S0.f.C(parcel, B8);
    }
}
