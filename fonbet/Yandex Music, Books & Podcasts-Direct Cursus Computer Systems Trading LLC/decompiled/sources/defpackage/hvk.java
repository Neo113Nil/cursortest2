package defpackage;

/* loaded from: classes4.dex */
public final class hvk extends cg6 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ivk l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvk(ivk ivkVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = ivkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(0, this);
    }
}
