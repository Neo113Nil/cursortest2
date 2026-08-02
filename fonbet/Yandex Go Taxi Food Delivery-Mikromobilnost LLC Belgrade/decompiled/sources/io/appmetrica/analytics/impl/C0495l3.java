package io.appmetrica.analytics.impl;

import defpackage.oo31;

/* renamed from: io.appmetrica.analytics.impl.l3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0495l3 {
    public final EnumC0466k3 a;
    public final Boolean b;

    public C0495l3(EnumC0466k3 enumC0466k3, Boolean bool) {
        this.a = enumC0466k3;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0495l3.class == obj.getClass()) {
            C0495l3 c0495l3 = (C0495l3) obj;
            if (this.a != c0495l3.a) {
                return false;
            }
            Boolean bool = this.b;
            Boolean bool2 = c0495l3.b;
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
        EnumC0466k3 enumC0466k3 = this.a;
        int hashCode = (enumC0466k3 != null ? enumC0466k3.hashCode() : 0) * 31;
        Boolean bool = this.b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackgroundRestrictionsState{mAppStandByBucket=");
        sb.append(this.a);
        sb.append(", mBackgroundRestricted=");
        return oo31.i(sb, this.b, '}');
    }
}
