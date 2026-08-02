package defpackage;

/* loaded from: classes2.dex */
public final class qtv {
    public final evg a;

    public qtv(evg evgVar) {
        this.a = evgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qtv) && this.a.equals(((qtv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InfoScreenState(debugInfo=" + this.a + ')';
    }
}
