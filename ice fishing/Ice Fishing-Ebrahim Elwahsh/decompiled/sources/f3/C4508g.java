package f3;

import O2.t;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f3.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4508g extends P2.a {
    public static final Parcelable.Creator<C4508g> CREATOR = new C4509h(0);

    /* renamed from: n, reason: collision with root package name */
    public final int f37706n;

    /* renamed from: u, reason: collision with root package name */
    public final L2.b f37707u;

    /* renamed from: v, reason: collision with root package name */
    public final t f37708v;

    public C4508g(int i, L2.b bVar, t tVar) {
        this.f37706n = i;
        this.f37707u = bVar;
        this.f37708v = tVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f37706n);
        S0.f.t(parcel, 2, this.f37707u, i);
        S0.f.t(parcel, 3, this.f37708v, i);
        S0.f.C(parcel, B8);
    }
}
