package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class yi extends l9 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public static final msg f = new msg("AdBreakStatus", null);

    @NonNull
    public static final Parcelable.Creator<yi> CREATOR = new k2x(25);

    public yi(long j, long j2, long j3, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi)) {
            return false;
        }
        yi yiVar = (yi) obj;
        return this.a == yiVar.a && this.b == yiVar.b && d94.d(this.c, yiVar.c) && d94.d(this.d, yiVar.d) && this.e == yiVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(2, 8, parcel);
        parcel.writeLong(this.a);
        o8g.q0(3, 8, parcel);
        parcel.writeLong(this.b);
        o8g.j0(parcel, 4, this.c);
        o8g.j0(parcel, 5, this.d);
        o8g.q0(6, 8, parcel);
        parcel.writeLong(this.e);
        o8g.p0(parcel, o0);
    }
}
