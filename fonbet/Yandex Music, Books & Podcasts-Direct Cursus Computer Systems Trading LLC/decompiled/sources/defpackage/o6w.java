package defpackage;

/* loaded from: classes.dex */
public final class o6w extends cg6 {
    public fpr j;
    public fpr k;
    public /* synthetic */ Object l;
    public final /* synthetic */ fpr m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6w(fpr fprVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = fprVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(this);
    }
}
