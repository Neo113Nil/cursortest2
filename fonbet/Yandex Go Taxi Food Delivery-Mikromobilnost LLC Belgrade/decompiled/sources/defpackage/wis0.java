package defpackage;

/* loaded from: classes10.dex */
public final class wis0 {
    public static final wis0 c;
    public final jh91 a;
    public final jh91 b;

    static {
        nkj nkjVar = nkj.a;
        c = new wis0(nkjVar, nkjVar);
    }

    public wis0(jh91 jh91Var, jh91 jh91Var2) {
        this.a = jh91Var;
        this.b = jh91Var2;
    }

    public final jh91 a() {
        return this.b;
    }

    public final jh91 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wis0)) {
            return false;
        }
        wis0 wis0Var = (wis0) obj;
        return this.a.equals(wis0Var.a) && this.b.equals(wis0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}
