package q2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class D0 extends Q2.a {
    public static final Parcelable.Creator<D0> CREATOR = new C4887i0(1);

    /* renamed from: n, reason: collision with root package name */
    public final int f40010n;

    public D0(int i) {
        this.f40010n = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f40010n);
        A8.b.I(parcel, G7);
    }
}
