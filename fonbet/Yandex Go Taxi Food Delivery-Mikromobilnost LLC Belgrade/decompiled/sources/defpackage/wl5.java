package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wl5 {
    public final String a;
    public final String b;

    public wl5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl5)) {
            return false;
        }
        wl5 wl5Var = (wl5) obj;
        return jl40.l(this.a, wl5Var.a) && this.b.equals(wl5Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return unr0.p("BenefitActivationPayload(code=", this.a, ", openReason=", this.b, Extension.C_BRAKE);
    }
}
