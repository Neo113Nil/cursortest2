package R2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class E extends S2.a {
    public static final Parcelable.Creator<E> CREATOR = new B8.d(15);

    /* renamed from: n, reason: collision with root package name */
    public Bundle f2747n;

    /* renamed from: u, reason: collision with root package name */
    public O2.d[] f2748u;

    /* renamed from: v, reason: collision with root package name */
    public int f2749v;

    /* renamed from: w, reason: collision with root package name */
    public C0381g f2750w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.n(parcel, 1, this.f2747n);
        com.bumptech.glide.e.u(parcel, 2, this.f2748u, i);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(this.f2749v);
        com.bumptech.glide.e.q(parcel, 4, this.f2750w, i);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
