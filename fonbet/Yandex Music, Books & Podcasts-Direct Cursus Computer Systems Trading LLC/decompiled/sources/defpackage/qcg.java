package defpackage;

/* loaded from: classes.dex */
public final class qcg extends tcg {
    public final q97 a = q97.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qcg.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((qcg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (qcg.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
