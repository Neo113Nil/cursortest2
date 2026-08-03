package z;

import m0.l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8993a;

    /* renamed from: b, reason: collision with root package name */
    public final l1 f8994b;

    public n0(y yVar, String str) {
        this.f8993a = str;
        this.f8994b = m0.z.s(yVar);
    }

    @Override // z.o0
    public final int a(x1.o0 o0Var, s2.l lVar) {
        return e().f9044c;
    }

    @Override // z.o0
    public final int b(x1.o0 o0Var) {
        return e().f9043b;
    }

    @Override // z.o0
    public final int c(x1.o0 o0Var) {
        return e().f9045d;
    }

    @Override // z.o0
    public final int d(x1.o0 o0Var, s2.l lVar) {
        return e().f9042a;
    }

    public final y e() {
        return (y) this.f8994b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n0) {
            return pc.j.a(e(), ((n0) obj).e());
        }
        return false;
    }

    public final void f(y yVar) {
        this.f8994b.setValue(yVar);
    }

    public final int hashCode() {
        return this.f8993a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8993a);
        sb.append("(left=");
        sb.append(e().f9042a);
        sb.append(", top=");
        sb.append(e().f9043b);
        sb.append(", right=");
        sb.append(e().f9044c);
        sb.append(", bottom=");
        return a4.d.l(sb, e().f9045d, ')');
    }
}
