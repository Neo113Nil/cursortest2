package defpackage;

/* loaded from: classes3.dex */
public final class n62 extends cg6 {
    public mqs j;
    public /* synthetic */ Object k;
    public final /* synthetic */ o62 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n62(o62 o62Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = o62Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return o62.c(this.l, null, this);
    }
}
