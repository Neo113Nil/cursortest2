package p6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends q6.a {
    public static final Parcelable.Creator<e> CREATOR = new e7.c(18);

    /* renamed from: g, reason: collision with root package name */
    public final j f5571g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5572h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5573i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f5574j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5575k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f5576l;

    public e(j jVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f5571g = jVar;
        this.f5572h = z10;
        this.f5573i = z11;
        this.f5574j = iArr;
        this.f5575k = i10;
        this.f5576l = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int g02 = x4.f.g0(parcel, 20293);
        x4.f.b0(parcel, 1, this.f5571g, i10);
        x4.f.i0(parcel, 2, 4);
        parcel.writeInt(this.f5572h ? 1 : 0);
        x4.f.i0(parcel, 3, 4);
        parcel.writeInt(this.f5573i ? 1 : 0);
        int[] iArr = this.f5574j;
        if (iArr != null) {
            int g03 = x4.f.g0(parcel, 4);
            parcel.writeIntArray(iArr);
            x4.f.h0(parcel, g03);
        }
        x4.f.i0(parcel, 5, 4);
        parcel.writeInt(this.f5575k);
        int[] iArr2 = this.f5576l;
        if (iArr2 != null) {
            int g04 = x4.f.g0(parcel, 6);
            parcel.writeIntArray(iArr2);
            x4.f.h0(parcel, g04);
        }
        x4.f.h0(parcel, g02);
    }
}
