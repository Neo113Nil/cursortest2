package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class qvs implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<qvs> CREATOR = new b3s(9);
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public qvs(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public static qvs a(qvs qvsVar, long j, long j2, long j3, int i) {
        long j4 = qvsVar.a;
        if ((i & 2) != 0) {
            j = qvsVar.b;
        }
        long j5 = j;
        if ((i & 4) != 0) {
            j2 = qvsVar.c;
        }
        long j6 = j2;
        if ((i & 8) != 0) {
            j3 = qvsVar.d;
        }
        return new qvs(j4, j5, j6, j3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvs)) {
            return false;
        }
        qvs qvsVar = (qvs) obj;
        return this.a == qvsVar.a && this.b == qvsVar.b && this.c == qvsVar.c && this.d == qvsVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder l = tlm.l(this.a, "TrackFade(inStart=", ", inStop=");
        l.append(this.b);
        ouj.C(l, ", outStart=", this.c, ", outStop=");
        return hrg.m(this.d, ")", l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
    }
}
