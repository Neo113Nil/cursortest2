package defpackage;

/* loaded from: classes.dex */
public final class oep {
    public final xrd a;
    public final long b;
    public final nep c;
    public final boolean d;

    public oep(xrd xrdVar, long j, nep nepVar, boolean z) {
        this.a = xrdVar;
        this.b = j;
        this.c = nepVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oep)) {
            return false;
        }
        oep oepVar = (oep) obj;
        return this.a == oepVar.a && enj.c(this.b, oepVar.b) && this.c == oepVar.c && this.d == oepVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + tlm.c(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) enj.j(this.b));
        sb.append(", anchor=");
        sb.append(this.c);
        sb.append(", visible=");
        return dfi.j(sb, this.d, ')');
    }
}
