package ac;

import java.io.Serializable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public final Throwable f272g;

    public k(Throwable th) {
        pc.j.e(th, "exception");
        this.f272g = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return pc.j.a(this.f272g, ((k) obj).f272g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f272g.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f272g + ')';
    }
}
