package defpackage;

/* loaded from: classes3.dex */
public final class vj1 extends cg6 {
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ rdk l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj1(rdk rdkVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = rdkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.N(false, this);
    }
}
