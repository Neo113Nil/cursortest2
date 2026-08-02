package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* loaded from: classes.dex */
public final class v96 extends cg6 {
    public ucg j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ConstraintTrackingWorker l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v96(ConstraintTrackingWorker constraintTrackingWorker, cg6 cg6Var) {
        super(cg6Var);
        this.l = constraintTrackingWorker;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.f(this.l, this);
    }
}
