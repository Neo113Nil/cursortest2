package x0;

import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f7967a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f7968b;

    public g(int i10, Integer num) {
        this.f7967a = i10;
        this.f7968b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f7967a == gVar.f7967a && j.a(this.f7968b, gVar.f7968b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f7967a) * 31;
        Integer num = this.f7968b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f7967a + ", dataOffset=" + this.f7968b + ')';
    }
}
