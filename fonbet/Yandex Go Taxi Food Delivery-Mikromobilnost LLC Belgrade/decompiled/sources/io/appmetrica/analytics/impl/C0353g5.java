package io.appmetrica.analytics.impl;

import defpackage.oo31;

/* renamed from: io.appmetrica.analytics.impl.g5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0353g5 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Boolean f;

    public C0353g5(C0295e5 c0295e5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Boolean bool;
        z = c0295e5.a;
        this.a = z;
        z2 = c0295e5.b;
        this.b = z2;
        z3 = c0295e5.c;
        this.c = z3;
        z4 = c0295e5.d;
        this.d = z4;
        z5 = c0295e5.e;
        this.e = z5;
        bool = c0295e5.f;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0353g5.class == obj.getClass()) {
            C0353g5 c0353g5 = (C0353g5) obj;
            if (this.a != c0353g5.a || this.b != c0353g5.b || this.c != c0353g5.c || this.d != c0353g5.d || this.e != c0353g5.e) {
                return false;
            }
            Boolean bool = this.f;
            Boolean bool2 = c0353g5.f;
            if (bool != null) {
                return bool.equals(bool2);
            }
            if (bool2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        Boolean bool = this.f;
        return i + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectingFlags{permissionsCollectingEnabled=");
        sb.append(this.a);
        sb.append(", featuresCollectingEnabled=");
        sb.append(this.b);
        sb.append(", googleAid=");
        sb.append(this.c);
        sb.append(", simInfo=");
        sb.append(this.d);
        sb.append(", huaweiOaid=");
        sb.append(this.e);
        sb.append(", sslPinning=");
        return oo31.i(sb, this.f, '}');
    }
}
