package defpackage;

/* loaded from: classes4.dex */
public final class vbo extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ f4m k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbo(f4m f4mVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = f4mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.t(this);
    }
}
