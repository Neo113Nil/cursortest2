package defpackage;

/* loaded from: classes6.dex */
public final class amv extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cmv l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amv(cmv cmvVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = cmvVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
