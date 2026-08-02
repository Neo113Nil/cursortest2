package defpackage;

/* loaded from: classes3.dex */
public final class dmi extends cg6 {
    public qj6 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gmi l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmi(gmi gmiVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = gmiVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return gmi.a(this.l, this);
    }
}
