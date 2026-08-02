package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.qd81;

/* loaded from: classes7.dex */
public final class lu1 implements bs1 {
    public static final Parcelable.Creator<lu1> CREATOR = new ku1();
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public lu1(Parcel parcel) {
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ qd81 a() {
        return super.a();
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ byte[] b() {
        return super.b();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lu1.class == obj.getClass()) {
            lu1 lu1Var = (lu1) obj;
            if (this.b == lu1Var.b && this.c == lu1Var.c && this.d == lu1Var.d && this.e == lu1Var.e && this.f == lu1Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        int i = (((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.d;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.e;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f;
        return i3 + ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.b + ", photoSize=" + this.c + ", photoPresentationTimestampUs=" + this.d + ", videoStartPosition=" + this.e + ", videoSize=" + this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ void a(a291 a291Var) {
        super.a(a291Var);
    }

    public lu1(long j, long j2, long j3, long j4, long j5) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }
}
