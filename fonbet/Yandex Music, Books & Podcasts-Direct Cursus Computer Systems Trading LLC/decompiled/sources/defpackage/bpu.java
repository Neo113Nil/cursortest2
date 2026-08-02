package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bpu {
    public final long a;
    public final r7c b;
    public final String c;
    public final s9p d;

    public bpu(long j, r7c r7cVar, String str, s9p s9pVar) {
        str.getClass();
        s9pVar.getClass();
        this.a = j;
        this.b = r7cVar;
        this.c = str;
        this.d = s9pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpu)) {
            return false;
        }
        bpu bpuVar = (bpu) obj;
        return this.a == bpuVar.a && this.b.equals(bpuVar.b) && Intrinsics.d(this.c, bpuVar.c) && Intrinsics.d(this.d, bpuVar.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + k5r.c((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "FeedbackWithId(id=" + this.a + ", feedback=" + this.b + ", sessionId=" + this.c + ", seeds=" + this.d + ")";
    }
}
