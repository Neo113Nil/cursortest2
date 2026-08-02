package defpackage;

/* loaded from: classes4.dex */
public final class qir {
    public final awp a;
    public final awp b;

    public qir(awp awpVar, awp awpVar2) {
        this.a = awpVar;
        this.b = awpVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qir)) {
            return false;
        }
        qir qirVar = (qir) obj;
        return this.a.equals(qirVar.a) && this.b.equals(qirVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StoriesUi(background=" + this.a + ", sticker=" + this.b + ")";
    }
}
