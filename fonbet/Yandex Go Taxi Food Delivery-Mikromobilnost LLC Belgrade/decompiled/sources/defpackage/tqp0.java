package defpackage;

/* loaded from: classes11.dex */
public final class tqp0 extends crp0 {
    public final Throwable c;
    public final String d;
    public final String e;
    public final String f;

    public tqp0(String str, String str2, String str3, Throwable th) {
        super("ResponseParsing");
        this.c = th;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // defpackage.crp0
    public final Throwable b() {
        return this.c;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return null;
    }

    @Override // defpackage.crp0
    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqp0)) {
            return false;
        }
        tqp0 tqp0Var = (tqp0) obj;
        return this.c.equals(tqp0Var.c) && jl40.l(this.d, tqp0Var.d) && jl40.l(this.e, tqp0Var.e) && jl40.l(this.f, tqp0Var.f);
    }

    public final String f() {
        return this.e;
    }

    public final int hashCode() {
        int b = unr0.b(this.c.hashCode() * 31, 31, this.d);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResponseParsing(exception=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.d);
        sb.append(", traceId=");
        return g8e.r(sb, this.e, ", retryPolicyId=", this.f, ", payload=null)");
    }
}
