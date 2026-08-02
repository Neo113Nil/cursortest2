package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bwm {
    public final t5a a;
    public final q2a b;
    public final jyr c = btf.b(new ril(26, this));

    public bwm(q2a q2aVar, t5a t5aVar) {
        this.a = t5aVar;
        this.b = q2aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bwm)) {
            return false;
        }
        t5a t5aVar = this.a;
        if (Intrinsics.d(t5aVar != null ? t5aVar.b : null, t5aVar != null ? t5aVar.b : null)) {
            if (Intrinsics.d(t5aVar != null ? t5aVar.a : null, t5aVar != null ? t5aVar.a : null) && Intrinsics.d(((bwm) obj).b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Number) this.c.getValue()).intValue();
    }
}
