package p6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends q6.a {
    public static final Parcelable.Creator<h> CREATOR = new e7.c(13);

    /* renamed from: g, reason: collision with root package name */
    public final int f5594g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5595h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5596i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5597j;

    /* renamed from: k, reason: collision with root package name */
    public final long f5598k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5599l;

    /* renamed from: m, reason: collision with root package name */
    public final String f5600m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5601n;

    /* renamed from: o, reason: collision with root package name */
    public final int f5602o;

    public h(int i10, int i11, int i12, long j3, long j6, String str, String str2, int i13, int i14) {
        this.f5594g = i10;
        this.f5595h = i11;
        this.f5596i = i12;
        this.f5597j = j3;
        this.f5598k = j6;
        this.f5599l = str;
        this.f5600m = str2;
        this.f5601n = i13;
        this.f5602o = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int g02 = x4.f.g0(parcel, 20293);
        x4.f.i0(parcel, 1, 4);
        parcel.writeInt(this.f5594g);
        x4.f.i0(parcel, 2, 4);
        parcel.writeInt(this.f5595h);
        x4.f.i0(parcel, 3, 4);
        parcel.writeInt(this.f5596i);
        x4.f.i0(parcel, 4, 8);
        parcel.writeLong(this.f5597j);
        x4.f.i0(parcel, 5, 8);
        parcel.writeLong(this.f5598k);
        x4.f.c0(parcel, 6, this.f5599l);
        x4.f.c0(parcel, 7, this.f5600m);
        x4.f.i0(parcel, 8, 4);
        parcel.writeInt(this.f5601n);
        x4.f.i0(parcel, 9, 4);
        parcel.writeInt(this.f5602o);
        x4.f.h0(parcel, g02);
    }
}
