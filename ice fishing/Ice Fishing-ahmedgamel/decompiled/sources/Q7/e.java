package Q7;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2679a;

    /* renamed from: b, reason: collision with root package name */
    public final N7.c f2680b;

    public e(String str, N7.c cVar) {
        this.f2679a = str;
        this.f2680b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.h.a(this.f2679a, eVar.f2679a) && kotlin.jvm.internal.h.a(this.f2680b, eVar.f2680b);
    }

    public final int hashCode() {
        return this.f2680b.hashCode() + (this.f2679a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f2679a + ", range=" + this.f2680b + ')';
    }
}
