package q2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j1 extends P2.a {
    public static final Parcelable.Creator<j1> CREATOR = new C4894i0(12);

    /* renamed from: n, reason: collision with root package name */
    public final int f40090n;

    public j1(int i) {
        this.f40090n = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f40090n);
        S0.f.C(parcel, B8);
    }
}
