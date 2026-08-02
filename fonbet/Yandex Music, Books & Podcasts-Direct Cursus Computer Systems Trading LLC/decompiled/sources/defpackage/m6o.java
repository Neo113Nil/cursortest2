package defpackage;

/* loaded from: classes5.dex */
public final class m6o extends cg6 {
    public s6o j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ s6o m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6o(s6o s6oVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = s6oVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(this);
    }
}
