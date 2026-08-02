package defpackage;

/* loaded from: classes9.dex */
public final class v6x {
    public final m5x a;

    public v6x(m5x m5xVar) {
        this.a = m5xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v6x) && jl40.l(this.a, ((v6x) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "JasonValue(content=" + this.a + ')';
    }
}
