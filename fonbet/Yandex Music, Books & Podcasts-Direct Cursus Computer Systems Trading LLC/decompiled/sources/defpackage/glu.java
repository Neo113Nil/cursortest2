package defpackage;

/* loaded from: classes4.dex */
public final class glu {
    public final dlu a;
    public final flu b;

    public glu(dlu dluVar, flu fluVar) {
        this.a = dluVar;
        this.b = fluVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glu)) {
            return false;
        }
        glu gluVar = (glu) obj;
        return this.a.equals(gluVar.a) && this.b.equals(gluVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WaveAgentEntityWithUi(entity=" + this.a + ", uiData=" + this.b + ")";
    }
}
