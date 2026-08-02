package defpackage;

/* loaded from: classes.dex */
public final class nqm extends cg6 {
    public pqm j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pqm l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqm(pqm pqmVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = pqmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.d(this);
    }
}
