package defpackage;

/* loaded from: classes4.dex */
public final class dkw extends cg6 {
    public iow j;
    public /* synthetic */ Object k;
    public final /* synthetic */ jkw l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkw(jkw jkwVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = jkwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, null, this);
    }
}
