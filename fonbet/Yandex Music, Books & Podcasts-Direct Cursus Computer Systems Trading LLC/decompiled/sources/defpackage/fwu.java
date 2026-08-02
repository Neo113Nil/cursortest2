package defpackage;

/* loaded from: classes4.dex */
public final class fwu implements mwu, xvu {
    public final tyu a;
    public final e5q b;
    public final b3l c;

    public fwu(tyu tyuVar, e5q e5qVar, b3l b3lVar) {
        this.a = tyuVar;
        this.b = e5qVar;
        this.c = b3lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwu)) {
            return false;
        }
        fwu fwuVar = (fwu) obj;
        return this.a.equals(fwuVar.a) && this.b.equals(fwuVar.b) && this.c.equals(fwuVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Ready(navigator=" + this.a + ", waveEntity=" + this.b + ", action=" + this.c + ")";
    }
}
