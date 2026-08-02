package defpackage;

/* loaded from: classes4.dex */
public final class ovq extends cg6 {
    public boolean j;
    public rj6 k;
    public xsq l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ sfm o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovq(sfm sfmVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = sfmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.z(false, null, this);
    }
}
