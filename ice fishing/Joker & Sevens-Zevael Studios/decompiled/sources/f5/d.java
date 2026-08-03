package f5;

import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f2315b;

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return j.a(this.f2315b, ((d) obj).f2315b);
        }
        return false;
    }

    @Override // f5.e
    public final Object getValue() {
        return this.f2315b;
    }

    public final int hashCode() {
        Object obj = this.f2315b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Value(value=" + this.f2315b + ')';
    }
}
