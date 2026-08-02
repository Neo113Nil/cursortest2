package defpackage;

/* loaded from: classes3.dex */
public final class iqn extends cg6 {
    public vqn j;
    public /* synthetic */ Object k;
    public final /* synthetic */ kqn l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqn(kqn kqnVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = kqnVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return kqn.a(this.l, this);
    }
}
