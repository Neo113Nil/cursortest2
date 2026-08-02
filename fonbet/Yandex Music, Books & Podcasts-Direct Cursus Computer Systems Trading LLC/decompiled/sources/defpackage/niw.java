package defpackage;

/* loaded from: classes4.dex */
public final class niw extends cg6 {
    public qiw j;
    public /* synthetic */ Object k;
    public final /* synthetic */ qiw l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public niw(qiw qiwVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = qiwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
