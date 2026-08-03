package m6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import x4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends q6.a {
    public static final Parcelable.Creator<d> CREATOR = new e7.c(8);

    /* renamed from: g, reason: collision with root package name */
    public final String f4909g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4910h;

    /* renamed from: i, reason: collision with root package name */
    public final long f4911i;

    public d() {
        this.f4909g = "CLIENT_TELEMETRY";
        this.f4911i = 1L;
        this.f4910h = -1;
    }

    public final long a() {
        long j3 = this.f4911i;
        return j3 == -1 ? this.f4910h : j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = dVar.f4909g;
            String str2 = this.f4909g;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && a() == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4909g, Long.valueOf(a())});
    }

    public final String toString() {
        s sVar = new s(this);
        sVar.b(this.f4909g, "name");
        sVar.b(Long.valueOf(a()), "version");
        return sVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int g02 = x4.f.g0(parcel, 20293);
        x4.f.c0(parcel, 1, this.f4909g);
        x4.f.i0(parcel, 2, 4);
        parcel.writeInt(this.f4910h);
        long a6 = a();
        x4.f.i0(parcel, 3, 8);
        parcel.writeLong(a6);
        x4.f.h0(parcel, g02);
    }

    public d(int i10, long j3, String str) {
        this.f4909g = str;
        this.f4910h = i10;
        this.f4911i = j3;
    }
}
