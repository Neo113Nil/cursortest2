package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class y7q0 extends x7q0 {
    public final List j;

    public y7q0(w6i0 w6i0Var, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(w6i0Var, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // defpackage.x7q0
    public final long d(long j) {
        return this.j.size();
    }

    @Override // defpackage.x7q0
    public final w6i0 h(long j, s4j0 s4j0Var) {
        return (w6i0) this.j.get((int) (j - this.d));
    }

    @Override // defpackage.x7q0
    public final boolean i() {
        return true;
    }
}
