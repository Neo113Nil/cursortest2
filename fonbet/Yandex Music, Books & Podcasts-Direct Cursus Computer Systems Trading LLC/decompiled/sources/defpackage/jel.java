package defpackage;

/* loaded from: classes4.dex */
public final class jel extends cg6 {
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ kel l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jel(kel kelVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = kelVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(false, this);
    }
}
