package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Sw extends Q2.a {
    public static final Parcelable.Creator<Sw> CREATOR = new V8(22);

    /* renamed from: n, reason: collision with root package name */
    public final int f27659n;

    /* renamed from: u, reason: collision with root package name */
    public H6 f27660u = null;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f27661v;

    public Sw(int i, byte[] bArr) {
        this.f27659n = i;
        this.f27661v = bArr;
        a();
    }

    public final void a() {
        H6 h62 = this.f27660u;
        if (h62 != null || this.f27661v == null) {
            if (h62 == null || this.f27661v != null) {
                if (h62 != null && this.f27661v != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (h62 != null || this.f27661v != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f27659n);
        byte[] bArr = this.f27661v;
        if (bArr == null) {
            bArr = this.f27660u.b();
        }
        A8.b.w(parcel, 2, bArr);
        A8.b.I(parcel, G7);
    }
}
