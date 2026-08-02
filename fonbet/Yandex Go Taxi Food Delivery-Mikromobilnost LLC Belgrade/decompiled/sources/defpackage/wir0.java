package defpackage;

/* loaded from: classes.dex */
public final class wir0 {
    public final byk0 a;
    public final byk0 b;
    public final byk0 c;
    public final byk0 d;
    public final byk0 e;
    public final byk0 f;
    public final byk0 g;
    public final byk0 h;

    public wir0() {
        this(nhr0.a, nhr0.b, nhr0.c, nhr0.d, nhr0.f, nhr0.e, nhr0.g, nhr0.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wir0)) {
            return false;
        }
        wir0 wir0Var = (wir0) obj;
        return jl40.l(this.a, wir0Var.a) && jl40.l(this.b, wir0Var.b) && jl40.l(this.c, wir0Var.c) && jl40.l(this.d, wir0Var.d) && jl40.l(this.e, wir0Var.e) && jl40.l(this.f, wir0Var.f) && jl40.l(this.g, wir0Var.g) && jl40.l(this.h, wir0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }

    public wir0(byk0 byk0Var, byk0 byk0Var2, byk0 byk0Var3, byk0 byk0Var4, byk0 byk0Var5, byk0 byk0Var6, byk0 byk0Var7, byk0 byk0Var8) {
        this.a = byk0Var;
        this.b = byk0Var2;
        this.c = byk0Var3;
        this.d = byk0Var4;
        this.e = byk0Var5;
        this.f = byk0Var6;
        this.g = byk0Var7;
        this.h = byk0Var8;
    }

    public wir0(byk0 byk0Var, byk0 byk0Var2, byk0 byk0Var3, byk0 byk0Var4, byk0 byk0Var5) {
        this(byk0Var, byk0Var2, byk0Var3, byk0Var4, byk0Var5, nhr0.e, nhr0.g, nhr0.h);
    }
}
