package defpackage;

/* loaded from: classes5.dex */
public final class jed extends cg6 {
    public vgd j;
    public String k;
    public ced l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ked n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jed(ked kedVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = kedVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return ked.a(this.n, null, null, null, this);
    }
}
