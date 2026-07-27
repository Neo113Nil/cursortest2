package p2;

import android.os.Parcel;
import android.os.Parcelable;
import h3.C4566c;

/* renamed from: p2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4831f extends Q2.a {
    public static final Parcelable.Creator<C4831f> CREATOR = new C4566c(6);

    /* renamed from: A, reason: collision with root package name */
    public final boolean f39713A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f39714B;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39715n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f39716u;

    /* renamed from: v, reason: collision with root package name */
    public final String f39717v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f39718w;

    /* renamed from: x, reason: collision with root package name */
    public final float f39719x;

    /* renamed from: y, reason: collision with root package name */
    public final int f39720y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f39721z;

    public C4831f(boolean z3, boolean z6, String str, boolean z9, float f3, int i, boolean z10, boolean z11, boolean z12) {
        this.f39715n = z3;
        this.f39716u = z6;
        this.f39717v = str;
        this.f39718w = z9;
        this.f39719x = f3;
        this.f39720y = i;
        this.f39721z = z10;
        this.f39713A = z11;
        this.f39714B = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f39715n ? 1 : 0);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(this.f39716u ? 1 : 0);
        A8.b.z(parcel, 4, this.f39717v);
        A8.b.F(parcel, 5, 4);
        parcel.writeInt(this.f39718w ? 1 : 0);
        A8.b.F(parcel, 6, 4);
        parcel.writeFloat(this.f39719x);
        A8.b.F(parcel, 7, 4);
        parcel.writeInt(this.f39720y);
        A8.b.F(parcel, 8, 4);
        parcel.writeInt(this.f39721z ? 1 : 0);
        A8.b.F(parcel, 9, 4);
        parcel.writeInt(this.f39713A ? 1 : 0);
        A8.b.F(parcel, 10, 4);
        parcel.writeInt(this.f39714B ? 1 : 0);
        A8.b.I(parcel, G7);
    }

    public C4831f(boolean z3, boolean z6, boolean z9, float f3, boolean z10, boolean z11, boolean z12) {
        this(z3, z6, null, z9, f3, -1, z10, z11, z12);
    }
}
