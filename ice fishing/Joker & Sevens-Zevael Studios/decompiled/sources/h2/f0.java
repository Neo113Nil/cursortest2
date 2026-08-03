package h2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f2658a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f2659b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f2660c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f2661d;

    public f0(a0 a0Var, a0 a0Var2, a0 a0Var3, a0 a0Var4) {
        this.f2658a = a0Var;
        this.f2659b = a0Var2;
        this.f2660c = a0Var3;
        this.f2661d = a0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return pc.j.a(this.f2658a, f0Var.f2658a) && pc.j.a(this.f2659b, f0Var.f2659b) && pc.j.a(this.f2660c, f0Var.f2660c) && pc.j.a(this.f2661d, f0Var.f2661d);
    }

    public final int hashCode() {
        a0 a0Var = this.f2658a;
        int hashCode = (a0Var != null ? a0Var.hashCode() : 0) * 31;
        a0 a0Var2 = this.f2659b;
        int hashCode2 = (hashCode + (a0Var2 != null ? a0Var2.hashCode() : 0)) * 31;
        a0 a0Var3 = this.f2660c;
        int hashCode3 = (hashCode2 + (a0Var3 != null ? a0Var3.hashCode() : 0)) * 31;
        a0 a0Var4 = this.f2661d;
        return hashCode3 + (a0Var4 != null ? a0Var4.hashCode() : 0);
    }
}
