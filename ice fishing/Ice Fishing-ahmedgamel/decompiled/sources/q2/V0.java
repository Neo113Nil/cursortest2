package q2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class V0 extends Q2.a {
    public static final Parcelable.Creator<V0> CREATOR = new C4887i0(4);

    /* renamed from: n, reason: collision with root package name */
    public final String f40077n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40078u;

    /* renamed from: v, reason: collision with root package name */
    public final c1 f40079v;

    /* renamed from: w, reason: collision with root package name */
    public final int f40080w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f40081x;

    public V0(String str, int i, c1 c1Var, int i6, boolean z3) {
        this.f40077n = str;
        this.f40078u = i;
        this.f40079v = c1Var;
        this.f40080w = i6;
        this.f40081x = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V0)) {
            return false;
        }
        V0 v02 = (V0) obj;
        return this.f40077n.equals(v02.f40077n) && this.f40078u == v02.f40078u && this.f40079v.a(v02.f40079v);
    }

    public final int hashCode() {
        return Objects.hash(this.f40077n, Integer.valueOf(this.f40078u), this.f40079v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 1, this.f40077n);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f40078u);
        A8.b.y(parcel, 3, this.f40079v, i);
        A8.b.F(parcel, 4, 4);
        parcel.writeInt(this.f40080w);
        A8.b.F(parcel, 5, 4);
        parcel.writeInt(this.f40081x ? 1 : 0);
        A8.b.I(parcel, G7);
    }
}
