package q2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class W0 extends Q2.a {
    public static final Parcelable.Creator<W0> CREATOR = new C4887i0(5);

    /* renamed from: n, reason: collision with root package name */
    public final int f40082n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40083u;

    public W0(int i, int i6) {
        this.f40082n = i;
        this.f40083u = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f40082n);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f40083u);
        A8.b.I(parcel, G7);
    }

    public W0(k2.r rVar) {
        this.f40082n = rVar.f38607a;
        this.f40083u = -1;
    }
}
