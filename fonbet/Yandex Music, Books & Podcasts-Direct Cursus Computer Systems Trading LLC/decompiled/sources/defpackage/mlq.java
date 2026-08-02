package defpackage;

/* loaded from: classes.dex */
public final class mlq extends cg6 {
    public sfm j;
    public r2f k;
    public oqi l;
    public /* synthetic */ Object m;
    public final /* synthetic */ sfm n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlq(sfm sfmVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = sfmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.O(null, this);
    }
}
