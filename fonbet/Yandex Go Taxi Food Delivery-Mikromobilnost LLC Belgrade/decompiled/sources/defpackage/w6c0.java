package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class w6c0 implements x6c0 {
    public final jn80 a;
    public final String b;
    public final String c;

    public w6c0(jn80 jn80Var, String str, String str2) {
        this.a = jn80Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6c0)) {
            return false;
        }
        w6c0 w6c0Var = (w6c0) obj;
        return jl40.l(this.a, w6c0Var.a) && jl40.l(this.b, w6c0Var.b) && jl40.l(this.c, w6c0Var.c);
    }

    public final int hashCode() {
        jn80 jn80Var = this.a;
        int hashCode = (jn80Var == null ? 0 : jn80Var.hashCode()) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Organizations(screenTitle=");
        sb.append(this.a);
        sb.append(", suggestReqId=");
        sb.append(this.b);
        sb.append(", geosearchContext=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
