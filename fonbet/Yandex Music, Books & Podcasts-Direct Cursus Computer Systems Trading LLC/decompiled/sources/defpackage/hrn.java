package defpackage;

/* loaded from: classes4.dex */
public final class hrn extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ j6e k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrn(j6e j6eVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = j6eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.x(null, this);
    }
}
