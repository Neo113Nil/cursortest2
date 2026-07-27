package q2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i1 extends Q2.a {
    public static final Parcelable.Creator<i1> CREATOR = new C4887i0(12);

    /* renamed from: n, reason: collision with root package name */
    public final int f40174n;

    public i1(int i) {
        this.f40174n = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f40174n);
        A8.b.I(parcel, G7);
    }
}
