package defpackage;

/* loaded from: classes4.dex */
public final class llv {
    public final klv a;
    public final klv b;
    public final klv c;

    public llv(klv klvVar, klv klvVar2, klv klvVar3) {
        this.a = klvVar;
        this.b = klvVar2;
        this.c = klvVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llv)) {
            return false;
        }
        llv llvVar = (llv) obj;
        return this.a.equals(llvVar.a) && this.b.equals(llvVar.b) && this.c.equals(llvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WidgetButtons(collapsedConfig=" + this.a + ", expandedConfig=" + this.b + ", squareConfig=" + this.c + ")";
    }
}
