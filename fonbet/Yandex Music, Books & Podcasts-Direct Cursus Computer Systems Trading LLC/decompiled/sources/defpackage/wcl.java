package defpackage;

/* loaded from: classes3.dex */
public final class wcl extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ adl k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wcl(adl adlVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = adlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        adl.A(this.k, null, this);
        return nm6.a;
    }
}
