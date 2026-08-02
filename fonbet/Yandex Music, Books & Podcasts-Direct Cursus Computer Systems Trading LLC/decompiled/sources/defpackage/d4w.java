package defpackage;

import java.util.HashSet;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d4w {
    public final UUID a;
    public final c4w b;
    public final HashSet c;
    public final q97 d;
    public final q97 e;
    public final int f;
    public final int g;
    public final fa6 h;
    public final long i;
    public final b4w j;
    public final long k;
    public final int l;

    public d4w(UUID uuid, c4w c4wVar, HashSet hashSet, q97 q97Var, q97 q97Var2, int i, int i2, fa6 fa6Var, long j, b4w b4wVar, long j2, int i3) {
        uuid.getClass();
        q97Var.getClass();
        q97Var2.getClass();
        this.a = uuid;
        this.b = c4wVar;
        this.c = hashSet;
        this.d = q97Var;
        this.e = q97Var2;
        this.f = i;
        this.g = i2;
        this.h = fa6Var;
        this.i = j;
        this.j = b4wVar;
        this.k = j2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d4w.class.equals(obj.getClass())) {
            return false;
        }
        d4w d4wVar = (d4w) obj;
        if (this.f == d4wVar.f && this.g == d4wVar.g && Intrinsics.d(this.a, d4wVar.a) && this.b == d4wVar.b && Intrinsics.d(this.d, d4wVar.d) && this.h.equals(d4wVar.h) && this.i == d4wVar.i && Intrinsics.d(this.j, d4wVar.j) && this.k == d4wVar.k && this.l == d4wVar.l && this.c.equals(d4wVar.c)) {
            return Intrinsics.d(this.e, d4wVar.e);
        }
        return false;
    }

    public final int hashCode() {
        int c = tlm.c(this.i, (this.h.hashCode() + ((((((this.e.hashCode() + ((this.c.hashCode() + ((this.d.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g) * 31)) * 31, 31);
        b4w b4wVar = this.j;
        return Integer.hashCode(this.l) + tlm.c(this.k, (c + (b4wVar != null ? b4wVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
