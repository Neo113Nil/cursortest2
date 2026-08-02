package defpackage;

/* loaded from: classes4.dex */
public final class jyu implements nyu {
    public final c5q a;

    public jyu(c5q c5qVar) {
        this.a = c5qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jyu) && this.a.equals(((jyu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StandardAutoflow(analyticsOptions=" + this.a + ")";
    }
}
