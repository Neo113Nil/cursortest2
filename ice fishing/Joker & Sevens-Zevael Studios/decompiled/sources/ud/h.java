package ud;

import java.util.List;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final List f6756a;

    public h(List list) {
        this.f6756a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && j.a(this.f6756a, ((h) obj).f6756a);
    }

    public final int hashCode() {
        return this.f6756a.hashCode();
    }

    public final String toString() {
        return "RulesState(rules=" + this.f6756a + ")";
    }
}
