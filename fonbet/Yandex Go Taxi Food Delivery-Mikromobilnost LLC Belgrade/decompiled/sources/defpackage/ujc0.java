package defpackage;

import com.yandex.plus.core.graphql.type.GRADIENT_TYPE;

/* loaded from: classes8.dex */
public final class ujc0 {
    public final GRADIENT_TYPE a;
    public final sjc0 b;
    public final tjc0 c;

    public ujc0(GRADIENT_TYPE gradient_type, sjc0 sjc0Var, tjc0 tjc0Var) {
        this.a = gradient_type;
        this.b = sjc0Var;
        this.c = tjc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujc0)) {
            return false;
        }
        ujc0 ujc0Var = (ujc0) obj;
        return this.a == ujc0Var.a && jl40.l(this.b, ujc0Var.b) && jl40.l(this.c, ujc0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sjc0 sjc0Var = this.b;
        int hashCode2 = (hashCode + (sjc0Var == null ? 0 : sjc0Var.hashCode())) * 31;
        tjc0 tjc0Var = this.c;
        return hashCode2 + (tjc0Var != null ? tjc0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlaqueColorSettings(type=" + this.a + ", linear=" + this.b + ", radial=" + this.c + ')';
    }
}
