package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class N1 implements InterfaceC4043v3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f26412a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26413b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26414c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26415d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26416e;

    public N1(long j9, long j10, long j11, long j12, long j13) {
        this.f26412a = j9;
        this.f26413b = j10;
        this.f26414c = j11;
        this.f26415d = j12;
        this.f26416e = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && N1.class == obj.getClass()) {
            N1 n1 = (N1) obj;
            if (this.f26412a == n1.f26412a && this.f26413b == n1.f26413b && this.f26414c == n1.f26414c && this.f26415d == n1.f26415d && this.f26416e == n1.f26416e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26416e) + ((Long.hashCode(this.f26415d) + ((Long.hashCode(this.f26414c) + ((Long.hashCode(this.f26413b) + ((Long.hashCode(this.f26412a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        long j9 = this.f26412a;
        int length = String.valueOf(j9).length();
        long j10 = this.f26413b;
        int length2 = String.valueOf(j10).length();
        long j11 = this.f26414c;
        int length3 = String.valueOf(j11).length();
        long j12 = this.f26415d;
        int length4 = String.valueOf(j12).length();
        long j13 = this.f26416e;
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j13).length());
        com.anythink.basead.b.c.i.x(sb, "Motion photo metadata: photoStartPosition=", j9, ", photoSize=");
        sb.append(j10);
        com.anythink.basead.b.c.i.x(sb, ", photoPresentationTimestampUs=", j11, ", videoStartPosition=");
        sb.append(j12);
        sb.append(", videoSize=");
        sb.append(j13);
        return sb.toString();
    }
}
