package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nbr implements tm0 {
    public final tm0 a;
    public final long b;

    public nbr(wdc wdcVar, long j) {
        this.a = wdcVar;
        this.b = j;
    }

    @Override // defpackage.tm0
    public final rzt a(oct octVar) {
        return new obr(this.a.a(octVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nbr)) {
            return false;
        }
        nbr nbrVar = (nbr) obj;
        return nbrVar.b == this.b && Intrinsics.d(nbrVar.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
