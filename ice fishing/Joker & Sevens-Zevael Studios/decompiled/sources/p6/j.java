package p6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends q6.a {
    public static final Parcelable.Creator<j> CREATOR = new e7.c(16);

    /* renamed from: g, reason: collision with root package name */
    public final int f5604g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5605h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5606i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5607j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5608k;

    public j(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f5604g = i10;
        this.f5605h = z10;
        this.f5606i = z11;
        this.f5607j = i11;
        this.f5608k = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int g02 = x4.f.g0(parcel, 20293);
        x4.f.i0(parcel, 1, 4);
        parcel.writeInt(this.f5604g);
        x4.f.i0(parcel, 2, 4);
        parcel.writeInt(this.f5605h ? 1 : 0);
        x4.f.i0(parcel, 3, 4);
        parcel.writeInt(this.f5606i ? 1 : 0);
        x4.f.i0(parcel, 4, 4);
        parcel.writeInt(this.f5607j);
        x4.f.i0(parcel, 5, 4);
        parcel.writeInt(this.f5608k);
        x4.f.h0(parcel, g02);
    }
}
