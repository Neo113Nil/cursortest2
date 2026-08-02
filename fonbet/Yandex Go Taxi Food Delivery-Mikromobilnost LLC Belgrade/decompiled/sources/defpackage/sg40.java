package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class sg40 {
    public static final sg40 d = new sg40(0);
    public final zg40 a;
    public final gh40 b;
    public final String c;

    public sg40(zg40 zg40Var, gh40 gh40Var, String str) {
        this.a = zg40Var;
        this.b = gh40Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg40)) {
            return false;
        }
        sg40 sg40Var = (sg40) obj;
        return jl40.l(this.a, sg40Var.a) && jl40.l(this.b, sg40Var.b) && jl40.l(this.c, sg40Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gh40 gh40Var = this.b;
        int hashCode2 = (hashCode + (gh40Var == null ? 0 : gh40Var.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtTrainSchedulerData(requestPayload=");
        sb.append(this.a);
        sb.append(", response=");
        sb.append(this.b);
        sb.append(", scheduleRequestId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public sg40() {
        this(0);
    }

    public sg40(int i) {
        this(zg40.g, null, null);
    }
}
