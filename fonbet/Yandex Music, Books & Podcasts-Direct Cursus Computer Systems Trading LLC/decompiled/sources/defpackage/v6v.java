package defpackage;

/* loaded from: classes4.dex */
public final class v6v extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ z6v k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6v(z6v z6vVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = z6vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
