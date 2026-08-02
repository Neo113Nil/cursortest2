package defpackage;

/* loaded from: classes.dex */
public final class u1r0 {
    public final String a;

    public u1r0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1r0) && jl40.l(this.a, ((u1r0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("SessionDetails(sessionId="), this.a, ')');
    }
}
