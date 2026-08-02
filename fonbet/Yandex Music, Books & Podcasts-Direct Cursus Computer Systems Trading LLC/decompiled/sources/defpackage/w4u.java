package defpackage;

/* loaded from: classes4.dex */
public final class w4u extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ c5u l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4u(c5u c5uVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = c5uVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, this);
    }
}
