package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class zm20 {
    public final String a;
    public final String b;

    public zm20(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm20)) {
            return false;
        }
        zm20 zm20Var = (zm20) obj;
        return jl40.l(this.a, zm20Var.a) && jl40.l(this.b, zm20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("MobContourApiName(contour=", this.a, ", apiName=", this.b, Extension.C_BRAKE);
    }
}
