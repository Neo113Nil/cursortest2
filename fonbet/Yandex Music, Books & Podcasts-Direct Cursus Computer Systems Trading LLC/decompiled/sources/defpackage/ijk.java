package defpackage;

/* loaded from: classes4.dex */
public final class ijk extends cg6 {
    public kjk j;
    public kik k;
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ kjk n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijk(kjk kjkVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = kjkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.K(this);
    }
}
