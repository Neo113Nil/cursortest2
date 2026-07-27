package t2;

import android.os.Parcel;
import android.os.Parcelable;
import f3.C4509h;

/* loaded from: classes.dex */
public final class n extends P2.a {
    public static final Parcelable.Creator<n> CREATOR = new C4509h(12);

    /* renamed from: n, reason: collision with root package name */
    public final String f40920n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40921u;

    public n(String str, int i) {
        this.f40920n = str == null ? "" : str;
        this.f40921u = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 1, this.f40920n);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f40921u);
        S0.f.C(parcel, B8);
    }
}
