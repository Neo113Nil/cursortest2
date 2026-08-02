package K2;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.e;

/* loaded from: classes.dex */
public final class c extends S2.a {
    public static final Parcelable.Creator<c> CREATOR = new B8.d(2);

    /* renamed from: n, reason: collision with root package name */
    public final String f1682n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1683u;

    public c(String str, int i) {
        this.f1682n = str;
        this.f1683u = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = e.x(parcel, 20293);
        e.r(parcel, 1, this.f1682n);
        e.w(parcel, 2, 4);
        parcel.writeInt(this.f1683u);
        e.z(parcel, x9);
    }
}
