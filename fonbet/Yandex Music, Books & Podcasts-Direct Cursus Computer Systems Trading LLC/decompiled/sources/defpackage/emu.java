package defpackage;

/* loaded from: classes4.dex */
public final class emu extends cg6 {
    public jzs j;
    public rr5 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ fmu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emu(fmu fmuVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = fmuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}
