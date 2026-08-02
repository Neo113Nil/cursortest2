package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rnw {
    public final qnw a;
    public final pnw b;

    public rnw(qnw qnwVar, pnw pnwVar) {
        this.a = qnwVar;
        this.b = pnwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnw)) {
            return false;
        }
        rnw rnwVar = (rnw) obj;
        return jl40.l(this.a, rnwVar.a) && jl40.l(this.b, rnwVar.b);
    }

    public final int hashCode() {
        qnw qnwVar = this.a;
        int hashCode = (qnwVar == null ? 0 : qnwVar.hashCode()) * 31;
        pnw pnwVar = this.b;
        return hashCode + (pnwVar != null ? pnwVar.hashCode() : 0);
    }

    public final String toString() {
        return "IntercityInitialRoute(source=" + this.a + ", destination=" + this.b + Extension.C_BRAKE;
    }
}
