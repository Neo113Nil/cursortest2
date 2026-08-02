package defpackage;

/* loaded from: classes3.dex */
public final class cji implements gji {
    public final s9p a;

    public cji(s9p s9pVar) {
        this.a = s9pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cji) && this.a.equals(((cji) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Multiwave(seeds=" + this.a + ")";
    }
}
