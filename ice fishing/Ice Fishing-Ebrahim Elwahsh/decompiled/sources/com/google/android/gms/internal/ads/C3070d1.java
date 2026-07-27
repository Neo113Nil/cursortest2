package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3070d1 {

    /* renamed from: c, reason: collision with root package name */
    public static final C3070d1 f29773c = new C3070d1(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f29774a;

    /* renamed from: b, reason: collision with root package name */
    public final long f29775b;

    public C3070d1(long j9, long j10) {
        this.f29774a = j9;
        this.f29775b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3070d1.class == obj.getClass()) {
            C3070d1 c3070d1 = (C3070d1) obj;
            if (this.f29774a == c3070d1.f29774a && this.f29775b == c3070d1.f29775b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f29774a) * 31) + ((int) this.f29775b);
    }

    public final String toString() {
        long j9 = this.f29774a;
        int length = String.valueOf(j9).length();
        long j10 = this.f29775b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j10).length() + 1);
        com.anythink.basead.b.c.i.x(sb, "[timeUs=", j9, ", position=");
        sb.append(j10);
        sb.append("]");
        return sb.toString();
    }
}
