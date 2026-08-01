package q2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class X0 extends Q2.a {
    public static final Parcelable.Creator<X0> CREATOR = new C4887i0(6);

    /* renamed from: n, reason: collision with root package name */
    public final String f40084n;

    public X0(String str) {
        this.f40084n = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 15, this.f40084n);
        A8.b.I(parcel, G7);
    }
}
