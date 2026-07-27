package O2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m extends P2.a {
    public static final Parcelable.Creator<m> CREATOR = new F0.a(11);

    /* renamed from: n, reason: collision with root package name */
    public final int f2444n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2445u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2446v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2447w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2448x;

    public m(int i, boolean z8, boolean z9, int i4, int i9) {
        this.f2444n = i;
        this.f2445u = z8;
        this.f2446v = z9;
        this.f2447w = i4;
        this.f2448x = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f2444n);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f2445u ? 1 : 0);
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(this.f2446v ? 1 : 0);
        S0.f.A(parcel, 4, 4);
        parcel.writeInt(this.f2447w);
        S0.f.A(parcel, 5, 4);
        parcel.writeInt(this.f2448x);
        S0.f.C(parcel, B8);
    }
}
