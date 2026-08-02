package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class erk {
    public final crk a;
    public final Long b;

    public erk(crk crkVar, Long l) {
        crkVar.getClass();
        this.a = crkVar;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erk)) {
            return false;
        }
        erk erkVar = (erk) obj;
        return Intrinsics.d(this.a, erkVar.a) && Intrinsics.d(this.b, erkVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Idle(lastSyncResult=" + this.a + ", lastSuccessSyncMills=" + this.b + ")";
    }
}
