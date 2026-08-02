package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* loaded from: classes.dex */
public final class u96 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ConstraintTrackingWorker k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u96(ConstraintTrackingWorker constraintTrackingWorker, cg6 cg6Var) {
        super(cg6Var);
        this.k = constraintTrackingWorker;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.e(this.k, null, null, null, this);
    }
}
