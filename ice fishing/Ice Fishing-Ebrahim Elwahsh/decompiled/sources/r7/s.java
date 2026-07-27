package r7;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f40361a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f40362b;

    public s(int i, Object obj) {
        this.f40361a = i;
        this.f40362b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f40361a == sVar.f40361a && kotlin.jvm.internal.h.a(this.f40362b, sVar.f40362b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f40361a) * 31;
        Object obj = this.f40362b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f40361a + ", value=" + this.f40362b + ')';
    }
}
