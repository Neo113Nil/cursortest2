package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zcz0 {
    public final long a;
    public final String b;
    public final dqb1 c;

    public zcz0(long j, String str, dqb1 dqb1Var) {
        this.a = j;
        this.b = str;
        this.c = dqb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcz0)) {
            return false;
        }
        zcz0 zcz0Var = (zcz0) obj;
        return this.a == zcz0Var.a && jl40.l(this.b, zcz0Var.b) && jl40.l(this.c, zcz0Var.c);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        dqb1 dqb1Var = this.c;
        return hashCode2 + (dqb1Var != null ? dqb1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder k = x4e.k("TimelineStage(displayDurationInMillis=", this.a, ", dynamicDescription=", this.b);
        k.append(", icon=");
        k.append(this.c);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
