package defpackage;

/* loaded from: classes4.dex */
public final class mel implements nel {
    public final wdl a;

    public mel(wdl wdlVar) {
        this.a = wdlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mel) && this.a.equals(((mel) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Visible(informer=" + this.a + ")";
    }
}
