package v5;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public final u f7290a;

    /* renamed from: b, reason: collision with root package name */
    public final t f7291b;

    public n(u uVar, t tVar) {
        this.f7290a = uVar;
        this.f7291b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f7290a;
            if (uVar != null ? uVar.equals(((n) vVar).f7290a) : ((n) vVar).f7290a == null) {
                t tVar = this.f7291b;
                if (tVar != null ? tVar.equals(((n) vVar).f7291b) : ((n) vVar).f7291b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f7290a;
        int hashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f7291b;
        return (tVar != null ? tVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f7290a + ", mobileSubtype=" + this.f7291b + "}";
    }
}
