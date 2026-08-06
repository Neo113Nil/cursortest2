package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class s01 extends wz0 {
    public final /* synthetic */ AtomicReferenceArray AvO7iQsrTN;

    public s01(long j, s01 s01Var, int i) {
        super(j, s01Var, i);
        this.AvO7iQsrTN = new AtomicReferenceArray(r01.EljAMC1QTz);
    }

    @Override // defpackage.wz0
    public final void E7jCp8Ls(int i, gh ghVar) {
        this.AvO7iQsrTN.set(i, r01.OOA6hdeuvCS);
        XnEVoBF0td1l();
    }

    @Override // defpackage.wz0
    public final int rQPn8YBR() {
        return r01.EljAMC1QTz;
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.OOA6hdeuvCS + ", hashCode=" + hashCode() + ']';
    }
}
