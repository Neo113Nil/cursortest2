package defpackage;

/* loaded from: classes3.dex */
public final class wwc extends cg6 {
    public qkj j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ xwc m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwc(xwc xwcVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = xwcVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(this);
    }
}
