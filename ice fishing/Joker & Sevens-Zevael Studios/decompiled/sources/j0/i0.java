package j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i0 implements w.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3352a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3353b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3354c;

    public i0(boolean z10, float f10, long j3) {
        this.f3352a = z10;
        this.f3353b = f10;
        this.f3354c = j3;
    }

    @Override // w.o0
    public final x1.l a(y.i iVar) {
        return new p(iVar, this.f3352a, this.f3353b, new f8.c(20, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (this.f3352a == i0Var.f3352a && s2.f.a(this.f3353b, i0Var.f3353b)) {
            return f1.q.c(this.f3354c, i0Var.f3354c);
        }
        return false;
    }

    public final int hashCode() {
        int b2 = a4.d.b(this.f3353b, Boolean.hashCode(this.f3352a) * 31, 961);
        int i10 = f1.q.f2284i;
        return Long.hashCode(this.f3354c) + b2;
    }
}
