package defpackage;

/* loaded from: classes5.dex */
public final class a5a extends cg6 {
    public cir j;
    public z5a k;
    public t5a l;
    public /* synthetic */ Object m;
    public final /* synthetic */ b5a n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5a(b5a b5aVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = b5aVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.h(null, null, this);
    }
}
