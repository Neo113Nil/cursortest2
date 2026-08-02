package R2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: R2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381g extends S2.a {
    public static final Parcelable.Creator<C0381g> CREATOR = new B8.d(16);

    /* renamed from: n, reason: collision with root package name */
    public final m f2802n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2803u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2804v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f2805w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2806x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2807y;

    public C0381g(m mVar, boolean z6, boolean z9, int[] iArr, int i, int[] iArr2) {
        this.f2802n = mVar;
        this.f2803u = z6;
        this.f2804v = z9;
        this.f2805w = iArr;
        this.f2806x = i;
        this.f2807y = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.q(parcel, 1, this.f2802n, i);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f2803u ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(this.f2804v ? 1 : 0);
        int[] iArr = this.f2805w;
        if (iArr != null) {
            int x10 = com.bumptech.glide.e.x(parcel, 4);
            parcel.writeIntArray(iArr);
            com.bumptech.glide.e.z(parcel, x10);
        }
        com.bumptech.glide.e.w(parcel, 5, 4);
        parcel.writeInt(this.f2806x);
        int[] iArr2 = this.f2807y;
        if (iArr2 != null) {
            int x11 = com.bumptech.glide.e.x(parcel, 6);
            parcel.writeIntArray(iArr2);
            com.bumptech.glide.e.z(parcel, x11);
        }
        com.bumptech.glide.e.z(parcel, x9);
    }
}
