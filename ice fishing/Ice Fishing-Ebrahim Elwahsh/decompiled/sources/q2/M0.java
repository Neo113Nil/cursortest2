package q2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class M0 extends P2.a {
    public static final Parcelable.Creator<M0> CREATOR = new C4894i0(3);

    /* renamed from: n, reason: collision with root package name */
    public final int f39972n;

    /* renamed from: u, reason: collision with root package name */
    public final int f39973u;

    /* renamed from: v, reason: collision with root package name */
    public final String f39974v;

    public M0(int i, int i4, String str) {
        this.f39972n = i;
        this.f39973u = i4;
        this.f39974v = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f39972n);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f39973u);
        S0.f.u(parcel, 3, this.f39974v);
        S0.f.C(parcel, B8);
    }
}
