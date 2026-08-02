package defpackage;

/* loaded from: classes3.dex */
public final class c2l extends cg6 {
    public w55 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ d2l l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2l(d2l d2lVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = d2lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, null, this);
    }
}
