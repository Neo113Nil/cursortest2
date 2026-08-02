package defpackage;

/* loaded from: classes2.dex */
public final class z6e0 {
    public final String a;

    public z6e0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z6e0) && jl40.l(this.a, ((z6e0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Background(color="), this.a, ')');
    }
}
