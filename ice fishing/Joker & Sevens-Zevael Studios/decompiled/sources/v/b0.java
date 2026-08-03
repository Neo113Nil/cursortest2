package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final u f6774a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6775b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6776c;

    public b0(u uVar, int i10, long j3) {
        this.f6774a = uVar;
        this.f6775b = i10;
        this.f6776c = j3;
    }

    @Override // v.h
    public final j1 a(x4.s sVar) {
        return new m1(this.f6774a.a(sVar), this.f6775b, this.f6776c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return b0Var.f6774a.equals(this.f6774a) && b0Var.f6775b == this.f6775b && b0Var.f6776c == this.f6776c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6776c) + ((f.d(this.f6775b) + (this.f6774a.hashCode() * 31)) * 31);
    }
}
