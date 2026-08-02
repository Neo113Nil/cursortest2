package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes9.dex */
public final class rnq0 extends s7q0 {
    public final /* synthetic */ AtomicReferenceArray z;

    public rnq0(long j, rnq0 rnq0Var, int i) {
        super(j, rnq0Var, i);
        this.z = new AtomicReferenceArray(qnq0.f);
    }

    @Override // defpackage.s7q0
    public final int l() {
        return qnq0.f;
    }

    @Override // defpackage.s7q0
    public final void m(int i, fse fseVar) {
        this.z.set(i, qnq0.e);
        n();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.x + ", hashCode=" + hashCode() + ']';
    }
}
