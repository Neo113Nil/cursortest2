package zd;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9191a;

    public e(List list) {
        this.f9191a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f9191a.equals(((e) obj).f9191a);
    }

    public final int hashCode() {
        return this.f9191a.hashCode();
    }

    public final String toString() {
        return "StatisticsState(items=" + this.f9191a + ")";
    }
}
