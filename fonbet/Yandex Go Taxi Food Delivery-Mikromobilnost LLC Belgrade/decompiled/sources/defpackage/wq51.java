package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class wq51 implements ar51 {
    public final String a;
    public final String b;

    public wq51(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq51)) {
            return false;
        }
        wq51 wq51Var = (wq51) obj;
        return jl40.l(this.a, wq51Var.a) && jl40.l(this.b, wq51Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("Fail(error=", this.a, ", description=", this.b, Extension.C_BRAKE);
    }
}
