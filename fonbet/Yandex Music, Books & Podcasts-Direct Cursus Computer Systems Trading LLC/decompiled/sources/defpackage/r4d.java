package defpackage;

/* loaded from: classes3.dex */
public final class r4d extends cg6 {
    public nq7 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ s4d l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4d(s4d s4dVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = s4dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
