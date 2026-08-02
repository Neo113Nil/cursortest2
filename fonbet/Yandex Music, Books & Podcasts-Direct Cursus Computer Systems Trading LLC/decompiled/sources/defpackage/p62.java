package defpackage;

/* loaded from: classes5.dex */
public final class p62 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ s62 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p62(s62 s62Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = s62Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
