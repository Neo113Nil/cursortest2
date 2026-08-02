package com.google.android.gms.internal.ads;

import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3083d1 {

    /* renamed from: a, reason: collision with root package name */
    public final C3190f1 f30432a;

    /* renamed from: b, reason: collision with root package name */
    public final C3190f1 f30433b;

    public C3083d1(C3190f1 c3190f1, C3190f1 c3190f12) {
        this.f30432a = c3190f1;
        this.f30433b = c3190f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3083d1.class == obj.getClass()) {
            C3083d1 c3083d1 = (C3083d1) obj;
            if (this.f30432a.equals(c3083d1.f30432a) && this.f30433b.equals(c3083d1.f30433b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f30433b.hashCode() + (this.f30432a.hashCode() * 31);
    }

    public final String toString() {
        C3190f1 c3190f1 = this.f30432a;
        String c3190f12 = c3190f1.toString();
        C3190f1 c3190f13 = this.f30433b;
        String concat = c3190f1.equals(c3190f13) ? "" : ", ".concat(c3190f13.toString());
        return com.IceFishing.LiveIceFishing.k.r(new StringBuilder(AbstractC5128c.j(c3190f12.length() + 1, 1, concat)), "[", c3190f12, concat, "]");
    }
}
