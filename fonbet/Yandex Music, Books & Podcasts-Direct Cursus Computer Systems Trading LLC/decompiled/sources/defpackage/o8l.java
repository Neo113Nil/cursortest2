package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o8l implements u8l {
    public final n7q a;
    public final long b;
    public final long c;

    public o8l(n7q n7qVar, long j, long j2) {
        n7qVar.getClass();
        this.a = n7qVar;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.u8l
    public final n7q a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8l)) {
            return false;
        }
        o8l o8lVar = (o8l) obj;
        return Intrinsics.d(this.a, o8lVar.a) && this.b == o8lVar.b && this.c == o8lVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + tlm.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SeekTo(queueState=" + this.a + ", currentPosition=" + this.b + ", seekPosition=" + this.c + ")";
    }
}
