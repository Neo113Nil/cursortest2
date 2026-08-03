package bc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f1070a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1071b;

    public y(int i10, Object obj) {
        this.f1070a = i10;
        this.f1071b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f1070a == yVar.f1070a && pc.j.a(this.f1071b, yVar.f1071b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f1070a) * 31;
        Object obj = this.f1071b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f1070a + ", value=" + this.f1071b + ')';
    }
}
