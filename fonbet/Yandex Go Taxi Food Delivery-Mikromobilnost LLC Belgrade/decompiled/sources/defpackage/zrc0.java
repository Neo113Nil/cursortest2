package defpackage;

/* loaded from: classes2.dex */
public final class zrc0 {
    public final String a;
    public final yrc0 b;
    public final xrc0 c;
    public final wrc0 d;
    public final vrc0 e;

    public zrc0(String str, yrc0 yrc0Var, xrc0 xrc0Var, wrc0 wrc0Var, vrc0 vrc0Var) {
        this.a = str;
        this.b = yrc0Var;
        this.c = xrc0Var;
        this.d = wrc0Var;
        this.e = vrc0Var;
    }

    public final vrc0 a() {
        return this.e;
    }

    public final wrc0 b() {
        return this.d;
    }

    public final xrc0 c() {
        return this.c;
    }

    public final yrc0 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrc0)) {
            return false;
        }
        zrc0 zrc0Var = (zrc0) obj;
        return jl40.l(this.a, zrc0Var.a) && jl40.l(this.b, zrc0Var.b) && jl40.l(this.c, zrc0Var.c) && jl40.l(this.d, zrc0Var.d) && jl40.l(this.e, zrc0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        yrc0 yrc0Var = this.b;
        int hashCode2 = (hashCode + (yrc0Var == null ? 0 : yrc0Var.hashCode())) * 31;
        xrc0 xrc0Var = this.c;
        int hashCode3 = (hashCode2 + (xrc0Var == null ? 0 : xrc0Var.hashCode())) * 31;
        wrc0 wrc0Var = this.d;
        int hashCode4 = (hashCode3 + (wrc0Var == null ? 0 : wrc0Var.hashCode())) * 31;
        vrc0 vrc0Var = this.e;
        return hashCode4 + (vrc0Var != null ? vrc0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlaqueUnit(__typename=" + this.a + ", onTaxiATTextProperty=" + this.b + ", onTaxiATLinkProperty=" + this.c + ", onTaxiATImageProperty=" + this.d + ", onTaxiATContainer=" + this.e + ')';
    }
}
