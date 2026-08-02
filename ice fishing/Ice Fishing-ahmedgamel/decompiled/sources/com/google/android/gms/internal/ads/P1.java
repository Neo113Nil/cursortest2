package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class P1 implements InterfaceC3945t3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f27494a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27495b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27496c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27497d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27498e;

    public P1(long j6, long j9, long j10, long j11, long j12) {
        this.f27494a = j6;
        this.f27495b = j9;
        this.f27496c = j10;
        this.f27497d = j11;
        this.f27498e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P1.class == obj.getClass()) {
            P1 p1 = (P1) obj;
            if (this.f27494a == p1.f27494a && this.f27495b == p1.f27495b && this.f27496c == p1.f27496c && this.f27497d == p1.f27497d && this.f27498e == p1.f27498e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27498e) + ((Long.hashCode(this.f27497d) + ((Long.hashCode(this.f27496c) + ((Long.hashCode(this.f27495b) + ((Long.hashCode(this.f27494a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        long j6 = this.f27494a;
        int length = String.valueOf(j6).length();
        long j9 = this.f27495b;
        int length2 = String.valueOf(j9).length();
        long j10 = this.f27496c;
        int length3 = String.valueOf(j10).length();
        long j11 = this.f27497d;
        int length4 = String.valueOf(j11).length();
        long j12 = this.f27498e;
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j12).length());
        com.IceFishing.LiveIceFishing.k.z(sb, "Motion photo metadata: photoStartPosition=", j6, ", photoSize=");
        sb.append(j9);
        com.IceFishing.LiveIceFishing.k.z(sb, ", photoPresentationTimestampUs=", j10, ", videoStartPosition=");
        sb.append(j11);
        sb.append(", videoSize=");
        sb.append(j12);
        return sb.toString();
    }
}
