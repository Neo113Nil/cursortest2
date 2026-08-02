package w2;

import android.os.Parcel;
import android.os.Parcelable;
import j3.C4614c;

/* loaded from: classes.dex */
public final class m extends S2.a {
    public static final Parcelable.Creator<m> CREATOR = new C4614c(14);

    /* renamed from: n, reason: collision with root package name */
    public final String f41687n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41688u;

    public m(String str, int i) {
        this.f41687n = str == null ? "" : str;
        this.f41688u = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 1, this.f41687n);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f41688u);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
