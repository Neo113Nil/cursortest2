package defpackage;

/* loaded from: classes.dex */
public final class scg extends tcg {
    public final q97 a;

    public scg(q97 q97Var) {
        this.a = q97Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || scg.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((scg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (scg.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
