package defpackage;

/* loaded from: classes3.dex */
public final class pid extends cg6 {
    public qqi j;
    public /* synthetic */ Object k;
    public final /* synthetic */ hgp l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pid(hgp hgpVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = hgpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.w(this);
    }
}
