package q2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class O extends P2.a {
    public static final Parcelable.Creator<O> CREATOR = new C4894i0(0);

    /* renamed from: n, reason: collision with root package name */
    public final String f39977n;

    /* renamed from: u, reason: collision with root package name */
    public final String f39978u;

    public O(String str, String str2) {
        this.f39977n = str;
        this.f39978u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 1, this.f39977n);
        S0.f.u(parcel, 2, this.f39978u);
        S0.f.C(parcel, B8);
    }
}
