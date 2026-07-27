package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ae, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2467Ae extends Q2.a {
    public static final Parcelable.Creator<C2467Ae> CREATOR = new V8(9);

    /* renamed from: n, reason: collision with root package name */
    public final View f23686n;

    /* renamed from: u, reason: collision with root package name */
    public final Map f23687u;

    public C2467Ae(IBinder iBinder, IBinder iBinder2) {
        this.f23686n = (View) W2.b.F0(W2.b.w0(iBinder));
        this.f23687u = (Map) W2.b.F0(W2.b.w0(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.x(parcel, 1, new W2.b(this.f23686n));
        A8.b.x(parcel, 2, new W2.b(this.f23687u));
        A8.b.I(parcel, G7);
    }
}
