package defpackage;

import android.graphics.LightingColorFilter;

/* loaded from: classes.dex */
public final class nzf extends m85 {
    public final long b;
    public final long c;

    public nzf(long j, long j2) {
        super(new LightingColorFilter(c3x.U(j), c3x.U(j2)));
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzf)) {
            return false;
        }
        nzf nzfVar = (nzf) obj;
        return d85.c(this.b, nzfVar.b) && d85.c(this.c, nzfVar.c);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LightingColorFilter(multiply=");
        dfi.q(this.b, ", add=", sb);
        sb.append((Object) d85.i(this.c));
        sb.append(')');
        return sb.toString();
    }
}
