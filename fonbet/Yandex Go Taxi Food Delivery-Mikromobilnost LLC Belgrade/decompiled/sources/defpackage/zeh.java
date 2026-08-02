package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class zeh {
    public final brt a;
    public final brt b;

    public zeh(brt brtVar, brt brtVar2) {
        this.a = brtVar;
        this.b = brtVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zeh)) {
            return false;
        }
        zeh zehVar = (zeh) obj;
        return this.a == zehVar.a && this.b == zehVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DefaultMetricaArgs(reporterFactory=" + this.a + ", profileReporterFactory=" + this.b + Extension.C_BRAKE;
    }
}
