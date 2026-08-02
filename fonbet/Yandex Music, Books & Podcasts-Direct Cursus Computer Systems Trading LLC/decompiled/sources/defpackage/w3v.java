package defpackage;

/* loaded from: classes4.dex */
public final class w3v {
    public final fkv a;
    public final t8n b;

    public w3v(fkv fkvVar, t8n t8nVar) {
        this.a = fkvVar;
        this.b = t8nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3v)) {
            return false;
        }
        w3v w3vVar = (w3v) obj;
        return this.a.equals(w3vVar.a) && this.b.equals(w3vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WaveScreenUiConfig(wheelTypography=" + this.a + ", queueCarouselConfig=" + this.b + ")";
    }
}
