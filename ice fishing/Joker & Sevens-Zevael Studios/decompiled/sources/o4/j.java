package o4;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends m {

    /* renamed from: a, reason: collision with root package name */
    public final e f5214a = e.f5205c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return this.f5214a.equals(((j) obj).f5214a);
    }

    public final int hashCode() {
        return this.f5214a.hashCode() + (j.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f5214a + '}';
    }
}
