package x3;

import java.util.LinkedHashMap;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8286a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return j.a(this.f8286a, ((b) obj).f8286a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8286a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f8286a + ')';
    }
}
