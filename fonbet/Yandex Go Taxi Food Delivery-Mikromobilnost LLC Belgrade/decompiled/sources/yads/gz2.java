package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rf71;
import defpackage.unr0;
import defpackage.w511;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class gz2 implements Parcelable {
    public static final Parcelable.Creator<gz2> CREATOR = new fz2();
    public final long b;
    public final long c;
    public final int d;

    public gz2(int i, long j, long j2) {
        if (j >= j2) {
            w511.q();
            throw null;
        }
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gz2.class == obj.getClass()) {
            gz2 gz2Var = (gz2) obj;
            if (this.b == gz2Var.b && this.c == gz2Var.c && this.d == gz2Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.c;
        int i = this.d;
        int i2 = rf71.a;
        Locale locale = Locale.US;
        StringBuilder w = unr0.w(j, "Segment: startTimeMs=", ", endTimeMs=");
        w.append(j2);
        w.append(", speedDivisor=");
        w.append(i);
        return w.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d);
    }
}
