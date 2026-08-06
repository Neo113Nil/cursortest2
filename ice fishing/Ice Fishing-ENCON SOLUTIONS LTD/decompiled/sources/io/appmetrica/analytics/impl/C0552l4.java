package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.l4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552l4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6414a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6415b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6416c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6417d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6418e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f6419f;

    public C0552l4(C0500j4 c0500j4) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Boolean bool;
        z2 = c0500j4.f6244a;
        this.f6414a = z2;
        z3 = c0500j4.f6245b;
        this.f6415b = z3;
        z4 = c0500j4.f6246c;
        this.f6416c = z4;
        z5 = c0500j4.f6247d;
        this.f6417d = z5;
        z6 = c0500j4.f6248e;
        this.f6418e = z6;
        bool = c0500j4.f6249f;
        this.f6419f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0552l4.class != obj.getClass()) {
            return false;
        }
        C0552l4 c0552l4 = (C0552l4) obj;
        if (this.f6414a != c0552l4.f6414a || this.f6415b != c0552l4.f6415b || this.f6416c != c0552l4.f6416c || this.f6417d != c0552l4.f6417d || this.f6418e != c0552l4.f6418e) {
            return false;
        }
        Boolean bool = this.f6419f;
        Boolean bool2 = c0552l4.f6419f;
        return bool != null ? bool.equals(bool2) : bool2 == null;
    }

    public final int hashCode() {
        int i2 = (((((((((this.f6414a ? 1 : 0) * 31) + (this.f6415b ? 1 : 0)) * 31) + (this.f6416c ? 1 : 0)) * 31) + (this.f6417d ? 1 : 0)) * 31) + (this.f6418e ? 1 : 0)) * 31;
        Boolean bool = this.f6419f;
        return i2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f6414a + ", featuresCollectingEnabled=" + this.f6415b + ", googleAid=" + this.f6416c + ", simInfo=" + this.f6417d + ", huaweiOaid=" + this.f6418e + ", sslPinning=" + this.f6419f + '}';
    }
}
