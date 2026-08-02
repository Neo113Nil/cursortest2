package defpackage;

/* loaded from: classes11.dex */
public final class rq50 {
    public static final rq50 b = new rq50("application/json");
    public static final rq50 c;
    public static final rq50 d;
    public final String a;

    static {
        rq50 rq50Var = new rq50("application/octet-stream");
        c = rq50Var;
        d = rq50Var;
    }

    public rq50(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rq50) && jl40.l(this.a, ((rq50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("NetworkContentType(name="), this.a, ')');
    }
}
