package defpackage;

/* loaded from: classes3.dex */
public final class ki4 extends cg6 {
    public cvl j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pi4 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki4(pi4 pi4Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = pi4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, this);
    }
}
