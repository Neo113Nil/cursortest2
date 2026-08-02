package defpackage;

/* loaded from: classes5.dex */
public final class pia extends cg6 {
    public int j;
    public int k;
    public Object[] l;
    public Object[] m;
    public /* synthetic */ Object n;
    public final /* synthetic */ wia o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pia(wia wiaVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = wiaVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.d(0, this);
    }
}
