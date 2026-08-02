package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s8l implements u8l {
    public final n7q a;
    public final long b;

    public s8l(n7q n7qVar, long j) {
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
        if (!(obj instanceof s8l)) {
            return false;
        }
        s8l s8lVar = (s8l) obj;
        return Intrinsics.d(this.a, s8lVar.a) && this.b == s8lVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Suspend(queueState=" + this.a + ", currentPosition=" + this.b + ")";
    }
}
