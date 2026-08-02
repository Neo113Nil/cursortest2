package defpackage;

/* loaded from: classes11.dex */
public final class uva1 {
    public final Object a;
    public final int b;

    public uva1(int i, Object obj) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uva1)) {
            return false;
        }
        uva1 uva1Var = (uva1) obj;
        return this.a == uva1Var.a && this.b == uva1Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
