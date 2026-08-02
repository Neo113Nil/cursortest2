package J0;

/* loaded from: classes.dex */
public final class m extends p {

    /* renamed from: a, reason: collision with root package name */
    public final g f1429a = g.f1418c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        return this.f1429a.equals(((m) obj).f1429a);
    }

    public final int hashCode() {
        return this.f1429a.hashCode() + (m.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f1429a + '}';
    }
}
