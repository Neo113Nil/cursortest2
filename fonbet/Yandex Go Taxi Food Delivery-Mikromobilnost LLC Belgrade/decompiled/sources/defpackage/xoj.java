package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xoj {
    public final String a;
    public final String b;

    public xoj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoj)) {
            return false;
        }
        xoj xojVar = (xoj) obj;
        return jl40.l(this.a, xojVar.a) && jl40.l(this.b, xojVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("StationInfo(vendor=", this.a, ", number=", this.b, Extension.C_BRAKE);
    }
}
