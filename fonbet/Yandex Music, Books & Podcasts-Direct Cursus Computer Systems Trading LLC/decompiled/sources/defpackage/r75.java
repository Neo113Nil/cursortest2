package defpackage;

/* loaded from: classes3.dex */
public final class r75 extends s75 {
    public final kjm a;

    public r75(kjm kjmVar) {
        this.a = kjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r75) && this.a.equals(((r75) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PreSaveEntity(preSave=" + this.a + ")";
    }
}
