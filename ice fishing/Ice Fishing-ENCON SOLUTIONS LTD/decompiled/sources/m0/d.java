package m0;

import a.AbstractC0083a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import q0.AbstractC1035a;

/* loaded from: classes.dex */
public final class d extends AbstractC1035a {
    public static final Parcelable.Creator<d> CREATOR = new C.l(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f8169a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8170b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8171c;

    public d(String str) {
        this.f8169a = str;
        this.f8171c = 1L;
        this.f8170b = -1;
    }

    public final long a() {
        long j2 = this.f8171c;
        return j2 == -1 ? this.f8170b : j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f8169a;
            if (((str != null && str.equals(dVar.f8169a)) || (str == null && dVar.f8169a == null)) && a() == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8169a, Long.valueOf(a())});
    }

    public final String toString() {
        o.b bVar = new o.b(this);
        bVar.a(this.f8169a, "name");
        bVar.a(Long.valueOf(a()), "version");
        return bVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int y2 = AbstractC0083a.y(parcel, 20293);
        AbstractC0083a.v(parcel, 1, this.f8169a);
        AbstractC0083a.A(parcel, 2, 4);
        parcel.writeInt(this.f8170b);
        long a2 = a();
        AbstractC0083a.A(parcel, 3, 8);
        parcel.writeLong(a2);
        AbstractC0083a.z(parcel, y2);
    }

    public d(String str, int i2, long j2) {
        this.f8169a = str;
        this.f8170b = i2;
        this.f8171c = j2;
    }
}
