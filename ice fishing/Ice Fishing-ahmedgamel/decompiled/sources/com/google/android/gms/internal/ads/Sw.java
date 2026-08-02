package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Sw extends S2.a {
    public static final Parcelable.Creator<Sw> CREATOR = new V8(22);

    /* renamed from: n, reason: collision with root package name */
    public final int f28442n;

    /* renamed from: u, reason: collision with root package name */
    public H6 f28443u = null;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f28444v;

    public Sw(int i, byte[] bArr) {
        this.f28442n = i;
        this.f28444v = bArr;
        a();
    }

    public final void a() {
        H6 h62 = this.f28443u;
        if (h62 != null || this.f28444v == null) {
            if (h62 == null || this.f28444v != null) {
                if (h62 != null && this.f28444v != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (h62 != null || this.f28444v != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f28442n);
        byte[] bArr = this.f28444v;
        if (bArr == null) {
            bArr = this.f28443u.b();
        }
        com.bumptech.glide.e.o(parcel, 2, bArr);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
