package q2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Z0 extends Q2.a {
    public static final Parcelable.Creator<Z0> CREATOR = new C4887i0(7);

    /* renamed from: n, reason: collision with root package name */
    public final boolean f40083n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f40084u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f40085v;

    public Z0(k2.w wVar) {
        this(wVar.f38619a, wVar.f38620b, wVar.f38621c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f40083n ? 1 : 0);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(this.f40084u ? 1 : 0);
        A8.b.F(parcel, 4, 4);
        parcel.writeInt(this.f40085v ? 1 : 0);
        A8.b.I(parcel, G7);
    }

    public Z0(boolean z3, boolean z6, boolean z9) {
        this.f40083n = z3;
        this.f40084u = z6;
        this.f40085v = z9;
    }
}
