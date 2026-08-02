package defpackage;

import com.yandex.div.json.expressions.Expression;

/* loaded from: classes11.dex */
public final class ttr0 {
    public final Expression a;
    public final Expression b;
    public final pvo c;
    public final pvo d;
    public final jkk e;

    public /* synthetic */ ttr0(int i) {
        this(utr0.a, utr0.b, utr0.d, utr0.c, null);
    }

    public final Expression a() {
        return this.a;
    }

    public final pvo b() {
        return this.c;
    }

    public final jkk c() {
        return this.e;
    }

    public final Expression d() {
        return this.b;
    }

    public final pvo e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttr0)) {
            return false;
        }
        ttr0 ttr0Var = (ttr0) obj;
        return jl40.l(this.a, ttr0Var.a) && jl40.l(this.b, ttr0Var.b) && jl40.l(this.c, ttr0Var.c) && jl40.l(this.d, ttr0Var.d) && jl40.l(this.e, ttr0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        jkk jkkVar = this.e;
        return hashCode + (jkkVar == null ? 0 : jkkVar.hashCode());
    }

    public final String toString() {
        return "ShimmerData(angle=" + this.a + ", duration=" + this.b + ", colors=" + this.c + ", locations=" + this.d + ", cornerRadius=" + this.e + ')';
    }

    public ttr0() {
        this(0);
    }

    public ttr0(Expression expression, Expression expression2, pvo pvoVar, pvo pvoVar2, jkk jkkVar) {
        this.a = expression;
        this.b = expression2;
        this.c = pvoVar;
        this.d = pvoVar2;
        this.e = jkkVar;
    }
}
