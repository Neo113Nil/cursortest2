package defpackage;

/* loaded from: classes4.dex */
public final class e0f implements f0f {
    public final yku a;
    public final np b;
    public final klu c;

    public e0f(yku ykuVar, np npVar, klu kluVar) {
        this.a = ykuVar;
        this.b = npVar;
        this.c = kluVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0f)) {
            return false;
        }
        e0f e0fVar = (e0f) obj;
        return this.a.equals(e0fVar.a) && this.b.equals(e0fVar.b) && this.c.equals(e0fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WaveAgentItem(wave=" + this.a + ", agent=" + this.b + ", uiWaveAgent=" + this.c + ")";
    }
}
