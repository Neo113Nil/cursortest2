package defpackage;

/* loaded from: classes15.dex */
public final class x6t {
    public final String a;

    public x6t(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x6t) && jl40.l(this.a, ((x6t) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return oyr.p("Params(userId=", this.a, ", ignoreOwnStatus=false)");
    }
}
