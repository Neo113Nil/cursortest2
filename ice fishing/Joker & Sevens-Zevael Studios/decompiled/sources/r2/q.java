package r2;

import bc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f6040c = new q(a0.t(0), a0.t(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f6041a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6042b;

    public q(long j3, long j6) {
        this.f6041a = j3;
        this.f6042b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return s2.n.a(this.f6041a, qVar.f6041a) && s2.n.a(this.f6042b, qVar.f6042b);
    }

    public final int hashCode() {
        s2.o[] oVarArr = s2.n.f6400b;
        return Long.hashCode(this.f6042b) + (Long.hashCode(this.f6041a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) s2.n.d(this.f6041a)) + ", restLine=" + ((Object) s2.n.d(this.f6042b)) + ')';
    }
}
