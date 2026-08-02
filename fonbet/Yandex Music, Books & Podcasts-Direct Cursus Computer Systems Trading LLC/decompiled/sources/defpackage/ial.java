package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ial implements kal {
    public final n7q a;
    public final boolean b;
    public final hln c;
    public final boolean d;
    public final Long e;

    public ial(n7q n7qVar, boolean z, hln hlnVar, boolean z2, Long l) {
        n7qVar.getClass();
        this.a = n7qVar;
        this.b = z;
        this.c = hlnVar;
        this.d = z2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ial)) {
            return false;
        }
        ial ialVar = (ial) obj;
        return Intrinsics.d(this.a, ialVar.a) && this.b == ialVar.b && this.c == ialVar.c && this.d == ialVar.d && Intrinsics.d(this.e, ialVar.e);
    }

    public final int hashCode() {
        int e = k5r.e((this.c.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        Long l = this.e;
        return e + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Prepare(queueState=" + this.a + ", playWhenReady=" + this.b + ", reason=" + this.c + ", mute=" + this.d + ", initialPosition=" + this.e + ")";
    }
}
