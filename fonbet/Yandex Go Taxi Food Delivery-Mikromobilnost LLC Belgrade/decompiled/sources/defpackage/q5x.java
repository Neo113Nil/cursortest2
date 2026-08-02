package defpackage;

/* loaded from: classes9.dex */
public final class q5x implements o5x {
    public final String a;

    public q5x(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q5x) && jl40.l(this.a, ((q5x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Key(key="), this.a, ')');
    }
}
