package j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0.d f3399a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.d f3400b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.d f3401c;

    /* renamed from: d, reason: collision with root package name */
    public final d0.d f3402d;

    /* renamed from: e, reason: collision with root package name */
    public final d0.d f3403e;

    public k0() {
        d0.d dVar = j0.f3381a;
        d0.d dVar2 = j0.f3382b;
        d0.d dVar3 = j0.f3383c;
        d0.d dVar4 = j0.f3384d;
        d0.d dVar5 = j0.f3385e;
        this.f3399a = dVar;
        this.f3400b = dVar2;
        this.f3401c = dVar3;
        this.f3402d = dVar4;
        this.f3403e = dVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return pc.j.a(this.f3399a, k0Var.f3399a) && pc.j.a(this.f3400b, k0Var.f3400b) && pc.j.a(this.f3401c, k0Var.f3401c) && pc.j.a(this.f3402d, k0Var.f3402d) && pc.j.a(this.f3403e, k0Var.f3403e);
    }

    public final int hashCode() {
        return this.f3403e.hashCode() + ((this.f3402d.hashCode() + ((this.f3401c.hashCode() + ((this.f3400b.hashCode() + (this.f3399a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f3399a + ", small=" + this.f3400b + ", medium=" + this.f3401c + ", large=" + this.f3402d + ", extraLarge=" + this.f3403e + ')';
    }
}
