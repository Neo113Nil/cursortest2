package R2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m extends S2.a {
    public static final Parcelable.Creator<m> CREATOR = new B8.d(14);

    /* renamed from: n, reason: collision with root package name */
    public final int f2837n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2838u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2839v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2840w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2841x;

    public m(int i, boolean z6, boolean z9, int i4, int i6) {
        this.f2837n = i;
        this.f2838u = z6;
        this.f2839v = z9;
        this.f2840w = i4;
        this.f2841x = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f2837n);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f2838u ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(this.f2839v ? 1 : 0);
        com.bumptech.glide.e.w(parcel, 4, 4);
        parcel.writeInt(this.f2840w);
        com.bumptech.glide.e.w(parcel, 5, 4);
        parcel.writeInt(this.f2841x);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
