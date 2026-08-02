package defpackage;

import java.io.File;

/* loaded from: classes3.dex */
public final class rb2 {
    public final qb2 a;
    public final String b;
    public final File c;

    public rb2(qb2 qb2Var, String str, File file) {
        this.a = qb2Var;
        if (str == null) {
            jj4.j("Null sessionId");
            throw null;
        }
        this.b = str;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rb2)) {
            return false;
        }
        rb2 rb2Var = (rb2) obj;
        return this.a.equals(rb2Var.a) && this.b.equals(rb2Var.b) && this.c.equals(rb2Var.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
