package Q7;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2716a;

    /* renamed from: b, reason: collision with root package name */
    public final N7.c f2717b;

    public e(String str, N7.c cVar) {
        this.f2716a = str;
        this.f2717b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.h.a(this.f2716a, eVar.f2716a) && kotlin.jvm.internal.h.a(this.f2717b, eVar.f2717b);
    }

    public final int hashCode() {
        return this.f2717b.hashCode() + (this.f2716a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f2716a + ", range=" + this.f2717b + ')';
    }
}
