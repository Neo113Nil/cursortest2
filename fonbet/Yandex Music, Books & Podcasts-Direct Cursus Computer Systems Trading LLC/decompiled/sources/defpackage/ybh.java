package defpackage;

/* loaded from: classes4.dex */
public final class ybh extends zbh {
    public final q33 a;

    public ybh(q33 q33Var) {
        this.a = q33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ybh) && this.a.equals(((ybh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(painter=" + this.a + ")";
    }
}
