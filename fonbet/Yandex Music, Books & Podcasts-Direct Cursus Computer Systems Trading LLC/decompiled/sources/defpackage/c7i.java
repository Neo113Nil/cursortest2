package defpackage;

/* loaded from: classes3.dex */
public final class c7i extends cg6 {
    public s6i j;
    public /* synthetic */ Object k;
    public final /* synthetic */ j7i l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7i(j7i j7iVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = j7iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return j7i.J(this.l, null, this);
    }
}
