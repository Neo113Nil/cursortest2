package defpackage;

/* loaded from: classes4.dex */
public final class ilu {
    public final klu a;
    public final dou b;

    public ilu(klu kluVar, dou douVar) {
        this.a = kluVar;
        this.b = douVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilu)) {
            return false;
        }
        ilu iluVar = (ilu) obj;
        return this.a.equals(iluVar.a) && this.b.equals(iluVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WaveAgentItemUiData(uiData=" + this.a + ", item=" + this.b + ")";
    }
}
