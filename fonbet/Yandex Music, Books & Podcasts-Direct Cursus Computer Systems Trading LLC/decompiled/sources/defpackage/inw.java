package defpackage;

/* loaded from: classes3.dex */
public final class inw {
    public final jnw a;
    public final long b;

    public inw(jnw jnwVar, long j) {
        this.a = jnwVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inw)) {
            return false;
        }
        inw inwVar = (inw) obj;
        return this.a == inwVar.a && this.b == inwVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StrategyKey(kind=" + this.a + ", errorCode=" + this.b + ")";
    }
}
