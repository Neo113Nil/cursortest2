package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class sj40 {
    public final Throwable a;
    public final String b;

    public sj40(Throwable th, String str) {
        this.a = th;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj40)) {
            return false;
        }
        sj40 sj40Var = (sj40) obj;
        return this.a.equals(sj40Var.a) && jl40.l(this.b, sj40Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MtVehiclesErrorDto(throwable=" + this.a + ", requestId=" + this.b + Extension.C_BRAKE;
    }
}
