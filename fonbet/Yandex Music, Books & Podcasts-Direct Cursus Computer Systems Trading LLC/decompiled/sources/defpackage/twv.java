package defpackage;

/* loaded from: classes4.dex */
public final class twv {
    public final long a;
    public final long b;
    public final d85 c;

    public twv(long j, long j2, d85 d85Var) {
        this.a = j;
        this.b = j2;
        this.c = d85Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twv)) {
            return false;
        }
        twv twvVar = (twv) obj;
        return d85.c(this.a, twvVar.a) && d85.c(this.b, twvVar.b) && this.c.equals(twvVar.c);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return tlm.c(this.c.a, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WizardIconColors(accent=", d85.i(this.a), ", likeFilled=", d85.i(this.b), ", aroundArea=");
        m.append(this.c);
        m.append(", oneOnOneAroundArea=null)");
        return m.toString();
    }
}
