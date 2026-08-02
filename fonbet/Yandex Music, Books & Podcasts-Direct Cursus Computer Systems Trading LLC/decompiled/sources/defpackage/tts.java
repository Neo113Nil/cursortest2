package defpackage;

/* loaded from: classes4.dex */
public final class tts extends cg6 {
    public String j;
    public iss k;
    public ots l;
    public /* synthetic */ Object m;
    public final /* synthetic */ uts n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tts(uts utsVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = utsVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return uts.g(this.n, null, null, null, this);
    }
}
