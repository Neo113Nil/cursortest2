package s2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class D0 extends S2.a {
    public static final Parcelable.Creator<D0> CREATOR = new C4936i0(1);

    /* renamed from: n, reason: collision with root package name */
    public final int f40309n;

    public D0(int i) {
        this.f40309n = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f40309n);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
