package P2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m extends Q2.a {
    public static final Parcelable.Creator<m> CREATOR = new B8.d(14);

    /* renamed from: n, reason: collision with root package name */
    public final int f2516n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2517u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2518v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2519w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2520x;

    public m(int i, boolean z3, boolean z6, int i6, int i9) {
        this.f2516n = i;
        this.f2517u = z3;
        this.f2518v = z6;
        this.f2519w = i6;
        this.f2520x = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f2516n);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f2517u ? 1 : 0);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(this.f2518v ? 1 : 0);
        A8.b.F(parcel, 4, 4);
        parcel.writeInt(this.f2519w);
        A8.b.F(parcel, 5, 4);
        parcel.writeInt(this.f2520x);
        A8.b.I(parcel, G7);
    }
}
