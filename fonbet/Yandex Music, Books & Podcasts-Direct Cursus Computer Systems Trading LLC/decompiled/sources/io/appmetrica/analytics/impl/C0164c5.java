package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0164c5 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Boolean f;

    public C0164c5(C0106a5 c0106a5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Boolean bool;
        z = c0106a5.a;
        this.a = z;
        z2 = c0106a5.b;
        this.b = z2;
        z3 = c0106a5.c;
        this.c = z3;
        z4 = c0106a5.d;
        this.d = z4;
        z5 = c0106a5.e;
        this.e = z5;
        bool = c0106a5.f;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0164c5.class == obj.getClass()) {
            C0164c5 c0164c5 = (C0164c5) obj;
            if (this.a != c0164c5.a || this.b != c0164c5.b || this.c != c0164c5.c || this.d != c0164c5.d || this.e != c0164c5.e) {
                return false;
            }
            Boolean bool = this.f;
            Boolean bool2 = c0164c5.f;
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
        return com.appsflyer.internal.k.p(sb, this.f, '}');
    }
}
