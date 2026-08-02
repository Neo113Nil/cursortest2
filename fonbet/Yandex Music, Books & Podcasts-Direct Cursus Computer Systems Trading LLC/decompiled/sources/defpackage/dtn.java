package defpackage;

/* loaded from: classes.dex */
public final class dtn extends cg6 {
    public f3e j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f3e l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtn(f3e f3eVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = f3eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(0.0f, this);
    }
}
