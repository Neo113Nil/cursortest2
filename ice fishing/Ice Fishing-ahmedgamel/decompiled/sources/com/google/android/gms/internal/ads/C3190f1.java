package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3190f1 {

    /* renamed from: c, reason: collision with root package name */
    public static final C3190f1 f30799c = new C3190f1(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f30800a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30801b;

    public C3190f1(long j6, long j9) {
        this.f30800a = j6;
        this.f30801b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3190f1.class == obj.getClass()) {
            C3190f1 c3190f1 = (C3190f1) obj;
            if (this.f30800a == c3190f1.f30800a && this.f30801b == c3190f1.f30801b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f30800a) * 31) + ((int) this.f30801b);
    }

    public final String toString() {
        long j6 = this.f30800a;
        int length = String.valueOf(j6).length();
        long j9 = this.f30801b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j9).length() + 1);
        com.IceFishing.LiveIceFishing.k.z(sb, "[timeUs=", j6, ", position=");
        sb.append(j9);
        sb.append("]");
        return sb.toString();
    }
}
