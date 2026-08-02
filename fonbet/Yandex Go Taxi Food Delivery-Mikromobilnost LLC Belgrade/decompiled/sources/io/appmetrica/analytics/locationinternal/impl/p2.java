package io.appmetrica.analytics.locationinternal.impl;

import defpackage.jl40;

/* loaded from: classes9.dex */
public final class p2 {
    public final boolean a;
    public final r2 b;
    public final r2 c;

    public p2(boolean z, r2 r2Var, r2 r2Var2) {
        this.a = z;
        this.b = r2Var;
        this.c = r2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p2.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return this.a == p2Var.a && jl40.l(this.b, p2Var.b) && jl40.l(this.c, p2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ThrottlingConfig(enabled=" + this.a + ", cellConfig=" + this.b + ", wifiConfig=" + this.c + ')';
    }
}
