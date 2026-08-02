package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tva0 {
    public final String a;
    public final long b;
    public final boolean c;

    public tva0(String str, long j, boolean z) {
        this.a = str;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tva0)) {
            return false;
        }
        tva0 tva0Var = (tva0) obj;
        return this.a.equals(tva0Var.a) && this.b == tva0Var.b && this.c == tva0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xra1.a(x4e.l("SdkLoadingState(scenario=", this.a, ", startTimeNanos=", this.b), ", hasError=", this.c, Extension.C_BRAKE);
    }
}
