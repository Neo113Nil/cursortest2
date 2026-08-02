package defpackage;

/* loaded from: classes5.dex */
public final class hlu {
    public final dou a;
    public final np b;

    public hlu(dou douVar, np npVar) {
        this.a = douVar;
        this.b = npVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlu)) {
            return false;
        }
        hlu hluVar = (hlu) obj;
        return this.a.equals(hluVar.a) && this.b.equals(hluVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WaveAgentItem(wave=" + this.a + ", agent=" + this.b + ")";
    }
}
