package defpackage;

/* loaded from: classes3.dex */
public final class fcm extends cg6 {
    public mt j;
    public String k;
    public oq l;
    public /* synthetic */ Object m;
    public final /* synthetic */ gcm n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcm(gcm gcmVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = gcmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.M(null, null, this);
    }
}
