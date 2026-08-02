package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wum {
    public final long a;
    public final long b;
    public final mwk c;

    public wum(long j, long j2, mwk mwkVar) {
        this.a = j;
        this.b = j2;
        this.c = mwkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wum)) {
            return false;
        }
        wum wumVar = (wum) obj;
        return this.a == wumVar.a && this.b == wumVar.b && Intrinsics.d(this.c, wumVar.c);
    }

    public final int hashCode() {
        int c = tlm.c(this.b, Long.hashCode(this.a) * 31, 31);
        mwk mwkVar = this.c;
        return c + (mwkVar == null ? 0 : mwkVar.hashCode());
    }

    public final String toString() {
        StringBuilder l = tlm.l(this.a, "ProgressInfo(progress=", ", duration=");
        l.append(this.b);
        l.append(", playable=");
        l.append(this.c);
        l.append(")");
        return l.toString();
    }
}
