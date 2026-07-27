package q2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class M0 extends Q2.a {
    public static final Parcelable.Creator<M0> CREATOR = new C4887i0(3);

    /* renamed from: n, reason: collision with root package name */
    public final int f40062n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40063u;

    /* renamed from: v, reason: collision with root package name */
    public final String f40064v;

    public M0(int i, int i6, String str) {
        this.f40062n = i;
        this.f40063u = i6;
        this.f40064v = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f40062n);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f40063u);
        A8.b.z(parcel, 3, this.f40064v);
        A8.b.I(parcel, G7);
    }
}
