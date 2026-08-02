package defpackage;

/* loaded from: classes3.dex */
public final class ci5 extends cg6 {
    public cc7 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ei5 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci5(ei5 ei5Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = ei5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return ei5.a(this.l, this);
    }
}
