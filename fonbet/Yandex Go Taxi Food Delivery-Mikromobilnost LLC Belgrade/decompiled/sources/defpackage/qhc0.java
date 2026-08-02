package defpackage;

/* loaded from: classes2.dex */
public final class qhc0 {
    public final String a;
    public final pkc0 b;

    public qhc0(String str, pkc0 pkc0Var) {
        this.a = str;
        this.b = pkc0Var;
    }

    public final pkc0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhc0)) {
            return false;
        }
        qhc0 qhc0Var = (qhc0) obj;
        return this.a.equals(qhc0Var.a) && this.b.equals(qhc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ContentDescription(__typename=" + this.a + ", plaqueContentDescription=" + this.b + ')';
    }
}
