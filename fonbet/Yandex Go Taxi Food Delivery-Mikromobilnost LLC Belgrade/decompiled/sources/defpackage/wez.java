package defpackage;

/* loaded from: classes4.dex */
public final class wez extends yez {
    public final Exception a;

    public wez(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wez) && jl40.l(this.a, ((wez) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "log-list.json failed to load with ".concat(kca1.g(this.a));
    }
}
