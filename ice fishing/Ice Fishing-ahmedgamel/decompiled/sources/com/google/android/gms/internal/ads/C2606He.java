package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.He, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2606He extends S2.a {
    public static final Parcelable.Creator<C2606He> CREATOR = new V8(11);

    /* renamed from: n, reason: collision with root package name */
    public final boolean f26086n;

    /* renamed from: u, reason: collision with root package name */
    public final List f26087u;

    public C2606He(boolean z6, List list) {
        this.f26086n = z6;
        this.f26087u = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f26086n ? 1 : 0);
        com.bumptech.glide.e.t(parcel, 3, this.f26087u);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
