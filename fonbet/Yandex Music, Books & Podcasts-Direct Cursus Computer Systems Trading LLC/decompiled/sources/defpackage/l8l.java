package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l8l implements u8l {
    public final n7q a;
    public final long b;
    public final hln c;

    public l8l(n7q n7qVar, long j, hln hlnVar) {
        n7qVar.getClass();
        hlnVar.getClass();
        this.a = n7qVar;
        this.b = j;
        this.c = hlnVar;
    }

    @Override // defpackage.u8l
    public final n7q a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8l)) {
            return false;
        }
        l8l l8lVar = (l8l) obj;
        return Intrinsics.d(this.a, l8lVar.a) && this.b == l8lVar.b && this.c == l8lVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + tlm.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Prepare(queueState=" + this.a + ", currentPosition=" + this.b + ", reason=" + this.c + ")";
    }
}
