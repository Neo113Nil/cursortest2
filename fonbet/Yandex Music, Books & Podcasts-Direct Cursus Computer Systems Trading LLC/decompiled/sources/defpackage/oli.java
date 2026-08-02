package defpackage;

/* loaded from: classes3.dex */
public final class oli extends cg6 {
    public n8g j;
    public /* synthetic */ Object k;
    public final /* synthetic */ aqd l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oli(aqd aqdVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = aqdVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.k(null, this);
    }
}
