package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yaz0 {
    public final String a;
    public final cqb1 b;

    public yaz0(String str, cqb1 cqb1Var) {
        this.a = str;
        this.b = cqb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yaz0)) {
            return false;
        }
        yaz0 yaz0Var = (yaz0) obj;
        return jl40.l(this.a, yaz0Var.a) && jl40.l(this.b, yaz0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cqb1 cqb1Var = this.b;
        return hashCode + (cqb1Var == null ? 0 : cqb1Var.hashCode());
    }

    public final String toString() {
        return "TimelineDetailsShareButtonModel(text=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
