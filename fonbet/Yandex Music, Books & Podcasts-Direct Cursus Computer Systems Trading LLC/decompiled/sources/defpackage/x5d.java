package defpackage;

/* loaded from: classes.dex */
public final class x5d implements Cloneable {
    public e88 a;

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final x5d clone() {
        try {
            return (x5d) super.clone();
        } catch (CloneNotSupportedException e) {
            b6e.q(e);
            return null;
        }
    }

    public final boolean c(Object obj) {
        if (obj instanceof x5d) {
            return xut.b(this.a, ((x5d) obj).a);
        }
        return false;
    }

    public final int d() {
        e88 e88Var = this.a;
        if (e88Var != null) {
            return e88Var.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x5d) && c(obj);
    }

    public final int hashCode() {
        return d();
    }
}
