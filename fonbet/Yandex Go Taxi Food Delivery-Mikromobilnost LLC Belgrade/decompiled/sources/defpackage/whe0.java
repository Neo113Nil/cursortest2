package defpackage;

/* loaded from: classes2.dex */
public final class whe0 implements eie0 {
    public final String a;

    public whe0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof whe0) && jl40.l(this.a, ((whe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("IsExist(argName="), this.a, ')');
    }
}
