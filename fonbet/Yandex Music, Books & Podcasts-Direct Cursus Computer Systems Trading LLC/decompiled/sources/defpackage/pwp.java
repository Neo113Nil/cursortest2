package defpackage;

/* loaded from: classes6.dex */
public final class pwp {
    public final awp a;
    public final awp b;

    public pwp(awp awpVar, awp awpVar2) {
        this.a = awpVar;
        this.b = awpVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwp)) {
            return false;
        }
        pwp pwpVar = (pwp) obj;
        return this.a.equals(pwpVar.a) && this.b.equals(pwpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShareInfo(background=" + this.a + ", sticker=" + this.b + ")";
    }
}
