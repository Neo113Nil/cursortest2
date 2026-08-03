package w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f7513a;

    /* renamed from: b, reason: collision with root package name */
    public final z.c0 f7514b;

    public u0() {
        long c3 = f1.d0.c(4284900966L);
        float f10 = 0;
        z.c0 c0Var = new z.c0(f10, f10, f10, f10);
        this.f7513a = c3;
        this.f7514b = c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!u0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        pc.j.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        u0 u0Var = (u0) obj;
        return f1.q.c(this.f7513a, u0Var.f7513a) && pc.j.a(this.f7514b, u0Var.f7514b);
    }

    public final int hashCode() {
        int i10 = f1.q.f2284i;
        return this.f7514b.hashCode() + (Long.hashCode(this.f7513a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        a4.d.q(this.f7513a, sb, ", drawPadding=");
        sb.append(this.f7514b);
        sb.append(')');
        return sb.toString();
    }
}
