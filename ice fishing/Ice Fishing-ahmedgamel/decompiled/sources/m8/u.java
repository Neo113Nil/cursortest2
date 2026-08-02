package m8;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final v f39590a;

    /* renamed from: b, reason: collision with root package name */
    public final e f39591b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f39592c;

    public /* synthetic */ u(v vVar, Throwable th, int i) {
        this(vVar, (e) null, (i & 4) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.h.a(this.f39590a, uVar.f39590a) && kotlin.jvm.internal.h.a(this.f39591b, uVar.f39591b) && kotlin.jvm.internal.h.a(this.f39592c, uVar.f39592c);
    }

    public final int hashCode() {
        int hashCode = this.f39590a.hashCode() * 31;
        e eVar = this.f39591b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Throwable th = this.f39592c;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f39590a + ", nextPlan=" + this.f39591b + ", throwable=" + this.f39592c + ')';
    }

    public u(v vVar, e eVar, Throwable th) {
        this.f39590a = vVar;
        this.f39591b = eVar;
        this.f39592c = th;
    }
}
