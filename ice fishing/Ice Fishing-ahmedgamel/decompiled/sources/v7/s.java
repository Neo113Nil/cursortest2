package v7;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f41224a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41225b;

    public s(int i, Object obj) {
        this.f41224a = i;
        this.f41225b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f41224a == sVar.f41224a && kotlin.jvm.internal.h.a(this.f41225b, sVar.f41225b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f41224a) * 31;
        Object obj = this.f41225b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f41224a + ", value=" + this.f41225b + ')';
    }
}
