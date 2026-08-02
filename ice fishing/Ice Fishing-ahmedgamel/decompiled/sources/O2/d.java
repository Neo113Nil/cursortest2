package O2;

import R2.w;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.C3067cm;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends S2.a {
    public static final Parcelable.Creator<d> CREATOR = new B8.d(6);

    /* renamed from: n, reason: collision with root package name */
    public final String f2263n;

    /* renamed from: u, reason: collision with root package name */
    public final int f2264u;

    /* renamed from: v, reason: collision with root package name */
    public final long f2265v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2266w;

    public d(String str, boolean z6, int i, long j6) {
        this.f2263n = str;
        this.f2264u = i;
        this.f2265v = j6;
        this.f2266w = z6;
    }

    public final long a() {
        long j6 = this.f2265v;
        return j6 == -1 ? this.f2264u : j6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (w.l(this.f2263n, dVar.f2263n) && a() == dVar.a() && this.f2266w == dVar.f2266w) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2263n, Long.valueOf(a()), Boolean.valueOf(this.f2266w)});
    }

    public final String toString() {
        C3067cm c3067cm = new C3067cm(this);
        c3067cm.B(this.f2263n, "name");
        c3067cm.B(Long.valueOf(a()), com.anythink.expressad.foundation.g.a.i);
        c3067cm.B(Boolean.valueOf(this.f2266w), "is_fully_rolled_out");
        return c3067cm.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.r(parcel, 1, this.f2263n);
        com.bumptech.glide.e.w(parcel, 2, 4);
        parcel.writeInt(this.f2264u);
        long a9 = a();
        com.bumptech.glide.e.w(parcel, 3, 8);
        parcel.writeLong(a9);
        com.bumptech.glide.e.w(parcel, 4, 4);
        parcel.writeInt(this.f2266w ? 1 : 0);
        com.bumptech.glide.e.z(parcel, x9);
    }

    public d(String str) {
        this(str, false, -1, 1L);
    }
}
