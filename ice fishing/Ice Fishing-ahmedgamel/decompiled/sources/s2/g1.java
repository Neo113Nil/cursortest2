package s2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g1 extends S2.a {
    public static final Parcelable.Creator<g1> CREATOR = new C4936i0(10);

    /* renamed from: n, reason: collision with root package name */
    public final int f40453n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40454u;

    /* renamed from: v, reason: collision with root package name */
    public final String f40455v;

    /* renamed from: w, reason: collision with root package name */
    public final long f40456w;

    public g1(int i, int i4, String str, long j6) {
        this.f40453n = i;
        this.f40454u = i4;
        this.f40455v = str;
        this.f40456w = j6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f40453n);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f40454u);
        com.bumptech.glide.e.r(parcel, 3, this.f40455v);
        com.bumptech.glide.e.w(parcel, 4, 8);
        parcel.writeLong(this.f40456w);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
