package q2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g1 extends Q2.a {
    public static final Parcelable.Creator<g1> CREATOR = new C4887i0(10);

    /* renamed from: n, reason: collision with root package name */
    public final int f40154n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40155u;

    /* renamed from: v, reason: collision with root package name */
    public final String f40156v;

    /* renamed from: w, reason: collision with root package name */
    public final long f40157w;

    public g1(int i, int i6, String str, long j6) {
        this.f40154n = i;
        this.f40155u = i6;
        this.f40156v = str;
        this.f40157w = j6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f40154n);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f40155u);
        A8.b.z(parcel, 3, this.f40156v);
        A8.b.F(parcel, 4, 8);
        parcel.writeLong(this.f40157w);
        A8.b.I(parcel, G7);
    }
}
