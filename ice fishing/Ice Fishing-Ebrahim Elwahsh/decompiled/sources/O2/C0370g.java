package O2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: O2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370g extends P2.a {
    public static final Parcelable.Creator<C0370g> CREATOR = new F0.a(13);

    /* renamed from: n, reason: collision with root package name */
    public final m f2409n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2410u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2411v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f2412w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2413x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2414y;

    public C0370g(m mVar, boolean z8, boolean z9, int[] iArr, int i, int[] iArr2) {
        this.f2409n = mVar;
        this.f2410u = z8;
        this.f2411v = z9;
        this.f2412w = iArr;
        this.f2413x = i;
        this.f2414y = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.t(parcel, 1, this.f2409n, i);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f2410u ? 1 : 0);
        S0.f.A(parcel, 3, 4);
        parcel.writeInt(this.f2411v ? 1 : 0);
        int[] iArr = this.f2412w;
        if (iArr != null) {
            int B9 = S0.f.B(parcel, 4);
            parcel.writeIntArray(iArr);
            S0.f.C(parcel, B9);
        }
        S0.f.A(parcel, 5, 4);
        parcel.writeInt(this.f2413x);
        int[] iArr2 = this.f2414y;
        if (iArr2 != null) {
            int B10 = S0.f.B(parcel, 6);
            parcel.writeIntArray(iArr2);
            S0.f.C(parcel, B10);
        }
        S0.f.C(parcel, B8);
    }
}
