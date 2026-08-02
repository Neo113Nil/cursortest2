package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class svc {
    public static final svc c;
    public final kvc a;
    public final kvc b;

    static {
        kvc kvcVar = kvc.h;
        c = new svc(kvcVar, kvcVar);
    }

    public svc(kvc kvcVar, kvc kvcVar2) {
        this.a = kvcVar;
        this.b = kvcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svc)) {
            return false;
        }
        svc svcVar = (svc) obj;
        return jl40.l(this.a, svcVar.a) && jl40.l(this.b, svcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ComparisonViewUiState(altpin=" + this.a + ", original=" + this.b + Extension.C_BRAKE;
    }
}
