package P2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class E extends Q2.a {
    public static final Parcelable.Creator<E> CREATOR = new B8.d(15);

    /* renamed from: n, reason: collision with root package name */
    public Bundle f2426n;

    /* renamed from: u, reason: collision with root package name */
    public M2.d[] f2427u;

    /* renamed from: v, reason: collision with root package name */
    public int f2428v;

    /* renamed from: w, reason: collision with root package name */
    public C0377g f2429w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.v(parcel, 1, this.f2426n);
        A8.b.C(parcel, 2, this.f2427u, i);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(this.f2428v);
        A8.b.y(parcel, 4, this.f2429w, i);
        A8.b.I(parcel, G7);
    }
}
