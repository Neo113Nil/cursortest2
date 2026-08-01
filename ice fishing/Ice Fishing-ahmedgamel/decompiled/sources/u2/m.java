package u2;

import android.os.Parcel;
import android.os.Parcelable;
import h3.C4566c;

/* loaded from: classes.dex */
public final class m extends Q2.a {
    public static final Parcelable.Creator<m> CREATOR = new C4566c(14);

    /* renamed from: n, reason: collision with root package name */
    public final String f41297n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41298u;

    public m(String str, int i) {
        this.f41297n = str == null ? "" : str;
        this.f41298u = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 1, this.f41297n);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f41298u);
        A8.b.I(parcel, G7);
    }
}
