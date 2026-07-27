package P2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: P2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377g extends Q2.a {
    public static final Parcelable.Creator<C0377g> CREATOR = new B8.d(16);

    /* renamed from: n, reason: collision with root package name */
    public final m f2481n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2482u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2483v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f2484w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2485x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2486y;

    public C0377g(m mVar, boolean z3, boolean z6, int[] iArr, int i, int[] iArr2) {
        this.f2481n = mVar;
        this.f2482u = z3;
        this.f2483v = z6;
        this.f2484w = iArr;
        this.f2485x = i;
        this.f2486y = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.y(parcel, 1, this.f2481n, i);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f2482u ? 1 : 0);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(this.f2483v ? 1 : 0);
        int[] iArr = this.f2484w;
        if (iArr != null) {
            int G8 = A8.b.G(parcel, 4);
            parcel.writeIntArray(iArr);
            A8.b.I(parcel, G8);
        }
        A8.b.F(parcel, 5, 4);
        parcel.writeInt(this.f2485x);
        int[] iArr2 = this.f2486y;
        if (iArr2 != null) {
            int G9 = A8.b.G(parcel, 6);
            parcel.writeIntArray(iArr2);
            A8.b.I(parcel, G9);
        }
        A8.b.I(parcel, G7);
    }
}
