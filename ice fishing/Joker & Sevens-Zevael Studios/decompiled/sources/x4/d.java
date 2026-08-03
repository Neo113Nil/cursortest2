package x4;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f8292a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f8293b;

    public d(String str, Long l10) {
        this.f8292a = str;
        this.f8293b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return pc.j.a(this.f8292a, dVar.f8292a) && pc.j.a(this.f8293b, dVar.f8293b);
    }

    public final int hashCode() {
        int hashCode = this.f8292a.hashCode() * 31;
        Long l10 = this.f8293b;
        return hashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f8292a + ", value=" + this.f8293b + ')';
    }
}
