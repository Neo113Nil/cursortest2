package M2;

import P2.w;
import S0.s;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends Q2.a {
    public static final Parcelable.Creator<d> CREATOR = new B8.d(6);

    /* renamed from: n, reason: collision with root package name */
    public final String f1837n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1838u;

    /* renamed from: v, reason: collision with root package name */
    public final long f1839v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1840w;

    public d(String str, boolean z3, int i, long j6) {
        this.f1837n = str;
        this.f1838u = i;
        this.f1839v = j6;
        this.f1840w = z3;
    }

    public final long a() {
        long j6 = this.f1839v;
        return j6 == -1 ? this.f1838u : j6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (w.l(this.f1837n, dVar.f1837n) && a() == dVar.a() && this.f1840w == dVar.f1840w) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1837n, Long.valueOf(a()), Boolean.valueOf(this.f1840w)});
    }

    public final String toString() {
        s sVar = new s(this);
        sVar.f(this.f1837n, "name");
        sVar.f(Long.valueOf(a()), com.anythink.expressad.foundation.g.a.i);
        sVar.f(Boolean.valueOf(this.f1840w), "is_fully_rolled_out");
        return sVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.z(parcel, 1, this.f1837n);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f1838u);
        long a9 = a();
        A8.b.F(parcel, 3, 8);
        parcel.writeLong(a9);
        A8.b.F(parcel, 4, 4);
        parcel.writeInt(this.f1840w ? 1 : 0);
        A8.b.I(parcel, G7);
    }

    public d(String str) {
        this(str, false, -1, 1L);
    }
}
