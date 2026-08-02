package defpackage;

/* loaded from: classes4.dex */
public final class q7u extends cg6 {
    public s8q j;
    public /* synthetic */ Object k;
    public final /* synthetic */ r7u l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7u(r7u r7uVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = r7uVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
