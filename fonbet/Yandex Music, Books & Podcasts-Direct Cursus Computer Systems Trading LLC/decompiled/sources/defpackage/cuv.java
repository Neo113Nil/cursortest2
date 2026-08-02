package defpackage;

/* loaded from: classes4.dex */
public final class cuv {
    public final ttv a;
    public final twv b;
    public final y2w c;

    public cuv(ttv ttvVar, twv twvVar, y2w y2wVar) {
        this.a = ttvVar;
        this.b = twvVar;
        this.c = y2wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuv)) {
            return false;
        }
        cuv cuvVar = (cuv) obj;
        return this.a.equals(cuvVar.a) && this.b.equals(cuvVar.b) && this.c.equals(cuvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WizardColors(button=" + this.a + ", icon=" + this.b + ", text=" + this.c + ")";
    }
}
