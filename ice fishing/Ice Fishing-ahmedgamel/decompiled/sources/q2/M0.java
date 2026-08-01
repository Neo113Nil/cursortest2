package q2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class M0 extends Q2.a {
    public static final Parcelable.Creator<M0> CREATOR = new C4887i0(3);

    /* renamed from: n, reason: collision with root package name */
    public final int f40065n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40066u;

    /* renamed from: v, reason: collision with root package name */
    public final String f40067v;

    public M0(int i, int i6, String str) {
        this.f40065n = i;
        this.f40066u = i6;
        this.f40067v = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f40065n);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f40066u);
        A8.b.z(parcel, 3, this.f40067v);
        A8.b.I(parcel, G7);
    }
}
