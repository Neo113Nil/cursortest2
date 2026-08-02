package defpackage;

/* loaded from: classes9.dex */
public final class rzc {
    public final Object a;
    public final rv7 b;
    public final zls c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ rzc(Object obj, rv7 rv7Var, zls zlsVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : rv7Var, (i & 4) != 0 ? null : zlsVar, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static rzc a(rzc rzcVar, rv7 rv7Var, Throwable th, int i) {
        Object obj = rzcVar.a;
        if ((i & 2) != 0) {
            rv7Var = rzcVar.b;
        }
        rv7 rv7Var2 = rv7Var;
        zls zlsVar = rzcVar.c;
        Object obj2 = rzcVar.d;
        if ((i & 16) != 0) {
            th = rzcVar.e;
        }
        return new rzc(obj, rv7Var2, zlsVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzc)) {
            return false;
        }
        rzc rzcVar = (rzc) obj;
        return jl40.l(this.a, rzcVar.a) && jl40.l(this.b, rzcVar.b) && jl40.l(this.c, rzcVar.c) && jl40.l(this.d, rzcVar.d) && jl40.l(this.e, rzcVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        rv7 rv7Var = this.b;
        int hashCode2 = (hashCode + (rv7Var == null ? 0 : rv7Var.hashCode())) * 31;
        zls zlsVar = this.c;
        int hashCode3 = (hashCode2 + (zlsVar == null ? 0 : zlsVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompletedContinuation(result=");
        sb.append(this.a);
        sb.append(", cancelHandler=");
        sb.append(this.b);
        sb.append(", onCancellation=");
        sb.append(this.c);
        sb.append(", idempotentResume=");
        sb.append(this.d);
        sb.append(", cancelCause=");
        return unr0.s(sb, this.e, ')');
    }

    public rzc(Object obj, rv7 rv7Var, zls zlsVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = rv7Var;
        this.c = zlsVar;
        this.d = obj2;
        this.e = th;
    }
}
