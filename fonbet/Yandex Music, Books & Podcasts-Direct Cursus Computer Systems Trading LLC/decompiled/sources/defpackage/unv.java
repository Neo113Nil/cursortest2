package defpackage;

/* loaded from: classes6.dex */
public final class unv extends cg6 {
    public qqi j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vnv l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unv(vnv vnvVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = vnvVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(this);
    }
}
