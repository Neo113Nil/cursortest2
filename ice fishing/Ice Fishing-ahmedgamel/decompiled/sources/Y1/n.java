package Y1;

/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public final u f3935a;

    /* renamed from: b, reason: collision with root package name */
    public final t f3936b;

    public n(u uVar, t tVar) {
        this.f3935a = uVar;
        this.f3936b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f3935a;
            if (uVar != null ? uVar.equals(((n) vVar).f3935a) : ((n) vVar).f3935a == null) {
                t tVar = this.f3936b;
                if (tVar != null ? tVar.equals(((n) vVar).f3936b) : ((n) vVar).f3936b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f3935a;
        int hashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f3936b;
        return (tVar != null ? tVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f3935a + ", mobileSubtype=" + this.f3936b + "}";
    }
}
