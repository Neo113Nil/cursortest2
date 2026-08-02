package defpackage;

/* loaded from: classes.dex */
public final class gur extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ hur k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gur(hur hurVar, kq2 kq2Var) {
        super(kq2Var);
        this.k = hurVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.n(0L, null, this);
    }
}
