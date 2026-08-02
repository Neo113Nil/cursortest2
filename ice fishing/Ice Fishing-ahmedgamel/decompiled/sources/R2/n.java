package R2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends S2.a {
    public static final Parcelable.Creator<n> CREATOR = new B8.d(10);

    /* renamed from: n, reason: collision with root package name */
    public final int f2842n;

    /* renamed from: u, reason: collision with root package name */
    public List f2843u;

    public n(int i, List list) {
        this.f2842n = i;
        this.f2843u = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f2842n);
        com.bumptech.glide.e.v(parcel, 2, this.f2843u);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
