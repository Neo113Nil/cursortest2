package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Tw extends P2.a {
    public static final Parcelable.Creator<Tw> CREATOR = new S8(22);

    /* renamed from: n, reason: collision with root package name */
    public final int f27878n;

    /* renamed from: u, reason: collision with root package name */
    public D6 f27879u = null;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f27880v;

    public Tw(int i, byte[] bArr) {
        this.f27878n = i;
        this.f27880v = bArr;
        a();
    }

    public final void a() {
        D6 d62 = this.f27879u;
        if (d62 != null || this.f27880v == null) {
            if (d62 == null || this.f27880v != null) {
                if (d62 != null && this.f27880v != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (d62 != null || this.f27880v != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f27878n);
        byte[] bArr = this.f27880v;
        if (bArr == null) {
            bArr = this.f27879u.b();
        }
        S0.f.r(parcel, 2, bArr);
        S0.f.C(parcel, B8);
    }
}
