package defpackage;

/* loaded from: classes4.dex */
public final class njw extends cg6 {
    public boolean j;
    public aur k;
    public aur l;
    public akw m;
    public /* synthetic */ Object n;
    public final /* synthetic */ akw o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njw(akw akwVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = akwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.f(false, null, null, this);
    }
}
