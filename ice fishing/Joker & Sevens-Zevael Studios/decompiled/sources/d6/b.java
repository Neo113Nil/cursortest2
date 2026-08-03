package d6;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f1691a;

    /* renamed from: b, reason: collision with root package name */
    public final w5.i f1692b;

    /* renamed from: c, reason: collision with root package name */
    public final w5.h f1693c;

    public b(long j3, w5.i iVar, w5.h hVar) {
        this.f1691a = j3;
        this.f1692b = iVar;
        this.f1693c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f1691a == bVar.f1691a && this.f1692b.equals(bVar.f1692b) && this.f1693c.equals(bVar.f1693c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f1691a;
        return ((((((int) ((j3 >>> 32) ^ j3)) ^ 1000003) * 1000003) ^ this.f1692b.hashCode()) * 1000003) ^ this.f1693c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f1691a + ", transportContext=" + this.f1692b + ", event=" + this.f1693c + "}";
    }
}
