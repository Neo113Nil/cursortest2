package s2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class M0 extends S2.a {
    public static final Parcelable.Creator<M0> CREATOR = new C4936i0(3);

    /* renamed from: n, reason: collision with root package name */
    public final int f40364n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40365u;

    /* renamed from: v, reason: collision with root package name */
    public final String f40366v;

    public M0(int i, int i4, String str) {
        this.f40364n = i;
        this.f40365u = i4;
        this.f40366v = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f40364n);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f40365u);
        com.bumptech.glide.e.r(parcel, 3, this.f40366v);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
