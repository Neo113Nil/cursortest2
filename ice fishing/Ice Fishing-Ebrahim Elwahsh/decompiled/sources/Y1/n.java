package Y1;

/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public final u f3948a;

    /* renamed from: b, reason: collision with root package name */
    public final t f3949b;

    public n(u uVar, t tVar) {
        this.f3948a = uVar;
        this.f3949b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f3948a;
            if (uVar != null ? uVar.equals(((n) vVar).f3948a) : ((n) vVar).f3948a == null) {
                t tVar = this.f3949b;
                if (tVar != null ? tVar.equals(((n) vVar).f3949b) : ((n) vVar).f3949b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f3948a;
        int hashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f3949b;
        return (tVar != null ? tVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f3948a + ", mobileSubtype=" + this.f3949b + "}";
    }
}
