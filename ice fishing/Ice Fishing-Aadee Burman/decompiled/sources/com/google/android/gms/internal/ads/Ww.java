package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Ww extends Q2.a {
    public static final Parcelable.Creator<Ww> CREATOR = new V8(24);

    /* renamed from: n, reason: collision with root package name */
    public final int f28445n;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f28446u;

    /* renamed from: v, reason: collision with root package name */
    public final int f28447v;

    public Ww(byte[] bArr, int i, int i6) {
        this.f28445n = i;
        this.f28446u = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f28447v = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f28445n);
        A8.b.w(parcel, 2, this.f28446u);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(this.f28447v);
        A8.b.I(parcel, G7);
    }

    public Ww() {
        this(null, 1, 1);
    }
}
