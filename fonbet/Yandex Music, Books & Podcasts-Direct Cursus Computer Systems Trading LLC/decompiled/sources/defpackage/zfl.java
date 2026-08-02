package defpackage;

/* loaded from: classes4.dex */
public final class zfl extends cg6 {
    public vbn j;
    public /* synthetic */ Object k;
    public final /* synthetic */ agl l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfl(agl aglVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = aglVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
