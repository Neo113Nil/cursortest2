package defpackage;

/* loaded from: classes4.dex */
public final class xtv extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ auv k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtv(auv auvVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = auvVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return auv.b(this.k, null, this);
    }
}
