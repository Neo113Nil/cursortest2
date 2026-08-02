package defpackage;

/* loaded from: classes3.dex */
public final class bcm extends cg6 {
    public mt j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gcm l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcm(gcm gcmVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = gcmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return gcm.G(this.l, this);
    }
}
