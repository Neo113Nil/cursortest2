package v7;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f41445a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41446b;

    public s(int i, Object obj) {
        this.f41445a = i;
        this.f41446b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f41445a == sVar.f41445a && kotlin.jvm.internal.h.a(this.f41446b, sVar.f41446b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f41445a) * 31;
        Object obj = this.f41446b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f41445a + ", value=" + this.f41446b + ')';
    }
}
