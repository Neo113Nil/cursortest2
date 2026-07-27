package L2;

import O2.w;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends P2.a {
    public static final Parcelable.Creator<d> CREATOR = new F0.a(4);

    /* renamed from: n, reason: collision with root package name */
    public final String f1719n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1720u;

    /* renamed from: v, reason: collision with root package name */
    public final long f1721v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1722w;

    public d(String str, boolean z8, int i, long j9) {
        this.f1719n = str;
        this.f1720u = i;
        this.f1721v = j9;
        this.f1722w = z8;
    }

    public final long a() {
        long j9 = this.f1721v;
        return j9 == -1 ? this.f1720u : j9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (w.l(this.f1719n, dVar.f1719n) && a() == dVar.a() && this.f1722w == dVar.f1722w) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1719n, Long.valueOf(a()), Boolean.valueOf(this.f1722w)});
    }

    public final String toString() {
        S0.l lVar = new S0.l(this);
        lVar.j(this.f1719n, "name");
        lVar.j(Long.valueOf(a()), com.anythink.expressad.foundation.g.a.i);
        lVar.j(Boolean.valueOf(this.f1722w), "is_fully_rolled_out");
        return lVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.u(parcel, 1, this.f1719n);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f1720u);
        long a9 = a();
        S0.f.A(parcel, 3, 8);
        parcel.writeLong(a9);
        S0.f.A(parcel, 4, 4);
        parcel.writeInt(this.f1722w ? 1 : 0);
        S0.f.C(parcel, B8);
    }

    public d(String str) {
        this(str, false, -1, 1L);
    }
}
