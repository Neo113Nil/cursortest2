package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zyv implements bzv {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public zyv(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyv)) {
            return false;
        }
        zyv zyvVar = (zyv) obj;
        return Intrinsics.d(this.a, zyvVar.a) && this.b == zyvVar.b && this.c == zyvVar.c && this.d == zyvVar.d && this.e == zyvVar.e && this.f == zyvVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + k5r.e(k5r.e(k5r.e(k5r.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 961, this.e);
    }

    public final String toString() {
        StringBuilder h = v3w.h("Default(currentGenre=", this.a, ", isHudVisible=", ", isHeaderVisible=", this.b);
        dfi.t(h, this.c, ", isCardInfoVisible=", this.d, ", isFooterVisible=");
        return v3w.g(h, this.e, ", initialCenterCoordinates=null, isOneToOneHintShown=", this.f, ")");
    }
}
