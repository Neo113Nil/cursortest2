package defpackage;

/* loaded from: classes4.dex */
public final class zm extends en {
    public final ggk a;

    public zm(ggk ggkVar) {
        ggkVar.getClass();
        this.a = ggkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm) && this.a == ((zm) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NONE(pollingResult=" + this.a + ")";
    }
}
