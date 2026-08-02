package defpackage;

import androidx.glance.session.SessionWorker;

/* loaded from: classes.dex */
public final class fnp extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ SessionWorker k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnp(SessionWorker sessionWorker, cg6 cg6Var) {
        super(cg6Var);
        this.k = sessionWorker;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(this);
    }
}
