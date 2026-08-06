package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0861x2 {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0835w2 f7164a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f7165b;

    public C0861x2(EnumC0835w2 enumC0835w2, Boolean bool) {
        this.f7164a = enumC0835w2;
        this.f7165b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0861x2.class != obj.getClass()) {
            return false;
        }
        C0861x2 c0861x2 = (C0861x2) obj;
        if (this.f7164a != c0861x2.f7164a) {
            return false;
        }
        Boolean bool = this.f7165b;
        return bool != null ? bool.equals(c0861x2.f7165b) : c0861x2.f7165b == null;
    }

    public final int hashCode() {
        EnumC0835w2 enumC0835w2 = this.f7164a;
        int hashCode = (enumC0835w2 != null ? enumC0835w2.hashCode() : 0) * 31;
        Boolean bool = this.f7165b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundRestrictionsState{mAppStandByBucket=" + this.f7164a + ", mBackgroundRestricted=" + this.f7165b + '}';
    }
}
