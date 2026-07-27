package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3060d1 {

    /* renamed from: a, reason: collision with root package name */
    public final C3167f1 f29660a;

    /* renamed from: b, reason: collision with root package name */
    public final C3167f1 f29661b;

    public C3060d1(C3167f1 c3167f1, C3167f1 c3167f12) {
        this.f29660a = c3167f1;
        this.f29661b = c3167f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3060d1.class == obj.getClass()) {
            C3060d1 c3060d1 = (C3060d1) obj;
            if (this.f29660a.equals(c3060d1.f29660a) && this.f29661b.equals(c3060d1.f29661b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29661b.hashCode() + (this.f29660a.hashCode() * 31);
    }

    public final String toString() {
        C3167f1 c3167f1 = this.f29660a;
        String c3167f12 = c3167f1.toString();
        C3167f1 c3167f13 = this.f29661b;
        String concat = c3167f1.equals(c3167f13) ? "" : ", ".concat(c3167f13.toString());
        return com.anythink.basead.exoplayer.f.f.o(new StringBuilder(u1.h.a(c3167f12.length() + 1, 1, concat)), "[", c3167f12, concat, "]");
    }
}
