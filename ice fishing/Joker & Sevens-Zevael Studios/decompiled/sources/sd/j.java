package sd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f6503a;

    public j(int i10) {
        this.f6503a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f6503a == ((j) obj).f6503a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6503a);
    }

    public final String toString() {
        return a4.d.h("GameOverState(bestScore=", this.f6503a, ")");
    }
}
