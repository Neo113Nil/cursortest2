package q2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class W0 extends P2.a {
    public static final Parcelable.Creator<W0> CREATOR = new C4894i0(4);

    /* renamed from: n, reason: collision with root package name */
    public final String f39986n;

    /* renamed from: u, reason: collision with root package name */
    public final int f39987u;

    /* renamed from: v, reason: collision with root package name */
    public final d1 f39988v;

    /* renamed from: w, reason: collision with root package name */
    public final int f39989w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f39990x;

    public W0(String str, int i, d1 d1Var, int i4, boolean z8) {
        this.f39986n = str;
        this.f39987u = i;
        this.f39988v = d1Var;
        this.f39989w = i4;
        this.f39990x = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W0)) {
            return false;
        }
        W0 w02 = (W0) obj;
        return this.f39986n.equals(w02.f39986n) && this.f39987u == w02.f39987u && this.f39988v.a(w02.f39988v);
    }

    public final int hashCode() {
        return Objects.hash(this.f39986n, Integer.valueOf(this.f39987u), this.f39988v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 1, this.f39986n);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f39987u);
        S0.f.t(parcel, 3, this.f39988v, i);
        S0.f.A(parcel, 4, 4);
        parcel.writeInt(this.f39989w);
        S0.f.A(parcel, 5, 4);
        parcel.writeInt(this.f39990x ? 1 : 0);
        S0.f.C(parcel, B8);
    }
}
