package defpackage;

/* loaded from: classes.dex */
public final class pd2 extends rzi {
    public final qzi a;
    public final pzi b;

    public pd2(qzi qziVar, pzi pziVar) {
        this.a = qziVar;
        this.b = pziVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rzi) {
            rzi rziVar = (rzi) obj;
            qzi qziVar = this.a;
            if (qziVar != null ? qziVar.equals(((pd2) rziVar).a) : ((pd2) rziVar).a == null) {
                pzi pziVar = this.b;
                if (pziVar != null ? pziVar.equals(((pd2) rziVar).b) : ((pd2) rziVar).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        qzi qziVar = this.a;
        int hashCode = ((qziVar == null ? 0 : qziVar.hashCode()) ^ 1000003) * 1000003;
        pzi pziVar = this.b;
        return (pziVar != null ? pziVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
