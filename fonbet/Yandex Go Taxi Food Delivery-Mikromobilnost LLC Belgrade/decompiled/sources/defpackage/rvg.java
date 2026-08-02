package defpackage;

/* loaded from: classes2.dex */
public final class rvg {
    public final String a;
    public final svg b;

    public rvg(String str, svg svgVar) {
        this.a = str;
        this.b = svgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvg)) {
            return false;
        }
        rvg rvgVar = (rvg) obj;
        return jl40.l(this.a, rvgVar.a) && this.b.equals(rvgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelLogData(id=" + this.a + ", details=" + this.b + ')';
    }
}
