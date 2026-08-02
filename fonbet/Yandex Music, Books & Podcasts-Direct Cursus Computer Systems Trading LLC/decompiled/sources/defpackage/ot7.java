package defpackage;

/* loaded from: classes4.dex */
public final class ot7 extends cg6 {
    public d6l j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pt7 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot7(pt7 pt7Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = pt7Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, false, this);
    }
}
