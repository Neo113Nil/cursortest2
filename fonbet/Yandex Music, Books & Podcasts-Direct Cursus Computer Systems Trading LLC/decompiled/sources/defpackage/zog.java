package defpackage;

/* loaded from: classes3.dex */
public final class zog extends cg6 {
    public xdh j;
    public fis k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ime m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zog(ime imeVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = imeVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.T(null, null, this);
    }
}
