package defpackage;

/* loaded from: classes6.dex */
public final class ndm extends cg6 {
    public wdm j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wdm l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndm(wdm wdmVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = wdmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, false, this);
    }
}
