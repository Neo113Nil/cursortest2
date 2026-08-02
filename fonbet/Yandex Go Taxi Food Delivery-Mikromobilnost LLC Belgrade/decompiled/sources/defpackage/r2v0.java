package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class r2v0 {
    public final String a;
    public final Integer b;

    public r2v0(int i, Integer num, String str) {
        str = (i & 1) != 0 ? null : str;
        num = (i & 2) != 0 ? null : num;
        this.a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2v0)) {
            return false;
        }
        r2v0 r2v0Var = (r2v0) obj;
        return jl40.l(this.a, r2v0Var.a) && jl40.l(this.b, r2v0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "SubtitlePart(text=" + this.a + ", iconRes=" + this.b + Extension.C_BRAKE;
    }

    public r2v0() {
        this(3, null, null);
    }
}
