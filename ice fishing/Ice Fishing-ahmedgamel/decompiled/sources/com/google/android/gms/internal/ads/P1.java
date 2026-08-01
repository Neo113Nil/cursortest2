package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class P1 implements InterfaceC3922t3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f26711a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26712b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26713c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26714d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26715e;

    public P1(long j6, long j9, long j10, long j11, long j12) {
        this.f26711a = j6;
        this.f26712b = j9;
        this.f26713c = j10;
        this.f26714d = j11;
        this.f26715e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P1.class == obj.getClass()) {
            P1 p1 = (P1) obj;
            if (this.f26711a == p1.f26711a && this.f26712b == p1.f26712b && this.f26713c == p1.f26713c && this.f26714d == p1.f26714d && this.f26715e == p1.f26715e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26715e) + ((Long.hashCode(this.f26714d) + ((Long.hashCode(this.f26713c) + ((Long.hashCode(this.f26712b) + ((Long.hashCode(this.f26711a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        long j6 = this.f26711a;
        int length = String.valueOf(j6).length();
        long j9 = this.f26712b;
        int length2 = String.valueOf(j9).length();
        long j10 = this.f26713c;
        int length3 = String.valueOf(j10).length();
        long j11 = this.f26714d;
        int length4 = String.valueOf(j11).length();
        long j12 = this.f26715e;
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j12).length());
        D.y.x(sb, "Motion photo metadata: photoStartPosition=", j6, ", photoSize=");
        sb.append(j9);
        D.y.x(sb, ", photoPresentationTimestampUs=", j10, ", videoStartPosition=");
        sb.append(j11);
        sb.append(", videoSize=");
        sb.append(j12);
        return sb.toString();
    }
}
