package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Hx implements InterfaceC3945t3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f26156a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26157b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26158c;

    public Hx(long j6, long j9, long j10) {
        this.f26156a = j6;
        this.f26157b = j9;
        this.f26158c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hx)) {
            return false;
        }
        Hx hx = (Hx) obj;
        return this.f26156a == hx.f26156a && this.f26157b == hx.f26157b && this.f26158c == hx.f26158c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26158c) + ((Long.hashCode(this.f26157b) + ((Long.hashCode(this.f26156a) + 527) * 31)) * 31);
    }

    public final String toString() {
        long j6 = this.f26156a;
        int length = String.valueOf(j6).length();
        long j9 = this.f26157b;
        int length2 = String.valueOf(j9).length();
        long j10 = this.f26158c;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j10).length());
        com.IceFishing.LiveIceFishing.k.z(sb, "Mp4Timestamp: creation time=", j6, ", modification time=");
        sb.append(j9);
        sb.append(", timescale=");
        sb.append(j10);
        return sb.toString();
    }
}
