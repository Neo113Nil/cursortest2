package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wdm0 {
    public final rr51 a;
    public final cx11 b;

    public wdm0(rr51 rr51Var, cx11 cx11Var) {
        this.a = rr51Var;
        this.b = cx11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdm0)) {
            return false;
        }
        wdm0 wdm0Var = (wdm0) obj;
        return jl40.l(this.a, wdm0Var.a) && this.b.equals(wdm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SbpAccountDetailsEntity(divkitData=" + this.a + ", unbindAccountSheet=" + this.b + Extension.C_BRAKE;
    }
}
