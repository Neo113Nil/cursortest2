package defpackage;

/* loaded from: classes.dex */
public final class uzq0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final wng e;
    public final String f;
    public final String g;

    public uzq0(String str, String str2, int i, long j, wng wngVar, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = wngVar;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzq0)) {
            return false;
        }
        uzq0 uzq0Var = (uzq0) obj;
        return jl40.l(this.a, uzq0Var.a) && jl40.l(this.b, uzq0Var.b) && this.c == uzq0Var.c && this.d == uzq0Var.d && this.e.equals(uzq0Var.e) && this.f.equals(uzq0Var.f) && jl40.l(this.g, uzq0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b((this.e.hashCode() + qv10.c(oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return b64.p(sb, this.g, ')');
    }
}
