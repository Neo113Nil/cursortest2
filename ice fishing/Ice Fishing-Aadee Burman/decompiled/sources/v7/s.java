package v7;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f41442a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41443b;

    public s(int i, Object obj) {
        this.f41442a = i;
        this.f41443b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f41442a == sVar.f41442a && kotlin.jvm.internal.h.a(this.f41443b, sVar.f41443b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f41442a) * 31;
        Object obj = this.f41443b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f41442a + ", value=" + this.f41443b + ')';
    }
}
