package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Hx implements InterfaceC3922t3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f25413a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25414b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25415c;

    public Hx(long j6, long j9, long j10) {
        this.f25413a = j6;
        this.f25414b = j9;
        this.f25415c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hx)) {
            return false;
        }
        Hx hx = (Hx) obj;
        return this.f25413a == hx.f25413a && this.f25414b == hx.f25414b && this.f25415c == hx.f25415c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25415c) + ((Long.hashCode(this.f25414b) + ((Long.hashCode(this.f25413a) + 527) * 31)) * 31);
    }

    public final String toString() {
        long j6 = this.f25413a;
        int length = String.valueOf(j6).length();
        long j9 = this.f25414b;
        int length2 = String.valueOf(j9).length();
        long j10 = this.f25415c;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j10).length());
        D.y.x(sb, "Mp4Timestamp: creation time=", j6, ", modification time=");
        sb.append(j9);
        sb.append(", timescale=");
        sb.append(j10);
        return sb.toString();
    }
}
