package defpackage;

/* loaded from: classes3.dex */
public final class eui extends cg6 {
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ gui m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eui(gui guiVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = guiVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(0, 0, this);
    }
}
