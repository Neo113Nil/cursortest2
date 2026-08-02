package defpackage;

/* loaded from: classes4.dex */
public final class m7u extends cg6 {
    public cr j;
    public /* synthetic */ Object k;
    public final /* synthetic */ bjt l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7u(bjt bjtVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = bjtVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(this);
    }
}
