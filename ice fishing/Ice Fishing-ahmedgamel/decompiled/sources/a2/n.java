package a2;

/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public final u f4288a;

    /* renamed from: b, reason: collision with root package name */
    public final t f4289b;

    public n(u uVar, t tVar) {
        this.f4288a = uVar;
        this.f4289b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f4288a;
            if (uVar != null ? uVar.equals(((n) vVar).f4288a) : ((n) vVar).f4288a == null) {
                t tVar = this.f4289b;
                if (tVar != null ? tVar.equals(((n) vVar).f4289b) : ((n) vVar).f4289b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f4288a;
        int hashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f4289b;
        return (tVar != null ? tVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f4288a + ", mobileSubtype=" + this.f4289b + "}";
    }
}
