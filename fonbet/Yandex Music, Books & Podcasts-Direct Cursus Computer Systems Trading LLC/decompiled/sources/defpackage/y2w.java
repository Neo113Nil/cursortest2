package defpackage;

/* loaded from: classes4.dex */
public final class y2w {
    public final long a;

    public y2w(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2w) && d85.c(this.a, ((y2w) obj).a);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return hrg.q("WizardTextColors(forPrimaryButton=", d85.i(this.a), ", forDisabledButton=null)");
    }
}
