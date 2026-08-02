package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n8l implements u8l {
    public final n7q a;
    public final long b;
    public final kdl c;

    public n8l(n7q n7qVar, long j, kdl kdlVar) {
        n7qVar.getClass();
        kdlVar.getClass();
        this.a = n7qVar;
        this.b = j;
        this.c = kdlVar;
    }

    @Override // defpackage.u8l
    public final n7q a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8l)) {
            return false;
        }
        n8l n8lVar = (n8l) obj;
        return Intrinsics.d(this.a, n8lVar.a) && this.b == n8lVar.b && this.c == n8lVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + tlm.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Replay(queueState=" + this.a + ", currentPosition=" + this.b + ", reason=" + this.c + ")";
    }
}
