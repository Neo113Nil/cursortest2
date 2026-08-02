package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r8l implements u8l {
    public final n7q a;
    public final long b;
    public final mpl c;

    public r8l(n7q n7qVar, long j, mpl mplVar) {
        n7qVar.getClass();
        mplVar.getClass();
        this.a = n7qVar;
        this.b = j;
        this.c = mplVar;
    }

    @Override // defpackage.u8l
    public final n7q a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8l)) {
            return false;
        }
        r8l r8lVar = (r8l) obj;
        return Intrinsics.d(this.a, r8lVar.a) && this.b == r8lVar.b && Intrinsics.d(this.c, r8lVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + tlm.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Stop(queueState=" + this.a + ", currentPosition=" + this.b + ", reason=" + this.c + ")";
    }
}
