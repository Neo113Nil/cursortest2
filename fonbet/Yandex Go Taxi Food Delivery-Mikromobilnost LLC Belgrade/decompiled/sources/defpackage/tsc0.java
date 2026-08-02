package defpackage;

/* loaded from: classes2.dex */
public final class tsc0 {
    public final String a;
    public final pkc0 b;

    public tsc0(String str, pkc0 pkc0Var) {
        this.a = str;
        this.b = pkc0Var;
    }

    public final pkc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsc0)) {
            return false;
        }
        tsc0 tsc0Var = (tsc0) obj;
        return this.a.equals(tsc0Var.a) && this.b.equals(tsc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ContentDescription(__typename=" + this.a + ", plaqueContentDescription=" + this.b + ')';
    }
}
