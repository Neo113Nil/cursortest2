package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j8l implements u8l {
    public final n7q a;
    public final long b;

    public j8l(n7q n7qVar, long j) {
        n7qVar.getClass();
        this.a = n7qVar;
        this.b = j;
    }

    @Override // defpackage.u8l
    public final n7q a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8l)) {
            return false;
        }
        j8l j8lVar = (j8l) obj;
        return Intrinsics.d(this.a, j8lVar.a) && this.b == j8lVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Pause(queueState=" + this.a + ", currentPosition=" + this.b + ")";
    }
}
