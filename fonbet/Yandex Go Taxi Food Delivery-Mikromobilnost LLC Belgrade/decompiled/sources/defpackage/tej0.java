package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class tej0 {
    public final String a;
    public final Integer b;
    public final xej0 c;

    public tej0(String str, Integer num, xej0 xej0Var) {
        this.a = str;
        this.b = num;
        this.c = xej0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tej0)) {
            return false;
        }
        tej0 tej0Var = (tej0) obj;
        return jl40.l(this.a, tej0Var.a) && jl40.l(this.b, tej0Var.b) && this.c.equals(tej0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder q = n.q("RequirementCommunication(id=", this.b, this.a, ", showCount=", ", fallBack=");
        q.append(this.c);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
