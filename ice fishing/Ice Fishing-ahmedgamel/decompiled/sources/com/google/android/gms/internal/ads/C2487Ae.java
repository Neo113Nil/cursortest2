package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ae, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2487Ae extends S2.a {
    public static final Parcelable.Creator<C2487Ae> CREATOR = new V8(9);

    /* renamed from: n, reason: collision with root package name */
    public final View f24468n;

    /* renamed from: u, reason: collision with root package name */
    public final Map f24469u;

    public C2487Ae(IBinder iBinder, IBinder iBinder2) {
        this.f24468n = (View) Y2.b.D0(Y2.b.t0(iBinder));
        this.f24469u = (Map) Y2.b.D0(Y2.b.t0(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.p(parcel, 1, new Y2.b(this.f24468n));
        com.bumptech.glide.e.p(parcel, 2, new Y2.b(this.f24469u));
        com.bumptech.glide.e.z(parcel, x9);
    }
}
