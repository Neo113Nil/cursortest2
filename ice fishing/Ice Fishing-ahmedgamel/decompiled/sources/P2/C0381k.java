package P2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: P2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381k extends Q2.a {
    public static final Parcelable.Creator<C0381k> CREATOR = new B8.d(11);

    /* renamed from: A, reason: collision with root package name */
    public final int f2504A;

    /* renamed from: B, reason: collision with root package name */
    public final int f2505B;

    /* renamed from: n, reason: collision with root package name */
    public final int f2506n;

    /* renamed from: u, reason: collision with root package name */
    public final int f2507u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2508v;

    /* renamed from: w, reason: collision with root package name */
    public final long f2509w;

    /* renamed from: x, reason: collision with root package name */
    public final long f2510x;

    /* renamed from: y, reason: collision with root package name */
    public final String f2511y;

    /* renamed from: z, reason: collision with root package name */
    public final String f2512z;

    public C0381k(int i, int i6, int i9, long j6, long j9, String str, String str2, int i10, int i11) {
        this.f2506n = i;
        this.f2507u = i6;
        this.f2508v = i9;
        this.f2509w = j6;
        this.f2510x = j9;
        this.f2511y = str;
        this.f2512z = str2;
        this.f2504A = i10;
        this.f2505B = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f2506n);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f2507u);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(this.f2508v);
        A8.b.F(parcel, 4, 8);
        parcel.writeLong(this.f2509w);
        A8.b.F(parcel, 5, 8);
        parcel.writeLong(this.f2510x);
        A8.b.z(parcel, 6, this.f2511y);
        A8.b.z(parcel, 7, this.f2512z);
        A8.b.F(parcel, 8, 4);
        parcel.writeInt(this.f2504A);
        A8.b.F(parcel, 9, 4);
        parcel.writeInt(this.f2505B);
        A8.b.I(parcel, G7);
    }
}
