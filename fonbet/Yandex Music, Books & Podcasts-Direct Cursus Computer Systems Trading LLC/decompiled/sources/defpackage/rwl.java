package defpackage;

/* loaded from: classes3.dex */
public final class rwl extends cg6 {
    public atn j;
    public /* synthetic */ Object k;
    public final /* synthetic */ swl l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwl(swl swlVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = swlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
