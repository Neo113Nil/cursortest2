package R2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: R2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0385k extends S2.a {
    public static final Parcelable.Creator<C0385k> CREATOR = new B8.d(11);

    /* renamed from: A, reason: collision with root package name */
    public final int f2825A;

    /* renamed from: B, reason: collision with root package name */
    public final int f2826B;

    /* renamed from: n, reason: collision with root package name */
    public final int f2827n;

    /* renamed from: u, reason: collision with root package name */
    public final int f2828u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2829v;

    /* renamed from: w, reason: collision with root package name */
    public final long f2830w;

    /* renamed from: x, reason: collision with root package name */
    public final long f2831x;

    /* renamed from: y, reason: collision with root package name */
    public final String f2832y;

    /* renamed from: z, reason: collision with root package name */
    public final String f2833z;

    public C0385k(int i, int i4, int i6, long j6, long j9, String str, String str2, int i9, int i10) {
        this.f2827n = i;
        this.f2828u = i4;
        this.f2829v = i6;
        this.f2830w = j6;
        this.f2831x = j9;
        this.f2832y = str;
        this.f2833z = str2;
        this.f2825A = i9;
        this.f2826B = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f2827n);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f2828u);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(this.f2829v);
        com.bumptech.glide.e.w(parcel, 4, 8);
        parcel.writeLong(this.f2830w);
        com.bumptech.glide.e.w(parcel, 5, 8);
        parcel.writeLong(this.f2831x);
        com.bumptech.glide.e.r(parcel, 6, this.f2832y);
        com.bumptech.glide.e.r(parcel, 7, this.f2833z);
        com.bumptech.glide.e.w(parcel, 8, 4);
        parcel.writeInt(this.f2825A);
        com.bumptech.glide.e.w(parcel, 9, 4);
        parcel.writeInt(this.f2826B);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
