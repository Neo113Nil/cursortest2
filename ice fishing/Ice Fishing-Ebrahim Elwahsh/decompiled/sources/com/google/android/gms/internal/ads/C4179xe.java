package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4179xe extends P2.a {
    public static final Parcelable.Creator<C4179xe> CREATOR = new S8(9);

    /* renamed from: n, reason: collision with root package name */
    public final View f35192n;

    /* renamed from: u, reason: collision with root package name */
    public final Map f35193u;

    public C4179xe(IBinder iBinder, IBinder iBinder2) {
        this.f35192n = (View) V2.b.A0(V2.b.u0(iBinder));
        this.f35193u = (Map) V2.b.A0(V2.b.u0(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.s(parcel, 1, new V2.b(this.f35192n));
        S0.f.s(parcel, 2, new V2.b(this.f35193u));
        S0.f.C(parcel, B8);
    }
}
