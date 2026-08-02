package defpackage;

/* loaded from: classes4.dex */
public final class ckw extends cg6 {
    public iow j;
    public /* synthetic */ Object k;
    public final /* synthetic */ jkw l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckw(jkw jkwVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = jkwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
