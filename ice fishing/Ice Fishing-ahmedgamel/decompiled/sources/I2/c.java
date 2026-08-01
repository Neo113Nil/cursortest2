package I2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c extends Q2.a {
    public static final Parcelable.Creator<c> CREATOR = new B8.d(2);

    /* renamed from: n, reason: collision with root package name */
    public final String f1289n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1290u;

    public c(String str, int i) {
        this.f1289n = str;
        this.f1290u = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 1, this.f1289n);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f1290u);
        A8.b.I(parcel, G7);
    }
}
