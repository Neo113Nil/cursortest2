package io.appmetrica.analytics.impl;

import defpackage.fv20;
import defpackage.jl40;

/* loaded from: classes9.dex */
public final class Ff {
    public final fv20 a;
    public final Vf b;

    public Ff(fv20 fv20Var, Uf uf) {
        this.a = fv20Var;
        this.b = uf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ff)) {
            return false;
        }
        Ff ff = (Ff) obj;
        return jl40.l(this.a, ff.a) && jl40.l(this.b, ff.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MviParameters(trackerParams=" + this.a + ", reportingDataProvider=" + this.b + ')';
    }
}
