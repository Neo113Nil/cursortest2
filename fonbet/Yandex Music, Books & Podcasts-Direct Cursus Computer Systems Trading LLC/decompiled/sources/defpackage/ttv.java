package defpackage;

/* loaded from: classes4.dex */
public final class ttv {
    public final long a;

    public ttv(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ttv) && d85.c(this.a, ((ttv) obj).a);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.a) * 961;
    }

    public final String toString() {
        return hrg.q("WizardButtonColors(primary=", d85.i(this.a), ", alternative=null, disabled=null)");
    }
}
