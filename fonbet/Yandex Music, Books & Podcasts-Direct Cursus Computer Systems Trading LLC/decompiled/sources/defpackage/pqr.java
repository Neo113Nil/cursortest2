package defpackage;

/* loaded from: classes5.dex */
public final class pqr {
    public final dou a;

    public pqr(dou douVar) {
        this.a = douVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqr) && this.a.equals(((pqr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuggestedWave(wave=" + this.a + ")";
    }
}
