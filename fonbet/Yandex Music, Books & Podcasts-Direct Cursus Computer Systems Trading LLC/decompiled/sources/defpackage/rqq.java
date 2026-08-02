package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class rqq extends cg6 {
    public List j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ce5 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqq(ce5 ce5Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = ce5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.r(this, null, null);
    }
}
