package defpackage;

/* loaded from: classes4.dex */
public final class d0f implements f0f {
    public final dou a;
    public final euu b;

    public d0f(dou douVar, euu euuVar) {
        this.a = douVar;
        this.b = euuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0f)) {
            return false;
        }
        d0f d0fVar = (d0f) obj;
        return this.a.equals(d0fVar.a) && this.b.equals(d0fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Wave(wave=" + this.a + ", uiWave=" + this.b + ")";
    }
}
