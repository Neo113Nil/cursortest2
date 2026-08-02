package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yoj {
    public final String a;
    public final xoj b;
    public final String c;

    public yoj(xoj xojVar, String str, String str2) {
        this.a = str;
        this.b = xojVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yoj)) {
            return false;
        }
        yoj yojVar = (yoj) obj;
        return jl40.l(this.a, yojVar.a) && jl40.l(this.b, yojVar.b) && jl40.l(this.c, yojVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        xoj xojVar = this.b;
        int hashCode2 = (hashCode + (xojVar == null ? 0 : xojVar.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscountsActivatePayload(offerId=");
        sb.append(this.a);
        sb.append(", station=");
        sb.append(this.b);
        sb.append(", promocodeName=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public yoj() {
        this(null, null, null);
    }
}
