package defpackage;

/* loaded from: classes4.dex */
public final class znl extends cg6 {
    public uol j;
    public /* synthetic */ Object k;
    public final /* synthetic */ uol l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znl(uol uolVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = uolVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(this);
    }
}
