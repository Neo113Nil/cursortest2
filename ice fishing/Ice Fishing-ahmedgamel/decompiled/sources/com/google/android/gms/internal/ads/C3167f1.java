package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3167f1 {

    /* renamed from: c, reason: collision with root package name */
    public static final C3167f1 f30012c = new C3167f1(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f30013a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30014b;

    public C3167f1(long j6, long j9) {
        this.f30013a = j6;
        this.f30014b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3167f1.class == obj.getClass()) {
            C3167f1 c3167f1 = (C3167f1) obj;
            if (this.f30013a == c3167f1.f30013a && this.f30014b == c3167f1.f30014b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f30013a) * 31) + ((int) this.f30014b);
    }

    public final String toString() {
        long j6 = this.f30013a;
        int length = String.valueOf(j6).length();
        long j9 = this.f30014b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j9).length() + 1);
        D.y.x(sb, "[timeUs=", j6, ", position=");
        sb.append(j9);
        sb.append("]");
        return sb.toString();
    }
}
