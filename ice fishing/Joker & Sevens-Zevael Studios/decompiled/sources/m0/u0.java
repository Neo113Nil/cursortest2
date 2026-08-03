package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f4775a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4776b;

    public u0(Integer num, Object obj) {
        this.f4775a = num;
        this.f4776b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f4775a.equals(u0Var.f4775a) && pc.j.a(this.f4776b, u0Var.f4776b);
    }

    public final int hashCode() {
        int hashCode = this.f4775a.hashCode() * 31;
        Object obj = this.f4776b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f4775a + ", right=" + this.f4776b + ')';
    }
}
