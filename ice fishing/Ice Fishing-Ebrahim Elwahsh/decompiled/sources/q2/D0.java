package q2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class D0 extends P2.a {
    public static final Parcelable.Creator<D0> CREATOR = new C4894i0(1);

    /* renamed from: n, reason: collision with root package name */
    public final int f39917n;

    public D0(int i) {
        this.f39917n = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f39917n);
        S0.f.C(parcel, B8);
    }
}
