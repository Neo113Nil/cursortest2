package P2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends Q2.a {
    public static final Parcelable.Creator<n> CREATOR = new B8.d(10);

    /* renamed from: n, reason: collision with root package name */
    public final int f2521n;

    /* renamed from: u, reason: collision with root package name */
    public List f2522u;

    public n(int i, List list) {
        this.f2521n = i;
        this.f2522u = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f2521n);
        A8.b.D(parcel, 2, this.f2522u);
        A8.b.I(parcel, G7);
    }
}
