package defpackage;

/* loaded from: classes4.dex */
public final class cmu implements dmu {
    public final s9p a;

    public cmu(s9p s9pVar) {
        this.a = s9pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmu) && this.a.equals(((cmu) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Wave(seeds=" + this.a + ")";
    }
}
