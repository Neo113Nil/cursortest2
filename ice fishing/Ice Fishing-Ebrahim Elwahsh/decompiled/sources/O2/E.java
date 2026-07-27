package O2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class E extends P2.a {
    public static final Parcelable.Creator<E> CREATOR = new F0.a(12);

    /* renamed from: n, reason: collision with root package name */
    public Bundle f2354n;

    /* renamed from: u, reason: collision with root package name */
    public L2.d[] f2355u;

    /* renamed from: v, reason: collision with root package name */
    public int f2356v;

    /* renamed from: w, reason: collision with root package name */
    public C0370g f2357w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.q(parcel, 1, this.f2354n);
        S0.f.x(parcel, 2, this.f2355u, i);
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(this.f2356v);
        S0.f.t(parcel, 4, this.f2357w, i);
        S0.f.C(parcel, B8);
    }
}
