package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class xrh {
    public final yde a;
    public final int b;
    public final long c;

    public xrh(int i, long j, List list) {
        this.a = yde.v(list);
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrh)) {
            return false;
        }
        xrh xrhVar = (xrh) obj;
        return this.a.equals(xrhVar.a) && this.b == xrhVar.b && this.c == xrhVar.c;
    }

    public final int hashCode() {
        return cb0.A(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
