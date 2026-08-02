package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class q2x0 {
    public final String a;
    public final long b;
    public final String c;
    public final long d;
    public final String e;

    public q2x0(long j, long j2, String str, String str2, String str3) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = j2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2x0)) {
            return false;
        }
        q2x0 q2x0Var = (q2x0) obj;
        return this.a.equals(q2x0Var.a) && this.b == q2x0Var.b && this.c.equals(q2x0Var.c) && this.d == q2x0Var.d && this.e.equals(q2x0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qv10.c(unr0.b(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder l = x4e.l("ContactRecord(displayName=", this.a, ", lastContactedTime=", this.b);
        x4e.C(l, ", phone=", this.c, ", contactId=");
        uw51.v(this.d, ", lookupId=", this.e, l);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
