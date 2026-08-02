package kotlinx.coroutines.flow;

import defpackage.b64;
import defpackage.jqr;
import defpackage.k0v0;
import defpackage.qv10;
import defpackage.tpr;
import defpackage.w511;
import defpackage.xsr0;
import kotlin.collections.builders.ListBuilder;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final class q0 implements xsr0 {
    public final long b;
    public final long c;

    public q0(long j, long j2) {
        this.b = j;
        this.c = j2;
        if (j < 0) {
            w511.f(qv10.k(j, "stopTimeout(", " ms) cannot be negative"));
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        w511.f(qv10.k(j2, "replayExpiration(", " ms) cannot be negative"));
        throw null;
    }

    @Override // defpackage.xsr0
    public final tpr a(k0v0 k0v0Var) {
        return e.t(new jqr(e.X(k0v0Var, new StartedWhileSubscribed$command$1(this, null)), new StartedWhileSubscribed$command$2(2, null), 0));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.b == q0Var.b && this.c == q0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        ListBuilder listBuilder = new ListBuilder(2);
        long j = this.b;
        if (j > 0) {
            listBuilder.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.c;
        if (j2 < ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            listBuilder.add("replayExpiration=" + j2 + "ms");
        }
        return b64.p(new StringBuilder("SharingStarted.WhileSubscribed("), kotlin.collections.a.X(listBuilder.j(), null, null, null, null, 63), ')');
    }
}
