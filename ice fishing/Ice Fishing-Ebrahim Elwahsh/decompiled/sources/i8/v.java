package i8;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final w f38445a;

    /* renamed from: b, reason: collision with root package name */
    public final e f38446b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f38447c;

    public v(w wVar, e eVar, Throwable th) {
        this.f38445a = wVar;
        this.f38446b = eVar;
        this.f38447c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.h.a(this.f38445a, vVar.f38445a) && kotlin.jvm.internal.h.a(this.f38446b, vVar.f38446b) && kotlin.jvm.internal.h.a(this.f38447c, vVar.f38447c);
    }

    public final int hashCode() {
        int hashCode = this.f38445a.hashCode() * 31;
        e eVar = this.f38446b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Throwable th = this.f38447c;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f38445a + ", nextPlan=" + this.f38446b + ", throwable=" + this.f38447c + ')';
    }

    public /* synthetic */ v(w wVar, Throwable th, int i) {
        this(wVar, (e) null, (i & 4) != 0 ? null : th);
    }
}
