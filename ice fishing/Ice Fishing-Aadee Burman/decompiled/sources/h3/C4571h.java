package h3;

import P2.t;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: h3.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4571h extends Q2.a {
    public static final Parcelable.Creator<C4571h> CREATOR = new C4566c(2);

    /* renamed from: n, reason: collision with root package name */
    public final int f38015n;

    /* renamed from: u, reason: collision with root package name */
    public final M2.b f38016u;

    /* renamed from: v, reason: collision with root package name */
    public final t f38017v;

    public C4571h(int i, M2.b bVar, t tVar) {
        this.f38015n = i;
        this.f38016u = bVar;
        this.f38017v = tVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f38015n);
        A8.b.y(parcel, 2, this.f38016u, i);
        A8.b.y(parcel, 3, this.f38017v, i);
        A8.b.I(parcel, G7);
    }
}
