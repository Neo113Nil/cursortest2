package defpackage;

/* loaded from: classes3.dex */
public final class ati implements eti {
    public final raj a;
    public final mqs b;

    public ati(raj rajVar, mqs mqsVar) {
        this.a = rajVar;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ati)) {
            return false;
        }
        ati atiVar = (ati) obj;
        return this.a.equals(atiVar.a) && this.b.equals(atiVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Episode(uiData=" + this.a + ", track=" + this.b + ")";
    }
}
