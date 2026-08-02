package defpackage;

/* loaded from: classes2.dex */
public final class xrc0 {
    public final String a;
    public final wnc0 b;

    public xrc0(String str, wnc0 wnc0Var) {
        this.a = str;
        this.b = wnc0Var;
    }

    public final wnc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrc0)) {
            return false;
        }
        xrc0 xrc0Var = (xrc0) obj;
        return this.a.equals(xrc0Var.a) && this.b.equals(xrc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTaxiATLinkProperty(__typename=" + this.a + ", plaqueLinkProperty=" + this.b + ')';
    }
}
