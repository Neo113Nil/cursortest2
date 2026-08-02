package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xhc extends w3b1 {
    public final long a;
    public final ldc b;

    public xhc(long j, ldc ldcVar) {
        this.a = j;
        this.b = ldcVar;
    }

    @Override // defpackage.w3b1
    public final ldc b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhc)) {
            return false;
        }
        xhc xhcVar = (xhc) obj;
        return ldc.c(this.a, xhcVar.a) && jl40.l(this.b, xhcVar.b);
    }

    public final int hashCode() {
        int i = ldc.n;
        int hashCode = Long.hashCode(this.a) * 31;
        ldc ldcVar = this.b;
        return hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a));
    }

    public final String toString() {
        return "ColoredBackgroundState(color=" + ldc.i(this.a) + ", rippleColor=" + this.b + Extension.C_BRAKE;
    }
}
