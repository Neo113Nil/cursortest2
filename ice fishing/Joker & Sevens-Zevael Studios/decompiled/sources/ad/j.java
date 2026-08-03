package ad;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f326a;

    public j(Throwable th) {
        this.f326a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return pc.j.a(this.f326a, ((j) obj).f326a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f326a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // ad.k
    public final String toString() {
        return "Closed(" + this.f326a + ')';
    }
}
