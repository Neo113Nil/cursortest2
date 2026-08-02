package defpackage;

/* loaded from: classes4.dex */
public final class ffl {
    public final fgl a;

    public ffl(fgl fglVar) {
        this.a = fglVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffl) && this.a.equals(((ffl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlayerInformersConfig(texts=" + this.a + ")";
    }
}
