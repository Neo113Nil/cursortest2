package defpackage;

/* loaded from: classes4.dex */
public final class ukm extends cg6 {
    public qkm j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vkm l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukm(vkm vkmVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = vkmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.d(null, null, this);
    }
}
