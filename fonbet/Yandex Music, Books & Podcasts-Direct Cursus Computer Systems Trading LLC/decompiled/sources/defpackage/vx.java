package defpackage;

/* loaded from: classes6.dex */
public final class vx extends cg6 {
    public oq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ay l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx(ay ayVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = ayVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
