package defpackage;

/* loaded from: classes3.dex */
public final class ort extends cg6 {
    public xqn j;
    public oqi k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ urt n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ort(urt urtVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = urtVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(this);
    }
}
