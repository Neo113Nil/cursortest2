package defpackage;

/* loaded from: classes3.dex */
public final class k7s extends cg6 {
    public qkj j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ l7s m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7s(l7s l7sVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = l7sVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(this);
    }
}
