package defpackage;

/* loaded from: classes.dex */
public final class lmq {
    public static final lmq c;
    public final x97 a;
    public final x97 b;

    static {
        r38 r38Var = r38.n;
        c = new lmq(r38Var, r38Var);
    }

    public lmq(x97 x97Var, x97 x97Var2) {
        this.a = x97Var;
        this.b = x97Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmq)) {
            return false;
        }
        lmq lmqVar = (lmq) obj;
        return this.a.equals(lmqVar.a) && this.b.equals(lmqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}
