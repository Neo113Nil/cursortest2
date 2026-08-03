package p6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a0 extends q6.a {
    public static final Parcelable.Creator<a0> CREATOR = new e7.c(17);

    /* renamed from: g, reason: collision with root package name */
    public Bundle f5539g;

    /* renamed from: h, reason: collision with root package name */
    public m6.d[] f5540h;

    /* renamed from: i, reason: collision with root package name */
    public int f5541i;

    /* renamed from: j, reason: collision with root package name */
    public e f5542j;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int g02 = x4.f.g0(parcel, 20293);
        x4.f.a0(parcel, 1, this.f5539g);
        x4.f.d0(parcel, 2, this.f5540h, i10);
        int i11 = this.f5541i;
        x4.f.i0(parcel, 3, 4);
        parcel.writeInt(i11);
        x4.f.b0(parcel, 4, this.f5542j, i10);
        x4.f.h0(parcel, g02);
    }
}
